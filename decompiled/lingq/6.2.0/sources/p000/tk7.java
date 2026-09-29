package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class tk7 extends nf9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62452a;

    /* JADX INFO: renamed from: b */
    public final long f62453b;

    /* JADX INFO: renamed from: c */
    public final long f62454c;

    public tk7(int i, long j, long j2) {
        this.f62452a = i;
        switch (i) {
            case 1:
                this.f62453b = j;
                this.f62454c = j2;
                break;
            default:
                this.f62453b = j2;
                this.f62454c = j;
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m22187d(long j, k47 k47Var) {
        long jM14842z = k47Var.m14842z();
        if ((128 & jM14842z) != 0) {
            return 8589934591L & ((((jM14842z & 1) << 32) | k47Var.m14807B()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // p000.nf9
    public final String toString() {
        switch (this.f62452a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.f62453b);
                sb.append(", identifier= ");
                return wq1.m24113i(this.f62454c, " }", sb);
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.f62453b);
                sb2.append(", playbackPositionUs= ");
                return wq1.m24113i(this.f62454c, " }", sb2);
        }
    }
}
