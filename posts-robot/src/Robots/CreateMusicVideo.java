package Robots;

import Helper.PromptsHelper;
import Helper.RobotHelper;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

public class CreateMusicVideo {
    private final Robot robot;

    private final String musicPath = "C:\\Users\\flavi\\Documents\\automations\\NeonBeats\\song";
    private final String photoPath = "C:\\Users\\flavi\\Documents\\automations\\NeonBeats\\photo";

    public CreateMusicVideo(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        int loops = 0;
        while (loops < 1) {
            openChrome();
            openSuno();
            openSunoCreate();
            createSong();
            downloadSong();
            openVideoEditor();
            editVideo();
            copyMusicName();
            openYoutube();
            createYoutubeVideo();
            deleteMusicFiles();
            recreateMusicVideo();
            loops++;
        }
        clearAll();
    }

    private void clickOnWindowsSearchResult() {
        robot.mouseMove(1326, 635);
        RobotHelper.mouseLeftPress(robot);
    }

    private void openChrome() {
        RobotHelper.initialWindowsMenu(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, "chrome");
        oneSecondDelay();
        clickOnWindowsSearchResult();
        oneSecondDelay();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_X);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_X);
        delay(2L);
    }

    private void openSuno() {
        robot.mouseMove(1124, 94);
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        robot.mouseMove(1231, 670);
        oneSecondDelay();
        robot.mouseMove(1568, 670);
        oneSecondDelay();
        robot.mouseMove(1819, 675);
        oneSecondDelay();
        robot.mouseMove(1928, 673);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(8L);
    }

    private void openSunoCreate() {
        //Clica no botão create para aparecer a tela de criar musicas
        robot.mouseMove(81, 355);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(3L);
    }

    private void createSong() {
        // cria a musica com o prompt
        robot.mouseMove(481, 333);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, PromptsHelper.getRandomPrompt());
        delay(2L);
        robot.mouseMove(443, 986);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        robot.mouseMove(487, 880);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        robot.mouseMove(2157, 764);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(300L); //5 minutos
    }

    private void downloadSong() {
        // faz o download da musica e salva na pasta
        delay(2L);
        robot.mouseMove(809, 339);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(2L);
        robot.mouseMove(2270, 344);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        robot.mouseMove(2215, 704);
        oneSecondDelay();
        robot.mouseMove(2429, 703);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(2L);
        robot.mouseMove(1257, 727);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(7L);
        //Salva na pasta
        robot.mouseMove(668, 53);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.backSpace(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, musicPath);
        oneSecondDelay();
        RobotHelper.enter(robot);
        oneSecondDelay();
        robot.mouseMove(1011, 503);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
    }

    private void openVideoEditor() {
        // abre o shot
        RobotHelper.initialWindowsMenu(robot);
        RobotHelper.typeText(robot, "shot");
        delay(2L);
        clickOnWindowsSearchResult();
        delay(5L);
    }

    private void catchFileToVideoEditor(String path) {
        robot.mouseMove(43, 63);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(2L);
        robot.mouseMove(716, 76);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, path);
        oneSecondDelay();
        RobotHelper.enter(robot);
        oneSecondDelay();
        robot.mouseMove(965, 339);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.ctrlA(robot);
        oneSecondDelay();
        robot.mouseMove(1039, 524);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
    }

    private void editVideo() {
        // faz a edição no shot
        robot.mouseMove(798, 247);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, generateRandomString());
        oneSecondDelay();
        robot.mouseMove(725, 427);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(3L);
        //pega a musica
        catchFileToVideoEditor(musicPath);
        delay(3L);
        RobotHelper.drag(robot, 1383, 393, 613, 918);
        delay(2L);
        RobotHelper.customShortcut(robot, KeyEvent.VK_CONTROL, KeyEvent.VK_2);
        oneSecondDelay();
        RobotHelper.customShortcut(robot, KeyEvent.VK_CONTROL, KeyEvent.VK_2);
        robot.mouseMove(120, 288);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
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
        RobotHelper.mouseLeftPress(robot);
        delay(2L);
        //Pega a foto
        catchFileToVideoEditor(photoPath);
        delay(2L);
        RobotHelper.drag(robot, 1264, 409, 144, 872);
        oneSecondDelay();
        robot.mouseMove(185, 283);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.ctrlV(robot);
        oneSecondDelay();
        robot.mouseMove(380, 481);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
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
        delay(40L);
        robot.mouseMove(2526, 15);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        robot.mouseMove(1275, 544);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(2L);
    }

    private void copyMusicName() {
        //Faz a copia do nome aqui
        robot.mouseMove(2272, 351);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        robot.mouseMove(2211, 581);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(2L);
        robot.mouseMove(1344, 422);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.ctrlA(robot);
        oneSecondDelay();
        RobotHelper.ctrlC(robot);
    }

    private void openYoutube() {
        openChrome();
        delay(3L);
        robot.mouseMove(405, 99);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(5L);
        robot.mouseMove(2502, 148);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(3L);
        robot.mouseMove(2344, 337);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(3L);
        robot.mouseMove(2331, 438);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(3L);
    }

    private void addThumbnail() {
        robot.mouseMove(924, 811);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(2L);
        robot.mouseMove(761, 56);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.backSpace(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, "C:\\Users\\flavi\\Pictures\\neomthumb");
        delay(2L);
        RobotHelper.enter(robot);
        oneSecondDelay();
        robot.mouseMove(822, 288);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        robot.mouseMove(226, 203);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.enter(robot);
    }

    private void createYoutubeVideo() {
        robot.mouseMove(2374, 148);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(2L);
        robot.mouseMove(2420, 190);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(4L);
        robot.mouseMove(1271, 695);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(2L);
        robot.mouseMove(98, 330);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        robot.mouseMove(377, 57);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.backSpace(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, "C:\\Users\\flavi\\Documents\\automations\\NeonBeats\\videos");
        oneSecondDelay();
        RobotHelper.enter(robot);
        oneSecondDelay();
        robot.mouseMove(673, 258);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.ctrlA(robot);
        oneSecondDelay();
        robot.mouseMove(1033, 505);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        delay(5L);
        robot.mouseMove(911, 405);
        oneSecondDelay();
        RobotHelper.doubleClick(robot);
        oneSecondDelay();
        RobotHelper.ctrlV(robot);
        oneSecondDelay();
        robot.mouseMove(1250, 467);
        oneSecondDelay();
        //addThumbnail();
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        for (int i = 0; i < 8; i++) {
            robot.mouseWheel(1);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        robot.mouseMove(857, 713);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        clickNextInVideo();
        clickNextInVideo();
        clickNextInVideo();
        clickNextInVideo();
    }

    private void clickNextInVideo() {
        oneSecondDelay();
        robot.mouseMove(1675, 940);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
    }

    private void deleteMusicFiles() {
        oneSecondDelay();
        RobotHelper.initialWindowsMenu(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, "C:\\Users\\flavi\\Videos");
        oneSecondDelay();
        RobotHelper.enter(robot);
        oneSecondDelay();
        RobotHelper.ctrlA(robot);
        RobotHelper.delete(robot);
        oneSecondDelay();
        oneSecondDelay();
        RobotHelper.initialWindowsMenu(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, "C:\\Users\\flavi\\Documents\\automations\\NeonBeats\\videos");
        oneSecondDelay();
        RobotHelper.enter(robot);
        oneSecondDelay();
        RobotHelper.ctrlA(robot);
        oneSecondDelay();
        RobotHelper.delete(robot);
        oneSecondDelay();
        oneSecondDelay();
        // deletar musica do pc
        RobotHelper.initialWindowsMenu(robot);
        oneSecondDelay();
        RobotHelper.typeText(robot, musicPath);
        oneSecondDelay();
        RobotHelper.enter(robot);
        oneSecondDelay();
        robot.mouseMove(1617, 637);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        RobotHelper.ctrlA(robot);
        oneSecondDelay();
        RobotHelper.delete(robot);
        oneSecondDelay();
    }

    private void recreateMusicVideo() {
        openChrome();
        openSuno();
        openSunoCreate();
        //Deleta a musica do sona
        robot.mouseMove(2267, 350);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        oneSecondDelay();
        robot.mouseMove(2235, 790);
        oneSecondDelay();
        RobotHelper.mouseLeftPress(robot);
        //
        oneSecondDelay();
        downloadSong();
        openVideoEditor();
        editVideo();
        copyMusicName();
        openYoutube();
        createYoutubeVideo();
        deleteMusicFiles();
    }

    private void clearAll() {
        try {
            String command = "powershell.exe -NoProfile -Command Clear-RecycleBin -Force";
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
            System.out.println("Lixeira esvaziada com sucesso!");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
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
