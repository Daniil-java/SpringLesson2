package lesson2.service;

import lesson2.entities.Card;
import lesson2.entities.Doctors;
import lesson2.repository.RegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistryService {
    private Card card;
    private RegistryRepository registryRepository;

    //Условно
    public void makeTimeTable() {
        registryRepository.setDoctors(Doctors.NEUROLOGIST, "205 каб.");
        registryRepository.setDoctors(Doctors.SURGEON, "307 каб.");
        registryRepository.setDoctors(Doctors.THERAPIST, "201 каб.");
    }

    public String getDoctorInfo(Doctors doctors) {
        return registryRepository.getDoctorBySpec(doctors);
    }

    public Card getCard() {
        return card;
    }

    @Autowired
    private void setRegistryRepository(RegistryRepository registryRepository) {
        this.registryRepository = registryRepository;
    }

    @Autowired
    private void setCard(Card card) {
        this.card = card;
    }
}
