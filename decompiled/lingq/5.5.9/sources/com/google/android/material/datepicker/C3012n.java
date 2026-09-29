package com.google.android.material.datepicker;

import android.view.View;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;

/* JADX INFO: renamed from: com.google.android.material.datepicker.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3012n implements InterfaceC10060r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15203a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f15204b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f15205c;

    public C3012n(int i10, View view, int i11) {
        this.f15203a = i10;
        this.f15204b = view;
        this.f15205c = i11;
    }

    @Override // p471x2.InterfaceC10060r
    /* JADX INFO: renamed from: c */
    public final C10063s0 mo2934c(View view, C10063s0 c10063s0) {
        int i10 = c10063s0.m18864a(7).f44303b;
        View view2 = this.f15204b;
        int i11 = this.f15203a;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f15205c + i10, view2.getPaddingRight(), view2.getPaddingBottom());
        return c10063s0;
    }
}
