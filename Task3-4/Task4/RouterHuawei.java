public class RouterHuawei implements RouterInterface{
    @Override
    public void reboot() {
        System.out.println("Router Huawei is rebooting");
    }
    @Override
    public void deleteCache() {
        System.out.println("Router Huawei is deleting cache");
    }
}
