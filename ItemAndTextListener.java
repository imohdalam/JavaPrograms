package AWTAPI;

import java.awt.*;
import java.awt.event.*;

/*
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
*/

/*
class MyFrame extends Frame implements TextListener, ActionListener{

    Label l1, l2, p;
    TextField TF, PF;
    MyFrame(){
        super("TextField");
        l1 = new Label("UserName");
        p = new Label("Password");
        l2 = new Label("Hit Enter for Submit");
        TF = new TextField(20);
        PF = new TextField(10);
        PF.setEchoChar('*');
        setLayout(new FlowLayout());
        TF.addTextListener(this::textValueChanged);
        TF.addActionListener(this::actionPerformed);
        PF.addActionListener(this::actionPerformed);
        add(l1);
        add(l2);
        add(TF);
        add(PF);
        add(p);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l2.setText("Submitted");
    }

    @Override
    public void textValueChanged(TextEvent e) {
        l1.setText(TF.getText());
    }
}

 */

class MyFrame extends Frame implements TextListener, ActionListener{
    Label l1, l2;
    TextArea textArea;
    TextField textField;
    Button button;
    MyFrame(){
        super("TextArea");
        l1 = new Label("TextArea");
        l2 = new Label("TextField");
        textArea = new TextArea(10,20);
        textField = new TextField(20);
        button = new Button("Submit");
        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(textArea);
        add(textField);
        add(button);
        textArea.addTextListener(this::textValueChanged);
        textField.addTextListener(this::textValueChanged);
        button.addActionListener(this::actionPerformed);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // l1.setText(textArea.getSelectedText());
       // textArea.append(textField.getText());
        textArea.insert(textField.getText(),textArea.getCaretPosition());
    }

    @Override
    public void textValueChanged(TextEvent e) {
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
