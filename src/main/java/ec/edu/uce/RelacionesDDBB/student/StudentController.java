package ec.edu.uce.RelacionesDDBB.student;

import ec.edu.uce.RelacionesDDBB.locker.Locker;
import ec.edu.uce.RelacionesDDBB.locker.LockerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    LockerRepository lockerRepository;

    @GetMapping
    List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PostMapping
    Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping("/{studentId}/locker")
    Student assignLockerToStudent(
            @PathVariable Long studentId,
            @RequestBody Locker locker
    ) {
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));
        locker.setStudent(student);
        lockerRepository.save(locker);
        student.setLocker(locker);
        return studentRepository.save(student);
    }
}
