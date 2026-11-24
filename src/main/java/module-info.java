module com.example.oop2project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop2project to javafx.fxml;
    exports com.example.oop2project;
}