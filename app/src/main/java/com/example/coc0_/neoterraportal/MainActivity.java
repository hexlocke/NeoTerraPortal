package com.example.coc0_.neoterraportal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// This is the character class. Characters that the user creates
// are held in a Character object.
class Character {

    //Constructor

    public Character()
    {
        this.charactername = "";
        this.profession = "";
        this.appearance = "";
        this.race = "";
        this.agility = 4;
        this.smarts = 4;
        this.strength = 4;
        this.spirit = 4;
        this.vigor = 4;
        this.charisma = 0;
        this.parry = 0;
        this.toughness = 0;
        this.pace = 0;
        String[] dummy = {""};
        setSkills(dummy);
        setEdges(dummy);
        setHindrances(dummy);
        setWeapons(dummy);
        setArmor("");
        setEquipment(dummy);
        this.creationpoints = 5;
    }

    //Copyer

    public void copyData(Character temp)
    {
        this.setCharactername(temp.getCharactername());
        this.setProfession(temp.getProfession());
        this.setAppearance(temp.getAppearance());
        this.setRace(temp.getRace());
        this.setAgility(temp.getAgility());
        this.setSmarts(temp.getSmarts());
        this.setStrength(temp.getStrength());
        this.setSpirit(temp.getSpirit());
        this.setVigor(temp.getVigor());
        this.setPace(temp.getPace());
        this.setParry(temp.getParry());
        this.setToughness(temp.getToughness());
        this.setCharisma(temp.getCharisma());
        this.setSkills(temp.getSkills());
        this.setHindrances(temp.getHindrances());
        this.setEdges(temp.getEdges());
        this.setWeapons(temp.getWeapons());
        this.setArmor(temp.getArmor());
        this.setEquipment(temp.getEquipment());
        this.setCreationpoints(temp.getCreationpoints());
    }

    // SETTERS

