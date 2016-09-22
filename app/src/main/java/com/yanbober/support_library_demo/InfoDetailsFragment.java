package com.yanbober.support_library_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Author       : yanbo
 * Date         : 2015-06-01
 * Time         : 15:09
 * Description  :
 */
public class InfoDetailsFragment extends Fragment {


    private RecyclerView mRecyclerView;

    private int page=0;

    private int[] colors0 = {R.color.color_0, R.color.color_1, R.color.color_2, R.color.color_3,
            R.color.color_4, R.color.color_5};

    private int[] colors1 = {R.color.color_0, R.color.color_1, R.color.color_2, R.color.color_3,
            R.color.color_4, R.color.color_5, R.color.color_6, R.color.color_7,
            R.color.color_8, R.color.color_9,};

    private int[] colors2= {R.color.color_0, R.color.color_1, R.color.color_2, R.color.color_3,
            R.color.color_4, R.color.color_5, R.color.color_6, R.color.color_7,
            R.color.color_8, R.color.color_9,R.color.color_0, R.color.color_1, R.color.color_2, R.color.color_3,
            R.color.color_4, R.color.color_5};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments()!=null){

            page= getArguments().getInt("data");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRecyclerView = (RecyclerView) inflater.inflate(R.layout.info_details_fragment, container, false);
        return mRecyclerView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));


        if (page==0){

            mRecyclerView.setAdapter(new RecyclerViewAdapter(getActivity(),colors0));
        }

        if (page==1){

            mRecyclerView.setAdapter(new RecyclerViewAdapter(getActivity(),colors1));
        }

        if (page==2){

            mRecyclerView.setAdapter(new RecyclerViewAdapter(getActivity(),colors2));
        }




    }
}
