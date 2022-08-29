package clients.currentAveragePrice;

import constants.Constants;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CurrentAveragePrice {


    public void getCurrentAveragePriceResponse() {

        Response response = given().
                header("X-RapidAPI-Key", Constants.XRAPIDAPIKEY).
                header("X-RapidAPI-Host", Constants.XRAPIDAPIHOST).
                queryParam("symbol", Constants.symbolValue).
                get(Constants.CURRENTAVERAGEPRICEURL);

        response.prettyPrint();
    }


}
