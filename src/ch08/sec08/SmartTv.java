package ch08.sec08;

public class SmartTv implements RemoteControl, Searchable {
    @Override
    public void turnOn() {
        System.out.println("on");
    }

    @Override
    public void turnOff() {
        System.out.println("off");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다");

    }
}
