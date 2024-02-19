public class Lavadora extends Electrodomesticos{
    protected double precio;
    boolean aguaCaliente;

    public Lavadora(String marca, Double potencia) {
        super(marca, potencia);
        this.aguaCaliente =false;
    }

    public Lavadora(String marca, Double potencia, double precio, boolean aguaCaliente) {
        super(marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "Precio=" + precio +
                ", AguaCaliente=" + aguaCaliente +
                '}';
    }

    public  double getConsumo(int horas)
    {
        if (!this.aguaCaliente){//agua fria
            return horas*this.potencia;
        }else {//agua caliente
            return horas*(this.potencia+this.potencia*0.2);
        }

    }



}
