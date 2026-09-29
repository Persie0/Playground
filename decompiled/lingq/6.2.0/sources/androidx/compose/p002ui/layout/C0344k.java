package androidx.compose.p002ui.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import p000.bk1;
import p000.ct5;
import p000.dk1;
import p000.it5;
import p000.jt5;
import p000.l87;
import p000.mq4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.layout.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0344k extends mq4 {

    /* JADX INFO: renamed from: b */
    public static final C0344k f4217b = new C0344k("Undefined intrinsics block and it is required");

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return jt5Var.mo9895M0(bk1.m3803k(j), bk1.m3802j(j), AbstractC3194a.m15360M(), RootMeasurePolicy$measure$1.f4162b);
        }
        if (size == 1) {
            final l87 l87VarMo1514r = ((ct5) list.get(0)).mo1514r(j);
            return jt5Var.mo9895M0(dk1.m10429g(l87VarMo1514r.f49301a, j), dk1.m10428f(l87VarMo1514r.f49302b, j), AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    AbstractC0343j.m1522l((AbstractC0343j) obj, l87VarMo1514r, 0, 0, null, 12);
                    return xfa.f68157a;
                }
            });
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            l87 l87VarMo1514r2 = ((ct5) list.get(i)).mo1514r(j);
            iMax = Math.max(l87VarMo1514r2.f49301a, iMax);
            iMax2 = Math.max(l87VarMo1514r2.f49302b, iMax2);
            arrayList.add(l87VarMo1514r2);
        }
        return jt5Var.mo9895M0(dk1.m10429g(iMax, j), dk1.m10428f(iMax2, j), AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                ArrayList arrayList2 = arrayList;
                int size3 = arrayList2.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    AbstractC0343j.m1522l(abstractC0343j, (l87) arrayList2.get(i2), 0, 0, null, 12);
                }
                return xfa.f68157a;
            }
        });
    }
}
