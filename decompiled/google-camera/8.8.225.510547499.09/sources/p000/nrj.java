package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrj {

    /* JADX INFO: renamed from: a */
    public static final nrj f44221a = new nrj("kOff");

    /* JADX INFO: renamed from: b */
    public static final nrj f44222b = new nrj("kOn");

    /* JADX INFO: renamed from: d */
    private static int f44223d;

    /* JADX INFO: renamed from: c */
    public final int f44224c;

    /* JADX INFO: renamed from: e */
    private final String f44225e;

    static {
        new nrj("kUnknown");
        f44223d = 0;
    }

    private nrj(String str) {
        this.f44225e = str;
        int i = f44223d;
        f44223d = i + 1;
        this.f44224c = i;
    }

    public final String toString() {
        return this.f44225e;
    }
}
