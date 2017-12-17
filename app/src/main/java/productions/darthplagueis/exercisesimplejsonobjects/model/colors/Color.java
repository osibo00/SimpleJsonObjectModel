package productions.darthplagueis.exercisesimplejsonobjects.model.colors;

import productions.darthplagueis.exercisesimplejsonobjects.model.colors.Code;

/**
 * {
 "colors": [
 {
 "color": "black",
 "category": "hue",
 "type": "primary",
 "code": {
 "rgba": [255,255,255,1],
 "hex": "#000"
 }
 },
 {
 "color": "white",
 "category": "value",
 "code": {
 "rgba": [0,0,0,1],
 "hex": "#FFF"
 }
 },
 {
 "color": "red",
 "category": "hue",
 "type": "primary",
 "code": {
 "rgba": [255,0,0,1],
 "hex": "#FF0"
 }
 },
 {
 "color": "blue",
 "category": "hue",
 "type": "primary",
 "code": {
 "rgba": [0,0,255,1],
 "hex": "#00F"
 }
 },
 {
 "color": "yellow",
 "category": "hue",
 "type": "primary",
 "code": {
 "rgba": [255,255,0,1],
 "hex": "#FF0"
 }
 },
 {
 "color": "green",
 "category": "hue",
 "type": "secondary",
 "code": {
 "rgba": [0,255,0,1],
 "hex": "#0F0"
 }
 }
 ]
 }
 */

public class Color {
    private String color;
    private String category;
    private String type;
    private Code code;

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public Code getCode() {
        return code;
    }
}
