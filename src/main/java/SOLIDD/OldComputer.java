package SOLIDD;

public class OldComputer {

    private final Keyboard wiredKeyboard;
    private final Monitor monitor;

    public OldComputer(Keyboard wiredKeyboard, Monitor monitor) {
        this.wiredKeyboard = wiredKeyboard;
        this.monitor = monitor;
    }

    public void start(){
        System.out.println("started");
    }
}
