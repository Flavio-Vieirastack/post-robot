package Robots;

import java.awt.*;

public class CreateMusicVideo {
    private final Robot robot;

    public CreateMusicVideo(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        int loops = 1;
        while (loops <= 5) {
            loops++;
        }
    }

    private void openChrome() {
        // Abre o chrome pela tecla windows
    }

    private void openSuno() {
        // abre a suno ai
    }

    private void openSunoCreate() {
        //Clica no botão create para aparecer a tela de criar musicas
    }

    private void createSong() {
        // cria a musica com o prompt
    }

    private void downloadSong() {
        // faz o download da musica e salva na pasta
    }

    private void openVideoEditor() {
        // abre o shot
    }

    private void editVideo() {
        // faz a edição no shot
    }

    private void openNeonBeatsFolder() {
        // abre a pasta do neon beats
    }

    private void copyMusicName() {
        openNeonBeatsFolder();
        //Faz a copia do nome aqui
    }

    private void openYoutube() {
        openChrome();
    }

    private void createYoutubeVideo() {

    }

    private void deleteMusicFiles() {
        openNeonBeatsFolder();

    }

    private void recreateMusicVideo() {
        openChrome();
        openSuno();
        //Deleta a musica
        downloadSong();
        openVideoEditor();
        editVideo();
        copyMusicName();
        openYoutube();
        createYoutubeVideo();
        deleteMusicFiles();
    }
}
