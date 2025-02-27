package application;

import domaine.entity.dto.StudentDto;
import infrastructure.service.interfaces.Istudent;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/stduent")
@Produces(MediaType.APPLICATION_JSON)
@Consumes (MediaType.APPLICATION_JSON)

public class StudentController {
    @Inject
    Istudent istudent;
    @POST
    @Path("/save")
    public  void save(StudentDto studentDto){

        istudent.saveStudent(studentDto);

    }
}
