package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.C0252k0;
import androidx.compose.material3.internal.C0242d;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.window.AbstractC0456d;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m4d {
    /* JADX INFO: renamed from: a */
    public static final void m16628a(ph7 ph7Var, C0282a c0282a, C0252k0 c0252k0, e16 e16Var, C0282a c0282a2, ye1 ye1Var, int i) {
        ph7 ph7Var2;
        int i2;
        t66 t66Var;
        boolean z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1221877520);
        if ((i & 6) == 0) {
            ph7Var2 = ph7Var;
            i2 = (tj3Var.m22120g(ph7Var2) ? 4 : 2) | i;
        } else {
            ph7Var2 = ph7Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? tj3Var.m22120g(c0252k0) : tj3Var.m22124i(c0252k0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= tj3Var.m22122h(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var.m22122h(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= tj3Var.m22122h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= tj3Var.m22124i(c0282a2) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (tj3Var.m22099R(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = d32.m10013K(tj3Var);
                tj3Var.m22131l0(objM22097O);
            }
            un1 un1Var = (un1) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) objM22097O2;
            tj3Var.m22111b0(-1104742522);
            tj3Var.m22139q(false);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16.f7762a);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (c0252k0.m1178b()) {
                tj3Var.m22111b0(-1891243071);
                m16630c(ph7Var2, c0252k0, un1Var, false, t66Var2, c0282a, tj3Var, (i3 & 14) | 196608 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                t66Var = t66Var2;
                tj3Var = tj3Var;
                z = false;
                tj3Var.m22139q(false);
            } else {
                t66Var = t66Var2;
                z = false;
                tj3Var.m22111b0(-1890863476);
                tj3Var.m22139q(false);
            }
            m16631d(c0252k0, t66Var, e16Var, c0282a2, tj3Var, ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752));
            tj3Var.m22139q(true);
            boolean z2 = ((i3 & 896) == 256 || ((i3 & 512) != 0 && tj3Var.m22124i(c0252k0))) ? true : z;
            Object objM22097O3 = tj3Var.m22097O();
            if (z2 || objM22097O3 == p84Var) {
                objM22097O3 = new C3741x(c0252k0, 4);
                tj3Var.m22131l0(objM22097O3);
            }
            d32.m10041h(c0252k0, (vi3) objM22097O3, tj3Var);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rb0(ph7Var, c0282a, c0252k0, e16Var, c0282a2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m16629b(vs3 vs3Var, w65 w65Var, ui3 ui3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3 vi3Var2;
        vs3Var.getClass();
        w65Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1974318984);
        int i2 = i | (tj3Var.m22124i(vs3Var) ? 4 : 2) | (tj3Var.m22124i(w65Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = w65Var instanceof LessonCard;
            b16 b16Var = b16.f7762a;
            if (z) {
                tj3Var.m22111b0(-1654483329);
                LessonCard lessonCard = (LessonCard) w65Var;
                l4d.m15802b(c99.m4430w(b16Var, null, 3), y7d.m24984c(lessonCard.f19188k, lessonCard.f19189l), vs3Var.f65847c, false, ui3Var, tj3Var, 24582, 8);
                tj3Var.m22139q(false);
                vi3Var2 = vi3Var;
            } else if (w65Var instanceof LessonWord) {
                tj3Var.m22111b0(-1654143352);
                e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
                zf1 zf1Var = ge9.f40637a;
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_check_thick, tj3Var, 0);
                vh9 vh9Var = ps5.f56764b;
                qd0 qd0Var = new qd0(5, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s);
                String strM23620a0 = vz1.m23620a0(tj3Var, R$string.ui_word_is_known);
                ((fe9) tj3Var.m22128k(zf1Var)).getClass();
                e16 e16VarM4422o = c99.m4422o(b16Var, 16.0f);
                int i3 = i2 & 7168;
                boolean z2 = i3 == 2048;
                Object objM22097O = tj3Var.m22097O();
                p84 p84Var = we1.f66679a;
                if (z2 || objM22097O == p84Var) {
                    objM22097O = new ex8(vi3Var, 15);
                    tj3Var.m22131l0(objM22097O);
                }
                bq1.m4042R(y27VarM18236U, strM23620a0, AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM4422o, 15), null, null, 0.0f, qd0Var, tj3Var, 8, 56);
                pb1.m19037g(0.0f, 6, 6, 0L, tj3Var, c99.m4426s(c99.m4414g(b16Var, 16.0f), 1.0f));
                y27 y27VarM18236U2 = AbstractC3423or.m18236U(R$drawable.ic_trash, tj3Var, 0);
                String strM23620a1 = vz1.m23620a0(tj3Var, R$string.ui_word_is_ignored);
                ((fe9) tj3Var.m22128k(zf1Var)).getClass();
                e16 e16VarM4422o2 = c99.m4422o(b16Var, 16.0f);
                boolean z3 = i3 == 2048;
                Object objM22097O2 = tj3Var.m22097O();
                if (z3 || objM22097O2 == p84Var) {
                    vi3Var2 = vi3Var;
                    objM22097O2 = new ex8(vi3Var2, 16);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    vi3Var2 = vi3Var;
                }
                bq1.m4042R(y27VarM18236U2, strM23620a1, AbstractC0080f.m815b(null, false, (ui3) objM22097O2, e16VarM4422o2, 15), null, null, 0.0f, new qd0(5, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s), tj3Var, 8, 56);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                vi3Var2 = vi3Var;
                tj3Var.m22111b0(-1652678168);
                tj3Var.m22139q(false);
            }
        } else {
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new h39(vs3Var, w65Var, ui3Var, vi3Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m16630c(ph7 ph7Var, final C0252k0 c0252k0, final un1 un1Var, boolean z, final t66 t66Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        ph7 ph7Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1413720282);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(ph7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tj3Var.m22120g(c0252k0) : tj3Var.m22124i(c0252k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(un1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22122h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22120g(t66Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 1048576 : 524288;
        }
        if (tj3Var.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            String strM23620a0 = vz1.m23620a0(tj3Var, androidx.compose.foundation.R$string.tooltip_description);
            boolean zM22124i = ((i2 & 112) == 32 || ((i2 & 64) != 0 && tj3Var.m22124i(c0252k0))) | ((i2 & 896) == 256) | tj3Var.m22124i(un1Var) | ((458752 & i2) == 131072);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ui3() { // from class: androidx.compose.material3.internal.a
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        C0252k0 c0252k1 = c0252k0;
                        if (c0252k1.m1178b()) {
                            wfb.m23926u(un1Var, null, null, new BasicTooltipKt$TooltipPopup$1$1$1(c0252k1, null), 3);
                            t66Var.setValue(Boolean.FALSE);
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O);
            }
            ph7Var2 = ph7Var;
            AbstractC0456d.m1897a(ph7Var2, (ui3) objM22097O, new qh7(22, z), ci8.m4703P(-1287705660, new pb0(strM23620a0, c0282a), tj3Var), tj3Var, (i2 & 14) | 3072, 0);
        } else {
            ph7Var2 = ph7Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qb0(ph7Var2, c0252k0, un1Var, z, t66Var, c0282a, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m16631d(final C0252k0 c0252k0, t66 t66Var, e16 e16Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1873232064);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tj3Var.m22120g(c0252k0) : tj3Var.m22124i(c0252k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(t66Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22122h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 131072 : 65536;
        }
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = d32.m10013K(tj3Var);
                tj3Var.m22131l0(objM22097O);
            }
            final un1 un1Var = (un1) objM22097O;
            String strM23620a0 = vz1.m23620a0(tj3Var, androidx.compose.foundation.R$string.tooltip_label);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            final t66 t66Var2 = (t66) objM22097O2;
            e16 e16VarM19795y = AbstractC3489q9.m19795y(lda.m16108H(mo9.m16957a(mo9.m16957a(e16Var, c0252k0, new C0242d(c0252k0, 0)), c0252k0, new C0242d(c0252k0, 1)).mo3161g(new h47(new C3485q5(strM23620a0, un1Var, c0252k0, 2))), new vi3() { // from class: androidx.compose.material3.internal.b
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    wfb.m23926u(un1Var, null, null, new BasicTooltipKt$keyboardBehavior$1$1((FocusStateImpl) obj, t66Var2, c0252k0, null), 3);
                    return xfa.f68157a;
                }
            }), new sb0((Object) c0252k0, (Object) t66Var, (Object) t66Var2, 0));
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM19795y);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            wq1.m24128x((i2 >> 15) & 14, c0282a, tj3Var, true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(c0252k0, t66Var, e16Var, c0282a, i);
        }
    }
}
