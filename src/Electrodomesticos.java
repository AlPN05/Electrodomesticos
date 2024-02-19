//de las clases abstractas NO se pueden crear objetos
public abstract class Electrodomesticos {
    private String Tipo;
    private String Marca;
    private Double Potencia;

    public Electrodomesticos(String tipo, String marca, Double potencia) {
        Tipo = tipo;
        Marca = marca;
        Potencia = potencia;
    }


    public Electrodomesticos(String marca, Double potencia) {
        Marca = marca;
        Potencia = potencia;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Double getPotencia() {
        return Potencia;
    }

    public void setPotencia(Double potencia) {
        Potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "Tipo='" + Tipo + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Potencia=" + Potencia +
                '}';
    }
    //metodo abstracto --> solo se define y no tiene codigo
    public abstract double getConsumo(int horas);

    public abstract double  getCosteConsumo(int horas, double costeHora);

}
