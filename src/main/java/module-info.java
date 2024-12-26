module projeto.sistema {
    requires javafx.controls;
    requires javafx.fxml;


    opens projeto.sistema to javafx.fxml;
    exports projeto.sistema;
    exports projeto.sistema.gui;
    opens projeto.sistema.gui to javafx.fxml;
}