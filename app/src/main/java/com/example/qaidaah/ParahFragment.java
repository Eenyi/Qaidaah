package com.example.qaidaah;

import static android.R.layout.simple_list_item_1;

import android.R.layout;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ParahFragment extends Fragment {
    ListView items;
    public ArrayList<menuItem> list;
    public ParahFragment() { }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_parah, container, false);
        items = view.findViewById(R.id.parahList);
        list = getParachDetails();
        ArrayAdapter arrayAdapter;
        arrayAdapter = new ArrayAdapter<menuItem>(getActivity(), layout.simple_list_item_1, list);
        items.setAdapter(arrayAdapter);
        items.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                menuItem selectedItem = (menuItem) parent.getAdapter().getItem(position);
                Intent intent = new Intent(getActivity(), Translation.class);
                intent.putExtra("number", selectedItem.getNumber().toString());
                intent.putExtra("name", selectedItem.getName());
                startActivity(intent);
            }
        });
        return view;
    }

    private ArrayList<menuItem> getParachDetails() {
        ArrayList<menuItem> items = new ArrayList<menuItem>();
        menuItem p1 = new menuItem(1,"الم"); items.add(p1);
        menuItem p2 = new menuItem(2,"سَيَقُولُ"); items.add(p2);
        menuItem p3 = new menuItem(3,"تِلْكَ الرُّسُلُ"); items.add(p3);
        menuItem p4 = new menuItem(4,"لَنْ تَنَالُوا"); items.add(p4);
        menuItem p5 = new menuItem(5,"وَالْمُحْصَنَاتُ"); items.add(p5);
        menuItem p6 = new menuItem(6,"لَا يُحِبُّ اللَّهُ"); items.add(p6);
        menuItem p7 = new menuItem(7,"وَإِذَا سَمِعُوا"); items.add(p7);
        menuItem p8 = new menuItem(8,"وَلَوْ أَنَّنَا"); items.add(p8);
        menuItem p9 = new menuItem(9,"قَالَ الْمَلَأُ"); items.add(p9);
        menuItem p10 = new menuItem(10,"وَاعْلَمُوا"); items.add(p10);
        menuItem p11 = new menuItem(11,"يَعْتَذِرُونَ"); items.add(p11);
        menuItem p12 = new menuItem(12,"وَمَا مِنْ دَابَّةٍ"); items.add(p12);
        menuItem p13 = new menuItem(13,"وَمَا أُبَرِّئُ"); items.add(p13);
        menuItem p14 = new menuItem(14,"رُبَمَا"); items.add(p14);
        menuItem p15 = new menuItem(15,"سُبْحَانَ الَّذِي"); items.add(p15);
        menuItem p16 = new menuItem(16,"قَالَ أَلَمْ"); items.add(p16);
        menuItem p17 = new menuItem(17,"اقْتَرَبَ"); items.add(p17);
        menuItem p18 = new menuItem(18,"قَدْ أَفْلَحَ"); items.add(p18);
        menuItem p19 = new menuItem(19,"وَقَالَ الَّذِينَ"); items.add(p19);
        menuItem p20 = new menuItem(20,"أَمَّنْ خَلَقَ"); items.add(p20);
        menuItem p21 = new menuItem(21,"اتْلُ مَا أُوحِيَ"); items.add(p21);
        menuItem p22 = new menuItem(22,"وَمَنْ يَقْنُتْ"); items.add(p22);
        menuItem p23 = new menuItem(23,"وَمَا لِيَ"); items.add(p23);
        menuItem p24 = new menuItem(24,"فَمَنْ أَظْلَمُ"); items.add(p24);
        menuItem p25 = new menuItem(25,"إِلَيْهِ يُرَدُّ"); items.add(p25);
        menuItem p26 = new menuItem(26, "حم"); items.add(p26);
        menuItem p27 = new menuItem(27, "قَالَ فَمَا خَطْبُكُمْ"); items.add(p27);
        menuItem p28 = new menuItem(28,"قَدْ سَمِعَ اللَّهُ"); items.add(p28);
        menuItem p29 = new menuItem(29,"تَبَارَكَ الَّذِي"); items.add(p29);
        menuItem p30 = new menuItem(30, "عَمَّ يَتَسَاءَلُونَ"); items.add(p30);
        return items;
    }
}