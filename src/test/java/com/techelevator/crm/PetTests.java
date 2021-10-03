package com.techelevator.crm;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class PetTests {


    /* APOLOGIES, BUT I FILLED OUT THIS PETTESTS AS WELL!
    ONLY SCROLL DOWN IF YOU WANT TO SEE WHAT I CAME UP WITH!
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
                                                            */


    private Pet sut;

    @Before
    public void setUp() {
        sut = new Pet("Test", "Toodle");
    }

    @Test
    public void rabies_parvo_distemper_covid_yields_correct_vaccination_list_string() {
        sut.setVaccinations(new ArrayList<String>(List.of("Rabies", "Parvo", "Distemper", "COVID")));
        String result = sut.listVaccinations();
        Assert.assertEquals("Rabies, Parvo, Distemper, COVID", result);
    }

    @Test
    public void setting_empty_vaccine_list_yields_empty_vaccine_list() {
        sut.setVaccinations(new ArrayList<String>(List.of("")));
        String result = sut.listVaccinations();
        Assert.assertEquals( "", result );
    }

    @Test
    public void empty_default_yields_empty_vaccine_list() {
        String result = sut.listVaccinations();
        Assert.assertEquals( "", result);
    }

}
