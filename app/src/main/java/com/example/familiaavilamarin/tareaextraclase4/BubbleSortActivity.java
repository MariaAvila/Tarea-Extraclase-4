package com.example.familiaavilamarin.tareaextraclase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class BubbleSortActivity extends AppCompatActivity {
    public Button createButton;
    public Button sortButton;
    public List toSort = new List();
    public TextView showList;
    public TextView showIterations;
    public int count = 0;
    public int n = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_sort);
        createButton = findViewById(R.id.CreateList);
        sortButton = findViewById(R.id.SortList);
        showList = findViewById(R.id.NumberView);
        showIterations = findViewById(R.id.counterNumber);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSort = CreateList(toSort);
                n = 0;
                showIterations.setText(Integer.toString(n));
            }
        });

        sortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bubbleSort(toSort,count);
            }
        });

    }

    public List CreateList(List AList){
        AList = new List();
        Random randomElements = new Random();
        int Elements = randomElements.nextInt(21);
        for(int i = 0; i< 20+Elements; i++){
            Random randomNumber = new Random();
            int number = randomNumber.nextInt(101);
            AList.AddElement(new Node(number));
        }
        String text = "";
        Node helper = AList.getFirst();
        while (helper != null){
            text = text + Integer.toString(helper.getValor())+ " ";
            helper = helper.getNext();
        }
        showList.setText(text);
        return AList;
    }

    public void bubbleSort(List toBeSort, int iterations) {

        int n = toBeSort.largo();
        int temp = 0;

        for (int i = 0; i < n; i++) {
            Node helper = toBeSort.getFirst();
            Node helperNext = helper.getNext();

            for (int j = 1; j < (n - i); j++) {

                if (helper.getValor() > helperNext.getValor()) {
                    temp = helper.getValor();
                    helper.setValor(helperNext.getValor());
                    helperNext.setValor(temp);
                    iterations++;
                    String text = "";
                    Node lister = toBeSort.getFirst();
                    while (lister != null){
                        text = text + Integer.toString(lister.getValor())+ " ";
                        lister = lister.getNext();
                    }
                    showList.setText(text);

                }
                helper = helper.getNext();
                helperNext = helperNext.getNext();

            }

        }
        String text = "";
        Node lister = toBeSort.getFirst();
        while (lister != null){
            text = text + Integer.toString(lister.getValor())+ " ";
            lister = lister.getNext();
        }
        showList.setText(text);
        showIterations.setText(Integer.toString(iterations));
    }
}
