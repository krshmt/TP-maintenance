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

    movie.setPriceCode(Movie.CHILDRENS);
    assertEquals(Movie.CHILDRENS, movie.getPriceCode());

    movie.setPriceCode(Movie.REGULAR);
    assertEquals(Movie.REGULAR, movie.getPriceCode());
  }

  @Test
  public void testGetTitle() {
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    assertEquals("The Matrix", movie.getTitle());
  }

  @Test
  public void testGetPriceCodeForRegularMovie() {
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    assertEquals(Movie.REGULAR, movie.getPriceCode());
  }

  @Test
  public void testGetPriceCodeForNewReleaseMovie() {
    Movie movie = new Movie("Inception", Movie.NEW_RELEASE);
    assertEquals(Movie.NEW_RELEASE, movie.getPriceCode());
  }

  @Test
  public void testGetPriceCodeForChildrensMovie() {
    Movie movie = new Movie("Toy Story", Movie.CHILDRENS);
    assertEquals(Movie.CHILDRENS, movie.getPriceCode());
  }
}