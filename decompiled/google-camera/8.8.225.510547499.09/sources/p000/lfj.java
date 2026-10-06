package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfj implements lfi {

    /* JADX INFO: renamed from: a */
    public final nps f38124a;

    /* JADX INFO: renamed from: b */
    public final nps f38125b;

    /* JADX INFO: renamed from: c */
    public final nps f38126c;

    /* JADX INFO: renamed from: d */
    public final nps f38127d;

    /* JADX INFO: renamed from: i */
    public boolean f38132i;

    /* JADX INFO: renamed from: j */
    private final lfn f38133j;

    /* JADX INFO: renamed from: k */
    private final boolean f38134k;

    /* JADX INFO: renamed from: l */
    private boolean f38135l;

    /* JADX INFO: renamed from: h */
    public final List f38131h = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final nqf f38128e = nqf.m17621g();

    /* JADX INFO: renamed from: f */
    public final nqf f38129f = nqf.m17621g();

    /* JADX INFO: renamed from: g */
    public final nqf f38130g = nqf.m17621g();

    public lfj(nps npsVar, nps npsVar2, nps npsVar3, nps npsVar4, boolean z, Executor executor) {
        this.f38124a = npsVar;
        this.f38125b = npsVar2;
        this.f38126c = npsVar3;
        this.f38127d = npsVar4;
        this.f38134k = z;
        this.f38133j = new lfn(executor);
    }

    @Override // p000.lfi
    /* JADX INFO: renamed from: a */
    public final nps mo8460a() {
        return this.f38130g;
    }

    @Override // p000.lfi
    /* JADX INFO: renamed from: b */
    public final synchronized void mo8461b() {
        if (this.f38135l) {
            throw new IllegalStateException("Muxer already started. Cannot call start twice.");
        }
        this.f38135l = true;
        this.f38130g.mo2282d(new kxw(this, 12), this.f38133j);
        this.f38128e.mo16665f(nod.m17554j(kxk.m14962H(this.f38124a, this.f38125b, this.f38126c, this.f38127d), new cnc(this, 10), this.f38133j));
        ArrayList arrayListM16498F = mkv.m16498F();
        arrayListM16498F.add(this.f38128e);
        Iterator it = this.f38131h.iterator();
        while (it.hasNext()) {
            arrayListM16498F.add(((lfl) it.next()).f38137b);
        }
        kxk.m14961G(arrayListM16498F).mo2282d(new kxw(this, 13), this.f38133j);
        ArrayList arrayListM16498F2 = mkv.m16498F();
        Iterator it2 = this.f38131h.iterator();
        while (it2.hasNext()) {
            arrayListM16498F2.add(((lfl) it2.next()).f38140e);
        }
        kxk.m14961G(arrayListM16498F2).mo2282d(new kxw(this, 14), this.f38133j);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, nps] */
    @Override // p000.lfi
    /* JADX INFO: renamed from: c */
    public final synchronized lfk mo8462c(lhz lhzVar) {
        if (this.f38135l) {
            throw new IllegalStateException("Muxer already started. No tracks can be added now.");
        }
        lfl lflVar = new lfl(lhzVar.f38277a, new lfn(this.f38133j));
        this.f38131h.add(lflVar);
        if (!this.f38134k) {
            return lflVar;
        }
        return new lfh(lflVar);
    }
}
