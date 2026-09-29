package p000;

import androidx.compose.p002ui.layout.AbstractC0334a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import java.util.List;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public final class hq9 implements ht5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zi3 f42792a;

    public hq9(zi3 zi3Var) {
        this.f42792a = zi3Var;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(final jt5 jt5Var, List list, long j) {
        l87 l87VarMo1514r;
        final l87 l87Var = null;
        if (this.f42792a != null) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    hg5.m13230b("Collection contains no element matching the predicate.");
                    C3386nv.m17631r();
                    return null;
                }
                ct5 ct5Var = (ct5) list.get(i);
                if (fa4.m11650l(l70.m15957t(ct5Var), "text")) {
                    l87VarMo1514r = ct5Var.mo1514r(bk1.m3794b(0, 0, 0, 0, 11, j));
                    break;
                }
                i++;
            }
        } else {
            l87VarMo1514r = null;
        }
        final int iMax = Math.max(l87VarMo1514r != null ? l87VarMo1514r.f49301a : 0, 0);
        final int iMax2 = Math.max(jt5Var.mo916w0(iq9.f44431a), jt5Var.mo913q0(iq9.f44435e) + 0 + (l87VarMo1514r != null ? l87VarMo1514r.f49302b : 0));
        final Integer numValueOf = l87VarMo1514r != null ? Integer.valueOf(l87VarMo1514r.mo1630V(AbstractC0334a.f4179a)) : null;
        final Integer numValueOf2 = l87VarMo1514r != null ? Integer.valueOf(l87VarMo1514r.mo1630V(AbstractC0334a.f4180b)) : null;
        final l87 l87Var2 = l87VarMo1514r;
        return jt5Var.mo9895M0(iMax, iMax2, AbstractC3194a.m15360M(), new vi3() { // from class: gq9
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                l87 l87Var3 = l87Var2;
                l87 l87Var4 = l87Var;
                int i2 = iMax2;
                if (l87Var3 != null && l87Var4 != null) {
                    Integer num = numValueOf;
                    num.getClass();
                    int iIntValue = num.intValue();
                    Integer num2 = numValueOf2;
                    num2.getClass();
                    int iIntValue2 = num2.intValue();
                    float f = iIntValue == iIntValue2 ? iq9.f44433c : iq9.f44434d;
                    jt5 jt5Var2 = jt5Var;
                    int iMo916w0 = jt5Var2.mo916w0(tj7.f62416b) + jt5Var2.mo916w0(f);
                    int iMo913q0 = (jt5Var2.mo913q0(iq9.f44435e) + l87Var4.f49302b) - iIntValue;
                    int i3 = l87Var3.f49301a;
                    int i4 = iMax;
                    int i5 = (i2 - iIntValue2) - iMo916w0;
                    AbstractC0343j.m1521j(abstractC0343j, l87Var3, (i4 - i3) / 2, i5);
                    AbstractC0343j.m1521j(abstractC0343j, l87Var4, (i4 - l87Var4.f49301a) / 2, i5 - iMo913q0);
                } else if (l87Var3 != null) {
                    float f2 = iq9.f44431a;
                    AbstractC0343j.m1521j(abstractC0343j, l87Var3, 0, (i2 - l87Var3.f49302b) / 2);
                } else if (l87Var4 != null) {
                    float f3 = iq9.f44431a;
                    AbstractC0343j.m1521j(abstractC0343j, l87Var4, 0, (i2 - l87Var4.f49302b) / 2);
                }
                return xfa.f68157a;
            }
        });
    }
}
