/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package music_album;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public interface ICatalog {

    /**
     * Returns the item with the given id,
     * or null if not found.
     */
    public MusicItem findById(Long id);

    /**
     * Returns a collection of items that
     * match the supplied keyword.
     * This is basically a search method.
     *
     * A match is defined as any item whose title or
     * artist contains the keyword.
     * Searches are to be case-insensitive.
     *
     * A no-matches result should return an
     * empty collection (not null).
     */
    public Collection<MusicItem> findByKeyword(String keyword);

    /**
     * Returns a collection of items that are of
     * the supplied genre (category).
     */
    public Collection<MusicItem> findByCategory(MusicCategory category);

    /**
     * Size of the catalog.
     */
    public int totalNumberOfMusicItems();

    /**
     * Read-only view of the entire catalog.
     * See java.util.Collections class
     * (an all-static utility class) for help here.
     */
    public Collection<MusicItem> getAll();

    // TODO-14
    public ArrayList<String> sortTitlesOfAllPOPMusicItems();

    // TODO-16
    public Map<MusicCategory, Collection<MusicItem>> findMusicCategoryWithMusicItems();
}