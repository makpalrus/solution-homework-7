package part1;

public class StreamingDemo {
    public static void main(String[] args) {
        Series series = createTestSeries();

        System.out.println("Normal order:");
        printEpisodes(new SeasonIterator(series.getSeasons().get(0)));

        System.out.println("\nReverse order:");
        printEpisodes(new ReverseSeasonIterator(series.getSeasons().get(0)));

        System.out.println("\nShuffled order:");
        printEpisodes(new ShuffleSeasonIterator(series.getSeasons().get(0)));

        System.out.println("\nBinge mode (all episodes):");
        printEpisodes(new BingeIterator(series));
    }

    private static void printEpisodes(EpisodeIterator iterator) {
        while (iterator.hasNext()) {
            Episode e = iterator.next();
            System.out.println(e.getTitle() + " (" + e.getRuntimeSec() + "s)");
        }
    }

    private static Series createTestSeries() {
        Series series = new Series();

        Season season1 = new Season();
        season1.addEpisode(new Episode("Pilot", 2400));
        season1.addEpisode(new Episode("Second Episode", 2400));
        series.addSeason(season1);

        Season season2 = new Season();
        season2.addEpisode(new Episode("Season 2 Premiere", 2400));
        season2.addEpisode(new Episode("Season 2 Finale", 2700));
        series.addSeason(season2);

        return series;
    }
}
