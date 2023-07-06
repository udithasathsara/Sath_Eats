package com.example.sath_eats.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sath_eats.R;
import com.example.sath_eats.adapters.DailyMealAdapter;
import com.example.sath_eats.databinding.DailyMealFragmentBinding;
import com.example.sath_eats.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {
    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    private @NonNull DailyMealFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = DailyMealFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","30% OFF","Description Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"Lunch","10% OFF","Description Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"Dinner","20% OFF","Description Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets,"Sweets","40% OFF","Description Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe,"Coffees","30% OFF","Description Description"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}