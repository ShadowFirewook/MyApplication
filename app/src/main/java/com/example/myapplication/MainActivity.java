package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class MainActivity extends AppCompatActivity {
    public static void main(String[] args) {

        ArrayList <String> Lines = new ArrayList<>();
        ArrayList <String> Lines2 =  new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String line = scanner.nextLine();
            Lines.add(line);
        }
        System.out.println(Lines);
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String line = scanner.nextLine();
            Lines2.add(line);
        }
        System.out.println(Lines2);
        Collections.reverse(Lines2);
        ArrayList <String> Lines3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Lines3.add(Lines.get(i));
            Lines3.add(Lines2.get(i));
        } System.out.println(Lines3);

        Lines3.sort(new TComparator());
        System.out.println(Lines3);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("nh");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}