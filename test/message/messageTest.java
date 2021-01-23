package message;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class messageTest {

    private long getTimeStamp(){
        Date date = new Date();
        return date.getTime();
    }
    private final String testMessage = "This is the test";

    @Test
    public void makeMessageTest() throws Exception {
        long time =  getTimeStamp();
        Message message = new MessageImpl("Tester", time, testMessage );

        Assert.assertEquals(message.getMessage(), testMessage);
        Assert.assertEquals(message.getTimeStamp(), time);
        Assert.assertEquals(message.getMessage(), testMessage);
    }

    @Test(expected = Exception.class)
    public void badMakeMessage1() throws Exception{
        Message message = new MessageImpl(null,getTimeStamp(),testMessage);
    }
    @Test(expected = Exception.class)
    public void badMakeMessage2() throws Exception{
        Message message = new MessageImpl("Tester",0,testMessage);
    }
    @Test(expected = Exception.class)
    public void badMakeMessage3() throws Exception{
        Message message = new MessageImpl("Tester",getTimeStamp(),null);
    }


    @Test
    public void randMakeMessageTest() throws Exception {
        long time =  Long.MAX_VALUE;
        Message message = new MessageImpl("Tester", time, testMessage );
        Assert.assertEquals(message.getTimeStamp(), time);
    }


    @Test
    public void goodSendReciveMessage() throws Exception {
        long time =  getTimeStamp();
        Message message = new MessageImpl("Tester", time, testMessage );

        MessageReciver mr = new MessageExchangerImpl();
        MessageSender ms = new MessageExchangerImpl();
        FileOutputStream fos = new FileOutputStream("Test.txt");
        FileInputStream fis = new FileInputStream("Test.txt");

        ms.sendMessage(message, fos);
        Thread.sleep(1500);
        mr.reciveMessage(fis);
    }



}
