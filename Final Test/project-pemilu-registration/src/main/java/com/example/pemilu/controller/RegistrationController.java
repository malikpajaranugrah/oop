package com.example.pemilu.controller;

import jakarta.servlet.http.HttpSession;
import com.example.pemilu.model.Biodata;
import com.example.pemilu.repository.BiodataRepository;
import com.example.pemilu.service.AnnouncementService;
import com.example.pemilu.service.BiodataService;
import com.example.pemilu.service.RegistrationScheduleService;
import com.example.pemilu.storage.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

@Controller
@SessionAttributes("biodata")
public class RegistrationController {

    @Autowired
    private FileStorageService fileStorageService;

    @Autowired
    private BiodataService biodataService;

    @Autowired
    private AnnouncementService announcementService;

    @Autowired
    private BiodataRepository biodataRepository;

    @Autowired
    private RegistrationScheduleService registrationScheduleService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/kpps-registration")
    public String kppsRegistration(Model model) {
        if (!registrationScheduleService.isKppsRegistrationOpen()) {
            model.addAttribute("message", "Untuk saat ini belum dibuka pendaftaran untuk posisi yang anda cari, silahkan hubungi sekretariat PPS Desa Cisitu.");
            return "registration-closed"; // Create a registration-closed.html view
        }
        // Add model attributes and return the registration form view
        return "kpps-registration";
    }

    @GetMapping("/pantarlih-registration")
    public String pantarlihRegistration(Model model) {
        if (!registrationScheduleService.isPantarlihRegistrationOpen()) {
            model.addAttribute("message", "Untuk saat ini belum dibuka pendaftaran untuk posisi yang anda cari, silahkan hubungi sekretariat PPS Desa Cisitu.");
            return "registration-closed"; // Create a registration-closed.html view
        }
        // Add model attributes and return the registration form view
        return "pantarlih-registration";
    }

    @GetMapping("/upload-files")
    public String uploadFiles() {
        return "upload-files";
    }

    @GetMapping("/check-nik")
    public ResponseEntity<?> checkNikExists(@RequestParam("nik") String nik) {
        boolean exists = biodataService.isNikExist(nik);
        return ResponseEntity.ok().body(Collections.singletonMap("exists", exists));
    }

    @PostMapping("/register")
    public String register(
            @RequestParam("nik") String nik,
            @RequestParam("name") String name,
            @RequestParam("tempatLahir") String tempatLahir,
            @RequestParam("tanggalLahir") String tanggalLahirStr,
            @RequestParam("alamat") String alamat,
            @RequestParam("rtRw") String rtRw,
            @RequestParam("desaKelurahan") String desaKelurahan,
            @RequestParam("kecamatan") String kecamatan,
            @RequestParam("kabupatenKota") String kabupatenKota,
            @RequestParam("nomorTelepon") String nomorTelepon,
            @RequestParam("email") String email,
            Model model) throws ParseException {

        // Konversi tanggal dari string ke Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggalLahir = dateFormat.parse(tanggalLahirStr);

        // Buat objek Biodata dari input
        Biodata biodata = new Biodata();
        biodata.setNik(nik);
        biodata.setNama(name);
        biodata.setTempatLahir(tempatLahir);
        biodata.setTanggalLahir(tanggalLahir);
        biodata.setAlamat(alamat);
        biodata.setRtRw(rtRw);
        biodata.setDesaKelurahan(desaKelurahan);
        biodata.setKecamatan(kecamatan);
        biodata.setKabupatenKota(kabupatenKota);
        biodata.setNomorTelepon(nomorTelepon);
        biodata.setEmail(email);

        biodataService.saveBiodata(biodata);

        model.addAttribute("biodata", biodata);

        return "redirect:/upload-files";
    }


    @PostMapping("/upload-files")
    public String handleFileUpload(
            @RequestParam("ktp") MultipartFile ktp,
            @RequestParam("sk_sehat") MultipartFile skSehat,
            @RequestParam("ijazah") MultipartFile ijazah,
            @RequestParam("pasfoto") MultipartFile pasfoto,
            @RequestParam("biodata") MultipartFile biodataFile,
            @RequestParam("surat_pernyataan") MultipartFile suratPernyataan,
            RedirectAttributes redirectAttributes) {

        // Simpan file ke server
        String ktpPath = fileStorageService.store(ktp);
        String skSehatPath = fileStorageService.store(skSehat);
        String ijazahPath = fileStorageService.store(ijazah);
        String pasfotoPath = fileStorageService.store(pasfoto);
        String biodataPath = fileStorageService.store(biodataFile);
        String suratPernyataanPath = fileStorageService.store(suratPernyataan);

        // Simpan informasi file dalam flash attribute
        redirectAttributes.addFlashAttribute("ktpPath", ktpPath);
        redirectAttributes.addFlashAttribute("skSehatPath", skSehatPath);
        redirectAttributes.addFlashAttribute("ijazahPath", ijazahPath);
        redirectAttributes.addFlashAttribute("pasfotoPath", pasfotoPath);
        redirectAttributes.addFlashAttribute("biodataPath", biodataPath);
        redirectAttributes.addFlashAttribute("suratPernyataanPath", suratPernyataanPath);
        redirectAttributes.addFlashAttribute("message", "File berhasil diunggah!");

        // Redirect to confirmation page
        return "redirect:/confirmation";
    }

    @GetMapping("/confirmation")
    public String confirmation() {
        return "confirmation";
    }

    @GetMapping("/edit-biodata")
    public String editBiodata(Model model, @ModelAttribute("biodata") Biodata biodata) {
        model.addAttribute("biodata", biodata);
        return "edit-biodata";
    }

    @PostMapping("/update-biodata")
    public String updateBiodata(
            @RequestParam("nik") String nik,
            @RequestParam("name") String name,
            @RequestParam("tempatLahir") String tempatLahir,
            @RequestParam("tanggalLahir") String tanggalLahirStr,
            @RequestParam("alamat") String alamat,
            @RequestParam("rtRw") String rtRw,
            @RequestParam("desaKelurahan") String desaKelurahan,
            @RequestParam("kecamatan") String kecamatan,
            @RequestParam("kabupatenKota") String kabupatenKota,
            @RequestParam("nomorTelepon") String nomorTelepon,
            @RequestParam("email") String email,
            Model model) throws ParseException {

        // Konversi tanggal dari string ke Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggalLahir = dateFormat.parse(tanggalLahirStr);

        // Perbarui objek Biodata dari input
        Biodata biodata = new Biodata();
        biodata.setNik(nik);
        biodata.setNama(name);
        biodata.setTempatLahir(tempatLahir);
        biodata.setTanggalLahir(tanggalLahir);
        biodata.setAlamat(alamat);
        biodata.setRtRw(rtRw);
        biodata.setDesaKelurahan(desaKelurahan);
        biodata.setKecamatan(kecamatan);
        biodata.setKabupatenKota(kabupatenKota);
        biodata.setNomorTelepon(nomorTelepon);
        biodata.setEmail(email);

        model.addAttribute("biodata", biodata);
        model.addAttribute("message", "Biodata berhasil diperbarui!");

        return "redirect:/";
    }
}

