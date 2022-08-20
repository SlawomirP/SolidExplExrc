package SOLIDLtest;

import SOLIDL.EmailSender;
import SOLIDL.GaduGaduSender;
import SOLIDL.Informable;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InformServiceTest {

    @Test
    public void testForMe(){
        Informable informable;
        EmailSender emailSender = new EmailSender();
        GaduGaduSender gaduGaduSender = new GaduGaduSender();

        //podstawiamy najpierw pod informable emailsendera
        //nastepnie gadugadusendera i testujemy metody

        informable = emailSender;
        informable.sendMessages(Arrays.asList("przyklad"));
        informable.getSeenCount();

        informable = gaduGaduSender;
        informable.sendMessages(Arrays.asList("przyklad"));
        informable.getSeenCount();

    }

}