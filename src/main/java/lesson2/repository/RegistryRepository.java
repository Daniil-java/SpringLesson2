package lesson2.repository;

import lesson2.entities.Doctors;
import org.springframework.stereotype.Repository;

import java.util.EnumMap;
import java.util.Map;

@Repository
public class RegistryRepository {
    private Map<Doctors, String> doctorsRepository = new EnumMap<>(Doctors.class);

    public void setDoctors(Doctors doctor, String string) {
        doctorsRepository.put(doctor, string);
    }

    public String getDoctorBySpec(Doctors doctor) {
        return doctorsRepository.get(doctor);
    }

}
