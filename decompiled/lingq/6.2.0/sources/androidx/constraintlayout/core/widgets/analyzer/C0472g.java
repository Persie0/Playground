package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p000.bj1;
import p000.na0;
import p000.nb2;
import p000.os3;
import p000.vj1;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0472g extends AbstractC0473h {

    /* JADX INFO: renamed from: k */
    public final C0466a f5348k;

    /* JADX INFO: renamed from: l */
    public na0 f5349l;

    public C0472g(vj1 vj1Var) {
        super(vj1Var);
        C0466a c0466a = new C0466a(this);
        this.f5348k = c0466a;
        this.f5349l = null;
        this.f5357h.f5336e = DependencyNode$Type.TOP;
        this.f5358i.f5336e = DependencyNode$Type.BOTTOM;
        c0466a.f5336e = DependencyNode$Type.BASELINE;
        this.f5355f = 1;
    }

    @Override // p000.nb2
    /* JADX INFO: renamed from: a */
    public final void mo1911a(nb2 nb2Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC0471f.f5347a[this.f5359j.ordinal()] == 3) {
            vj1 vj1Var = this.f5351b;
            m1929l(vj1Var.f65441J, vj1Var.f65443L, 1);
            return;
        }
        C0467b c0467b = this.f5354e;
        if (c0467b.f5334c && !c0467b.f5341j && this.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            vj1 vj1Var2 = this.f5351b;
            int i2 = vj1Var2.f65494s;
            if (i2 == 2) {
                vj1 vj1Var3 = vj1Var2.f65452U;
                if (vj1Var3 != null) {
                    C0467b c0467b2 = vj1Var3.f65466e.f5354e;
                    if (c0467b2.f5341j) {
                        c0467b.mo1914d((int) ((c0467b2.f5338g * vj1Var2.f65502z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0467b c0467b3 = vj1Var2.f65464d.f5354e;
                if (c0467b3.f5341j) {
                    int i3 = vj1Var2.f65456Y;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = c0467b3.f5338g * vj1Var2.f65455X;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = c0467b3.f5338g;
                            f2 = vj1Var2.f65455X;
                        }
                        c0467b.mo1914d(i);
                    } else {
                        f = c0467b3.f5338g;
                        f2 = vj1Var2.f65455X;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c0467b.mo1914d(i);
                }
            }
        }
        C0466a c0466a = this.f5357h;
        boolean z = c0466a.f5334c;
        ArrayList arrayList = c0466a.f5343l;
        if (z) {
            C0466a c0466a2 = this.f5358i;
            boolean z2 = c0466a2.f5334c;
            ArrayList arrayList2 = c0466a2.f5343l;
            if (z2) {
                if (c0466a.f5341j && c0466a2.f5341j && c0467b.f5341j) {
                    return;
                }
                if (!c0467b.f5341j && this.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                    vj1 vj1Var4 = this.f5351b;
                    if (vj1Var4.f65492r == 0 && !vj1Var4.m23334z()) {
                        C0466a c0466a3 = (C0466a) arrayList.get(0);
                        C0466a c0466a4 = (C0466a) arrayList2.get(0);
                        int i4 = c0466a3.f5338g + c0466a.f5337f;
                        int i5 = c0466a4.f5338g + c0466a2.f5337f;
                        c0466a.mo1914d(i4);
                        c0466a2.mo1914d(i5);
                        c0467b.mo1914d(i5 - i4);
                        return;
                    }
                }
                if (!c0467b.f5341j && this.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && this.f5350a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C0466a c0466a5 = (C0466a) arrayList.get(0);
                    int i6 = (((C0466a) arrayList2.get(0)).f5338g + c0466a2.f5337f) - (c0466a5.f5338g + c0466a.f5337f);
                    int i7 = c0467b.f5344m;
                    if (i6 < i7) {
                        c0467b.mo1914d(i6);
                    } else {
                        c0467b.mo1914d(i7);
                    }
                }
                if (c0467b.f5341j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C0466a c0466a6 = (C0466a) arrayList.get(0);
                    C0466a c0466a7 = (C0466a) arrayList2.get(0);
                    int i8 = c0466a6.f5338g;
                    int i9 = c0466a.f5337f + i8;
                    int i10 = c0466a7.f5338g;
                    int i11 = c0466a2.f5337f + i10;
                    float f4 = this.f5351b.f65469f0;
                    if (c0466a6 == c0466a7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0466a.mo1914d((int) ((((i10 - i8) - c0467b.f5338g) * f4) + i8 + 0.5f));
                    c0466a2.mo1914d(c0466a.f5338g + c0467b.f5338g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: d */
    public final void mo1915d() {
        vj1 vj1Var;
        vj1 vj1Var2;
        vj1 vj1Var3;
        vj1 vj1Var4;
        vj1 vj1Var5 = this.f5351b;
        boolean z = vj1Var5.f65458a;
        C0467b c0467b = this.f5354e;
        if (z) {
            c0467b.mo1914d(vj1Var5.m23322l());
        }
        boolean z2 = c0467b.f5341j;
        ArrayList arrayList = c0467b.f5342k;
        ArrayList arrayList2 = c0467b.f5343l;
        C0466a c0466a = this.f5358i;
        C0466a c0466a2 = this.f5357h;
        if (!z2) {
            vj1 vj1Var6 = this.f5351b;
            this.f5353d = vj1Var6.f65451T[1];
            if (vj1Var6.f65436E) {
                this.f5349l = new na0(this);
            }
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = this.f5353d;
            if (constraintWidget$DimensionBehaviour != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                if (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && (vj1Var4 = this.f5351b.f65452U) != null && vj1Var4.f65451T[1] == ConstraintWidget$DimensionBehaviour.FIXED) {
                    int iM23322l = (vj1Var4.m23322l() - this.f5351b.f65441J.m3761e()) - this.f5351b.f65443L.m3761e();
                    AbstractC0473h.m1923b(c0466a2, vj1Var4.f65466e.f5357h, this.f5351b.f65441J.m3761e());
                    AbstractC0473h.m1923b(c0466a, vj1Var4.f65466e.f5358i, -this.f5351b.f65443L.m3761e());
                    c0467b.mo1914d(iM23322l);
                    return;
                }
                if (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.FIXED) {
                    c0467b.mo1914d(this.f5351b.m23322l());
                }
            }
        } else if (this.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && (vj1Var2 = (vj1Var = this.f5351b).f65452U) != null && vj1Var2.f65451T[1] == ConstraintWidget$DimensionBehaviour.FIXED) {
            AbstractC0473h.m1923b(c0466a2, vj1Var2.f65466e.f5357h, vj1Var.f65441J.m3761e());
            AbstractC0473h.m1923b(c0466a, vj1Var2.f65466e.f5358i, -this.f5351b.f65443L.m3761e());
            return;
        }
        boolean z3 = c0467b.f5341j;
        C0466a c0466a3 = this.f5348k;
        if (z3) {
            vj1 vj1Var7 = this.f5351b;
            if (vj1Var7.f65458a) {
                bj1[] bj1VarArr = vj1Var7.f65448Q;
                bj1 bj1Var = bj1VarArr[2];
                bj1 bj1Var2 = bj1Var.f8582f;
                if (bj1Var2 != null && bj1VarArr[3].f8582f != null) {
                    boolean zM23334z = vj1Var7.m23334z();
                    vj1 vj1Var8 = this.f5351b;
                    if (zM23334z) {
                        c0466a2.f5337f = vj1Var8.f65448Q[2].m3761e();
                        c0466a.f5337f = -this.f5351b.f65448Q[3].m3761e();
                    } else {
                        C0466a c0466aM1924h = AbstractC0473h.m1924h(vj1Var8.f65448Q[2]);
                        if (c0466aM1924h != null) {
                            AbstractC0473h.m1923b(c0466a2, c0466aM1924h, this.f5351b.f65448Q[2].m3761e());
                        }
                        C0466a c0466aM1924h2 = AbstractC0473h.m1924h(this.f5351b.f65448Q[3]);
                        if (c0466aM1924h2 != null) {
                            AbstractC0473h.m1923b(c0466a, c0466aM1924h2, -this.f5351b.f65448Q[3].m3761e());
                        }
                        c0466a2.f5333b = true;
                        c0466a.f5333b = true;
                    }
                    vj1 vj1Var9 = this.f5351b;
                    if (vj1Var9.f65436E) {
                        AbstractC0473h.m1923b(c0466a3, c0466a2, vj1Var9.f65461b0);
                        return;
                    }
                    return;
                }
                if (bj1Var2 != null) {
                    C0466a c0466aM1924h3 = AbstractC0473h.m1924h(bj1Var);
                    if (c0466aM1924h3 != null) {
                        AbstractC0473h.m1923b(c0466a2, c0466aM1924h3, this.f5351b.f65448Q[2].m3761e());
                        AbstractC0473h.m1923b(c0466a, c0466a2, c0467b.f5338g);
                        vj1 vj1Var10 = this.f5351b;
                        if (vj1Var10.f65436E) {
                            AbstractC0473h.m1923b(c0466a3, c0466a2, vj1Var10.f65461b0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                bj1 bj1Var3 = bj1VarArr[3];
                if (bj1Var3.f8582f != null) {
                    C0466a c0466aM1924h4 = AbstractC0473h.m1924h(bj1Var3);
                    if (c0466aM1924h4 != null) {
                        AbstractC0473h.m1923b(c0466a, c0466aM1924h4, -this.f5351b.f65448Q[3].m3761e());
                        AbstractC0473h.m1923b(c0466a2, c0466a, -c0467b.f5338g);
                    }
                    vj1 vj1Var11 = this.f5351b;
                    if (vj1Var11.f65436E) {
                        AbstractC0473h.m1923b(c0466a3, c0466a2, vj1Var11.f65461b0);
                        return;
                    }
                    return;
                }
                bj1 bj1Var4 = bj1VarArr[4];
                if (bj1Var4.f8582f != null) {
                    C0466a c0466aM1924h5 = AbstractC0473h.m1924h(bj1Var4);
                    if (c0466aM1924h5 != null) {
                        AbstractC0473h.m1923b(c0466a3, c0466aM1924h5, 0);
                        AbstractC0473h.m1923b(c0466a2, c0466a3, -this.f5351b.f65461b0);
                        AbstractC0473h.m1923b(c0466a, c0466a2, c0467b.f5338g);
                        return;
                    }
                    return;
                }
                if ((vj1Var7 instanceof os3) || vj1Var7.f65452U == null || vj1Var7.mo12819j(ConstraintAnchor$Type.CENTER).f8582f != null) {
                    return;
                }
                vj1 vj1Var12 = this.f5351b;
                AbstractC0473h.m1923b(c0466a2, vj1Var12.f65452U.f65466e.f5357h, vj1Var12.m23328t());
                AbstractC0473h.m1923b(c0466a, c0466a2, c0467b.f5338g);
                vj1 vj1Var13 = this.f5351b;
                if (vj1Var13.f65436E) {
                    AbstractC0473h.m1923b(c0466a3, c0466a2, vj1Var13.f65461b0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f5353d != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            c0467b.m1912b(this);
        } else {
            vj1 vj1Var14 = this.f5351b;
            int i = vj1Var14.f65494s;
            if (i == 2) {
                vj1 vj1Var15 = vj1Var14.f65452U;
                if (vj1Var15 != null) {
                    C0467b c0467b2 = vj1Var15.f65466e.f5354e;
                    arrayList2.add(c0467b2);
                    c0467b2.f5342k.add(c0467b);
                    c0467b.f5333b = true;
                    arrayList.add(c0466a2);
                    arrayList.add(c0466a);
                }
            } else if (i == 3 && !vj1Var14.m23334z()) {
                vj1 vj1Var16 = this.f5351b;
                if (vj1Var16.f65492r != 3) {
                    C0467b c0467b3 = vj1Var16.f65464d.f5354e;
                    arrayList2.add(c0467b3);
                    c0467b3.f5342k.add(c0467b);
                    c0467b.f5333b = true;
                    arrayList.add(c0466a2);
                    arrayList.add(c0466a);
                }
            }
        }
        vj1 vj1Var17 = this.f5351b;
        bj1[] bj1VarArr2 = vj1Var17.f65448Q;
        bj1 bj1Var5 = bj1VarArr2[2];
        bj1 bj1Var6 = bj1Var5.f8582f;
        if (bj1Var6 != null && bj1VarArr2[3].f8582f != null) {
            boolean zM23334z2 = vj1Var17.m23334z();
            vj1 vj1Var18 = this.f5351b;
            if (zM23334z2) {
                c0466a2.f5337f = vj1Var18.f65448Q[2].m3761e();
                c0466a.f5337f = -this.f5351b.f65448Q[3].m3761e();
            } else {
                C0466a c0466aM1924h6 = AbstractC0473h.m1924h(vj1Var18.f65448Q[2]);
                C0466a c0466aM1924h7 = AbstractC0473h.m1924h(this.f5351b.f65448Q[3]);
                if (c0466aM1924h6 != null) {
                    c0466aM1924h6.m1912b(this);
                }
                if (c0466aM1924h7 != null) {
                    c0466aM1924h7.m1912b(this);
                }
                this.f5359j = WidgetRun$RunType.CENTER;
            }
            if (this.f5351b.f65436E) {
                m1926c(c0466a3, c0466a2, 1, this.f5349l);
            }
        } else if (bj1Var6 != null) {
            C0466a c0466aM1924h8 = AbstractC0473h.m1924h(bj1Var5);
            if (c0466aM1924h8 != null) {
                AbstractC0473h.m1923b(c0466a2, c0466aM1924h8, this.f5351b.f65448Q[2].m3761e());
                m1926c(c0466a, c0466a2, 1, c0467b);
                if (this.f5351b.f65436E) {
                    m1926c(c0466a3, c0466a2, 1, this.f5349l);
                }
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = this.f5353d;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3) {
                    vj1 vj1Var19 = this.f5351b;
                    if (vj1Var19.f65455X > 0.0f) {
                        C0470e c0470e = vj1Var19.f65464d;
                        if (c0470e.f5353d == constraintWidget$DimensionBehaviour3) {
                            c0470e.f5354e.f5342k.add(c0467b);
                            arrayList2.add(this.f5351b.f65464d.f5354e);
                            c0467b.f5332a = this;
                        }
                    }
                }
            }
        } else {
            bj1 bj1Var7 = bj1VarArr2[3];
            if (bj1Var7.f8582f != null) {
                C0466a c0466aM1924h9 = AbstractC0473h.m1924h(bj1Var7);
                if (c0466aM1924h9 != null) {
                    AbstractC0473h.m1923b(c0466a, c0466aM1924h9, -this.f5351b.f65448Q[3].m3761e());
                    m1926c(c0466a2, c0466a, -1, c0467b);
                    if (this.f5351b.f65436E) {
                        m1926c(c0466a3, c0466a2, 1, this.f5349l);
                    }
                }
            } else {
                bj1 bj1Var8 = bj1VarArr2[4];
                if (bj1Var8.f8582f != null) {
                    C0466a c0466aM1924h10 = AbstractC0473h.m1924h(bj1Var8);
                    if (c0466aM1924h10 != null) {
                        AbstractC0473h.m1923b(c0466a3, c0466aM1924h10, 0);
                        m1926c(c0466a2, c0466a3, -1, this.f5349l);
                        m1926c(c0466a, c0466a2, 1, c0467b);
                    }
                } else if (!(vj1Var17 instanceof os3) && (vj1Var3 = vj1Var17.f65452U) != null) {
                    AbstractC0473h.m1923b(c0466a2, vj1Var3.f65466e.f5357h, vj1Var17.m23328t());
                    m1926c(c0466a, c0466a2, 1, c0467b);
                    if (this.f5351b.f65436E) {
                        m1926c(c0466a3, c0466a2, 1, this.f5349l);
                    }
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = this.f5353d;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    if (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour5) {
                        vj1 vj1Var20 = this.f5351b;
                        if (vj1Var20.f65455X > 0.0f) {
                            C0470e c0470e2 = vj1Var20.f65464d;
                            if (c0470e2.f5353d == constraintWidget$DimensionBehaviour5) {
                                c0470e2.f5354e.f5342k.add(c0467b);
                                arrayList2.add(this.f5351b.f65464d.f5354e);
                                c0467b.f5332a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c0467b.f5334c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: e */
    public final void mo1916e() {
        C0466a c0466a = this.f5357h;
        if (c0466a.f5341j) {
            this.f5351b.f65459a0 = c0466a.f5338g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: f */
    public final void mo1917f() {
        this.f5352c = null;
        this.f5357h.m1913c();
        this.f5358i.m1913c();
        this.f5348k.m1913c();
        this.f5354e.m1913c();
        this.f5356g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: k */
    public final boolean mo1918k() {
        return this.f5353d != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || this.f5351b.f65494s == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m1922m() {
        this.f5356g = false;
        C0466a c0466a = this.f5357h;
        c0466a.m1913c();
        c0466a.f5341j = false;
        C0466a c0466a2 = this.f5358i;
        c0466a2.m1913c();
        c0466a2.f5341j = false;
        C0466a c0466a3 = this.f5348k;
        c0466a3.m1913c();
        c0466a3.f5341j = false;
        this.f5354e.f5341j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f5351b.f65477j0;
    }
}
