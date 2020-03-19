package springdemoannotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	
	private  FortuneService fortuneservice;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneservice=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backend volley";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
	

}
