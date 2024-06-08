package com.example.model.util.fic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FicheroBinario implements Fichero{

    private String fileName;

    public FicheroBinario(String fileName){
        this.fileName = fileName;
    }

    @Override
    public byte[] leer() throws Exception {
        byte[] datos = null;
        try (FileInputStream fis = new FileInputStream(fileName)) {
            datos = fis.readAllBytes();
        } catch (Exception e) {
            throw e;
        }
        return datos;
    }

    @Override
    public void escribir(byte[] datos) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(datos);
        } catch (Exception e) {
            throw e;
        }
    }
}
