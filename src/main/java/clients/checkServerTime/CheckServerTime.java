package clients.checkServerTime;

import constants.Constants;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CheckServerTime {

    public void getCheckServerTimeResponse() {

        Response response = given().
                header("X-RapidAPI-Key", Constants.XRAPIDAPIKEY).
                header("X-RapidAPI-Host", Constants.XRAPIDAPIHOST).
                contentType(ContentType.JSON).
                get(Constants.CHECKSERVERTIMEURL);

        response.prettyPrint();

    }
}
