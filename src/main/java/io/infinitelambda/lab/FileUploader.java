package io.infinitelambda.lab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.probeContentType;


public class FileUploader {
    public static UploadResult uploadToS3(java.io.File file, String contentType) {
        System.out.println("Uploading to AWS S3");
        // you don't need to implement to logic to upload
        return new UploadResult();
    }

    public static boolean validateParameters(String[] args) {
        if (args.length == 0 || args.length > 2) {
            throw new IllegalArgumentException("Not enough parameters");
        }
        return true;
    }

    public String getContentType(File file) {
        Path path = file.toPath();
        String contentType = null;
        try {
            contentType = probeContentType(path);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return contentType;
    }


    }
