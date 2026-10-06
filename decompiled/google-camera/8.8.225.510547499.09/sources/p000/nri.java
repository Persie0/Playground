package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nri {

    /* JADX INFO: renamed from: a */
    public static final nri f44213a;

    /* JADX INFO: renamed from: b */
    public static final nri f44214b;

    /* JADX INFO: renamed from: c */
    public static final nri f44215c;

    /* JADX INFO: renamed from: d */
    public static final nri f44216d;

    /* JADX INFO: renamed from: e */
    public static final nri[] f44217e;

    /* JADX INFO: renamed from: g */
    private static int f44218g;

    /* JADX INFO: renamed from: f */
    public final int f44219f;

    /* JADX INFO: renamed from: h */
    private final String f44220h;

    static {
        nri nriVar = new nri();
        f44213a = nriVar;
        nri nriVar2 = new nri("kCpu");
        f44214b = nriVar2;
        nri nriVar3 = new nri("kHexagon");
        f44215c = nriVar3;
        nri nriVar4 = new nri("kGxp");
        f44216d = nriVar4;
        f44217e = new nri[]{nriVar, nriVar2, nriVar3, nriVar4};
        f44218g = 0;
    }

    private nri() {
        this.f44220h = "kInvalid";
        this.f44219f = 0;
        f44218g = 1;
    }

    private nri(String str) {
        this.f44220h = str;
        int i = f44218g;
        f44218g = i + 1;
        this.f44219f = i;
    }

    public final String toString() {
        return this.f44220h;
    }
}
