package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.designsystem.R$dimen;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.feature.review.AbstractC2752c;
import com.lingq.feature.review.C2636a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jk0 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45648b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f45649c;

    public /* synthetic */ jk0(int i, Object obj, Object obj2) {
        this.f45647a = i;
        this.f45648b = obj;
        this.f45649c = obj2;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f45647a;
        xfa xfaVar = xfa.f68157a;
        Object obj5 = this.f45649c;
        Object obj6 = this.f45648b;
        switch (i) {
            case 0:
                ui3 ui3Var = (ui3) obj6;
                ui3 ui3Var2 = (ui3) obj5;
                yx4 yx4Var = (yx4) obj2;
                ye1 ye1Var = (ye1) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((C3116im) obj).getClass();
                yx4Var.getClass();
                if (yx4Var instanceof ux4) {
                    tj3 tj3Var = (tj3) ye1Var;
                    tj3Var.m22111b0(-1181469990);
                    b5d.m3324b((ux4) yx4Var, ui3Var, ui3Var2, tj3Var, (iIntValue >> 3) & 14);
                    tj3Var.m22139q(false);
                } else if (yx4Var instanceof vx4) {
                    tj3 tj3Var2 = (tj3) ye1Var;
                    tj3Var2.m22111b0(-1181137453);
                    b5d.m3325c((vx4) yx4Var, ui3Var, ui3Var2, tj3Var2, (iIntValue >> 3) & 14);
                    tj3Var2.m22139q(false);
                } else if (yx4Var.equals(wx4.f67471a)) {
                    tj3 tj3Var3 = (tj3) ye1Var;
                    tj3Var3.m22111b0(-1180793291);
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM4409b = c99.m4409b(c99.m4412e(b16Var, 1.0f), 0.0f, 120.0f, 1);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                    int iHashCode = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m = tj3Var3.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM4409b);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                    dn7.m10492a(c99.m4422o(b16Var, chc.m4666a(tj3Var3, R$dimen.progress_size)), ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51799a.f55852f, 0.0f, 0L, 0, 0.0f, tj3Var3, 0, 60);
                    tj3Var3.m22139q(true);
                    tj3Var3.m22139q(false);
                } else {
                    if (!yx4Var.equals(xx4.f68925a)) {
                        throw ux5.m23001x((tj3) ye1Var, -869397184, false);
                    }
                    tj3 tj3Var4 = (tj3) ye1Var;
                    tj3Var4.m22111b0(-1180110392);
                    tj3Var4.m22139q(false);
                }
                return xfaVar;
            case 1:
                jv0 jv0Var = (jv0) obj6;
                xz7 xz7Var = (xz7) obj;
                TokenType tokenType = (TokenType) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                e28 e28Var = (e28) obj4;
                xz7Var.getClass();
                tokenType.getClass();
                e28Var.getClass();
                int i2 = ((ChatMessage) obj5).f18920a;
                if (xz7Var.f69014k == TextTokenType.LINK) {
                    String str = xz7Var.f69020q;
                    jv0Var.mo8888o(str != null ? str : "");
                } else {
                    jv0Var.mo8893t(i2, xz7Var, tokenType, zBooleanValue, e28Var);
                }
                return xfaVar;
            case 2:
                jv0 jv0Var2 = (jv0) obj6;
                xz7 xz7Var2 = (xz7) obj;
                TokenType tokenType2 = (TokenType) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                e28 e28Var2 = (e28) obj4;
                xz7Var2.getClass();
                tokenType2.getClass();
                e28Var2.getClass();
                int i3 = ((jw0) obj5).f46240a.f18920a;
                if (xz7Var2.f69014k == TextTokenType.LINK) {
                    String str2 = xz7Var2.f69020q;
                    jv0Var2.mo8888o(str2 != null ? str2 : "");
                } else {
                    jv0Var2.mo8893t(i3, xz7Var2, tokenType2, zBooleanValue2, e28Var2);
                }
                return xfaVar;
            case 3:
                List list = (List) obj6;
                vi3 vi3Var = (vi3) obj5;
                int iIntValue2 = ((Integer) obj2).intValue();
                ye1 ye1Var2 = (ye1) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((ft4) obj).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= ((tj3) ye1Var2).m22116e(iIntValue2) ? 32 : 16;
                }
                tj3 tj3Var5 = (tj3) ye1Var2;
                if (tj3Var5.m22099R(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    bid.m3747c((en4) list.get(iIntValue2), iIntValue2 == list.size() - 1, vi3Var, tj3Var5, 0);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            default:
                ((Integer) obj4).intValue();
                ((C3116im) obj).getClass();
                ((C2636a) obj2).getClass();
                AbstractC2752c.m9578a(((hg8) obj6).f42329d, (vi3) obj5, (ye1) obj3, 0);
                return xfaVar;
        }
    }
}
