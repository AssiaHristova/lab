package io.infinitelambda.lab;
import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        FileUploader fileUploader = new FileUploader();

        if (Validator.validateParameters(args)){
            File file1 = new File(args[1]);
            String cloudProvider = args[0];
            String contentType1 = fileUploader.getContentType(file1);
            if (cloudProvider.equals("AWS S3")){
                UploadResult result = UploadToCloudProvider.uploadToS3(file1, contentType1);
            }
            else if (cloudProvider.equals("Azure")){
                UploadResult result = UploadToCloudProvider.uploadToAzure(file1, contentType1);
            }

            System.out.println("Upload finished");
        }



    }
}
