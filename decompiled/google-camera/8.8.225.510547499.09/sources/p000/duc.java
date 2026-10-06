package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class duc {

    /* JADX INFO: renamed from: a */
    public final List f12578a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f12579b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public dth f12580c = dtm.f12560a;

    /* JADX INFO: renamed from: d */
    public final List f12581d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final dvg f12582e;

    public duc(dvg dvgVar) {
        this.f12582e = dvgVar;
    }

    /* JADX INFO: renamed from: a */
    public final dug m6749a() {
        dua duaVar = new dua(this, 0);
        return new dug(this.f12582e, this.f12580c, new dtv(this, 0), duaVar, new dub(this));
    }

    /* JADX INFO: renamed from: b */
    public final void m6750b(dte dteVar) {
        this.f12579b.add(dteVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m6751c(dtf dtfVar) {
        this.f12578a.add(dtfVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m6752d(duf dufVar) {
        m6750b(new dtv(dufVar, 1));
    }
}
