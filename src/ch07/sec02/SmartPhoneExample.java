package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone("갤럭시", "은색");

        System.out.println("p.model = " + p.model);
        System.out.println("p.color = " + p.color);

        System.out.println("p.setWifi(); = " + p.wifi);

        p.bell();
        p.sendVoice("여보세요");
        p.receiveVoice("안녕하세요");
        p.sendVoice("반갑습니다");
        p.hangUp();

        p.setWifi(true);
        p.internet();
        
    }
}
