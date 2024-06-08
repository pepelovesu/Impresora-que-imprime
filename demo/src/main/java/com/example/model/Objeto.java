package com.example.model;

import com.example.model.util.printer.Documento;

public class Objeto implements Documento{

    private String atributo1;
    private int atributo2;

    public Objeto(String atributo1, int atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atrbuto1) {
        this.atributo1 = atrbuto1;
    }

    public int getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }




    @Override
    public String getTitulo() {
        return "Título: " + atributo1;
    }

    @Override
    public String getCuerpo() {
        return "Cuerpo con atributo: " + atributo1 + " y " + atributo2;
    }

    @Override
    public String getPie() {
        return "Pie con atributo2: " + atributo2;
    }

    @Override
    public String getContenido() {
        String plantilla = "";
        return plantilla;
    }
    
}
