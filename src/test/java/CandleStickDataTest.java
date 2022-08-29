import clients.candleStickData.CandleStickData;
import org.testng.annotations.Test;

public class CandleStickDataTest {


    @Test
    public void ShouldBeAbleToGetCandleStickDataResponse(){
        CandleStickData getCandleStickDataRequest = new CandleStickData();
        getCandleStickDataRequest.getCandstickdataResponse();

    }
}
