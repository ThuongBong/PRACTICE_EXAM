module com.example.practice_exam {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practice_exam to javafx.fxml;
    exports com.example.practice_exam;
}