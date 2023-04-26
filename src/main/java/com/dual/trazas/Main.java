package com.dual.trazas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main
{
  private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args)
  {
    LOGGER.info("Entramos en Main");

    Operaciones op = new Operaciones();
    String[] arr = new String[1];
    boolean resultado = true;

    arr[0] = "Juan";


    LOGGER.debug("El objeto arr vale -> " + arr);

    LOGGER.trace("Vamos a invocar a guardarDatos()");

    resultado = op.guardarDatos(arr);

    LOGGER.trace("Hemos vuelto de guardarDatos()");

    LOGGER.info("Salimos en Main");
  }

}
