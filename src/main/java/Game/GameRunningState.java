package Game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kenn
 *         Created by Kenn on 2016/6/28.
 */
public class GameRunningState {

    // 出牌时限（毫秒）
    private static final long TIMEOUT = 30000;
    // 最大观众数
    private static final int MAX_AUDIENCE_NUM = 10;
    // 当前进入游戏玩家
    private int currentPlayerNum;
    // 游戏设定玩家数
    private int playerNum;
    // 玩家和观众
    private List<Player> playerList, audienceList;
    // 牌堆
    private CardsHeap cardsHeap;
    // 弃牌数
    private int discardNum;

    public GameRunningState(int playerNum) {
        this.playerNum = playerNum;
        playerList = new ArrayList<Player>();
        audienceList = new ArrayList<Player>();
        cardsHeap = new CardsHeap(playerNum);
    }

    /**
     * 加入玩家，数量超过牌局玩家数，将会置于观众席
     *
     * @param player 已连接玩家
     */
    public void addPlayer(Player player) {
        if (playerList.size() < playerNum) {
            playerList.add(player);
        } else if (audienceList.size() < MAX_AUDIENCE_NUM) {
            audienceList.add(player);
        }
    }

    /**
     * 开局发牌，每人5张
     */
    public void dealCards() {
        for (Player p : playerList) {
            int cards[] = new int[5];
            for (int i = 0; i < 5; i++) {
                cards[i] = cardsHeap.getCard();
            }
            p.setCards(cards);
        }
    }

    /**
     * 补牌，补满五张
     */
    public void pickUp() {
        if (!cardsHeap.isHeapEmpty()) {
            for (Player p : playerList) {
                int cards[] = p.getCards();
                for (int i = 0; i < 5; i++) {
                    if (cards[i] == -1) {
                        cards[i] = cardsHeap.getCard();
                    }
                }
            }
        }
    }


    public int getCurrentPlayerNum() {
        return currentPlayerNum;
    }

    public void setCurrentPlayerNum(int currentPlayerNum) {
        this.currentPlayerNum = currentPlayerNum;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public List<Player> getAudienceList() {
        return audienceList;
    }

    public void setAudienceList(List<Player> audienceList) {
        this.audienceList = audienceList;
    }

    public CardsHeap getCardsHeap() {
        return cardsHeap;
    }

    public void setCardsHeap(CardsHeap cardsHeap) {
        this.cardsHeap = cardsHeap;
    }
}
