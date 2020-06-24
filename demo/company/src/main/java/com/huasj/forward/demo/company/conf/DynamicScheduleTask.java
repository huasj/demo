package com.huasj.forward.demo.company.conf;

import com.alibaba.druid.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

@Component
@Configuration      //1、主要用于标记配置类，兼备Component的效果。
@EnableScheduling   //2、开启定时任务
public class DynamicScheduleTask implements SchedulingConfigurer {

    private static final Logger logger = LoggerFactory.getLogger(DynamicScheduleTask.class);

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        try {
            scheduledTaskRegistrar.addTriggerTask(
                    //1.添加任务内容(Runnable)
                    () -> pushInfo(),
                    //2.设置执行周期(Trigger)
                    triggerContext -> {
                        //2.1 合法性校验.
                        if (StringUtils.isEmpty(null)) {
                            // Omitted Code ..
                        }
                        //2.2 返回执行周期(Date)
                        return new CronTrigger(" 0 */1 * * * ? " ).nextExecutionTime(triggerContext);
                    }
            );
        } catch (Exception ex) {
            logger.info("there is an error!");
        }
    }

    public void pushInfo() {
        try {

        } catch (Exception ex) {

        }
    }
}
