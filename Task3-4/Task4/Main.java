/*Разработайте программу для интеграции с разными системами
        умного дома (например, системами от разных производителей) с использованием адаптеров.*/
public class Main {
    public static void main(String[] args) {
        SpeakerGoogle speakerGoogle = new SpeakerGoogle();
        LampXiaomi lampXiaomi = new LampXiaomi();
        RouterHuawei routerHuawei = new RouterHuawei();
        DeviceAdapter deviceAdapter = new DeviceAdapter(lampXiaomi, routerHuawei);
        speakerGoogle.play();
        deviceAdapter.play();
        System.out.println("--------------------------------------------------");
        speakerGoogle.goodbye();
        deviceAdapter.goodbye();
    }
}
