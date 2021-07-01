package job;

import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @author mawei
 * @date 6/23/21
 */
public class SaticScheduleTask {
    /**
     * springboot 的 @Scheduled 注解
     */
    @Scheduled(cron = "0/5 * * * * ?")  //3.添加定时任务
    //@Scheduled(fixedRate=5000)        //或直接指定时间间隔，例如：5秒
    private void configureTasks() {
        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
    }
}
