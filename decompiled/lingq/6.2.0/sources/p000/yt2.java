package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class yt2 extends nn1 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f70438f = 0;

    /* JADX INFO: renamed from: c */
    public long f70439c;

    /* JADX INFO: renamed from: d */
    public boolean f70440d;

    /* JADX INFO: renamed from: e */
    public C0825bv f70441e;

    @Override // p000.nn1
    /* JADX INFO: renamed from: Z */
    public final nn1 mo387Z(int i) {
        l70.m15942e(1);
        return this;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m25311g0(boolean z) {
        long j = this.f70439c - (z ? 4294967296L : 1L);
        this.f70439c = j;
        if (j <= 0 && this.f70440d) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m25312h0(lh2 lh2Var) {
        C0825bv c0825bv = this.f70441e;
        if (c0825bv == null) {
            c0825bv = new C0825bv();
            this.f70441e = c0825bv;
        }
        c0825bv.addLast(lh2Var);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m25313i0(boolean z) {
        this.f70439c = (z ? 4294967296L : 1L) + this.f70439c;
        if (z) {
            return;
        }
        this.f70440d = true;
    }

    /* JADX INFO: renamed from: j0 */
    public abstract long mo10652j0();

    /* JADX INFO: renamed from: k0 */
    public final boolean m25314k0() {
        C0825bv c0825bv = this.f70441e;
        if (c0825bv == null) {
            return false;
        }
        lh2 lh2Var = (lh2) (c0825bv.isEmpty() ? null : c0825bv.removeFirst());
        if (lh2Var == null) {
            return false;
        }
        lh2Var.run();
        return true;
    }

    public abstract void shutdown();
}
