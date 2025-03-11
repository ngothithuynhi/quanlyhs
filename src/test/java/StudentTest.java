/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minh
 */
import com.mycompany.student.Student;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentTest {

    private Student student;

    @BeforeMethod
    public void setUp() {
        student = new Student("123", "Minh", 21);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(student.getName(), "Minh");
    }

    @Test
    public void testSetAge() {
        student.setAge(22);
        Assert.assertEquals(student.getAge(), 22);
    }
}

