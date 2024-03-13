package Ejercicio4;

public class Rectangulo extends Figura{

    private double largo;
    private double ancho;


    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override //Este metodo viene de mas arriba y esta sobreescribiendo
    public double calcularArea() {
        return this.largo * this.ancho;
    }
}


