package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrn {

    /* JADX INFO: renamed from: a */
    public static final nrn f44249a;

    /* JADX INFO: renamed from: b */
    public static final nrn f44250b;

    /* JADX INFO: renamed from: c */
    public static final nrn f44251c;

    /* JADX INFO: renamed from: d */
    public static final nrn f44252d;

    /* JADX INFO: renamed from: e */
    public static final nrn f44253e;

    /* JADX INFO: renamed from: f */
    public static final nrn f44254f;

    /* JADX INFO: renamed from: g */
    public static final nrn f44255g;

    /* JADX INFO: renamed from: h */
    public static final nrn f44256h;

    /* JADX INFO: renamed from: i */
    public static final nrn f44257i;

    /* JADX INFO: renamed from: k */
    private static final nrn[] f44258k;

    /* JADX INFO: renamed from: l */
    private static int f44259l;

    /* JADX INFO: renamed from: j */
    public final int f44260j;

    /* JADX INFO: renamed from: m */
    private final String f44261m;

    static {
        nrn nrnVar = new nrn();
        f44249a = nrnVar;
        nrn nrnVar2 = new nrn("kNone");
        f44250b = nrnVar2;
        nrn nrnVar3 = new nrn("kFlipHorizontal");
        f44251c = nrnVar3;
        nrn nrnVar4 = new nrn("kRotate180");
        f44252d = nrnVar4;
        nrn nrnVar5 = new nrn("kFlipVertical");
        f44253e = nrnVar5;
        nrn nrnVar6 = new nrn("kTranspose");
        f44254f = nrnVar6;
        nrn nrnVar7 = new nrn("kRotateCw");
        f44255g = nrnVar7;
        nrn nrnVar8 = new nrn("kTranspose180");
        f44256h = nrnVar8;
        nrn nrnVar9 = new nrn("kRotateCcw");
        f44257i = nrnVar9;
        f44258k = new nrn[]{nrnVar, nrnVar2, nrnVar3, nrnVar4, nrnVar5, nrnVar6, nrnVar7, nrnVar8, nrnVar9};
        f44259l = 0;
    }

    private nrn() {
        this.f44261m = "kInvalid";
        this.f44260j = 0;
        f44259l = 1;
    }

    private nrn(String str) {
        this.f44261m = str;
        int i = f44259l;
        f44259l = i + 1;
        this.f44260j = i;
    }

    /* JADX INFO: renamed from: a */
    public static nrn m17632a(int i) {
        nrn[] nrnVarArr = f44258k;
        int i2 = 0;
        if (i < 9 && i >= 0) {
            nrn nrnVar = nrnVarArr[i];
            if (nrnVar.f44260j == i) {
                return nrnVar;
            }
        }
        while (true) {
            nrn[] nrnVarArr2 = f44258k;
            if (i2 >= 9) {
                throw new IllegalArgumentException("No enum " + nrn.class.toString() + " with value " + i);
            }
            nrn nrnVar2 = nrnVarArr2[i2];
            if (nrnVar2.f44260j == i) {
                return nrnVar2;
            }
            i2++;
        }
    }

    public final String toString() {
        return this.f44261m;
    }
}
