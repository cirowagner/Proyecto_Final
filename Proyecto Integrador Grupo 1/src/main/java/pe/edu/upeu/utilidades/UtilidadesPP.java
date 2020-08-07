package pe.edu.upeu.utilidades;

import java.net.URL;

public class UtilidadesPP {

    public int fibonaciRecur(final int numero) {
        if (numero < 2) {
        return numero;
        } else {
        return fibonaciRecur(numero - 1) + fibonaciRecur(numero - 2);
        }
    }

    public URL getFile(String ruta){
        return this.getClass().getResource("/"+ruta);
    }

    public final void clearConsole(){
        try{            
            final String os = System.getProperty("os.name");    
            if (os.contains("Windows")){
               new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else{
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            }
        }
        catch (final Exception e){
           System.out.println("Error: "+e.getMessage());
        }
       System.out.println("------------------------------------------------"); 
    }    

}