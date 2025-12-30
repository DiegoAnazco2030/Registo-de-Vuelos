package org.flys.presentation.swingPackages;

import javax.swing.*;
// import org.flys.presentation.swingPackages.fligthMenu.fligthManagmentMenu;

public class mainMenu {
    private JPanel mainMenuPanel;
    private JButton fligthManagmentButton;
    private JButton reservationManagmentButton;
    private JButton passengerManagmentButton;

    public mainMenu() {
        fligthManagmentButton.addActionListener(e-> {
            // new fligthManagmentMenu().setVisible(true);
            // this.dispose();
        });
    }
}
