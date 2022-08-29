package clients.recentTradesList;

import constants.Constants;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RecentTradesList {

    public void getRecentTradesListResponse(){

    Response response= given().
                header("X-RapidAPI-Key", Constants.XRAPIDAPIKEY).
                header("X-RapidAPI-Host", Constants.XRAPIDAPIHOST).
            queryParam("symbol", Constants.symbolValue).
            queryParam("limit", Constants.limitValue).
                get(Constants.RECENTRADELISTURL);

        response.prettyPrint();
    }
}
