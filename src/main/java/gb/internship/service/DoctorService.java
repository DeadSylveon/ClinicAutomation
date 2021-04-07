package gb.internship.service;

import gb.internship.dto.DoctorDto;
import gb.internship.entity.Doctor;

import java.util.List;

public interface DoctorService {

    List<DoctorDto> getDoctors();
    Doctor getDoctor(int id);
    void saveOrUpdate(int id, String name, String  secondName, String patronymic, String dateOfEmployment, String specialization);
    void delete(int doctorId);
}
