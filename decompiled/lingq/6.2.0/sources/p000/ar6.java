package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ar6 extends m88 {

    /* JADX INFO: renamed from: c */
    public final xv5 f7387c;

    /* JADX INFO: renamed from: d */
    public final long f7388d;

    public ar6(xv5 xv5Var, long j) {
        this.f7387c = xv5Var;
        this.f7388d = j;
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: b */
    public final long mo3001b() {
        return this.f7388d;
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: c */
    public final xv5 mo3002c() {
        return this.f7387c;
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: e */
    public final hj0 mo3003e() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
