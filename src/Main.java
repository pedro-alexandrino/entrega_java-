import java.util.Scanner;
public class Main{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o nome do destinatario:");
        String nome = scanner.nextLine();
        System.out.print("Digite quantos km foram percorridos durante a entrega:");
        double distancia = scanner.nextDouble();

        Entreganormal entreganormal = new Entreganormal(distancia,nome,2);
        System.out.println("valor total da entrega normal: R$ "+ entreganormal.calcularCusto());


        Entregaexpressa entregaexpressa = new Entregaexpressa(distancia,nome,4);
        System.out.println("valor total da entrega expressa: R$ "+entregaexpressa.calcularCusto());


    }
}