package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhy implements bhi, bhz {

    /* JADX INFO: renamed from: a */
    public final boolean f3392a;

    /* JADX INFO: renamed from: b */
    public final bie f3393b;

    /* JADX INFO: renamed from: c */
    public final bie f3394c;

    /* JADX INFO: renamed from: d */
    public final bie f3395d;

    /* JADX INFO: renamed from: e */
    public final int f3396e;

    /* JADX INFO: renamed from: f */
    private final List f3397f = new ArrayList();

    public bhy(bkc bkcVar, bka bkaVar) {
        this.f3392a = bkaVar.f3563d;
        this.f3396e = bkaVar.f3564e;
        bie bieVarMo2524a = bkaVar.f3560a.mo2524a();
        this.f3393b = bieVarMo2524a;
        bie bieVarMo2524a2 = bkaVar.f3561b.mo2524a();
        this.f3394c = bieVarMo2524a2;
        bie bieVarMo2524a3 = bkaVar.f3562c.mo2524a();
        this.f3395d = bieVarMo2524a3;
        bkcVar.m2534h(bieVarMo2524a);
        bkcVar.m2534h(bieVarMo2524a2);
        bkcVar.m2534h(bieVarMo2524a3);
        bieVarMo2524a.m2494g(this);
        bieVarMo2524a2.m2494g(this);
        bieVarMo2524a3.m2494g(this);
    }

    /* JADX INFO: renamed from: a */
    final void m2479a(bhz bhzVar) {
        this.f3397f.add(bhzVar);
    }

    @Override // p000.bhz
    /* JADX INFO: renamed from: c */
    public final void mo2465c() {
        for (int i = 0; i < this.f3397f.size(); i++) {
            ((bhz) this.f3397f.get(i)).mo2465c();
        }
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: e */
    public final void mo2467e(List list, List list2) {
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        throw null;
    }
}
