package org.example.helpers.mensajes;

public enum MensajesMercancia {
    ID_MERCANCIA_ERRONEO("Revisa, no aceptamos id negativos"),
    VOLUMEN_OCUPADO_ERRONEO("El volumen ocupado debe ser un valor positivo y máximo 100."),
    TIPO_ERRONEO("El tipo debe contener solo letras sin espacios."),
    PESO_ERRONEO("El peso debe ser un valor positivo y máximo 1000."),
    DESCRIPCION_ERRONEA("La descripción no puede tener más de 100 caracteres."),
    AVALUO_ERRONEO("El avaluo debe ser un valor positivo."),
    DIRECCION_REMITENTE_ERRONEA("La dirección del remitente no puede tener más de 200 caracteres."),
    DIRECCION_DESTINATARIO_ERRONEA("La dirección del destinatario no puede tener más de 200 caracteres.");

    private final String mensajeError;

    MensajesMercancia(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getMensajeError() {
        return mensajeError;
    }
}
