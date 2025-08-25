import exe0.Ventilador;

public class Main0 {
        public static void main(String[] args){
            Ventilador obj1 = new Ventilador();
            obj1.setVelocidade(1);
            System.out.println("Velocidade de Objeto 1: " + obj1.getVelocidade());


            Ventilador obj2 = new Ventilador();
            obj2.setVelocidade(9);
            System.out.println("Velocidade de Objeto 2: " + obj2.getVelocidade());

            Ventilador obj3 = new Ventilador(6,true) ;
        }

}