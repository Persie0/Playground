package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.InterfaceC0229k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0229k {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0229k
    /* JADX INFO: renamed from: b */
    public final void mo237b(C0224f c0224f) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
