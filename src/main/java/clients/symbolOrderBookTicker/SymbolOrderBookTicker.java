package clients.symbolOrderBookTicker;

import constants.Constants;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SymbolOrderBookTicker {

    public void getSymbolOrderBookTickerResponse() {

        Response response = given().
                header("X-RapidAPI-Key", Constants.XRAPIDAPIKEY).
                header("X-RapidAPI-Host", Constants.XRAPIDAPIHOST).
                get(Constants.SYMBOLORDERBOOKTICKERURL);

        response.prettyPrint();
    }
}