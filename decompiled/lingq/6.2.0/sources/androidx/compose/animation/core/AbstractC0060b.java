package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC0278f;
import java.util.Map;
import p000.C3006fm;
import p000.InterfaceC0025an;
import p000.bg9;
import p000.cu0;
import p000.d32;
import p000.dh9;
import p000.do7;
import p000.fa4;
import p000.jda;
import p000.jwa;
import p000.l43;
import p000.p84;
import p000.pk9;
import p000.ss5;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.we1;
import p000.xj2;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.animation.core.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0060b {

    /* JADX INFO: renamed from: a */
    public static final bg9 f1549a = ss5.m21698Y(0.0f, 0.0f, null, 7);

    static {
        Map map = jwa.f46325a;
        ss5.m21698Y(0.0f, 0.0f, new xj2(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    /* JADX INFO: renamed from: a */
    public static final dh9 m749a(float f, InterfaceC0025an interfaceC0025an, String str, ye1 ye1Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        return m751c(new xj2(f), pk9.f56365j, interfaceC0025an, null, str, null, ye1Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }

    /* JADX INFO: renamed from: b */
    public static final dh9 m750b(float f, l43 l43Var, String str, vi3 vi3Var, ye1 ye1Var, int i, int i2) {
        l43 l43Var2;
        int i3 = i2 & 2;
        bg9 bg9Var = f1549a;
        if (i3 != 0) {
            l43Var = bg9Var;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        vi3 vi3Var2 = (i2 & 16) != 0 ? null : vi3Var;
        if (l43Var == bg9Var) {
            tj3 tj3Var = (tj3) ye1Var;
            tj3Var.m22111b0(1144115775);
            boolean z = (((i & 896) ^ 384) > 256 && tj3Var.m22114d(0.01f)) || (i & 384) == 256;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = ss5.m21698Y(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                tj3Var.m22131l0(objM22097O);
            }
            tj3Var.m22139q(false);
            l43Var2 = (bg9) objM22097O;
        } else {
            tj3 tj3Var2 = (tj3) ye1Var;
            tj3Var2.m22111b0(1144225701);
            tj3Var2.m22139q(false);
            l43Var2 = l43Var;
        }
        int i4 = i << 3;
        return m751c(Float.valueOf(f), pk9.f56363h, l43Var2, null, str2, vi3Var2, ye1Var, (i & 14) | (57344 & i4) | (i4 & 458752), 0);
    }

    /* JADX INFO: renamed from: c */
    public static final dh9 m751c(Object obj, jda jdaVar, InterfaceC0025an interfaceC0025an, Float f, String str, vi3 vi3Var, ye1 ye1Var, int i, int i2) {
        cu0 cu0Var;
        C0059a c0059a;
        Float f2 = (i2 & 8) != 0 ? null : f;
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = AbstractC0278f.m1260j(null);
            tj3Var.m22131l0(objM22097O);
        }
        t66 t66Var = (t66) objM22097O;
        Object objM22097O2 = tj3Var.m22097O();
        if (objM22097O2 == p84Var) {
            objM22097O2 = new C0059a(obj, jdaVar, f2);
            tj3Var.m22131l0(objM22097O2);
        }
        C0059a c0059a2 = (C0059a) objM22097O2;
        t66 t66VarM1263m = AbstractC0278f.m1263m(vi3Var, tj3Var);
        if (f2 != null && (interfaceC0025an instanceof bg9)) {
            bg9 bg9Var = (bg9) interfaceC0025an;
            if (!fa4.m11650l(bg9Var.f8518c, f2)) {
                interfaceC0025an = new bg9(bg9Var.f8516a, bg9Var.f8517b, f2);
            }
        }
        t66 t66VarM1263m2 = AbstractC0278f.m1263m(interfaceC0025an, tj3Var);
        Object objM22097O3 = tj3Var.m22097O();
        if (objM22097O3 == p84Var) {
            objM22097O3 = do7.m10525a(-1, 6, null);
            tj3Var.m22131l0(objM22097O3);
        }
        cu0 cu0Var2 = (cu0) objM22097O3;
        boolean zM22124i = tj3Var.m22124i(cu0Var2) | ((((i & 14) ^ 6) > 4 && tj3Var.m22124i(obj)) || (i & 6) == 4);
        Object objM22097O4 = tj3Var.m22097O();
        if (zM22124i || objM22097O4 == p84Var) {
            objM22097O4 = new C3006fm(0, cu0Var2, obj);
            tj3Var.m22131l0(objM22097O4);
        }
        d32.m10064x((ui3) objM22097O4, tj3Var);
        boolean zM22124i2 = tj3Var.m22124i(cu0Var2) | tj3Var.m22124i(c0059a2) | tj3Var.m22120g(t66VarM1263m2) | tj3Var.m22120g(t66VarM1263m);
        Object objM22097O5 = tj3Var.m22097O();
        if (zM22124i2 || objM22097O5 == p84Var) {
            cu0Var = cu0Var2;
            c0059a = c0059a2;
            AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(cu0Var, c0059a, t66VarM1263m2, t66VarM1263m, null);
            tj3Var.m22131l0(animateAsStateKt$animateValueAsState$3$1);
            objM22097O5 = animateAsStateKt$animateValueAsState$3$1;
        } else {
            cu0Var = cu0Var2;
            c0059a = c0059a2;
        }
        d32.m10047k(tj3Var, (zi3) objM22097O5, cu0Var);
        dh9 dh9Var = (dh9) t66Var.getValue();
        return dh9Var == null ? c0059a.f1540c : dh9Var;
    }
}
