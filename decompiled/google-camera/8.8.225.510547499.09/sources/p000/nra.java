package p000;

import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nra {

    /* JADX INFO: renamed from: a */
    public static final nra f44128a;

    /* JADX INFO: renamed from: b */
    public static final nra f44129b;

    /* JADX INFO: renamed from: c */
    public static final nra f44130c;

    /* JADX INFO: renamed from: d */
    public static final nra f44131d;

    /* JADX INFO: renamed from: e */
    public static final nra f44132e;

    /* JADX INFO: renamed from: f */
    public static final nra f44133f;

    /* JADX INFO: renamed from: g */
    public static final nra f44134g;

    /* JADX INFO: renamed from: i */
    private static final nra[] f44135i;

    /* JADX INFO: renamed from: h */
    public final int f44136h;

    /* JADX INFO: renamed from: j */
    private final String f44137j;

    static {
        nra nraVar = new nra("kUnknown", -1);
        f44128a = nraVar;
        nra nraVar2 = new nra("kOff", 0);
        f44129b = nraVar2;
        nra nraVar3 = new nra("kAuto", 1);
        f44130c = nraVar3;
        nra nraVar4 = new nra("kMacro", 2);
        f44131d = nraVar4;
        nra nraVar5 = new nra(EArqVBjecl.dng, 3);
        f44132e = nraVar5;
        nra nraVar6 = new nra("kContinuousPicture", 4);
        f44133f = nraVar6;
        nra nraVar7 = new nra("kExtendedDepthOfField", 5);
        f44134g = nraVar7;
        f44135i = new nra[]{nraVar, nraVar2, nraVar3, nraVar4, nraVar5, nraVar6, nraVar7};
    }

    private nra(String str, int i) {
        this.f44137j = str;
        this.f44136h = i;
    }

    /* JADX INFO: renamed from: a */
    public static nra m17629a(int i) {
        nra[] nraVarArr = f44135i;
        int i2 = 0;
        if (i < 7 && i >= 0) {
            nra nraVar = nraVarArr[i];
            if (nraVar.f44136h == i) {
                return nraVar;
            }
        }
        while (true) {
            nra[] nraVarArr2 = f44135i;
            if (i2 >= 7) {
                throw new IllegalArgumentException("No enum " + nra.class.toString() + " with value " + i);
            }
            nra nraVar2 = nraVarArr2[i2];
            if (nraVar2.f44136h == i) {
                return nraVar2;
            }
            i2++;
        }
    }

    public final String toString() {
        return this.f44137j;
    }
}
