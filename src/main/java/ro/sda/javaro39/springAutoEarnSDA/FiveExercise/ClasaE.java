package ro.sda.javaro39.springAutoEarnSDA.FiveExercise;

public class ClasaE {
    private ClasaA clasaA;
    private ClasaB clasaB;
    private ClasaC clasaC;
    private ClasaD clasaD;

    public ClasaE(ClasaA clasaA, ClasaB clasaB, ClasaC clasaC, ClasaD clasaD) {
        this.clasaA = clasaA;
        this.clasaB = clasaB;
        this.clasaC = clasaC;
        this.clasaD = clasaD;
    }

    public ClasaA getClasaA() {
        return clasaA;
    }

    public void setClasaA(ClasaA clasaA) {
        this.clasaA = clasaA;
    }

    public ClasaB getClasaB() {
        return clasaB;
    }

    public void setClasaB(ClasaB clasaB) {
        this.clasaB = clasaB;
    }

    public ClasaC getClasaC() {
        return clasaC;
    }

    public void setClasaC(ClasaC clasaC) {
        this.clasaC = clasaC;
    }

    public ClasaD getClasaD() {
        return clasaD;
    }

    public void setClasaD(ClasaD clasaD) {
        this.clasaD = clasaD;
    }

    @Override
    public String toString() {
        return "ClasaE{" +
                "clasaA=" + clasaA +
                ", clasaB=" + clasaB +
                ", clasaC=" + clasaC +
                ", clasaD=" + clasaD +
                '}';
    }
}
