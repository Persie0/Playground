package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mzm extends mtu {

    /* JADX INFO: renamed from: a */
    final Comparable f41844a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mzp f41845b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzm(mzp mzpVar, Comparable comparable) {
        super(comparable);
        this.f41845b = mzpVar;
        this.f41844a = mzpVar.last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.mtu
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo16924a(Object obj) {
        if (mzp.m17187T(obj, this.f41844a)) {
            return null;
        }
        return this.f41845b.f41669a.mo17021d(obj);
    }
}
