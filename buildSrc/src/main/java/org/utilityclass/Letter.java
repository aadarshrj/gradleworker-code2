package org.utilityclass;



public class Letter implements Runnable {
    @Override
    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}