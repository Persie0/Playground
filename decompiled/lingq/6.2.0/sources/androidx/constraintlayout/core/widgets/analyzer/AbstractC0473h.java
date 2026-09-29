package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import p000.ak8;
import p000.bj1;
import p000.l4b;
import p000.nb2;
import p000.vj1;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0473h implements nb2 {

    /* JADX INFO: renamed from: a */
    public int f5350a;

    /* JADX INFO: renamed from: b */
    public vj1 f5351b;

    /* JADX INFO: renamed from: c */
    public ak8 f5352c;

    /* JADX INFO: renamed from: d */
    public ConstraintWidget$DimensionBehaviour f5353d;

    /* JADX INFO: renamed from: e */
    public final C0467b f5354e = new C0467b(this);

    /* JADX INFO: renamed from: f */
    public int f5355f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f5356g = false;

    /* JADX INFO: renamed from: h */
    public final C0466a f5357h = new C0466a(this);

    /* JADX INFO: renamed from: i */
    public final C0466a f5358i = new C0466a(this);

    /* JADX INFO: renamed from: j */
    public WidgetRun$RunType f5359j = WidgetRun$RunType.NONE;

    public AbstractC0473h(vj1 vj1Var) {
        this.f5351b = vj1Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m1923b(C0466a c0466a, C0466a c0466a2, int i) {
        c0466a.f5343l.add(c0466a2);
        c0466a.f5337f = i;
        c0466a2.f5342k.add(c0466a);
    }

    /* JADX INFO: renamed from: h */
    public static C0466a m1924h(bj1 bj1Var) {
        bj1 bj1Var2 = bj1Var.f8582f;
        if (bj1Var2 == null) {
            return null;
        }
        vj1 vj1Var = bj1Var2.f8580d;
        int i = l4b.f49056a[bj1Var2.f8581e.ordinal()];
        if (i == 1) {
            return vj1Var.f65464d.f5357h;
        }
        if (i == 2) {
            return vj1Var.f65464d.f5358i;
        }
        if (i == 3) {
            return vj1Var.f65466e.f5357h;
        }
        if (i == 4) {
            return vj1Var.f65466e.f5348k;
        }
        if (i != 5) {
            return null;
        }
        return vj1Var.f65466e.f5358i;
    }

    /* JADX INFO: renamed from: i */
    public static C0466a m1925i(bj1 bj1Var, int i) {
        bj1 bj1Var2 = bj1Var.f8582f;
        if (bj1Var2 == null) {
            return null;
        }
        vj1 vj1Var = bj1Var2.f8580d;
        AbstractC0473h abstractC0473h = i == 0 ? vj1Var.f65464d : vj1Var.f65466e;
        int i2 = l4b.f49056a[bj1Var2.f8581e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC0473h.f5358i;
        }
        return abstractC0473h.f5357h;
    }

    /* JADX INFO: renamed from: c */
    public final void m1926c(C0466a c0466a, C0466a c0466a2, int i, C0467b c0467b) {
        c0466a.f5343l.add(c0466a2);
        c0466a.f5343l.add(this.f5354e);
        c0466a.f5339h = i;
        c0466a.f5340i = c0467b;
        c0466a2.f5342k.add(c0466a);
        c0467b.f5342k.add(c0466a);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1915d();

    /* JADX INFO: renamed from: e */
    public abstract void mo1916e();

    /* JADX INFO: renamed from: f */
    public abstract void mo1917f();

    /* JADX INFO: renamed from: g */
    public final int m1927g(int i, int i2) {
        vj1 vj1Var = this.f5351b;
        if (i2 == 0) {
            int i3 = vj1Var.f65498v;
            int iMax = Math.max(vj1Var.f65497u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = vj1Var.f65501y;
            int iMax2 = Math.max(vj1Var.f65500x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public long mo1928j() {
        C0467b c0467b = this.f5354e;
        if (c0467b.f5341j) {
            return c0467b.f5338g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo1918k();

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX INFO: renamed from: l */
    public final void m1929l(bj1 bj1Var, bj1 bj1Var2, int i) {
        C0467b c0467b;
        float f;
        int i2;
        int i3;
        C0466a c0466aM1924h = m1924h(bj1Var);
        C0466a c0466aM1924h2 = m1924h(bj1Var2);
        if (c0466aM1924h.f5341j && c0466aM1924h2.f5341j) {
            int iM3761e = bj1Var.m3761e() + c0466aM1924h.f5338g;
            int iM3761e2 = c0466aM1924h2.f5338g - bj1Var2.m3761e();
            int i4 = iM3761e2 - iM3761e;
            C0467b c0467b2 = this.f5354e;
            if (!c0467b2.f5341j) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = this.f5353d;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2) {
                    int i5 = this.f5350a;
                    if (i5 == 0) {
                        c0467b2.mo1914d(m1927g(i4, i));
                    } else if (i5 == 1) {
                        c0467b2.mo1914d(Math.min(m1927g(c0467b2.f5344m, i), i4));
                    } else if (i5 == 2) {
                        vj1 vj1Var = this.f5351b;
                        vj1 vj1Var2 = vj1Var.f65452U;
                        if (vj1Var2 != null) {
                            C0467b c0467b3 = (i == 0 ? vj1Var2.f65464d : vj1Var2.f65466e).f5354e;
                            if (c0467b3.f5341j) {
                                c0467b2.mo1914d(m1927g((int) ((c0467b3.f5338g * (i == 0 ? vj1Var.f65499w : vj1Var.f65502z)) + 0.5f), i));
                            }
                        }
                    } else if (i5 == 3) {
                        vj1 vj1Var3 = this.f5351b;
                        AbstractC0473h abstractC0473h = vj1Var3.f65464d;
                        if (abstractC0473h.f5353d == constraintWidget$DimensionBehaviour2 && abstractC0473h.f5350a == 3) {
                            C0472g c0472g = vj1Var3.f65466e;
                            if (c0472g.f5353d != constraintWidget$DimensionBehaviour2 || c0472g.f5350a != 3) {
                                if (i == 0) {
                                    abstractC0473h = vj1Var3.f65466e;
                                }
                                c0467b = abstractC0473h.f5354e;
                                if (c0467b.f5341j) {
                                    f = vj1Var3.f65455X;
                                    i2 = c0467b.f5338g;
                                    if (i == 1) {
                                        i3 = (int) ((i2 / f) + 0.5f);
                                    } else {
                                        i3 = (int) ((f * i2) + 0.5f);
                                    }
                                    c0467b2.mo1914d(i3);
                                }
                            }
                        } else {
                            if (i == 0) {
                                abstractC0473h = vj1Var3.f65466e;
                            }
                            c0467b = abstractC0473h.f5354e;
                            if (c0467b.f5341j) {
                                f = vj1Var3.f65455X;
                                i2 = c0467b.f5338g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                c0467b2.mo1914d(i3);
                            }
                        }
                    }
                }
            }
            if (c0467b2.f5341j) {
                int i6 = c0467b2.f5338g;
                C0466a c0466a = this.f5358i;
                C0466a c0466a2 = this.f5357h;
                if (i6 == i4) {
                    c0466a2.mo1914d(iM3761e);
                    c0466a.mo1914d(iM3761e2);
                    return;
                }
                vj1 vj1Var4 = this.f5351b;
                float f2 = i == 0 ? vj1Var4.f65467e0 : vj1Var4.f65469f0;
                if (c0466aM1924h == c0466aM1924h2) {
                    iM3761e = c0466aM1924h.f5338g;
                    iM3761e2 = c0466aM1924h2.f5338g;
                    f2 = 0.5f;
                }
                c0466a2.mo1914d((int) ((((iM3761e2 - iM3761e) - i6) * f2) + iM3761e + 0.5f));
                c0466a.mo1914d(c0466a2.f5338g + c0467b2.f5338g);
            }
        }
    }
}
