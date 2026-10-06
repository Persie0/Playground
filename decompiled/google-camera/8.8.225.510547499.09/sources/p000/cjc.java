package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjc {

    /* JADX INFO: renamed from: a */
    public final nqf f5916a;

    /* JADX INFO: renamed from: b */
    private long f5917b;

    public cjc(int i) {
        lku.m15669w(true);
        this.f5916a = nqf.m17621g();
        this.f5917b = i;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3819a() {
        long j = this.f5917b - 1;
        this.f5917b = j;
        if (j <= 0) {
            this.f5916a.mo14894e(null);
        }
    }
}
