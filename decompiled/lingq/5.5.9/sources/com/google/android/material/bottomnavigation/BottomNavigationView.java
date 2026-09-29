package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0300b1;
import com.google.android.material.navigation.NavigationBarView;
import com.linguist.R;
import lc.C7299b;
import lc.C7300c;
import p153hc.C6031a;
import p507yc.C10344k;
import p507yc.C10347n;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends NavigationBarView {

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    @Deprecated
    public interface InterfaceC2957a extends NavigationBarView.InterfaceC3043a {
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    @Deprecated
    public interface InterfaceC2958b extends NavigationBarView.InterfaceC3044b {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0300b1 c0300b1M19358e = C10344k.m19358e(getContext(), attributeSet, C6031a.f35655e, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        setItemHorizontalTranslationEnabled(c0300b1M19358e.m1112a(2, true));
        if (c0300b1M19358e.m1123l(0)) {
            setMinimumHeight(c0300b1M19358e.m1115d(0, 0));
        }
        c0300b1M19358e.m1112a(1, true);
        c0300b1M19358e.m1124n();
        C10347n.m19361a(this, new C7300c());
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) != 1073741824 && suggestedMinimumHeight > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        C7299b c7299b = (C7299b) getMenuView();
        if (c7299b.f40913h0 != z10) {
            c7299b.setItemHorizontalTranslationEnabled(z10);
            getPresenter().mo896d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC2957a interfaceC2957a) {
        setOnItemReselectedListener(interfaceC2957a);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC2958b interfaceC2958b) {
        setOnItemSelectedListener(interfaceC2958b);
    }
}
