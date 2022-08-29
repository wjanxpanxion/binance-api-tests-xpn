import clients.symbolOrderBookTicker.SymbolOrderBookTicker;
import org.testng.annotations.Test;

public class SymbolPriceTickerTest {

    @Test
    public void ShouldBeAbleToGetSymbolPriceTickerResponse(){
        SymbolOrderBookTicker getSymbolOrderBookTickerRequest = new SymbolOrderBookTicker();
        getSymbolOrderBookTickerRequest.getSymbolOrderBookTickerResponse();
    }
}
