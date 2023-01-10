module com.zeeshan.qrgenerator {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.zxing;
    requires com.google.zxing.javase;


    opens com.zeeshan.qrgenerator to javafx.fxml;
    exports com.zeeshan.qrgenerator;
}