module com.wuxianggujun.tanke {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.wuxianggujun.tanke to javafx.fxml;
    exports com.wuxianggujun.tanke;
    exports com.wuxianggujun.tanke.controller;
    opens com.wuxianggujun.tanke.controller to javafx.fxml;
    exports com.wuxianggujun.tanke.scene;
    opens com.wuxianggujun.tanke.scene to javafx.fxml;
}