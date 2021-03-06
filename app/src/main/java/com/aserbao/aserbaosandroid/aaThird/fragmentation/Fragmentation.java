package com.aserbao.aserbaosandroid.aaThird.fragmentation;

import android.view.View;

import com.example.base.base.BaseRecyclerViewActivity;
import com.example.base.base.beans.BaseRecyclerBean;

public class Fragmentation extends BaseRecyclerViewActivity {

    @Override
    public void initGetData() {
        mBaseRecyclerBean.add(new BaseRecyclerBean("防GooglePlay交互Demo（流式栈设计）"));
        mBaseRecyclerBean.add(new BaseRecyclerBean("防微信交互Demo(常用栈设计)"));
        mBaseRecyclerBean.add(new BaseRecyclerBean("防知乎交互Demo（复杂栈嵌套设计）"));
    }

    @Override
    public void itemClickBack(View view, int position, boolean isLongClick, int comeFrom) {
        switch (position){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
    }
}
