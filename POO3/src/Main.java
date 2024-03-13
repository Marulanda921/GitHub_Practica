import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Gestión de Curso

        Scanner objScaner = new Scanner(System.in);
        gestionCurso objGestion = new gestionCurso();



        int option = 0;
        do{
            System.out.println("""
                    Menu opciones:
                    
                    1. Administrar Cursos
                    2. Administrar Estudiantes
                    3. Salir
                    
             
                    """);
            option = objScaner.nextInt();

            switch (option){
                case 1:
                    int option2 = 0;
                   do {

                       System.out.println("""
                            Menu de cursos:
                            
                            1. Crear Curso
                            2. Buscar Curso por codigo
                            3. Listar Cursos
                            4. salir
                            
                            """);
                       option2 = objScaner.nextInt();

                       switch (option2){
                           case 1:
                               objGestion.guardarCurso(objScaner);
                               break;
                           case 2:
                               System.out.println("Ingresa el codigo del curso");
                               String codigo = objScaner.next();
                               System.out.println(objGestion.buscarCodigo(codigo).toString());
                               break;
                           case 3:
                               System.out.println("Listar Estudiantes");
                               System.out.println(objGestion.getListaCursos().toString());
                               break;
                       }
                   }while (option2 != 4);
                    break;
                case 2:
                    int option3 = 0;

                    do {
                        System.out.println("""
                            Menu gestion de estudiantes
                            
                            1. Agregar Estudiante
                            2. Eliminar Estudiante
                            3. Listar Estudiantes
                            4. Salir
                           
                            """);
                        option3 = objScaner.nextInt();
                        switch (option3){
                            case 1:
                                objGestion.listarCursos();
                                System.out.println("Ingrese el codigo del curso donde se desea inscribir");
                                String codigo = objScaner.next();
                                Curso curso = objGestion.buscarCodigo(codigo);
                                if (curso == null){
                                    System.out.println("Curso no encontrado");
                                }else{
                                    curso.guardarEstudiante(objScaner);
                                }
                                break;
                                case 2:
                                    //caso para eliminar estudiante
                                    //1. listar cursos
                                    objGestion.listarCursos();
                                    //2. preguntar el curso a eliminar
                                    System.out.println("Ingrese el curso a eliminar");
                                    codigo = objScaner.next();

                                    //3. llamar al metodo que elimina
                                    Curso objCurso = objGestion.buscarCodigo(codigo);
                                    if (objCurso == null){
                                        System.out.println("Codigo no valido");
                                    }else{
                                        objCurso.eliminarEstudiante(objScaner);
                                    }
                                    break;
                                case 3:
                                    objGestion.listarCursos();
                                    System.out.println("Ingrese el codigo del curso donde se desea inscribir");
                                    codigo = objScaner.next();
                                    curso = objGestion.buscarCodigo(codigo);
                                    if (curso == null){
                                        System.out.println("Curso no encontrado");
                                    }else{
                                        curso.listarEstudiantes();
                                    }
                                    break;

                        }
                    }while (option3 != 4);
                    break;


            }

        }
        while (option != 3);


    }
}
