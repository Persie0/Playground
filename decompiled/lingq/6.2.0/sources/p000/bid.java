package p000;

import android.content.Context;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.language.LanguageProgressMetric;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bid {
    /* JADX INFO: renamed from: a */
    public static final void m3745a(String str, ko4 ko4Var, ui3 ui3Var, vi3 vi3Var, vi3 vi3Var2, zi3 zi3Var, vi3 vi3Var3, ye1 ye1Var, int i, int i2) {
        int i3;
        ui3 ui3Var2;
        int i4;
        vi3 vi3Var4;
        int i5;
        vi3 vi3Var5;
        int i6;
        zi3 zi3Var2;
        int i7;
        vi3 vi3Var6;
        int i8;
        ui3 ui3Var3;
        vi3 vi3Var7;
        vi3 vi3Var8;
        zi3 zi3Var3;
        vi3 vi3Var9;
        ui3 ui3Var4;
        vi3 vi3Var10;
        vi3 vi3Var11;
        zi3 zi3Var4;
        vi3 vi3Var12;
        ko4Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-539336779);
        if ((i & 6) == 0) {
            i3 = i | (tj3Var.m22120g(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i9 = i3 | (tj3Var.m22120g(ko4Var) ? 32 : 16);
        int i10 = i2 & 4;
        if (i10 != 0) {
            i4 = i9 | 384;
            ui3Var2 = ui3Var;
        } else {
            ui3Var2 = ui3Var;
            i4 = i9 | (tj3Var.m22124i(ui3Var2) ? 256 : 128);
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i5 = i4 | 3072;
            vi3Var4 = vi3Var;
        } else {
            vi3Var4 = vi3Var;
            i5 = i4 | (tj3Var.m22124i(vi3Var4) ? 2048 : 1024);
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i6 = i5 | 24576;
            vi3Var5 = vi3Var2;
        } else {
            vi3Var5 = vi3Var2;
            i6 = i5 | (tj3Var.m22124i(vi3Var5) ? 16384 : 8192);
        }
        int i13 = i2 & 32;
        if (i13 != 0) {
            i7 = i6 | 196608;
            zi3Var2 = zi3Var;
        } else {
            zi3Var2 = zi3Var;
            i7 = i6 | (tj3Var.m22124i(zi3Var2) ? 131072 : 65536);
        }
        int i14 = i2 & 64;
        if (i14 != 0) {
            i8 = i7 | 1572864;
            vi3Var6 = vi3Var3;
        } else {
            vi3Var6 = vi3Var3;
            i8 = i7 | (tj3Var.m22124i(vi3Var6) ? 1048576 : 524288);
        }
        if (tj3Var.m22099R(i8 & 1, (i8 & 599187) != 599186)) {
            p84 p84Var = we1.f66679a;
            if (i10 != 0) {
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new C3288l7(7);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3Var4 = (ui3) objM22097O;
            } else {
                ui3Var4 = ui3Var2;
            }
            if (i11 != 0) {
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new qy3(14);
                    tj3Var.m22131l0(objM22097O2);
                }
                vi3Var10 = (vi3) objM22097O2;
            } else {
                vi3Var10 = vi3Var4;
            }
            if (i12 != 0) {
                Object objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new qy3(16);
                    tj3Var.m22131l0(objM22097O3);
                }
                vi3Var11 = (vi3) objM22097O3;
            } else {
                vi3Var11 = vi3Var5;
            }
            if (i13 != 0) {
                Object objM22097O4 = tj3Var.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new je1(22);
                    tj3Var.m22131l0(objM22097O4);
                }
                zi3Var4 = (zi3) objM22097O4;
            } else {
                zi3Var4 = zi3Var2;
            }
            if (i14 != 0) {
                Object objM22097O5 = tj3Var.m22097O();
                if (objM22097O5 == p84Var) {
                    objM22097O5 = new qy3(18);
                    tj3Var.m22131l0(objM22097O5);
                }
                vi3Var12 = (vi3) objM22097O5;
            } else {
                vi3Var12 = vi3Var6;
            }
            x17 x17Var = h7a.f41916a;
            rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var), tj3Var);
            b34.m3232b(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), ci8.m4703P(-1206697871, new mn4(rv2VarM13115b, str, ui3Var4, 2), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(-458758458, new hn0((Object) ko4Var, vi3Var10, (Object) vi3Var11, (Object) zi3Var4, (Object) vi3Var12, 8), tj3Var), tj3Var, 805306416, 508);
            ui3Var3 = ui3Var4;
            vi3Var7 = vi3Var10;
            vi3Var8 = vi3Var11;
            zi3Var3 = zi3Var4;
            vi3Var9 = vi3Var12;
        } else {
            tj3Var.m22102U();
            ui3Var3 = ui3Var2;
            vi3Var7 = vi3Var4;
            vi3Var8 = vi3Var5;
            zi3Var3 = zi3Var2;
            vi3Var9 = vi3Var6;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new go4(str, ko4Var, ui3Var3, vi3Var7, vi3Var8, zi3Var3, vi3Var9, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3746b(t17 t17Var, ko4 ko4Var, vi3 vi3Var, vi3 vi3Var2, zi3 zi3Var, vi3 vi3Var3, ye1 ye1Var, int i) {
        int i2;
        vi3 vi3Var4;
        zi3 zi3Var2;
        vi3 vi3Var5;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1103820522);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(t17Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tj3Var2.m22120g(ko4Var) : tj3Var2.m22124i(ko4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            vi3Var4 = vi3Var2;
            i2 |= tj3Var2.m22124i(vi3Var4) ? 2048 : 1024;
        } else {
            vi3Var4 = vi3Var2;
        }
        if ((i & 24576) == 0) {
            zi3Var2 = zi3Var;
            i2 |= tj3Var2.m22124i(zi3Var2) ? 16384 : 8192;
        } else {
            zi3Var2 = zi3Var;
        }
        if ((196608 & i) == 0) {
            vi3Var5 = vi3Var3;
            i2 |= tj3Var2.m22124i(vi3Var5) ? 131072 : 65536;
        } else {
            vi3Var5 = vi3Var3;
        }
        if (tj3Var2.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) objM22097O2;
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21610W = AbstractC3584sr.m21610W(e16VarM4411d, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, t17Var.mo14021d(), ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, t17Var.mo14018a());
            boolean z = ((i2 & 112) == 32 || ((i2 & 64) != 0 && tj3Var2.m22124i(ko4Var))) | ((i2 & 896) == 256) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048) | ((i2 & 458752) == 131072);
            Object objM22097O3 = tj3Var2.m22097O();
            if (z || objM22097O3 == p84Var) {
                dy0 dy0Var = new dy0(ko4Var, t66Var, vi3Var, zi3Var2, t66Var2, vi3Var4, vi3Var5);
                tj3Var2.m22131l0(dy0Var);
                objM22097O3 = dy0Var;
            }
            tj3Var = tj3Var2;
            fa4.m11642c(e16VarM21610W, null, null, null, null, null, false, null, (vi3) objM22097O3, tj3Var, 0, 510);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nu1(t17Var, ko4Var, vi3Var, vi3Var2, zi3Var, vi3Var3, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3747c(en4 en4Var, boolean z, vi3 vi3Var, ye1 ye1Var, int i) {
        en4Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(678796405);
        int i2 = (tj3Var.m22124i(en4Var) ? 4 : 2) | i | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            r46.m20381f(AbstractC3584sr.m21609V(c99.m4411d(b16.f7762a, 1.0f), 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 1), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64856b, te1.m22000n(62, 0.0f), null, ci8.m4703P(1791720415, new xh3(en4Var, z, vi3Var, i3), tj3Var), tj3Var, 24576, 8);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ln0(en4Var, z, vi3Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m3748d(jo4 jo4Var, zi3 zi3Var, ye1 ye1Var, int i) {
        zi3 zi3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(274235975);
        int i2 = (tj3Var.m22124i(jo4Var) ? 4 : 2) | i | (tj3Var.m22124i(zi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            zi3Var2 = zi3Var;
            r46.m20381f(AbstractC3122is.m14092f(AbstractC3584sr.m21609V(c99.m4411d(b16.f7762a, 1.0f), 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 1), null, 3), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64856b, te1.m22000n(62, 0.0f), null, ci8.m4703P(1184061213, new C3357n2(jo4Var, context, zi3Var2, (t66) objM22097O, 8), tj3Var), tj3Var, 24576, 8);
        } else {
            zi3Var2 = zi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(jo4Var, i, 19, zi3Var2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final vi3 m3749e(LanguageProgressMetric languageProgressMetric) {
        int i = ho4.f42687b[languageProgressMetric.ordinal()];
        if (i == 1 || i == 4) {
            return new qy3(20);
        }
        if (i != 5) {
            return null;
        }
        return new qy3(21);
    }
}
