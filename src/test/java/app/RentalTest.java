package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RentalTest {

  @Test
  public void testConstructorAndGetters() {
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    Rental rental = new Rental(movie, 5);
    assertEquals(5, rental.getDaysRented());
    assertEquals(movie, rental.getMovie());
  }

  @Test
  public void testGetDaysRented() {
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    Rental rental = new Rental(movie, 3);
    assertEquals(3, rental.getDaysRented());
  }

  @Test
  public void testGetMovie() {
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    Rental rental = new Rental(movie, 7);
    assertEquals(movie, rental.getMovie());
  }
}