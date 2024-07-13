package org.example.modelos;

import org.example.helpers.validaciones.MercanciaValidacion;

public class Mercancia {

    //id (int) //solo enteros positivos
//volumenOcupado (double)  //solo positivos y maximo 100
//tipo (string) //solo letras sin espacios
//peso (double) //solo positivos maximo 1000
//descripcion (string) //maximo 100
//avaluo (int) //solo positivos
//direccionRemitente (string) //maximo 200
//direccionDestinatario (string) //maximo 200


    private MercanciaValidacion mercanciaValidacion = new MercanciaValidacion();

    private Integer id;
    private Double volumenOcupado;
    private String tipo;
    private Double peso;
    private String descripcion;
    private Integer avaluo;
    private String direccionRemitente;
    private String direccionDestinatario;

    public Mercancia() {}

    public Mercancia(Integer id, Double volumenOcupado, String tipo, Double peso, String descripcion, Integer avaluo, String direccionRemitente, String direccionDestinatario) {
        this.id = id;
        this.volumenOcupado = volumenOcupado;
        this.tipo = tipo;
        this.peso = peso;
        this.descripcion = descripcion;
        this.avaluo = avaluo;
        this.direccionRemitente = direccionRemitente;
        this.direccionDestinatario = direccionDestinatario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try {
            mercanciaValidacion.validarId(id);
            this.id = id;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public Double getVolumenOcupado() {
        return volumenOcupado;
    }

    public void setVolumenOcupado(Double volumenOcupado) {
        try {
            mercanciaValidacion.validarVolumenOcupado(volumenOcupado);
            this.volumenOcupado = volumenOcupado;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        try {
            mercanciaValidacion.validarTipo(tipo);
            this.tipo = tipo;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        try {
            mercanciaValidacion.validarPeso(peso);
            this.peso = peso;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        try {
            mercanciaValidacion.validarDescripcion(descripcion);
            this.descripcion = descripcion;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public Integer getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Integer avaluo) {
        try {
            mercanciaValidacion.validarAvaluo(avaluo);
            this.avaluo = avaluo;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        try {
            mercanciaValidacion.validarDireccionRemitente(direccionRemitente);
            this.direccionRemitente = direccionRemitente;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        try {
            mercanciaValidacion.validarDireccionDestinatario(direccionDestinatario);
            this.direccionDestinatario = direccionDestinatario;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
