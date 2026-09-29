package androidx.compose.animation;

import androidx.compose.p002ui.layout.AbstractC0343j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import p000.C3541rm;
import p000.aa4;
import p000.ct5;
import p000.ht5;
import p000.it5;
import p000.jt5;
import p000.l87;
import p000.n84;
import p000.vi3;
import p000.xc9;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.animation.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0066e implements ht5 {

    /* JADX INFO: renamed from: a */
    public final C3541rm f1562a;

    /* JADX INFO: renamed from: b */
    public boolean f1563b;

    public C0066e(C3541rm c3541rm) {
        this.f1562a = c3541rm;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final int mo737a(aa4 aa4Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo1513p = ((ct5) list.get(0)).mo1513p(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo1513p2 = ((ct5) list.get(i2)).mo1513p(i);
                if (iMo1513p2 > iMo1513p) {
                    iMo1513p = iMo1513p2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo1513p;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            l87 l87VarMo1514r = ((ct5) list.get(i)).mo1514r(j);
            iMax = Math.max(iMax, l87VarMo1514r.f49301a);
            iMax2 = Math.max(iMax2, l87VarMo1514r.f49302b);
            arrayList.add(l87VarMo1514r);
        }
        boolean zMo211f0 = jt5Var.mo211f0();
        C3541rm c3541rm = this.f1562a;
        if (zMo211f0) {
            this.f1563b = true;
            ((xc9) c3541rm.f59521b).setValue(new n84((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.f1563b) {
            ((xc9) c3541rm.f59521b).setValue(new n84((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return jt5Var.mo9895M0(iMax, iMax2, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                ArrayList arrayList2 = arrayList;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    abstractC0343j.m1530f((l87) arrayList2.get(i2), 0, 0, 0.0f);
                }
                return xfa.f68157a;
            }
        });
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: c */
    public final int mo739c(aa4 aa4Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo1512l = ((ct5) list.get(0)).mo1512l(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo1512l2 = ((ct5) list.get(i2)).mo1512l(i);
                if (iMo1512l2 > iMo1512l) {
                    iMo1512l = iMo1512l2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo1512l;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: d */
    public final int mo740d(aa4 aa4Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo1511c = ((ct5) list.get(0)).mo1511c(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo1511c2 = ((ct5) list.get(i2)).mo1511c(i);
                if (iMo1511c2 > iMo1511c) {
                    iMo1511c = iMo1511c2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo1511c;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: e */
    public final int mo741e(aa4 aa4Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo1510U = ((ct5) list.get(0)).mo1510U(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo1510U2 = ((ct5) list.get(i2)).mo1510U(i);
                if (iMo1510U2 > iMo1510U) {
                    iMo1510U = iMo1510U2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo1510U;
    }
}
