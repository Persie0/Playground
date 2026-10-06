package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hqq {

    /* JADX INFO: renamed from: a */
    private jxn f29164a;

    /* JADX INFO: renamed from: b */
    private jxp f29165b;

    /* JADX INFO: renamed from: c */
    private mrm f29166c;

    /* JADX INFO: renamed from: d */
    private ctp f29167d;

    /* JADX INFO: renamed from: e */
    private mrm f29168e;

    /* JADX INFO: renamed from: f */
    private hqo f29169f;

    /* JADX INFO: renamed from: g */
    private long f29170g;

    /* JADX INFO: renamed from: h */
    private long f29171h;

    /* JADX INFO: renamed from: i */
    private long f29172i;

    /* JADX INFO: renamed from: j */
    private long f29173j;

    /* JADX INFO: renamed from: k */
    private int f29174k;

    /* JADX INFO: renamed from: l */
    private String f29175l;

    /* JADX INFO: renamed from: m */
    private boolean f29176m;

    /* JADX INFO: renamed from: n */
    private gyv f29177n;

    /* JADX INFO: renamed from: o */
    private byte f29178o;

    public hqq() {
    }

    public hqq(byte[] bArr) {
        mqu mquVar = mqu.f41450a;
        this.f29166c = mquVar;
        this.f29168e = mquVar;
    }

    /* JADX INFO: renamed from: a */
    public final hqr m10620a() {
        jxn jxnVar;
        jxp jxpVar;
        ctp ctpVar;
        hqo hqoVar;
        String str;
        gyv gyvVar;
        if (this.f29178o == 63 && (jxnVar = this.f29164a) != null && (jxpVar = this.f29165b) != null && (ctpVar = this.f29167d) != null && (hqoVar = this.f29169f) != null && (str = this.f29175l) != null && (gyvVar = this.f29177n) != null) {
            return new hqr(jxnVar, jxpVar, this.f29166c, ctpVar, this.f29168e, hqoVar, this.f29170g, this.f29171h, this.f29172i, this.f29173j, this.f29174k, str, this.f29176m, gyvVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f29164a == null) {
            sb.append(" camcorderCaptureRate");
        }
        if (this.f29165b == null) {
            sb.append(" camcorderVideoResolution");
        }
        if (this.f29167d == null) {
            sb.append(" outputVideo");
        }
        if (this.f29169f == null) {
            sb.append(" timelapseMode");
        }
        if ((this.f29178o & 1) == 0) {
            sb.append(" recordingDurationMs");
        }
        if ((this.f29178o & 2) == 0) {
            sb.append(" outputDurationMs");
        }
        if ((this.f29178o & 4) == 0) {
            sb.append(" frameCount");
        }
        if ((this.f29178o & 8) == 0) {
            sb.append(" frameDropped");
        }
        if ((this.f29178o & 16) == 0) {
            sb.append(" orientation");
        }
        if (this.f29175l == null) {
            sb.append(" title");
        }
        if ((this.f29178o & 32) == 0) {
            sb.append(" isSecureVideo");
        }
        if (this.f29177n == null) {
            sb.append(" shotInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m10621b(jxp jxpVar) {
        if (jxpVar == null) {
            throw new NullPointerException("Null camcorderVideoResolution");
        }
        this.f29165b = jxpVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m10622c(long j) {
        this.f29172i = j;
        this.f29178o = (byte) (this.f29178o | 4);
    }

    /* JADX INFO: renamed from: d */
    public final void m10623d(long j) {
        this.f29173j = j;
        this.f29178o = (byte) (this.f29178o | 8);
    }

    /* JADX INFO: renamed from: e */
    public final void m10624e(boolean z) {
        this.f29176m = z;
        this.f29178o = (byte) (this.f29178o | 32);
    }

    /* JADX INFO: renamed from: f */
    public final void m10625f(mrm mrmVar) {
        if (mrmVar == null) {
            throw new NullPointerException("Null location");
        }
        this.f29168e = mrmVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m10626g(int i) {
        this.f29174k = i;
        this.f29178o = (byte) (this.f29178o | 16);
    }

    /* JADX INFO: renamed from: h */
    public final void m10627h(long j) {
        this.f29171h = j;
        this.f29178o = (byte) (this.f29178o | 2);
    }

    /* JADX INFO: renamed from: i */
    public final void m10628i(ctp ctpVar) {
        if (ctpVar == null) {
            throw new NullPointerException("Null outputVideo");
        }
        this.f29167d = ctpVar;
    }

    /* JADX INFO: renamed from: j */
    public final void m10629j(long j) {
        this.f29170g = j;
        this.f29178o = (byte) (this.f29178o | 1);
    }

    /* JADX INFO: renamed from: k */
    public final void m10630k(gyv gyvVar) {
        if (gyvVar == null) {
            throw new NullPointerException("Null shotInfo");
        }
        this.f29177n = gyvVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m10631l(hqo hqoVar) {
        if (hqoVar == null) {
            throw new NullPointerException("Null timelapseMode");
        }
        this.f29169f = hqoVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m10632m(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.f29175l = str;
    }

    /* JADX INFO: renamed from: n */
    public final void m10633n(mrm mrmVar) {
        if (mrmVar == null) {
            throw new NullPointerException("Null videoFile");
        }
        this.f29166c = mrmVar;
    }

    /* JADX INFO: renamed from: o */
    public final void m10634o(jxn jxnVar) {
        if (jxnVar == null) {
            throw new NullPointerException("Null camcorderCaptureRate");
        }
        this.f29164a = jxnVar;
    }
}
