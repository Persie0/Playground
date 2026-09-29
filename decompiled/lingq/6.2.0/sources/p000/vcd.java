package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.p012ui.ImageSize;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vcd {
    /* JADX INFO: renamed from: a */
    public static final void m23230a(yz2 yz2Var, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-695055426);
        int i2 = 16;
        int i3 = (tj3Var.m22124i(yz2Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            LibraryItem libraryItem = yz2Var.f70666a;
            String strM14422e = jfa.m14422e(libraryItem.f19409J, libraryItem.f19436h, ImageSize.Medium);
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            boolean zM22120g = tj3Var.m22120g(strM14422e);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                d04 d04Var = new d04(context);
                d04Var.f34778c = strM14422e;
                d04Var.f34782g = zl6.f71703a;
                objM22097O = d04Var.m9960a();
                tj3Var.m22131l0(objM22097O);
            }
            e04 e04Var = (e04) objM22097O;
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            boolean zM22124i = tj3Var.m22124i(yz2Var) | ((i3 & 112) == 32);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new C3577sk(i2, vi3Var, yz2Var);
                tj3Var.m22131l0(objM22097O2);
            }
            r46.m20380e(e16VarM4412e, null, null, null, (ui3) objM22097O2, ci8.m4703P(355678215, new C3180kd(19, yz2Var, e04Var), tj3Var), tj3Var, 196614, 14);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(yz2Var, i, 9, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m23231b(Object obj) {
        return (int) (((long) Integer.rotateLeft((int) (((long) (obj == null ? 0 : obj.hashCode())) * (-862048943)), 15)) * 461845907);
    }
}
