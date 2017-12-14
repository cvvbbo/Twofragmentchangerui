package com.fragment2;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/**
 * Created by xiong on 2017/12/12.
 */

public class ThirdFragment extends BaseFragment implements Myinterface.changerThirdFragment{


    private Button bt;
    private LinearLayout ly;
    private FrameLayout fl;

    public static Myinterface.changerFourfragment changerFourfragment;

    @Override
    public int getlayout() {
        return R.layout.fragment_third;
    }

    public static void getFourFragment(Myinterface.changerFourfragment changerFourfragment){
        ThirdFragment.changerFourfragment=changerFourfragment;


    }

    @Override
    public void initview() {

        //这里的这个不能注释掉，因为这个的实例是用来调用ThirdFragment的方法的12.14
        FourFragment.getThirdFragment(this);
//        fragmenttoFragment.Callback();
        bt = (Button) view.findViewById(R.id.bt);
        ly = (LinearLayout) view.findViewById(R.id.ly);
        fl = (FrameLayout) view.findViewById(R.id.fl);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transation();

            }
        });

    }



    public void transation(){
       ly.setVisibility(View.GONE);
        getChildFragmentManager().beginTransaction().add(R.id.fl,new FourFragment()).addToBackStack(null).commit();
    }







    @Override
    public void ThirdFragmentCallback() {
        ly.setVisibility(View.VISIBLE);
    }
}
