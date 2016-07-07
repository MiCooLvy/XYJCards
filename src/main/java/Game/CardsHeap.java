package Game;

/**
 * 抽牌堆
 *
 * @author Kenn
 *         Created by Kenn on 2016/6/28.
 */
public class CardsHeap {

    private int[] cards;

    public CardsHeap(int playerNum) {
        init(playerNum);
    }

    private void init(int playerNum) {
        int num = playerNum * 2;
        cards = new int[]{num, num, num, num, num, num, num, playerNum, playerNum, num, num};
    }

    public int getCard() {
        int randNum = (int) (Math.random() * 11);
        if (isHeapEmpty()) {
            randNum = -1;
            return randNum;
        } else if (cards[randNum] > 0) {
            cards[randNum]--;
            return randNum;
        } else {
            return getCard();
        }
    }

    public void showHeap() {
        for (int n : cards) {
            System.out.print("[" + n + "] ");
        }
        System.out.println(" ");
    }

    public boolean isHeapEmpty() {
        int notEmptyNum = 0;
        for (int n : cards) {
            if (n != 0) {
                notEmptyNum++;
            }
        }
        return notEmptyNum == 0;
    }
}
