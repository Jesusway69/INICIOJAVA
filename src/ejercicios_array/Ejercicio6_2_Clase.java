package ejercicios_array;

public class Ejercicio6_2_Clase {
    private String calle;
    private int portales;
    private int[] habitantes = new int[portales];

    public Ejercicio6_2_Clase() {
    }

    public Ejercicio6_2_Clase(String calle, int portales) {
        this.calle = calle;
        this.portales = portales;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getPortales() {
        return portales;
    }

    public void setPortales(int portales) {
        this.portales = portales;
    }

    public int[] getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int[] habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Ejercicio6_2_Clase{" + "calle=" + calle + ", portales=" + portales + ", habitantes=" + habitantes + '}';
    }
    
    
}
