import module.Chrome;
import module.Idea;
import module.Wechat;
import module.Window;

public class Application {
    public static void main(String[] args) {
        Window idea = new Idea();
        Window chrome = new Chrome();
        Window wechat = new Wechat();

        method(idea);
        method(chrome);
        method(wechat);
    }

    public static void method(Window window) {
        if (window instanceof Idea) {
            Idea idea = (Idea) window;
            idea.pressF5();
        }
        if (window instanceof Chrome) {
            Chrome chrome = (Chrome) window;
            chrome.pressF5();
        }
        if (window instanceof Wechat) {
            Wechat wechat = (Wechat) window;
            wechat.pressF5();
        }
    }
}
