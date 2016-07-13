package com.twilio.example;


import com.twilio.sdk.Twilio;
import com.twilio.sdk.creator.api.v2010.account.IncomingPhoneNumberCreator;
import com.twilio.sdk.reader.api.v2010.account.MessageReader;
import com.twilio.sdk.reader.api.v2010.account.availablephonenumbercountry.LocalReader;
import com.twilio.sdk.resource.api.v2010.account.IncomingPhoneNumber;
import com.twilio.sdk.resource.api.v2010.account.Message;
import com.twilio.sdk.resource.api.v2010.account.availablephonenumbercountry.Local;
import com.twilio.sdk.type.PhoneNumber;
import com.twilio.twiml.TwiMLException;

import java.util.Iterator;

public class Example {

    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static final PhoneNumber PHONE_NUMBER = new PhoneNumber("+18885551234");

    /**
     * Example Twilio usage.
     *
     * @param args command line args
     * @throws TwiMLException if unable to generate TwiML
     */
    public static void main(String[] args) throws TwiMLException {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

//        // Get a number
//        IncomingPhoneNumber number = buyNumber();
//        System.out.println(number.getPhoneNumber());
//
//        // Send a text message
//        Message message = new MessageCreator(
//            ACCOUNT_SID,
//            PHONE_NUMBER,
//            "Hello world!",
//            number.getPhoneNumber()
//        ).execute();
//
//        System.out.println(message.getSid());
//        System.out.println(message.getBody());
//
//        // Make a phone call
//        Call call = new CallCreator(
//            ACCOUNT_SID,
//            PHONE_NUMBER,
//            number.getPhoneNumber(),
//            URI.create("https://twilio.com")
//        ).execute();
//        System.out.println(call.getSid());

        // Print all the messages
        Iterable<Message> messages = new MessageReader().execute();
        for (Message m : messages) {
            System.out.println(m.getSid());
            System.out.println(m.getBody());
        }
//
//        // Get some calls
//        Iterable<Call> calls = new CallReader(ACCOUNT_SID).pageSize(2).execute();
//        for (Call c : calls) {
//            System.out.println(c.getSid());
//        }
//
//        Trunk trunk = new TrunkCreator()
//            .setFriendlyName("shiny trunk")
//            .setSecure(false)
//            .execute();
//
//        System.out.println(trunk);
//
//        // Delete a resource
//        Service service = Service.create().execute();
//        boolean result = Service.delete(service.getSid()).execute();
//        System.out.println(result);
//
//        // TwiML
//        TwiML twiml = new VoiceResponse.Builder()
//            .say(new Say.Builder("Hello World!").build())
//            .play(new Play.Builder("https://api.twilio.com/cowbell.mp3").loop(5).build())
//            .build();
//        System.out.println(twiml.toXml());
    }

    private static IncomingPhoneNumber buyNumber() {
        // Look up some phone numbers
        Iterable<Local> numbers = new LocalReader(ACCOUNT_SID, "US").execute();

        // Buy the first phone number
        Iterator<Local> iter = numbers.iterator();
        if (iter.hasNext()) {
            Local local = iter.next();
            return new IncomingPhoneNumberCreator(
                ACCOUNT_SID,
                local.getPhoneNumber()
            ).execute();
        }

        return null;
    }

}