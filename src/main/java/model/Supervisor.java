package model;

import javafx.beans.property.SimpleStringProperty;

/**
 * Represents a supervisor whom the user works under the supervision of
 *
 * @author  Kyle Williams
 * @since   Version 2
 */
public class Supervisor implements DatabaseItem{
    private int supervisorID;
    private SimpleStringProperty supervisorFirstName = new SimpleStringProperty();
    private SimpleStringProperty supervisorLastName = new SimpleStringProperty();
    /**
     * The nickname of the supervisor that
     * gets displayed to the user in a view
     */
    private SimpleStringProperty supervisorDisplayName = new SimpleStringProperty();

    public Supervisor(String supervisorDisplayName) {
        this.supervisorDisplayName.set(supervisorDisplayName);
    }

    public int getSupervisorID() {
        return supervisorID;
    }
    public void setSupervisorID(int supervisorID) {
        this.supervisorID = supervisorID;
    }

    public String getSupervisorFirstName() {
        return supervisorFirstName.get();
    }
    public SimpleStringProperty supervisorFirstNameProperty() {
        return supervisorFirstName;
    }
    public void setSupervisorFirstName(String supervisorFirstName) {
        this.supervisorFirstName.set(supervisorFirstName);
    }

    public String getSupervisorLastName() {
        return supervisorLastName.get();
    }
    public SimpleStringProperty supervisorLastNameProperty() {
        return supervisorLastName;
    }
    public void setSupervisorLastName(String supervisorLastName) {
        this.supervisorLastName.set(supervisorLastName);
    }

    public String getSupervisorDisplayName() {
        return supervisorDisplayName.get();
    }
    public SimpleStringProperty supervisorDisplayNameProperty() {
        return supervisorDisplayName;
    }
    public void setSupervisorDisplayName(String supervisorDisplayName) {
        this.supervisorDisplayName.set(supervisorDisplayName);
    }
}