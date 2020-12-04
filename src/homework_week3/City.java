package homework_week3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.TimeZone;

public class City implements Clock {

    private String name;
    private String cityCode;


    public City(String name, String cityCode,ZonedDateTime now) {
        this.name = name;
        this.cityCode = cityCode;

    }


    @Override
    public void showTime() {
        System.out.println(LocalDateTime.now());
    }

    @Override
    public boolean equals(Object o) {
        City cities = (City) o;
        if(cities.cityCode  ==this.cityCode){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityCode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

}
