package ru.rtmis.veterinary.service.impl;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.stream.Collectors;
import ru.rtmis.GreetingFormatter;
import ru.rtmis.veterinary.domain.AnimalKind;
import ru.rtmis.veterinary.domain.AnimalPatient;
import ru.rtmis.veterinary.service.VeterinaryService;

public class VeterinaryServiceImpl implements VeterinaryService {

    private Multimap<AnimalKind, AnimalPatient> careData = ArrayListMultimap.create();

    @Override
    public void displayGreeting(String name) {
        System.out.println(GreetingFormatter.greeting(name));
    }

    @Override
    public void takeCareOf(AnimalPatient patient) {
        careData.put(patient.getKind(), patient);
    }

    @Override
    public void displayCareStat() {
        System.out.println("Всего было обслужено животных - " + careData.size());
        System.out.println("Из них:");

        careData.keySet().stream()
                .peek(animalKind -> System.out.println(
                        animalKind.getKind() + " - " + careData.get(animalKind).size()))
                .collect(Collectors.toList());

    }
}
