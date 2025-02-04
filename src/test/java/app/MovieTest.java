package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

  @Test
  public void testConstructorAndGetters() {
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    assertEquals("The Matrix", movie.getTitle());
    assertEquals(Movie.REGULAR, movie.getPriceCode());
  }

  @Test
  public void testSetPriceCode() {
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    movie.setPriceCode(Movie.NEW_RELEASE);
    assertEquals(Movie.NEW_RELEASE, movie.getPriceCode());
  }

  @Test
  public void testGetTitle() {
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    assertEquals("The Matrix", movie.getTitle());
  }
}