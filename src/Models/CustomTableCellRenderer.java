package Models;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class CustomTableCellRenderer extends DefaultTableCellRenderer {

    private Font headerFont;
    private Font contentFont;

    public CustomTableCellRenderer() {
        headerFont = new Font("Bahnschrift", Font.PLAIN, 14);
        contentFont = new Font("Bahnschrift", Font.BOLD, 18);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (row >= 0) {
            setFont(headerFont);
        } else {
            setFont(contentFont);
        }
        //setFont(headerFont);
        return component;
    }
}
