package clients.Twenty4HrTickerPriceChange;

import constants.Constants;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Twenty4HrTicketPriceChange {

    public void get24HrTicketPriceChangeRequest(){

    Response response= given().
                header("X-RapidAPI-Key", Constants.XRAPIDAPIKEY).
                header("X-RapidAPI-Host", Constants.XRAPIDAPIHOST).
                contentType(ContentType.JSON).
                get(Constants.TWENTY4HRTICKERPRICECHANGEURL);

        response.prettyPrint();

    }
}
