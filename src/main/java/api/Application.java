package api;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.StopWatch;


/**
 * Created by cj on 2018/9/12.
 */
@SpringBootApplication
@EnableTransactionManagement
public class Application {

    public static void main(String[] args) {

        StopWatch watch = new StopWatch();

        watch.start();
        SpringApplication.run(Application.class, args);
        watch.stop();

        System.out.println(String.format("启动花费：%s s",watch.getTotalTimeSeconds()));
    }

//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
}