    public void setCharactername(String charactername) {
        this.charactername = charactername;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public void setRace(String race) {
        if (race == "Human" || race == "Robot" || race == "Orc") {
            this.race = race;
            if (race == "Human") {
                String bonus[] = {"Bonus Edge"};
                this.setRaceCheck(bonus);
            }
            if (race == "Robot") {
                String bonus[] = {};
                // PLACEHOLDER
            }
            if (race == "Orc") {
                String bonus[] = {};
                // PLACEHOLDER
            }
        }
        if (race == "race")
        {
            this.race = "Human";
        }
    }

    public void setRaceCheck(String items[]) {
        raceCheck = items;
    }

    public void setHinderanceCheck(String items[]) {
        hindranceCheck = items;
    }

    public void setEdgeCheck(String items[]) {
        edgeCheck = items;
    }

    public void setAgility(int agility) {
        int possibilities[] = {4, 6, 8, 10, 12};
        for (int i = 0; i < 5; i++) {
            if (possibilities[i] == agility) {
                this.agility = agility;
                break;
            }
        }
    }

    public void setSmarts(int smarts) {
        int possibilities[] = {4, 6, 8, 10, 12};
        for (int i = 0; i < 5; i++) {
            if (possibilities[i] == smarts) {
                this.smarts = smarts;
                break;
            }
        }
    }

    public void setStrength(int strength) {
        int possibilities[] = {4, 6, 8, 10, 12};
        for (int i = 0; i < 5; i++) {
            if (possibilities[i] == strength) {
                this.strength = strength;
                break;
            }
        }
    }

    public void setSpirit(int spirit) {
        int possibilities[] = {4, 6, 8, 10, 12};
        for (int i = 0; i < 5; i++) {
            if (possibilities[i] == spirit) {
                this.spirit = spirit;
                break;
            }
        }
    }

    public void setVigor(int vigor) {
        int possibilities[] = {4, 6, 8, 10, 12};
        for (int i = 0; i < 5; i++) {
            if (possibilities[i] == vigor) {
                this.vigor = vigor;
                break;
            }
        }
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public void setParry(int parry) {
        this.parry = parry;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public void setHindrances(String[] hindrances) {
        this.hindrances = hindrances;
    }

    public void setCreationpoints(int creationpoints) {
        this.creationpoints = creationpoints;
    }

    public void setBackgroundedge(String backgroundedge) {
        this.backgroundedge = backgroundedge;
    }

    public void setEdges(String[] edges) {
        this.edges = edges;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }


    // GETTERS

    public String getCharactername() {
        return charactername;
    }

    public String getProfession() {
        return profession;
    }

    public String getAppearance() {
        return appearance;
    }

    public String getRace() {
        return race;
    }

    public int getAgility() {
        return agility;
    }

    public int getSmarts() {
        return smarts;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpirit() {
        return spirit;
    }

    public int getVigor() {
        return vigor;
    }

    public int getPace() {
        return pace;
    }

    public int getParry() {
        return parry;
    }

    public int getToughness() {
        return toughness;
    }

    public int getCharisma() {
        return charisma;
    }

    public String[] getSkills() {
        return skills;
    }

    public String[] getHindrances() {
        return hindrances;
    }

    public int getCreationpoints() {
        return creationpoints;
    }

    public String getBackgroundedge() {
        return backgroundedge;
    }

    public String[] getEdges() {
        return edges;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public String getArmor() {
        return armor;
    }

    public String[] getEquipment() {
        return equipment;
    }

    public String[] getRaceCheck() {
        return raceCheck;
    }

    public String[] getHindranceCheck() {
        return hindranceCheck;
    }

    public String[] getEdgeCheck() {
        return edgeCheck;
    }

    //descriptive, nonnumerical values
    String charactername;

    String profession;
    String appearance;

    //Major choices

    // race
    String race;

    // stats
    int agility;
    int smarts;
    int strength;
    int spirit;
    int vigor;

    // derived stats
    int pace;
    int parry;
    int toughness;
    int charisma;

    //skills
    String[] skills;

    //Edges and hinderance
    String hindrances[];
    int creationpoints;
    String backgroundedge;
    String edges[];

    //Equipment
    String weapons[];
    String armor;
    String equipment[];

    // Requirements checks
    String raceCheck[];
    String hindranceCheck[];
    String edgeCheck[];

}


public class MainActivity extends AppCompatActivity {

    List<Character> characters;

    //CSVassist controls the loading and saving of characters to and from a CSV file.
    public class CSVassist
    {
        InputStream input;
        public CSVassist(InputStream inputstream)
        {
            this.input = inputstream;
        }

        public List load()
        {
            List<Character> characterdata = new ArrayList();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            try
            {
                String line;
                Boolean firstLine = true;
                while((line = reader.readLine()) != null)
                {
                    String[] data = line.split(",");
                    if(firstLine != true)
                    {
                        Character k = loadCharacter(data);
                        characterdata.add(k);
                    }
                    else firstLine = false;
                }
            }
            catch (IOException exception)
            {
                throw new RuntimeException("Can't read data :(");
            }
            finally
            {
                try{
                    input.close();
                }
                catch(IOException exceptional)
                {
                    throw new RuntimeException("Whoops. Can't close file");
                }
            }
            return characterdata;
        }


    }

    // loadcharacters returns a character made up from the data of the CSV file.
    public Character loadCharacter(String[] data) {
        Character temp = new Character();
        temp.setCharactername(data[0]);
        temp.setProfession(data[1]);
        temp.setAppearance(data[2]);
        temp.setRace(data[3]);
        temp.setAgility(Integer.valueOf(data[4]));
        temp.setSmarts(Integer.parseInt(data[5]));
        temp.setStrength(Integer.parseInt(data[6]));
        temp.setSpirit(Integer.parseInt(data[7]));
        temp.setVigor(Integer.parseInt(data[8]));
        temp.setPace(Integer.parseInt(data[9]));
        temp.setParry(Integer.parseInt(data[10]));
        temp.setToughness(Integer.parseInt(data[11]));
        temp.setCharisma(Integer.parseInt(data[12]));

        String[] skill = data[13].split(";");
        temp.setSkills(skill);

        String[] hindrance = data[14].split(";");
        temp.setHindrances(hindrance);

        String[] edge = data[15].split(";");
        temp.setEdges(edge);

        String[] weapon = data[16].split(";");
        temp.setWeapons(weapon);

        temp.setArmor(data[17]);

        String[] equips = data[18].split(";");
        temp.setEquipment(equips);

        temp.setCreationpoints(Integer.parseInt(data[19]));

        return temp;
    }

    //saveCharacter takes the character data and saves it to a string.
    public String[] saveCharacter(Character temp)
    {
        String skill = "";
        String[] skillList = temp.getSkills();
        for (int i = 0; i < skillList.length; i++) {
            skill = skill + skillList[i] + ";";
        }

        String hinder = "";
        String[] hindranceList = temp.getHindrances();
        for (int i = 0; i < hindranceList.length; i++) {
            hinder = hinder + hindranceList[i] + ";";
        }

        String edger = "";
        String[] edgeList = temp.getEdges();
        for (int i = 0; i < edgeList.length; i++) {
            edger = edger + edgeList[i] + ";";
        }

        String weapons = "";
        String[] weaponList = temp.getWeapons();
        for (int i = 0; i < weaponList.length; i++) {
            weapons = weapons + edgeList[i] + ";";
        }

        String equipment = "";
        String[] equipmentList = temp.getEquipment();
        for (int i = 0; i < equipmentList.length; i++) {
            equipment = equipment + equipmentList[i] + ";";
        }


        String[] savefile =
                {temp.getCharactername(),
                temp.getProfession(),
                temp.getAppearance(),
                temp.getRace(),
                Integer.toString(temp.getAgility()),
                Integer.toString(temp.getSmarts()),
                Integer.toString(temp.getStrength()),
                Integer.toString(temp.getSpirit()),
                Integer.toString(temp.getVigor()),
                Integer.toString(temp.getPace()),
                Integer.toString(temp.getParry()),
                Integer.toString(temp.getToughness()),
                Integer.toString(temp.getCharisma()),
                skill,
                hinder,
                edger,
                weapons,
                temp.getArmor(),
                equipment,
                Integer.toString(temp.getCreationpoints())
        };

        return savefile;
    }

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button createnew = (Button) findViewById(R.id.newCharacter);
        createnew.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, CreateACharacter.class);
                startActivityForResult(intent, 1);
            }
        });


        InputStream input = getResources().openRawResource(R.raw.characters);
        CSVassist csv = new CSVassist(input);
        characters = csv.load();
        String names = "";
        for (int i = 0; i < characters.size(); i++) {
            names = names + characters.get(i).getCharactername() + ",";
        }
        String[] data = names.split(",");


        listView = findViewById(R.id.listArea);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemposition = position;
                String itemValue = (String) listView.getItemAtPosition(itemposition);

                // OPEN CHARACTER EDIT ACTIVITY!!!!!
            }
        });

    }

    public void onClick(View view)
    {
        Intent intent = new Intent(MainActivity.this, CreateACharacter.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == 1)
        {
            if(resultCode == Activity.RESULT_OK)
            {
                Character temp = new Character();
                temp.setCharactername(data.getStringExtra("name"));
                temp.setRace(data.getStringExtra("race"));
                temp.setProfession(data.getStringExtra("profession"));
                temp.setAppearance(data.getStringExtra("appearance"));

                characters.add(temp);

                String names = "";
                for (int i = 0; i < characters.size(); i++) {
                    names = names + characters.get(i).getCharactername() + ",";
                }
                String[] newdata = names.split(",");

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, newdata);
                listView.setAdapter(adapter);
            }
        }
    }
}
