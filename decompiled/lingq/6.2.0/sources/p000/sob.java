package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sob {

    /* JADX INFO: renamed from: a */
    public static final C0282a f61117a = new C0282a(597722995, false, new z70(26));

    /* JADX INFO: renamed from: b */
    public static final C0282a f61118b = new C0282a(333075505, false, new z70(27));

    /* JADX INFO: renamed from: c */
    public static final C0282a f61119c = new C0282a(-1453910132, false, new kd1(1));

    /* JADX INFO: renamed from: d */
    public static final C0282a f61120d = new C0282a(1479352220, false, new z70(28));

    /* JADX INFO: renamed from: e */
    public static final C0282a f61121e = new C0282a(556184794, false, new z70(29));

    /* JADX INFO: renamed from: f */
    public static final C0282a f61122f = new C0282a(1249906037, false, new kd1(2));

    /* JADX INFO: renamed from: g */
    public static final C0282a f61123g = new C0282a(1952871163, false, new ld1(0));

    /* JADX INFO: renamed from: h */
    public static final C0282a f61124h = new C0282a(1029703737, false, new ld1(1));

    /* JADX INFO: renamed from: i */
    public static final C0282a f61125i = new C0282a(-1868577190, false, new ld1(2));

    /* JADX INFO: renamed from: j */
    public static final C0282a f61126j = new C0282a(1503222680, false, new ld1(3));

    /* JADX INFO: renamed from: k */
    public static final C0282a f61127k = new C0282a(-412123438, false, new kd1(3));

    /* JADX INFO: renamed from: l */
    public static final C0282a f61128l = new C0282a(-1395058247, false, new ld1(4));

    /* JADX INFO: renamed from: m */
    public static final C0282a f61129m = new C0282a(1976741623, false, new ld1(5));

    /* JADX INFO: renamed from: n */
    public static final C0282a f61130n = new C0282a(61395505, false, new kd1(4));

    /* JADX INFO: renamed from: o */
    public static final C0282a f61131o = new C0282a(-921539304, false, new ld1(6));

    /* JADX INFO: renamed from: p */
    public static final C0282a f61132p = new C0282a(-1844706730, false, new ld1(7));

    /* JADX INFO: renamed from: q */
    public static final C0282a f61133q = new C0282a(-1150985487, false, new kd1(5));

    /* JADX INFO: renamed from: r */
    public static final C0282a f61134r = new C0282a(534914448, false, new kd1(6));

    /* JADX INFO: renamed from: s */
    public static final C0282a f61135s = new C0282a(-861157106, false, new kd1(7));

    /* JADX INFO: renamed from: t */
    public static final C0282a f61136t = new C0282a(1082466299, false, new kd1(0));

    /* JADX INFO: renamed from: a */
    public static boolean m21521a(float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            if (fArr[i] != f) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static float m21522b(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }
}
