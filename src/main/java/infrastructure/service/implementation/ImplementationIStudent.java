package infrastructure.service.implementation;

import domaine.entity.dto.StudentDto;
import entity.Student;
import infrastructure.repository.StudentRepository;
import infrastructure.service.interfaces.Istudent;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImplementationIStudent implements Istudent {


    StudentRepository studentRepository;
    public ImplementationIStudent(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public boolean saveStudent(StudentDto studentDto) {
        try {
            Student student = new Student();
            student.setId(studentDto.getId());
            student.setName(studentDto.getName());
            studentRepository.persist(student);
            return true;
        } catch (Exception e) {

            return false;
        }

    }
}
