package ch12.lecture.p01object;

public class App08 {
    public static void main(String[] args) {
        Book08 b1 = new Book08("java", 5000);
        Book08 b2 = new Book08("git", 7000);

        System.out.println("제목: " + b1.getTile() + ", 가격: " + b1.getPrice());
        System.out.println("제목: " + b2.getTile() + ", 가격: " + b2.getPrice());

        System.out.println();

        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}

class Book08 {
    private String tile;
    private int price;

    public Book08(String tile, int price) {
        this.tile = tile;
        this.price = price;
    }

    public String getTile() {
        return tile;
    }

    public int getPrice() {
        return price;
    }

    // toString() : 이 객체를 설명하는 텍스트 리턴


    @Override
    public String toString() {
        String text = "제목: " + tile + ", 가격: " + price;
        return text;
    }
}
