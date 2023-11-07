package tp7;


import java.util.ArrayList;
import java.util.Scanner;

class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private double promedio;
    private int edad;

    public Alumno(int legajo, String apellido, String nombre, double promedio, int edad) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.promedio = promedio;
        this.edad = edad;
    }

    // Getters y setters para los atributos de Alumno
    // ...

    @Override
    public String toString() {
        return "Legajo: " + legajo + " - Nombre: " + nombre + " " + apellido + " - Promedio: " + promedio + " - Edad: " + edad;
    }

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}

public class tp7 {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU De OPCIONES");
            System.out.println("1 - Ingresar alumno");
            System.out.println("2 - Modificar edad alumno");
            System.out.println("3 - Dar de baja alumno");
            System.out.println("4 - Aumentar un punto en el promedio a todos");
            System.out.println("5 - Ver lista de alumnos");
            System.out.println("6 - Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    // Ingresar alumno
                    System.out.print("Ingrese el legajo: ");
                    int legajo = scanner.nextInt();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = scanner.next();
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el promedio: ");
                    double promedio = scanner.nextDouble();
                    System.out.print("Ingrese la edad: ");
                    int edad = scanner.nextInt();
                    listaAlumnos.add(new Alumno(legajo, apellido, nombre, promedio, edad));
                    break;
                case 2:
                    // Modificar edad del alumno
                    System.out.print("Ingrese el legajo del alumno para modificar la edad: ");
                    int legajoModificar = scanner.nextInt();
                    boolean encontrado = false;

                    for (Alumno alumno : listaAlumnos) {
                        if (alumno.getLegajo() == legajoModificar) {
                            encontrado = true;
                            System.out.print("Ingrese la nueva edad para el alumno " + alumno.getNombre() + " " + alumno.getApellido() + ": ");
                            int nuevaEdad = scanner.nextInt();
                            alumno.setEdad(nuevaEdad);
                            System.out.println("Edad modificada correctamente.");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Alumno no encontrado con el legajo proporcionado.");
                    }
                    break;
                case 3:
                    // Dar de baja alumno
                    System.out.print("Ingrese el legajo del alumno a dar de baja: ");
                    int legajoBaja = scanner.nextInt();
                    boolean eliminado = false;

                    for (Alumno alumno : listaAlumnos) {
                        if (alumno.getLegajo() == legajoBaja) {
                            listaAlumnos.remove(alumno);
                            eliminado = true;
                            System.out.println("Alumno dado de baja correctamente.");
                            break;
                        }
                    }

                    if (!eliminado) {
                        System.out.println("Alumno no encontrado con el legajo proporcionado.");
                    }
                    break;
                case 4:
                    // Aumentar un punto en el promedio a todos
                    for (Alumno alumno : listaAlumnos) {
                        alumno.setPromedio(alumno.getPromedio() + 1);
                    }
                    break;
                case 5:
                    // Ver lista de alumnos
                    System.out.println("Lista de alumnos:");
                    for (Alumno alumno : listaAlumnos) {
                        System.out.println(alumno);
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}