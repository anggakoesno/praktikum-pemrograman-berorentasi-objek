package Pertemuan3;

public class Game {
    int score;

    // Constructor
    Game() {
        score = 0;
    }

    Game(int score) {
        this.score = score; // this.score berarti memanggil variabel score di dalam class yang sama
    }
}
