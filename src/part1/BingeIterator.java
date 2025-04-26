package part1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BingeIterator implements EpisodeIterator {
    private final Iterator<Season> seasonIterator;
    private EpisodeIterator currentSeasonIterator;

    public BingeIterator(Series series) {
        this.seasonIterator = series.getSeasons().iterator();
        if (seasonIterator.hasNext()) {
            currentSeasonIterator = (EpisodeIterator) seasonIterator.next().iterator();
        }
    }

    @Override
    public boolean hasNext() {
        while (currentSeasonIterator != null) {
            if (currentSeasonIterator.hasNext()) {
                return true;
            }
            if (seasonIterator.hasNext()) {
                currentSeasonIterator = (EpisodeIterator) seasonIterator.next().iterator();
            } else {
                currentSeasonIterator = null;
            }
        }
        return false;
    }

    @Override
    public Episode next() {
        if (!hasNext()) throw new NoSuchElementException();
        return currentSeasonIterator.next();
    }
}