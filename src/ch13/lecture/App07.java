package ch13.lecture;

public class App07 {
    public static void main(String[] args) {
        Box07<Number> b1 = new Box07<>();
        b1.setItem(3.14);
        b1.setItem(99);


        Integer b = 3;
        Number a = b;

        Box07<Integer> b3 = new Box07<>();
//        Box07<Number> b2 = b3; // x
    }
}

class Box07<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
