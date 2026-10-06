package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfo extends bfn {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ bfp f3118c;

    /* JADX INFO: renamed from: d */
    private final String f3119d;

    /* JADX INFO: renamed from: e */
    private final Iterator f3120e;

    /* JADX INFO: renamed from: f */
    private int f3121f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfo(bfp bfpVar, bfu bfuVar) {
        super(bfpVar);
        this.f3118c = bfpVar;
        this.f3121f = 0;
        if (bfuVar.m2340g().m2395n()) {
            bfpVar.f3123b = bfuVar.f3130a;
        }
        this.f3119d = m2321a(bfuVar, null, 1);
        this.f3120e = bfuVar.m2341h();
    }

    @Override // p000.bfn, java.util.Iterator
    public final boolean hasNext() {
        if (this.f3111b != null) {
            return true;
        }
        if (!this.f3120e.hasNext()) {
            return false;
        }
        bfu bfuVar = (bfu) this.f3120e.next();
        this.f3121f++;
        String strM2321a = null;
        if (bfuVar.m2340g().m2395n()) {
            this.f3118c.f3123b = bfuVar.f3130a;
        } else if (bfuVar.f3132c != null) {
            strM2321a = m2321a(bfuVar, this.f3119d, this.f3121f);
        }
        if (this.f3118c.f3122a.m2379b() && bfuVar.m2352s()) {
            return hasNext();
        }
        this.f3111b = m2319b(bfuVar, this.f3118c.f3123b, strM2321a);
        return true;
    }
}
