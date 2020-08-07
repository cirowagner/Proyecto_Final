package pe.edu.upeu.app;

import pe.edu.upeu.dao.AppCrud;
import pe.edu.upeu.dao.RecepcionPP;

import pe.edu.upeu.utilidades.LeerArchivo;
import pe.edu.upeu.utilidades.LeerTeclado;
import pe.edu.upeu.utilidades.UtilidadesPP;


public class App {

    static LeerTeclado teclado=new LeerTeclado();
    static LeerArchivo leerArc;
    static AppCrud doa=new AppCrud();
    static UtilidadesPP utilx=new UtilidadesPP();

    public static void main( String[] args ){
        System.out.println( "----------Systema de la venta al cliente---------" ); 
           
            try {                    
            char opcion='S'; //S=SI, N=NO
            int numAlgoritm=1;  

             do{
                    
                numAlgoritm=teclado.leer(0,
                    "Ingrese el numero de la operacion: \n"+
                    "1= Agregar Producto\n"+
                    "2= Listar Producto\n"+
                    "3= Registrar Pedido\n"+
                    "4= Reportar Pedidos\n"+
                    "5= Reportar por Fecha\n"+
                    "6= Reportar Rango Fechas\n"+
                    "7= Modificar Producto\n"
                    );    
                
                RecepcionPP pedDao;
                switch(numAlgoritm){
                                                                 
                    case 1:
                    pedDao=new RecepcionPP();
                    pedDao.imprimirLista(pedDao.agregarProducto());
                    break;
                    case 2:
                    utilx.clearConsole();
                    leerArc=new LeerArchivo("Productos.txt");
                    doa=new AppCrud();
                    doa.imprimirLista(doa.listarContenido(leerArc));
                    break;
                    case 3:
                    utilx.clearConsole();
                    pedDao=new RecepcionPP();
                    pedDao.registrarPedido();                    
                    break;
                    case 4:
                    utilx.clearConsole();
                    pedDao=new RecepcionPP();
                    pedDao.reportarPedidos();
                    break;
                    case 5:
                    utilx.clearConsole();
                    pedDao=new RecepcionPP();
                    pedDao.reportePedidosdelDia(teclado.leer("", "Ingrese la fecha: (dd-MM-yyyy):"));
                    break; 
                    case 6:
                    utilx.clearConsole();
                    pedDao=new RecepcionPP();
                    pedDao.reportePedidosRangoFecha(
                        teclado.leer("", "Ingrese Fecha Inicio: (dd-MM-yyyy):"),
                        teclado.leer("", "Ingrese Fecha Fin: (dd-MM-yyyy):")
                        );
                    break;
                    case 7:
                    utilx.clearConsole();
                    pedDao=new RecepcionPP();
                    pedDao.imprimirLista(pedDao.modificarRegProducto());
                    break;
                    default: System.out.println("La opcion No existe!!"); break;
                    }            
                opcion=teclado.leer(' ', "Desea Probar mas Algoritmos? S=SI, N=NO");
                
            }while(opcion=='S' || opcion=='s'); 
              
        } catch (Exception er) {
            System.out.println(er.getMessage());
        }
     
    }

}
