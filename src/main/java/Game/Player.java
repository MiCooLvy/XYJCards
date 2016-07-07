package Game;

import java.util.Arrays;

/**
 * 玩家类
 *
 * @author Kenn
 *         Created by Kenn on 2016/6/28.
 */
public class Player {

    private int id;
    private String name;
    private String remoteAddress;
    private long coin;
    private int[] cards;
    private int discardNum;


    public Player() {
    }

    public Player(int id, String name, String remoteAddress) {
        this.id = id;
        this.name = name;
        this.remoteAddress = remoteAddress;
    }

    public Player(int id, String name, String remoteAddress, long coin, int[] cards, int discardNum) {
        this.id = id;
        this.name = name;
        this.remoteAddress = remoteAddress;
        this.coin = coin;
        this.cards = cards;
        this.discardNum = discardNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public long getCoin() {
        return coin;
    }

    public void setCoin(long coin) {
        this.coin = coin;
    }

    public int[] getCards() {
        return cards;
    }

    public void setCards(int[] cards) {
        this.cards = cards;
    }

    public int getDiscardNum() {
        return discardNum;
    }

    public void setDiscardNum(int discardNum) {
        this.discardNum = discardNum;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remoteAddress='" + remoteAddress + '\'' +
                ", coin=" + coin +
                ", cards=" + Arrays.toString(cards) +
                ", discardNum=" + discardNum +
                '}';
    }
}
