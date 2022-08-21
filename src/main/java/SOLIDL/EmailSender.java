package SOLIDL;

import java.util.List;

public class EmailSender implements Informable, ViewCoint{
    @Override
    public void sendMessages(List<String> messages) {

    }

    @Override
    public int getSeenCount() {
        return 0;
    }
}
