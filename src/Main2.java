import exe2.CafeteiraEletrica;

public class Main2 {

    public static void main(String[] args) {

        System.out.println("\n---------------------------------------------------\n");
        //chama o construtor sem parâmetros
        CafeteiraEletrica obj1 = new CafeteiraEletrica();
        System.out.println("1ª Cafeteira");
        obj1.setAgua(100);
        obj1.setPocafe(9);
        obj1.exibe();
        System.out.println("\n---------------------------------------------------\n");

        CafeteiraEletrica obj2 = new CafeteiraEletrica(900, 90, true);
        System.out.println("2ª Cafeteira");
        obj2.exibe();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função Desligar na 1ª Cafeteira\n");
        obj2.desligar();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função Ligar na 1ª Cafeteira\n");
        obj2.ligar();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função Adicionar Água na 1ª Cafeteira\n");
        obj1.adicionarAgua(9000);
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função Adicionar Água na 2ª Cafeteira\n");
        obj2.adicionarAgua(1100);
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função Adicionar Café na 1ª Cafeteira\n");
        obj1.adicionarCafe(1100);
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função Adicionar Café na 2ª Cafeteira\n");
        obj2.adicionarCafe(10);
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função Prepara Café na 1ª Cafeteira\n");
        obj1.prepararCafe();
        System.out.println("\n---------------------------------------------------\n");


        System.out.println("Testando a função Prepara Café na 2ª Cafeteira\n");
        obj2.prepararCafe();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função Ligar na 1ª Cafeteira\n");
        obj1.ligar();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função Prepara Café na 1ª Cafeteira\n");
        obj1.prepararCafe();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função Quantos Café Possível na 1ª Cafeteira\n");
        obj1.quantosCafesPossiveis();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função Quantos Café Possível na 2ª Cafeteira\n");
        obj2.quantosCafesPossiveis();
        System.out.println("\n---------------------------------------------------\n");
    }
}
