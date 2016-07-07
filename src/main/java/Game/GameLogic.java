package Game;


/**
 * @author Kenn
 *         Created by Kenn on 2016/6/28.
 */
public class GameLogic {

    private static final boolean charTable[][] = new boolean[][]{
            {false, false, false, false, true, true, true, false, false},
            {true, false, false, false, true, true, true, false, false},
            {true, true, false, false, true, true, true, false, false},
            {true, true, true, false, false, false, false, false, false},
            {false, false, false, true, false, false, false, false, false},
            {false, false, false, true, true, false, false, false, false},
            {false, false, false, true, true, true, false, false, false},
            {true, true, true, true, true, true, true, false, false},
            {true, true, true, true, true, true, true, true, false}
    };

    public GameLogic() {
    }

    public boolean isLegalPlay(Card currentCard, Card playerCard) {
        return ((currentCard.getCardType() == playerCard.getCardType()) && compareCard(currentCard, playerCard));

    }

    /**
     * 比较卡牌大小
     *
     * @param currentCard 当前桌上牌
     * @param playerCard  待比较的牌
     * @return 大小
     */
    private boolean compareCard(Card currentCard, Card playerCard) {
        return charTable[currentCard.getCardID()][playerCard.getCardID()];
    }

}
