package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Viewer {
    private String nickName;
    private int age;
    private int filmCount;
}
