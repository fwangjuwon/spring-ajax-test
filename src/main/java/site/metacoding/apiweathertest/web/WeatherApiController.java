package site.metacoding.apiweathertest.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherApiController {

    @RequestMapping(value = "/apitest", method = RequestMethod.GET, produces = "application/json; charset=UTF8")
    public String weather() {

        StringBuffer sb = new StringBuffer();
        try {
            String urlstr = "http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?" +
                    "serviceKey=vw%2B%2BqXlNQbiDoQvLCzwd8Oc383avr%2B%2BJ9gEdiBTAG5xFPofE%2BWtxwzeAxL1eSi7HPHciJy7crzQgQ2RqRc10gw%3D%3D"
                    +
                    "&pageNo=1" +
                    "&numOfRows=10" +
                    "&dataType=json" +
                    "&CURRENT_DATE=2019122010" +
                    "&HOUR=24" +
                    "&COURSE_ID=1";

            URL url = new URL(urlstr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

                       String returnLine;


            while ((returnLine = br.readLine()) != null) {
                sb.append(returnLine);
            }
            conn.disconnect();
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
                    return sb.toString();
    }
}