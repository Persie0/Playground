package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mzn extends mtu {

    /* JADX INFO: renamed from: a */
    final Comparable f41846a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mzp f41847b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzn(mzp mzpVar, Comparable comparable) {
        super(comparable);
        this.f41847b = mzpVar;
        this.f41846a = mzpVar.first();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.mtu
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo16924a(Object obj) {
        if (mzp.m17187T(obj, this.f41846a)) {
            return null;
        }
        return this.f41847b.f41669a.mo17023f(obj);
    }
}
