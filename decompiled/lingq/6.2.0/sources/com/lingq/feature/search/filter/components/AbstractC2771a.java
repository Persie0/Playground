package com.lingq.feature.search.filter.components;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.R$string;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.C2919d9;
import p000.C3709w4;
import p000.ab1;
import p000.b16;
import p000.bb1;
import p000.c29;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.e16;
import p000.eh0;
import p000.eq8;
import p000.fe9;
import p000.ge9;
import p000.h41;
import p000.iq8;
import p000.iz4;
import p000.l77;
import p000.lo6;
import p000.lw9;
import p000.ms5;
import p000.mx0;
import p000.nj0;
import p000.oha;
import p000.oq7;
import p000.p84;
import p000.pb1;
import p000.ps5;
import p000.qj8;
import p000.r46;
import p000.s19;
import p000.se1;
import p000.sj8;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.ui8;
import p000.un7;
import p000.ux5;
import p000.v19;
import p000.vh9;
import p000.vi3;
import p000.vk9;
import p000.vz1;
import p000.we1;
import p000.x18;
import p000.y19;
import p000.ye1;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.search.filter.components.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2771a {
    /* JADX INFO: renamed from: a */
    public static final void m9691a(e16 e16Var, s19 s19Var, ui3 ui3Var, ye1 ye1Var, int i) {
        Integer num = s19Var.f60160b;
        String strM23620a0 = s19Var.f60159a;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-818135618);
        int i2 = i | 6 | (tj3Var.m22124i(s19Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Iterable iterable = s19Var.f60161c;
            if (iterable == null) {
                iterable = EmptyList.f47638a;
            }
            tj3Var.m22111b0(-249307518);
            Iterator it = iterable.iterator();
            String strM23620a1 = "";
            int i3 = 0;
            while (it.hasNext()) {
                int i4 = i3 + 1;
                int iIntValue = ((Number) it.next()).intValue();
                if (i3 > 0) {
                    strM23620a1 = strM23620a1.concat(", ");
                }
                strM23620a1 = ux5.m22990m(strM23620a1, vz1.m23620a0(tj3Var, iIntValue));
                i3 = i4;
            }
            tj3Var.m22139q(false);
            if (strM23620a0 == null && num != null) {
                tj3Var.m22111b0(-249300009);
                strM23620a1 = vz1.m23620a0(tj3Var, num.intValue());
                tj3Var.m22139q(false);
            } else if (vk9.m23391n0(strM23620a1)) {
                tj3Var.m22111b0(861720433);
                if (strM23620a0 == null) {
                    tj3Var.m22111b0(-249296797);
                    strM23620a0 = vz1.m23620a0(tj3Var, R$string.search_all);
                } else {
                    tj3Var.m22111b0(-249297231);
                }
                tj3Var.m22139q(false);
                tj3Var.m22139q(false);
                strM23620a1 = strM23620a0;
            } else {
                tj3Var.m22111b0(-249298105);
                tj3Var.m22139q(false);
            }
            m9693c(ui3Var, ci8.m4703P(-1921930656, new iz4(15, s19Var, strM23620a1), tj3Var), tj3Var, ((i2 >> 3) & 112) | 390);
            e16Var = b16.f7762a;
        } else {
            tj3Var.m22102U();
        }
        e16 e16Var2 = e16Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 21, e16Var2, s19Var, ui3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9692b(e16 e16Var, v19 v19Var, zi3 zi3Var, zi3 zi3Var2, ye1 ye1Var, int i) {
        e16 e16Var2;
        v19 v19Var2 = v19Var;
        float f = v19Var2.f64710e;
        zi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1540562879);
        int i2 = i | 6 | (tj3Var.m22124i(v19Var2) ? 32 : 16) | (tj3Var.m22124i(zi3Var2) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            boolean zM22114d = tj3Var.m22114d(v19Var2.f64707b) | tj3Var.m22114d(v19Var2.f64708c) | tj3Var.m22114d(f);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22114d || objM22097O2 == p84Var) {
                oq7 oq7Var = new oq7(v19Var2.f64707b, v19Var2.f64708c, Math.max(((int) f) - 1, 1), new un7(13, t66Var), new h41(0.0f, f));
                tj3Var.m22131l0(oq7Var);
                objM22097O2 = oq7Var;
            }
            oq7 oq7Var2 = (oq7) objM22097O2;
            Boolean bool = (Boolean) t66Var.getValue();
            bool.booleanValue();
            boolean zM22124i = ((i2 & 7168) == 2048) | tj3Var.m22124i(oq7Var2);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i || objM22097O3 == p84Var) {
                objM22097O3 = new SearchFilterSettingsItemsKt$SettingRange$1$1(zi3Var2, oq7Var2, t66Var, null);
                tj3Var.m22131l0(objM22097O3);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O3, bool);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var3 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var3, bb1VarM230a);
            zi3 zi3Var4 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var5 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var5, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var6 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c);
            if (zi3Var == null) {
                tj3Var.m22111b0(1282547972);
            } else {
                tj3Var.m22111b0(1981035165);
                zi3Var.invoke(tj3Var, 6);
            }
            tj3Var.m22139q(false);
            AbstractC0226d0.m1130a(oq7Var2, null, false, null, null, null, null, null, null, tj3Var, 8);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var, 6);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var5, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c2);
            tj3Var.m22111b0(759776549);
            v19Var2 = v19Var;
            Iterator it = v19Var2.f64706a.iterator();
            while (it.hasNext()) {
                String strM23620a0 = vz1.m23620a0(tj3Var, ((Number) it.next()).intValue());
                vh9 vh9Var = ps5.f56764b;
                tj3 tj3Var2 = tj3Var;
                lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71408l, tj3Var2, 0, 0, 131066);
                tj3Var = tj3Var2;
            }
            AbstractC3393o1.m17723A(tj3Var, false, true, true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9((Object) e16Var2, (Object) v19Var2, (Object) zi3Var, (Object) zi3Var2, i, 26);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9693c(ui3 ui3Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-330776385);
        int i3 = i & 6;
        b16 b16Var = b16.f7762a;
        if (i3 == 0) {
            i2 = (tj3Var.m22120g(b16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            r46.m20381f(AbstractC0080f.m815b(null, false, ui3Var, pb1.m19045o(e16VarM4412e, ui8.m22753b(((fe9) tj3Var.m22128k(zf1Var)).f38956e)), 15), ui8.m22753b(((fe9) tj3Var.m22128k(zf1Var)).f38956e), null, null, ci8.m4703P(1129745449, new mx0(c0282a, 8), tj3Var), tj3Var, 24576, 12);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(ui3Var, c0282a, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9694d(e16 e16Var, y19 y19Var, ui3 ui3Var, ye1 ye1Var, int i) {
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(726070800);
        int i2 = i | 6 | (tj3Var.m22120g(y19Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            m9693c(ui3Var, ci8.m4703P(312173874, new iq8(y19Var, i3), tj3Var), tj3Var, ((i2 >> 3) & 112) | 390);
            e16Var = b16.f7762a;
        } else {
            tj3Var.m22102U();
        }
        e16 e16Var2 = e16Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 20, e16Var2, y19Var, ui3Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9695e(e16 e16Var, c29 c29Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(751891986);
        int i2 = i | (tj3Var2.m22120g(e16Var) ? 4 : 2) | (tj3Var2.m22120g(c29Var) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            String strM23620a0 = vz1.m23620a0(tj3Var2, c29Var.f9371a);
            vh9 vh9Var = ps5.f56764b;
            tj3Var = tj3Var2;
            lw9.m16554b(strM23620a0, e16Var, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71405i, tj3Var, (i2 << 3) & 112, 0, 131064);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(e16Var, i, 1, c29Var);
        }
    }
}
