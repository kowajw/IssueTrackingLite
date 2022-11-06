module csc211.issuetrackinglite {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging; // added to use java logging class in App(main) method)
    requires javafx.base;

    opens csc211.issuetrackinglite to javafx.fxml;
    opens csc211.issuetrackinglite.model to javafx.fxml;
    exports csc211.issuetrackinglite;
    exports csc211.issuetrackinglite.model;
}
