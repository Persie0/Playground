package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.google.android.gms.internal.play_billing.zzca;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ddd {
    /* JADX INFO: renamed from: a */
    public static final void m10304a(d03 d03Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(674229265);
        int i2 = (tj3Var2.m22124i(d03Var) ? 4 : 2) | i | (tj3Var2.m22124i(vi3Var) ? 32 : 16);
        int i3 = 18;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            boolean z = d03Var.f34775b != null;
            boolean zM22124i = tj3Var2.m22124i(d03Var) | ((i2 & 112) == 32);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new C3577sk(i3, d03Var, vi3Var);
                tj3Var2.m22131l0(objM22097O);
            }
            r46.m20381f(AbstractC0080f.m815b(null, z, (ui3) objM22097O, e16VarM4412e, 14), null, null, te1.m21999m(0, 14, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55824I, 0L, tj3Var2), ci8.m4703P(-1354113945, new C3180kd(20, d03Var, context), tj3Var2), tj3Var2, 24576, 6);
            tj3Var = tj3Var2;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(d03Var, i, 11, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10305b(zzca zzcaVar) {
        Iterator it = zzcaVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
