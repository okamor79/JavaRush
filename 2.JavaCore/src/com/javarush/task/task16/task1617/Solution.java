package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        String mess = "";
        if (countSeconds == 3) {
            mess = "Марш!";
        } else if (countSeconds == 4) {
            mess = "Прервано!";
        }
    //    clock.run();
        Thread.sleep(3500);
        clock.interrupt();
        System.out.println(mess);

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            Thread current = Thread.currentThread();
            while (!current.isInterrupted() && countSeconds > 0) {
                try {
                    System.out.print(countSeconds + " ");
                    countSeconds -= 1;
                    current.sleep(1000);
                } catch (Exception e) {

                }
        }

        }
    }
}
