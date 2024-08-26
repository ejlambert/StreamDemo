package com.revature;
import java.util.*;

public class Stream {

    public void streamIterate(List<Assoiciate> associateList) {
        associateList.stream().forEach(associate -> {System.out.println(associate.getName());});
    }

    public void streamFilter(List<Assoiciate> associateList, String filter) {
        associateList.stream().filter(associate -> associate.getName().contains(filter)).forEach(associate -> {System.out.println(associate.getName());});
    }

    public int streamMax(int[] array) throws IllegalArgumentException {
        if(array == null) {
            throw new IllegalArgumentException("Can't process a null array.");
        }
        return Arrays.stream(array).max().getAsInt();
    }

    public double streamAverage(int[] array) throws IllegalArgumentException {
        if(array == null) {
            throw new IllegalArgumentException("Can't process a null array.");
        }
        return Arrays.stream(array).average().getAsDouble();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Stream stream = new Stream();

        List<Assoiciate> associateList = new ArrayList<>();

        associateList.add(new Assoiciate("John", 25));
        associateList.add(new Assoiciate("Jane", 30));
        associateList.add(new Assoiciate("Jim", 35));

        System.out.println("Iterating over all list: ");
        stream.streamIterate(associateList);
        System.out.println();

        String filter = "n";
        System.out.println("Iterating over list with filter(" + filter + ")");
        stream.streamFilter(associateList, filter);
    }
}