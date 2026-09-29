package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.x */
/* JADX INFO: loaded from: classes.dex */
public class C3022x extends LinearLayoutManager {
    public C3022x(int i10) {
        super(i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: E0 */
    public final void mo4110E0(RecyclerView recyclerView, int i10) {
        C3021w c3021w = new C3021w(recyclerView.getContext());
        c3021w.f7125a = i10;
        m4302F0(c3021w);
    }
}
