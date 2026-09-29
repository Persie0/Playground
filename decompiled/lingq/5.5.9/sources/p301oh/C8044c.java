package p301oh;

import androidx.recyclerview.widget.C1165p;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.HashSet;
import p278nh.InterfaceC7778e;
import sl.C9072e;

/* JADX INFO: renamed from: oh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8044c extends C1165p.d {

    /* JADX INFO: renamed from: c */
    public final InterfaceC7778e f43708c;

    /* JADX INFO: renamed from: d */
    public final HashSet<Integer> f43709d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2041a<C9072e> f43710e;

    public C8044c(InterfaceC7778e interfaceC7778e, HashSet<Integer> hashSet, InterfaceC2041a<C9072e> interfaceC2041a) {
        this.f43708c = interfaceC7778e;
        this.f43709d = hashSet;
        this.f43710e = interfaceC2041a;
    }

    @Override // androidx.recyclerview.widget.C1165p.d
    /* JADX INFO: renamed from: a */
    public final void mo4521a(RecyclerView recyclerView, RecyclerView.AbstractC1109b0 abstractC1109b0) {
        C5207g.m11111f(recyclerView, "recyclerView");
        C5207g.m11111f(abstractC1109b0, "viewHolder");
        super.mo4521a(recyclerView, abstractC1109b0);
        this.f43710e.mo807E();
    }

    @Override // androidx.recyclerview.widget.C1165p.d
    /* JADX INFO: renamed from: b */
    public final int mo4522b(RecyclerView recyclerView, RecyclerView.AbstractC1109b0 abstractC1109b0) {
        C5207g.m11111f(recyclerView, "recyclerView");
        C5207g.m11111f(abstractC1109b0, "viewHolder");
        return this.f43709d.contains(Integer.valueOf(abstractC1109b0.f7059f)) ? 0 : 3342387;
    }

    @Override // androidx.recyclerview.widget.C1165p.d
    /* JADX INFO: renamed from: e */
    public final void mo4524e(RecyclerView recyclerView, RecyclerView.AbstractC1109b0 abstractC1109b0, RecyclerView.AbstractC1109b0 abstractC1109b1) {
        C5207g.m11111f(recyclerView, "recyclerView");
        C5207g.m11111f(abstractC1109b0, "viewHolder");
        this.f43708c.mo9973d(abstractC1109b0.m4241d(), abstractC1109b1.m4241d());
    }

    @Override // androidx.recyclerview.widget.C1165p.d
    /* JADX INFO: renamed from: f */
    public final void mo4525f(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        C5207g.m11111f(abstractC1109b0, "viewHolder");
        this.f43708c.mo9972c(abstractC1109b0.m4241d());
    }
}
