package Ejercicio4;

public class Cuadrado extends Rectangulo{

    public Cuadrado( double lado){ //es igual a new, super lo que hace es disparar el constructor de la clase padre en este caso rectangulo
        super(lado, lado);
    }

    //NO ES NECESARIO SOBREEESCRIBIE O CALCULAR AREA YA QUE AL IMPLEMENTAR EL RECTANGULO YA ETSAMOS OBTENIENDO LA FUNCIONALIDAD


}
