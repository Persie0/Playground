package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: renamed from: com.google.android.material.snackbar.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3066e implements SwipeDismissBehavior.InterfaceC2951b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15592a;

    public C3066e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15592a = baseTransientBottomBar;
    }

    /* JADX INFO: renamed from: a */
    public final void m8846a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f15592a.m8834b(0);
    }
}
