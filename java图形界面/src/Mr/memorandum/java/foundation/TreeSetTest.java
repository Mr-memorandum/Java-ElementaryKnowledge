package Mr.memorandum.java.foundation;

import javax.swing.*;
import java.awt.*;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args)
    {
        final TreeSet<Staff> test = new TreeSet<>();
        Staff s1 = new Staff("Alice",18,10000);
        Staff s2 = new Staff("Gloria",25,30000);
        Staff s3 = new Staff("Mike",24,20000);
        Staff s4 = new Staff("Bob",20,15000);
        Staff s5 = new Staff("Jenny",21,18000);

        test.add(s1);
        test.add(s2);
        test.add(s3);
        test.add(s4);
        test.add(s5);

        for(Staff s:test)
        {
            System.out.println("name: "+s.getName()+" age:"+s.getAge()+
                    " salary:"+s.getSalary());
        }

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame frame = new SimpleFrame(test);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
