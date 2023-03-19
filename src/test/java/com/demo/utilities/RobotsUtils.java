package com.demo.utilities;

import com.demo.pojo.Robot;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RobotsUtils {
    public static List<Robot> getRobotsAsList(){
        Response response = given().accept(ContentType.JSON)
                .when().get(ConfigurationReader.getProperty("base_url"));
        JsonPath jsonPath = response.jsonPath();

         List<Robot> robots = jsonPath.getList("", Robot.class);

        return robots;
    }
}
