package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("qwe", 20));
        members1.add(new MusicArtist("asd", 23));
        members1.add(new MusicArtist("zxc", 22));

        MusicBand band1 = new MusicBand("111", 1999, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("rty", 40));
        members2.add(new MusicArtist("fgh", 43));
        members2.add(new MusicArtist("vbn", 42));

        MusicBand band2 = new MusicBand("222", 1990, members2);

        band1.printM();
        band2.printM();

        MusicBand.transferMembers(band1, band2);

        band1.printM();
        band2.printM();
    }
}
