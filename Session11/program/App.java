import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "C:/malik/session11.txt";
        App.createFile(fileName);
        App.WriteStringtoFile(fileName,"\nHello some sentence again!");
        App.readFromFile(fileName);
    }

    public static void readFromFile(String fileName) {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred when reading file.");
            e.printStackTrace();
        }
    }

    public static void WriteStringtoFile(String fileName, String content) {
        try {
            FileWriter myWriter = new FileWriter(fileName, true);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void createFile(String fileName) {
        try {
            File newFile = new File(fileName);
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}



