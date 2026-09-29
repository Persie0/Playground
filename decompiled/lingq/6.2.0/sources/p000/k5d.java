package p000;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.compose.runtime.internal.C0282a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k5d {
    /* JADX INFO: renamed from: a */
    public static final void m14876a(List list, wz7 wz7Var, e08 e08Var, nz9 nz9Var, vs3 vs3Var, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        Object next;
        qx8 qx8Var;
        String str;
        String str2;
        list.getClass();
        wz7Var.getClass();
        e08Var.getClass();
        nz9Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1373104493);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22120g(wz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(e08Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? tj3Var2.m22120g(nz9Var) : tj3Var2.m22124i(nz9Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(vs3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var2.m22120g(e16Var) ? 1048576 : 524288;
        }
        if (tj3Var2.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            Integer num = wz7Var.f67564a;
            boolean zM22120g = tj3Var2.m22120g(list) | tj3Var2.m22120g(num);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                Iterator it = list.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    List list2 = ((e37) next).f36654c;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            int i3 = ((lw8) it2.next()).f50212a;
                            if (num != null && i3 == num.intValue()) {
                                break loop0;
                            }
                        }
                    }
                }
                objM22097O = (e37) next;
                tj3Var2.m22131l0(objM22097O);
            }
            e37 e37Var = (e37) objM22097O;
            if (num != null) {
                qx8Var = (qx8) e08Var.f36540a.get(Integer.valueOf(num.intValue()));
            } else {
                qx8Var = null;
            }
            if (num != null) {
                str = (String) e08Var.f36541b.get(Integer.valueOf(num.intValue()));
            } else {
                str = null;
            }
            if (str == null) {
                str2 = qx8Var != null ? qx8Var.f58342c : null;
            } else {
                str2 = str;
            }
            boolean z = str2 != null && (nz9Var.f53466l || (qx8Var != null && qx8Var.f58340a));
            pa1 pa1VarM20490c = ra1.m20490c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
            C0282a c0282aM4703P = ci8.m4703P(-1728748223, new en0(e37Var, e16Var, z, qx8Var, nz9Var, wz7Var, vs3Var, vi3Var, str2), tj3Var2);
            tj3Var = tj3Var2;
            ps5.m19472c(pa1VarM20490c, null, null, c0282aM4703P, tj3Var, 3072);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fn0(list, wz7Var, e08Var, nz9Var, vs3Var, vi3Var, e16Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m14877b(bs1 bs1Var) {
        bs1Var.f8923k = -3.4028235E38f;
        bs1Var.f8922j = Integer.MIN_VALUE;
        CharSequence charSequence = bs1Var.f8913a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                bs1Var.f8913a = SpannableString.valueOf(charSequence);
                bs1Var.f8914b = null;
            }
            CharSequence charSequence2 = bs1Var.f8913a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m14878c(float f, int i, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }
}
