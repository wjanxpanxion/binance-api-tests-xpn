import clients.Twenty4HrTickerPriceChange.Twenty4HrTicketPriceChange;
import org.testng.annotations.Test;

public class Twenty4hrTickerPriceChangeStatisticsTest {

    @Test
    public void ShouldBeAbleToGet24HrTickerPriceChangeStatisticsResponse(){
        Twenty4HrTicketPriceChange get24HrTicketPriceChangeRequest = new Twenty4HrTicketPriceChange();
        get24HrTicketPriceChangeRequest.get24HrTicketPriceChangeRequest();
    }
}
