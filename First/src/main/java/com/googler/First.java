package com.googler;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : ♞Demons♛
 * @date : 2020-05-10 15:35
 * Description :
 **/
public class First {

    private static final Logger logger = LoggerFactory.getLogger(First.class);

    public static void main(String[] args) throws Exception {
        while (true) {
            logger.info("Are you ok?");
            logger.warn("Are you ok?");
            logger.error("Are you ok?");
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", "gradle");
            logger.info("This is fastjson:{}", jsonObject);
            Thread.sleep(2000L);
        }
    }
}
