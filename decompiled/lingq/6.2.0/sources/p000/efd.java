package p000;

import android.text.Html;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class efd {
    /* JADX INFO: renamed from: a */
    public static final void m11096a(String str, long j, vx9 vx9Var, ks9 ks9Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        long j2;
        int i2;
        long jM4208a;
        int i3;
        boolean z;
        Object objM16933h;
        str.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1398398302);
        int i4 = i | (tj3Var2.m22120g(str) ? 4 : 2) | 16 | (tj3Var2.m22120g(vx9Var) ? 256 : 128) | (tj3Var2.m22120g(ks9Var) ? 2048 : 1024) | (tj3Var2.m22124i(vi3Var) ? 16384 : 8192);
        int i5 = 0;
        if (tj3Var2.m22099R(i4 & 1, (i4 & 9363) != 9362)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                i2 = i4 & (-113);
                jM4208a = ((bx2) tj3Var2.m22128k(cx2.f34676a)).m4208a();
            } else {
                tj3Var2.m22102U();
                i2 = i4 & (-113);
                jM4208a = j;
            }
            tj3Var2.m22140r();
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(null);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            boolean z2 = (i2 & 14) == 4;
            Object objM22097O2 = tj3Var2.m22097O();
            if (z2 || objM22097O2 == p84Var) {
                Spanned spannedFromHtml = Html.fromHtml(str, 0);
                spannedFromHtml.getClass();
                String string = spannedFromHtml.toString();
                C3341mn c3341mn = new C3341mn();
                c3341mn.m16929d(string);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannedFromHtml.getSpans(0, spannedFromHtml.length(), URLSpan.class);
                StyleSpan[] styleSpanArr = (StyleSpan[]) spannedFromHtml.getSpans(0, spannedFromHtml.length(), StyleSpan.class);
                for (int length = uRLSpanArr.length; i5 < length; length = length) {
                    URLSpan uRLSpan = uRLSpanArr[i5];
                    int spanStart = spannedFromHtml.getSpanStart(uRLSpan);
                    int spanEnd = spannedFromHtml.getSpanEnd(uRLSpan);
                    String url = uRLSpan.getURL();
                    c3341mn.m16927b(new he9(jM4208a, 0L, bc3.f8323i, null, null, null, null, 0L, null, null, null, 0L, rt9.f59802c, null, 61434), spanStart, spanEnd);
                    url.getClass();
                    c3341mn.f51545c.add(new C3304ln(new ok9(url), spanStart, spanEnd, "URL"));
                    i5++;
                    i2 = i2;
                }
                i3 = i2;
                for (StyleSpan styleSpan : styleSpanArr) {
                    int spanStart2 = spannedFromHtml.getSpanStart(styleSpan);
                    int spanEnd2 = spannedFromHtml.getSpanEnd(styleSpan);
                    int style = styleSpan.getStyle();
                    if (style == 1) {
                        c3341mn.m16927b(new he9(0L, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), spanStart2, spanEnd2);
                    } else if (style == 2) {
                        c3341mn.m16927b(new he9(0L, 0L, null, new wb3(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527), spanStart2, spanEnd2);
                    } else if (style == 3) {
                        c3341mn.m16927b(new he9(0L, 0L, bc3.f8324j, new wb3(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523), spanStart2, spanEnd2);
                    }
                }
                z = true;
                objM16933h = c3341mn.m16933h();
                tj3Var2.m22131l0(objM16933h);
            } else {
                i3 = i2;
                objM16933h = objM22097O2;
                z = true;
            }
            C3419on c3419on = (C3419on) objM16933h;
            boolean zM22120g = tj3Var2.m22120g(c3419on) | ((i3 & 57344) == 16384 ? z : false);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                objM22097O3 = new yv3(t66Var, c3419on, vi3Var);
                tj3Var2.m22131l0(objM22097O3);
            }
            e16 e16VarM16957a = mo9.m16957a(b16.f7762a, xfa.f68157a, (PointerInputEventHandler) objM22097O3);
            Object objM22097O4 = tj3Var2.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = new C0023al(14, t66Var);
                tj3Var2.m22131l0(objM22097O4);
            }
            tj3Var = tj3Var2;
            lw9.m16555c(c3419on, e16VarM16957a, 0L, null, 0L, null, null, 0L, ks9Var, 0L, 0, false, 0, 0, null, (vi3) objM22097O4, vx9Var, tj3Var, 0, ((i3 >> 9) & 14) | 12582912 | ((i3 << 18) & 234881024), 130044);
            j2 = jM4208a;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            j2 = j;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gx0(str, j2, vx9Var, ks9Var, vi3Var, i);
        }
    }
}
