package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("qwe", 1962);
        MusicBand band2 = new MusicBand("asd", 1892);
        MusicBand band3 = new MusicBand("zxc", 2002);
        MusicBand band4 = new MusicBand("rty", 2018);
        MusicBand band5 = new MusicBand("fgh", 1960);
        MusicBand band6 = new MusicBand("vbn", 2010);
        MusicBand band7 = new MusicBand("uio", 2016);
        MusicBand band8 = new MusicBand("jkl", 1987);
        MusicBand band9 = new MusicBand("poi", 1967);
        MusicBand band10 = new MusicBand("lkj", 1988);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        System.out.println(groupsAfter2000(musicBands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandList = new ArrayList<>();
        for (MusicBand mb : bands) {
            if (mb.getYear() >= 2000) {
                bandList.add(mb);
            }
        }
        return bandList;
    }

}
