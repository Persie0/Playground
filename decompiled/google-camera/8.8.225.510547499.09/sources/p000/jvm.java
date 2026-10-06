package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jvm {

    /* JADX INFO: renamed from: a */
    public String f34893a;

    /* JADX INFO: renamed from: b */
    public boolean f34894b;

    /* JADX INFO: renamed from: c */
    public byte f34895c;

    /* JADX INFO: renamed from: d */
    public jvl f34896d;

    /* JADX INFO: renamed from: e */
    private int f34897e;

    /* JADX INFO: renamed from: f */
    private int f34898f;

    /* JADX INFO: renamed from: a */
    public final jvn m13580a() {
        String str;
        jvl jvlVar;
        if (this.f34895c == 7 && (str = this.f34893a) != null && (jvlVar = this.f34896d) != null) {
            return new jvn(this.f34897e, str, this.f34898f, this.f34894b, jvlVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f34895c & 1) == 0) {
            sb.append(" threadCount");
        }
        if (this.f34893a == null) {
            sb.append(" name");
        }
        if ((this.f34895c & 2) == 0) {
            sb.append(" androidThreadPriority");
        }
        if ((this.f34895c & 4) == 0) {
            sb.append(" propagateErrors");
        }
        if (this.f34896d == null) {
            sb.append(" threadBodyDecorator");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m13581b(int i) {
        this.f34898f = i;
        this.f34895c = (byte) (this.f34895c | 2);
    }

    /* JADX INFO: renamed from: c */
    public final void m13582c(int i) {
        this.f34897e = i;
        this.f34895c = (byte) (this.f34895c | 1);
    }
}
