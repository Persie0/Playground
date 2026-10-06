package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gtj implements gti {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gti f26357a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f26358b;

    public gtj(gti gtiVar, long j) {
        this.f26357a = gtiVar;
        this.f26358b = j;
    }

    @Override // p000.gti
    /* JADX INFO: renamed from: a */
    public final int mo9756a() {
        return this.f26357a.mo9756a();
    }

    @Override // p000.gti
    /* JADX INFO: renamed from: b */
    public final dtp mo9757b() {
        return this.f26357a.mo9757b();
    }

    @Override // p000.gti
    /* JADX INFO: renamed from: c */
    public final gth mo9758c(long j) {
        gth gthVarMo9759d = this.f26357a.mo9759d(j);
        if (gthVarMo9759d == null || Math.abs(gthVarMo9759d.f26339a - j) > this.f26358b) {
            return null;
        }
        return gthVarMo9759d;
    }

    @Override // p000.gti
    /* JADX INFO: renamed from: d */
    public final gth mo9759d(long j) {
        return this.f26357a.mo9759d(j);
    }

    @Override // p000.gti
    /* JADX INFO: renamed from: e */
    public final void mo9760e() {
        this.f26357a.mo9760e();
    }

    public final String toString() {
        return String.valueOf(this.f26357a) + "[maxTimeDiffNs=" + this.f26358b + "]";
    }
}
