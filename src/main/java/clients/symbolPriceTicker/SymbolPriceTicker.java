package clients.symbolPriceTicker;

import constants.Constants;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SymbolPriceTicker {

    public void getSymbolPriceTickerResponse() {

        Response response = given().
                header("X-RapidAPI-Key", Constants.XRAPIDAPIKEY).
                header("X-RapidAPI-Host", Constants.XRAPIDAPIHOST).
                get(Constants.SYMBOLPRICETICKERURL);

        response.prettyPrint();
    }
}
