package finalmission.cake.controller;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.jupiter.api.Assertions.*;

import finalmission.cake.dto.BasicCakeResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CakeControllerTest {

    @LocalServerPort
    int port;

    @BeforeEach
    void setUp() {
        RestAssured.port = port;
    }

    @Test
    void findAllCakeTest() {
        Response response = RestAssured.given().log().all()
                .when().get("/cakes")
                .then()
                .extract().response();
//        response.body().prettyPrint();\
    }

    @Test
    void findCakeDetailsTest() {
        Response response = RestAssured.given().log().all()
                .when().get("/cakes/detail")
                .then()
                .extract().response();
//        response.body().prettyPrint();
    }

    @Test
    void findAvailableTimeByDateTest() {
        Response response = RestAssured.given().log().all()
                .param("date", "2025.06.21")
                .when().get("/cakes/1")
                .then()
                .extract().response();

        response.body().prettyPrint();
    }
}