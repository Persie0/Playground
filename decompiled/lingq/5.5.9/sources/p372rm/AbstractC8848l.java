package p372rm;

import dm.C5207g;

/* JADX INFO: renamed from: rm.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8848l extends AbstractC8852n {

    /* JADX INFO: renamed from: a */
    public final AbstractC8859q0 f46733a;

    public AbstractC8848l(AbstractC8859q0 abstractC8859q0) {
        C5207g.m11111f(abstractC8859q0, "delegate");
        this.f46733a = abstractC8859q0;
    }

    @Override // p372rm.AbstractC8852n
    /* JADX INFO: renamed from: a */
    public final AbstractC8859q0 mo17094a() {
        return this.f46733a;
    }

    @Override // p372rm.AbstractC8852n
    /* JADX INFO: renamed from: b */
    public final String mo17095b() {
        return this.f46733a.mo17116b();
    }

    @Override // p372rm.AbstractC8852n
    /* JADX INFO: renamed from: d */
    public final AbstractC8852n mo17096d() {
        return C8850m.m17104g(this.f46733a.mo17118c());
    }
}
