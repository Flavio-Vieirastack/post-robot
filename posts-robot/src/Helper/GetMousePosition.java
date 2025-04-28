package Helper;

import java.awt.*;
import java.util.Scanner;

public abstract class GetMousePosition {
    public static void execute() {
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        int screenWidth = screenSize.width;
//        int screenHeight = screenSize.height;

        while (true) {
            PointerInfo pointerInfo = MouseInfo.getPointerInfo();
            Point mouseLocation = pointerInfo.getLocation();

            int mouseX = mouseLocation.x;
            int mouseY = mouseLocation.y;

            System.out.println("Posicion X: " + mouseX);
            System.out.println("Posocion Y: " + mouseY);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

//        double percentX = (double) mouseX / screenWidth;
//        double percentY = (double) mouseY / screenHeight;
//
//        System.out.printf("Coordenada do mouse: (%d, %d)%n", mouseX, mouseY);
//        System.out.printf("Porcentagem da tela: %.4f%% x, %.4f%% y%n", percentX * 100, percentY * 100);
//        System.out.printf("Para usar no código: x = screenWidth * %.4f;%n", percentX);
//        System.out.printf("                     y = screenHeight * %.4f;%n", percentY);
    }
}
