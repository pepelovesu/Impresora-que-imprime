package com.example.model.util.fic;

public interface Fichero {
    public byte[] leer() throws Exception;
    public void escribir(byte[] datos) throws Exception;

}
