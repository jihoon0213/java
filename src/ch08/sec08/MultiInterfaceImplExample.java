package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTv();

        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTv();
        searchable.search("https://www.youtube.com");
    }
}
