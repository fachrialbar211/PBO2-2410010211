package id.ac.uniska.pbo2.p05;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.SwingUtilities;

public class P05EventHandling {

    public static void main(String[] args) {
        // Pasang tema FlatLaf
        FlatLightLaf.setup();

        // Buka form Kalkulator (atau bisa ganti ke KonversiSuhu / PengamatEvent)
        SwingUtilities.invokeLater(() -> {
            new Kalkulator().setVisible(true);
        });
    }
}