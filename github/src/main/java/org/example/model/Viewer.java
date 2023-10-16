package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.List;

@Data
public class Viewer {
    private String nickName;
    private int age;

    private List<Cinema> cinemaList;

    public Viewer() {
        cinemaList = new ArrayList<>();
    }

    public Viewer(String nickName, int age) {
        this();
        this.nickName = nickName;
        this.age = age;
    }

    public int filmCount() {
        return cinemaList.size();
    }
}
