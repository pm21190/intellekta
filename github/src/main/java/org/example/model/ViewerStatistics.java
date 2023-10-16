package org.example.model;

import java.util.List;

public class ViewerStatistics {
    public static int averageAge(List<Viewer> viewerList) {
        int sum = 0;
        for (Viewer viewer: viewerList) {
            sum+=viewer.getAge();
        }

        return sum / viewerList.size();
    }
}
