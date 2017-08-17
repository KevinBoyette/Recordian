package com.kylewill.controller.databaseitemcontroller;

import com.kylewill.model.Company;
import com.kylewill.databasemanagement.objectrelationalmap.CompanyMapper;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author  Kyle Williams
 * @since   Version 2
 */
public class EditCompanyController extends DatabaseItemModificationController implements Initializable {
    private CompanyMapper companyMapper = new CompanyMapper();
    private Company companyToEdit;
    @FXML private TextField companyName;
    @FXML private Label errorLabel;
    @FXML private Button saveButton;
    @FXML private Button cancelButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        saveButton.setOnMouseClicked(event -> updateCompany());
        cancelButton.setOnMouseClicked(event -> stage.close());
    }

    @Override
    protected void onMainViewControllerSet() {
        String nameOfCompanyToEdit = mainViewController.companyChoiceBox.getValue().toString();
        companyToEdit = companyMapper.read(nameOfCompanyToEdit);
        companyName.setText(companyToEdit.getCompanyName());
    }

    private void updateCompany() {
        if (companyName.getText().isEmpty()) {
            errorLabel.setVisible(true);
        } else {
            companyToEdit.setCompanyName(companyName.getText());
            companyMapper.update(companyToEdit);
            stage.close();
        }
    }
}
