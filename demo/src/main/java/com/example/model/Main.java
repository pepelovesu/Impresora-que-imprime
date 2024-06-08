package com.example.model;

import com.example.model.util.printer.DocumentoFactory;
import com.example.model.util.printer.DocumentoFormato;
import com.example.model.util.printer.Impresora;
import com.example.model.util.printer.ImpresoraParaImprimir;

public class Main {
    public static void main(String[] args) throws Exception {

        Objeto hola = new Objeto("Pepe", 2);

        Impresora impresora = DocumentoFactory.obtener(DocumentoFormato.TXT);

        ImpresoraParaImprimir.imprimir(hola, DocumentoFormato.TXT);
        ImpresoraParaImprimir.imprimir(hola, DocumentoFormato.MARKDOWN);
        ImpresoraParaImprimir.imprimir(hola, DocumentoFormato.PDF);

        
    }
}
