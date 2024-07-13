package org.example.helpers.mensajes;

public enum RegexExpresiones {

    VALIDAR_SOLO_LETRAS_Y_ESPACIOS("^[a-zA-Z\\s]*$"),
    VALIDAR_SOLO_LETRAS_SIN_ESPACIOS("^[a-zA-Z]*$"); // Nueva expresión regular

    private String expresionRegular;

    RegexExpresiones(String expresionRegular) {
        this.expresionRegular = expresionRegular;
    }

    public String getExpresionRegular() {
        return expresionRegular;
    }
}
//public void setExpresionRegular(String expresionRegular) {
   // this.expresionRegular = expresionRegular;
