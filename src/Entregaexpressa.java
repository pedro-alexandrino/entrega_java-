public class Entregaexpressa extends Entrega {
    private double dinheiro = 4;

    public Entregaexpressa(double distancia,String destinatario, double dinheiro){
        super(distancia, destinatario);
        this.dinheiro = dinheiro;
    }

    @Override
    public double calcularCusto(){
        return getDistancia() * 4;
    }
}
