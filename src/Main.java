import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 默认的PriorityQueue, 底层是最小堆
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i = 0 ; i < 10 ; i ++){
            int num = (int)(Math.random() * 100);
            pq.add(num);
            System.out.println("insert " + num + " in priority queue.");
        }

        while (!pq.isEmpty())
            System.out.print(pq.poll() + " ");

        System.out.println();
        System.out.println();

        // 使用lambda表达式，创建底层是最大堆的PriorityQueue
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, (a, b) -> b - a);

        for(int i = 0 ; i < 10 ; i ++){
            int num = (int)(Math.random() * 100);
            pq2.add(num);
            System.out.println("insert " + num + " in priority queue.");
        }

        while (!pq2.isEmpty())
            System.out.print(pq2.poll() + " ");

        System.out.println();
        System.out.println();
    }
}
