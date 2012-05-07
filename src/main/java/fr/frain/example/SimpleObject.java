/*******************************************************************************
 * Copyright(c) 2011-1012 Ubeeko
 * All rights reserved.
 *
 * Created: 07/05/12
 * Author: ivan
 ******************************************************************************/
package fr.frain.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleObject {

    private static Logger logger = LoggerFactory.getLogger(SimpleObject.class);

    private int value;

    public int getValue() {
        logger.debug("getValue requested !");
        return value;
    }

    public void setValue(int value) {
        logger.debug("setValue requested !");
        this.value = value;
    }

    public String toString(){
        return new String("value = " + value);
    }
}
