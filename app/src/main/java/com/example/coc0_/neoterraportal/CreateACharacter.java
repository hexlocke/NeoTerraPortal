package com.example.coc0_.neoterraportal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class CreateACharacter extends AppCompatActivity
{
    Button submit;
    EditText nameEdit;
    Spinner raceSpin;
    EditText professionEdit;
    EditText appearanceEdit;
    String race;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_a_character);

        submit = (Button) findViewById(R.id.submitButton);
        nameEdit = (EditText) findViewById(R.id.nameInput);
        raceSpin = (Spinner) findViewById(R.id.raceSpinner);
        professionEdit = (EditText) findViewById(R.id.professionInput);
        appearanceEdit = (EditText) findViewById(R.id.appearanceInput);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // validate name
                boolean namecheck;
                String name = nameEdit.getText().toString();
                if(name.length() == 0)
                {
                    nameEdit.setError("You must enter a name");
                    namecheck = false;
                }
                else if(name.contains(",")||name.contains(";")||name.contains("\n"))
                {
                    nameEdit.setError("You can't input strange symbols");
                    namecheck = false;
                }
                else namecheck = true;

                //validate profession
                boolean professioncheck;
                String profession = professionEdit.getText().toString();
                if(profession.length() == 0)
                {
                    professionEdit.setError("You must enter a profession.");
                    professioncheck = false;
                }
                else if(profession.contains(",")||profession.contains(";")||profession.contains("\n"))
                {
                    professionEdit.setError("You can't input strange symbols");
                    professioncheck = false;
                }
                else professioncheck = true;

                // validate appearance
                boolean appearancecheck;
                String appearance = appearanceEdit.getText().toString();
                if(appearance.length() == 0)
                {
                    appearancecheck = false;
                    appearanceEdit.setError("Must enter a description.");
                }
                else if(appearance.contains(",")||appearance.contains(";")||appearance.contains("\n)"))
                {
                    appearanceEdit.setError("Can't enter commas, semicolons, or line breaks");
                    appearancecheck = false;
                }
                else appearancecheck = true;

                // validate race
                boolean racecheck = false;
                if(race == "Human"||race == "Robot"||race=="Orc")
                {
                    racecheck = true;
                }

                if(namecheck == true && racecheck == true && appearancecheck == true && professioncheck == true)
                {
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra("name", name);
                    returnIntent.putExtra("race", race);
                    returnIntent.putExtra("appearance", appearance);
                    returnIntent.putExtra("profession", profession);
                    setResult(Activity.RESULT_OK, returnIntent);
                    finish();
                }

            }
        });

        //Setup race spinner
        String[] races = {"Human","Robot","Orc"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, races);
        raceSpin.setAdapter(adapter);
        raceSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch(position)
                {
                    case 0:
                        race = "Human";
                        break;
                    case 1:
                        race = "Robot";
                        break;
                    case 2:
                        race = "Orc";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

    }

    public void onClick(View view)
    {
        // validate name
        boolean namecheck;
        String name = nameEdit.getText().toString();
        if(name.length() == 0)
        {
            nameEdit.setError("You must enter a name");
            namecheck = false;
        }
        else if(name.contains(",")||name.contains(";")||name.contains("\n"))
        {
            nameEdit.setError("You can't input strange symbols");
            namecheck = false;
        }
        else namecheck = true;

        //validate profession
        boolean professioncheck;
        String profession = professionEdit.getText().toString();
        if(profession.length() == 0)
        {
            professionEdit.setError("You must enter a profession.");
            professioncheck = false;
        }
        else if(profession.contains(",")||profession.contains(";")||profession.contains("\n"))
        {
            professionEdit.setError("You can't input strange symbols");
            professioncheck = false;
        }
        else professioncheck = true;

        // validate appearance
        boolean appearancecheck;
        String appearance = appearanceEdit.getText().toString();
        if(appearance.length() == 0)
        {
            appearancecheck = false;
            appearanceEdit.setError("Must enter a description.");
        }
        else if(appearance.contains(",")||appearance.contains(";")||appearance.contains("\n)"))
        {
            appearanceEdit.setError("Can't enter commas, semicolons, or line breaks");
            appearancecheck = false;
        }
        else appearancecheck = false;

        // validate race
        boolean racecheck = false;
        if(race == "Human"||race == "Robot"||race=="Orc")
        {
            racecheck = true;
        }

        if(namecheck == true && racecheck == true && appearancecheck == true && professioncheck == true)
        {
            Intent returnIntent = new Intent();
            returnIntent.putExtra("name", name);
            returnIntent.putExtra("race", race);
            returnIntent.putExtra("appearance", appearance);
            returnIntent.putExtra("profession", profession);
            setResult(Activity.RESULT_OK, returnIntent);
            finish();
        }

    }

}
