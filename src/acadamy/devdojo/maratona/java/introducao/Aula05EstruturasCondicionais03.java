package acadamy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario for maior que 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500tao pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter";
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
