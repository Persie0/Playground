package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrw {

    /* JADX INFO: renamed from: a */
    public static final nrw f44300a;

    /* JADX INFO: renamed from: b */
    public static final nrw f44301b;

    /* JADX INFO: renamed from: c */
    public static final nrw f44302c;

    /* JADX INFO: renamed from: d */
    public static final nrw f44303d;

    /* JADX INFO: renamed from: e */
    public static final nrw[] f44304e;

    /* JADX INFO: renamed from: g */
    private static int f44305g;

    /* JADX INFO: renamed from: f */
    public final int f44306f;

    /* JADX INFO: renamed from: h */
    private final String f44307h;

    static {
        nrw nrwVar = new nrw();
        f44300a = nrwVar;
        nrw nrwVar2 = new nrw("kSrgb");
        f44301b = nrwVar2;
        nrw nrwVar3 = new nrw("kDisplayP3");
        f44302c = nrwVar3;
        nrw nrwVar4 = new nrw("kInvalid");
        f44303d = nrwVar4;
        f44304e = new nrw[]{nrwVar, nrwVar2, nrwVar3, nrwVar4};
        f44305g = 0;
    }

    private nrw() {
        this.f44307h = "kNone";
        this.f44306f = 0;
        f44305g = 1;
    }

    private nrw(String str) {
        this.f44307h = str;
        int i = f44305g;
        f44305g = i + 1;
        this.f44306f = i;
    }

    public final String toString() {
        return this.f44307h;
    }
}
