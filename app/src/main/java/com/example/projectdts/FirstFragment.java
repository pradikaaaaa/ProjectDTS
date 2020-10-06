package com.example.projectdts;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectdts.Adapter.ContactAdapter;
import com.example.projectdts.Model.Contact;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment{

    View mView;
    public RecyclerView rv;
    public ContactAdapter contactAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<Contact> listContact = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_first,container,false);

        rv = mView.findViewById(R.id.rvContact);

        daftarContact();
        contactAdapter = new ContactAdapter(listContact);
//        contactAdapter.setListener((ContactAdapter.OnContactClickListener) getActivity());

        layoutManager = new LinearLayoutManager(getActivity());
        rv.setAdapter(contactAdapter);
        rv.setLayoutManager(layoutManager);


        return mView;
    }


    private void daftarContact(){
        listContact.add(new Contact("Nabila Fitriana",
                "102018308",
                "https://jkt48.com/profile/nabila_fitriana_s.jpg"));

        listContact.add(new Contact("Jinan Safa Safira",
                "102018309",
                "https://jkt48.com/profile/jinan_safa_safira_s.jpg"));

        listContact.add(new Contact("Tan Zhui Hui Celine",
                "102018307",
                "https://jkt48.com/profile/tan_zhi_hui_celine_s.jpg"));

        listContact.add(new Contact("Freya Jayawardana",
                "102018301",
                "https://jkt48.com/profile/freya_jayawardana_s.jpg"));
    }
}