package com.eduardo.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Eduardo
 */
public class Hora {

    public String hora;
    SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");

    public void ler_hora() {
        Date horaAtual = new Date();
        hora = horaFormatada.format(horaAtual);

    }
}
