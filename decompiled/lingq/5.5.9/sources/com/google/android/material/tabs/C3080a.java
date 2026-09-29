package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p177ic.C6308a;
import p507yc.C10347n;

/* JADX INFO: renamed from: com.google.android.material.tabs.a */
/* JADX INFO: loaded from: classes.dex */
public class C3080a {
    /* JADX INFO: renamed from: a */
    public static RectF m8879a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f15631c0 || !(view instanceof TabLayout.C3078i)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.C3078i c3078i = (TabLayout.C3078i) view;
        int contentWidth = c3078i.getContentWidth();
        int contentHeight = c3078i.getContentHeight();
        int iM19362b = (int) C10347n.m19362b(24, c3078i.getContext());
        if (contentWidth < iM19362b) {
            contentWidth = iM19362b;
        }
        int right = (c3078i.getRight() + c3078i.getLeft()) / 2;
        int bottom = (c3078i.getBottom() + c3078i.getTop()) / 2;
        int i10 = contentWidth / 2;
        return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
    }

    /* JADX INFO: renamed from: b */
    public void mo8880b(TabLayout tabLayout, View view, View view2, float f3, Drawable drawable) {
        RectF rectFM8879a = m8879a(tabLayout, view);
        RectF rectFM8879a2 = m8879a(tabLayout, view2);
        drawable.setBounds(C6308a.m12937b(f3, (int) rectFM8879a.left, (int) rectFM8879a2.left), drawable.getBounds().top, C6308a.m12937b(f3, (int) rectFM8879a.right, (int) rectFM8879a2.right), drawable.getBounds().bottom);
    }
}
