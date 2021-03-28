package com.company;
import java.time.LocalDateTime;

public class FileMaker{
    private String fileId;
    private String fileName;
    private String fileType;
    private LocalDateTime dateAndTime;
    private static int fileCount;

    public FileMaker(String fileName,  String fileType) {
        if(FileTypeChecker(fileType)){
            this.fileId = UniqueIdCreator(fileType);
            this.fileName = fileName;
            this.fileType = fileType;
            this.dateAndTime = LocalDateTime.now();

            System.out.println("File successfully created");
        }
        else {
            System.out.println("File creation failed");
        }
    }

    private static String UniqueIdCreator(String fileType) {
        return fileType + "_" + ++fileCount;
    }

    private boolean FileTypeChecker(String fileType) {

        if (fileType == "txt" || fileType == "doc" || fileType == "py")
        {
            return true;
        }

        return false;

    }

    public void showInfo() {
        System.out.println("____________________");
        System.out.println("File info");
        System.out.println("Name :- " + fileName + "." + fileType);
        System.out.println("(" + dateAndTime + ")");
        System.out.println("____________________");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}





