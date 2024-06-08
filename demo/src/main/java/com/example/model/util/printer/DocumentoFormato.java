package com.example.model.util.printer;

public enum DocumentoFormato {
    TXT(".txt"), 
    MARKDOWN(".md"), 
    PDF(".pdf");

    private String extension;

    public String getExtension() {
        return extension;
    }

    private DocumentoFormato(String e){
        this.extension = e;
    }
}
