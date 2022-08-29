package clients.orderBook;

import constants.Constants;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class OrderBook {

    public void getOrderBookResponse() {

        Response response = given().
                header("X-RapidAPI-Key", Constants.XRAPIDAPIKEY).
                header("X-RapidAPI-Host", Constants.XRAPIDAPIHOST).
                queryParam("symbol", Constants.symbolValue).
                get(Constants.ORDERBOOKURL);

        response.prettyPrint();
    }
}
