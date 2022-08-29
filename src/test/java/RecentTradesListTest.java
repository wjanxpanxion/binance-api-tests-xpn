import clients.recentTradesList.RecentTradesList;
import org.testng.annotations.Test;

public class RecentTradesListTest {

    @Test
    public void ShouldBeAbleToGetRecentTradesResponse(){
        RecentTradesList getRecentTradesListRequest = new RecentTradesList();
        getRecentTradesListRequest.getRecentTradesListResponse();;
    }
}
