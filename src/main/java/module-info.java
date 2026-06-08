module br.edu.ucsal.sergiolj.containers {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.ucsal.sergiolj.containers to javafx.fxml;
    exports br.edu.ucsal.sergiolj.containers;
    exports br.edu.ucsal.sergiolj.containers.controller;
    opens br.edu.ucsal.sergiolj.containers.controller to javafx.fxml;
    exports br.edu.ucsal.sergiolj.containers.navigation;
    opens br.edu.ucsal.sergiolj.containers.navigation to javafx.fxml;
    exports br.edu.ucsal.sergiolj.containers.model;
    opens br.edu.ucsal.sergiolj.containers.model to javafx.fxml;

}