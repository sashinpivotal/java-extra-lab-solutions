package music_album;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {

    @Test
    public void findById() {

        // arrange
        // - what is test target object?
        // - you have to create an object instance of that test target
        InMemoryCatalog inMemoryCatalog = new InMemoryCatalog();

        // act
        // - what is test target method?
        // - call test target method with proper input values
        // - it returns something, which is actual
        MusicItem actualMusicItem = inMemoryCatalog.findById(1L);

        // assert
        // - create an expected value - expected MusicItem object
        // - compare expected value with the actual
        MusicItem expectedMusicItem
                = new MusicItem(1L,
                "Diva",
                "Annie Lennox",
                "1992-01-04",
                13.99,
                MusicCategory.POP);
        Assert.assertEquals(expectedMusicItem, actualMusicItem);
    }

    @Test
    public void findByKeyword() {
    }
}