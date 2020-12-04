package homework_week3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        Set<City> cities = new HashSet();

        City Moscow = new City("Moscow","MOS",ZonedDateTime.now( ZoneId.of("GMT+00:00")));
        City NewYork = new City("NewYork","NYC", ZonedDateTime.now( ZoneId.of("GMT-03:00")));
        City London = new City("London","LON",ZonedDateTime.now( ZoneId.of("GMT-08:00")));
        City Berlin = new City("Berlin","BER",ZonedDateTime.now( ZoneId.of("GMT-02:00")));
        City NewDelhi = new City("NewDelhi","NDL",ZonedDateTime.now( ZoneId.of("GMT+02:30")));


      cities.add(Moscow);
      cities.add(NewYork);
      cities.add(London);
      cities.add(Berlin);
      cities.add(NewDelhi);

        System.out.println(cities);
    }


}
