package ch12.lecture.p01object;

public class App03 {
    public static void main(String[] args) {
        Book03 b1 = new Book03();
        Book03 b2 = new Book03();
        b1.setTitle("이것이 자바다");
        b2.setTitle("이것이 자바다");

        // 같은 참조값인가
        System.out.println(b1 == b2);
        // equals : 내용이 같은가
        System.out.println(b1.equals(b2));

    }
}

class Book03 {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // 필요하면 equals 메소드 재정의 해야함
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book03) {
            Book03 o = (Book03) obj;
            return this.title.equals(o.getTitle());
        }
        return false;
    }
}
