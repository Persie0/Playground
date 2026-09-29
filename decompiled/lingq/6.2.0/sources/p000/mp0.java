package p000;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h;
import androidx.constraintlayout.core.widgets.analyzer.C0466a;
import androidx.constraintlayout.core.widgets.analyzer.C0467b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mp0 extends AbstractC0473h {

    /* JADX INFO: renamed from: k */
    public final ArrayList f51682k;

    /* JADX INFO: renamed from: l */
    public int f51683l;

    public mp0(vj1 vj1Var, int i) {
        vj1 vj1Var2;
        super(vj1Var);
        ArrayList<AbstractC0473h> arrayList = new ArrayList();
        this.f51682k = arrayList;
        this.f5355f = i;
        vj1 vj1Var3 = this.f5351b;
        vj1 vj1VarM23324n = vj1Var3.m23324n(i);
        while (true) {
            vj1Var2 = vj1Var3;
            vj1Var3 = vj1VarM23324n;
            if (vj1Var3 == null) {
                break;
            } else {
                vj1VarM23324n = vj1Var3.m23324n(this.f5355f);
            }
        }
        this.f5351b = vj1Var2;
        int i2 = this.f5355f;
        arrayList.add(i2 == 0 ? vj1Var2.f65464d : i2 == 1 ? vj1Var2.f65466e : null);
        vj1 vj1VarM23323m = vj1Var2.m23323m(this.f5355f);
        while (vj1VarM23323m != null) {
            int i3 = this.f5355f;
            arrayList.add(i3 == 0 ? vj1VarM23323m.f65464d : i3 == 1 ? vj1VarM23323m.f65466e : null);
            vj1VarM23323m = vj1VarM23323m.m23323m(this.f5355f);
        }
        for (AbstractC0473h abstractC0473h : arrayList) {
            int i4 = this.f5355f;
            if (i4 == 0) {
                abstractC0473h.f5351b.f65460b = this;
            } else if (i4 == 1) {
                abstractC0473h.f5351b.f65462c = this;
            }
        }
        if (this.f5355f == 0 && ((wj1) this.f5351b.f65452U).f66922y0 && arrayList.size() > 1) {
            this.f5351b = ((AbstractC0473h) AbstractC3393o1.m17731f(1, arrayList)).f5351b;
        }
        int i5 = this.f5355f;
        vj1 vj1Var4 = this.f5351b;
        this.f51683l = i5 == 0 ? vj1Var4.f65479k0 : vj1Var4.f65481l0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00ea A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00de  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2 A[ADDED_TO_REGION] */
    @Override // p000.nb2
    /* JADX INFO: renamed from: a */
    public final void mo1911a(nb2 nb2Var) {
        int i;
        int i2;
        boolean z;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f4;
        C0466a c0466a = this.f5357h;
        if (c0466a.f5341j) {
            C0466a c0466a2 = this.f5358i;
            if (c0466a2.f5341j) {
                vj1 vj1Var = this.f5351b.f65452U;
                boolean z2 = vj1Var instanceof wj1 ? ((wj1) vj1Var).f66922y0 : false;
                int i12 = c0466a2.f5338g - c0466a.f5338g;
                ArrayList arrayList = this.f51682k;
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i13 >= size) {
                        i13 = -1;
                        break;
                    } else if (((AbstractC0473h) arrayList.get(i13)).f5351b.f65473h0 != 8) {
                        break;
                    } else {
                        i13++;
                    }
                }
                int i14 = size - 1;
                for (int i15 = i14; i15 >= 0; i15--) {
                    if (((AbstractC0473h) arrayList.get(i15)).f5351b.f65473h0 != 8) {
                        i = i15;
                        break;
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= 2) {
                        z = z2;
                        f = 0.0f;
                        f2 = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    i4 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    f2 = 0.0f;
                    while (i17 < size) {
                        AbstractC0473h abstractC0473h = (AbstractC0473h) arrayList.get(i17);
                        vj1 vj1Var2 = abstractC0473h.f5351b;
                        boolean z3 = z2;
                        if (vj1Var2.f65473h0 != i2) {
                            i19++;
                            if (i17 > 0 && i17 >= i13) {
                                i4 += abstractC0473h.f5357h.f5337f;
                            }
                            C0467b c0467b = abstractC0473h.f5354e;
                            int i20 = c0467b.f5338g;
                            int i21 = i4;
                            boolean z4 = abstractC0473h.f5353d != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                            if (z4) {
                                int i22 = this.f5355f;
                                if (i22 == 0 && !vj1Var2.f65464d.f5354e.f5341j) {
                                    return;
                                }
                                if (i22 == 1 && !vj1Var2.f65466e.f5354e.f5341j) {
                                    return;
                                }
                            } else {
                                if (abstractC0473h.f5350a == 1 && i16 == 0) {
                                    i11 = c0467b.f5344m;
                                    i18++;
                                } else {
                                    if (c0467b.f5341j) {
                                        i11 = i20;
                                    }
                                    if (z4) {
                                        i4 = i21 + i11;
                                    } else {
                                        i18++;
                                        f4 = vj1Var2.f65483m0[this.f5355f];
                                        if (f4 >= 0.0f) {
                                            f2 += f4;
                                        }
                                        i4 = i21;
                                    }
                                    if (i17 >= i14 && i17 < i) {
                                        i4 += -abstractC0473h.f5358i.f5337f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i18++;
                                    f4 = vj1Var2.f65483m0[this.f5355f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                    i4 = i21;
                                } else {
                                    i4 = i21 + i11;
                                }
                                if (i17 >= i14) {
                                }
                            }
                            i11 = i20;
                            if (z4) {
                                i18++;
                                f4 = vj1Var2.f65483m0[this.f5355f];
                                if (f4 >= 0.0f) {
                                    f2 += f4;
                                }
                                i4 = i21;
                            } else {
                                i4 = i21 + i11;
                            }
                            if (i17 >= i14) {
                            }
                        }
                        i17++;
                        z2 = z3;
                        i2 = 8;
                    }
                    z = z2;
                    if (i4 < i12 || i18 == 0) {
                        i3 = i18;
                        i5 = i19;
                        break;
                    } else {
                        i16++;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i23 = c0466a.f5338g;
                if (z) {
                    i23 = c0466a2.f5338g;
                }
                float f5 = 0.5f;
                if (i4 > i12) {
                    i23 = z ? i23 + ((int) (((i4 - i12) / 2.0f) + 0.5f)) : i23 - ((int) (((i4 - i12) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f6 = i12 - i4;
                    int i24 = (int) ((f6 / i3) + 0.5f);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < size) {
                        float f7 = f5;
                        AbstractC0473h abstractC0473h2 = (AbstractC0473h) arrayList.get(i25);
                        int i27 = i23;
                        vj1 vj1Var3 = abstractC0473h2.f5351b;
                        int i28 = i3;
                        C0467b c0467b2 = abstractC0473h2.f5354e;
                        int i29 = i4;
                        float f8 = f6;
                        if (vj1Var3.f65473h0 != 8 && abstractC0473h2.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && !c0467b2.f5341j) {
                            int i30 = f2 > f ? (int) (((vj1Var3.f65483m0[this.f5355f] * f8) / f2) + f7) : i24;
                            if (this.f5355f == 0) {
                                i9 = vj1Var3.f65498v;
                                i10 = vj1Var3.f65497u;
                            } else {
                                i9 = vj1Var3.f65501y;
                                i10 = vj1Var3.f65500x;
                            }
                            int iMax = Math.max(i10, abstractC0473h2.f5350a == 1 ? Math.min(i30, c0467b2.f5344m) : i30);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i30) {
                                i26++;
                                i30 = iMax;
                            }
                            c0467b2.mo1914d(i30);
                        }
                        i25++;
                        i23 = i27;
                        f5 = f7;
                        i3 = i28;
                        i4 = i29;
                        f6 = f8;
                        i24 = i24;
                    }
                    i6 = i23;
                    f3 = f5;
                    int i31 = i3;
                    int i32 = i4;
                    if (i26 > 0) {
                        i3 = i31 - i26;
                        i4 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            AbstractC0473h abstractC0473h3 = (AbstractC0473h) arrayList.get(i33);
                            if (abstractC0473h3.f5351b.f65473h0 != 8) {
                                if (i33 > 0 && i33 >= i13) {
                                    i4 += abstractC0473h3.f5357h.f5337f;
                                }
                                i4 += abstractC0473h3.f5354e.f5338g;
                                if (i33 < i14 && i33 < i) {
                                    i4 += -abstractC0473h3.f5358i.f5337f;
                                }
                            }
                        }
                    } else {
                        i3 = i31;
                        i4 = i32;
                    }
                    i8 = 2;
                    if (this.f51683l == 2 && i26 == 0) {
                        i7 = 0;
                        this.f51683l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i23;
                    f3 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i4 > i12) {
                    this.f51683l = i8;
                }
                if (i5 > 0 && i3 == 0 && i13 == i) {
                    this.f51683l = i8;
                }
                int i34 = this.f51683l;
                if (i34 == 1) {
                    int i35 = i5 > 1 ? (i12 - i4) / (i5 - 1) : i5 == 1 ? (i12 - i4) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        AbstractC0473h abstractC0473h4 = (AbstractC0473h) arrayList.get(z ? size - (i37 + 1) : i37);
                        vj1 vj1Var4 = abstractC0473h4.f5351b;
                        C0466a c0466a3 = abstractC0473h4.f5358i;
                        C0466a c0466a4 = abstractC0473h4.f5357h;
                        if (vj1Var4.f65473h0 == 8) {
                            c0466a4.mo1914d(i36);
                            c0466a3.mo1914d(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i13) {
                                i36 = z ? i36 - c0466a4.f5337f : i36 + c0466a4.f5337f;
                            }
                            if (z) {
                                c0466a3.mo1914d(i36);
                            } else {
                                c0466a4.mo1914d(i36);
                            }
                            C0467b c0467b3 = abstractC0473h4.f5354e;
                            int i38 = c0467b3.f5338g;
                            if (abstractC0473h4.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && abstractC0473h4.f5350a == 1) {
                                i38 = c0467b3.f5344m;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                c0466a4.mo1914d(i36);
                            } else {
                                c0466a3.mo1914d(i36);
                            }
                            abstractC0473h4.f5356g = true;
                            if (i37 < i14 && i37 < i) {
                                i36 = z ? i36 - (-c0466a3.f5337f) : i36 + (-c0466a3.f5337f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i12 - i4) / (i5 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        AbstractC0473h abstractC0473h5 = (AbstractC0473h) arrayList.get(z ? size - (i41 + 1) : i41);
                        vj1 vj1Var5 = abstractC0473h5.f5351b;
                        C0466a c0466a5 = abstractC0473h5.f5358i;
                        C0466a c0466a6 = abstractC0473h5.f5357h;
                        if (vj1Var5.f65473h0 == 8) {
                            c0466a6.mo1914d(i40);
                            c0466a5.mo1914d(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i13) {
                                i42 = z ? i42 - c0466a6.f5337f : i42 + c0466a6.f5337f;
                            }
                            if (z) {
                                c0466a5.mo1914d(i42);
                            } else {
                                c0466a6.mo1914d(i42);
                            }
                            C0467b c0467b4 = abstractC0473h5.f5354e;
                            int iMin = c0467b4.f5338g;
                            if (abstractC0473h5.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && abstractC0473h5.f5350a == 1) {
                                iMin = Math.min(iMin, c0467b4.f5344m);
                            }
                            i40 = z ? i42 - iMin : i42 + iMin;
                            if (z) {
                                c0466a6.mo1914d(i40);
                            } else {
                                c0466a5.mo1914d(i40);
                            }
                            if (i41 < i14 && i41 < i) {
                                i40 = z ? i40 - (-c0466a5.f5337f) : i40 + (-c0466a5.f5337f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    int i43 = this.f5355f;
                    vj1 vj1Var6 = this.f5351b;
                    float f9 = i43 == 0 ? vj1Var6.f65467e0 : vj1Var6.f65469f0;
                    if (z) {
                        f9 = 1.0f - f9;
                    }
                    int i44 = (int) (((i12 - i4) * f9) + f3);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        AbstractC0473h abstractC0473h6 = (AbstractC0473h) arrayList.get(z ? size - (i46 + 1) : i46);
                        vj1 vj1Var7 = abstractC0473h6.f5351b;
                        C0466a c0466a7 = abstractC0473h6.f5358i;
                        C0466a c0466a8 = abstractC0473h6.f5357h;
                        if (vj1Var7.f65473h0 == 8) {
                            c0466a8.mo1914d(i45);
                            c0466a7.mo1914d(i45);
                        } else {
                            if (i46 > 0 && i46 >= i13) {
                                i45 = z ? i45 - c0466a8.f5337f : i45 + c0466a8.f5337f;
                            }
                            if (z) {
                                c0466a7.mo1914d(i45);
                            } else {
                                c0466a8.mo1914d(i45);
                            }
                            C0467b c0467b5 = abstractC0473h6.f5354e;
                            int i47 = c0467b5.f5338g;
                            if (abstractC0473h6.f5353d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && abstractC0473h6.f5350a == 1) {
                                i47 = c0467b5.f5344m;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                c0466a8.mo1914d(i45);
                            } else {
                                c0466a7.mo1914d(i45);
                            }
                            if (i46 < i14 && i46 < i) {
                                i45 = z ? i45 - (-c0466a7.f5337f) : i45 + (-c0466a7.f5337f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: d */
    public final void mo1915d() {
        ArrayList arrayList = this.f51682k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0473h) it.next()).mo1915d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        vj1 vj1Var = ((AbstractC0473h) arrayList.get(0)).f5351b;
        vj1 vj1Var2 = ((AbstractC0473h) arrayList.get(size - 1)).f5351b;
        int i = this.f5355f;
        C0466a c0466a = this.f5358i;
        C0466a c0466a2 = this.f5357h;
        if (i == 0) {
            bj1 bj1Var = vj1Var.f65440I;
            bj1 bj1Var2 = vj1Var2.f65442K;
            C0466a c0466aM1925i = AbstractC0473h.m1925i(bj1Var, 0);
            int iM3761e = bj1Var.m3761e();
            vj1 vj1VarM16975m = m16975m();
            if (vj1VarM16975m != null) {
                iM3761e = vj1VarM16975m.f65440I.m3761e();
            }
            if (c0466aM1925i != null) {
                AbstractC0473h.m1923b(c0466a2, c0466aM1925i, iM3761e);
            }
            C0466a c0466aM1925i2 = AbstractC0473h.m1925i(bj1Var2, 0);
            int iM3761e2 = bj1Var2.m3761e();
            vj1 vj1VarM16976n = m16976n();
            if (vj1VarM16976n != null) {
                iM3761e2 = vj1VarM16976n.f65442K.m3761e();
            }
            if (c0466aM1925i2 != null) {
                AbstractC0473h.m1923b(c0466a, c0466aM1925i2, -iM3761e2);
            }
        } else {
            bj1 bj1Var3 = vj1Var.f65441J;
            bj1 bj1Var4 = vj1Var2.f65443L;
            C0466a c0466aM1925i3 = AbstractC0473h.m1925i(bj1Var3, 1);
            int iM3761e3 = bj1Var3.m3761e();
            vj1 vj1VarM16975m2 = m16975m();
            if (vj1VarM16975m2 != null) {
                iM3761e3 = vj1VarM16975m2.f65441J.m3761e();
            }
            if (c0466aM1925i3 != null) {
                AbstractC0473h.m1923b(c0466a2, c0466aM1925i3, iM3761e3);
            }
            C0466a c0466aM1925i4 = AbstractC0473h.m1925i(bj1Var4, 1);
            int iM3761e4 = bj1Var4.m3761e();
            vj1 vj1VarM16976n2 = m16976n();
            if (vj1VarM16976n2 != null) {
                iM3761e4 = vj1VarM16976n2.f65443L.m3761e();
            }
            if (c0466aM1925i4 != null) {
                AbstractC0473h.m1923b(c0466a, c0466aM1925i4, -iM3761e4);
            }
        }
        c0466a2.f5332a = this;
        c0466a.f5332a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: e */
    public final void mo1916e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f51682k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC0473h) arrayList.get(i)).mo1916e();
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: f */
    public final void mo1917f() {
        this.f5352c = null;
        Iterator it = this.f51682k.iterator();
        while (it.hasNext()) {
            ((AbstractC0473h) it.next()).mo1917f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: j */
    public final long mo1928j() {
        ArrayList arrayList = this.f51682k;
        int size = arrayList.size();
        long jMo1928j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC0473h abstractC0473h = (AbstractC0473h) arrayList.get(i);
            jMo1928j = ((long) abstractC0473h.f5358i.f5337f) + abstractC0473h.mo1928j() + jMo1928j + ((long) abstractC0473h.f5357h.f5337f);
        }
        return jMo1928j;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: k */
    public final boolean mo1918k() {
        ArrayList arrayList = this.f51682k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0473h) arrayList.get(i)).mo1918k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final vj1 m16975m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f51682k;
            if (i >= arrayList.size()) {
                return null;
            }
            vj1 vj1Var = ((AbstractC0473h) arrayList.get(i)).f5351b;
            if (vj1Var.f65473h0 != 8) {
                return vj1Var;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final vj1 m16976n() {
        ArrayList arrayList = this.f51682k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vj1 vj1Var = ((AbstractC0473h) arrayList.get(size)).f5351b;
            if (vj1Var.f65473h0 != 8) {
                return vj1Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f5355f == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC0473h abstractC0473h : this.f51682k) {
            sb.append("<");
            sb.append(abstractC0473h);
            sb.append("> ");
        }
        return sb.toString();
    }
}
