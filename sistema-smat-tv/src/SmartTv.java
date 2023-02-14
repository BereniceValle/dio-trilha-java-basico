public class SmartTv {
     boolean ligada = false;
     int canal = 2;
     int volume = 10;
     public void mudarCanal (int novoCanal){
        canal = novoCanal;
     }
     public void aumentarCanal(){
        //canal = canal +1
        canal ++;
     }

     public void diminuirCanal(){
        //canal = canal -1
        canal --;
     }   

     public void aumentarVolume(){
        //volume = volume +1
        volume ++;
     }

     public void diminuirVolume(){
        //volume = volume -1
        volume --;
     }   


     public void ligar(){
        ligada = true;
     }
     public void desligar(){
        ligada = false;
     }
}