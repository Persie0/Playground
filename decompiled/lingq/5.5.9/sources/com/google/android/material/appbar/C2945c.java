package com.google.android.material.appbar;

import android.view.View;
import p497y2.InterfaceC10288j;

/* JADX INFO: renamed from: com.google.android.material.appbar.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2945c implements InterfaceC10288j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppBarLayout f14718a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f14719b;

    public C2945c(AppBarLayout appBarLayout, boolean z10) {
        this.f14718a = appBarLayout;
        this.f14719b = z10;
    }

    @Override // p497y2.InterfaceC10288j
    /* JADX INFO: renamed from: a */
    public final boolean mo4689a(View view) {
        this.f14718a.setExpanded(this.f14719b);
        return true;
    }
}
