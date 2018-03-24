/**
 * Created by IntelliJ IDEA.
 * Author: Bobai  Kato <www.bobaiKato.io>
 * Date: 03/24/18, Time: 2:35 PM
 */

public interface List<T extends Comparable<T>> {

    void add(T data);

    void remove(T data);

    T get(int index);

    void print();

    void clear();

    int indexOf(T data);

    int size();

    Boolean isEmpty();
}
