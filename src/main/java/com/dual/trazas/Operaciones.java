package com.dual.trazas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Operaciones
{
  private static final Logger LOGGER = LoggerFactory.getLogger(Operaciones.class);

  public boolean guardarDatos(String[] arr)
  {
    LOGGER.info("Entramos en guardarDatos()");
    boolean resultado = true;

    try
    {
      LOGGER.trace("Intentamos invocar a validarDatos()");
      validarDatos(arr);
    }

    catch(ArrayIndexOutOfBoundsException ae)
    {
      ae.printStackTrace();
      resultado = false;
      LOGGER.error("ArrayIndexOutOfBoundsException capturada: " + ae.getMessage());
    }
    catch(Exception e)
    {
      e.printStackTrace();
      resultado = false;
      LOGGER.error("Exception capturada: " + e.getMessage());
    }
    catch(Throwable te)
    {
      te.printStackTrace();
      resultado = false;
      LOGGER.error("Throwable capturada: " + te.getMessage());
    }
    finally
    {
      LOGGER.info("Salimos de guardarDatos() -> " + resultado);
    }

    return resultado;
  }


  private void validarDatos(String[] arr) throws Exception,ArrayIndexOutOfBoundsException
  {
    LOGGER.info("Entramos de validarDatos()");

    LOGGER.debug("El valor de arr[0] es -> " + arr[0]);

    if(arr[0].length() == 0 || arr[0].length() > 50)
    {
      throw new Exception("El formato del nombre no es valido");
    }
    if(arr[1].length() == 0 || arr[1].length() > 100)
    {
      throw new Exception("El formato del apellido no es valido");
    }

    LOGGER.info("Salimos de validarDatos()");

  }
}
