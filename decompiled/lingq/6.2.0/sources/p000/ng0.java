package p000;

import androidx.compose.material3.R$string;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;

/* JADX INFO: loaded from: classes.dex */
public final class ng0 {

    /* JADX INFO: renamed from: a */
    public static final ng0 f52694a = new ng0();

    /* JADX INFO: renamed from: b */
    public static final float f52695b;

    /* JADX INFO: renamed from: c */
    public static final float f52696c;

    /* JADX INFO: renamed from: d */
    public static final float f52697d;

    /* JADX INFO: renamed from: e */
    public static final float f52698e;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = k59.f46732a;
        float f = k59.f46737f;
        f52695b = 640.0f;
        f52696c = 56.0f;
        f52697d = 125.0f;
        f52698e = 125.0f;
    }

    /* JADX INFO: renamed from: b */
    public static long m17408b(ye1 ye1Var) {
        return aa1.m198b(0.32f, ra1.m20492e(gn8.m12763a(), ye1Var));
    }

    /* JADX INFO: renamed from: a */
    public final void m17409a(float f, float f2, int i, long j, ye1 ye1Var, e16 e16Var, o39 o39Var) {
        tj3 tj3Var;
        float f3;
        float f4;
        long j2;
        e16 e16Var2;
        o39 o39Var2;
        final float f5;
        final float f6;
        o39 o39Var3;
        long jM20492e;
        e16 e16Var3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1364277227);
        int i2 = i | 9654;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                f5 = k59.f46736e;
                f6 = k59.f46735d;
                o39Var3 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64859e;
                jM20492e = ra1.m20492e(k59.f46734c, tj3Var2);
                e16Var3 = b16.f7762a;
            } else {
                tj3Var2.m22102U();
                f5 = f;
                f6 = f2;
                jM20492e = j;
                e16Var3 = e16Var;
                o39Var3 = o39Var;
            }
            tj3Var2.m22140r();
            String strM11661w = fa4.m11661w(tj3Var2, R$string.m3c_bottom_sheet_drag_handle_description);
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16Var3, 0.0f, n59.f52380a, 1);
            boolean zM22120g = tj3Var2.m22120g(strM11661w);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new t70(strM11661w, 4);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            ho9.m13414a(nv8.m17643c(e16VarM21609V, false, (vi3) objM22097O), o39Var3, jM20492e, 0L, 0.0f, 0.0f, null, ci8.m4703P(-1039573072, new zi3() { // from class: lg0
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        qh0.m19963a(c99.m4423p(b16.f7762a, f5, f6), tj3Var3, 0);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, 12582912, 120);
            f4 = f6;
            e16Var2 = e16Var3;
            o39Var2 = o39Var3;
            j2 = jM20492e;
            f3 = f5;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            f3 = f;
            f4 = f2;
            j2 = j;
            e16Var2 = e16Var;
            o39Var2 = o39Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mg0(this, e16Var2, f3, f4, o39Var2, j2, i);
        }
    }
}
