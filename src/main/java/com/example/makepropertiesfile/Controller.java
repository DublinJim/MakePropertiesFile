package com.example.makepropertiesfile;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Text txt0;
    public Text txt1;
    public Text txt2;
    public Text txt3;
    public Text txt4;
    public Text txt5;
    public Label Lbl1;
    public AnchorPane rootPaneMain;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Properties properties = new Properties();

        properties.setProperty("author","James M. Keogh");
        properties.setProperty("title","Make properties");
        properties.setProperty("controller","Controller.java");
        properties.setProperty("company","ADGA");
        properties.setProperty("timeMade","2023");
        // Add key-value pairs

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("app.properties");
            properties.store(fileOutputStream, "Application Properties");
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileInputStream fileInputStream = new FileInputStream("app.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String title = properties.getProperty("title");
        String version = properties.getProperty("version");
        String author = properties.getProperty("author");
        String controller = properties.getProperty("controller");
        String company= properties.getProperty("company");
        String timeMade= properties.getProperty("timeMade");



        txt0.setText(author);
        txt1.setText(version);
        txt2.setText(title);
        txt3.setText(controller);
        txt4.setText(company);
        txt5.setText(timeMade);

    }
}
