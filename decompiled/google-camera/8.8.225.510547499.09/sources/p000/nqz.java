package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqz {

    /* JADX INFO: renamed from: a */
    public static final nqz f44120a = new nqz();

    /* JADX INFO: renamed from: b */
    public static final nqz f44121b = new nqz("kHdrLong");

    /* JADX INFO: renamed from: d */
    private static int f44122d;

    /* JADX INFO: renamed from: c */
    public final int f44123c;

    /* JADX INFO: renamed from: e */
    private final String f44124e;

    static {
        new nqz("kAeTypeCount");
        f44122d = 0;
    }

    private nqz() {
        this.f44124e = "kHdrShort";
        this.f44123c = 0;
        f44122d = 1;
    }

    private nqz(String str) {
        this.f44124e = str;
        int i = f44122d;
        f44122d = i + 1;
        this.f44123c = i;
    }

    public final String toString() {
        return this.f44124e;
    }
}
