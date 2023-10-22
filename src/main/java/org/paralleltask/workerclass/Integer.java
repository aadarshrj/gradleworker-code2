package org.paralleltask.workerclass;

public class Integer implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
