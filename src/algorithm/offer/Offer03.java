package algorithm.offer;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 罗璋|luozhang@cnpc.com.cn
 * @version 1.0
 * @classname offer03
 * @description TODO
 * @date 2020/2/19 17:08
 */
public class Offer03 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet(5);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
