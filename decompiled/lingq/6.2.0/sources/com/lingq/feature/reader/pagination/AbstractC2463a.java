package com.lingq.feature.reader.pagination;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.feature.reader.pagination.AbstractC2463a;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import p000.d32;
import p000.jn8;
import p000.n84;
import p000.nz9;
import p000.ox9;
import p000.p84;
import p000.tj3;
import p000.u65;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.reader.pagination.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2463a {
    /* JADX INFO: renamed from: a */
    public static final void m9357a(final u65 u65Var, final Map map, final long j, final int i, final int i2, final int i3, final int i4, final nz9 nz9Var, final String str, final boolean z, final String str2, final vi3 vi3Var, ye1 ye1Var, final int i5) {
        int i6;
        int i7;
        final int i8;
        zi3 zi3Var;
        x18 x18Var;
        map.getClass();
        nz9Var.getClass();
        boolean z2 = nz9Var.f53466l;
        str.getClass();
        str2.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1036177220);
        if ((i5 & 6) == 0) {
            i6 = (tj3Var.m22124i(u65Var) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= tj3Var.m22124i(map) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= tj3Var.m22118f(j) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 = i;
            i6 |= tj3Var.m22116e(i7) ? 2048 : 1024;
        } else {
            i7 = i;
        }
        if ((i5 & 24576) == 0) {
            i8 = i2;
            i6 |= tj3Var.m22116e(i8) ? 16384 : 8192;
        } else {
            i8 = i2;
        }
        if ((i5 & 196608) == 0) {
            i6 |= tj3Var.m22116e(i3) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i6 |= tj3Var.m22116e(i4) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i6 |= (i5 & 16777216) == 0 ? tj3Var.m22120g(nz9Var) : tj3Var.m22124i(nz9Var) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i6 |= tj3Var.m22120g(str) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i6 |= tj3Var.m22122h(z) ? 536870912 : 268435456;
        }
        int i9 = (tj3Var.m22120g(str2) ? (char) 4 : (char) 2) | (tj3Var.m22124i(vi3Var) ? ' ' : (char) 16);
        if (tj3Var.m22099R(i6 & 1, ((i6 & 306783379) == 306783378 && (i9 & 19) == 18) ? false : true)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            if (u65Var == null) {
                x18 x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u == null) {
                    return;
                }
                final int i10 = 0;
                final int i11 = i7;
                zi3Var = new zi3() { // from class: a27
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i12 = i10;
                        xfa xfaVar = xfa.f68157a;
                        int i13 = i5;
                        switch (i12) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i13 | 1);
                                AbstractC2463a.m9357a(u65Var, map, j, i11, i8, i3, i4, nz9Var, str, z, str2, vi3Var, (ye1) obj, iM19383z);
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                int iM19383z2 = pk9.m19383z(i13 | 1);
                                AbstractC2463a.m9357a(u65Var, map, j, i11, i8, i3, i4, nz9Var, str, z, str2, vi3Var, (ye1) obj, iM19383z2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM19383z3 = pk9.m19383z(i13 | 1);
                                AbstractC2463a.m9357a(u65Var, map, j, i11, i8, i3, i4, nz9Var, str, z, str2, vi3Var, (ye1) obj, iM19383z3);
                                break;
                        }
                        return xfaVar;
                    }
                };
                x18Var = x18VarM22143u;
            } else if (((int) (j >> 32)) <= 0 || ((int) (4294967295L & j)) <= 0) {
                x18 x18VarM22143u2 = tj3Var.m22143u();
                if (x18VarM22143u2 == null) {
                    return;
                }
                final int i12 = 1;
                zi3Var = new zi3() { // from class: a27
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i13 = i12;
                        xfa xfaVar = xfa.f68157a;
                        int i14 = i5;
                        switch (i13) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i14 | 1);
                                AbstractC2463a.m9357a(u65Var, map, j, i, i2, i3, i4, nz9Var, str, z, str2, vi3Var, (ye1) obj, iM19383z);
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                int iM19383z2 = pk9.m19383z(i14 | 1);
                                AbstractC2463a.m9357a(u65Var, map, j, i, i2, i3, i4, nz9Var, str, z, str2, vi3Var, (ye1) obj, iM19383z2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM19383z3 = pk9.m19383z(i14 | 1);
                                AbstractC2463a.m9357a(u65Var, map, j, i, i2, i3, i4, nz9Var, str, z, str2, vi3Var, (ye1) obj, iM19383z3);
                                break;
                        }
                        return xfaVar;
                    }
                };
                x18Var = x18VarM22143u2;
            } else {
                boolean z3 = ((234881024 & i6) == 67108864) | ((1879048192 & i6) == 536870912);
                Object objM22097O = tj3Var.m22097O();
                p84 p84Var = we1.f66679a;
                if (z3 || objM22097O == p84Var) {
                    objM22097O = new jn8(str, str, str, str, str, z);
                    tj3Var.m22131l0(objM22097O);
                }
                jn8 jn8Var = (jn8) objM22097O;
                boolean zM22120g = ((29360128 & i6) == 8388608 || ((i6 & 16777216) != 0 && tj3Var.m22120g(nz9Var))) | tj3Var.m22120g(u65Var);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22120g || objM22097O2 == p84Var) {
                    objM22097O2 = new ox9(nz9Var.f53458d, nz9Var.f53455a, nz9Var.f53456b, u65Var.f63492d, u65Var.f63491c, nz9Var.f53466l);
                    tj3Var.m22131l0(objM22097O2);
                }
                ox9 ox9Var = (ox9) objM22097O2;
                boolean zM22122h = tj3Var.m22122h(z2) | tj3Var.m22120g(map);
                Object objM22097O3 = tj3Var.m22097O();
                if (zM22122h || objM22097O3 == p84Var) {
                    objM22097O3 = z2 ? map : AbstractC3194a.m15360M();
                    tj3Var.m22131l0(objM22097O3);
                }
                Map map2 = (Map) objM22097O3;
                int i13 = i6;
                Object[] objArr = {u65Var, new n84(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), ox9Var, jn8Var, str2, map2};
                boolean zM22124i = ((i13 & 896) == 256) | ((i13 & 7168) == 2048) | ((57344 & i13) == 16384) | ((458752 & i13) == 131072) | ((3670016 & i13) == 1048576) | tj3Var.m22124i(context) | ((i9 & 14) == 4) | tj3Var.m22120g(ox9Var) | tj3Var.m22120g(jn8Var) | tj3Var.m22124i(map2) | tj3Var.m22124i(u65Var) | ((i9 & 112) == 32);
                Object objM22097O4 = tj3Var.m22097O();
                if (zM22124i || objM22097O4 == p84Var) {
                    PageCalculatorKt$PageCalculator$3$1 pageCalculatorKt$PageCalculator$3$1 = new PageCalculatorKt$PageCalculator$3$1(j, i, i2, i3, i4, vi3Var, context, str2, ox9Var, jn8Var, map2, u65Var, null);
                    tj3Var.m22131l0(pageCalculatorKt$PageCalculator$3$1);
                    objM22097O4 = pageCalculatorKt$PageCalculator$3$1;
                }
                d32.m10053n(objArr, (zi3) objM22097O4, tj3Var);
            }
            x18Var.f67642d = zi3Var;
        }
        tj3Var.m22102U();
        x18 x18VarM22143u3 = tj3Var.m22143u();
        if (x18VarM22143u3 != null) {
            final int i14 = 2;
            zi3Var = new zi3() { // from class: a27
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = i14;
                    xfa xfaVar = xfa.f68157a;
                    int i16 = i5;
                    switch (i15) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i16 | 1);
                            AbstractC2463a.m9357a(u65Var, map, j, i, i2, i3, i4, nz9Var, str, z, str2, vi3Var, (ye1) obj, iM19383z);
                            break;
                        case 1:
                            ((Integer) obj2).getClass();
                            int iM19383z2 = pk9.m19383z(i16 | 1);
                            AbstractC2463a.m9357a(u65Var, map, j, i, i2, i3, i4, nz9Var, str, z, str2, vi3Var, (ye1) obj, iM19383z2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM19383z3 = pk9.m19383z(i16 | 1);
                            AbstractC2463a.m9357a(u65Var, map, j, i, i2, i3, i4, nz9Var, str, z, str2, vi3Var, (ye1) obj, iM19383z3);
                            break;
                    }
                    return xfaVar;
                }
            };
            x18Var = x18VarM22143u3;
            x18Var.f67642d = zi3Var;
        }
    }
}
