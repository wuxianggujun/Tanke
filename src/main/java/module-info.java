module com.wuxianggujun.tanke {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.wuxianggujun.tanke to javafx.fxml;
    exports com.wuxianggujun.tanke;
}