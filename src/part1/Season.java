package part1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Season implements Iterable<Episode> {
    private List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode e) {
        episodes.add(e);
    }
    public List<Episode> getEpisodes() {
        return episodes;
    }
    @Override
    public Iterator<Episode> iterator() {
        return new SeasonIterator(this);
    }
    public Iterator<Episode> reverseIterator() {
        return new ReverseSeasonIterator(this);
    }

    public Iterator<Episode> shuffleIterator() {
        return new ShuffleSeasonIterator(this);
    }
}