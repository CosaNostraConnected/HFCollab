package com.simon987;

/**
 * Created by Simon on 2014-08-15.
 */
public enum Entities {
    HUMAN,ZOMBIE,BLANK;

    @Override
    public String toString() {
        if(super.toString() == "HUMAN"){
            return "H ";
        }else if(super.toString() == "ZOMBIE"){
            return "Z ";
        }else{
            return ". ";
        }
    }
}
