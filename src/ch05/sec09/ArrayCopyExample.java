package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        // 배열복사
        // for
        //Arrays.copyOf()
        //System.arraycopy()


        String[] old = {"java", "array", "copy"};

        String[] newS = new String[5];

        System.arraycopy(old, 0, newS, 0, old.length);

        for (int i = 0; i < newS.length; i++) {
            System.out.println(newS[i] + ", ");
        }
    }
}
