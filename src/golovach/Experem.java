package golovach;

import java.util.List;

public class Experem <T>{
    private T t;

    public Experem(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <T extends Number> T someMet(T t){
        return t;
    }
}
