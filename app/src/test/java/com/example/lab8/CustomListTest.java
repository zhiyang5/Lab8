package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mock list for my city list
     *@return
     */

    @Before
    public CustomList MockCityList(){
        list=new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest(){
        list=MockCityList();
        int listSize=list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(listSize+1,list.getCount());
    }

    @Test
    public void testHasCity(){
        list=MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void testDeleteCity(){
        list=MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(1,list.getCount());
        list.deleteCity(city);
        assertEquals(0,list.getCount());
    }

    @Test
    public void testCountCity(){
        list=MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);

        assertEquals(1,list.countCity());
    }


}
