public class Alumno {
    private String nombre;
    private double[] calificaciones = new double[5];

    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public char obtenerCalificacionFinal() {
        double promedio = calcularPromedio();
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal();
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    public static void main(String[] args) {
        String nombre = "Marisol";
        double[] calificaciones = {85, 90, 75, 90, 90};
        Alumno alumno = new Alumno(nombre, calificaciones);
        alumno.imprimirResultados();
    }
}
