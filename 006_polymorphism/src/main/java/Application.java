import module.ChromeF5;
import module.IdeaF5;
import module.WechatF5;
import module.WindowF5;

public class Application {
    public static void main(String[] args) {
        WindowF5 ideaF5 = new IdeaF5();
        WindowF5 chromeF5 = new ChromeF5();
        WindowF5 wechatF5 = new WechatF5();
        ideaF5.pressF5();
        chromeF5.pressF5();
        wechatF5.pressF5();
    }
}
