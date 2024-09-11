public class TextFileHandler implements Handler{
    private Handler handler;
    private String handlerName;

    public TextFileHandler(String handlerName){ 
        // TODO: Init
        this.handlerName = handlerName;
    }
    
    @Override
    public void process(File file) {
    if (file.getFileType().equals("text"))
    System.out.println("Process text file by "+ handlerName + ", file path: " + file.getFilePath());
    else if (handler!=null) { // next handler exists
        System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
        handler.process(file);
    }
    else
        System.out.println("File not supported");
    }

    // TODO: Override setHandler and getHandlerName
    @Override
    public String getHandlerName() {
        return handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}