package fr.frain.example;

import junit.framework.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleObjectTest {

    private static Logger logger = LoggerFactory.getLogger(SimpleObjectTest.class);

    @Test
    public void simpleTest(){
        SimpleObject simple = new SimpleObject();
        int v1 = 5;
        simple.setValue(v1);
        int v2 = simple.getValue();
        Assert.assertEquals(v1, v2);
        logger.debug("test OK");
    }

}
