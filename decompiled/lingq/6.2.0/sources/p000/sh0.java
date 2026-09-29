package p000;

import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final class sh0 implements ht5 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3571se f60856a;

    /* JADX INFO: renamed from: b */
    public final boolean f60857b;

    public sh0(InterfaceC3571se interfaceC3571se, boolean z) {
        this.f60856a = interfaceC3571se;
        this.f60857b = z;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        int iM3803k;
        int iM3802j;
        l87 l87VarMo1514r;
        if (list.isEmpty()) {
            return jt5Var.mo9895M0(bk1.m3803k(j), bk1.m3802j(j), AbstractC3194a.m15360M(), new C2951e4(29));
        }
        long j2 = this.f60857b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            ct5 ct5Var = (ct5) list.get(0);
            Object objMo1509A = ct5Var.mo1509A();
            mh0 mh0Var = objMo1509A instanceof mh0 ? (mh0) objMo1509A : null;
            if (mh0Var != null ? mh0Var.f51319K : false) {
                iM3803k = bk1.m3803k(j);
                iM3802j = bk1.m3802j(j);
                int iM3803k2 = bk1.m3803k(j);
                int iM3802j2 = bk1.m3802j(j);
                if (!((iM3802j2 >= 0) & (iM3803k2 >= 0))) {
                    k54.m14852a("width and height must be >= 0");
                }
                l87VarMo1514r = ct5Var.mo1514r(dk1.m10430h(iM3803k2, iM3803k2, iM3802j2, iM3802j2));
            } else {
                l87VarMo1514r = ct5Var.mo1514r(j2);
                iM3803k = Math.max(bk1.m3803k(j), l87VarMo1514r.f49301a);
                iM3802j = Math.max(bk1.m3802j(j), l87VarMo1514r.f49302b);
            }
            int i = iM3802j;
            int i2 = iM3803k;
            return jt5Var.mo9895M0(i2, i, AbstractC3194a.m15360M(), new rh0(l87VarMo1514r, ct5Var, jt5Var, i2, i, this));
        }
        l87[] l87VarArr = new l87[list.size()];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f47716a = bk1.m3803k(j);
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.f47716a = bk1.m3802j(j);
        List list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            ct5 ct5Var2 = (ct5) list.get(i3);
            Object objMo1509A2 = ct5Var2.mo1509A();
            mh0 mh0Var2 = objMo1509A2 instanceof mh0 ? (mh0) objMo1509A2 : null;
            if (mh0Var2 != null ? mh0Var2.f51319K : false) {
                z = true;
            } else {
                l87 l87VarMo1514r2 = ct5Var2.mo1514r(j2);
                l87VarArr[i3] = l87VarMo1514r2;
                ref$IntRef.f47716a = Math.max(ref$IntRef.f47716a, l87VarMo1514r2.f49301a);
                ref$IntRef2.f47716a = Math.max(ref$IntRef2.f47716a, l87VarMo1514r2.f49302b);
            }
        }
        if (z) {
            int i4 = ref$IntRef.f47716a;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = ref$IntRef2.f47716a;
            long jM10423a = dk1.m10423a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ct5 ct5Var3 = (ct5) list.get(i7);
                Object objMo1509A3 = ct5Var3.mo1509A();
                mh0 mh0Var3 = objMo1509A3 instanceof mh0 ? (mh0) objMo1509A3 : null;
                if (mh0Var3 != null ? mh0Var3.f51319K : false) {
                    l87VarArr[i7] = ct5Var3.mo1514r(jM10423a);
                }
            }
        }
        return jt5Var.mo9895M0(ref$IntRef.f47716a, ref$IntRef2.f47716a, AbstractC3194a.m15360M(), new of0(l87VarArr, list, jt5Var, ref$IntRef, ref$IntRef2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh0)) {
            return false;
        }
        sh0 sh0Var = (sh0) obj;
        return fa4.m11650l(this.f60856a, sh0Var.f60856a) && this.f60857b == sh0Var.f60857b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60857b) + (this.f60856a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.f60856a);
        sb.append(", propagateMinConstraints=");
        return ux5.m22993p(sb, this.f60857b, ')');
    }
}
