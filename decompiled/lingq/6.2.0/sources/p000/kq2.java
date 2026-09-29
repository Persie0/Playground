package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kq2 extends d32 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3370nf f48314h;

    public kq2(C3370nf c3370nf) {
        this.f48314h = c3370nf;
    }

    @Override // p000.d32
    /* JADX INFO: renamed from: a0 */
    public final void mo10069a0(Throwable th) {
        ((pq2) this.f48314h.f52663b).m19453f(th);
    }

    @Override // p000.d32
    /* JADX INFO: renamed from: b0 */
    public final void mo10070b0(C3329mb c3329mb) {
        C3370nf c3370nf = this.f48314h;
        c3370nf.f52664c = c3329mb;
        C3329mb c3329mb2 = (C3329mb) c3370nf.f52664c;
        pq2 pq2Var = (pq2) c3370nf.f52663b;
        c3370nf.f52662a = new gv5(c3329mb2, pq2Var.f56654g, pq2Var.f56656i, jcd.m14396a());
        pq2 pq2Var2 = (pq2) c3370nf.f52663b;
        ArrayList arrayList = new ArrayList();
        pq2Var2.f56648a.writeLock().lock();
        try {
            pq2Var2.f56650c = 1;
            arrayList.addAll(pq2Var2.f56649b);
            pq2Var2.f56649b.clear();
            pq2Var2.f56648a.writeLock().unlock();
            pq2Var2.f56651d.post(new nq2(arrayList, pq2Var2.f56650c, null));
        } catch (Throwable th) {
            pq2Var2.f56648a.writeLock().unlock();
            throw th;
        }
    }
}
