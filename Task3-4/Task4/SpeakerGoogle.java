public class SpeakerGoogle implements Home{
    @Override
    public void play() {
        System.out.println("Welcome to your home! Lamp is on and router is rebooting");
    }
    @Override
    public void goodbye() {
        System.out.println("Goodbye! Lamp is off and router do delete cache");
    }
}
