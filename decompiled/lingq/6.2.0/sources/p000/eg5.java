package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eg5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zi3 f37210b;

    public /* synthetic */ eg5(int i, zi3 zi3Var) {
        this.f37209a = i;
        this.f37210b = zi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        il8 il8Var;
        int i = this.f37209a;
        zi3 zi3Var = this.f37210b;
        switch (i) {
            case 0:
                el8 el8Var = (el8) obj;
                List list = (List) zi3Var.invoke(el8Var, obj2);
                List list2 = list;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (il8Var = el8Var.f37442b) != null && !il8Var.mo10400b(obj3)) {
                        v63.m23129g(i2, " can't be saved: ", obj3, "item at index ");
                        return null;
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            default:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e16 e16VarM15961x = l70.m15961x(b16.f7762a, "Container");
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, true);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM15961x);
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
                    zi3Var.invoke(tj3Var, 0);
                    tj3Var.m22139q(true);
                } else {
                    tj3Var.m22102U();
                }
                return xfa.f68157a;
        }
    }
}
