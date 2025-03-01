package exerciciosFX.gamebw.ui.gui;

import exerciciosFX.gamebw.model.GameBWManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainJFX extends Application {
    GameBWManager gameBWManager;

    @Override
    public void init() throws Exception {
        super.init();
        gameBWManager = new GameBWManager(); // here or in the constructor
    }

    @Override
    public void start(Stage stage) throws Exception {
        RootPane root = new RootPane(gameBWManager);
        Scene scene = new Scene(root,700,400);
        stage.setScene(scene);
        stage.setTitle("Game BW");
        stage.setMinWidth(700);
        stage.setMinHeight(400);
        stage.show();
    }
}
