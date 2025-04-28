package Helper;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public abstract class RobotHelper {
    public static void initialWindowsMenu(Robot robot) {
        robot.setAutoDelay(100);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ESCAPE);

        robot.keyRelease(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public static void ctrlC(Robot robot) {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public static void ctrlV(Robot robot) {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public static void typeText(Robot robot, String text) {
        for (char c : text.toCharArray()) {
            typeCharacter(robot, c);
        }
    }

    private static void typeCharacter(Robot robot, char c) {
        switch (c) {
            case 'a': case 'A': robotKey(robot, KeyEvent.VK_A, Character.isUpperCase(c)); break;
            case 'b': case 'B': robotKey(robot, KeyEvent.VK_B, Character.isUpperCase(c)); break;
            case 'c': case 'C': robotKey(robot, KeyEvent.VK_C, Character.isUpperCase(c)); break;
            case 'd': case 'D': robotKey(robot, KeyEvent.VK_D, Character.isUpperCase(c)); break;
            case 'e': case 'E': robotKey(robot, KeyEvent.VK_E, Character.isUpperCase(c)); break;
            case 'f': case 'F': robotKey(robot, KeyEvent.VK_F, Character.isUpperCase(c)); break;
            case 'g': case 'G': robotKey(robot, KeyEvent.VK_G, Character.isUpperCase(c)); break;
            case 'h': case 'H': robotKey(robot, KeyEvent.VK_H, Character.isUpperCase(c)); break;
            case 'i': case 'I': robotKey(robot, KeyEvent.VK_I, Character.isUpperCase(c)); break;
            case 'j': case 'J': robotKey(robot, KeyEvent.VK_J, Character.isUpperCase(c)); break;
            case 'k': case 'K': robotKey(robot, KeyEvent.VK_K, Character.isUpperCase(c)); break;
            case 'l': case 'L': robotKey(robot, KeyEvent.VK_L, Character.isUpperCase(c)); break;
            case 'm': case 'M': robotKey(robot, KeyEvent.VK_M, Character.isUpperCase(c)); break;
            case 'n': case 'N': robotKey(robot, KeyEvent.VK_N, Character.isUpperCase(c)); break;
            case 'o': case 'O': robotKey(robot, KeyEvent.VK_O, Character.isUpperCase(c)); break;
            case 'p': case 'P': robotKey(robot, KeyEvent.VK_P, Character.isUpperCase(c)); break;
            case 'q': case 'Q': robotKey(robot, KeyEvent.VK_Q, Character.isUpperCase(c)); break;
            case 'r': case 'R': robotKey(robot, KeyEvent.VK_R, Character.isUpperCase(c)); break;
            case 's': case 'S': robotKey(robot, KeyEvent.VK_S, Character.isUpperCase(c)); break;
            case 't': case 'T': robotKey(robot, KeyEvent.VK_T, Character.isUpperCase(c)); break;
            case 'u': case 'U': robotKey(robot, KeyEvent.VK_U, Character.isUpperCase(c)); break;
            case 'v': case 'V': robotKey(robot, KeyEvent.VK_V, Character.isUpperCase(c)); break;
            case 'w': case 'W': robotKey(robot, KeyEvent.VK_W, Character.isUpperCase(c)); break;
            case 'x': case 'X': robotKey(robot, KeyEvent.VK_X, Character.isUpperCase(c)); break;
            case 'y': case 'Y': robotKey(robot, KeyEvent.VK_Y, Character.isUpperCase(c)); break;
            case 'z': case 'Z': robotKey(robot, KeyEvent.VK_Z, Character.isUpperCase(c)); break;
            case ' ': robotKey(robot, KeyEvent.VK_SPACE, false); break;
            case '!':
                robot.keyPress(KeyEvent.VK_SHIFT);
                robotKey(robot, KeyEvent.VK_1, false);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            default:
                System.out.println("Character not handled: " + c);
        }
    }

    private static void robotKey(Robot robot, int keyEvent, boolean shift) {
        if (shift) robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(keyEvent);
        robot.keyRelease(keyEvent);
        if (shift) robot.keyRelease(KeyEvent.VK_SHIFT);
    }

    public static void mouseRightPress(Robot robot) {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(100); // segura um pouco para garantir o clique
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void drag(Robot robot, int startX, int startY, int endX, int endY) {
        robot.mouseMove(startX, startY);
        robot.delay(100);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(200);

        int steps = 50;
        double dx = (endX - startX) / (double) steps;
        double dy = (endY - startY) / (double) steps;

        for (int i = 0; i < steps; i++) {
            int moveX = (int) (startX + (dx * i));
            int moveY = (int) (startY + (dy * i));
            robot.mouseMove(moveX, moveY);
            robot.delay(10);
        }

        robot.mouseMove(endX, endY);
        robot.delay(100);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void doubleClick(Robot robot)  {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(100);

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
