package com.example.model.util.printer;

public class DocumentoFactory {
    public static Impresora obtener(DocumentoFormato documento){
        if (DocumentoFormato.TXT.equals(documento)) {
            return new ImpresoraTXT();
        } else if (DocumentoFormato.MARKDOWN.equals(documento)) {
            return new ImpresoraMarkdown();
        } else {
            return new ImpresoraPDF();
        }
    }
}
