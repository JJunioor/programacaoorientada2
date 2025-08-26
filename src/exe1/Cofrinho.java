package exe1;

public class Cofrinho {
    private double saldo;
    private boolean fechado;

    //Construtor sem parâmetro, default
    public Cofrinho(){
        this.saldo = 0;
        this.fechado = false;
    }

    //Construtor com parâmetros
    public Cofrinho(double saldo, boolean fechado ){
        this.setSaldo (saldo);
        this.setFechado (fechado);
    }

    public void exibe(){
        System.out.println("Saldo em conta do Cofre: " + this.saldo);
        System.out.println("Cofre se encontra fechado: " + (this.fechado ? "Sim" : "Não"));
    }
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else System.out.println("Saldo informado é inválido!");
    }

    //Get nunca usa void
    public double getSaldo(){
        return this.saldo;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }
    // get nunca usa void
    public boolean getFechado(){
        return this.fechado;
    }

    //Abrir
    public void abrir(){
        if (this.fechado){
            setFechado(false);
            System.out.println("Cofre aberto com sucesso!");
            exibe();
        }
        else {
            System.out.println("Cofre já está aberto!");
            exibe();
        }
    }

    public void fechar(){
        if (!this.fechado){
            setFechado(true);
            System.out.println("Cofre fechado com sucesso!");
            exibe();
        }
        else {
            System.out.println("Cofre já está fechado!");
            exibe();
        }
    }

    public void depositar(double valor){
        if (!this.fechado){
            if (valor > 0){
                this.setSaldo( this.saldo + valor);
                System.out.println("Valor depositado em conta, com sucesso!");
                exibe();
            } else System.out.println("Valor não aceito, pois é negativo!");
        } else {
            System.out.println("Não é possível efetuar o depósito, pois a situação do Cofre é fechado!");
            exibe();
        }
    }

    public void retirar(){
        if (!this.fechado){
            if ( this.saldo > 0) {
                double aux = this.saldo;
                this.saldo = 0;
                System.out.println("Saldo retirado com sucesso! \nValor retirado R$" + aux);
                exibe();
            }
            else{
                System.out.println("Não é possível retirar o valor total, pois saldo é igual a 0");
            }
        }
        else {
            System.out.println("Não é possível retirar, cofre se encontra fechado!");
            exibe();
        }
    }

    public void ExibirSaldo(){
        if (!this.fechado){
            System.out.println("Saldo do cofre é: R$" + getSaldo());
        }
        else {
            System.out.println("Cofrinho fechado, saldo indisponível!");
        }
    }


}
