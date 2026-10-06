package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqa {

    /* JADX INFO: renamed from: a */
    private int f41319a;

    /* JADX INFO: renamed from: b */
    private int f41320b;

    /* JADX INFO: renamed from: c */
    private mpz f41321c;

    /* JADX INFO: renamed from: d */
    private int f41322d;

    /* JADX INFO: renamed from: e */
    private float f41323e;

    /* JADX INFO: renamed from: f */
    private int f41324f;

    /* JADX INFO: renamed from: g */
    private int f41325g;

    /* JADX INFO: renamed from: h */
    private byte f41326h;

    /* JADX INFO: renamed from: a */
    public final mqb m16792a() {
        if (this.f41326h == 63 && this.f41321c != null) {
            return new mqb(this.f41319a, this.f41320b, this.f41321c, this.f41322d, this.f41323e, this.f41324f, this.f41325g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f41326h & 1) == 0) {
            sb.append(" thumbnailImageWidthPixels");
        }
        if ((this.f41326h & 2) == 0) {
            sb.append(" thumbnailImageHeightPixels");
        }
        if (this.f41321c == null) {
            sb.append(" thumbnailImageColorspace");
        }
        if ((this.f41326h & 4) == 0) {
            sb.append(" videoFramesPerSecond");
        }
        if ((this.f41326h & 8) == 0) {
            sb.append(" audioSampleRateHz");
        }
        if ((this.f41326h & 16) == 0) {
            sb.append(" audioBytesPerSample");
        }
        if ((this.f41326h & 32) == 0) {
            sb.append(" audioNumChannels");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m16793b(int i) {
        this.f41324f = i;
        this.f41326h = (byte) (this.f41326h | 16);
    }

    /* JADX INFO: renamed from: c */
    public final void m16794c(int i) {
        this.f41325g = i;
        this.f41326h = (byte) (this.f41326h | 32);
    }

    /* JADX INFO: renamed from: d */
    public final void m16795d(float f) {
        this.f41323e = f;
        this.f41326h = (byte) (this.f41326h | 8);
    }

    /* JADX INFO: renamed from: e */
    public final void m16796e(mpz mpzVar) {
        if (mpzVar == null) {
            throw new NullPointerException("Null thumbnailImageColorspace");
        }
        this.f41321c = mpzVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m16797f(int i) {
        this.f41320b = i;
        this.f41326h = (byte) (this.f41326h | 2);
    }

    /* JADX INFO: renamed from: g */
    public final void m16798g(int i) {
        this.f41319a = i;
        this.f41326h = (byte) (this.f41326h | 1);
    }

    /* JADX INFO: renamed from: h */
    public final void m16799h(int i) {
        this.f41322d = i;
        this.f41326h = (byte) (this.f41326h | 4);
    }
}
