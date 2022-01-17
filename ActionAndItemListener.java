package AWTAPI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame extends Frame implements ActionListener, ItemListener {
    Label label;
    Label counter;
    Button button;
    Checkbox c1,c2,c3,c4;
    CheckboxGroup radio;
    int count=0;
    MyFrame(){
        super(" Event Handling");
        setLayout(new FlowLayout());
        label = new Label("Nothing is selected\n");
        counter = new Label("   "+count);
        button = new Button("Click");
        button.addActionListener(this::actionPerformed);
        radio = new CheckboxGroup();
//        c1 = new Checkbox("Machine Learning");
//        c2 = new Checkbox("AWS");
//        c3 = new Checkbox("Data Structure");
//        c4 = new Checkbox("Competitive Programming");
        c1 = new Checkbox("Machine Learning",false,radio);
        c2 = new Checkbox("AWS",false,radio);
        c3 = new Checkbox("Data Structure",false,radio);
        c4 = new Checkbox("Competitive Programming",false,radio);
        c1.addItemListener(this::itemStateChanged);
        c2.addItemListener(this::itemStateChanged);
        c3.addItemListener(this::itemStateChanged);
        c4.addItemListener(this::itemStateChanged);
        add(label);
        add(counter);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter.setText("   "+(++count));
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String option="";
        if(c1.getState())
            option = option+" "+c1.getLabel();
        if(c2.getState())
            option = option+" "+c2.getLabel();
        if(c3.getState())
            option = option+" "+c3.getLabel();
        if(c4.getState())
            option = option+" "+c4.getLabel();
        if(option.isEmpty())
            option = "Nothing is selected";
        label.setText(option+"    ");
    }
}

public class EventHandlingAWT {

    public static void main(String[] args) {
        System.out.println("---------Event Handling in AWT API---------");
        MyFrame frame = new MyFrame();
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setSize(800,500);
        frame.setVisible(true);
    }

}
