import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
        //SpeakerService speakerService = new SpeakerServiceImpl();

        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
