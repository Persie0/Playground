package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrx {

    /* JADX INFO: renamed from: a */
    public static final nrx f44308a;

    /* JADX INFO: renamed from: b */
    public static final nrx f44309b;

    /* JADX INFO: renamed from: c */
    public static final nrx f44310c;

    /* JADX INFO: renamed from: d */
    public static final nrx f44311d;

    /* JADX INFO: renamed from: e */
    public static final nrx f44312e;

    /* JADX INFO: renamed from: f */
    public static final nrx f44313f;

    /* JADX INFO: renamed from: g */
    public static final nrx f44314g;

    /* JADX INFO: renamed from: h */
    public static final nrx f44315h;

    /* JADX INFO: renamed from: i */
    public static final nrx f44316i;

    /* JADX INFO: renamed from: j */
    public static final nrx f44317j;

    /* JADX INFO: renamed from: k */
    public static final nrx f44318k;

    /* JADX INFO: renamed from: m */
    private static final nrx[] f44319m;

    /* JADX INFO: renamed from: n */
    private static int f44320n;

    /* JADX INFO: renamed from: l */
    public final int f44321l;

    /* JADX INFO: renamed from: o */
    private final String f44322o;

    static {
        nrx nrxVar = new nrx();
        f44308a = nrxVar;
        nrx nrxVar2 = new nrx("kNv12");
        f44309b = nrxVar2;
        nrx nrxVar3 = new nrx("kNv21");
        f44310c = nrxVar3;
        nrx nrxVar4 = new nrx("kRgb");
        f44311d = nrxVar4;
        nrx nrxVar5 = new nrx("kBgr");
        f44312e = nrxVar5;
        nrx nrxVar6 = new nrx("kRgba");
        f44313f = nrxVar6;
        nrx nrxVar7 = new nrx("kBgra");
        f44314g = nrxVar7;
        nrx nrxVar8 = new nrx("kArgb");
        f44315h = nrxVar8;
        nrx nrxVar9 = new nrx("kAbgr");
        f44316i = nrxVar9;
        nrx nrxVar10 = new nrx("kRgb16");
        f44317j = nrxVar10;
        nrx nrxVar11 = new nrx("kCount");
        f44318k = nrxVar11;
        f44319m = new nrx[]{nrxVar, nrxVar2, nrxVar3, nrxVar4, nrxVar5, nrxVar6, nrxVar7, nrxVar8, nrxVar9, nrxVar10, nrxVar11};
        f44320n = 0;
    }

    private nrx() {
        this.f44322o = "kUnknown";
        this.f44321l = 0;
        f44320n = 1;
    }

    private nrx(String str) {
        this.f44322o = str;
        int i = f44320n;
        f44320n = i + 1;
        this.f44321l = i;
    }

    /* JADX INFO: renamed from: a */
    public static nrx m17636a(int i) {
        nrx[] nrxVarArr = f44319m;
        int i2 = 0;
        if (i < 11 && i >= 0) {
            nrx nrxVar = nrxVarArr[i];
            if (nrxVar.f44321l == i) {
                return nrxVar;
            }
        }
        while (true) {
            nrx[] nrxVarArr2 = f44319m;
            if (i2 >= 11) {
                throw new IllegalArgumentException("No enum " + nrx.class.toString() + " with value " + i);
            }
            nrx nrxVar2 = nrxVarArr2[i2];
            if (nrxVar2.f44321l == i) {
                return nrxVar2;
            }
            i2++;
        }
    }

    public final String toString() {
        return this.f44322o;
    }
}
