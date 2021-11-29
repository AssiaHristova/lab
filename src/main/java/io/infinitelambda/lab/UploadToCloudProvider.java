package io.infinitelambda.lab;

public class UploadToCloudProvider {
    public static UploadResult uploadToS3(java.io.File file, String contentType) {
        System.out.println("Uploading to AWS S3");
        // you don't need to implement to logic to upload
        return new UploadResult();
    }
    public static UploadResult uploadToAzure(java.io.File file, String contentType) {
        System.out.println("Uploading to Azure");
        // you don't need to implement to logic to upload
        return new UploadResult();
    }
}
