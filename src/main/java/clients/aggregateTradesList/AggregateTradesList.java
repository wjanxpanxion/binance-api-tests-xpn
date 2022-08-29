package clients.aggregateTradesList;

import clients.response.AggregateTradesListResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import constants.Constants;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static io.restassured.RestAssured.given;

public class AggregateTradesList {

    public List<AggregateTradesListResponse> getAggregateTradesListResponse() throws Exception {

        Response response = given()             //*1- the 'response' that we'll get will be in a form of object of type Response
                .contentType(ContentType.JSON)
//                header("X-RapidAPI-Key", "a03e54e5f8mshf0834aa7a86d219p110954jsn5d64f795e2c8"). //moved to Constants class
//                header("X-RapidAPI-Host", "binance43.p.rapidapi.com"). //moved to Constants class
                .header("X-RapidAPI-Key", Constants.XRAPIDAPIKEY)
                .header("X-RapidAPI-Host", Constants.XRAPIDAPIHOST)
                .queryParam("symbol", Constants.symbolValue)
                .queryParam("limit", Constants.limitValue)
//               get("https://binance43.p.rapidapi.com/aggTrades"); //moved to Constants class
                .get(Constants.AGGREGATETRADESLISTURL);


        if (response.statusCode() != 200){
            throw new Exception("Status Code is not matching");
        }
                                            //*2- the above 'response' we have to convert to POJO class using following steps
        Gson gson = new Gson();
//        Type aggregateTradeListType = new TypeToken< Collection <AggregateTradesListResponse> >() {}.getType();
                                     //                                    <POJO class Name>
        response.prettyPrint();

        List <AggregateTradesListResponse> aggregateTrades = gson.fromJson(  response.asString(), new TypeToken< Collection <AggregateTradesListResponse> >() {}.getType());
         //                                                //gson.fromJson( 1st argument converts 'response' from API to String,
        //                                                  map the response to a POJO class AggregateTradesListResponse )

        //to access the specific key value within the response we'll convert the response to POJO class

        return aggregateTrades;


        /*
    [                                               indicates List
    {                                               indicates 1st JSON object within a List
        "a": 308790044,
        "p": "0.07098000",
        "q": "1.72690000",
        "f": 361366463,
        "l": 361366463,
        "T": 1659545229871,
        "m": false,
        "M": true
    },
    {                                               indicates 2nd JSON object within a List
        "a": 308790045,
        "p": "0.07099000",
        "q": "1.13480000",
        "f": 361366464,
        "l": 361366466,
        "T": 1659545230419,
        "m": false,
        "M": true
    }
]
         */




        //DO we do all the coding here and in test package just call?
    }
}
