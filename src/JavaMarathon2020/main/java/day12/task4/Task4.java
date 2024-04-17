package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("qwe");
        members1.add("asd");
        members1.add("zxc");

        MusicBand band1 = new MusicBand("111", 1980, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("rty");
        members2.add("fgh");
        members2.add("vbn");

        MusicBand band2 = new MusicBand("222", 1970, members2);

        band1.printM();
        band2.printM();

        MusicBand.transferMembers(band1, band2);

        band1.printM();
        band2.printM();

    }
}
