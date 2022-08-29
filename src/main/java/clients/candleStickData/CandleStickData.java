package clients.candleStickData;

import constants.Constants;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CandleStickData {


    public void getCandstickdataResponse() {

        Response response = given().
                header("X-RapidAPI-Key", Constants.XRAPIDAPIKEY).
                header("X-RapidAPI-Host", Constants.XRAPIDAPIHOST).
                queryParam("symbol", Constants.symbolValue).
                queryParam("limit", Constants.limitValue).
                queryParam("interval", Constants.intervalValue).
                contentType(ContentType.JSON).
                get(Constants.CANDLESTICKDATAURL);

        response.prettyPrint();
    }
}
