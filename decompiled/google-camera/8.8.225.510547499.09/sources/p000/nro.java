package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nro {

    /* JADX INFO: renamed from: a */
    public static final nro f44262a = new nro();

    /* JADX INFO: renamed from: b */
    public static final nro f44263b;

    /* JADX INFO: renamed from: c */
    public static final nro f44264c;

    /* JADX INFO: renamed from: e */
    private static int f44265e;

    /* JADX INFO: renamed from: d */
    public final String f44266d;

    static {
        new nro("kMeteringFrame");
        f44263b = new nro("kPayloadFrame");
        new nro("kPayloadAuxFrame");
        f44264c = new nro("kViewfinderFrame");
        f44265e = 0;
    }

    private nro() {
        this.f44266d = "kUnknownFrameType";
        f44265e = 1;
    }

    private nro(String str) {
        this.f44266d = str;
        f44265e++;
    }

    public final String toString() {
        return this.f44266d;
    }
}
