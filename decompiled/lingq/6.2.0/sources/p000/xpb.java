package p000;

import android.view.View;
import androidx.compose.p002ui.graphics.colorspace.C0308a;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.C0272a;
import androidx.compose.runtime.internal.C0282a;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xpb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f68508a = new C0282a(2054442933, false, new nd1(19));

    /* JADX INFO: renamed from: a */
    public static final void m24635a(final ui3 ui3Var, long j, final q06 q06Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        q06 q06Var2;
        final LayoutDirection layoutDirection;
        boolean z;
        boolean z2;
        long j2 = j;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-85756322);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22118f(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            q06Var2 = q06Var;
            i2 |= tj3Var.m22120g(q06Var2) ? 256 : 128;
        } else {
            q06Var2 = q06Var;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 2048 : 1024;
        }
        int i3 = i2;
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            View view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
            fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            LayoutDirection layoutDirection2 = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
            C0272a c0272aM19380w = pk9.m19380w(tj3Var);
            t66 t66VarM1263m = AbstractC0278f.m1263m(c0282a, tj3Var);
            Object[] objArr = new Object[0];
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new tx5(4);
                tj3Var.m22131l0(objM22097O);
            }
            UUID uuid = (UUID) xwc.m24745R(objArr, (ui3) objM22097O, tj3Var, 48);
            boolean zM22120g = tj3Var.m22120g(view) | tj3Var.m22120g(fb2Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                layoutDirection = layoutDirection2;
                z = true;
                z2 = false;
                n06 n06Var = new n06(ui3Var, q06Var2, j2, view, layoutDirection, fb2Var, uuid);
                j2 = j2;
                C0282a c0282a2 = new C0282a(1379699857, true, new C0812bj(5, t66VarM1263m));
                l06 l06Var = n06Var.f52125i;
                l06Var.setParentCompositionContext(c0272aM19380w);
                ((xc9) l06Var.f48854j).setValue(c0282a2);
                l06Var.f48855k = true;
                l06Var.m1710d();
                tj3Var.m22131l0(n06Var);
                objM22097O2 = n06Var;
            } else {
                layoutDirection = layoutDirection2;
                z = true;
                z2 = false;
            }
            final n06 n06Var2 = (n06) objM22097O2;
            boolean zM22124i = tj3Var.m22124i(n06Var2);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i || objM22097O3 == p84Var) {
                objM22097O3 = new fy4(n06Var2, 11);
                tj3Var.m22131l0(objM22097O3);
            }
            d32.m10041h(n06Var2, (vi3) objM22097O3, tj3Var);
            boolean zM22124i2 = tj3Var.m22124i(n06Var2) | ((i3 & 14) == 4 ? z : z2) | ((i3 & 896) == 256 ? z : z2);
            if ((((i3 & 112) ^ 48) <= 32 || !tj3Var.m22118f(j2)) && (i3 & 48) != 32) {
                z = z2;
            }
            boolean zM22116e = zM22124i2 | z | tj3Var.m22116e(layoutDirection.ordinal());
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22116e || objM22097O4 == p84Var) {
                final long j3 = j2;
                ui3 ui3Var2 = new ui3() { // from class: r06
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        n06Var2.m17166f(ui3Var, q06Var, j3, layoutDirection);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(ui3Var2);
                objM22097O4 = ui3Var2;
            }
            d32.m10064x((ui3) objM22097O4, tj3Var);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new s06(ui3Var, j, q06Var, c0282a, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m24636b(long j) {
        if (aa1.m199c(j, aa1.f411j)) {
            return false;
        }
        sa1 sa1VarM202f = aa1.m202f(j);
        if (!b34.m3243i(sa1VarM202f.f60575b, 12884901888L)) {
            h54.m13056a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) b34.m3229Z(sa1VarM202f.f60575b)));
        }
        xg8 xg8Var = ((C0308a) sa1VarM202f).f3953p;
        float fMo503c = (float) ((xg8Var.mo503c(aa1.m201e(j)) * 0.0722d) + (xg8Var.mo503c(aa1.m203g(j)) * 0.7152d) + (xg8Var.mo503c(aa1.m204h(j)) * 0.2126d));
        if (fMo503c < 0.0f) {
            fMo503c = 0.0f;
        }
        if (fMo503c > 1.0f) {
            fMo503c = 1.0f;
        }
        return ((double) fMo503c) <= 0.5d;
    }
}
