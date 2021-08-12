package com.bagas.a10118397_joss;
/*nama : bagas wirawan
  NIM : 10118397
  Kelas : IF9
  Tanggal : 02-August-2021 - 08-August-2021
* */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import com.bagas.a10118397_joss.R;
import com.bagas.a10118397_joss.databinding.FragmentDashboardBinding;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class DashboardFragment extends Fragment {
    RecyclerView recyclerView;
    WisataAdapter wisataAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.rv_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        FirebaseRecyclerOptions<WisataModel> options =
                new FirebaseRecyclerOptions.Builder<WisataModel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("wisata"), WisataModel.class)
                        .build();
        wisataAdapter = new WisataAdapter(options);
        recyclerView.setAdapter(wisataAdapter);
        return view;
    }
    @Override
    public void onStart() {
        super.onStart();
        wisataAdapter.startListening();
    }
    @Override
    public void onStop() {
        super.onStop();
        wisataAdapter.stopListening();
    }
}








