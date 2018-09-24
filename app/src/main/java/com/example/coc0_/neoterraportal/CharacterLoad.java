package com.example.coc0_.neoterraportal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class CharacterLoad {

    InputStream inputStream;

    public List read()
    {
        List characterList = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try
        {
            String csvLine;
            while((csvLine = reader.readLine()) != null)
            {
                String[] row = csvLine.split(",");
                characterList.add(row);
            }
        }
        catch (IOException exception)
        {
            throw new RuntimeException("Can't read CSV file!");
        }
        finally
        {
            try
            {
                inputStream.close();
            }
            catch(IOException exception2)
            {
                throw new RuntimeException("Can't Close CSV File!!!");
            }
        }
        return characterList;
    }

}
