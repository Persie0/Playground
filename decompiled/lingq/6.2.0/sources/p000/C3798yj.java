package p000;

import androidx.compose.p002ui.layout.AbstractC0334a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.window.AndroidPopup_androidKt$SimpleStack$1$1$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import p000.l87;
import p000.xfa;

/* JADX INFO: renamed from: yj */
/* JADX INFO: loaded from: classes2.dex */
public final class C3798yj implements ht5 {

    /* JADX INFO: renamed from: b */
    public static final C3798yj f69888b = new C3798yj(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69889a;

    public /* synthetic */ C3798yj(int i) {
        this.f69889a = i;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0114 A[PHI: r4 r6
      0x0114: PHI (r4v16 int) = (r4v15 int), (r4v20 int), (r4v20 int) binds: [B:68:0x012e, B:61:0x0109, B:63:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0114: PHI (r6v4 int) = (r6v3 int), (r6v9 int), (r6v9 int) binds: [B:68:0x012e, B:61:0x0109, B:63:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        Object obj;
        Object obj2;
        int iMo916w0;
        int iMax;
        int i;
        int iMo1630V;
        switch (this.f69889a) {
            case 0:
                int size = list.size();
                if (size == 0) {
                    return jt5Var.mo9895M0(0, 0, AbstractC3194a.m15360M(), AndroidPopup_androidKt$SimpleStack$1$1$1.f5272b);
                }
                if (size == 1) {
                    final l87 l87VarMo1514r = ((ct5) list.get(0)).mo1514r(j);
                    return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$2
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj3) {
                            AbstractC0343j.m1521j((AbstractC0343j) obj3, l87VarMo1514r, 0, 0);
                            return xfa.f68157a;
                        }
                    });
                }
                final ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax2 = 0;
                int iMax3 = 0;
                for (int i2 = 0; i2 < size2; i2++) {
                    l87 l87VarMo1514r2 = ((ct5) list.get(i2)).mo1514r(j);
                    iMax2 = Math.max(iMax2, l87VarMo1514r2.f49301a);
                    iMax3 = Math.max(iMax3, l87VarMo1514r2.f49302b);
                    arrayList.add(l87VarMo1514r2);
                }
                return jt5Var.mo9895M0(iMax2, iMax3, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj3) {
                        AbstractC0343j abstractC0343j = (AbstractC0343j) obj3;
                        ArrayList arrayList2 = arrayList;
                        int size3 = arrayList2.size() - 1;
                        if (size3 >= 0) {
                            int i3 = 0;
                            while (true) {
                                AbstractC0343j.m1521j(abstractC0343j, (l87) arrayList2.get(i3), 0, 0);
                                if (i3 == size3) {
                                    break;
                                }
                                i3++;
                            }
                        }
                        return xfa.f68157a;
                    }
                });
            default:
                int iMin = Math.min(bk1.m3801i(j), jt5Var.mo916w0(600.0f));
                List list2 = list;
                int size3 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size3) {
                        obj = list.get(i3);
                        if (!fa4.m11650l(l70.m15957t((ct5) obj), "action")) {
                            i3++;
                        }
                    } else {
                        obj = null;
                    }
                }
                ct5 ct5Var = (ct5) obj;
                final l87 l87VarMo1514r3 = ct5Var != null ? ct5Var.mo1514r(j) : null;
                int size4 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size4) {
                        obj2 = list.get(i4);
                        if (!fa4.m11650l(l70.m15957t((ct5) obj2), "dismissAction")) {
                            i4++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ct5 ct5Var2 = (ct5) obj2;
                l87 l87VarMo1514r4 = ct5Var2 != null ? ct5Var2.mo1514r(j) : null;
                int i5 = l87VarMo1514r3 != null ? l87VarMo1514r3.f49301a : 0;
                int i6 = l87VarMo1514r3 != null ? l87VarMo1514r3.f49302b : 0;
                int i7 = l87VarMo1514r4 != null ? l87VarMo1514r4.f49301a : 0;
                int i8 = l87VarMo1514r4 != null ? l87VarMo1514r4.f49302b : 0;
                int iMo916w1 = ((iMin - i5) - i7) - (i7 == 0 ? jt5Var.mo916w0(8.0f) : 0);
                int iM3803k = bk1.m3803k(j);
                if (iMo916w1 < iM3803k) {
                    iMo916w1 = iM3803k;
                }
                int size5 = list2.size();
                int i9 = 0;
                while (i9 < size5) {
                    ct5 ct5Var3 = (ct5) list.get(i9);
                    int i10 = size5;
                    if (fa4.m11650l(l70.m15957t(ct5Var3), "text")) {
                        int i11 = i8;
                        final l87 l87VarMo1514r5 = ct5Var3.mo1514r(bk1.m3794b(0, iMo916w1, 0, 0, 9, j));
                        iv3 iv3Var = AbstractC0334a.f4179a;
                        int iMo1630V2 = l87VarMo1514r5.mo1630V(iv3Var);
                        int iMo1630V3 = l87VarMo1514r5.mo1630V(AbstractC0334a.f4180b);
                        final int i12 = iMin - i7;
                        final int i13 = i12 - i5;
                        if (iMo1630V2 == iMo1630V3 || !(iMo1630V2 != Integer.MIN_VALUE && iMo1630V3 != Integer.MIN_VALUE)) {
                            iMax = Math.max(jt5Var.mo916w0(dc9.f35407i), Math.max(i6, i11));
                            iMo916w0 = (iMax - l87VarMo1514r5.f49302b) / 2;
                            if (l87VarMo1514r3 == null || (iMo1630V = l87VarMo1514r3.mo1630V(iv3Var)) == Integer.MIN_VALUE) {
                                i = 0;
                            } else {
                                i = (iMo1630V2 + iMo916w0) - iMo1630V;
                            }
                        } else {
                            iMo916w0 = jt5Var.mo916w0(30.0f) - iMo1630V2;
                            iMax = Math.max(jt5Var.mo916w0(dc9.f35408j), l87VarMo1514r5.f49302b + iMo916w0);
                            if (l87VarMo1514r3 != null) {
                                i = (iMax - l87VarMo1514r3.f49302b) / 2;
                            } else {
                                i = 0;
                            }
                        }
                        final int i14 = i;
                        final int i15 = iMo916w0;
                        final int i16 = l87VarMo1514r4 != null ? (iMax - l87VarMo1514r4.f49302b) / 2 : 0;
                        final l87 l87Var = l87VarMo1514r4;
                        return jt5Var.mo9895M0(iMin, iMax, AbstractC3194a.m15360M(), new vi3() { // from class: bc9
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                AbstractC0343j abstractC0343j = (AbstractC0343j) obj3;
                                AbstractC0343j.m1521j(abstractC0343j, l87VarMo1514r5, 0, i15);
                                l87 l87Var2 = l87VarMo1514r3;
                                if (l87Var2 != null) {
                                    AbstractC0343j.m1521j(abstractC0343j, l87Var2, i13, i14);
                                }
                                l87 l87Var3 = l87Var;
                                if (l87Var3 != null) {
                                    AbstractC0343j.m1521j(abstractC0343j, l87Var3, i12, i16);
                                }
                                return xfa.f68157a;
                            }
                        });
                    }
                    i9++;
                    i8 = i8;
                    size5 = i10;
                }
                hg5.m13230b("Collection contains no element matching the predicate.");
                C3386nv.m17631r();
                return null;
        }
    }
}
