package lesson2;

import lesson2.config.Config;
import lesson2.controller.RegistryController;
import lesson2.entities.Doctors;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        RegistryController registryController = context.getBean(RegistryController.class);

        registryController.apply();
        System.out.println(registryController.getDoctorInfo(Doctors.NEUROLOGIST));
        System.out.println(registryController.getDoctorInfo(Doctors.THERAPIST));
        System.out.println(registryController.getDoctorInfo(Doctors.SURGEON));
        registryController.getCard();
    }
}
