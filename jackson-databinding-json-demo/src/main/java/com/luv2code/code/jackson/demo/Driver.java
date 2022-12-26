package com.luv2code.code.jackson.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {

        try {

            //  create object mapper
            ObjectMapper mapper = new ObjectMapper();
            //  read JSON file and map/convert to Java POJO: data/simple-lite.json

            Student theStudent = mapper.readValue(new File("C:\\Users\\jakup.JS28130.000\\Desktop\\DESKTOP_COURSE\\Spring\\Course\\jackson-databinding-json-demo\\jackson-databinding-json-demo\\data\\sample-full.json"), Student.class);
            //  print first name and last name
            System.out.println("First name = "+theStudent.getFirstName());
            System.out.println("Last name = "+theStudent.getLastName());

            //  print out address: street and city
            Address tempAddress=theStudent.getAddress();
            System.out.println("Street = "+tempAddress.getStreet());
            System.out.println("City = "+tempAddress.getCity());

            //  print out languages
            for (String tempLanguage: theStudent.getLanguages()){
                System.out.print(tempLanguage+"\t");
            }


        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
