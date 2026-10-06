package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import p000.C0225gw;
import p000.InterfaceC0241hl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0241hl {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // p000.InterfaceC0241hl
    /* JADX INFO: renamed from: a */
    public final void mo1036a(C0225gw c0225gw) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1228aa(new LinearLayoutManager(1));
    }
}
