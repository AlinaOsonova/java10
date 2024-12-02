import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {


    @Test
    public void test() {
        FilmManager manager = new FilmManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test1() {
        FilmManager manager = new FilmManager();
        manager.addFilm("film1");
        String[] expected = {"film1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        FilmManager manager = new FilmManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        String[] expected = {"film1", "film2", "film3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test4() {
        FilmManager manager = new FilmManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        String[] expected = {"film3", "film2", "film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test5() {
        FilmManager manager = new FilmManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        String[] expected = {"film1", "film2", "film3", "film4", "film5",};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test6() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        String[] expected = {"film7", "film6", "film5", "film4", "film3",};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test7() {
        FilmManager manager = new FilmManager(3);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        String[] expected = {"film5", "film4", "film3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}