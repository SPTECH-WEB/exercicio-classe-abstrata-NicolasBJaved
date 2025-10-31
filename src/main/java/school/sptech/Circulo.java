package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return (raio*raio) * Math.PI;
    }

    @Override
    public String toString(){
        return "Espessura: " + getEspessura() + " | cor: " + getCor() + " | raio: " + raio;
    }
}
