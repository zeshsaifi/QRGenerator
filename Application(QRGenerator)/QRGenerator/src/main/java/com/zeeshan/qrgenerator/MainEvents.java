package com.zeeshan.qrgenerator;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
public class MainEvents {
    @FXML
    private TextArea textField;

    public void click() throws IOException {
        Main m = new Main();
        m.click("Generator_fxml.fxml");
    }
    public void generateQR() throws Exception {
        FileChooser fc = new FileChooser();
        fc.setTitle("Save QR");
        File file = fc.showSaveDialog(null);
        String output = file.getPath() + ".png";
        System.out.println(output);

        System.out.println("working.....");
        BitMatrix matrix = new MultiFormatWriter().encode(new String(textField.getText().getBytes("UTF-8"), "UTF-8"), BarcodeFormat.QR_CODE, 300, 300);
        MatrixToImageWriter.writeToFile(matrix, output.substring(output.lastIndexOf('.') + 1), new File(output));

        Alert al=new Alert(Alert.AlertType.INFORMATION);
        al.setTitle("QR Generated....!");
        al.setContentText("Your QR Code has been generated.");
        al.setHeaderText(null);
        al.show();
    }
}