module hu.petrik.masodfokuproject.masodfoku {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens hu.petrik.masodfokuproject.masodfoku to javafx.fxml;
    exports hu.petrik.masodfokuproject.masodfoku;
}