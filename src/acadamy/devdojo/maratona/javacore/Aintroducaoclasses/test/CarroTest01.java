package acadamy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import acadamy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "HRV";
        carro1.ano = 2016;
        carro1.modelo = "Honda";

            carro2.nome = "Elantra";
            carro2.ano = 2015;
            carro2.modelo = "Hyndai";

        carro1 = carro2;

        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println(carro1.nome);
        System.out.println("\nCarro 2");
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
        System.out.println(carro2.nome);
    }
}
