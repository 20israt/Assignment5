package com.example.assignment5;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Pastry", "Pastries are known for their flaky, crumbly textures and are used to create both savory and sweet dishes.", R.drawable.pastry));
        items.add(new Item("Chocolate Shake", "A chocolate shake is a rich and creamy beverage made by blending milk, chocolate with ice cream.", R.drawable.img));
        items.add(new Item("Croissant", "A croissant is a flaky, buttery, crescent-shaped pastry originating from France.", R.drawable.img_1));
        items.add(new Item("Cold Coffee", "Cold coffee is a refreshing beverage made with coffee, milk, sugar, and ice, blended or served chilled.", R.drawable.img_2));
        items.add(new Item("Ice Cream", "Ice cream is a frozen dessert made from milk, cream, sugar, and flavorings.", R.drawable.img_3));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}