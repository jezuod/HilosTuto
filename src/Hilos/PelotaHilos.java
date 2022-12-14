package Hilos;

import java.awt.*;

public class PelotaHilos implements Runnable{

    private Component component;
    private Pelota pelota;


    public void run() {
        //for (int i=1; i<=3000; i++){
       // while(!Thread.interrupted())
        System.out.println("\nEstado Hilo: "+Thread.currentThread().isInterrupted());
        while((!Thread.currentThread().isInterrupted()))
            pelota.mueve_pelota(component.getBounds());

            component.paint(component.getGraphics());
        /*
            try {
                //la aplicación al ser monotarea, paramos la ejecución durante 4 miliseg
                Thread.sleep(4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        */
        System.out.println("\nEstado Hilo: "+Thread.currentThread().isInterrupted());

    }

    public PelotaHilos() {
    }

    @Override
    public String toString() {
        return "PelotaHilos{}";
    }

    public PelotaHilos(Pelota unaPelota, Component unComponente) {
        this.pelota= unaPelota;
        this.component=unComponente;
    }
}
