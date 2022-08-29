import clients.aggregateTradesList.AggregateTradesList;
import clients.response.AggregateTradesListResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AggregateTradesListTest {

    @Test
    public void ShouldBeAbleToGetAggregateTradesResponse() throws Exception {
        AggregateTradesList getAggregateTradesListRequest = new AggregateTradesList();
        List<AggregateTradesListResponse> responseInListOfPojo = getAggregateTradesListRequest.getAggregateTradesListResponse();

         Assert.assertTrue(responseInListOfPojo.get(0).M);




    }
}
