package com.dual.trazas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase encargada de realizar una operación Hola Mundo
 * 
 * @author juan.fernandez
 *
 */
public class HolaMundo
{

  /**
   * Looger para escritura de logs
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(HolaMundo.class);

  /**
   * Metodo main encargado de realizar la operacion de --
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    LOGGER.info("Entramos en MAIN");
    /*
     * OGGER.info("Esto es un log de tipo INFO"); LOGGER.debug("Esto es un log de tipo DEBUG");
     * LOGGER.trace("Esto es un log de tipo TRACE"); LOGGER.warn("Esto es un log de tipo WARN");
     * LOGGER.error("Esto es un log de tipo ERROR");
     */

    int sumando1 = 5;
    int sumando2 = 6;

    LOGGER.debug("Sumando1 -> " + sumando1);
    LOGGER.debug("Sumando2 -> " + sumando2);


    LOGGER.trace("Vamos a realizar la suma");
    int resultado = sumando1 + sumando2;

    LOGGER.trace("Hemos realizado la suma con éxito");

    LOGGER.trace("Vamos a entrar en un for");
    for(int i = 0;i < 100;i++)
    {
      LOGGER.info("Haciendo crecer el fichero");
      LOGGER.info("Con trazas ampliadas");
    }

    LOGGER.info("Salimos de MAIN con resultado -> " + resultado);

  }

  /**
   * Metodo encargado de realizar una suma usando los parametros recibidos por la funcion
   * 
   * @param sumando1
   * @param sumando2
   * @return
   */
  private int sumar(int sumando1,int sumando2)
  {
    return sumando1 + sumando2;
  }

}
