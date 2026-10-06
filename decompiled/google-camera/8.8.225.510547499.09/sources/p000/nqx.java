package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqx {

    /* JADX INFO: renamed from: a */
    public static final nqx f44100a;

    /* JADX INFO: renamed from: b */
    public static final nqx f44101b;

    /* JADX INFO: renamed from: c */
    public static final nqx f44102c;

    /* JADX INFO: renamed from: d */
    public static final nqx f44103d;

    /* JADX INFO: renamed from: e */
    public static final nqx f44104e;

    /* JADX INFO: renamed from: f */
    public static final nqx f44105f;

    /* JADX INFO: renamed from: g */
    public static final nqx f44106g;

    /* JADX INFO: renamed from: i */
    private static final nqx[] f44107i;

    /* JADX INFO: renamed from: h */
    public final int f44108h;

    /* JADX INFO: renamed from: j */
    private final String f44109j;

    static {
        nqx nqxVar = new nqx("kUnknown", -1);
        f44100a = nqxVar;
        nqx nqxVar2 = new nqx("kOff", 0);
        f44101b = nqxVar2;
        nqx nqxVar3 = new nqx("kOn", 1);
        f44102c = nqxVar3;
        nqx nqxVar4 = new nqx("kOnAutoFlash", 2);
        f44103d = nqxVar4;
        nqx nqxVar5 = new nqx("kOnAlwaysFlash", 3);
        f44104e = nqxVar5;
        nqx nqxVar6 = new nqx("kOnAutoFlashRedeye", 4);
        f44105f = nqxVar6;
        nqx nqxVar7 = new nqx("kOnExternalFlash", 5);
        f44106g = nqxVar7;
        f44107i = new nqx[]{nqxVar, nqxVar2, nqxVar3, nqxVar4, nqxVar5, nqxVar6, nqxVar7};
    }

    private nqx(String str, int i) {
        this.f44109j = str;
        this.f44108h = i;
    }

    /* JADX INFO: renamed from: a */
    public static nqx m17628a(int i) {
        nqx[] nqxVarArr = f44107i;
        int i2 = 0;
        if (i < 7 && i >= 0) {
            nqx nqxVar = nqxVarArr[i];
            if (nqxVar.f44108h == i) {
                return nqxVar;
            }
        }
        while (true) {
            nqx[] nqxVarArr2 = f44107i;
            if (i2 >= 7) {
                throw new IllegalArgumentException("No enum " + nqx.class.toString() + " with value " + i);
            }
            nqx nqxVar2 = nqxVarArr2[i2];
            if (nqxVar2.f44108h == i) {
                return nqxVar2;
            }
            i2++;
        }
    }

    public final String toString() {
        return this.f44109j;
    }
}
