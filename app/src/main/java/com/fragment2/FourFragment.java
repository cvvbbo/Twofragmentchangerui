package com.fragment2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by xiong on 2017/12/12.
 */

public class FourFragment extends BaseFragment {


    private Button bt;

    public static Myinterface.changerThirdFragment  changerThirdFragment;

    public static void getThirdFragment(Myinterface.changerThirdFragment changerThirdFragment){
        FourFragment.changerThirdFragment=changerThirdFragment;
    }


    @Override
    public int getlayout() {
        return R.layout.fragment_four;
    }




    @Override
    public void initview() {

        //这个方法能注释掉是因为thirdFragment方法没有调用Fourfragment里面的方法
       //ThirdFragment.getFourFragment(this);

        bt = (Button) view.findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1.怎么拿到上一个view的控件？
                Log.e("--","--执行了么");
                /***同一个fragment的事务才能对其进行操作  1.10***/
               /***如果不是使用同一个事务返都返不会来***/
                getChildFragmentManager().popBackStack();

                changerThirdFragment.ThirdFragmentCallback();

            }
        });

    }


}
