package music_album;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {

    private InMemoryCatalog inMemoryCatalog;
    private MusicItem expectedMusicItem;

    @Before
    public void setUp() throws Exception {
        // arrange
        // - what is test target object?
        // - you have to create an object instance of that test target
        inMemoryCatalog = new InMemoryCatalog();

        expectedMusicItem = new MusicItem(1L,
        "Diva",
        "Annie Lennox",
        "1992-01-04",
        13.99,
        MusicCategory.POP);
    }

    @Test
    public void findById() {

        // act
        // - what is test target method?
        // - call test target method with proper input values
        // - it returns something, which is actual
        MusicItem actualMusicItem = inMemoryCatalog.findById(1L);

        // assert
        // - create an expected value - expected MusicItem object
        // - compare expected value with the actual
        Assert.assertEquals(expectedMusicItem, actualMusicItem);
    }

    @Test
    public void findByKeyword() {

        // act
        // - call your test target method with test argument values
        Collection<MusicItem> actualMusicItems = inMemoryCatalog.findByKeyword("Diva");

        // assert
        // - create expected value or object
        // - assert to compare actual against expected
        ArrayList<MusicItem> expectedMusicItems = new ArrayList<>();
        expectedMusicItems.add(expectedMusicItem);
        Assert.assertEquals(expectedMusicItems, actualMusicItems);
    }
}