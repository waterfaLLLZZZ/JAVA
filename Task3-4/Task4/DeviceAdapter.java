public class DeviceAdapter implements Home{
LampXiaomi lampXiaomi;
RouterHuawei routerHuawei;
    public DeviceAdapter(LampXiaomi lampXiaomi, RouterHuawei routerHuawei) {
        this.lampXiaomi = lampXiaomi;
        this.routerHuawei = routerHuawei;
    }
   @Override
    public void play() {
        lampXiaomi.on();
        routerHuawei.reboot();
    }
    @Override
    public void goodbye() {
        lampXiaomi.off();
        routerHuawei.deleteCache();
    }
}
