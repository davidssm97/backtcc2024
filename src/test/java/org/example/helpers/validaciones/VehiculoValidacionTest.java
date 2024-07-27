package org.example.helpers.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoValidacionTest {
    //sujeto de prueba
    private VehiculoValidacion vehiculoValidacion;

    //configuracion inicial de la prieba
    @BeforeEach
    public void setUp(){
        this.vehiculoValidacion=new VehiculoValidacion();
    }

    //pruebas unitarias para cada metodo de la clase que estoy probeando


    //validarIdOperaCorrectamente
    @Test
    public void validarIdOperaCorrectamente(){

        //prepare
        Integer idPrueba = 20;



        //ejecute //verifique
        Assertions.assertDoesNotThrow(()->this.vehiculoValidacion.validarId(idPrueba));



    }

    //validarIdFallaPorIdNegativo
    @Test
    public void validarIdLanzaErrorPorIdNegativo(){
        Integer idPrueba = -10;
        Assertions.assertThrows(Exception.class,()->this.vehiculoValidacion.validarId(idPrueba));
    }

}