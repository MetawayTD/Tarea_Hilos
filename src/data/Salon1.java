package data;

import java.util.Random;

public class Salon1 implements Runnable{
    Random ram = new Random();

    private int duracion_clase;

    public Salon1(int duracion_clase){
        this.duracion_clase=duracion_clase;
    }

    public void stop(){
        duracion_clase=-1;
    }

    @Override
    public void run(){

        int contador =0;
        int numero_estudiantes=0;
        int profesor = 1;

        while(contador<this.duracion_clase){
            try{
                int numero_random = ram.nextInt(1,5);
                contador++;
                numero_estudiantes += numero_random;
                Thread.sleep(1000);
                System.out.println("Salon 1: "+contador+" minutos de clase, "+numero_estudiantes+" estudiantes y "+profesor+" profesores");
            }
            catch (InterruptedException error){
                error.printStackTrace();
            }
        }
        System.out.println("El salon 1 ha terminado su clase a los "+contador+" minutos, con "+numero_estudiantes+" estudiantes"+
                " y "+profesor+" profesores");

    }
}
