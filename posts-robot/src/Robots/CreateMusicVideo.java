package Robots;

import Helper.PromptsHelper;
import Helper.RobotHelper;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Random;

public class CreateMusicVideo {
    private final Robot robot;

    public CreateMusicVideo(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        int loops = 0;
        while (loops < 5) {
            openChrome();
            openSuno();
            openSunoCreate();
            createSong();
            downloadSong();
            openVideoEditor();
            editVideo();
            openNeonBeatsFolder();
            copyMusicName();
            openYoutube();
            createYoutubeVideo();
            deleteMusicFiles();
            recreateMusicVideo();
            loops++;
        }
    }

    private void clickOnWindowsSearchResult() {
        robot.mouseMove(1326, 635);
        RobotHelper.mouseRightPress(robot);
    }

    private void openChrome() {
        RobotHelper.initialWindowsMenu(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, "chrome");
        oneSecondDelay();
        clickOnWindowsSearchResult();
        delay(2L);
    }

    private void openSuno() {
        robot.mouseMove(1124, 94);
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.mouseMove(1231, 670);
        oneSecondDelay();
        robot.mouseMove(1568, 670);
        oneSecondDelay();
        robot.mouseMove(1819, 675);
        oneSecondDelay();
        robot.mouseMove(1928, 673);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(8L);
    }

    private void openSunoCreate() {
        //Clica no botão create para aparecer a tela de criar musicas
        robot.mouseMove(81, 355);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(3L);
    }

    private void createSong() {
        // cria a musica com o prompt
        robot.mouseMove(481, 333);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, PromptsHelper.getRandomPrompt());
        delay(2L);
        robot.mouseMove(487, 880);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(420L); //Sete minutos
    }

    private void downloadSong() {
        // faz o download da musica e salva na pasta
        delay(2L);
        robot.mouseMove(2270, 344);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.mouseMove(2215, 704);
        oneSecondDelay();
        robot.mouseMove(2429, 703);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(2L);
        robot.mouseMove(1257, 727);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(5L);
        robot.mouseMove(91, 327);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.mouseMove(227, 189);
        oneSecondDelay();
        RobotHelper.doubleClick(robot);
        oneSecondDelay();
        robot.mouseMove(1061, 501);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
    }

    private void openVideoEditor() {
        // abre o shot
        RobotHelper.initialWindowsMenu(robot);
        RobotHelper.typeText(robot, "shot");
        delay(2L);
        clickOnWindowsSearchResult();
        delay(5L);
    }

    private void editVideo() {
        // faz a edição no shot
        robot.mouseMove(798, 247);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, generateRandomString());
        oneSecondDelay();
        robot.mouseMove(725, 427);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(3L);
        robot.mouseMove(43, 63);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(2L);
        robot.mouseMove(558, 195);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.mouseMove(1026, 529);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(3L);
        RobotHelper.drag(robot, 1383, 393, 613, 918);
        delay(2L);
        robot.mouseMove(120, 288);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        RobotHelper.ctrlC(robot);
        oneSecondDelay();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_I);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_I);
        oneSecondDelay();
        robot.mouseMove(38, 80);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(2L);
        robot.mouseMove(339, 208);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.mouseMove(1016, 524);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(2L);
        /// drag init Posicion X: 1264 Posocion Y: 409 end Posicion X: 144 Posocion Y: 872
        RobotHelper.drag(robot, 1264, 409, 144, 872);
        oneSecondDelay();
        robot.mouseMove(185,283);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        RobotHelper.ctrlV(robot);
        oneSecondDelay();
        robot.mouseMove(380,481);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        // na parte a cima o video está pronto
        oneSecondDelay();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_E);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_E);
        oneSecondDelay();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_ENTER);
        delay(60L);
        robot.mouseMove(2526,15);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.mouseMove(1275,544);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(2L);
    }

    private void openNeonBeatsFolder() {
        // abre a pasta do neon beats
        RobotHelper.initialWindowsMenu(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, "neonbeats");
        oneSecondDelay();
        robot.mouseMove(1326, 744);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(2L);
    }

    private void copyMusicName() {
        //Faz a copia do nome aqui
        robot.mouseMove(1228,447);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.keyPress(KeyEvent.VK_F2);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_F2);
        oneSecondDelay();
        RobotHelper.ctrlC(robot);
        oneSecondDelay();
        robot.mouseMove(1736, 270);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
    }

    private void openYoutube() {
        openChrome();
        delay(3L);
        robot.mouseMove(405,99);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(5L);
        robot.mouseMove(2502,148);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(3L);
        robot.mouseMove(2344,337);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(3L);
        robot.mouseMove(2331,438);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(3L);
    }

    private void createYoutubeVideo() {
        robot.mouseMove(2374,148);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(2L);
        robot.mouseMove(2420,190);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(4L);
        robot.mouseMove(1271,695);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(2L);
        robot.mouseMove(98,330);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.mouseMove(235,190);
        oneSecondDelay();
        RobotHelper.doubleClick(robot);
        oneSecondDelay();
        robot.mouseMove(217,187);
        oneSecondDelay();
        RobotHelper.doubleClick(robot);
        oneSecondDelay();
        robot.mouseMove(236,164);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.mouseMove(1033,505);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        delay(5L);
        robot.mouseMove(911,405);
        oneSecondDelay();
        RobotHelper.doubleClick(robot);
        oneSecondDelay();
        RobotHelper.ctrlV(robot);
        oneSecondDelay();
        robot.mouseMove(1250,467);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        for (int i = 0; i < 8; i++) {
            robot.mouseWheel(1);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        robot.mouseMove(857,713);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        clickNextInVideo();
        clickNextInVideo();
        clickNextInVideo();
        clickNextInVideo();
    }

    private void clickNextInVideo() {
        oneSecondDelay();
        robot.mouseMove(1675,940);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
    }

    private void deleteMusicFiles() {
        openNeonBeatsFolder();
        delay(2L);
        robot.mouseMove(1226,460);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_DELETE);
        oneSecondDelay();
        robot.mouseMove(867,448);
        oneSecondDelay();
        RobotHelper.doubleClick(robot);
        oneSecondDelay();
        robot.mouseMove(873,421);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_DELETE);
        oneSecondDelay();
        robot.mouseMove(1754,272);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
    }

    private void recreateMusicVideo() {
        openChrome();
        openSuno();
        openSunoCreate();

        //Deleta a musica
        robot.mouseMove(2267,350);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();
        robot.mouseMove(2235,790);
        oneSecondDelay();
        RobotHelper.mouseRightPress(robot);
        oneSecondDelay();

        downloadSong();
        openVideoEditor();
        editVideo();
        openNeonBeatsFolder();
        copyMusicName();
        openYoutube();
        createYoutubeVideo();
        deleteMusicFiles();
    }

    private void oneSecondDelay() {
        delay(1L);
    }

    private String generateRandomString() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(8);

        for (int i = 0; i < 8; i++) {
            char randomChar = (char) ('A' + random.nextInt(26));
            sb.append(randomChar);
        }
        return sb.toString();
    }

    private void delay(long second) {
        try {
            Thread.sleep(Duration.ofSeconds(second));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
