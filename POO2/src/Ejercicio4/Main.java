package Ejercicio4;

public class Main {
    public static void main(String[] args) {



        //CALCULAR AREA DE UN CIRCULO TEST.1
        Circulo objCirculo = new Circulo(10);
        System.out.println("El area del circulo es: " + objCirculo.calcularArea());


        //CALCULAR EL AREA DE UN RECTANGULO TEST.2
        Rectangulo objRectangulo = new Rectangulo(20, 40);
        System.out.println("El area del rectangulo es: " + objRectangulo.calcularArea());


        //CALCULAR EL AREA DE UN CUADRADO TEST.3
        Cuadrado objCuadrado = new Cuadrado(40);
        System.out.println("El area del cuadrado es: " + objCuadrado.calcularArea());
        }
    }





