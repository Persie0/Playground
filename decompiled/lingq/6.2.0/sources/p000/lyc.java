package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.glance.layout.AbstractC0686a;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lyc {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f50321a = {1, 2, 3, 4, 5, 6, 7};

    /* JADX INFO: renamed from: a */
    public static final void m16573a(final ArrayList arrayList, C0282a c0282a, on3 on3Var, float f, ye1 ye1Var, int i) {
        int i2;
        C0282a c0282a2;
        final on3 on3Var2 = on3Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(169196579);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22116e(2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            c0282a2 = c0282a;
            i2 |= tj3Var.m22124i(c0282a2) ? 256 : 128;
        } else {
            c0282a2 = c0282a;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22120g(on3Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22114d(f) ? 131072 : 65536;
        }
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-57345);
            tj3Var.m22140r();
            final int iCeil = (int) Math.ceil(((double) arrayList.size()) / 2.0d);
            final float f2 = (1.0f * f) / 2.0f;
            final float f3 = ((iCeil - 1) * f) / iCeil;
            xp3 xp3Var = new xp3(2);
            boolean zM22124i = tj3Var.m22124i(arrayList) | ((i3 & 14) == 4) | tj3Var.m22116e(iCeil) | tj3Var.m22114d(f3) | tj3Var.m22114d(f2) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                final C0282a c0282a3 = c0282a2;
                vi3 vi3Var = new vi3() { // from class: ej8
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        mw4 mw4Var = (mw4) obj;
                        mw4Var.getClass();
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        int i4 = 1;
                        C0282a c0282a4 = new C0282a(2068563480, true, new hj8(arrayList2, iCeil, f3, f2, on3Var2, c0282a3));
                        for (int i5 = 0; i5 < size; i5++) {
                            arrayList2.get(i5);
                            mw4Var.f51938a.add(new Pair(Long.MIN_VALUE, new C0282a(1320585988, true, new dv4(c0282a4, i5, i4))));
                        }
                        return xfa.f68157a;
                    }
                };
                on3Var2 = on3Var2;
                tj3Var.m22131l0(vi3Var);
                objM22097O = vi3Var;
            }
            m16574b(xp3Var, on3Var2, (vi3) objM22097O, tj3Var, (i3 >> 6) & 1008);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fj8(arrayList, c0282a, on3Var2, f, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m16574b(xp3 xp3Var, on3 on3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(699461846);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tj3Var.m22120g(xp3Var) : tj3Var.m22124i(xp3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(on3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22116e(0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            AbstractC0686a.m2485a(l70.m15951n(mn3.f51554a, 16.0f).mo16935d(on3Var), null, ci8.m4703P(467905972, new wa5(27, xp3Var, vi3Var), tj3Var), tj3Var, 384, 2);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(xp3Var, on3Var, vi3Var, i, 10);
        }
    }
}
