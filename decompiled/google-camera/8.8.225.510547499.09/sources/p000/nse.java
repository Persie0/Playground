package p000;

import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nse {

    /* JADX INFO: renamed from: a */
    public static final nse f44362a;

    /* JADX INFO: renamed from: b */
    public static final nse f44363b;

    /* JADX INFO: renamed from: c */
    public static final nse f44364c;

    /* JADX INFO: renamed from: d */
    public static final nse f44365d;

    /* JADX INFO: renamed from: e */
    public static final nse f44366e;

    /* JADX INFO: renamed from: f */
    public static final nse f44367f;

    /* JADX INFO: renamed from: g */
    public static final nse f44368g;

    /* JADX INFO: renamed from: h */
    public static final nse f44369h;

    /* JADX INFO: renamed from: i */
    public static final nse f44370i;

    /* JADX INFO: renamed from: j */
    public static final nse f44371j;

    /* JADX INFO: renamed from: k */
    public static final nse f44372k;

    /* JADX INFO: renamed from: l */
    public static final nse f44373l;

    /* JADX INFO: renamed from: m */
    public static final nse f44374m;

    /* JADX INFO: renamed from: n */
    public static final nse f44375n;

    /* JADX INFO: renamed from: o */
    public static final nse f44376o;

    /* JADX INFO: renamed from: p */
    public static final nse f44377p;

    /* JADX INFO: renamed from: r */
    private static final nse[] f44378r;

    /* JADX INFO: renamed from: q */
    public final int f44379q;

    /* JADX INFO: renamed from: s */
    private final String f44380s;

    static {
        nse nseVar = new nse("kInvalid", -1);
        f44362a = nseVar;
        nse nseVar2 = new nse("kRearRegular", 0);
        f44363b = nseVar2;
        nse nseVar3 = new nse("kRearRegularBinned", 10);
        f44364c = nseVar3;
        nse nseVar4 = new nse("kRearRegularRemosaicked", 11);
        f44365d = nseVar4;
        nse nseVar5 = new nse("kRearTelephoto", 4);
        f44366e = nseVar5;
        nse nseVar6 = new nse("kRearTelephotoBinned", 7);
        f44367f = nseVar6;
        nse nseVar7 = new nse("kRearTelephotoRemosaicked", 12);
        f44368g = nseVar7;
        nse nseVar8 = new nse("kRearUltrawide", 8);
        f44369h = nseVar8;
        nse nseVar9 = new nse("kRearUltrawideBinned", 9);
        f44370i = nseVar9;
        nse nseVar10 = new nse("kRearLogical", 5);
        f44371j = nseVar10;
        nse nseVar11 = new nse("kFrontRegular", 1);
        f44372k = nseVar11;
        nse nseVar12 = new nse("kFrontUltrawide", 2);
        f44373l = nseVar12;
        nse nseVar13 = new nse(PMZiHihxLGEy.ftihvNgXUqtr, 3);
        f44374m = nseVar13;
        nse nseVar14 = new nse("kFrontInfrared", 6);
        f44375n = nseVar14;
        nse nseVar15 = new nse("kFrontSecondary", 13);
        f44376o = nseVar15;
        nse nseVar16 = new nse("kCount", 14);
        f44377p = nseVar16;
        f44378r = new nse[]{nseVar, nseVar2, nseVar3, nseVar4, nseVar5, nseVar6, nseVar7, nseVar8, nseVar9, nseVar10, nseVar11, nseVar12, nseVar13, nseVar14, nseVar15, nseVar16};
    }

    private nse(String str, int i) {
        this.f44380s = str;
        this.f44379q = i;
    }

    /* JADX INFO: renamed from: a */
    public static nse m17643a(int i) {
        nse[] nseVarArr = f44378r;
        int i2 = 0;
        if (i < 16 && i >= 0) {
            nse nseVar = nseVarArr[i];
            if (nseVar.f44379q == i) {
                return nseVar;
            }
        }
        while (true) {
            nse[] nseVarArr2 = f44378r;
            if (i2 >= 16) {
                throw new IllegalArgumentException("No enum " + nse.class.toString() + " with value " + i);
            }
            nse nseVar2 = nseVarArr2[i2];
            if (nseVar2.f44379q == i) {
                return nseVar2;
            }
            i2++;
        }
    }

    public final String toString() {
        return this.f44380s;
    }
}
