package com.tavisca.validateDB.validate;

import com.tavisca.validateDB.model.Employee;

import java.util.regex.Pattern;

public class ValidateEmployee {

    public static boolean isEmployeeValid(Employee employee){
        Pattern pattern = Pattern.compile("([a-zA-Z0-9\\.]+)@([a-zA-Z]+\\.){1,2}([a-zA-Z]{2,4})");
        if(employee != null && pattern.matcher(employee.getEmail()).find()){
            if(!employee.getName().equals(""))
                return true;
        } // add Regular Expression

        return  false;
    }
}
