package tests.four;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.is;

public class BookStoreAPITests {

    @Test
    void bookStoreTest1() {
        get("https://demoqa.com/BookStore/v1/Books")
                .then()
                .body("books[0].title", is("Git Pocket Guide"));
    }

    @Test
    void bookStoreTest2() {
        get("https://demoqa.com/BookStore/v1/Books")
                .then()
                .body("books[2].title", is("Designing Evolvable Web APIs with ASP.NET"));
    }
}
