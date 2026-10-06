package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class otf extends ouc {

    /* JADX INFO: renamed from: a */
    public final opx f46518a;

    /* JADX INFO: renamed from: b */
    public final int f46519b;

    public otf(opx opxVar, int i) {
        this.f46518a = opxVar;
        this.f46519b = i;
    }

    /* JADX INFO: renamed from: a */
    public final Object m19030a(Object obj) {
        return this.f46519b == 1 ? otu.m19065a(obj) : obj;
    }

    @Override // p000.oue
    /* JADX INFO: renamed from: b */
    public final void mo19031b(Object obj) {
        this.f46518a.mo18877l();
    }

    @Override // p000.ouc
    /* JADX INFO: renamed from: c */
    public final void mo19032c(otw otwVar) {
        otwVar.getClass();
        if (this.f46519b == 1) {
            this.f46518a.mo18640e(otu.m19065a(ooc.m18751q(otwVar.f46551a)));
        } else {
            this.f46518a.mo18640e(lkm.m15591r(otwVar.m19069e()));
        }
    }

    @Override // p000.oue
    /* JADX INFO: renamed from: d */
    public final oxz mo19033d(Object obj) {
        if (((opy) this.f46518a).m18886A(m19030a(obj), null) == null) {
            return null;
        }
        boolean z = oqu.f46432a;
        return opz.f46411a;
    }

    @Override // p000.oxp
    public final String toString() {
        return "ReceiveElement@" + oqv.m18921b(this) + "[receiveMode=" + this.f46519b + "]";
    }
}
