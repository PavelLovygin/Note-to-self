package com.example.notetoself;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.fragment.app.DialogFragment;

public class DialogNewNote extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialog_new_note, null);

        final EditText editTitle = (EditText) dialogView.findViewById(R.id.editTitle);
        final EditText editDescription = (EditText) dialogView.findViewById(R.id.editDescription);
        final CheckBox checkBoxIdea = (CheckBox) dialogView.findViewById(R.id.checkBoxIdea;
        final CheckBox checkBoxImportant = (CheckBox) dialogView.findViewById(R.id.checkBoxImportant);
        final CheckBox checkBoxTodo = (CheckBox) dialogView.findViewById(R.id.checkBoxTodo);


        builder.setView(dialogView).setMessage("Add a new note");

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }
}
