package com.epam.java.pdp.oca;

public class TShirt {
    static int count;
    /**
     * Here I define instance data
     */
    public String sex = "male";
    private String size = "xl";
    private String color = "white";
    private String style = "casual";
    private String secondColor;
    public TShirt (){
        count++;
        System.out.println();
        System.out.println(TShirt.count);

}

    //first constructor for TShirts that has required and optional attributes
    public TShirt (String sex, String size, String color)
    {
        // put values into instance data
        this();
        this.sex = sex;
        this.size = size;
        this.color = color;
    }
    public TShirt (String sex, String size, String color, String style, String secondColor){
        this(sex,size,color);
        this.style = style;
        this.secondColor = secondColor;
    }
    // second constructor created based on the overloading and has only required attributes
 // return the string, that returns all information about TShirt
    public String toString()
    {
        return "Sex: " + sex +
                "\nSize: " + size +
                "\nColor: " + color +
                "\nstyle: " + style +
                "\nsecondColor: "+secondColor;
    }

}
