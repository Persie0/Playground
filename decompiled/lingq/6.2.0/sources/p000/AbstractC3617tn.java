package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: tn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3617tn {

    /* JADX INFO: renamed from: a */
    public static final Pair f62551a;

    static {
        EmptyList emptyList = EmptyList.f47638a;
        f62551a = new Pair(emptyList, emptyList);
    }

    /* JADX INFO: renamed from: a */
    public static final void m22238a(C3419on c3419on, List list, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1794596951);
        int i3 = (i & 6) == 0 ? (tj3Var.m22120g(c3419on) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(list) ? 32 : 16;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C3378nn c3378nn = (C3378nn) list.get(i4);
                aj3 aj3Var = (aj3) c3378nn.f52979a;
                int i5 = c3378nn.f52980b;
                int i6 = c3378nn.f52981c;
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = C3580sn.f61035b;
                    tj3Var.m22131l0(objM22097O);
                }
                ht5 ht5Var = (ht5) objM22097O;
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
                oha.m18001g(tj3Var, C0352b.f4303f, ht5Var);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                aj3Var.invoke(c3419on.subSequence(i5, i6).f54604b, tj3Var, 0);
                tj3Var.m22139q(true);
            }
            i2 = 0;
        } else {
            i2 = 0;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3504qn(c3419on, i, i2, list);
        }
    }
}
