package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

    // Race Condition Example

    private static Queue<Integer> queue = new LinkedList<>();

    private static int maxSize = 100000;

    private static void producer(Queue<Integer> queue){
        int i = 0;
        new Thread(()->{
          while(true){
               if(queue.size() < maxSize) {
                 queue.add(i);
                 System.out.println("Element added to the queue");
                   try {
                       Thread.sleep(500);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
          }
           }).start();
    }

    private static void consumer(Queue<Integer> queue){
         new Thread(()->{
           while(true){
               if(!queue.isEmpty()) {
                   queue.poll();
                   System.out.println("Element removed from the queue");
                   try {
                       Thread.sleep(500);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
            }
        }).start();
    }

    public static void main(String[] args) {
        System.out.println("Application Started");
          producer(queue);
          consumer(queue);
    }




}
