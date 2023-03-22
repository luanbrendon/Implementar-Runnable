/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 10722128072
 */
public class Principal {
    public static void main(String args[]) {
        Runnable biu = new Operario ("chinelo", 100);
        Runnable rai = new Operario ("sandalia", 500);
        Thread t1 = new Thread(biu);
        Thread t2 = new Thread(rai);
        t1.start();
        t2.start();
}
}


