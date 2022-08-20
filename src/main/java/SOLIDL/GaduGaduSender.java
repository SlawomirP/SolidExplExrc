package SOLIDL;

import java.util.List;

public class GaduGaduSender implements Informable{
    @Override
    public void sendMessages(List<String> messages) {

    }

    @Override
    public int getSeenCount() {
        throw new IllegalStateException();
    }
}
