package ro.sda.javaro39.springAutoEarnSDA.SixExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClasaB {
    @Autowired
    private ClasaA clasaA;

    public ClasaB() {
    }

    public ClasaA getClasaA() {
        return this.clasaA;
    }

    public void setClasaA(ClasaA clasaA) {
        this.clasaA = clasaA;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ClasaB)) return false;
        final ClasaB other = (ClasaB) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$clasaA = this.getClasaA();
        final Object other$clasaA = other.getClasaA();
        if (this$clasaA == null ? other$clasaA != null : !this$clasaA.equals(other$clasaA)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ClasaB;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $clasaA = this.getClasaA();
        result = result * PRIME + ($clasaA == null ? 43 : $clasaA.hashCode());
        return result;
    }

    public String toString() {
        return "ClasaB(clasaA=" + this.getClasaA() + ")";
    }
}
