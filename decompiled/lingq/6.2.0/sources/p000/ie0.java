package p000;

import androidx.compose.material3.AbstractC0235i;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.language.Language;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ie0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44009a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f44010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f44011c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f44012d;

    public /* synthetic */ ie0(List list, Set set, vi3 vi3Var, int i) {
        this.f44009a = i;
        this.f44010b = list;
        this.f44011c = set;
        this.f44012d = vi3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f44009a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        List<Language> list = this.f44010b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g93) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (Language language : list) {
                        boolean zContains = this.f44011c.contains(language.f19024a);
                        vi3 vi3Var = this.f44012d;
                        boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22124i(language);
                        Object objM22097O = tj3Var.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new C3577sk(2, vi3Var, language);
                            tj3Var.m22131l0(objM22097O);
                        }
                        AbstractC0235i.m1162e(zContains, (ui3) objM22097O, ci8.m4703P(1447694732, new C3368nd(language, 1), tj3Var), null, false, null, null, null, null, null, null, tj3Var, 384);
                    }
                } else {
                    tj3Var.m22102U();
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(ge9.f40637a)).f38963l, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16.f7762a);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    tj3Var2.m22111b0(-1285512553);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        m99 m99Var = (m99) it.next();
                        String str = m99Var.f50816a;
                        Set set = this.f44011c;
                        boolean zContains2 = set.contains(str);
                        String strM23620a0 = vz1.m23620a0(tj3Var2, m99Var.f50817b);
                        boolean zM22122h = tj3Var2.m22122h(zContains2) | tj3Var2.m22124i(set) | tj3Var2.m22120g(m99Var);
                        vi3 vi3Var2 = this.f44012d;
                        boolean zM22120g2 = zM22122h | tj3Var2.m22120g(vi3Var2);
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O2 == p84Var) {
                            C3560s4 c3560s4 = new C3560s4(3, set, m99Var, vi3Var2, zContains2);
                            tj3Var2.m22131l0(c3560s4);
                            objM22097O2 = c3560s4;
                        }
                        txb.m22337c(0, tj3Var2, (ui3) objM22097O2, null, strM23620a0, m99Var.f50818c, zContains2);
                    }
                    tj3Var2.m22139q(false);
                    tj3Var2.m22139q(true);
                } else {
                    tj3Var2.m22102U();
                }
                break;
        }
        return xfaVar;
    }
}
