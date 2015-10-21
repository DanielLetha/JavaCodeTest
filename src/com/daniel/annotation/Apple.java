package com.daniel.annotation;
import com.daniel.annotation.FruitColor.Color;
/**
 * Created by daniel on 15/10/14.
 */
public class Apple {
    @FruitName("Apple")
    public String appleName;
    @FruitColor(fruitColor=Color.RED)
    public String appleColor;

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public void display(){
        System.out.print("the name of friut is: apple");

    }
}

