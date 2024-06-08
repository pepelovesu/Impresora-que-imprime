package com.example.model.util.printer;

public class ImpresoraPDF extends ImpresoraAbs{

    @Override
    public byte[] imprimir(Documento documento) {
        StringBuilder sb = new StringBuilder();

        sb.append(documento.getTitulo() + "\n").append(documento.getCuerpo() + "\n").append(documento.getPie());
        return sb.toString().getBytes();
    }
    
}
