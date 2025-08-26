import exe1.Cofrinho;

public class Main1 {
    public static void main(String[] args){
        System.out.println("\n---------------------------------------------------\n");
        //chama o construtor sem parâmetros
        Cofrinho obj1 = new Cofrinho();
        obj1.setSaldo(1050);
        obj1.exibe();
        System.out.println("\n---------------------------------------------------\n");

        Cofrinho obj2 = new Cofrinho( 1009, true);
        obj2.exibe();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função fechar no Cofre 1\n");
        obj1.fechar();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função fechar no Cofre 2\n");
        obj2.fechar();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função abrir no Cofre 1\n");
        obj1.abrir();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função depositar no Cofre 2\n");
        obj2.depositar(25);
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função depositar no Cofre 1\n");
        obj1.depositar(25);
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função retirar no Cofre 1\n");
        obj1.retirar();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função retirar no Cofre 2\n");
        obj2.retirar();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função exibir saldo no Cofre 2\n");
        obj2.ExibirSaldo();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função exibir saldo no Cofre 1\n");
        obj1.ExibirSaldo();
        System.out.println("\n---------------------------------------------------\n");

        System.out.println("Testando a função abrir no Cofre 2\n");
        obj2.abrir();
        System.out.println("\n---------------------------------------------------\n");
    }

}