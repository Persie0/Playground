package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.p012ui.ImageSize;
import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class add {
    /* JADX INFO: renamed from: a */
    public static final void m288a(a03 a03Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-695543372);
        int i2 = (tj3Var.m22124i(a03Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            LibraryItem libraryItem = a03Var.f17a;
            String strM14422e = jfa.m14422e(libraryItem.f19409J, libraryItem.f19436h, ImageSize.Medium);
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            boolean zM22120g = tj3Var.m22120g(strM14422e);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                d04 d04Var = new d04(context);
                d04Var.f34778c = strM14422e;
                d04Var.f34782g = zl6.f71703a;
                objM22097O2 = d04Var.m9960a();
                tj3Var.m22131l0(objM22097O2);
            }
            e04 e04Var = (e04) objM22097O2;
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            boolean zM22124i = tj3Var.m22124i(a03Var) | ((i2 & 896) == 256);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i || objM22097O3 == p84Var) {
                objM22097O3 = new C3577sk(17, vi3Var2, a03Var);
                tj3Var.m22131l0(objM22097O3);
            }
            r46.m20380e(e16VarM4412e, null, null, null, (ui3) objM22097O3, ci8.m4703P(-1758740803, new hn0(4, vi3Var2, t66Var, a03Var, e04Var, vi3Var), tj3Var), tj3Var, 196614, 14);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 23, a03Var, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m289b(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
