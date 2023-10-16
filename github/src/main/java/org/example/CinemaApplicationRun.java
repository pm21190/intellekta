package org.example;

import org.example.model.Viewer;
import org.example.model.ViewerStatistics;

import java.util.ArrayList;
import java.util.Arrays;

public class CinemaApplicationRun {
    public static void main(String[] args) {

        ArrayList<Viewer> viewers = new ArrayList<>();
        viewers.addAll(Arrays.asList(
          new Viewer("1", 10, 100),
                new Viewer("2", 20, 200),
                new Viewer("3", 30, 300),
                new Viewer("4", 40, 400),
                new Viewer("5", 50, 500)
        ));

        int avgAge = ViewerStatistics.averageAge(viewers);
        System.out.println(avgAge);
    }
}