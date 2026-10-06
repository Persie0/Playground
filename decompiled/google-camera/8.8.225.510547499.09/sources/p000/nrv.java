package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrv {

    /* JADX INFO: renamed from: a */
    public static final nrv f44295a;

    /* JADX INFO: renamed from: b */
    public static final nrv f44296b;

    /* JADX INFO: renamed from: d */
    private static int f44297d;

    /* JADX INFO: renamed from: c */
    public final int f44298c;

    /* JADX INFO: renamed from: e */
    private final String f44299e;

    static {
        new nrv();
        f44295a = new nrv("kImageBasedMotionProcessing");
        f44296b = new nrv("kMotionMetadataProcessing");
        f44297d = 0;
    }

    private nrv() {
        this.f44299e = "kNone";
        this.f44298c = 0;
        f44297d = 1;
    }

    private nrv(String str) {
        this.f44299e = str;
        int i = f44297d;
        f44297d = i + 1;
        this.f44298c = i;
    }

    public final String toString() {
        return this.f44299e;
    }
}
