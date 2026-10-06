package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbb implements cbc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cbc f4944a;

    /* JADX INFO: renamed from: b */
    private volatile Object f4945b;

    public cbb(cbc cbcVar) {
        this.f4944a = cbcVar;
    }

    @Override // p000.cbc
    /* JADX INFO: renamed from: a */
    public final Object mo2844a() {
        if (this.f4945b == null) {
            synchronized (this) {
                if (this.f4945b == null) {
                    Object objMo2844a = this.f4944a.mo2844a();
                    bzq.m3278r(objMo2844a);
                    this.f4945b = objMo2844a;
                }
            }
        }
        return this.f4945b;
    }
}
