package com.mico;

import Game.CardsHeap;
import Game.GameLogic;
import Game.GameRunningState;
import Game.Player;
import com.google.gson.Gson;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author Kenn
 *         Created by Kenn on 2016/6/28.
 */
public class test {

    public GameLogic gameLogic;
    public GameRunningState runningState;
    public Gson gson;


    @Before
    public void before() {
        gameLogic = new GameLogic();
        runningState = new GameRunningState(4);
        gson = new Gson();
    }

    @After
    public void after() {

    }

    @Test
    public void getCardTest() throws InterruptedException {
        CardsHeap cardsHeap = runningState.getCardsHeap();

        while (!cardsHeap.isHeapEmpty()) {

            System.out.println(cardsHeap.getCard());
            cardsHeap.showHeap();
        }
    }

    @Test
    public void initGameTest() {

        for (int i = 0; i < 15; i++) {
            Player player = new Player(i, "Player" + i, "/172.0.0." + i, 100000 * i, new int[]{i, 5, 8, 4, -1}, i);
            runningState.addPlayer(player);
        }

        List<Player> psize = runningState.getPlayerList();
        List<Player> asize = runningState.getAudienceList();

        System.out.println("Player Num: " + psize.size() + "Audience Num: " + asize.size());

        for (Player p1 : psize) {

            String pjs = gson.toJson(p1);
            System.out.println(pjs);
        }

        for (Player p2 : asize) {
            System.out.println(p2.toString());
        }

    }

    @Test
    public void josnCodeTest() {
        String json = "{\"id\":0,\"name\":\"Player0\",\"remoteAddress\":\"/172.0.0.0\",\"coin\":0,\"cards\":[0,5,8,4,10],\"discardNum\":0}";
        Player player = gson.fromJson(json, Player.class);
        System.out.println(player.toString());
    }

    @Test
    public void playGameTest() {
        for (int i = 0; i < 15; i++) {
            Player player = new Player(i, "Player" + i, "/172.0.0." + i);
            runningState.addPlayer(player);
        }

        CardsHeap heap = runningState.getCardsHeap();
        heap.showHeap();
        runningState.dealCards();
        List<Player> list = runningState.getPlayerList();
        for (Player player : list) {
            System.out.println(player.toString());
        }
        heap.showHeap();
    }

}
