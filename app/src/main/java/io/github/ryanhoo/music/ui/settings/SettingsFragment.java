package io.github.ryanhoo.music.ui.settings;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.polaric.colorful.ColorPickerDialog;
import org.polaric.colorful.Colorful;

import io.github.ryanhoo.music.R;
import io.github.ryanhoo.music.ui.base.BaseFragment;

/**
 * Created with Android Studio.
 * User: ryan.hoo.j@gmail.com
 * Date: 9/1/16
 * Time: 9:59 PM
 * Desc: SettingsFragment
 */
public class SettingsFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorPickerDialog dialog = new ColorPickerDialog(getContext());
                dialog.setOnColorSelectedListener(new ColorPickerDialog.OnColorSelectedListener() {
                    @Override
                    public void onColorSelected(Colorful.ThemeColor color) {
                        //TODO: Do something with the color
                        Colorful.config(getContext())
                                .primaryColor(color)
                                .translucent(false)
                                .dark(true)
                                .apply();
                    }
                });
                dialog.show();
            }
        });

        return view;
    }
}
