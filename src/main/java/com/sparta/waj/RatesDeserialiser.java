package com.sparta.waj;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RatesDeserialiser
{
    public RatesDTO ratesMappedDTO;

    public RatesDeserialiser(String filePath)
    {
        ObjectMapper ratesObjectMapper = new ObjectMapper();

        try
        {
            ratesMappedDTO = ratesObjectMapper.readValue(new File(filePath), RatesDTO.class);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
