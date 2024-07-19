import java.util.Arrays;

public class MyList<E> {
private int size = 0;
private static final int DEFAULLT_CAPACYTY = 10;
private Object elments [];

public MyList(){
    elments = new   Object[DEFAULLT_CAPACYTY];
}

private void ensureCapa(){
    int newsize = elments.length * 2;
    elments = Arrays.copyOf(elments,newsize);
}

public void add(E e){
    if (size == elments.length){
        ensureCapa();
    } else {
        elments[size++] = e;
    }
}

public E get(int i){
    if (i >= size || i < 0) {
        throw new IndexOutOfBoundsException("index " + i + " size " + i);
    } else {
        return (E) elments[i];
    }
}
}
