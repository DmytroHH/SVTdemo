package com.demo.step_definitions;

import com.demo.pojo.Robot;
import com.demo.utilities.ConfigurationReader;
import com.demo.utilities.RobotsUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class ApiGetRobotsValuesVerify {
    Response response;
    @When("Get response from robots endpoint")
    public void get_payload_from_endpoint() {
         response = given().accept(ContentType.JSON)
                .when().get(ConfigurationReader.getProperty("base_url"));
    }
    @And("Status code is {int}")
    public void statusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode,response.statusCode());
        response.then().statusCode(statusCode);
    }



    @Then("All robotId's should be between {int} and {int}")
    public void allRobotIdSShouldBeBetweenAnd(int minID, int maxID) {
        for (Robot robot : RobotsUtils.getRobotsAsList()) {
            Assert.assertTrue(robot.getId()>=minID&&robot.getId()<=maxID);
        }
    }

    @Then("batteryLevel should be between {int} and {int}")
    public void batterylevelShouldBeBetweenAnd(int minBattery, int maxBattery) {
        for (Robot robot : RobotsUtils.getRobotsAsList()) {
            Assert.assertTrue(robot.getBatteryLevel()>=minBattery&&robot.getBatteryLevel()<=maxBattery);
        }
    }

    @Then("coordinates should be between {int} and {int}")
    public void coordinatesShouldBeBetweenAnd(int minX, int maxX) {
        for (Robot robot : RobotsUtils.getRobotsAsList()) {
            Assert.assertTrue(robot.getBatteryLevel()>=minX&&robot.getBatteryLevel()<=maxX);
        }
    }
}
