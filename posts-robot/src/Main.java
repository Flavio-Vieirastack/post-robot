import Helper.GetMousePosition;
import Robots.CreateMusicVideo;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws AWTException {
        //GetMousePosition.execute();
        final Robot robot = new Robot();
        new CreateMusicVideo(robot).execute();
    }
}