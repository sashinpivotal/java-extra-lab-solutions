/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package music_album.client;

import music_album.ICatalog;
import music_album.InMemoryCatalog;
import music_album.MusicCategory;
import music_album.MusicItem;

import java.util.Collection;

class InMemoryCatalogClient {

    private static ICatalog catalog = new InMemoryCatalog();

    public static void main(String[] args) {
         testFindById();
         testFindByKeyword();
         testFindByCategory();
         testTotalNumberOfMusicItems();
         testGetAll();
    }

    // TODO-01b - write code to test FindById(..) method
    // of the InMemoryCatalog object
    private static void testFindById() {
        MusicItem musicItem = catalog.findById(1L);
        System.out.println(musicItem);
    }

    // TODO-02b - write code
    private static void testFindByKeyword() {
        Collection<MusicItem> musicItems1 = catalog.findByKeyword("Sting");
        System.out.println(musicItems1);
        Collection<MusicItem> musicItems2 = catalog.findByKeyword("198");
        System.out.println(musicItems2);
    }

    // TODO-03b - write code
    private static void testFindByCategory() {
        Collection<MusicItem> musicItems = catalog.findByCategory(MusicCategory.POP);
        System.out.println(musicItems);
    }

    // TODO-04b - write code
    private static void testTotalNumberOfMusicItems() {
        int totalNumberOfMusicItems = catalog.totalNumberOfMusicItems();
        System.out.println("Total number of music items = " + totalNumberOfMusicItems);
    }

    // TODO-05b - write code
    private static void testGetAll() {
        Collection<MusicItem> musicItems = catalog.getAll();
        System.out.println(musicItems.size());
    }
}