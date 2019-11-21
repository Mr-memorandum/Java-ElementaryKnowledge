package Mr.memorandum.java.foundation;

import javax.swing.*;
import java.awt.*;
import java.util.TreeSet;

public class releaseInformation extends JComponent {
    public static int MESSAGE_X = 10;
    public static int MESSAGE_Y = 10;
    private TreeSet<Staff> newTreeSet;
    releaseInformation(TreeSet<Staff> newTreeSet)
    {
        super();
        this.newTreeSet = newTreeSet;
    }
    public void paintComponent(Graphics g)
    {
        for(Staff s:newTreeSet)
        {
            g.drawString("name: "+s.getName()+" age:"+s.getAge()+
                    " salary:"+s.getSalary(),MESSAGE_X,MESSAGE_Y);
            MESSAGE_Y += 20;
        }
    }

}
