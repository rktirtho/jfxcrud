module com.rktirtho.jfxcrud {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.sql;

    opens com.rktirtho.jfxcrud to javafx.fxml;
    opens com.rktirtho.jfxcrud.entity to org.hibernate.orm.core;

    exports com.rktirtho.jfxcrud;
}