package androidx.compose.animation;

import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import p000.C3152jm;
import p000.C3189km;
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

/* JADX INFO: renamed from: androidx.compose.animation.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0055b implements ht5 {

    /* JADX INFO: renamed from: a */
    public final C3189km f1487a;

    public C0055b(C3189km c3189km) {
        this.f1487a = c3189km;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final int mo737a(aa4 aa4Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ct5) list.get(0)).mo1513p(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ct5) list.get(i2)).mo1513p(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        l87 l87Var;
        int i;
        l87 l87Var2;
        final int i2;
        final int i3;
        int size = list.size();
        final l87[] l87VarArr = new l87[size];
        List list2 = list;
        int size2 = list2.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            l87Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            ct5 ct5Var = (ct5) list.get(i4);
            Object objMo1509A = ct5Var.mo1509A();
            C3152jm c3152jm = objMo1509A instanceof C3152jm ? (C3152jm) objMo1509A : null;
            if (c3152jm != null && ((Boolean) ((xc9) c3152jm.f45814a).getValue()).booleanValue()) {
                l87 l87VarMo1514r = ct5Var.mo1514r(j);
                long j3 = (((long) l87VarMo1514r.f49302b) & 4294967295L) | (((long) l87VarMo1514r.f49301a) << 32);
                l87VarArr[i4] = l87VarMo1514r;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            ct5 ct5Var2 = (ct5) list.get(i5);
            if (l87VarArr[i5] == null) {
                l87VarArr[i5] = ct5Var2.mo1514r(j);
            }
        }
        if (jt5Var.mo211f0()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size != 0) {
                l87Var2 = l87VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = l87Var2 != null ? l87Var2.f49301a : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            l87 l87Var3 = l87VarArr[i8];
                            int i9 = l87Var3 != null ? l87Var3.f49301a : 0;
                            if (i7 < i9) {
                                l87Var2 = l87Var3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            } else {
                l87Var2 = null;
            }
            i2 = l87Var2 != null ? l87Var2.f49301a : 0;
        }
        if (jt5Var.mo211f0()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                l87Var = l87VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = l87Var != null ? l87Var.f49302b : 0;
                    if (1 <= i10) {
                        while (true) {
                            l87 l87Var4 = l87VarArr[i];
                            int i12 = l87Var4 != null ? l87Var4.f49302b : 0;
                            if (i11 < i12) {
                                l87Var = l87Var4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = l87Var != null ? l87Var.f49302b : 0;
        }
        if (!jt5Var.mo211f0()) {
            ((xc9) this.f1487a.f47506c).setValue(new n84((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return jt5Var.mo9895M0(i2, i3, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                for (l87 l87Var5 : l87VarArr) {
                    if (l87Var5 != null) {
                        long jMo10276a = this.f1487a.f47505b.mo10276a((((long) l87Var5.f49301a) << 32) | (((long) l87Var5.f49302b) & 4294967295L), (((long) i2) << 32) | (((long) i3) & 4294967295L), LayoutDirection.Ltr);
                        abstractC0343j.m1530f(l87Var5, (int) (jMo10276a >> 32), (int) (jMo10276a & 4294967295L), 0.0f);
                    }
                }
                return xfa.f68157a;
            }
        });
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: c */
    public final int mo739c(aa4 aa4Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ct5) list.get(0)).mo1512l(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ct5) list.get(i2)).mo1512l(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: d */
    public final int mo740d(aa4 aa4Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ct5) list.get(0)).mo1511c(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ct5) list.get(i2)).mo1511c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: e */
    public final int mo741e(aa4 aa4Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ct5) list.get(0)).mo1510U(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ct5) list.get(i2)).mo1510U(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
