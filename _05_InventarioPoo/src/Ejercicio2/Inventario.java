package Ejercicio2;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> ListaProductos;

    public Inventario(){
        this.ListaProductos = new ArrayList<Producto>();
    }

    //METODOS PARA AÑADIR ELIMINAR Y LISTAR




    //AÑADIR
    public void agregarProducto(Producto producto){
        this.ListaProductos.add(producto);
    }


    //ELIMINAR
    public boolean eliminarProducto(int id){
       return ListaProductos.removeIf(producto -> producto.getId() == id);
    }



    //BUSCAR
    public Producto buscarPorNombre(String nombreBuscar){
        for (Producto objProducto :this.ListaProductos){
            if (objProducto.getNombre().equalsIgnoreCase(nombreBuscar)){
                return objProducto;
            }
        }
        return null;
    }


    //LISTAR
    public String listarProductos(){

        String listaString  = "";
        for (Producto producto : this.ListaProductos){
            listaString += "ID:" + producto.getId() + "Nombre:" + producto.getNombre() + "Precio: " + producto.getPrecio();
        }

        return listaString;
    }
}


