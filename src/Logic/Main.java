package Logic;

import data.Salon1;
import data.Salon2;

public class Main {
    public static void main(String[] args){
        Salon2 salon2 = new Salon2(10);
        Salon1 salon1 = new Salon1(11);
        Thread thread_salon2 = new Thread(salon2);
        Thread thread_salon1 = new Thread(salon1);

        thread_salon2.start();
        thread_salon1.start();

    }
}