package ua.dp.hillel.java15.interfaces;

/**
 * Created by stephenvolf on 25/05/17.
 */
public class Message implements Printable {
    private String text;
    private String anotherText;
    private String initializedText = "initialized";

    public Message(String someText){
        anotherText = someText;

    }


    @Override
    public void print() {
        System.out.println(text);
        System.out.println(anotherText);
        System.out.println(initializedText);
    }
}
