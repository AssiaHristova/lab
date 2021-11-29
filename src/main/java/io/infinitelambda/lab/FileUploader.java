package io.infinitelambda.lab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.probeContentType;


public class FileUploader {

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
