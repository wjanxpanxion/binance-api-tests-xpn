import clients.orderBook.OrderBook;
import org.testng.annotations.Test;

public class OrderBookTest {

    @Test
    public void ShouldBeAbleToGetOrderBookResponse(){
        OrderBook getOrderBookRequest = new OrderBook();
        getOrderBookRequest.getOrderBookResponse();
    }
}
