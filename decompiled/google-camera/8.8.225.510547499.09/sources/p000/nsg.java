package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nsg {

    /* JADX INFO: renamed from: a */
    public static final nsg f44388a = new nsg();

    /* JADX INFO: renamed from: b */
    public static final nsg f44389b = new nsg("kManual");

    /* JADX INFO: renamed from: d */
    private static int f44390d;

    /* JADX INFO: renamed from: c */
    public final int f44391c;

    /* JADX INFO: renamed from: e */
    private final String f44392e;

    static {
        new nsg("kUnknown");
        f44390d = 0;
    }

    private nsg() {
        this.f44392e = "kAuto";
        this.f44391c = 0;
        f44390d = 1;
    }

    private nsg(String str) {
        this.f44392e = str;
        int i = f44390d;
        f44390d = i + 1;
        this.f44391c = i;
    }

    public final String toString() {
        return this.f44392e;
    }
}
