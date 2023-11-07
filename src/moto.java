
package  clasesyobjetos;

public class moto {
    //Atributos
    String color;
    String marca;
    int km;
    //metodos
    public static void main(String [] args){
        moto moto1 = new moto();

        moto1.color = "verde";
        moto1.marca = "kawasaki";
        moto1.km = 200;

        System.out.println("el color de la moto1 es: "+moto1.color);
        System.out.println("la marca de la moto1 es: "+moto1.marca);
        System.out.println("el kilometraje de la moto1 es: "+moto1.km);


        moto moto2 = new moto();
        moto2.color = "negra";
        moto2.marca = "suzuki";
        moto2.km = 100;

        System.out.println("\nel color de la moto2 es: "+moto2.color);
        System.out.println("la marca de la moto2 es: "+moto2.marca);
        System.out.println("el kilometraje de la moto2 es: "+moto2.km);


        moto moto3 = new moto();
        moto3.color = "azul";
        moto3.marca = "trembo";
        moto3.km = 5000;

        System.out.println("\nel color de la moto3 es: "+moto3.color);
        System.out.println("la marca de la moto3 es: "+moto3.marca);
        System.out.println("el kilometraje de la moto3 es: "+moto3.km);
    }

    }