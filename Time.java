/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnit325finalproject;

/**
 *
 * @author ateko
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import java.text.*;

/**
 *
 * @author Stephen
 */
public class Time 
{
    public String getTime() 
    {
        Date currentTime = new Date();
        DateFormat formatter = DateFormat.getInstance();
        String dateStr = formatter.format(currentTime);
        return dateStr;
    }
    public void setTime()
    {
         Date currentTime = new Date();
    }
}
