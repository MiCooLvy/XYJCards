package Game;

/**
 * @author Kenn
 *         Created by Kenn on 2016/7/5.
 */
public class Card {

    // 单张牌
    public static final int TYPE_SINGLE = 1;
    // 对子
    public static final int TYPE_PAIR = 2;
    // 三张一样
    public static final int TYPE_THREEOFKIND = 3;
    // 四张一样
    public static final int TYPE_FOUROFKIND = 4;
    // 五张一样
    public static final int TYPE_FIVEOFKIND = 5;

    private int cardType;

    private int cardID;

    public Card() {
    }

    public Card(int cardType, int cardID) {
        this.cardType = cardType;
        this.cardID = cardID;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardType=" + cardType +
                ", cardID=" + cardID +
                '}';
    }
}
