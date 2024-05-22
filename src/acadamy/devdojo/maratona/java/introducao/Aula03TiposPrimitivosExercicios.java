package acadamy.devdojo.maratona.java.introducao;
import java.text.DecimalFormat;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {

        DecimalFormat salaryMiddleOrJunior = new DecimalFormat("0.000");

        String name = "Zoro Sola";
        String address = "Rua Etiópia - 498";
        float salary = 5.500f;
        String formattedSalary = salaryMiddleOrJunior.format(salary);
        String date = "15/05/2024";

        System.out.println("Eu "+name+", morando no endereço "+address+", confirmo que recebi o salário de R$" +
                formattedSalary+", na data "+date);
    }
}
