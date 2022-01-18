package AWTAPI;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener, ActionListener{
    List list;
    Choice choice;
    TextArea textArea;
    MyFrame(){
        super("ListBox");
        setLayout(new FlowLayout());
        list = new List(7,true);
        // true means multiple items can be selected
        choice = new Choice();
        textArea = new TextArea(10,30);

        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        choice.add("January");
        choice.add("February");
        choice.add("March");
        choice.add("April");
        choice.add("May");
        choice.add("June");
        choice.add("July");
        choice.add("August");
        choice.add("September");
        choice.add("October");
        choice.add("November");
        choice.add("December");
        add(list);
        add(choice);
        add(textArea);
        list.addItemListener(this::itemStateChanged);
        choice.addItemListener(this::itemStateChanged);
        list.addActionListener(this::actionPerformed);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      String S[] = list.getSelectedItems();
      String text ="";
      for(String x:S)
          text+=x+"\n";
      textArea.setText(text);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==list)
            textArea.setText(list.getSelectedItem());
        else
            textArea.setText(choice.getSelectedItem());
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
