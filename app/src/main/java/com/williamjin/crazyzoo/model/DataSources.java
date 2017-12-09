package com.williamjin.crazyzoo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by william on 12/6/17.
 */

public class DataSources {

    public static final String MAMMAL = "Mammal";
    public static final String BIRD = "Bird";
    public static final String FISH = "Fish";
    public static final String NOTAVAILBE = "NA";

    public static List<Catergory> generateCategories(){
        List<Catergory> catergories = new ArrayList<>();
        catergories.add(new Catergory(MAMMAL, "large"));
        catergories.add(new Catergory(BIRD, "small"));
        catergories.add(new Catergory(FISH, "middle"));
        return catergories;
    }

    public static List<Animal> generateAnimals(){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Bat",
                MAMMAL, 20, NOTAVAILBE,
                "Bats are mammals of the order Chiroptera (/kaɪˈrɒptərə/; from the Ancient Greek: χείρ – cheir, \"hand\" and πτερόν – pteron, \"wing\")[1] whose forelimbs form webbed wings, making them the only mammals naturally capable of true and sustained flight.",
                "https://en.wikipedia.org/wiki/Bat"));
        animals.add(new Animal("Bear",
                MAMMAL, 200, NOTAVAILBE, "Bears are carnivoran mammals of the family Ursidae. They are classified as caniforms, or doglike carnivorans. Although only eight species of bears are extant, they are widespread, appearing in a wide variety of habitats throughout the Northern Hemisphere and partially in the Southern Hemisphere.",
                "https://en.wikipedia.org/wiki/Bear"));
        animals.add(new Animal("Dog",
                MAMMAL, 50, NOTAVAILBE,
                "a wolf-like canid in the genus Canis,[5] and is the most widely abundant terrestrial carnivore",
                "https://en.wikipedia.org/wiki/Dog"));
        animals.add(new Animal("Penguin",
                BIRD, 40, NOTAVAILBE, " are a group of aquatic, flightless birds. ",
                "https://en.wikipedia.org/wiki/Penguin"));
        animals.add(new Animal("Sparrow",
                BIRD, 10, NOTAVAILBE,
                "Sparrows are a family of small passerine birds, Passeridae. They are also known as true sparrows, or Old World sparrows, names also used for a particular genus of the family",
                "https://en.wikipedia.org/wiki/Sparrow"));
        animals.add(new Animal("Shark",
                FISH, 160, NOTAVAILBE,
                "Sharks are a group of elasmobranch fish characterized by a cartilaginous skeleton, five to seven gill slits on the sides of the head, and pectoral fins that are not fused to the head",
                "https://en.wikipedia.org/wiki/Shark"));
        animals.add(new Animal("Salmon",
                FISH, 5, NOTAVAILBE,
                "Salmon /ˈsæmən/ is the common name for several species of ray-finned fish in the family Salmonidae. ",
                "https://en.wikipedia.org/wiki/Salmon"));
        return animals;
    }
}
