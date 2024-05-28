package com.testing.Junit.Tdd;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private  List<String> players = new ArrayList<>();

    public Players() {
        players.add("mosa");
        players.add("messi");
        players.add("ronaldo");
    }

     String getPlayer(String name){
        return players.stream().filter(playerName-> playerName.equals(name)).findFirst().orElseGet(()->"saif");
    }


}
