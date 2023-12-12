package com.Praktikum6;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> tabel = new TableView<>();
        tabel.setPlaceholder(new javafx.scene.control.Label("Belum ada data!"));
        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("NAMA");
        kolomNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        TableColumn<Mahasiswa, String> kolomNIM = new TableColumn<>("NIM");
        kolomNIM.setCellValueFactory(new PropertyValueFactory<>("nim"));

        tabel.getColumns().addAll(kolomNIM, kolomNama);

        tabel.getItems().add(new Mahasiswa("Hafizh Pratama Budiman", "2210817310007",1));
        tabel.getItems().add(new Mahasiswa("Bima Sanjaya", "2210817210008",2));
        tabel.getItems().add(new Mahasiswa("Trisna Cahya Permadi", "2210817210021",3));
        tabel.getItems().add(new Mahasiswa("Kevin Maleakhi", "2210817210031",4));
        tabel.getItems().add(new Mahasiswa("Ahmad Reza Alfayet", "2210817210016",5));
        tabel.getItems().add(new Mahasiswa("Ryan Muhammad Irfan", "2210817310013",6));
        tabel.getItems().add(new Mahasiswa("Akhmad Raihan Ridha", "2210817110001",7));
        tabel.getItems().add(new Mahasiswa("Rohid Akmal", "2210817310017",8));
        tabel.getItems().add(new Mahasiswa("Muhammad Raka Azwar", "2210817210012",9));
        tabel.getItems().add(new Mahasiswa("Muhammad Kholid Syaifullah", "2210817210025",10));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}