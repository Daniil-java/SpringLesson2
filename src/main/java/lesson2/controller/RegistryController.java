package lesson2.controller;

import lesson2.entities.Card;
import lesson2.entities.Doctors;
import lesson2.service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RegistryController {
    //Регистратура должна:
    //Найти карточку в архиве
    //Найти расписание врача
    //Отправить к врачу

    private RegistryService registryService;
    public void apply() {
        System.out.println("Пациент обратился в регистрацию");
        registryService.makeTimeTable();
    }

    public String getDoctorInfo(Doctors doctor) {
        System.out.println("Пациент спросил информацию о докторе");
        return registryService.getDoctorInfo(doctor);
    }

    public Card getCard() {
        System.out.println("Пациент попросил карточку");
        return registryService.getCard();
    }

    @Autowired
    private void setRegistryService(RegistryService registryService) {
        this.registryService = registryService;
    }
}
