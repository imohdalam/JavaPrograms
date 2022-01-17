package AWTAPI;

import java.awt.*;

class MyFrame extends Frame{
    Label label;
    Button button;
    TextField textField;
    TextArea textArea;
    MyFrame(){
        super("Java AWT API");
        setLayout(new FlowLayout());
        label = new Label("Project");
        textField = new TextField(20);
        button = new Button("Submit");
        textArea = new TextArea("Remark",5,70,2);

        add(label);
        add(textField);
        add(button);
        add(textArea);
    }

}

public class Main {

    public static void main(String[] args) {
        System.out.println("---------Learning AWT API---------");
        MyFrame frame = new MyFrame();
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setSize(800,500);
        frame.setVisible(true);
    }
}
