package ru.rtmis.veterinary;

import ru.rtmis.veterinary.domain.AnimalKind;
import ru.rtmis.veterinary.domain.AnimalPatient;
import ru.rtmis.veterinary.service.VeterinaryService;
import ru.rtmis.veterinary.service.impl.VeterinaryServiceImpl;

public class HelloGradle {

    public static void main(String[] args) {

        VeterinaryService vetService = new VeterinaryServiceImpl();

        if (args.length > 0) {
            vetService.displayGreeting(args[0]);
        }

        vetService.takeCareOf(AnimalPatient.builder()
                .name("Барсик")
                .age(5)
                .kind(AnimalKind.CAT)
                .conclusion("Мочекаменная")
                .build());

        vetService.takeCareOf(AnimalPatient.builder()
                .name("Бандит")
                .age(1)
                .kind(AnimalKind.DOG)
                .conclusion("Клещ")
                .build());

        vetService.takeCareOf(AnimalPatient.builder()
                .name("Элли")
                .age(99)
                .kind(AnimalKind.TURTLE)
                .conclusion("Конъюнктивит")
                .build());

        vetService.takeCareOf(AnimalPatient.builder()
                .name("Пантера")
                .age(10)
                .kind(AnimalKind.OTHER)
                .conclusion("Грипп")
                .build());

        vetService.takeCareOf(AnimalPatient.builder()
                .name("Зорк")
                .age(2)
                .kind(AnimalKind.DOG)
                .conclusion("Трахеобронхит")
                .build());

        vetService.takeCareOf(AnimalPatient.builder()
                .name("Елви")
                .age(3)
                .kind(AnimalKind.CAT)
                .conclusion("Отит")
                .build());

        vetService.takeCareOf(AnimalPatient.builder()
                .name("Томас")
                .age(8)
                .kind(AnimalKind.CAT)
                .conclusion("Аллергия")
                .build());

        vetService.displayCareStat();
    }

}