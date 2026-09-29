package com.lingq.feature.lessoninfo;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.p012ui.LessonInfoSource;
import dagger.hilt.android.lifecycle.AbstractC2921a;
import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C2919d9;
import p000.C2956e9;
import p000.C3386nv;
import p000.C3587su;
import p000.C3836zk;
import p000.a05;
import p000.a35;
import p000.a45;
import p000.ab1;
import p000.aj3;
import p000.as4;
import p000.b16;
import p000.b45;
import p000.bb1;
import p000.bna;
import p000.c35;
import p000.c45;
import p000.c55;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.d35;
import p000.dh9;
import p000.djd;
import p000.do7;
import p000.dp4;
import p000.dua;
import p000.e16;
import p000.e35;
import p000.e65;
import p000.ec0;
import p000.eh0;
import p000.ejd;
import p000.fjd;
import p000.fl4;
import p000.fy4;
import p000.g35;
import p000.g91;
import p000.ge9;
import p000.gjd;
import p000.gm5;
import p000.gr3;
import p000.ho9;
import p000.ht5;
import p000.k35;
import p000.l35;
import p000.l77;
import p000.m35;
import p000.n35;
import p000.nj0;
import p000.o35;
import p000.oha;
import p000.or1;
import p000.p35;
import p000.p84;
import p000.pfa;
import p000.q35;
import p000.qh0;
import p000.qj8;
import p000.r35;
import p000.rw1;
import p000.ry4;
import p000.s35;
import p000.sc9;
import p000.se0;
import p000.se1;
import p000.si5;
import p000.sj8;
import p000.ss5;
import p000.t35;
import p000.t66;
import p000.thb;
import p000.tj3;
import p000.u25;
import p000.u35;
import p000.ui3;
import p000.ux5;
import p000.v35;
import p000.vi3;
import p000.vk9;
import p000.w35;
import p000.we1;
import p000.wid;
import p000.x18;
import p000.xfa;
import p000.xid;
import p000.y35;
import p000.y38;
import p000.ye1;
import p000.yid;
import p000.zg0;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.lessoninfo.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2131b {
    /* JADX INFO: renamed from: a */
    public static final void m9042a(final g35 g35Var, ui3 ui3Var, ye1 ye1Var, int i) {
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1474304955);
        int i2 = (tj3Var.m22120g(g35Var) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new ry4(6);
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var = (vi3) objM22097O;
            dua duaVarM21396a = si5.m21396a(tj3Var);
            if (duaVarM21396a == null) {
                C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final C2132c c2132c = (C2132c) pfa.m19114d(y38.m24933a(C2132c.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? AbstractC2921a.m10257a(((gr3) duaVarM21396a).mo2103e(), vi3Var) : AbstractC2921a.m10257a(or1.f54780b, vi3Var), tj3Var);
            final t66 t66VarM2513c = AbstractC0711a.m2513c(c2132c.f26410D, tj3Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            final t66 t66Var = (t66) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1257g(-1);
                tj3Var.m22131l0(objM22097O3);
            }
            final sc9 sc9Var = (sc9) objM22097O3;
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1260j("");
                tj3Var.m22131l0(objM22097O4);
            }
            final t66 t66Var2 = (t66) objM22097O4;
            Object objM22097O5 = tj3Var.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O5);
            }
            final t66 t66Var3 = (t66) objM22097O5;
            ho9.m13414a(c99.m4411d(b16.f7762a, 1.0f), null, 0L, 0L, 0.0f, 0.0f, null, ci8.m4703P(-1927345024, new zi3() { // from class: com.lingq.feature.lessoninfo.a
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        dh9 dh9Var = t66VarM2513c;
                        w35 w35Var = (w35) dh9Var.getValue();
                        C2132c c2132c2 = c2132c;
                        boolean zM22124i = tj3Var2.m22124i(c2132c2);
                        Object objM22097O6 = tj3Var2.m22097O();
                        p84 p84Var2 = we1.f66679a;
                        if (zM22124i || objM22097O6 == p84Var2) {
                            LessonInfoSheetKt$LessonInfoFragmentRoute$1$1$1 lessonInfoSheetKt$LessonInfoFragmentRoute$1$1$1 = new LessonInfoSheetKt$LessonInfoFragmentRoute$1$1$1(1, c2132c2, C2132c.class, "handleUiAction", "handleUiAction(Lcom/lingq/feature/lessoninfo/LessonInfoUiAction;)V", 0);
                            tj3Var2.m22131l0(lessonInfoSheetKt$LessonInfoFragmentRoute$1$1$1);
                            objM22097O6 = lessonInfoSheetKt$LessonInfoFragmentRoute$1$1$1;
                        }
                        vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O6);
                        g35 g35Var2 = g35Var;
                        boolean zM22124i2 = tj3Var2.m22124i(g35Var2) | tj3Var2.m22120g(dh9Var);
                        Object objM22097O7 = tj3Var2.m22097O();
                        if (zM22124i2 || objM22097O7 == p84Var2) {
                            b45 b45Var = new b45(g35Var2, sc9Var, t66Var2, t66Var3, t66Var, dh9Var, 0);
                            tj3Var2.m22131l0(b45Var);
                            objM22097O7 = b45Var;
                        }
                        AbstractC2131b.m9044c(w35Var, vi3Var2, (vi3) objM22097O7, tj3Var2, 0);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 12582918, 126);
            d32.m10060t(((Boolean) t66Var.getValue()).booleanValue(), sc9Var.m21222h(), (String) t66Var2.getValue(), false, ((Boolean) t66Var3.getValue()).booleanValue(), new c45(0, ui3Var, t66Var), null, tj3Var, 3072, 64);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(g35Var, i, 27, ui3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9043b(String str, String str2, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1124673090);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            yid.m25158a(str, str2, null, ui3Var, tj3Var, ((i2 << 3) & 7168) | (i2 & 14) | 384 | (i2 & 112));
            e16 e16VarM17728c = AbstractC3393o1.m17728c(1.0f, c99.m4412e(b16Var, 1.0f), true);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM17728c);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            do7.m10527c(null, 0L, 0.0f, 0.0f, tj3Var, 0, 15);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dp4(str, str2, ui3Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9044c(w35 w35Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        w35Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(854315346);
        int i2 = (tj3Var.m22120g(w35Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        }
        if (!tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var.m22102U();
        } else if (w35Var instanceof u35) {
            tj3Var.m22111b0(-1067487157);
            u35 u35Var = (u35) w35Var;
            String str = u35Var.f63348a;
            String str2 = u35Var.f63349b;
            boolean z = (i2 & 896) == 256;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new fl4(vi3Var2, 26);
                tj3Var.m22131l0(objM22097O);
            }
            m9043b(str, str2, (ui3) objM22097O, tj3Var, 0);
            tj3Var.m22139q(false);
        } else {
            if (!(w35Var instanceof v35)) {
                throw ux5.m23001x(tj3Var, 658300275, false);
            }
            tj3Var.m22111b0(-1066948656);
            m9047f((v35) w35Var, vi3Var, vi3Var2, tj3Var, i2 & 1022);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 29, w35Var, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9045d(w35 w35Var, vi3 vi3Var, vi3 vi3Var2, C0269z c0269z, ye1 ye1Var, int i) {
        tj3 tj3Var;
        w35Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1069395975);
        int i2 = i | (tj3Var2.m22120g(w35Var) ? 4 : 2) | (tj3Var2.m22124i(vi3Var) ? 256 : 128) | (tj3Var2.m22124i(vi3Var2) ? 2048 : 1024) | (tj3Var2.m22120g(c0269z) ? 16384 : 8192);
        int i3 = 1;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            tj3Var2.m22111b0(-1691609522);
            boolean z = (i2 & 7168) == 2048;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new fl4(vi3Var2, 28);
                tj3Var2.m22131l0(objM22097O);
            }
            AbstractC0231g.m1150c((ui3) objM22097O, null, c0269z, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(1673702894, new a05(w35Var, vi3Var, vi3Var2, i3), tj3Var2), tj3Var2, ((i2 >> 6) & 896) | 24576, 3078, 7146);
            tj3Var = tj3Var2;
            tj3Var.m22139q(false);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9(w35Var, vi3Var, vi3Var2, c0269z, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9046e(s35 s35Var, a35 a35Var, ui3 ui3Var, ye1 ye1Var, int i) {
        sc9 sc9Var;
        t66 t66Var;
        t66 t66Var2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1415948142);
        int i2 = i | (tj3Var.m22120g(s35Var) ? 4 : 2) | (tj3Var.m22120g(a35Var) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            String strM22988k = ux5.m22988k(s35Var.f60230a, "lessonInfo_");
            boolean z = (i2 & 14) == 4;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new fy4(s35Var, 4);
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var = (vi3) objM22097O;
            dua duaVarM21396a = si5.m21396a(tj3Var);
            if (duaVarM21396a == null) {
                C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            C2132c c2132c = (C2132c) pfa.m19114d(y38.m24933a(C2132c.class), duaVarM21396a, strM22988k, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? AbstractC2921a.m10257a(((gr3) duaVarM21396a).mo2103e(), vi3Var) : AbstractC2921a.m10257a(or1.f54780b, vi3Var), tj3Var);
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2132c.f26410D, tj3Var);
            C0269z c0269zM1154g = AbstractC0231g.m1154g(true, tj3Var, 6, 2);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var3 = (t66) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1257g(-1);
                tj3Var.m22131l0(objM22097O3);
            }
            sc9 sc9Var2 = (sc9) objM22097O3;
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1260j("");
                tj3Var.m22131l0(objM22097O4);
            }
            t66 t66Var4 = (t66) objM22097O4;
            Object objM22097O5 = tj3Var.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O5);
            }
            t66 t66Var5 = (t66) objM22097O5;
            w35 w35Var = (w35) t66VarM2513c.getValue();
            boolean zM22124i = tj3Var.m22124i(c2132c);
            Object objM22097O6 = tj3Var.m22097O();
            if (zM22124i || objM22097O6 == p84Var) {
                objM22097O6 = new LessonInfoSheetKt$LessonInfoSheetRoute$2$1(1, c2132c, C2132c.class, "handleUiAction", "handleUiAction(Lcom/lingq/feature/lessoninfo/LessonInfoUiAction;)V", 0);
                tj3Var.m22131l0(objM22097O6);
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O6);
            boolean zM22120g = tj3Var.m22120g(t66VarM2513c) | ((i2 & 896) == 256);
            Object objM22097O7 = tj3Var.m22097O();
            if (zM22120g || objM22097O7 == p84Var) {
                sc9Var = sc9Var2;
                t66Var = t66Var5;
                t66Var2 = t66Var4;
                objM22097O7 = new b45(a35Var, sc9Var, t66Var2, t66Var, t66Var3, t66VarM2513c, 1);
                tj3Var.m22131l0(objM22097O7);
            } else {
                sc9Var = sc9Var2;
                t66Var = t66Var5;
                t66Var2 = t66Var4;
            }
            m9045d(w35Var, vi3Var2, (vi3) objM22097O7, c0269zM1154g, tj3Var, 48);
            d32.m10060t(((Boolean) t66Var3.getValue()).booleanValue(), sc9Var.m21222h(), (String) t66Var2.getValue(), false, ((Boolean) t66Var.getValue()).booleanValue(), new c45(1, ui3Var, t66Var3), null, tj3Var, 3072, 64);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 20, s35Var, a35Var, ui3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0350  */
    /* JADX WARN: Code duplicated, block: B:103:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0361  */
    /* JADX WARN: Code duplicated, block: B:109:0x0370  */
    /* JADX WARN: Code duplicated, block: B:110:0x0372  */
    /* JADX WARN: Code duplicated, block: B:113:0x037f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0384  */
    /* JADX WARN: Code duplicated, block: B:87:0x031d  */
    /* JADX WARN: Code duplicated, block: B:88:0x031f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0332  */
    /* JADX WARN: Code duplicated, block: B:94:0x0337  */
    /* JADX WARN: Code duplicated, block: B:95:0x033a  */
    /* JADX WARN: Code duplicated, block: B:99:0x034e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX INFO: renamed from: f */
    public static final void m9047f(v35 v35Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        ui3 ui3Var;
        int i2;
        final c35 c35Var;
        boolean z;
        ?? r11;
        int i3;
        Object obj;
        v35 v35Var2;
        final vi3 vi3Var3;
        b16 b16Var;
        final vi3 vi3Var4;
        tj3 tj3Var2;
        String str;
        int i4;
        boolean z2;
        tj3 tj3Var3;
        String str2;
        e35 e35Var;
        ?? r13;
        Object obj2;
        Object obj3;
        Object obj4;
        int i5;
        Object obj5;
        boolean z3;
        boolean zM22120g;
        Object objM22097O;
        Object obj6;
        boolean z4;
        boolean zM22120g2;
        Object obj7;
        boolean z5;
        boolean zM22120g3;
        Object obj8;
        tj3 tj3Var4 = (tj3) ye1Var;
        tj3Var4.m22115d0(-843582784);
        int i6 = (tj3Var4.m22120g(v35Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i6 |= tj3Var4.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= tj3Var4.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var4.m22099R(i6 & 1, (i6 & 147) != 146)) {
            c35 c35Var2 = v35Var.f64783a;
            e35 e35Var2 = v35Var.f64785c;
            u25 u25Var = v35Var.f64787e;
            String str3 = u25Var.f63316e;
            d35 d35Var = v35Var.f64784b;
            LessonInfoSource lessonInfoSource = v35Var.f64789g.f7864a;
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var2, 1.0f);
            C3587su c3587su = eh0.f37238d;
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
            int iHashCode = Long.hashCode(tj3Var4.f62385T);
            l77 l77VarM22132m = tj3Var4.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var4, e16VarM4411d);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var4.m22119f0();
            if (tj3Var4.f62384S) {
                tj3Var4.m22130l(ui3Var2);
            } else {
                tj3Var4.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var4, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var4, zi3Var3, numValueOf);
            vi3 vi3Var5 = C0352b.f4305h;
            oha.m18000f(tj3Var4, vi3Var5);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c);
            String str4 = c35Var2.f9391b;
            List list = c35Var2.f9406q;
            String str5 = c35Var2.f9405p;
            boolean z6 = c35Var2.f9402m;
            String str6 = c35Var2.f9392c;
            String str7 = c35Var2.f9394e;
            String str8 = c35Var2.f9395f;
            int i7 = i6 & 896;
            int i8 = i6;
            boolean z7 = i7 == 256;
            Object objM22097O2 = tj3Var4.m22097O();
            Object obj9 = we1.f66679a;
            Object obj10 = objM22097O2;
            if (z7 || objM22097O2 == obj9) {
                Object fl4Var = new fl4(vi3Var2, 27);
                tj3Var4.m22131l0(fl4Var);
                obj10 = fl4Var;
            }
            yid.m25158a(str4, str7, str8, (ui3) obj10, tj3Var4, 0);
            e16 e16VarM21609V = AbstractC3584sr.m21609V(bna.m3912B0(new as4(1.0f, true), bna.m3972r0(tj3Var4), false, 14), ge9.m12515a(tj3Var4).f38960i, 0.0f, 2);
            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
            int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
            l77 l77VarM22132m2 = tj3Var4.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, e16VarM21609V);
            tj3Var4.m22119f0();
            if (tj3Var4.f62384S) {
                ui3Var = ui3Var2;
                tj3Var4.m22130l(ui3Var);
            } else {
                ui3Var = ui3Var2;
                tj3Var4.m22137o0();
            }
            oha.m18001g(tj3Var4, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var4, zi3Var3, tj3Var4, vi3Var5);
            oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c2);
            thb.m22044c(tj3Var4, c99.m4414g(b16Var2, ge9.m12515a(tj3Var4).f38952a));
            djd.m10421a(c35Var2.f9397h, 0, tj3Var4, c35Var2.f9393d, c35Var2.f9396g);
            if (list.isEmpty()) {
                tj3Var4.m22111b0(1833279598);
                tj3Var4.m22139q(false);
            } else {
                tj3Var4.m22111b0(1833138331);
                thb.m22044c(tj3Var4, c99.m4414g(b16Var2, ge9.m12515a(tj3Var4).f38952a));
                djd.m10422b(list, tj3Var4, 0);
                tj3Var4.m22139q(false);
            }
            e16 e16VarM22984g = ux5.m22984g(b16Var2, ge9.m12515a(tj3Var4).f38956e, tj3Var4, b16Var2, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var4, 6);
            int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
            l77 l77VarM22132m3 = tj3Var4.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM22984g);
            tj3Var4.m22119f0();
            if (tj3Var4.f62384S) {
                tj3Var4.m22130l(ui3Var);
            } else {
                tj3Var4.m22137o0();
            }
            oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var4, zi3Var3, tj3Var4, vi3Var5);
            as4 as4VarM10871c = e65.m10871c(tj3Var4, e16VarM1322c3, zi3Var4, 1.0f, true);
            bb1 bb1VarM230a3 = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
            int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
            l77 l77VarM22132m4 = tj3Var4.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, as4VarM10871c);
            tj3Var4.m22119f0();
            if (tj3Var4.f62384S) {
                tj3Var4.m22130l(ui3Var);
            } else {
                tj3Var4.m22137o0();
            }
            oha.m18001g(tj3Var4, zi3Var, bb1VarM230a3);
            oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var4, zi3Var3, tj3Var4, vi3Var5);
            oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c4);
            fjd.m11919c(d35Var.f34902a, d35Var.f34903b, d35Var.f34904c, c35Var2.f9398i, d35Var.f34905d, d35Var.f34906e, tj3Var4, 0);
            tj3 tj3Var5 = tj3Var4;
            tj3Var5.m22139q(true);
            thb.m22044c(tj3Var5, c99.m4426s(b16Var2, ge9.m12515a(tj3Var5).f38957f));
            e35 e35Var3 = e35Var2;
            fjd.m11917a(c35Var2.f9399j, c35Var2.f9400k, e35Var2 != null ? e35Var3.f36647c : null, c35Var2.f9401l, tj3Var5, 0);
            tj3Var5.m22139q(true);
            thb.m22044c(tj3Var5, c99.m4414g(b16Var2, ge9.m12515a(tj3Var5).f38957f));
            if (z6) {
                i2 = 32;
                e35Var3 = e35Var3;
                c35Var = c35Var2;
                z = true;
                r11 = 0;
                i3 = i7;
                obj = obj9;
                v35Var2 = v35Var;
                vi3Var3 = vi3Var2;
                b16Var = b16Var2;
                vi3Var4 = vi3Var;
                tj3Var5.m22111b0(1836455982);
                tj3Var5.m22139q(false);
                tj3Var2 = tj3Var5;
            } else {
                tj3Var5.m22111b0(1834816516);
                PlaylistButtonState playlistButtonState = u25Var.f63312a > 0 ? PlaylistButtonState.Remove : PlaylistButtonState.Add;
                boolean z8 = d35Var.f34907f;
                PlaylistButtonState playlistButtonState2 = playlistButtonState;
                boolean z9 = d35Var.f34908g;
                boolean z10 = u25Var.f63313b;
                boolean z11 = u25Var.f63314c;
                boolean zEquals = str3.equals("generating");
                boolean zEquals2 = str3.equals("downloading");
                int i9 = u25Var.f63317f;
                int i10 = i8 & 112;
                boolean zM22120g4 = ((i8 & 14) == 4) | (i7 == 256) | tj3Var5.m22120g(c35Var2) | (i10 == 32);
                Object objM22097O3 = tj3Var5.m22097O();
                if (zM22120g4) {
                    obj3 = obj9;
                } else {
                    obj3 = obj9;
                    if (objM22097O3 != obj3) {
                        obj4 = obj3;
                        i3 = i7;
                        c35Var = c35Var2;
                        i5 = 32;
                        v35Var2 = v35Var;
                        vi3Var4 = vi3Var;
                        vi3Var3 = vi3Var2;
                        obj5 = objM22097O3;
                    }
                    ui3 ui3Var3 = (ui3) obj5;
                    if (i10 == i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zM22120g = z3 | tj3Var5.m22120g(c35Var) | tj3Var5.m22120g(d35Var);
                    objM22097O = tj3Var5.m22097O();
                    if (zM22120g) {
                        obj = obj4;
                    } else {
                        obj = obj4;
                        if (objM22097O == obj) {
                            obj6 = objM22097O;
                        }
                        ui3 ui3Var4 = (ui3) obj6;
                        if (i10 == 32) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zM22120g2 = z4 | tj3Var5.m22120g(c35Var);
                        Object objM22097O4 = tj3Var5.m22097O();
                        if (!zM22120g2 || objM22097O4 == obj) {
                            final int i11 = 0;
                            Object obj11 = new ui3() { // from class: z35
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i12 = i11;
                                    xfa xfaVar = xfa.f68157a;
                                    c35 c35Var3 = c35Var;
                                    vi3 vi3Var6 = vi3Var4;
                                    switch (i12) {
                                        case 0:
                                            vi3Var6.invoke(new o45(c35Var3.f9390a));
                                            break;
                                        case 1:
                                            vi3Var6.invoke(new l45(c35Var3.f9390a));
                                            break;
                                        case 2:
                                            vi3Var6.invoke(new m35(c35Var3.f9392c));
                                            break;
                                        default:
                                            vi3Var6.invoke(new p35(c35Var3.f9405p));
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var5.m22131l0(obj11);
                            obj7 = obj11;
                        } else {
                            obj7 = objM22097O4;
                        }
                        ui3 ui3Var5 = (ui3) obj7;
                        if (i10 == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        zM22120g3 = z5 | tj3Var5.m22120g(c35Var);
                        Object objM22097O5 = tj3Var5.m22097O();
                        if (!zM22120g3 || objM22097O5 == obj) {
                            z = true;
                            final boolean z12 = true ? 1 : 0;
                            Object obj12 = new ui3() { // from class: z35
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i12 = z12;
                                    xfa xfaVar = xfa.f68157a;
                                    c35 c35Var3 = c35Var;
                                    vi3 vi3Var6 = vi3Var4;
                                    switch (i12) {
                                        case 0:
                                            vi3Var6.invoke(new o45(c35Var3.f9390a));
                                            break;
                                        case 1:
                                            vi3Var6.invoke(new l45(c35Var3.f9390a));
                                            break;
                                        case 2:
                                            vi3Var6.invoke(new m35(c35Var3.f9392c));
                                            break;
                                        default:
                                            vi3Var6.invoke(new p35(c35Var3.f9405p));
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var5.m22131l0(obj12);
                            obj8 = obj12;
                        } else {
                            z = true;
                            obj8 = objM22097O5;
                        }
                        ui3 ui3Var6 = (ui3) obj8;
                        i2 = 32;
                        wid.m23994a(playlistButtonState2, z8, z9, z10, z11, zEquals, zEquals2, i9, ui3Var3, ui3Var4, ui3Var5, ui3Var6, tj3Var5, 0);
                        tj3 tj3Var6 = tj3Var5;
                        b16Var = b16Var2;
                        r11 = 0;
                        ux5.m23003z(b16Var, ge9.m12515a(tj3Var6).f38956e, tj3Var6, false);
                        tj3Var2 = tj3Var6;
                    }
                    Object zg0Var = new zg0(vi3Var4, c35Var, d35Var, 16);
                    tj3Var5.m22131l0(zg0Var);
                    obj6 = zg0Var;
                    ui3 ui3Var7 = (ui3) obj6;
                    if (i10 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM22120g2 = z4 | tj3Var5.m22120g(c35Var);
                    Object objM22097O6 = tj3Var5.m22097O();
                    if (zM22120g2) {
                        final int i12 = 0;
                        Object obj13 = new ui3() { // from class: z35
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i13 = i12;
                                xfa xfaVar = xfa.f68157a;
                                c35 c35Var3 = c35Var;
                                vi3 vi3Var6 = vi3Var4;
                                switch (i13) {
                                    case 0:
                                        vi3Var6.invoke(new o45(c35Var3.f9390a));
                                        break;
                                    case 1:
                                        vi3Var6.invoke(new l45(c35Var3.f9390a));
                                        break;
                                    case 2:
                                        vi3Var6.invoke(new m35(c35Var3.f9392c));
                                        break;
                                    default:
                                        vi3Var6.invoke(new p35(c35Var3.f9405p));
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var5.m22131l0(obj13);
                        obj7 = obj13;
                    } else {
                        final int i13 = 0;
                        Object obj14 = new ui3() { // from class: z35
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i14 = i13;
                                xfa xfaVar = xfa.f68157a;
                                c35 c35Var3 = c35Var;
                                vi3 vi3Var6 = vi3Var4;
                                switch (i14) {
                                    case 0:
                                        vi3Var6.invoke(new o45(c35Var3.f9390a));
                                        break;
                                    case 1:
                                        vi3Var6.invoke(new l45(c35Var3.f9390a));
                                        break;
                                    case 2:
                                        vi3Var6.invoke(new m35(c35Var3.f9392c));
                                        break;
                                    default:
                                        vi3Var6.invoke(new p35(c35Var3.f9405p));
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var5.m22131l0(obj14);
                        obj7 = obj14;
                    }
                    ui3 ui3Var8 = (ui3) obj7;
                    if (i10 == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zM22120g3 = z5 | tj3Var5.m22120g(c35Var);
                    Object objM22097O7 = tj3Var5.m22097O();
                    if (zM22120g3) {
                        z = true;
                        final int z13 = true ? 1 : 0;
                        Object obj15 = new ui3() { // from class: z35
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i14 = z13;
                                xfa xfaVar = xfa.f68157a;
                                c35 c35Var3 = c35Var;
                                vi3 vi3Var6 = vi3Var4;
                                switch (i14) {
                                    case 0:
                                        vi3Var6.invoke(new o45(c35Var3.f9390a));
                                        break;
                                    case 1:
                                        vi3Var6.invoke(new l45(c35Var3.f9390a));
                                        break;
                                    case 2:
                                        vi3Var6.invoke(new m35(c35Var3.f9392c));
                                        break;
                                    default:
                                        vi3Var6.invoke(new p35(c35Var3.f9405p));
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var5.m22131l0(obj15);
                        obj8 = obj15;
                    } else {
                        z = true;
                        final int z14 = true ? 1 : 0;
                        Object obj16 = new ui3() { // from class: z35
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i14 = z14;
                                xfa xfaVar = xfa.f68157a;
                                c35 c35Var3 = c35Var;
                                vi3 vi3Var6 = vi3Var4;
                                switch (i14) {
                                    case 0:
                                        vi3Var6.invoke(new o45(c35Var3.f9390a));
                                        break;
                                    case 1:
                                        vi3Var6.invoke(new l45(c35Var3.f9390a));
                                        break;
                                    case 2:
                                        vi3Var6.invoke(new m35(c35Var3.f9392c));
                                        break;
                                    default:
                                        vi3Var6.invoke(new p35(c35Var3.f9405p));
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var5.m22131l0(obj16);
                        obj8 = obj16;
                    }
                    ui3 ui3Var9 = (ui3) obj8;
                    i2 = 32;
                    wid.m23994a(playlistButtonState2, z8, z9, z10, z11, zEquals, zEquals2, i9, ui3Var3, ui3Var7, ui3Var8, ui3Var9, tj3Var5, 0);
                    tj3 tj3Var7 = tj3Var5;
                    b16Var = b16Var2;
                    r11 = 0;
                    ux5.m23003z(b16Var, ge9.m12515a(tj3Var7).f38956e, tj3Var7, false);
                    tj3Var2 = tj3Var7;
                }
                c35Var = c35Var2;
                obj4 = obj3;
                i3 = i7;
                i5 = 32;
                v35Var2 = v35Var;
                vi3Var4 = vi3Var;
                vi3Var3 = vi3Var2;
                Object g91Var = new g91(v35Var2, vi3Var3, c35Var, vi3Var4, 10);
                tj3Var5.m22131l0(g91Var);
                obj5 = g91Var;
                ui3 ui3Var10 = (ui3) obj5;
                if (i10 == i5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zM22120g = z3 | tj3Var5.m22120g(c35Var) | tj3Var5.m22120g(d35Var);
                objM22097O = tj3Var5.m22097O();
                if (zM22120g) {
                    obj = obj4;
                    if (objM22097O == obj) {
                        obj6 = objM22097O;
                    }
                    ui3 ui3Var11 = (ui3) obj6;
                    if (i10 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM22120g2 = z4 | tj3Var5.m22120g(c35Var);
                    Object objM22097O8 = tj3Var5.m22097O();
                    if (zM22120g2) {
                        final int i14 = 0;
                        Object obj17 = new ui3() { // from class: z35
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i15 = i14;
                                xfa xfaVar = xfa.f68157a;
                                c35 c35Var3 = c35Var;
                                vi3 vi3Var6 = vi3Var4;
                                switch (i15) {
                                    case 0:
                                        vi3Var6.invoke(new o45(c35Var3.f9390a));
                                        break;
                                    case 1:
                                        vi3Var6.invoke(new l45(c35Var3.f9390a));
                                        break;
                                    case 2:
                                        vi3Var6.invoke(new m35(c35Var3.f9392c));
                                        break;
                                    default:
                                        vi3Var6.invoke(new p35(c35Var3.f9405p));
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var5.m22131l0(obj17);
                        obj7 = obj17;
                    } else {
                        final int i15 = 0;
                        Object obj18 = new ui3() { // from class: z35
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i16 = i15;
                                xfa xfaVar = xfa.f68157a;
                                c35 c35Var3 = c35Var;
                                vi3 vi3Var6 = vi3Var4;
                                switch (i16) {
                                    case 0:
                                        vi3Var6.invoke(new o45(c35Var3.f9390a));
                                        break;
                                    case 1:
                                        vi3Var6.invoke(new l45(c35Var3.f9390a));
                                        break;
                                    case 2:
                                        vi3Var6.invoke(new m35(c35Var3.f9392c));
                                        break;
                                    default:
                                        vi3Var6.invoke(new p35(c35Var3.f9405p));
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var5.m22131l0(obj18);
                        obj7 = obj18;
                    }
                    ui3 ui3Var12 = (ui3) obj7;
                    if (i10 == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zM22120g3 = z5 | tj3Var5.m22120g(c35Var);
                    Object objM22097O9 = tj3Var5.m22097O();
                    if (zM22120g3) {
                        z = true;
                        final int z15 = true ? 1 : 0;
                        Object obj19 = new ui3() { // from class: z35
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i16 = z15;
                                xfa xfaVar = xfa.f68157a;
                                c35 c35Var3 = c35Var;
                                vi3 vi3Var6 = vi3Var4;
                                switch (i16) {
                                    case 0:
                                        vi3Var6.invoke(new o45(c35Var3.f9390a));
                                        break;
                                    case 1:
                                        vi3Var6.invoke(new l45(c35Var3.f9390a));
                                        break;
                                    case 2:
                                        vi3Var6.invoke(new m35(c35Var3.f9392c));
                                        break;
                                    default:
                                        vi3Var6.invoke(new p35(c35Var3.f9405p));
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var5.m22131l0(obj19);
                        obj8 = obj19;
                    } else {
                        z = true;
                        final int z16 = true ? 1 : 0;
                        Object obj110 = new ui3() { // from class: z35
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i16 = z16;
                                xfa xfaVar = xfa.f68157a;
                                c35 c35Var3 = c35Var;
                                vi3 vi3Var6 = vi3Var4;
                                switch (i16) {
                                    case 0:
                                        vi3Var6.invoke(new o45(c35Var3.f9390a));
                                        break;
                                    case 1:
                                        vi3Var6.invoke(new l45(c35Var3.f9390a));
                                        break;
                                    case 2:
                                        vi3Var6.invoke(new m35(c35Var3.f9392c));
                                        break;
                                    default:
                                        vi3Var6.invoke(new p35(c35Var3.f9405p));
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var5.m22131l0(obj110);
                        obj8 = obj110;
                    }
                    ui3 ui3Var13 = (ui3) obj8;
                    i2 = 32;
                    wid.m23994a(playlistButtonState2, z8, z9, z10, z11, zEquals, zEquals2, i9, ui3Var10, ui3Var11, ui3Var12, ui3Var13, tj3Var5, 0);
                    tj3 tj3Var8 = tj3Var5;
                    b16Var = b16Var2;
                    r11 = 0;
                    ux5.m23003z(b16Var, ge9.m12515a(tj3Var8).f38956e, tj3Var8, false);
                    tj3Var2 = tj3Var8;
                } else {
                    obj = obj4;
                }
                Object zg0Var2 = new zg0(vi3Var4, c35Var, d35Var, 16);
                tj3Var5.m22131l0(zg0Var2);
                obj6 = zg0Var2;
                ui3 ui3Var14 = (ui3) obj6;
                if (i10 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM22120g2 = z4 | tj3Var5.m22120g(c35Var);
                Object objM22097O10 = tj3Var5.m22097O();
                if (zM22120g2) {
                    final int i16 = 0;
                    Object obj111 = new ui3() { // from class: z35
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i17 = i16;
                            xfa xfaVar = xfa.f68157a;
                            c35 c35Var3 = c35Var;
                            vi3 vi3Var6 = vi3Var4;
                            switch (i17) {
                                case 0:
                                    vi3Var6.invoke(new o45(c35Var3.f9390a));
                                    break;
                                case 1:
                                    vi3Var6.invoke(new l45(c35Var3.f9390a));
                                    break;
                                case 2:
                                    vi3Var6.invoke(new m35(c35Var3.f9392c));
                                    break;
                                default:
                                    vi3Var6.invoke(new p35(c35Var3.f9405p));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var5.m22131l0(obj111);
                    obj7 = obj111;
                } else {
                    final int i17 = 0;
                    Object obj112 = new ui3() { // from class: z35
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i18 = i17;
                            xfa xfaVar = xfa.f68157a;
                            c35 c35Var3 = c35Var;
                            vi3 vi3Var6 = vi3Var4;
                            switch (i18) {
                                case 0:
                                    vi3Var6.invoke(new o45(c35Var3.f9390a));
                                    break;
                                case 1:
                                    vi3Var6.invoke(new l45(c35Var3.f9390a));
                                    break;
                                case 2:
                                    vi3Var6.invoke(new m35(c35Var3.f9392c));
                                    break;
                                default:
                                    vi3Var6.invoke(new p35(c35Var3.f9405p));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var5.m22131l0(obj112);
                    obj7 = obj112;
                }
                ui3 ui3Var15 = (ui3) obj7;
                if (i10 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zM22120g3 = z5 | tj3Var5.m22120g(c35Var);
                Object objM22097O11 = tj3Var5.m22097O();
                if (zM22120g3) {
                    z = true;
                    final int z17 = true ? 1 : 0;
                    Object obj113 = new ui3() { // from class: z35
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i18 = z17;
                            xfa xfaVar = xfa.f68157a;
                            c35 c35Var3 = c35Var;
                            vi3 vi3Var6 = vi3Var4;
                            switch (i18) {
                                case 0:
                                    vi3Var6.invoke(new o45(c35Var3.f9390a));
                                    break;
                                case 1:
                                    vi3Var6.invoke(new l45(c35Var3.f9390a));
                                    break;
                                case 2:
                                    vi3Var6.invoke(new m35(c35Var3.f9392c));
                                    break;
                                default:
                                    vi3Var6.invoke(new p35(c35Var3.f9405p));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var5.m22131l0(obj113);
                    obj8 = obj113;
                } else {
                    z = true;
                    final int z18 = true ? 1 : 0;
                    Object obj114 = new ui3() { // from class: z35
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i18 = z18;
                            xfa xfaVar = xfa.f68157a;
                            c35 c35Var3 = c35Var;
                            vi3 vi3Var6 = vi3Var4;
                            switch (i18) {
                                case 0:
                                    vi3Var6.invoke(new o45(c35Var3.f9390a));
                                    break;
                                case 1:
                                    vi3Var6.invoke(new l45(c35Var3.f9390a));
                                    break;
                                case 2:
                                    vi3Var6.invoke(new m35(c35Var3.f9392c));
                                    break;
                                default:
                                    vi3Var6.invoke(new p35(c35Var3.f9405p));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var5.m22131l0(obj114);
                    obj8 = obj114;
                }
                ui3 ui3Var16 = (ui3) obj8;
                i2 = 32;
                wid.m23994a(playlistButtonState2, z8, z9, z10, z11, zEquals, zEquals2, i9, ui3Var10, ui3Var14, ui3Var15, ui3Var16, tj3Var5, 0);
                tj3 tj3Var9 = tj3Var5;
                b16Var = b16Var2;
                r11 = 0;
                ux5.m23003z(b16Var, ge9.m12515a(tj3Var9).f38956e, tj3Var9, false);
                tj3Var2 = tj3Var9;
            }
            if (vk9.m23391n0(str6)) {
                str = str6;
                tj3Var2.m22111b0(1836703982);
                tj3Var2.m22139q(r11);
            } else {
                tj3Var2.m22111b0(1836546378);
                str = str6;
                ejd.m11200b(str, tj3Var2, r11);
                ux5.m23003z(b16Var, ge9.m12515a(tj3Var2).f38956e, tj3Var2, r11);
            }
            if (z6) {
                tj3Var2.m22111b0(1837036302);
                tj3Var2.m22139q(r11);
            } else {
                tj3Var2.m22111b0(1836788364);
                t35 t35Var = v35Var2.f64786d;
                ejd.m11201c(r11, tj3Var2, t35Var.f61793a, t35Var.f61794b);
                ux5.m23003z(b16Var, ge9.m12515a(tj3Var2).f38956e, tj3Var2, r11);
            }
            if (lessonInfoSource == LessonInfoSource.CoursePlaylist || lessonInfoSource == LessonInfoSource.Course || (str2 = c35Var.f9404o) == null || vk9.m23391n0(str2) || (e35Var = e35Var3) == null) {
                i4 = i3;
                tj3Var2.m22111b0(1837446990);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(1837151002);
                String str9 = e35Var.f36646b;
                i4 = i3;
                boolean z19 = (i4 == 256 ? z : false) | ((i8 & 14) == 4 ? z : false);
                Object objM22097O12 = tj3Var2.m22097O();
                if (z19 != 0 || objM22097O12 == obj) {
                    r13 = 0;
                    Object a45Var = new a45(0, vi3Var3, v35Var2);
                    tj3Var2.m22131l0(a45Var);
                    obj2 = a45Var;
                } else {
                    r13 = 0;
                    obj2 = objM22097O12;
                }
                ejd.m11199a(str9, (ui3) obj2, tj3Var2, r13);
                ux5.m23003z(b16Var, ge9.m12515a(tj3Var2).f38956e, tj3Var2, r13);
            }
            if (!z6 || vk9.m23391n0(str)) {
                tj3Var2.m22111b0(1837871566);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(1837562124);
                boolean zM22120g5 = (i4 == 256 ? z : false) | tj3Var2.m22120g(c35Var);
                Object objM22097O13 = tj3Var2.m22097O();
                Object obj20 = objM22097O13;
                if (zM22120g5 != 0 || objM22097O13 == obj) {
                    final int i18 = 2;
                    Object obj21 = new ui3() { // from class: z35
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i19 = i18;
                            xfa xfaVar = xfa.f68157a;
                            c35 c35Var3 = c35Var;
                            vi3 vi3Var6 = vi3Var3;
                            switch (i19) {
                                case 0:
                                    vi3Var6.invoke(new o45(c35Var3.f9390a));
                                    break;
                                case 1:
                                    vi3Var6.invoke(new l45(c35Var3.f9390a));
                                    break;
                                case 2:
                                    vi3Var6.invoke(new m35(c35Var3.f9392c));
                                    break;
                                default:
                                    vi3Var6.invoke(new p35(c35Var3.f9405p));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var2.m22131l0(obj21);
                    obj20 = obj21;
                }
                ejd.m11202d(str, (ui3) obj20, tj3Var2, 0);
                ux5.m23003z(b16Var, ge9.m12515a(tj3Var2).f38956e, tj3Var2, false);
            }
            if (str5 == null || vk9.m23391n0(str5) || str5 == null) {
                z2 = false;
                tj3Var2.m22111b0(1838281262);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(1837988157);
                boolean zM22120g6 = (i4 == 256 ? z : false) | tj3Var2.m22120g(c35Var);
                Object objM22097O14 = tj3Var2.m22097O();
                Object obj22 = objM22097O14;
                if (zM22120g6 != 0 || objM22097O14 == obj) {
                    final int i19 = 3;
                    Object obj23 = new ui3() { // from class: z35
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i110 = i19;
                            xfa xfaVar = xfa.f68157a;
                            c35 c35Var3 = c35Var;
                            vi3 vi3Var6 = vi3Var3;
                            switch (i110) {
                                case 0:
                                    vi3Var6.invoke(new o45(c35Var3.f9390a));
                                    break;
                                case 1:
                                    vi3Var6.invoke(new l45(c35Var3.f9390a));
                                    break;
                                case 2:
                                    vi3Var6.invoke(new m35(c35Var3.f9392c));
                                    break;
                                default:
                                    vi3Var6.invoke(new p35(c35Var3.f9405p));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var2.m22131l0(obj23);
                    obj22 = obj23;
                }
                z2 = false;
                ejd.m11203e(str5, (ui3) obj22, tj3Var2, 0);
                ux5.m23003z(b16Var, ge9.m12515a(tj3Var2).f38956e, tj3Var2, false);
            }
            ux5.m23003z(b16Var, ge9.m12515a(tj3Var2).f38958g, tj3Var2, z);
            if (lessonInfoSource != LessonInfoSource.Lesson) {
                tj3Var2.m22111b0(2040235560);
                c55 c55VarM12717b = gjd.m12717b(v35Var2);
                e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var2).f38960i);
                boolean zM22124i = ((i8 & 112) == i2 ? z : z2) | ((i8 & 14) == 4 ? z : z2) | (i4 == 256 ? z : z2) | tj3Var2.m22124i(c55VarM12717b);
                Object objM22097O15 = tj3Var2.m22097O();
                if (zM22124i != 0 || objM22097O15 == obj) {
                    Object g91Var2 = new g91(v35Var2, vi3Var3, c55VarM12717b, vi3Var4, 11);
                    tj3Var2.m22131l0(g91Var2);
                    objM22097O15 = g91Var2;
                }
                tj3 tj3Var10 = tj3Var2;
                ss5.m21710f(e16VarM21607T, null, null, false, (ui3) objM22097O15, ci8.m4703P(1724654735, new se0(v35Var2, 21), tj3Var2), tj3Var10, 196608, 14);
                tj3 tj3Var11 = tj3Var10;
                tj3Var11.m22139q(z2);
                tj3Var3 = tj3Var11;
            } else {
                tj3Var2.m22111b0(2041388760);
                tj3Var2.m22139q(z2);
                tj3Var3 = tj3Var2;
            }
            tj3Var3.m22139q(z);
            xid.m24555a(v35Var2.f64788f, c35Var.f9390a, gjd.m12717b(v35Var), vi3Var, vi3Var2, tj3Var3, (i8 << 6) & 64512);
            tj3Var = tj3Var3;
        } else {
            tj3Var4.m22102U();
            tj3Var = tj3Var4;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 0, v35Var, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m9048g(r35 r35Var, a35 a35Var, aj3 aj3Var, ui3 ui3Var) {
        if (r35Var instanceof l35) {
            a35Var.onDismiss();
            return;
        }
        if (r35Var instanceof o35) {
            a35Var.mo66i(((o35) r35Var).f53769a);
            return;
        }
        if (r35Var instanceof n35) {
            a35Var.mo67k(((n35) r35Var).f52269a);
            return;
        }
        if (r35Var instanceof k35) {
            aj3Var.invoke(Integer.valueOf(((k35) r35Var).f46619a), ui3Var.mo0a(), Boolean.FALSE);
            return;
        }
        if (r35Var instanceof q35) {
            aj3Var.invoke(Integer.valueOf(((q35) r35Var).f57189a), ui3Var.mo0a(), Boolean.TRUE);
            return;
        }
        if (r35Var instanceof m35) {
            a35Var.mo64g(((m35) r35Var).f50508a);
        } else if (r35Var instanceof p35) {
            a35Var.mo65h(((p35) r35Var).f55518a);
        } else {
            gm5.m12750e();
        }
    }
}
