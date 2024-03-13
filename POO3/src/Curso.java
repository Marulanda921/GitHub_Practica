import java.util.ArrayList;
import java.util.Scanner;


public class Curso {
    private String codigo;
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;

    private static int idEstudiante = 1;


    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();

    }

    public void guardarEstudiante(Scanner objScan){
        System.out.println("Agregar Nuevo estudiante\n");
        System.out.println("Ingresa el nombre del estudiante: ");
        String nombre = objScan.next();
        System.out.println("Ingresa el email del estudiante: ");
        String email = objScan.next();

        Estudiante nuevoEstudiante = new Estudiante(idEstudiante, nombre, email);


        if (listaEstudiantes.add(nuevoEstudiante)){
            System.out.println("Se agrego correctamente");
        }else{
            System.out.println("No se pudo agregar correctamente");
        }
    }



    public void listarEstudiantes(){
        //validar si la lista esta vacia
        if (listaEstudiantes.isEmpty()){
            System.out.println("El curso".concat(this.nombre).concat(" no tiene estudiantes"));
        }else{
            System.out.println("\nLista de estudiantes en el curso: " + this.nombre);
            for (Estudiante estudiante : this.listaEstudiantes) {
                System.out.println(estudiante.toString());

            }
        }


    }

    public void eliminarEstudiante(Scanner objScan){
        //Listar Estudiantes
        this.listarEstudiantes();
        System.out.println("Ingresa el codigo del estudiante que desea eliminar: ");

        //pedir elemento de id
        int codigo = objScan.nextInt();
        System.out.println(codigo);

        //eliminar, filtrar
        if ( listaEstudiantes.removeIf(estudiante -> estudiante.getId() == codigo)){
            System.out.println("el estudiante se removio correctamente");
        }else{
            System.out.println("No se pudo eliminar el estudiante");
        }

        //Listar Estudiantes
        this.listarEstudiantes();

    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
