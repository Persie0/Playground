package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1153g0 extends RecyclerView.AbstractC1117j {

    /* JADX INFO: renamed from: g */
    public boolean f7288g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1117j
    /* JADX INFO: renamed from: a */
    public final boolean mo4273a(RecyclerView.AbstractC1109b0 abstractC1109b0, RecyclerView.AbstractC1109b0 abstractC1109b1, RecyclerView.AbstractC1117j.c cVar, RecyclerView.AbstractC1117j.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f7081a;
        int i13 = cVar.f7082b;
        if (abstractC1109b1.m4254q()) {
            int i14 = cVar.f7081a;
            i11 = cVar.f7082b;
            i10 = i14;
        } else {
            i10 = cVar2.f7081a;
            i11 = cVar2.f7082b;
        }
        return mo4479j(abstractC1109b0, abstractC1109b1, i12, i13, i10, i11);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: i */
    public abstract void mo4478i(RecyclerView.AbstractC1109b0 abstractC1109b0);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: j */
    public abstract boolean mo4479j(RecyclerView.AbstractC1109b0 abstractC1109b0, RecyclerView.AbstractC1109b0 abstractC1109b1, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: k */
    public abstract boolean mo4480k(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: l */
    public abstract void mo4481l(RecyclerView.AbstractC1109b0 abstractC1109b0);
}
