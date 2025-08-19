package exe0;

public class Ventilador {
   private int velocidade;
   private boolean ligado;

   //Construtor vazio
    public Ventilador(){
        //valores default
        this.velocidade = 0;
        this.ligado = false;
    }

    public Ventilador(int velocidade, boolean ligado){
        //Em um construtor com parâmetro deve ser sempre colocado o set para
        // que o usuário entre com um valor que não pode
        this.setVelocidade (velocidade);
        this.setLigado(ligado);
    }

   public void setVelocidade(int velocidade) {
       if (velocidade >= 0 && velocidade <= 3) {
           this.velocidade = velocidade;
           if ( this.velocidade == 0){
               this.ligado = false;
           }
       }
       else {
           System.out.println("Velocidade Inválida!");
       }
   }

   //Get nunca usa void
   public int getVelocidade(){
       return this.velocidade;
   }

   public void setLigado(boolean ligado) {
       this.ligado = ligado;
   }
   // get nunca usa void
   public boolean getLigado(){
       return this.ligado;
   }

   //Acelerar
    public void acelerar(){
        //Quando está dentro da própria classe não é necessário usar o GET
        //Própria classe == Ventilador e não MAIN
        this.setVelocidade(this.velocidade + 1);
    }

    //Frear
    public void frear(){
        this.setVelocidade(this.velocidade - 1);
    }

    public void ePAR(){
        if (this.velocidade % 2 == 0 ){
            System.out.println("É Par!");
        }
        else {
            System.out.println("Não é Par!");
        }
    }
}
