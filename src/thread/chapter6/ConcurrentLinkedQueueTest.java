package thread.chapter6;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author 罗璋||luozhang@cnpc.com.cn
 * Description TODO
 * @version 1.0
 * @ClassName ConcurrentLinkedQueue
 * @date 2020/1/14 11:10
 */
public class ConcurrentLinkedQueueTest {
    public static void main(String[] args){
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
