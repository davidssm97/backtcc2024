package org.example.helpers.validaciones;

import org.example.helpers.generals.RegexValidator;
import org.example.helpers.mensajes.MensajesMercancia;
import org.example.helpers.mensajes.RegexExpresiones;

public class MercanciaValidacion {

    private final RegexValidator regexValidator = new RegexValidator();

    public boolean validarId(Integer id) throws Exception {
        if (id <= 0) {
            throw new Exception(MensajesMercancia.ID_MERCANCIA_ERRONEO.getMensajeError());
        }
        return true;
    }

    public boolean validarVolumenOcupado(Double volumenOcupado) throws Exception {
        if (volumenOcupado <= 0 || volumenOcupado > 100) {
            throw new Exception(MensajesMercancia.VOLUMEN_OCUPADO_ERRONEO.getMensajeError());
        }
        return true;
    }

    public boolean validarTipo(String tipo) throws Exception {
        if (!regexValidator.validarRegex(tipo, RegexExpresiones.VALIDAR_SOLO_LETRAS_SIN_ESPACIOS.getExpresionRegular())) {
            throw new Exception(MensajesMercancia.TIPO_ERRONEO.getMensajeError());
        }
        return true;
    }

    public boolean validarPeso(Double peso) throws Exception {
        if (peso <= 0 || peso > 1000) {
            throw new Exception(MensajesMercancia.PESO_ERRONEO.getMensajeError());
        }
        return true;
    }

    public boolean validarDescripcion(String descripcion) throws Exception {
        if (descripcion.length() > 100) {
            throw new Exception(MensajesMercancia.DESCRIPCION_ERRONEA.getMensajeError());
        }
        return true;
    }

    public boolean validarAvaluo(Integer avaluo) throws Exception {
        if (avaluo <= 0) {
            throw new Exception(MensajesMercancia.AVALUO_ERRONEO.getMensajeError());
        }
        return true;
    }

    public boolean validarDireccionRemitente(String direccionRemitente) throws Exception {
        if (direccionRemitente.length() > 200) {
            throw new Exception(MensajesMercancia.DIRECCION_REMITENTE_ERRONEA.getMensajeError());
        }
        return true;
    }

    public boolean validarDireccionDestinatario(String direccionDestinatario) throws Exception {
        if (direccionDestinatario.length() > 200) {
            throw new Exception(MensajesMercancia.DIRECCION_DESTINATARIO_ERRONEA.getMensajeError());
        }
        return true;
    }
}
