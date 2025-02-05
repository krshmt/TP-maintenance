package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

  @Test
  public void testConstructorAndGetName() {
    Customer customer = new Customer("John Doe");
    assertEquals("John Doe", customer.getName());
  }

  @Test
  public void testAddRental() {
    Customer customer = new Customer("John Doe");
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    Rental rental = new Rental(movie, 3);
    customer.addRental(rental);
    String expectedStatement = "Rental Record for John Doe\n" +
        "\tThe Matrix\t3.5\n" +
        "Amount owed is 3.5\n" +
        "You earned 1 frequent renter points";
    assertEquals(expectedStatement, customer.statement());
  }

  @Test
  public void testStatementForRegularMovie() {
      Customer customer = new Customer("John Doe");
      Movie movie = new Movie("The Matrix", Movie.REGULAR);
      Rental rental = new Rental(movie, 3);
      customer.addRental(rental);
      String expectedStatement = "Rental Record for John Doe\n" +
          "\tThe Matrix\t3.5\n" +
          "Amount owed is 3.5\n" +
          "You earned 1 frequent renter points";
      assertEquals(expectedStatement, customer.statement());
  }

  @Test
  public void testStatementForNewReleaseMovie() {
      Customer customer = new Customer("John Doe");
      Movie movie = new Movie("Inception", Movie.NEW_RELEASE);
      Rental rental = new Rental(movie, 2);
      customer.addRental(rental);
      String expectedStatement = "Rental Record for John Doe\n" +
          "\tInception\t6.0\n" +
          "Amount owed is 6.0\n" +
          "You earned 2 frequent renter points";
      assertEquals(expectedStatement, customer.statement());
  }

  @Test
  public void testStatementForChildrensMovie() {
      Customer customer = new Customer("John Doe");
      Movie movie = new Movie("Toy Story", Movie.CHILDRENS);
      Rental rental = new Rental(movie, 4);
      customer.addRental(rental);
      String expectedStatement = "Rental Record for John Doe\n" +
          "\tToy Story\t3.0\n" +
          "Amount owed is 3.0\n" +
          "You earned 1 frequent renter points";
      assertEquals(expectedStatement, customer.statement());
  }

  @Test
  public void testStatementForMultipleRentals() {
      Customer customer = new Customer("John Doe");
      Movie movie1 = new Movie("The Matrix", Movie.REGULAR);
      Movie movie2 = new Movie("Inception", Movie.NEW_RELEASE);
      Movie movie3 = new Movie("Toy Story", Movie.CHILDRENS);
      Rental rental1 = new Rental(movie1, 3);
      Rental rental2 = new Rental(movie2, 2);
      Rental rental3 = new Rental(movie3, 4);
      customer.addRental(rental1);
      customer.addRental(rental2);
      customer.addRental(rental3);
      String expectedStatement = "Rental Record for John Doe\n" +
          "\tThe Matrix\t3.5\n" +
          "\tInception\t6.0\n" +
          "\tToy Story\t3.0\n" +
          "Amount owed is 12.5\n" +
          "You earned 4 frequent renter points";
      assertEquals(expectedStatement, customer.statement());
  }

  @Test
  public void testStatementForNewReleaseMovieWithMoreThanOneDay() {
      Customer customer = new Customer("John Doe");
      Movie movie = new Movie("Inception", Movie.NEW_RELEASE);
      Rental rental = new Rental(movie, 1);
      customer.addRental(rental);
      String expectedStatement = "Rental Record for John Doe\n" +
          "\tInception\t3.0\n" +
          "Amount owed is 3.0\n" +
          "You earned 1 frequent renter points";
      assertEquals(expectedStatement, customer.statement());
  }

  @Test
  public void testStatementForChildrensMovieWithMoreThanThreeDays() {
      Customer customer = new Customer("John Doe");
      Movie movie = new Movie("Toy Story", Movie.CHILDRENS);
      Rental rental = new Rental(movie, 3);
      customer.addRental(rental);
      String expectedStatement = "Rental Record for John Doe\n" +
          "\tToy Story\t1.5\n" +
          "Amount owed is 1.5\n" +
          "You earned 1 frequent renter points";
      assertEquals(expectedStatement, customer.statement());
  }
}