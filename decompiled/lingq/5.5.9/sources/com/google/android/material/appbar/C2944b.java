package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p497y2.InterfaceC10288j;

/* JADX INFO: renamed from: com.google.android.material.appbar.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2944b implements InterfaceC10288j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f14713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppBarLayout f14714b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f14715c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f14716d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AppBarLayout.BaseBehavior f14717e;

    public C2944b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f14717e = baseBehavior;
        this.f14713a = coordinatorLayout;
        this.f14714b = appBarLayout;
        this.f14715c = view;
        this.f14716d = i10;
    }

    @Override // p497y2.InterfaceC10288j
    /* JADX INFO: renamed from: a */
    public final boolean mo4689a(View view) {
        this.f14717e.m8554E(this.f14713a, this.f14714b, this.f14715c, this.f14716d, new int[]{0, 0});
        return true;
    }
}
