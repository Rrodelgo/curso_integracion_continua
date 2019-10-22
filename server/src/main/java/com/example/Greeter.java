package com.example;

/**
 * This is a class.
 */
public class Greeter {
public long MAGICO = new Long("2333");
  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Metodo de greet modificado.
   */
  public String greet(String someone) {
    /**Long lalala = MAGICO; */
    if(MAGICO > 1){
      return String.format("Hello, %s!", someone);
    }
    else{
        return String.format("Hello, %s!", someone);
    }
  }
}
