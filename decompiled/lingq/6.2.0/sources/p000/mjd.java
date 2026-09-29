package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mjd {
    /* JADX INFO: renamed from: a */
    public static final void m16863a(final int i, final List list, final boolean z, final vs3 vs3Var, final vi3 vi3Var, final vi3 vi3Var2, final zi3 zi3Var, final vi3 vi3Var3, final zi3 zi3Var2, final vi3 vi3Var4, ye1 ye1Var, final int i2) {
        int i3;
        tj3 tj3Var;
        list.getClass();
        vs3Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        zi3Var.getClass();
        vi3Var3.getClass();
        zi3Var2.getClass();
        vi3Var4.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1716249710);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var2.m22116e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (tj3Var2.m22124i(list) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i4 |= tj3Var2.m22122h(z) ? 256 : 128;
        }
        int i5 = i4 | (tj3Var2.m22124i(vs3Var) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i5 |= tj3Var2.m22124i(vi3Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= tj3Var2.m22124i(vi3Var2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= tj3Var2.m22124i(zi3Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= tj3Var2.m22124i(vi3Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= tj3Var2.m22124i(zi3Var2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= tj3Var2.m22124i(vi3Var4) ? 536870912 : 268435456;
        }
        int i6 = i5;
        if (tj3Var2.m22099R(i6 & 1, (306783379 & i5) != 306783378)) {
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            e16 e16VarM10007D = d32.m10007D(e16VarM4411d, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55872p, ss5.f61356d);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM10007D);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            a6d.m144b(i, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55872p, 0L, null, null, ci8.m4703P(623073342, new n14(i, vi3Var, 3), tj3Var2), tj3Var2, (i6 & 14) | 1572864);
            int i7 = i6 >> 6;
            m16864b(vs3Var, list, z, vi3Var2, zi3Var, vi3Var3, zi3Var2, vi3Var4, tj3Var2, ((i6 >> 9) & 14) | (i6 & 112) | (i6 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128));
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: e75
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mjd.m16863a(i, list, z, vs3Var, vi3Var, vi3Var2, zi3Var, vi3Var3, zi3Var2, vi3Var4, (ye1) obj, pk9.m19383z(i2 | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m16864b(final vs3 vs3Var, final List list, boolean z, vi3 vi3Var, zi3 zi3Var, vi3 vi3Var2, zi3 zi3Var2, final vi3 vi3Var3, ye1 ye1Var, int i) {
        int i2;
        final boolean z2;
        vi3 vi3Var4;
        zi3 zi3Var3;
        vi3 vi3Var5;
        zi3 zi3Var4;
        tj3 tj3Var;
        vs3Var.getClass();
        list.getClass();
        vi3Var.getClass();
        zi3Var.getClass();
        vi3Var2.getClass();
        zi3Var2.getClass();
        vi3Var3.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(791041550);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(vs3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (tj3Var2.m22124i(list) ? 32 : 16);
        if ((i & 384) == 0) {
            z2 = z;
            i3 |= tj3Var2.m22122h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            vi3Var4 = vi3Var;
            i3 |= tj3Var2.m22124i(vi3Var4) ? 2048 : 1024;
        } else {
            vi3Var4 = vi3Var;
        }
        if ((i & 24576) == 0) {
            zi3Var3 = zi3Var;
            i3 |= tj3Var2.m22124i(zi3Var3) ? 16384 : 8192;
        } else {
            zi3Var3 = zi3Var;
        }
        if ((196608 & i) == 0) {
            vi3Var5 = vi3Var2;
            i3 |= tj3Var2.m22124i(vi3Var5) ? 131072 : 65536;
        } else {
            vi3Var5 = vi3Var2;
        }
        if ((1572864 & i) == 0) {
            zi3Var4 = zi3Var2;
            i3 |= tj3Var2.m22124i(zi3Var4) ? 1048576 : 524288;
        } else {
            zi3Var4 = zi3Var2;
        }
        if ((i & 12582912) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var3) ? 8388608 : 4194304;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 4793491) != 4793490)) {
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4411d(b16.f7762a, 1.0f), ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38960i, 0.0f, 2);
            boolean zM22124i = tj3Var2.m22124i(list) | ((i3 & 7168) == 2048) | tj3Var2.m22124i(vs3Var) | ((i3 & 896) == 256) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576) | ((i3 & 29360128) == 8388608);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                final vi3 vi3Var6 = vi3Var4;
                final zi3 zi3Var5 = zi3Var3;
                final vi3 vi3Var7 = vi3Var5;
                final zi3 zi3Var6 = zi3Var4;
                vi3 vi3Var8 = new vi3() { // from class: f75
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        vu4 vu4Var = (vu4) obj;
                        vu4Var.getClass();
                        vu4.m23545g(vu4Var, null, txb.f63074a, 3);
                        ry4 ry4Var = new ry4(10);
                        List list2 = list;
                        vu4Var.m23547h(list2.size(), new ue0(14, ry4Var, list2), new C3520r2(20, list2), new C0282a(802480018, true, new h75(list2, vi3Var6, vs3Var, z2, zi3Var5, vi3Var7, zi3Var6, vi3Var3)));
                        return xfa.f68157a;
                    }
                };
                tj3Var2.m22131l0(vi3Var8);
                objM22097O = vi3Var8;
            }
            tj3Var = tj3Var2;
            fa4.m11642c(e16VarM21609V, null, null, null, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 510);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g75(vs3Var, list, z, vi3Var, zi3Var, vi3Var2, zi3Var2, vi3Var3, i);
        }
    }
}
