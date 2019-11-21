package Mr.memorandum.java.foundation;

import javax.swing.*;
import java.awt.*;
import java.util.TreeSet;

public class SimpleFrame extends JFrame {
    //get Operating System data
    private Toolkit kit  = Toolkit.getDefaultToolkit();
    private Dimension screenSize = kit.getScreenSize();
    private int screenWidth = screenSize.width;
    private int screenHeight = screenSize.height;
    //Frame constructing
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 350;
    public SimpleFrame(TreeSet<Staff> newTreeSet)
    {
        setTitle("Staff Information System");
        setLocation((screenWidth - DEFAULT_WIDTH)/2,(screenWidth - DEFAULT_HEIGHT)/2);
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        Image img = new ImageIcon("icon.gif").getImage();
        setIconImage(img);
        add(new releaseInformation(newTreeSet));
    }
}
