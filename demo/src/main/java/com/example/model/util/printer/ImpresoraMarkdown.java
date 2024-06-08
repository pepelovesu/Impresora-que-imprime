package com.example.model.util.printer;

public class ImpresoraMarkdown extends ImpresoraAbs {

    @Override
    public byte[] imprimir(Documento documento) {
        StringBuilder sb = new StringBuilder();

        sb.append("# " + documento.getTitulo() + "\n--- \n").append("- " + documento.getCuerpo() + "\n--- \n").append(documento.getPie());
        return sb.toString().getBytes();
    }
    
}
