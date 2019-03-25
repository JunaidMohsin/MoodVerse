package com.example.MoodVerse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

public class YoutubeKeyController {

    public String keyExtract(RestTemplate restTemplate, String omdbId){
    String link = "null";
    JsonObject youtube = restTemplate.getForObject("http://api.themoviedb.org/3/movie/" + omdbId + "/videos?api_key=5aaf255316a4c105a15a3e69435a761e", JsonObject.class );

    if(youtube != null){
        link = "https://www.youtube.com/embed/"+youtube.getResults().get(0).getKey();
        System.out.println(link);
    }
return link;
}


}
