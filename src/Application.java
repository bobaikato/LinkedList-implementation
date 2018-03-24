/**
 * Created by IntelliJ IDEA.
 * Author: Bobai  Kato <www.bobaiKato.io>
 * Date: 03/24/18, Time: 2:35 PM
 */

public class Application {

    public static void main(String... args) {
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.remove(2);
        linkedList.indexOf(3);
        linkedList.print();

        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.size());

        linkedList.clear();

    }

}
