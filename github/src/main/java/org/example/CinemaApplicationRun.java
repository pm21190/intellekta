package org.example;

import org.example.model.Viewer;
import org.example.model.ViewerStatistics;

import java.util.ArrayList;
import java.util.Arrays;

public class CinemaApplicationRun {
    public static void main(String[] args) {

        ArrayList<Viewer> viewers = new ArrayList<>();
        viewers.addAll(Arrays.asList(
          new Viewer("1", 10),
                new Viewer("2", 20),
                new Viewer("3", 30),
                new Viewer("4", 40),
                new Viewer("5", 50)
        ));

        int avgAge = ViewerStatistics.averageAge(viewers);
        System.out.println(avgAge);
    }
}