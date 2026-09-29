package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.C0233h;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.milestones.Badge;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j4d {
    /* JADX INFO: renamed from: a */
    public static final void m14286a(e16 e16Var, Badge badge, ye1 ye1Var, int i) {
        e16Var.getClass();
        badge.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1737510069);
        int i2 = 2;
        int i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | (tj3Var.m22124i(badge) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f, 0.0f, 2);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d;
            C0233h c0233hM22000n = te1.m22000n(62, 0.0f);
            mn0 mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p, 0L, tj3Var);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = new C3288l7(7);
                tj3Var.m22131l0(objM22097O);
            }
            bq1.m4043S((ui3) objM22097O, e16VarM21609V, false, si8Var, mn0VarM21999m, c0233hM22000n, null, ci8.m4703P(-1787476834, new C3180kd(i2, badge, context), tj3Var), tj3Var, 100663302, 196);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(e16Var, i, 3, badge);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14287b(int i, ye1 ye1Var, ui3 ui3Var, vs3 vs3Var, w65 w65Var) {
        int i2;
        ui3 ui3Var2;
        gc0 gc0Var = nj0.f52812g;
        w65Var.getClass();
        vs3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(379459898);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(w65Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vs3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            boolean z = w65Var instanceof LessonCard;
            b16 b16Var = b16.f7762a;
            if (z) {
                tj3Var.m22111b0(136073026);
                LessonCard lessonCard = (LessonCard) w65Var;
                l4d.m15802b(c99.m4430w(b16Var, null, 3), y7d.m24984c(lessonCard.f19188k, lessonCard.f19189l), vs3Var.f65847c, false, ui3Var, tj3Var, (57344 & (i2 << 6)) | 6, 8);
                ui3Var2 = ui3Var;
                tj3Var.m22139q(false);
            } else {
                int i3 = i2;
                ui3Var2 = ui3Var;
                if (w65Var instanceof LessonWord) {
                    tj3Var.m22111b0(136431076);
                    boolean z2 = (i3 & 896) == 256;
                    Object objM22097O = tj3Var.m22097O();
                    if (z2 || objM22097O == we1.f66679a) {
                        objM22097O = new zy7(9, ui3Var2);
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM4430w = c99.m4430w(AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), null, 3);
                    ge9.m12515a(tj3Var).getClass();
                    e16 e16VarM20387m = r46.m20387m(c99.m4422o(e16VarM4430w, 32.0f), 1.0f, cx2.m9917a(tj3Var).m4208a(), ui8.f63972a);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM20387m);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var3);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    String str = ((LessonWord) w65Var).f19322i;
                    boolean zM11650l = fa4.m11650l(str, WordStatus.New.getValue());
                    ci0 ci0Var = ci0.f10109a;
                    if (zM11650l) {
                        tj3Var.m22111b0(309644298);
                        p04 p04VarM13016b = h2d.m13016b();
                        qd0 qd0Var = new qd0(5, cx2.m9917a(tj3Var).m4209b());
                        String strM23620a0 = vz1.m23620a0(tj3Var, R$string.ui_add_word_as_lingq);
                        ge9.m12515a(tj3Var).getClass();
                        bq1.m4041Q(p04VarM13016b, strM23620a0, ci0Var.mo3727a(c99.m4422o(b16Var, 16.0f), gc0Var), qd0Var, tj3Var, 0, 56);
                        tj3Var.m22139q(false);
                    } else if (fa4.m11650l(str, WordStatus.Ignored.getValue())) {
                        tj3Var.m22111b0(310184721);
                        p04 p04VarM25022a = yad.m25022a();
                        String strM23620a1 = vz1.m23620a0(tj3Var, R$string.ui_word_is_ignored);
                        ge9.m12515a(tj3Var).getClass();
                        bq1.m4041Q(p04VarM25022a, strM23620a1, ci0Var.mo3727a(c99.m4422o(b16Var, 16.0f), gc0Var), new qd0(5, cx2.m9917a(tj3Var).m4209b()), tj3Var, 0, 56);
                        tj3Var.m22139q(false);
                    } else if (fa4.m11650l(str, WordStatus.Known.getValue())) {
                        tj3Var.m22111b0(310780076);
                        p04 p04VarM11590a = f7d.m11590a();
                        qd0 qd0Var2 = new qd0(5, cx2.m9917a(tj3Var).m4209b());
                        String strM23620a2 = vz1.m23620a0(tj3Var, R$string.ui_word_is_known);
                        ge9.m12515a(tj3Var).getClass();
                        bq1.m4041Q(p04VarM11590a, strM23620a2, ci0Var.mo3727a(c99.m4422o(b16Var, 16.0f), gc0Var), qd0Var2, tj3Var, 0, 56);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(311270465);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(138605478);
                    tj3Var.m22139q(false);
                }
            }
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mi9(w65Var, vs3Var, ui3Var2, i);
        }
    }
}
