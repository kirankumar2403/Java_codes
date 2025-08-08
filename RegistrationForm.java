import java.awt.*;
import java.awt.event.*;

class RegistrationForm1 extends Frame {

    RegistrationForm1() {  

        Frame f = new Frame();
        f.setSize(1000, 600);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        Label lHeader = new Label("Student Registration Form");
        lHeader.setBounds(250, 40, 300, 50);
        f.add(lHeader);

        Label lName = new Label("Student Name");
        lName.setBounds(100, 15, 100, 30);
        f.add(lName);

        TextField txtName = new TextField();
        txtName.setBounds(200, 20, 200, 30);
        f.add(txtName);

        Label lRollno = new Label("Roll No");
        lRollno.setBounds(100, 60, 100, 30);
        f.add(lRollno);

        TextField txtRollno = new TextField();
        txtRollno.setBounds(200, 60, 200, 30);
        f.add(txtRollno);

        Label lGender = new Label("Gender");
        lGender.setBounds(100, 100, 100, 30);
        f.add(lGender);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkMale = new Checkbox("Male", cbg, false);
        checkMale.setBounds(200, 100, 60, 30);
        f.add(checkMale);

        Checkbox checkFemale = new Checkbox("Female", cbg, true);
        checkFemale.setBounds(270, 100, 70, 30);
        f.add(checkFemale);

        Label lCourse = new Label("Course");
        lCourse.setBounds(100, 150, 100, 30);
        f.add(lCourse);

        Checkbox Course1 = new Checkbox("MCA");
        Course1.setBounds(200, 150, 100, 30);
        f.add(Course1);

        Checkbox Course2 = new Checkbox("MSC");
        Course2.setBounds(300, 150, 100, 30);
        f.add(Course2);

        Checkbox Course3 = new Checkbox("MBA");
        Course3.setBounds(400, 150, 100, 30);
        f.add(Course3);

        Checkbox Course4 = new Checkbox("Others");
        Course4.setBounds(500, 150, 100, 30);
        f.add(Course4);

        Label lAddress = new Label("Address");
        lAddress.setBounds(100, 200, 100, 30);
        f.add(lAddress);

        TextArea txtAddress = new TextArea();
        txtAddress.setBounds(200, 200, 300, 100);
        f.add(txtAddress);

        Button bSubmit = new Button("Submit");
        bSubmit.setBounds(200, 320, 100, 30);
        f.add(bSubmit);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

public class RegistrationForm {
    public static void main(String args[]) {
        RegistrationForm1 f1 = new RegistrationForm1();
    }
}
