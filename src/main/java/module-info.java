module com.example.dummytest1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dummytest1 to javafx.fxml;
    exports com.example.dummytest1;
}