package org.example;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        JFrame frame = new JFrame();

        formularioLogin(frame);

    }

    public static void formularioLogin(JFrame frame) {
        // Criar componentes
        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField(20);
        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField txtSenha = new JPasswordField(20);
        JButton btnLogin = new JButton("Login");

        // Criar um painel para organizar os componentes
        JPanel painel = new JPanel();
        painel.add(lblEmail);
        painel.add(txtEmail);
        painel.add(lblSenha);
        painel.add(txtSenha);
        painel.add(btnLogin);

        // Configurar a janela
        frame.setTitle("Formulário de Login");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(painel);

        btnLogin.addActionListener(e -> {
            String email = txtEmail.getText();
            String senha = new String(txtSenha.getPassword());

            System.out.println("Email: " + email);
            System.out.println("Senha: " + senha);

            JOptionPane.showMessageDialog(null, "Email: " + txtEmail.getText() + "|| Password: " +
                    String.valueOf(txtSenha.getPassword()));
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }


}