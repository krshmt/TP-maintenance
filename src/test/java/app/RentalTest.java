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

  @Test
  public void testGetChargeForRegularMovie() {
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    Rental rental = new Rental(movie, 1);
    assertEquals(2.0, rental.getCharge(), 0.001);

    rental = new Rental(movie, 3);
    assertEquals(3.5, rental.getCharge(), 0.001);
  }

  @Test
  public void testGetChargeForNewReleaseMovie() {
    Movie movie = new Movie("Inception", Movie.NEW_RELEASE);
    Rental rental = new Rental(movie, 1);
    assertEquals(3.0, rental.getCharge(), 0.001);

    rental = new Rental(movie, 3);
    assertEquals(9.0, rental.getCharge(), 0.001);
  }

  @Test
  public void testGetChargeForChildrensMovie() {
    Movie movie = new Movie("Toy Story", Movie.CHILDRENS);
    Rental rental = new Rental(movie, 2);
    assertEquals(1.5, rental.getCharge(), 0.001);

    rental = new Rental(movie, 4);
    assertEquals(3.0, rental.getCharge(), 0.001);
  }

  @Test
  public void testGetFrequentRenterPointsForRegularMovie() {
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    Rental rental = new Rental(movie, 1);
    assertEquals(1, rental.getFrequentRenterPoints());

    rental = new Rental(movie, 3);
    assertEquals(1, rental.getFrequentRenterPoints());
  }

  @Test
  public void testGetFrequentRenterPointsForNewReleaseMovie() {
    Movie movie = new Movie("Inception", Movie.NEW_RELEASE);
    Rental rental = new Rental(movie, 1);
    assertEquals(1, rental.getFrequentRenterPoints());

    rental = new Rental(movie, 3);
    assertEquals(2, rental.getFrequentRenterPoints());
  }

  @Test
  public void testGetFrequentRenterPointsForChildrensMovie() {
    Movie movie = new Movie("Toy Story", Movie.CHILDRENS);
    Rental rental = new Rental(movie, 2);
    assertEquals(1, rental.getFrequentRenterPoints());

    rental = new Rental(movie, 4);
    assertEquals(1, rental.getFrequentRenterPoints());
  }
}