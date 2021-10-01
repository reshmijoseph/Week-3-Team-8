package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();



    /* APOLOGIES, BUT I WENT AHEAD AND FILLED THIS CLASS OUT AS WELL,
    BECAUSE I NEEDED THE PET CLASS TO EXIST FOR MY CUSTOMER CLASS.
    ONLY SCROLL DOWN IF YOU WANT TO SEE WHAT I CAME UP WITH.
    *
        *
            *
                *
                    *
                        *
                            *
                                *
                                    *
                                        *
                                            *
                                                *
                                                    *
                                                        *
                                                            *
                                                                *
                                                                    *


    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public String listVaccinations() {
        String listOutTheVaccinations = "";
        for (int i = 0; i < vaccinations.size(); i++) {
            listOutTheVaccinations += vaccinations.get(i);
            if (i < vaccinations.size() - 1) {
                listOutTheVaccinations += ", ";
            }
        }
        return listOutTheVaccinations;
    }

    */

}
