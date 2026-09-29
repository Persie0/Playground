package no;

import p260m8.C7499b;
import sl.C9072e;

/* JADX INFO: renamed from: no.i1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7839i1<T> extends AbstractC7881y0 {

    /* JADX INFO: renamed from: e */
    public final C7843k<T> f42934e;

    public C7839i1(C7883z0.a aVar) {
        this.f42934e = aVar;
    }

    @Override // no.AbstractC7874v
    /* JADX INFO: renamed from: K */
    public final void mo14509K(Throwable th2) {
        Object objM15634M = m15626L().m15634M();
        boolean z10 = objM15634M instanceof C7870t;
        C7843k<T> c7843k = this.f42934e;
        if (z10) {
            c7843k.mo2031y(C7499b.m14967u(((C7870t) objM15634M).f42969a));
        } else {
            c7843k.mo2031y(C7499b.m14907H0(objM15634M));
        }
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C9072e mo528n(Throwable th2) {
        mo14509K(th2);
        return C9072e.f47360a;
    }
}
