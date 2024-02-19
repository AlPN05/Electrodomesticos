public class Lavadora extends Electrodomesticos{
    double Precio;
    boolean AguaCaliente;

    public Lavadora(String marca, Double potencia) {
        super(marca, potencia);
        this.AguaCaliente=false;
    }

    public Lavadora(String marca, Double potencia, double precio, boolean aguaCaliente) {
        super(marca, potencia);
        Precio = precio;
        AguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public boolean isAguaCaliente() {
        return AguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        AguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "Precio=" + Precio +
                ", AguaCaliente=" + AguaCaliente +
                '}';
    }

    public  double getConsumo(int horas)
    {
        if (!this.AguaCaliente){//agua fria

        }else {//agua caliente

        }
    }

}
