package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000.d38;
import p000.o38;
import p000.r27;

/* JADX INFO: renamed from: com.google.android.material.datepicker.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1056d extends d38 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1061i f12908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialCalendar f12909b;

    public C1056d(MaterialCalendar materialCalendar, C1061i c1061i) {
        this.f12909b = materialCalendar;
        this.f12908a = c1061i;
    }

    @Override // p000.d38
    /* JADX INFO: renamed from: a */
    public final void mo6122a(RecyclerView recyclerView, int i) {
        MaterialCalendar materialCalendar;
        r27 r27Var;
        if (i != 0 || (r27Var = (materialCalendar = this.f12909b).f12892K0) == null) {
            return;
        }
        View viewMo20257f = r27Var.mo20257f((LinearLayoutManager) materialCalendar.f12885D0.getLayoutManager());
        if (viewMo20257f != null) {
            o38 o38VarM2699N = RecyclerView.m2699N(viewMo20257f);
            int iM17782b = o38VarM2699N != null ? o38VarM2699N.m17782b() : -1;
            if (iM17782b != -1) {
                C1061i c1061i = this.f12908a;
                materialCalendar.f12896z0 = c1061i.m6137k(iM17782b);
                materialCalendar.f12890I0.setText(c1061i.m6137k(iM17782b).m6120c());
                materialCalendar.m6113i0(iM17782b);
            }
        }
        materialCalendar.m6112h0();
    }

    @Override // p000.d38
    /* JADX INFO: renamed from: b */
    public final void mo6123b(RecyclerView recyclerView, int i, int i2) {
        MaterialCalendar materialCalendar = this.f12909b;
        RecyclerView recyclerView2 = materialCalendar.f12885D0;
        int iM2666T0 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).m2666T0() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).m2667U0();
        r27 r27Var = materialCalendar.f12892K0;
        C1061i c1061i = this.f12908a;
        if (r27Var == null) {
            materialCalendar.f12896z0 = c1061i.m6137k(iM2666T0);
        }
        materialCalendar.f12890I0.setText(c1061i.m6137k(iM2666T0).m6120c());
        materialCalendar.m6113i0(iM2666T0);
    }
}
