package com.stanley.songr;

import com.stanley.songr.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.StringTokenizer;

@Controller
public class Controllers {


    @GetMapping("/Hello")
    public String getHello() {
        return "hello.html";

    }

    @GetMapping("/Hello/{capitalize}")
    @ResponseBody
    public String hello(@PathVariable String capitalize) {
        return capitalize.toUpperCase();
    }

    @GetMapping("/albums")

        public String showAlbumModel(Model model){
        ArrayList<Album> albumArray = new ArrayList<>(3);
            Album firstAlbum = new Album("Man on the moon", "Kid Cudi", 19, 3513,"https://en.wikipedia.org/wiki/Man_on_the_Moon:_The_End_of_Day");
            Album secondAlbum = new Album("East Atlanta Love Letter", "6LACK", 14, 2873, "https://en.wikipedia.org/wiki/East_Atlanta_Love_Letter");
            Album thirdAlbum = new Album("To Pimp a Butterfly", "Kendrick Lamar", 16, 4731, "https://www.google.com/imgres?imgurl=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fen%2Ff%2Ff6%2FKendrick_Lamar_-_To_Pimp_a_Butterfly.png&imgrefurl=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FTo_Pimp_a_Butterfly&tbnid=rIK9nfRys1dXOM&vet=12ahUKEwjC1_O9rO35AhV6nGoFHZkSBw8QMygAegQIARBC..i&docid=iZDwwTxlP9h77M&w=300&h=300&q=to%20pimp%20a%20butterfly%20runtime&hl=en&ved=2ahUKEwjC1_O9rO35AhV6nGoFHZkSBw8QMygAegQIARBC");
            albumArray.add(firstAlbum);
            albumArray.add(secondAlbum);
            albumArray.add(thirdAlbum);

        model.addAttribute("albums", albumArray);
        return "albums.html";
        }


}