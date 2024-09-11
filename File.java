public class File {
    private final String fileName;
    private final String fileType;
    private final String filePath;
    public File(String fileName, String fileType, String filePath){
        //TODO: Init
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
    }

    // TODO: Complete getters
    public String getFileName() {
        return fileName;
    }
    public String getFileType() {
        return fileType;
    }
    public String getFilePath() {
        return filePath;
    }
    
    // TODO: How about setters? Why?
    // Answer: No setters because the file name, file type, and file path should not be changed once the file is created.
}
