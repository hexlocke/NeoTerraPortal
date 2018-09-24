package com.example.coc0_.neoterraportal;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void characterTest()
    {
        // Create a character and test basic functions and values

        Character test = new Character();

        assertEquals(5, test.getCreationpoints());

        test.setCharactername("Mr. Test");
        assertEquals("Mr. Test", test.getCharactername());

        test.setRace("Human");
        assertEquals("Human", test.getRace());
        assertEquals("Bonus Edge", test.getRaceCheck()[0]);

        test.setAgility(4);
        test.setSmarts(4);
        test.setStrength(4);
        test.setSpirit(4);
        test.setVigor(4);
        assertEquals(4, test.getAgility());
        assertEquals(4, test.getSmarts());
        assertEquals(4, test.getStrength());
        assertEquals(4, test.getSpirit());
        assertEquals(4, test.getVigor());

        test.setParry(6);
        test.setToughness(2);
        test.setCharisma(-2);
        test.setPace(6);
        assertEquals(6, test.getParry());
        assertEquals(2, test.getToughness());
        assertEquals(-2, test.getCharisma());
        assertEquals(6, test.getPace());

        String[] skills = {"Fighting8","Shooting4","Weird Science10"};
        test.setSkills(skills);
        assertArrayEquals(skills, test.getSkills());

        String[] hindrance = {"Broken Leg"};
        test.setHindrances(hindrance);
        assertArrayEquals(hindrance, test.getHindrances());

        String[] edge = {"A good fighter"};
        test.setEdges(edge);
        assertArrayEquals(edge, test.getEdges());

        String[] weapons = {"sword", "firearm", "holy hand grenade"};
        test.setWeapons(weapons);
        assertArrayEquals(weapons, test.getWeapons());

        test.setArmor("+1 Sleeveless Underwear of Doom");
        assertEquals("+1 Sleeveless Underwear of Doom", test.getArmor());

        String[] equipment = {"Rope", "Torch", "Monkey-Paw"};
        test.setEquipment(equipment);
        assertArrayEquals(equipment, test.getEquipment());

    }

    @Test
    public void loadTest()
    {
        String[] testyMcTester =
                {"Name", "Profession", "Appearance", "Human",
                        "4", "4", "4", "4", "4",
                        "2", "2","2", "2",
                        "fighting8;shooting4;Weird Science10;",
                        "No legs",
                        "Edgy Personality",
                        "weapons", "armor", "equipment",
                        "0"};




    }



}