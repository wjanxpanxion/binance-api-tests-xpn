import clients.symbolOrderBookTicker.SymbolOrderBookTicker;
import org.testng.annotations.Test;

public class SymbolOrderBookTickerTest {

    @Test
    public void ShouldBeAbletoGetSymbolOrderBookTickerResponse(){
        SymbolOrderBookTicker getSymbolOrderBookTickerRequest = new SymbolOrderBookTicker();
        getSymbolOrderBookTickerRequest.getSymbolOrderBookTickerResponse();
    }
}
