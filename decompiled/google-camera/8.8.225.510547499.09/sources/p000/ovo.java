package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ovo implements orf {

    /* JADX INFO: renamed from: a */
    public final ovq f46664a;

    /* JADX INFO: renamed from: b */
    public final long f46665b;

    /* JADX INFO: renamed from: c */
    public final Object f46666c;

    /* JADX INFO: renamed from: d */
    public final ols f46667d;

    public ovo(ovq ovqVar, long j, Object obj, ols olsVar) {
        this.f46664a = ovqVar;
        this.f46665b = j;
        this.f46666c = obj;
        this.f46667d = olsVar;
    }

    @Override // p000.orf
    /* JADX INFO: renamed from: cF */
    public final void mo18947cF() {
        ovq ovqVar = this.f46664a;
        synchronized (ovqVar) {
            if (this.f46665b < ovqVar.m19099c()) {
                return;
            }
            Object[] objArr = ovqVar.f46675a;
            objArr.getClass();
            if (ovr.m19104a(objArr, this.f46665b) != this) {
                return;
            }
            ovr.m19105b(objArr, this.f46665b, ovr.f46682a);
            ovqVar.m19101f();
        }
    }
}
