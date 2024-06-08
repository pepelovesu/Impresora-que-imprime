package com.example.model.util.printer;

import java.io.File;

import com.example.model.util.fic.Fichero;
import com.example.model.util.fic.FicheroBinario;

public class ImpresoraParaImprimir {
    public static void imprimir(Documento documento, DocumentoFormato df) throws Exception{

        Impresora impresora = DocumentoFactory.obtener(df); 
        String nombre = generarNombreArchivo("hola", df.getExtension());
        Fichero fichero = new FicheroBinario(nombre);
        
        byte[] datos = impresora.imprimir(documento);
        fichero.escribir(datos);
    }

    private static String generarNombreArchivo(String baseName, String extension) {
        int contador = 0;
        String nombreArchivo;
        do {
            nombreArchivo = baseName + contador + "." + extension;
            contador++;
        } while (new File(nombreArchivo).exists());
        return nombreArchivo;
    }
}
