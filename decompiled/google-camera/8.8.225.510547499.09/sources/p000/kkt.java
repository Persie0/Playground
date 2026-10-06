package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kkt {

    /* JADX INFO: renamed from: a */
    public final long f36409a;

    /* JADX INFO: renamed from: b */
    public volatile long f36410b;

    public kkt(long j, long j2) {
        this.f36410b = j;
        this.f36409a = j2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14466a(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f36410b;
        long j5 = j3 + j4;
        if (j5 == 0) {
            return true;
        }
        long j6 = this.f36409a;
        if (j6 == 0 || j5 >= j6 || j5 <= (-j6)) {
            return false;
        }
        this.f36410b = j4 - j5;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14467b(long j, long j2) {
        return ((j2 - j) - this.f36410b) + this.f36409a < 0;
    }
}
