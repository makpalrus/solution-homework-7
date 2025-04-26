package part1;

import java.util.ArrayList;
import java.util.List;

class Season {
    private List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode e) {
        episodes.add(e);
    }

    public List<Episode> getEpisodes() { return episodes; }
}