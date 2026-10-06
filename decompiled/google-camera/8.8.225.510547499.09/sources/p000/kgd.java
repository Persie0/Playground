package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgd {

    /* JADX INFO: renamed from: a */
    private boolean f35873a;

    /* JADX INFO: renamed from: b */
    private byte f35874b;

    /* JADX INFO: renamed from: c */
    private int f35875c;

    /* JADX INFO: renamed from: d */
    private int f35876d;

    /* JADX INFO: renamed from: e */
    private int f35877e;

    /* JADX INFO: renamed from: a */
    public final kge m14182a() {
        int i;
        int i2;
        int i3;
        if (this.f35874b == 1 && (i = this.f35875c) != 0 && (i2 = this.f35876d) != 0 && (i3 = this.f35877e) != 0) {
            return new kge(i, i2, i3, this.f35873a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f35875c == 0) {
            sb.append(" exposure");
        }
        if (this.f35876d == 0) {
            sb.append(" focus");
        }
        if (this.f35877e == 0) {
            sb.append(" whiteBalance");
        }
        if (this.f35874b == 0) {
            sb.append(" forCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m14183b(int i) {
        if (i == 0) {
            throw new NullPointerException("Null exposure");
        }
        this.f35875c = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m14184c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null focus");
        }
        this.f35876d = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m14185d(boolean z) {
        this.f35873a = z;
        this.f35874b = (byte) 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m14186e(int i) {
        if (i == 0) {
            throw new NullPointerException("Null whiteBalance");
        }
        this.f35877e = i;
    }
}
