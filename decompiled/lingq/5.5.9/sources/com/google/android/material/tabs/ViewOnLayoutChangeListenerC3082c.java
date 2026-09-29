package com.google.android.material.tabs;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.tabs.c */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC3082c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f15693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TabLayout.C3078i f15694b;

    public ViewOnLayoutChangeListenerC3082c(TabLayout.C3078i c3078i, View view) {
        this.f15694b = c3078i;
        this.f15693a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f15693a;
        if (view2.getVisibility() == 0) {
            this.f15694b.m8874c(view2);
        }
    }
}
