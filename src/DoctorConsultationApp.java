import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DoctorConsultationApp extends JFrame {
    public DoctorConsultationApp() {
        // Set the size and layout of the frame
        setSize(600, 400);
        setLayout(new BorderLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.SOUTH);

        // Add buttons to the panel
        JButton addDoctorButton = new JButton("Add Doctor");
        buttonPanel.add(addDoctorButton);
        JButton deleteDoctorButton = new JButton("Delete Doctor");
        buttonPanel.add(deleteDoctorButton);
        JButton consultDoctorButton = new JButton("Consult Doctor");
        buttonPanel.add(consultDoctorButton);


        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("/Users/devinfernando/Desktop/Online-Doctor-Consultation.jpeg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        add(picLabel);


    }

    public static void main(String[] args) {
        DoctorConsultationApp app = new DoctorConsultationApp();
        app.setVisible(true);
    }
}
