package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oui extends oug {

    /* JADX INFO: renamed from: a */
    public final opx f46572a;

    /* JADX INFO: renamed from: b */
    private final Object f46573b;

    public oui(Object obj, opx opxVar) {
        this.f46573b = obj;
        this.f46572a = opxVar;
    }

    @Override // p000.oug
    /* JADX INFO: renamed from: c */
    public final Object mo19067c() {
        return this.f46573b;
    }

    @Override // p000.oug
    /* JADX INFO: renamed from: g */
    public final void mo19071g() {
        this.f46572a.mo18877l();
    }

    @Override // p000.oug
    /* JADX INFO: renamed from: h */
    public final void mo19072h(otw otwVar) {
        this.f46572a.mo18640e(lkm.m15591r(otwVar.m19070f()));
    }

    @Override // p000.oug
    /* JADX INFO: renamed from: i */
    public final oxz mo19073i() {
        if (this.f46572a.mo18874i(oki.f46196a) == null) {
            return null;
        }
        boolean z = oqu.f46432a;
        return opz.f46411a;
    }

    @Override // p000.oxp
    public final String toString() {
        return oqv.m18920a(this) + "@" + oqv.m18921b(this) + "(" + this.f46573b + ")";
    }
}
