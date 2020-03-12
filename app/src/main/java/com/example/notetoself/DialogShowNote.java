package com.example.notetoself;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

public class DialogShowNote extends DialogFragment {
    private Note note;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialog_show_note, null);

        final TextView textViewImportant = (TextView) dialogView.findViewById(R.id.textViewImportant);
        final TextView textViewTodo = (TextView) dialogView.findViewById(R.id.textViewTodo);
        final TextView textViewIdea = (TextView) dialogView.findViewById(R.id.textViewIdea);
        final TextView txtTitle = (TextView) dialogView.findViewById(R.id.txtTitle);
        final TextView txtDescription = (TextView) dialogView.findViewById(R.id.txtDescription);
        final Button btnOk = (Button) dialogView.findViewById(R.id.btnOk);

        txtTitle.setText(note.getTitle());
        txtDescription.setText(note.getDescription());

        if(!note.isImportant()){
            textViewImportant.setVisibility(View.GONE);
        }
        if(!note.isTodo()){
            textViewTodo.setVisibility(View.GONE);
        }
        if(!note.isIdea()){
            textViewIdea.setVisibility(View.GONE);
        }

        btnOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dismiss();
            }
        });
        builder.setView(dialogView);
        return builder.create();
    }

    public void sendNoteSelected(Note noteSelected) {
        note = noteSelected;
    }
}
