package p000;

import android.os.Bundle;
import android.os.Parcel;
import androidx.compose.foundation.lazy.C0127b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c8d {
    /* JADX INFO: renamed from: a */
    public static final void m4402a(p71 p71Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1527992164);
        int i2 = (tj3Var.m22124i(p71Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            C0127b c0127b = p71Var.f55686b;
            e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4412e(b16.f7762a, 1.0f), p71Var.f55687c);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM21606S, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 0.0f, 2);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28));
            boolean zM22124i = ((i2 & 112) == 32) | tj3Var.m22124i(p71Var) | ((i2 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new C3485q5(p71Var, vi3Var, vi3Var2, 9);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11642c(e16VarM21609V, c0127b, null, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 492);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 9, p71Var, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m4403b(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        try {
            parcelObtain.writeBundle(bundle);
            return parcelObtain.dataSize();
        } finally {
            parcelObtain.recycle();
        }
    }
}
