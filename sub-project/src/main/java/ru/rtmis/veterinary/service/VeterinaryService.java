package ru.rtmis.veterinary.service;

import ru.rtmis.veterinary.domain.AnimalPatient;

public interface VeterinaryService {

    void displayGreeting(String name);
    void takeCareOf(AnimalPatient patient);
    void displayCareStat();

}
