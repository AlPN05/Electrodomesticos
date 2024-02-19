//de las clases abstractas NO se pueden crear objetos
public abstract class Electrodomesticos {
    //por defecto son protected
    protected String tipo;
    protected String marca;
    protected double potencia;

    public Electrodomesticos(String tipo, String marca, Double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }


    public Electrodomesticos(String marca, Double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }


    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }
    //metodo abstracto --> solo se define y no tiene codigo
    public abstract double getConsumo(int horas);

    public  double  getCosteConsumo(int horas, double costeHora){
        return horas*costeHora;
    }//getConsumo

}
