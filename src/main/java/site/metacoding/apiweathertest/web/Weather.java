package site.metacoding.apiweathertest.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Weather {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String tm; //예보시각

        @Column(length = 300, nullable = false)
        private String thema; //테마    
    
        @Column(length = 100, nullable = false)
        private String courseId; //코스id
    
            @Column(length = 100, nullable = false)
            private String courseAreaId; //코스_지역아이디
       
            @Column(length = 300, nullable = false)
            private String courseAreaName; //코스_지역이름
   
       @Column(length = 300, nullable = false)
       private String courseName; //코스명
   
       private int spotAreaId; //관광지_지역아이디
   
           @Column(length = 300, nullable = false)
           private String spotAreaName; //관광지_지역이름
           
        @Column(length = 300, nullable = false)
        private String spotName; //관광지명
            
    private int th3; //일 3시간 기온
    private int wd; //풍향
    private int ws;  //풍속
    private int sky;  //하늘상태
    private int rhm;  //습도
    private int pop; //강수확률
}
