package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class otg extends ouc {

    /* JADX INFO: renamed from: a */
    public final ote f46520a;

    /* JADX INFO: renamed from: b */
    public final opx f46521b;

    public otg(ote oteVar, opx opxVar) {
        this.f46520a = oteVar;
        this.f46521b = opxVar;
    }

    @Override // p000.oue
    /* JADX INFO: renamed from: b */
    public final void mo19031b(Object obj) {
        this.f46520a.f46516a = obj;
        this.f46521b.mo18877l();
    }

    @Override // p000.ouc
    /* JADX INFO: renamed from: c */
    public final void mo19032c(otw otwVar) {
        Object objM18886A;
        if (otwVar.f46551a == null) {
            objM18886A = this.f46521b.mo18874i(false);
        } else {
            objM18886A = ((opy) this.f46521b).m18886A(new oqg(otwVar.m19069e()), null);
        }
        if (objM18886A != null) {
            this.f46520a.f46516a = otwVar;
            this.f46521b.mo18877l();
        }
    }

    @Override // p000.oue
    /* JADX INFO: renamed from: d */
    public final oxz mo19033d(Object obj) {
        opx opxVar = this.f46521b;
        Object obj2 = this.f46520a.f46517b;
        if (((opy) opxVar).m18886A(true, null) == null) {
            return null;
        }
        boolean z = oqu.f46432a;
        return opz.f46411a;
    }

    @Override // p000.oxp
    public final String toString() {
        return "ReceiveHasNext@".concat(String.valueOf(oqv.m18921b(this)));
    }
}
