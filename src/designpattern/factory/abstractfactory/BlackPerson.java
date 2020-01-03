package designpattern.factory.abstractfactory;

/**
 * @author 罗璋||luozhang@cnpc.com.cn
 * Description TODO
 * @version 1.0
 * @ClassName BlackPerson
 * @date 2019/12/31 16:37
 */
public class BlackPerson implements Color {
    @Override
    public void color() {
        System.out.println("BlackPerson");
    }
}
