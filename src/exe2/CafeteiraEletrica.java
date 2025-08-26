package exe2;

public class CafeteiraEletrica {
    private int agua;
    private int poCafe;
    private boolean ligada;

    //Construtor sem parâmetro, default ( OBS: Coloquei os valores 0 e false,
    //porém não é necessário, já vem automático.
    public CafeteiraEletrica(){
        this.agua = 0;
        this.poCafe = 0;
        this.ligada = false;
    }
    //Construtor com parâmetros
    public CafeteiraEletrica(int agua,int poCafe, boolean ligada){
        this.setAgua(agua);
        this.setPocafe (poCafe);
        this.setLigada (ligada);
    }

    public void setAgua(int agua){
        if ( agua >= 0 && agua <= 2000){
            this.agua = agua;
        }
        else System.out.println("Quantidade em ML informado para água não aceito!\n");
    }

    public void setPocafe( int poCafe){
        if (poCafe >= 0 && poCafe <= 100){
            this.poCafe = poCafe;
        }
        else System.out.println("Quantidade em GRAMAS informada para o café inválida!\n");
    }

    public void setLigada(boolean ligada){ this.ligada = ligada ;}

    public int getAgua() { return this.agua; }

    public int getPoCafe() { return this.poCafe; }

    public boolean getLigada() { return this.ligada; }


    public void exibe() {
        System.out.println("Informações da Cafeteira:");
        System.out.println("Água em ml: " + this.agua);
        System.out.println("Café em gr: " + this.poCafe);
        System.out.println("Está ligada: " + (this.ligada ? "Sim" : "Não") );
    }
    public void ligar(){
        if (!this.ligada){
            this.setLigada(true);
            System.out.println("Cafeteira ligada com sucesso!\n");
            exibe();
        }
        else System.out.println("Não foi possível ligar, pois a Cafeteira já se encontra ligada!\n");
    }

    public void desligar(){
        if (this.ligada){
           this.setLigada(false);
            System.out.println("Cafeteira desligada com sucesso!\n");
            exibe();
        }
        else System.out.println("Não foi possível desligar, pois a Cafeteira já se encontra desligada!\n");
    }

    public void adicionarAgua(int valor) {
        if (this.ligada) {
            if ( valor > 0){
                setAgua(this.agua + valor);
                exibe();
            } else System.out.println("Ml que deseja ser adicionada, deve ser maior que 0");
        } else System.out.println("Não é possível adicionar Água, cafeteira desligada!");
    }

    public void adicionarCafe(int valor){
        if (this.ligada) {
            if ( valor > 0){
                setPocafe(this.poCafe + valor);
                exibe();
            } else System.out.println("Gr que deseja ser adicionada, deve ser maior que 0");
        } else System.out.println("Não é possível adicionar Café, cafeteira desligada!");
    }

    public void prepararCafe(){
        if (this.ligada){
            if ( this.agua >= 100){
                if (this.poCafe >= 10){
                    this.setAgua(this.agua - 100);
                    this.setPocafe(this.poCafe - 10);
                    System.out.println("Café preparado com sucesso!\n");
                    exibe();
                }
                else System.out.println("Quantidade de Pó de Café inferior a 10gr\n");
            }
            else System.out.println("Quantidade de Água inferior a 100ml\n");
        }
        else System.out.println("Cafeteira está desligada!\n");
    }

    public void quantosCafesPossiveis() {
        /*int aguas = this.agua;    // cópia da água
        int cafes = this.poCafe;  // cópia do pó
        int cont = 0;

        while (aguas >= 100 && cafes >= 10) {
            aguas -= 100;   // simula gastar água
            cafes -= 10;    // simula gastar café
            cont++;            // conta um café possível
        }*/

        int dosesAgua = this.agua / 100;
        int dosesCafe = this.poCafe / 10;
        int cont;

        cont = Math.min(dosesCafe, dosesAgua);

        if (cont > 0) {
            System.out.println("Ainda é possível preparar " + cont + " cafés.");
        } else {
            System.out.println("Não há recursos suficientes para preparar nenhum café.");
        }
    }

}
