public class Entreganormal extends Entrega{

    private double dinheiro = 2;

    public Entreganormal(double distancia, String destinatario, double dinheiro){
        super(distancia, destinatario);
        this.dinheiro = dinheiro;
    }


    @Override
    public double calcularCusto() {
        return getDistancia() * dinheiro;
    }
}
