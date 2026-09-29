package p261m9;

/* JADX INFO: renamed from: m9.d */
/* JADX INFO: loaded from: classes.dex */
public class C7503d implements InterfaceC7520u {

    /* JADX INFO: renamed from: a */
    public final long f41467a;

    /* JADX INFO: renamed from: b */
    public final long f41468b;

    /* JADX INFO: renamed from: c */
    public final int f41469c;

    /* JADX INFO: renamed from: d */
    public final long f41470d;

    /* JADX INFO: renamed from: e */
    public final int f41471e;

    /* JADX INFO: renamed from: f */
    public final long f41472f;

    /* JADX INFO: renamed from: g */
    public final boolean f41473g;

    public C7503d(int i10, int i11, long j10, long j11, boolean z10) {
        this.f41467a = j10;
        this.f41468b = j11;
        this.f41469c = i11 == -1 ? 1 : i11;
        this.f41471e = i10;
        this.f41473g = z10;
        if (j10 == -1) {
            this.f41470d = -1L;
            this.f41472f = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.f41470d = j12;
            this.f41472f = ((Math.max(0L, j12) * 8) * 1000000) / ((long) i10);
        }
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: b */
    public final boolean mo14982b() {
        if (this.f41470d == -1 && !this.f41473g) {
            return false;
        }
        return true;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: h */
    public final InterfaceC7520u.a mo14983h(long j10) {
        long j11 = this.f41470d;
        long j12 = this.f41468b;
        if (j11 == -1 && !this.f41473g) {
            C7521v c7521v = new C7521v(0L, j12);
            return new InterfaceC7520u.a(c7521v, c7521v);
        }
        int i10 = this.f41471e;
        long j13 = this.f41469c;
        long jMin = (((((long) i10) * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L) + j12;
        long jMax2 = ((Math.max(0L, jMax - j12) * 8) * 1000000) / ((long) i10);
        C7521v c7521v2 = new C7521v(jMax2, jMax);
        if (j11 != -1 && jMax2 < j10) {
            long j14 = j13 + jMax;
            if (j14 < this.f41467a) {
                return new InterfaceC7520u.a(c7521v2, new C7521v(((Math.max(0L, j14 - j12) * 8) * 1000000) / ((long) i10), j14));
            }
        }
        return new InterfaceC7520u.a(c7521v2, c7521v2);
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: i */
    public final long mo14984i() {
        return this.f41472f;
    }
}
