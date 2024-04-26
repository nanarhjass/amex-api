package co.pragra.learning.apigeneration.api;

import org.openapitools.api.StudentApi;
import org.openapitools.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@RestController
public class StudentApiImpl implements StudentApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return StudentApi.super.getRequest();
    }

    @Override
    public ResponseEntity<Student> addPet(Student student) {
        return StudentApi.super.addPet(student);
    }

    @Override
    public ResponseEntity<Student> getStudent() {
        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Doe");
        return ResponseEntity.status(200).body(student);
    }

    @Override
    public ResponseEntity<Student> updatePet(Student student) {
        return StudentApi.super.updatePet(student);
    }
}
