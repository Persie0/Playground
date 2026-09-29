package p000;

import androidx.compose.p002ui.layout.AbstractC0343j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.eo8;
import p000.jq9;
import p000.jt5;
import p000.l70;
import p000.l87;
import p000.u91;
import p000.wfb;
import p000.xfa;
import p000.yn8;

/* JADX INFO: loaded from: classes2.dex */
public final class qq9 implements p46 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f58086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f58087b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rq9 f58088c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f58089d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ eo8 f58090e;

    public qq9(float f, float f2, rq9 rq9Var, int i, eo8 eo8Var) {
        this.f58086a = f;
        this.f58087b = f2;
        this.f58088c = rq9Var;
        this.f58089d = i;
        this.f58090e = eo8Var;
    }

    @Override // p000.p46
    /* JADX INFO: renamed from: b */
    public final it5 mo1204b(final jt5 jt5Var, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        float f = this.f58086a;
        int iMo916w0 = jt5Var.mo916w0(f);
        int size = list2.size();
        Integer numValueOf = 0;
        List list4 = list2;
        int size2 = list4.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((ct5) list2.get(i)).mo1511c(Integer.MAX_VALUE)));
        }
        final int iIntValue = numValueOf.intValue();
        int i2 = iMo916w0 * 2;
        float f2 = this.f58087b;
        long jM3794b = bk1.m3794b(jt5Var.mo916w0(f2), 0, iIntValue, iIntValue, 2, j);
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.f47715a = f;
        final ArrayList arrayList2 = new ArrayList(list2.size());
        int i3 = 0;
        for (int size3 = list4.size(); i3 < size3; size3 = size3) {
            arrayList2.add(((ct5) list2.get(i3)).mo1514r(jM3794b));
            i3++;
        }
        int[] iArrCopyOf = new int[16];
        int size4 = list4.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size4) {
            List list5 = list2;
            int iMo1513p = ((ct5) list2.get(i4)).mo1513p(Integer.MAX_VALUE);
            int i6 = i5 + 1;
            int i7 = iMo916w0;
            if (iArrCopyOf.length < i6) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i6, (iArrCopyOf.length * 3) / 2));
            }
            iArrCopyOf[i5] = iMo1513p;
            i4++;
            i5 = i6;
            list2 = list5;
            iMo916w0 = i7;
        }
        final int i8 = iMo916w0;
        final ArrayList arrayList3 = new ArrayList(size);
        int iMo916w1 = i2;
        int i9 = 0;
        while (i9 < size) {
            xj2 xj2Var = new xj2(f2);
            xj2 xj2Var2 = new xj2(jt5Var.mo905T(((l87) arrayList2.get(i9)).f49301a));
            if (xj2Var.compareTo(xj2Var2) < 0) {
                xj2Var = xj2Var2;
            }
            float f3 = xj2Var.f68285a;
            iMo916w1 += jt5Var.mo916w0(f3);
            if (i9 < 0 || i9 >= i5) {
                v63.m23143u("Index must be between 0 and size");
                return null;
            }
            xj2 xj2Var3 = new xj2(jt5Var.mo905T(iArrCopyOf[i9]) - (iq9.f44432b * 2.0f));
            int[] iArr = iArrCopyOf;
            xj2 xj2Var4 = new xj2(24.0f);
            if (xj2Var3.compareTo(xj2Var4) < 0) {
                xj2Var3 = xj2Var4;
            }
            float f4 = ref$FloatRef.f47715a;
            jq9 jq9Var = new jq9(f4, f3, xj2Var3.f68285a);
            ref$FloatRef.f47715a = f4 + f3;
            arrayList3.add(jq9Var);
            i9++;
            iArrCopyOf = iArr;
        }
        ((xc9) this.f58088c.f59727a).setValue(arrayList3);
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int size5 = list3.size();
        for (int i10 = 0; i10 < size5; i10++) {
            arrayList4.add(((ct5) list3.get(i10)).mo1514r(bk1.m3793a(0, jt5Var.mo916w0(((jq9) arrayList3.get(this.f58089d)).f46015c), 0, iIntValue)));
        }
        final float f5 = this.f58086a;
        final eo8 eo8Var = this.f58090e;
        final int i11 = this.f58089d;
        return jt5Var.mo9895M0(iMo916w1, iIntValue, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.material3.i0
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ArrayList arrayList5;
                int i12;
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                ref$FloatRef2.f47715a = f5;
                ArrayList arrayList6 = arrayList2;
                int size6 = arrayList6.size();
                int i13 = 0;
                while (true) {
                    arrayList5 = arrayList3;
                    if (i13 >= size6) {
                        break;
                    }
                    AbstractC0343j.m1521j(abstractC0343j, (l87) arrayList6.get(i13), abstractC0343j.mo916w0(ref$FloatRef2.f47715a), 0);
                    ref$FloatRef2.f47715a += ((jq9) arrayList5.get(i13)).f46014b;
                    i13++;
                }
                ArrayList arrayList7 = arrayList4;
                int size7 = arrayList7.size();
                int i14 = 0;
                while (true) {
                    i12 = i11;
                    if (i14 >= size7) {
                        break;
                    }
                    l87 l87Var = (l87) arrayList7.get(i14);
                    AbstractC0343j.m1521j(abstractC0343j, l87Var, Math.max(0, (abstractC0343j.mo916w0(((jq9) arrayList5.get(i12)).f46014b) - l87Var.f49301a) / 2), iIntValue - l87Var.f49302b);
                    i14++;
                }
                eo8 eo8Var2 = eo8Var;
                yn8 yn8Var = eo8Var2.f37619a;
                Integer num = eo8Var2.f37622d;
                if (num == null || num.intValue() != i12) {
                    eo8Var2.f37622d = Integer.valueOf(i12);
                    jq9 jq9Var2 = (jq9) u91.m22592J0(i12, arrayList5);
                    if (jq9Var2 != null) {
                        jq9 jq9Var3 = (jq9) u91.m22597O0(arrayList5);
                        float f6 = jq9Var3.f46013a + jq9Var3.f46014b;
                        jt5 jt5Var2 = jt5Var;
                        int iMo916w2 = jt5Var2.mo916w0(f6) + i8;
                        int iM21222h = iMo916w2 - yn8Var.f70121e.m21222h();
                        int iMo916w3 = jt5Var2.mo916w0(jq9Var2.f46013a) - ((iM21222h / 2) - (jt5Var2.mo916w0(jq9Var2.f46014b) / 2));
                        int i15 = iMo916w2 - iM21222h;
                        if (i15 < 0) {
                            i15 = 0;
                        }
                        int iM15945h = l70.m15945h(iMo916w3, 0, i15);
                        if (yn8Var.f70117a.m21222h() != iM15945h) {
                            wfb.m23926u(eo8Var2.f37620b, null, null, new ScrollableTabData$onLaidOut$1$1(eo8Var2, iM15945h, null), 3);
                        }
                    }
                }
                return xfa.f68157a;
            }
        });
    }
}
