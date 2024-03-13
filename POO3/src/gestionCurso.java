import java.util.ArrayList;
import java.util.Scanner;

public class gestionCurso {

    private ArrayList<Curso> listaCursos;

    public gestionCurso(){
        this.listaCursos = new ArrayList<>();
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public void  guardarCurso(Scanner objScan){
        System.out.println("Agregar curso\n");

        System.out.println("Ingresa el nombre del curso: ");
        String nombre = objScan.next();


        System.out.println("Ingresa el codigo del curso: ");
        String codigo = objScan.next();


        //si el objeto buscar no devuelve null significa que el codigo ya existe
        if (this.buscarCodigo(codigo) != null){
            System.out.println("El codigo ya esta tomado");
        }else{
            //crear curso
            Curso objCurso = new Curso(codigo,nombre);
            this.listaCursos.add(objCurso);
        }
    }


    public Curso buscarCodigo(String codigoBusca) {
        for (Curso cursoTemp : this.listaCursos) {
            if (cursoTemp.getCodigo().equalsIgnoreCase(codigoBusca)) {
                return cursoTemp;
            }
        }
        return null;
    }

    public void listarCursos(){
        if (this.listaCursos.isEmpty()) {
            System.out.println("No hay cursos registrados");
        }else {
            for (Curso cursoTemp : this.listaCursos) {
                System.out.println(cursoTemp.toString());
            }
        }

    }

}
