package ru.netology.diplomacloudservice.dto;

public record ChangeFilenameRequest(String filename) {
    public String getFilename() {
        return filename;
    }
}
