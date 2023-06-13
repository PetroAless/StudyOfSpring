package com.example.myTaskScheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTask {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTask.class);
    private static final SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 4000)
    public void CurrentTime(){
        logger.info("\n\n THE TIME IS NOW !! \n",sd.format(new Date()));

    }
}
