package com.rhythmictracks.rhythmictracks;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.io.IOException;

public class MusicPageFragment extends Fragment implements View.OnClickListener {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static MusicPageFragment newInstance(int sectionNumber) {
        MusicPageFragment fragment = new MusicPageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public MusicPageFragment() {
    }
    MediaPlayer stronger;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_music_page, container, false);

        stronger = MediaPlayer.create(getActivity(), R.raw.stronger);

        Button play = (Button) rootView.findViewById(R.id.play);
        play.setOnClickListener(this);
        return rootView;
    }

    public void onClick(View view) {

        if(stronger.isPlaying()){
            stronger.stop();
        } else {
            stronger.start();
        }
    }
}
