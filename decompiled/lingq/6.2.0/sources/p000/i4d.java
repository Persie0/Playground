package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i4d {
    /* JADX INFO: renamed from: a */
    public static final void m13659a(int i, ye1 ye1Var, ui3 ui3Var, vs3 vs3Var, w65 w65Var) {
        int i2;
        vs3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(978986780);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(vs3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(w65Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            boolean z = w65Var instanceof LessonCard;
            b16 b16Var = b16.f7762a;
            if (z) {
                tj3Var.m22111b0(-2127564261);
                LessonCard lessonCard = (LessonCard) w65Var;
                l4d.m15802b(c99.m4430w(b16Var, null, 3), y7d.m24984c(lessonCard.f19188k, lessonCard.f19189l), vs3Var.f65847c, false, ui3Var, tj3Var, ((i2 << 6) & 57344) | 6, 8);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else if (w65Var instanceof e05) {
                tj3Var.m22111b0(-2127237025);
                boolean z2 = (i2 & 896) == 256;
                Object objM22097O = tj3Var.m22097O();
                if (z2 || objM22097O == we1.f66679a) {
                    objM22097O = new zy7(8, ui3Var);
                    tj3Var.m22131l0(objM22097O);
                }
                e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15);
                ((fe9) tj3Var.m22128k(ge9.f40637a)).getClass();
                e16 e16VarM4422o = c99.m4422o(e16VarM815b, 32.0f);
                vh9 vh9Var = cx2.f34676a;
                e16 e16VarM20387m = r46.m20387m(e16VarM4422o, 1.0f, ((bx2) tj3Var.m22128k(vh9Var)).m4208a(), ui8.f63972a);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM20387m);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                bq1.m4041Q(h2d.m13016b(), vz1.m23620a0(tj3Var, R$string.ui_add_word_as_lingq), ci0.f10109a.mo3727a(b16Var, nj0.f52812g), new qd0(5, ((bx2) tj3Var.m22128k(vh9Var)).m4208a()), tj3Var, 0, 56);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-2126443580);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mi9(vs3Var, w65Var, ui3Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13660b(boolean z, zi3 zi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1437916225);
        int i2 = (tj3Var.m22122h(z) ? 4 : 2) | i | (tj3Var.m22124i(zi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tgc.m22030a(z, zi3Var, tj3Var, i2 & 126);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new f70(z, zi3Var, i, 0);
        }
    }
}
