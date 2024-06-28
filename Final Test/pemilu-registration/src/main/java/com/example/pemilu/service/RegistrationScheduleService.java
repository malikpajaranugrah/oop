package com.example.pemilu.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RegistrationScheduleService {

    private LocalDateTime kppsRegistrationStartTime = LocalDateTime.of(2024, 10, 1, 0, 0); // Example start time
    private LocalDateTime kppsRegistrationEndTime = LocalDateTime.of(2024, 7, 15, 23, 59); // Example end time

    private LocalDateTime pantarlihRegistrationStartTime = LocalDateTime.of(2024, 5, 1, 0, 0); // Example start time
    private LocalDateTime pantarlihRegistrationEndTime = LocalDateTime.of(2024, 8, 15, 23, 59); // Example end time

    public boolean isKppsRegistrationOpen() {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(kppsRegistrationStartTime) && now.isBefore(kppsRegistrationEndTime);
    }

    public boolean isPantarlihRegistrationOpen() {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(pantarlihRegistrationStartTime) && now.isBefore(pantarlihRegistrationEndTime);
    }
}
