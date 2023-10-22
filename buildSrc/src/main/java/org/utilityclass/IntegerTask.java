package org.utilityclass;

public class IntegerTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
