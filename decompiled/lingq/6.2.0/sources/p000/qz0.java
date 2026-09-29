package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.lesson.TokenType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qz0 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58403a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f58404b;

    public /* synthetic */ qz0(vi3 vi3Var, int i) {
        this.f58403a = i;
        this.f58404b = vi3Var;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f58403a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f58404b;
        switch (i) {
            case 0:
                List<oz0> list = (List) obj2;
                ye1 ye1Var = (ye1) obj3;
                ((Integer) obj4).getClass();
                ((C3116im) obj).getClass();
                list.getClass();
                b16 b16Var = b16.f7762a;
                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                tj3 tj3Var = (tj3) ye1Var;
                bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38954c, true, new gm5(28)), nj0.f52791J, ye1Var, 0);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(ye1Var, e16VarM4412e);
                se1.f60731q.getClass();
                ui3 ui3Var = C0352b.f4299b;
                tj3 tj3Var2 = (tj3) ye1Var;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(ye1Var, C0352b.f4303f, bb1VarM230a);
                oha.m18001g(ye1Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(ye1Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(ye1Var, C0352b.f4305h);
                oha.m18001g(ye1Var, C0352b.f4301d, e16VarM1322c);
                if (list.isEmpty()) {
                    tj3Var2.m22111b0(-658309896);
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (i2 > 0) {
                            tj3Var2.m22111b0(2144003625);
                            thb.m22044c(ye1Var, c99.m4414g(b16Var, 10.0f));
                        } else {
                            tj3Var2.m22111b0(2039638494);
                        }
                        tj3Var2.m22139q(false);
                        b7d.m3413d(ye1Var, 0);
                    }
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(-658093919);
                    for (oz0 oz0Var : list) {
                        boolean zM22120g = tj3Var2.m22120g(vi3Var) | tj3Var2.m22124i(oz0Var);
                        Object objM22097O = tj3Var2.m22097O();
                        if (zM22120g || objM22097O == we1.f66679a) {
                            objM22097O = new C3577sk(9, vi3Var, oz0Var);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        b7d.m3412c(oz0Var, (ui3) objM22097O, ye1Var, 0);
                    }
                    tj3Var2.m22139q(false);
                }
                tj3Var2.m22139q(true);
                break;
            case 1:
                xz7 xz7Var = (xz7) obj;
                TokenType tokenType = (TokenType) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                e28 e28Var = (e28) obj4;
                xz7Var.getClass();
                tokenType.getClass();
                e28Var.getClass();
                vi3Var.invoke(new ft7(xz7Var, tokenType, zBooleanValue, e28Var));
                break;
            default:
                xz7 xz7Var2 = (xz7) obj;
                TokenType tokenType2 = (TokenType) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                e28 e28Var2 = (e28) obj4;
                xz7Var2.getClass();
                tokenType2.getClass();
                e28Var2.getClass();
                vi3Var.invoke(new ft7(xz7Var2, tokenType2, zBooleanValue2, e28Var2));
                break;
        }
        return xfaVar;
    }
}
