import clients.currentAveragePrice.CurrentAveragePrice;
import org.testng.annotations.Test;

public class CurrentAveragePriceTest {

    @Test
    public void ShouldBeAbleToGetCurrentAveragePriceResponse(){
        CurrentAveragePrice getCurrentAveragePriceRequest = new CurrentAveragePrice();
        getCurrentAveragePriceRequest.getCurrentAveragePriceResponse();
    }
}
