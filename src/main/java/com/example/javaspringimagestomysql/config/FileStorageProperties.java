package com.example.javaspringimagestomysql.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

public class FileStorageProperties {
    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
