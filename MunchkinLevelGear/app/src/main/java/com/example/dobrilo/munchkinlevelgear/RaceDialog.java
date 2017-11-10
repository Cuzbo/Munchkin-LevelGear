package com.example.dobrilo.munchkinlevelgear;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

/**
 * Created by Dobrilo on 7.11.2017..
 */

public class RaceDialog extends DialogFragment implements View.OnClickListener{

    Button ok;
    View view;
    Communicator communicator;
    CheckBox dwarf, elf, halfling, human;

    @Override
    public void onAttach(Activity activity) {
        communicator = (Communicator) activity;
        super.onAttach(activity);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.race_layout, container, false);

        dwarf = view.findViewById(R.id.dwarf);
        dwarf.setOnClickListener(this);

        elf = view.findViewById(R.id.elf);
        elf.setOnClickListener(this);

        halfling = view.findViewById(R.id.halfling);
        halfling.setOnClickListener(this);

        human = view.findViewById(R.id.human);
        human.setOnClickListener(this);

        ok = (Button) view.findViewById(R.id.raceOk);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        return view;
    }

    @Override
    public void onClick(View v) {
        CheckBox checked = (CheckBox)v;
        if (checked.isChecked()){
            communicator.onCheckedRaceDialogMessage(checked.getText().toString());
        }
        else {
            communicator.onUnceckedRaceDialogMessage(checked.getText().toString());
        }
    }


    public interface Communicator{
        public void onCheckedRaceDialogMessage (String message);

        public void onUnceckedRaceDialogMessage(String message);
    }

}
