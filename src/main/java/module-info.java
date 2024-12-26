module projeto.sistema {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;


    opens projeto.sistema to javafx.fxml;
    exports projeto.sistema;
}