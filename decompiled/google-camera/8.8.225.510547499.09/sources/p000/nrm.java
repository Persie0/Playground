package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrm {

    /* JADX INFO: renamed from: a */
    public static final nrm f44244a = new nrm(null);

    /* JADX INFO: renamed from: b */
    public static final nrm f44245b = new nrm();

    /* JADX INFO: renamed from: d */
    private static int f44246d = 0;

    /* JADX INFO: renamed from: c */
    public final int f44247c;

    /* JADX INFO: renamed from: e */
    private final String f44248e;

    private nrm() {
        this.f44248e = "kHigh";
        int i = f44246d;
        f44246d = i + 1;
        this.f44247c = i;
    }

    private nrm(byte[] bArr) {
        this.f44248e = "kStandard";
        this.f44247c = 0;
        f44246d = 1;
    }

    public final String toString() {
        return this.f44248e;
    }
}
