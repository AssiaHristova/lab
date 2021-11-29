package io.infinitelambda.lab;
import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        FileUploader fileUploader = new FileUploader();

        if (FileUploader.validateParameters(args)){
            File file1 = new File(args[1]);
            String cloudProvider = args[0];
            String contentType1 = fileUploader.getContentType(file1);
            if (cloudProvider.equals("AWS S3")){
                UploadResult result = FileUploader.uploadToS3(file1, contentType1);
            }

            System.out.println("Upload finished");
        }



    }
}
