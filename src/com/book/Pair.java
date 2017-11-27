package com.book;

public class Pair<T> {
  private T first;
  private T secomd;

  public Pair() {
    first = null;
    secomd = null;
  }

    public Pair(T first, T second) {
        this.first=first;
        this.secomd=second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return secomd;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecomd(T secomd) {
        this.secomd = secomd;
    }
}
