package com.book.methods;

public class GenericMethods {
  public static void main(String[] args) {
     // double d =3.14;
    //String middle = ArrayAlg.getMiddle("John", "Q", "Public", "");
    //double middle = ArrayAlg.getMiddle(3.14, 5, 1729, 0);
  }
static class ArrayAlg {
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
}
}
