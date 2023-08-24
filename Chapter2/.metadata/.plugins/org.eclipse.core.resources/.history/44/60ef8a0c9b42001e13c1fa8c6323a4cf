package s23.vko2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import s23.vko2.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Vko2Controller {

    @GetMapping("/hello")
    public String hello(Model model) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate", "Cole"));
        students.add(new Student("Dan", "Brown"));
        students.add(new Student("Mike", "Mars"));

        model.addAttribute("welcomeMessage", "Welcome to the Haaga-Helia!");
        model.addAttribute("students", students);

        return "hello";
    }
}