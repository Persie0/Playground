package p000;

import com.google.android.gms.dynamite.p017ho.DNTdN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eay {

    /* JADX INFO: renamed from: a */
    public String f13150a;

    /* JADX INFO: renamed from: b */
    public String f13151b;

    /* JADX INFO: renamed from: c */
    public dzk f13152c;

    /* JADX INFO: renamed from: d */
    private boolean f13153d;

    /* JADX INFO: renamed from: e */
    private float f13154e;

    /* JADX INFO: renamed from: f */
    private float f13155f;

    /* JADX INFO: renamed from: g */
    private float f13156g;

    /* JADX INFO: renamed from: h */
    private int f13157h;

    /* JADX INFO: renamed from: i */
    private byte f13158i;

    /* JADX INFO: renamed from: a */
    public final edn m7029a() {
        if (this.f13158i == 31) {
            return new edn(this.f13150a, this.f13151b, this.f13152c, this.f13153d, this.f13154e, this.f13155f, this.f13156g, this.f13157h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f13158i & 1) == 0) {
            sb.append(" secondary");
        }
        if ((this.f13158i & 2) == 0) {
            sb.append(" boostBigOption");
        }
        if ((this.f13158i & 4) == 0) {
            sb.append(DNTdN.mFCoXPHjIBSdu);
        }
        if ((this.f13158i & 8) == 0) {
            sb.append(" boostLittleOption");
        }
        if ((this.f13158i & 16) == 0) {
            sb.append(" cpuAffinityMask");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m7030b(float f) {
        this.f13154e = f;
        this.f13158i = (byte) (this.f13158i | 2);
    }

    /* JADX INFO: renamed from: c */
    public final void m7031c(float f) {
        this.f13156g = f;
        this.f13158i = (byte) (this.f13158i | 8);
    }

    /* JADX INFO: renamed from: d */
    public final void m7032d(float f) {
        this.f13155f = f;
        this.f13158i = (byte) (this.f13158i | 4);
    }

    /* JADX INFO: renamed from: e */
    public final void m7033e(int i) {
        this.f13157h = i;
        this.f13158i = (byte) (this.f13158i | 16);
    }

    /* JADX INFO: renamed from: f */
    public final void m7034f(boolean z) {
        this.f13153d = z;
        this.f13158i = (byte) (this.f13158i | 1);
    }
}
