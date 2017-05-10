package com.usher.demo.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.usher.demo.R;
import com.usher.demo.callback.PopupWindowCallBack;


/**
 * Created by UsherChen on 2017/4/13.
 * Details
 */

public class BottomMenuPopupWindow extends PopupWindow {

    private View rootView;
    private CardView cdMenu1;
    private CardView cdMenu2;
    private CardView cdMenu3;

    public BottomMenuPopupWindow(Context context, final PopupWindowCallBack callBack) {
        super(context);
        rootView = LayoutInflater.from(context).inflate(R.layout.popupwindow_menu, null);
        cdMenu1 = (CardView) rootView.findViewById(R.id.cd_menu_1);
        cdMenu2 = (CardView) rootView.findViewById(R.id.cd_menu_2);
        cdMenu3 = (CardView) rootView.findViewById(R.id.cd_menu_3);
        cdMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack.item1Opera();
                dismiss();
            }
        });
        cdMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack.item2Opera();
                dismiss();
            }
        });
        cdMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack.item3Opera();
                dismiss();
            }
        });
        //初始化PopupWindow属性
        setContentView(rootView);//设置PopupWindow的View
        setWidth(ViewGroup.LayoutParams.MATCH_PARENT);//设置PopupWindow弹出窗体的宽
        setHeight(ViewGroup.LayoutParams.MATCH_PARENT);//设置PopupWindow弹出窗体的高
        setFocusable(true);//设置PopupWindow弹出窗体可点击
        setAnimationStyle(R.style.PopupAnimation);//设置SelectPicPopupWindow弹出窗体动画效果
        setBackgroundDrawable(new ColorDrawable(context.getResources().getColor(R.color.black_transparent)));//实例化一个ColorDrawable颜色为半透明遮盖层
    }

}
