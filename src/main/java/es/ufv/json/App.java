package es.ufv.json;

import es.ufv.json.InputOutput.InputOutput;
import es.ufv.json.model.Email;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Reading Json!" );

        InputOutput inputOutput = new InputOutput();
        Email email = inputOutput.readJson("email.json");

        ArrayList<Email> emails = inputOutput.readEMails("ListEmails.json");
//        System.out.println(emails);
//
//        System.out.println(email);
//
        System.out.println( email.getTo() );

    }
}
