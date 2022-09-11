package ro.sda.javaro39.springAutoEarnSDA.FiveExercise;

public class Main {
    public static void main(String[] args) {
        ClasaA clasaA = new ClasaA();
        ClasaB clasaB = new ClasaB();
        ClasaC clasaC = new ClasaC();
        ClasaD clasaD = new ClasaD();
        ClasaE clasaE = new ClasaE(clasaA, clasaB, clasaC, clasaD);
        System.out.println(clasaE);

    }
}
