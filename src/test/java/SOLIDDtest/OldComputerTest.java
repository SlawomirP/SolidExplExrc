package SOLIDDtest;

import SOLIDD.AsusMonitor;
import SOLIDD.Keyboard;
import SOLIDD.Monitor;
import SOLIDD.OldComputer;
import SOLIDD.WiredKeyboard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OldComputerTest {

    @Test
    public void testDependencyInversion(){
//        WiredKeyboard wiredKeyboard = new WiredKeyboard();
//        AsusMonitor asusMonitor = new AsusMonitor();
//        final OldComputer oldComputer = new OldComputer(wiredKeyboard, asusMonitor);
        final OldComputer oldComputer = new OldComputer(new WiredKeyboard(), new AsusMonitor());

        oldComputer.start();
    }

}