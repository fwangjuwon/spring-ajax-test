package site.metacoding.apiweathertest.web;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WeatherDto {
    private String tm; //예보시각
    private String courseAreaName;  //코스_지역이름
    private String courseName; //코스명
    private String spotAreaName;  //관광지_지역이름
    private String spotName;  //관광지명
    private int sky;  //하늘상태
    private int pop; //강수확률
    
    public Weather toEntity(Weather weather) {
        Weather weathers = new Weather();

        weather.setTm(tm);
        weather.setCourseAreaName(courseAreaName);
        weather.setCourseName(courseName);
        weather.setSpotAreaName(spotAreaName);
        weather.setSpotName(spotName);
        weather.setSky(sky);
        weather.setPop(pop);
       
        return weathers;
    }
}