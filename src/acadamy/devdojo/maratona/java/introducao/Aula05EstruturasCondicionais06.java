package acadamy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
      // Dado os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo

        byte dias = 4;
        switch (dias) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
