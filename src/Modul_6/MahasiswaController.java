package Modul_6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MahasiswaController implements Initializable {

    @FXML
    private TableView<Mahasiswa> tblMahasiswa;

    @FXML
    private TableColumn<Mahasiswa, String> colNim;

    @FXML
    private TableColumn<Mahasiswa, String> colNama;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));

        ObservableList<Mahasiswa> daftarMahasiswa = FXCollections.observableArrayList(
                new Mahasiswa(1, "Namira Humaira", "2510817220008"),
                new Mahasiswa(2, "Aurora Shafa Salsabila", "2510817220010"),
                new Mahasiswa(3, "Tysa Luthfia", "2510817220019"),
                new Mahasiswa(4, "Maula Muhammad Farrel Rabbani", "2510817310008"),
                new Mahasiswa(5, "Muhammad Raffa Azisha", "2510817210003"),
                new Mahasiswa(6, "Tristan Nathan Naurell Prasetyo", "2510817310005"),
                new Mahasiswa(7, "Zainil Musthofa Radam", "2510817310013"),
                new Mahasiswa(8, "Ahmad Muzakki Khaira", "2510817310016"),
                new Mahasiswa(9, "Noufal Raditya Wardana", "2510817110008"),
                new Mahasiswa(10, "Luckya Ari Getsemane S.", "2510817310015")
        );

        tblMahasiswa.setItems(daftarMahasiswa);
    }
}