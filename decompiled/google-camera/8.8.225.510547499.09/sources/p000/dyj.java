package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyj {

    /* JADX INFO: renamed from: a */
    public mrm f12912a;

    /* JADX INFO: renamed from: b */
    public mrm f12913b;

    /* JADX INFO: renamed from: c */
    private long f12914c;

    /* JADX INFO: renamed from: d */
    private float f12915d;

    /* JADX INFO: renamed from: e */
    private float f12916e;

    /* JADX INFO: renamed from: f */
    private byte f12917f;

    public dyj() {
    }

    public dyj(byte[] bArr) {
        mqu mquVar = mqu.f41450a;
        this.f12912a = mquVar;
        this.f12913b = mquVar;
    }

    /* JADX INFO: renamed from: a */
    public final dyk m6929a() {
        if (this.f12917f == 7) {
            return new dyk(this.f12914c, this.f12912a, this.f12915d, this.f12913b, this.f12916e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f12917f & 1) == 0) {
            sb.append(" trackId");
        }
        if ((this.f12917f & 2) == 0) {
            sb.append(" score");
        }
        if ((this.f12917f & 4) == 0) {
            sb.append(" aggregatedToneConfidence");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m6930b(float f) {
        this.f12916e = f;
        this.f12917f = (byte) (this.f12917f | 4);
    }

    /* JADX INFO: renamed from: c */
    public final void m6931c(float f) {
        this.f12915d = f;
        this.f12917f = (byte) (this.f12917f | 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m6932d(long j) {
        this.f12914c = j;
        this.f12917f = (byte) (this.f12917f | 1);
    }
}
