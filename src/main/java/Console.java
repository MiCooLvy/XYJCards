import Server.CardServer;

/**
 * 西游记服务器入口
 * @author Kenn
 * Created by Kenn on 2016/6/28.
 */
public class Console {

    public static void main(String args[]){
        try {
            new CardServer().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
