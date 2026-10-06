package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kyu {

    /* JADX INFO: renamed from: a */
    public Object f37742a;

    /* JADX INFO: renamed from: b */
    public Object f37743b;

    /* JADX INFO: renamed from: c */
    private int f37744c;

    /* JADX INFO: renamed from: d */
    private int f37745d;

    /* JADX INFO: renamed from: e */
    private byte f37746e;

    /* JADX INFO: renamed from: a */
    public final kyv m15065a() {
        Object obj;
        Object obj2;
        if (this.f37746e == 3 && (obj = this.f37742a) != null && (obj2 = this.f37743b) != null) {
            return new kyv((String) obj, (String) obj2, this.f37744c, this.f37745d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f37742a == null) {
            sb.append(" mime");
        }
        if (this.f37743b == null) {
            sb.append(" semantic");
        }
        if ((this.f37746e & 1) == 0) {
            sb.append(" length");
        }
        if ((this.f37746e & 2) == 0) {
            sb.append(" padding");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m15066b(int i) {
        this.f37744c = i;
        this.f37746e = (byte) (this.f37746e | 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m15067c(int i) {
        this.f37745d = i;
        this.f37746e = (byte) (this.f37746e | 2);
    }

    /* JADX INFO: renamed from: d */
    public final heg m15068d() {
        Object obj;
        Object obj2;
        if (this.f37746e == 7 && (obj = this.f37742a) != null && (obj2 = this.f37743b) != null) {
            return new heg(this.f37744c, this.f37745d, (hev) obj, (ikw) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f37746e & 1) == 0) {
            sb.append(" numFramesPerSample");
        }
        if ((this.f37746e & 2) == 0) {
            sb.append(" numSuccessiveSamplesRequired");
        }
        if (this.f37742a == null) {
            sb.append(" suggestion");
        }
        if (this.f37743b == null) {
            sb.append(" applicationMode");
        }
        if ((this.f37746e & 4) == 0) {
            sb.append(" scoreThreshold");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: e */
    public final void m15069e(ikw ikwVar) {
        if (ikwVar == null) {
            throw new NullPointerException("Null applicationMode");
        }
        this.f37743b = ikwVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m15070f(int i) {
        this.f37744c = i;
        this.f37746e = (byte) (this.f37746e | 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m15071g(int i) {
        this.f37745d = i;
        this.f37746e = (byte) (this.f37746e | 2);
    }

    /* JADX INFO: renamed from: h */
    public final void m15072h() {
        this.f37746e = (byte) (this.f37746e | 4);
    }
}
