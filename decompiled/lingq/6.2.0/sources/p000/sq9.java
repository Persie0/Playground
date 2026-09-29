package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes2.dex */
public final class sq9 implements p46 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tq9 f61269a;

    public sq9(tq9 tq9Var) {
        this.f61269a = tq9Var;
    }

    @Override // p000.p46
    /* JADX INFO: renamed from: b */
    public final it5 mo1204b(jt5 jt5Var, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        int iM3801i = bk1.m3801i(j);
        int size = list2.size();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        if (size > 0) {
            ref$IntRef.f47716a = iM3801i / size;
        }
        Integer numValueOf = 0;
        List list5 = list2;
        int size2 = list5.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(((ct5) list2.get(i)).mo1511c(ref$IntRef.f47716a), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            xj2 xj2Var = new xj2(jt5Var.mo905T(Math.min(((ct5) list2.get(i2)).mo1513p(iIntValue), ref$IntRef.f47716a)) - (iq9.f44432b * 2.0f));
            xj2 xj2Var2 = new xj2(24.0f);
            if (xj2Var.compareTo(xj2Var2) < 0) {
                xj2Var = xj2Var2;
            }
            arrayList2.add(new jq9(jt5Var.mo905T(ref$IntRef.f47716a) * i2, jt5Var.mo905T(ref$IntRef.f47716a), xj2Var.f68285a));
        }
        ((xc9) this.f61269a.f62740a).setValue(arrayList2);
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list5.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ct5 ct5Var = (ct5) list2.get(i3);
            int i4 = ref$IntRef.f47716a;
            arrayList3.add(ct5Var.mo1514r(bk1.m3793a(i4, i4, iIntValue, iIntValue)));
        }
        ArrayList arrayList4 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int i5 = 0; i5 < size4; i5++) {
            arrayList4.add(((ct5) list3.get(i5)).mo1514r(bk1.m3794b(0, 0, 0, 0, 11, j)));
        }
        ArrayList arrayList5 = new ArrayList(list4.size());
        int size5 = list4.size();
        for (int i6 = 0; i6 < size5; i6++) {
            ct5 ct5Var2 = (ct5) list4.get(i6);
            int i7 = ref$IntRef.f47716a;
            arrayList5.add(ct5Var2.mo1514r(bk1.m3793a(i7, i7, 0, iIntValue)));
        }
        return jt5Var.mo9895M0(iM3801i, iIntValue, AbstractC3194a.m15360M(), new C3516qz(arrayList3, arrayList4, arrayList5, ref$IntRef, iIntValue));
    }
}
