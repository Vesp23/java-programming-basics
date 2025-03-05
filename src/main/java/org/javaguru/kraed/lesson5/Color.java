package org.javaguru.kraed.lesson5;

public class Color {

    public String defineColor(int length) {
        if (length >= 380 && length <= 449) {
            return "Violet";
        } else if (length >= 450 && length <= 494){
            return "blue";
        }else if (length >= 495 && length <= 569){
            return "green";
        } else if (length >= 570 && length <= 589){
            return "yellow";
        }else if (length >= 590 && length <= 619){
            return "orange";
        }else if (length >= 620 && length <= 750){
            return "Red";
        } else {
            return "Invisible light";
        }



    }
}
