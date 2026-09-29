package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p000.bj1;
import p000.nb2;
import p000.os3;
import p000.vj1;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0470e extends AbstractC0473h {

    /* JADX INFO: renamed from: k */
    public static final int[] f5346k = new int[2];

    public C0470e(vj1 vj1Var) {
        super(vj1Var);
        this.f5357h.f5336e = DependencyNode$Type.LEFT;
        this.f5358i.f5336e = DependencyNode$Type.RIGHT;
        this.f5355f = 0;
    }

    /* JADX INFO: renamed from: m */
    public static void m1920m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0262  */
    /* JADX WARN: Code duplicated, block: B:117:0x0271  */
    @Override // p000.nb2
    /* JADX INFO: renamed from: a */
    public final void mo1911a(nb2 nb2Var) {
        int iM1927g;
        int i;
        int iM1927g2;
        float f;
        float f2;
        float f3;
        int i2;
        if (AbstractC0469d.f5345a[this.f5359j.ordinal()] == 3) {
            vj1 vj1Var = this.f5351b;
            m1929l(vj1Var.f65440I, vj1Var.f65442K, 0);
            return;
        }
        C0467b c0467b = this.f5354e;
        boolean z = c0467b.f5341j;
        C0466a c0466a = this.f5357h;
        C0466a c0466a2 = this.f5358i;
        if (!z && this.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            vj1 vj1Var2 = this.f5351b;
            int i3 = vj1Var2.f65492r;
            if (i3 == 2) {
                vj1 vj1Var3 = vj1Var2.f65452U;
                if (vj1Var3 != null) {
                    C0467b c0467b2 = vj1Var3.f65464d.f5354e;
                    if (c0467b2.f5341j) {
                        c0467b.mo1914d((int) ((c0467b2.f5338g * vj1Var2.f65499w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = vj1Var2.f65494s;
                if (i4 == 0 || i4 == 3) {
                    C0472g c0472g = vj1Var2.f65466e;
                    C0466a c0466a3 = c0472g.f5357h;
                    C0466a c0466a4 = c0472g.f5358i;
                    boolean z2 = vj1Var2.f65440I.f8582f != null;
                    boolean z3 = vj1Var2.f65441J.f8582f != null;
                    boolean z4 = vj1Var2.f65442K.f8582f != null;
                    boolean z5 = vj1Var2.f65443L.f8582f != null;
                    int i5 = vj1Var2.f65456Y;
                    if (z2 && z3 && z4 && z5) {
                        float f4 = vj1Var2.f65455X;
                        boolean z6 = c0466a3.f5341j;
                        ArrayList arrayList = c0466a3.f5343l;
                        int[] iArr = f5346k;
                        if (z6 && c0466a4.f5341j) {
                            if (c0466a.f5334c && c0466a2.f5334c) {
                                m1920m(iArr, ((C0466a) c0466a.f5343l.get(0)).f5338g + c0466a.f5337f, ((C0466a) c0466a2.f5343l.get(0)).f5338g - c0466a2.f5337f, c0466a3.f5338g + c0466a3.f5337f, c0466a4.f5338g - c0466a4.f5337f, f4, i5);
                                c0467b.mo1914d(iArr[0]);
                                this.f5351b.f65466e.f5354e.mo1914d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c0466a.f5341j && c0466a2.f5341j) {
                            if (!c0466a3.f5334c || !c0466a4.f5334c) {
                                return;
                            }
                            m1920m(iArr, c0466a.f5338g + c0466a.f5337f, c0466a2.f5338g - c0466a2.f5337f, ((C0466a) arrayList.get(0)).f5338g + c0466a3.f5337f, ((C0466a) c0466a4.f5343l.get(0)).f5338g - c0466a4.f5337f, f4, i5);
                            c0467b.mo1914d(iArr[0]);
                            this.f5351b.f65466e.f5354e.mo1914d(iArr[1]);
                        }
                        if (!c0466a.f5334c || !c0466a2.f5334c || !c0466a3.f5334c || !c0466a4.f5334c) {
                            return;
                        }
                        m1920m(iArr, ((C0466a) c0466a.f5343l.get(0)).f5338g + c0466a.f5337f, ((C0466a) c0466a2.f5343l.get(0)).f5338g - c0466a2.f5337f, ((C0466a) arrayList.get(0)).f5338g + c0466a3.f5337f, ((C0466a) c0466a4.f5343l.get(0)).f5338g - c0466a4.f5337f, f4, i5);
                        c0467b.mo1914d(iArr[0]);
                        this.f5351b.f65466e.f5354e.mo1914d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c0466a.f5334c || !c0466a2.f5334c) {
                            return;
                        }
                        float f5 = vj1Var2.f65455X;
                        int i6 = ((C0466a) c0466a.f5343l.get(0)).f5338g + c0466a.f5337f;
                        int i7 = ((C0466a) c0466a2.f5343l.get(0)).f5338g - c0466a2.f5337f;
                        if (i5 == -1 || i5 == 0) {
                            int iM1927g3 = m1927g(i7 - i6, 0);
                            int i8 = (int) ((iM1927g3 * f5) + 0.5f);
                            int iM1927g4 = m1927g(i8, 1);
                            if (i8 != iM1927g4) {
                                iM1927g3 = (int) ((iM1927g4 / f5) + 0.5f);
                            }
                            c0467b.mo1914d(iM1927g3);
                            this.f5351b.f65466e.f5354e.mo1914d(iM1927g4);
                        } else if (i5 == 1) {
                            int iM1927g5 = m1927g(i7 - i6, 0);
                            int i9 = (int) ((iM1927g5 / f5) + 0.5f);
                            int iM1927g6 = m1927g(i9, 1);
                            if (i9 != iM1927g6) {
                                iM1927g5 = (int) ((iM1927g6 * f5) + 0.5f);
                            }
                            c0467b.mo1914d(iM1927g5);
                            this.f5351b.f65466e.f5354e.mo1914d(iM1927g6);
                        }
                    } else if (z3 && z5) {
                        if (!c0466a3.f5334c || !c0466a4.f5334c) {
                            return;
                        }
                        float f6 = vj1Var2.f65455X;
                        int i10 = ((C0466a) c0466a3.f5343l.get(0)).f5338g + c0466a3.f5337f;
                        int i11 = ((C0466a) c0466a4.f5343l.get(0)).f5338g - c0466a4.f5337f;
                        if (i5 == -1) {
                            iM1927g = m1927g(i11 - i10, 1);
                            i = (int) ((iM1927g / f6) + 0.5f);
                            iM1927g2 = m1927g(i, 0);
                            if (i != iM1927g2) {
                                iM1927g = (int) ((iM1927g2 * f6) + 0.5f);
                            }
                            c0467b.mo1914d(iM1927g2);
                            this.f5351b.f65466e.f5354e.mo1914d(iM1927g);
                        } else if (i5 == 0) {
                            int iM1927g7 = m1927g(i11 - i10, 1);
                            int i12 = (int) ((iM1927g7 * f6) + 0.5f);
                            int iM1927g8 = m1927g(i12, 0);
                            if (i12 != iM1927g8) {
                                iM1927g7 = (int) ((iM1927g8 / f6) + 0.5f);
                            }
                            c0467b.mo1914d(iM1927g8);
                            this.f5351b.f65466e.f5354e.mo1914d(iM1927g7);
                        } else if (i5 == 1) {
                            iM1927g = m1927g(i11 - i10, 1);
                            i = (int) ((iM1927g / f6) + 0.5f);
                            iM1927g2 = m1927g(i, 0);
                            if (i != iM1927g2) {
                                iM1927g = (int) ((iM1927g2 * f6) + 0.5f);
                            }
                            c0467b.mo1914d(iM1927g2);
                            this.f5351b.f65466e.f5354e.mo1914d(iM1927g);
                        }
                    }
                } else {
                    int i13 = vj1Var2.f65456Y;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f3 = vj1Var2.f65466e.f5354e.f5338g / vj1Var2.f65455X;
                            i2 = (int) (f3 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f = vj1Var2.f65466e.f5354e.f5338g;
                            f2 = vj1Var2.f65455X;
                        }
                        c0467b.mo1914d(i2);
                    } else {
                        f = vj1Var2.f65466e.f5354e.f5338g;
                        f2 = vj1Var2.f65455X;
                    }
                    f3 = f * f2;
                    i2 = (int) (f3 + 0.5f);
                    c0467b.mo1914d(i2);
                }
            }
        }
        boolean z7 = c0466a.f5334c;
        ArrayList arrayList2 = c0466a.f5343l;
        if (z7) {
            boolean z8 = c0466a2.f5334c;
            ArrayList arrayList3 = c0466a2.f5343l;
            if (z8) {
                if (c0466a.f5341j && c0466a2.f5341j && c0467b.f5341j) {
                    return;
                }
                if (!c0467b.f5341j && this.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                    vj1 vj1Var4 = this.f5351b;
                    if (vj1Var4.f65492r == 0 && !vj1Var4.m23333y()) {
                        C0466a c0466a5 = (C0466a) arrayList2.get(0);
                        C0466a c0466a6 = (C0466a) arrayList3.get(0);
                        int i14 = c0466a5.f5338g + c0466a.f5337f;
                        int i15 = c0466a6.f5338g + c0466a2.f5337f;
                        c0466a.mo1914d(i14);
                        c0466a2.mo1914d(i15);
                        c0467b.mo1914d(i15 - i14);
                        return;
                    }
                }
                if (!c0467b.f5341j && this.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && this.f5350a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C0466a) arrayList3.get(0)).f5338g + c0466a2.f5337f) - (((C0466a) arrayList2.get(0)).f5338g + c0466a.f5337f), c0467b.f5344m);
                    vj1 vj1Var5 = this.f5351b;
                    int i16 = vj1Var5.f65498v;
                    int iMax = Math.max(vj1Var5.f65497u, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    c0467b.mo1914d(iMax);
                }
                if (c0467b.f5341j) {
                    C0466a c0466a7 = (C0466a) arrayList2.get(0);
                    C0466a c0466a8 = (C0466a) arrayList3.get(0);
                    int i17 = c0466a7.f5338g;
                    int i18 = c0466a.f5337f + i17;
                    int i19 = c0466a8.f5338g;
                    int i20 = c0466a2.f5337f + i19;
                    float f7 = this.f5351b.f65467e0;
                    if (c0466a7 == c0466a8) {
                        f7 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    c0466a.mo1914d((int) ((((i19 - i17) - c0467b.f5338g) * f7) + i17 + 0.5f));
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
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        vj1 vj1Var3;
        vj1 vj1Var4;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        vj1 vj1Var5 = this.f5351b;
        boolean z = vj1Var5.f65458a;
        C0467b c0467b = this.f5354e;
        if (z) {
            c0467b.mo1914d(vj1Var5.m23326r());
        }
        boolean z2 = c0467b.f5341j;
        ArrayList arrayList = c0467b.f5342k;
        ArrayList arrayList2 = c0467b.f5343l;
        C0466a c0466a = this.f5358i;
        C0466a c0466a2 = this.f5357h;
        if (z2) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = this.f5353d;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
            if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && (vj1Var2 = (vj1Var = this.f5351b).f65452U) != null && ((constraintWidget$DimensionBehaviour = vj1Var2.f65451T[0]) == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour4)) {
                AbstractC0473h.m1923b(c0466a2, vj1Var2.f65464d.f5357h, vj1Var.f65440I.m3761e());
                AbstractC0473h.m1923b(c0466a, vj1Var2.f65464d.f5358i, -this.f5351b.f65442K.m3761e());
                return;
            }
        } else {
            vj1 vj1Var6 = this.f5351b;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = vj1Var6.f65451T[0];
            this.f5353d = constraintWidget$DimensionBehaviour5;
            if (constraintWidget$DimensionBehaviour5 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
                if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour6 && (vj1Var4 = vj1Var6.f65452U) != null && ((constraintWidget$DimensionBehaviour2 = vj1Var4.f65451T[0]) == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour6)) {
                    int iM23326r = (vj1Var4.m23326r() - this.f5351b.f65440I.m3761e()) - this.f5351b.f65442K.m3761e();
                    AbstractC0473h.m1923b(c0466a2, vj1Var4.f65464d.f5357h, this.f5351b.f65440I.m3761e());
                    AbstractC0473h.m1923b(c0466a, vj1Var4.f65464d.f5358i, -this.f5351b.f65442K.m3761e());
                    c0467b.mo1914d(iM23326r);
                    return;
                }
                if (constraintWidget$DimensionBehaviour5 == ConstraintWidget$DimensionBehaviour.FIXED) {
                    c0467b.mo1914d(vj1Var6.m23326r());
                }
            }
        }
        if (c0467b.f5341j) {
            vj1 vj1Var7 = this.f5351b;
            if (vj1Var7.f65458a) {
                bj1[] bj1VarArr = vj1Var7.f65448Q;
                bj1 bj1Var = bj1VarArr[0];
                bj1 bj1Var2 = bj1Var.f8582f;
                if (bj1Var2 != null && bj1VarArr[1].f8582f != null) {
                    boolean zM23333y = vj1Var7.m23333y();
                    vj1 vj1Var8 = this.f5351b;
                    if (zM23333y) {
                        c0466a2.f5337f = vj1Var8.f65448Q[0].m3761e();
                        c0466a.f5337f = -this.f5351b.f65448Q[1].m3761e();
                        return;
                    }
                    C0466a c0466aM1924h = AbstractC0473h.m1924h(vj1Var8.f65448Q[0]);
                    if (c0466aM1924h != null) {
                        AbstractC0473h.m1923b(c0466a2, c0466aM1924h, this.f5351b.f65448Q[0].m3761e());
                    }
                    C0466a c0466aM1924h2 = AbstractC0473h.m1924h(this.f5351b.f65448Q[1]);
                    if (c0466aM1924h2 != null) {
                        AbstractC0473h.m1923b(c0466a, c0466aM1924h2, -this.f5351b.f65448Q[1].m3761e());
                    }
                    c0466a2.f5333b = true;
                    c0466a.f5333b = true;
                    return;
                }
                if (bj1Var2 != null) {
                    C0466a c0466aM1924h3 = AbstractC0473h.m1924h(bj1Var);
                    if (c0466aM1924h3 != null) {
                        AbstractC0473h.m1923b(c0466a2, c0466aM1924h3, this.f5351b.f65448Q[0].m3761e());
                        AbstractC0473h.m1923b(c0466a, c0466a2, c0467b.f5338g);
                        return;
                    }
                    return;
                }
                bj1 bj1Var3 = bj1VarArr[1];
                if (bj1Var3.f8582f != null) {
                    C0466a c0466aM1924h4 = AbstractC0473h.m1924h(bj1Var3);
                    if (c0466aM1924h4 != null) {
                        AbstractC0473h.m1923b(c0466a, c0466aM1924h4, -this.f5351b.f65448Q[1].m3761e());
                        AbstractC0473h.m1923b(c0466a2, c0466a, -c0467b.f5338g);
                        return;
                    }
                    return;
                }
                if ((vj1Var7 instanceof os3) || vj1Var7.f65452U == null || vj1Var7.mo12819j(ConstraintAnchor$Type.CENTER).f8582f != null) {
                    return;
                }
                vj1 vj1Var9 = this.f5351b;
                AbstractC0473h.m1923b(c0466a2, vj1Var9.f65452U.f65464d.f5357h, vj1Var9.m23327s());
                AbstractC0473h.m1923b(c0466a, c0466a2, c0467b.f5338g);
                return;
            }
        }
        if (this.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            vj1 vj1Var10 = this.f5351b;
            int i = vj1Var10.f65492r;
            if (i == 2) {
                vj1 vj1Var11 = vj1Var10.f65452U;
                if (vj1Var11 != null) {
                    C0467b c0467b2 = vj1Var11.f65466e.f5354e;
                    arrayList2.add(c0467b2);
                    c0467b2.f5342k.add(c0467b);
                    c0467b.f5333b = true;
                    arrayList.add(c0466a2);
                    arrayList.add(c0466a);
                }
            } else if (i == 3) {
                if (vj1Var10.f65494s == 3) {
                    c0466a2.f5332a = this;
                    c0466a.f5332a = this;
                    C0472g c0472g = vj1Var10.f65466e;
                    c0472g.f5357h.f5332a = this;
                    c0472g.f5358i.f5332a = this;
                    c0467b.f5332a = this;
                    if (vj1Var10.m23334z()) {
                        arrayList2.add(this.f5351b.f65466e.f5354e);
                        this.f5351b.f65466e.f5354e.f5342k.add(c0467b);
                        C0472g c0472g2 = this.f5351b.f65466e;
                        c0472g2.f5354e.f5332a = this;
                        arrayList2.add(c0472g2.f5357h);
                        arrayList2.add(this.f5351b.f65466e.f5358i);
                        this.f5351b.f65466e.f5357h.f5342k.add(c0467b);
                        this.f5351b.f65466e.f5358i.f5342k.add(c0467b);
                    } else {
                        boolean zM23333y2 = this.f5351b.m23333y();
                        vj1 vj1Var12 = this.f5351b;
                        if (zM23333y2) {
                            vj1Var12.f65466e.f5354e.f5343l.add(c0467b);
                            arrayList.add(this.f5351b.f65466e.f5354e);
                        } else {
                            vj1Var12.f65466e.f5354e.f5343l.add(c0467b);
                        }
                    }
                } else {
                    C0467b c0467b3 = vj1Var10.f65466e.f5354e;
                    arrayList2.add(c0467b3);
                    c0467b3.f5342k.add(c0467b);
                    this.f5351b.f65466e.f5357h.f5342k.add(c0467b);
                    this.f5351b.f65466e.f5358i.f5342k.add(c0467b);
                    c0467b.f5333b = true;
                    arrayList.add(c0466a2);
                    arrayList.add(c0466a);
                    c0466a2.f5343l.add(c0467b);
                    c0466a.f5343l.add(c0467b);
                }
            }
        }
        vj1 vj1Var13 = this.f5351b;
        bj1[] bj1VarArr2 = vj1Var13.f65448Q;
        bj1 bj1Var4 = bj1VarArr2[0];
        bj1 bj1Var5 = bj1Var4.f8582f;
        if (bj1Var5 != null && bj1VarArr2[1].f8582f != null) {
            boolean zM23333y3 = vj1Var13.m23333y();
            vj1 vj1Var14 = this.f5351b;
            if (zM23333y3) {
                c0466a2.f5337f = vj1Var14.f65448Q[0].m3761e();
                c0466a.f5337f = -this.f5351b.f65448Q[1].m3761e();
                return;
            }
            C0466a c0466aM1924h5 = AbstractC0473h.m1924h(vj1Var14.f65448Q[0]);
            C0466a c0466aM1924h6 = AbstractC0473h.m1924h(this.f5351b.f65448Q[1]);
            if (c0466aM1924h5 != null) {
                c0466aM1924h5.m1912b(this);
            }
            if (c0466aM1924h6 != null) {
                c0466aM1924h6.m1912b(this);
            }
            this.f5359j = WidgetRun$RunType.CENTER;
            return;
        }
        if (bj1Var5 != null) {
            C0466a c0466aM1924h7 = AbstractC0473h.m1924h(bj1Var4);
            if (c0466aM1924h7 != null) {
                AbstractC0473h.m1923b(c0466a2, c0466aM1924h7, this.f5351b.f65448Q[0].m3761e());
                m1926c(c0466a, c0466a2, 1, c0467b);
                return;
            }
            return;
        }
        bj1 bj1Var6 = bj1VarArr2[1];
        if (bj1Var6.f8582f != null) {
            C0466a c0466aM1924h8 = AbstractC0473h.m1924h(bj1Var6);
            if (c0466aM1924h8 != null) {
                AbstractC0473h.m1923b(c0466a, c0466aM1924h8, -this.f5351b.f65448Q[1].m3761e());
                m1926c(c0466a2, c0466a, -1, c0467b);
                return;
            }
            return;
        }
        if ((vj1Var13 instanceof os3) || (vj1Var3 = vj1Var13.f65452U) == null) {
            return;
        }
        AbstractC0473h.m1923b(c0466a2, vj1Var3.f65464d.f5357h, vj1Var13.m23327s());
        m1926c(c0466a, c0466a2, 1, c0467b);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: e */
    public final void mo1916e() {
        C0466a c0466a = this.f5357h;
        if (c0466a.f5341j) {
            this.f5351b.f65457Z = c0466a.f5338g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: f */
    public final void mo1917f() {
        this.f5352c = null;
        this.f5357h.m1913c();
        this.f5358i.m1913c();
        this.f5354e.m1913c();
        this.f5356g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: k */
    public final boolean mo1918k() {
        return this.f5353d != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || this.f5351b.f65492r == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m1921n() {
        this.f5356g = false;
        C0466a c0466a = this.f5357h;
        c0466a.m1913c();
        c0466a.f5341j = false;
        C0466a c0466a2 = this.f5358i;
        c0466a2.m1913c();
        c0466a2.f5341j = false;
        this.f5354e.f5341j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f5351b.f65477j0;
    }
}
