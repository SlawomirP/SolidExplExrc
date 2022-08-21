package SOLIDLtest;

import SOLIDL.EmailSender;
import SOLIDL.GaduGaduSender;
import SOLIDL.Informable;
import SOLIDL.ViewCoint;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InformServiceTest {

    @Test
    public void testForMe(){
        Informable informable;
        ViewCoint viewCoint;
        EmailSender emailSender = new EmailSender();
        GaduGaduSender gaduGaduSender = new GaduGaduSender();

        //podstawiamy najpierw pod informable emailsendera
        //nastepnie gadugadusendera i testujemy metody

        informable = emailSender;
        informable.sendMessages(Arrays.asList("przyklad"));

        informable = gaduGaduSender;
        informable.sendMessages(Arrays.asList("przyklad"));

        viewCoint = emailSender;
        viewCoint.getSeenCount();

    }

}