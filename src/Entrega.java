public abstract class Entrega {
    private double distancia;
    private String destinatario;

    public Entrega (double distancia, String destinatario){
        this.destinatario = destinatario;
        this.distancia = distancia;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
       public abstract double calcularCusto();

}
