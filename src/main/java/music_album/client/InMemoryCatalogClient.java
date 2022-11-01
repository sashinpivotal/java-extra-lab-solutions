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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

class InMemoryCatalogClient {

    private static ICatalog catalog = new InMemoryCatalog();

    public static void main(String[] args) {
        testFindById2();
//        testFindById();
//        testFindByKeyword();
//        testFindByCategory();
//        testTotalNumberOfMusicItems();
//        testGetAll();
//        sortTitlesOfAllPOPMusicItems(); // TODO-14
//        testFindMusicCategoryWithMusicItems();  //TODO-16
    }

    // TODO-01b - write code to test FindById(..) method
    // of the InMemoryCatalog object
    private static void testFindById() {
        MusicItem musicItem = catalog.findById(1L);
        System.out.println(musicItem);
    }

    private static void testFindById2() {
        Collection<MusicItem> all = catalog.getAll();
        all.add(new MusicItem(100L, "Diva", "Annie Lennox", "1992-01-04", 13.99, MusicCategory.POP));
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

    // TODO-14b
    private static void sortTitlesOfAllPOPMusicItems() {
        ArrayList<String> titlesOfAllPOPMusicItems
                = catalog.sortTitlesOfAllPOPMusicItems();
        System.out.println(titlesOfAllPOPMusicItems);
    }

    // TODO-16b
    private static void testFindMusicCategoryWithMusicItems() {
        Map<MusicCategory, Collection<MusicItem>> musicCategoryWithMusicItems
                = catalog.findMusicCategoryWithMusicItems();

        for (var item : musicCategoryWithMusicItems.entrySet()) {
            MusicCategory key = item.getKey();
            System.out.println("-------------" + key);
            System.out.println(item.getValue());
        }
    }
}