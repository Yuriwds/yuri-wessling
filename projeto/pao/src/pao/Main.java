package pao;

public class Main {
    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        c1.raio = 2;

        Circulo c2 = new Circulo();
        c2.raio = 3;

        Circulo c3 = new Circulo();
        c3.raio = 4;

        Circulo c4 = new Circulo();
        c4.raio = 5;

        System.out.println("Área 1: " + c1.calcularArea());
        System.out.println("Área 2: " + c2.calcularArea());
        System.out.println("Área 3: " + c3.calcularArea());
        System.out.println("Área 4: " + c4.calcularArea());

    }
}