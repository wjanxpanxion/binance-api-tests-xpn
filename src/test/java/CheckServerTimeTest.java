import clients.checkServerTime.CheckServerTime;
import org.testng.annotations.Test;

public class CheckServerTimeTest {


    @Test
    public void ShouldBeAbleToGetCheckServerTimeResponse(){
        CheckServerTime getCheckServerTimeRequest = new CheckServerTime();
        getCheckServerTimeRequest.getCheckServerTimeResponse();
    }
}
