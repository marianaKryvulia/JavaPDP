package com.epam.java.pdp.oca;

public class TShits {
    /**
     * Here I define instance data
     */
    private String sex;
    private String size;
    private String color;
    private String style;
    private String secondColor;
    //first constructor for TShirts that has required and optional attributes
    public TShits(String sex, String size, String color, String style, String secondColor){
       // put values into instance data
        this.sex = sex;
        this.size = size;
        this.color = color;
        this.style = style;
        this.secondColor = secondColor;
    }
    // second constructor created based on the overloading and
/** public TShits(String sex, String size, String color, String style, String secondColor){
        // put values into instance data
        this.sex = sex;
        this.size = size;
        this.color = color;
        style = "casual";
        secondColor = "";
    }
 */
 // return the string, that returns all information about TShirts
    public String toString()
    {
        return "Sex: " + sex +
                "\nSize: " + size +
                "\nColor: " + color +
                "\nstyle: " + style +
                "\nsecondColor: "+secondColor;
    }
    // new method that changes the style
    public void setStyle (String newStyle)
    {
        style =  newStyle;
    }
}
