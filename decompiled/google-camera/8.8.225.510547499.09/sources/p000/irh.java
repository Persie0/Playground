package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class irh {

    /* JADX INFO: renamed from: a */
    public long f31903a;

    /* JADX INFO: renamed from: b */
    public long f31904b;

    /* JADX INFO: renamed from: c */
    public boolean f31905c;

    /* JADX INFO: renamed from: d */
    public final kbo f31906d;

    public irh(kbo kboVar) {
        this.f31906d = kboVar;
    }

    /* JADX INFO: renamed from: a */
    public final long m11647a() {
        return this.f31905c ? (this.f31904b + System.currentTimeMillis()) - this.f31903a : this.f31904b;
    }

    /* JADX INFO: renamed from: b */
    public final void m11648b() {
        if (this.f31905c) {
            this.f31906d.mo13947i("onSessionStart failed because session is already started!");
        } else {
            this.f31905c = true;
            this.f31903a = System.currentTimeMillis();
        }
    }
}
