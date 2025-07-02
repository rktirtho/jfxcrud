package com.rktirtho.jfxcrud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.rktirtho.jfxcrud.entity.User;


public class HelloController {
    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;


    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jfx-crud-pu");

    @FXML
    protected void onRegisterButtonClick() {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();

        if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            User user = new User();
            user.setName(name);
            user.setEmail(email);
            user.setPassword(password);

            em.persist(user);
            em.getTransaction().commit();
            em.close();
        }
    }
}