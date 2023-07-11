module com.example.brick_game {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.brick_game to javafx.fxml;
    exports com.example.brick_game;
}