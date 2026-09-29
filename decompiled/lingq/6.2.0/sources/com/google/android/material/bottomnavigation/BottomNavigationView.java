package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.navigation.AbstractC1067d;
import p000.dg0;
import p000.dy9;
import p000.eg0;
import p000.fg0;
import p000.gka;
import p000.p84;
import p000.sq5;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends AbstractC1067d {
    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        sq5 sq5VarM10752e = dy9.m10752e(getContext(), attributeSet, R$styleable.BottomNavigationView, i, i2, new int[0]);
        int i3 = R$styleable.BottomNavigationView_itemHorizontalTranslationEnabled;
        TypedArray typedArray = (TypedArray) sq5VarM10752e.f61249c;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(i3, true));
        if (typedArray.hasValue(R$styleable.BottomNavigationView_android_minHeight)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(R$styleable.BottomNavigationView_android_minHeight, 0));
        }
        sq5VarM10752e.m21582y();
        gka.m12722a(this, new p84(8));
    }

    @Override // com.google.android.material.navigation.AbstractC1067d
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) == 1073741824 || suggestedMinimumHeight <= 0) {
            iMakeMeasureSpec = i2;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Integer.MIN_VALUE);
        }
        super.onMeasure(i, iMakeMeasureSpec);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        dg0 dg0Var = (dg0) getMenuView();
        if (dg0Var.f35579A0 != z) {
            dg0Var.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo703c(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(eg0 eg0Var) {
        setOnItemReselectedListener(eg0Var);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(fg0 fg0Var) {
        setOnItemSelectedListener(fg0Var);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }
}
