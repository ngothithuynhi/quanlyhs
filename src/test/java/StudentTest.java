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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentTest {

    private Student student;

    // Trước khi chạy các test case, tạo đối tượng Student
    @BeforeClass
    public void setUp() {
        student = new Student("12345", "Nguyen Van A", 20); // Tạo một đối tượng Student với thông tin giả
    }

    // Kiểm tra phương thức getName()
    @Test
    public void testGetName() {
        Assert.assertEquals(student.getName(), "Nguyen Van A", "Loi ten");
    }

    // Kiểm tra phương thức setAge()
    @Test
    public void testSetAge() {
        student.setAge(25);
        Assert.assertEquals(student.getAge(), 25, "Loi tuoi");
    }

    // Kiểm tra phương thức updateName()
    @Test
    public void testUpdateName() {
        student.updateName("Nguyen Thi B");
        Assert.assertEquals(student.getName(), "Nguyen Thi B", "Cap nhap ten loi!");
    }
}

