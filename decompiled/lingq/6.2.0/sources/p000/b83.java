package p000;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;

/* JADX INFO: loaded from: classes2.dex */
public final class b83 {

    /* JADX INFO: renamed from: a */
    public int f8090a;

    /* JADX INFO: renamed from: d */
    public bj1 f8093d;

    /* JADX INFO: renamed from: e */
    public bj1 f8094e;

    /* JADX INFO: renamed from: f */
    public bj1 f8095f;

    /* JADX INFO: renamed from: g */
    public bj1 f8096g;

    /* JADX INFO: renamed from: h */
    public int f8097h;

    /* JADX INFO: renamed from: i */
    public int f8098i;

    /* JADX INFO: renamed from: j */
    public int f8099j;

    /* JADX INFO: renamed from: k */
    public int f8100k;

    /* JADX INFO: renamed from: q */
    public int f8106q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ d83 f8107r;

    /* JADX INFO: renamed from: b */
    public vj1 f8091b = null;

    /* JADX INFO: renamed from: c */
    public int f8092c = 0;

    /* JADX INFO: renamed from: l */
    public int f8101l = 0;

    /* JADX INFO: renamed from: m */
    public int f8102m = 0;

    /* JADX INFO: renamed from: n */
    public int f8103n = 0;

    /* JADX INFO: renamed from: o */
    public int f8104o = 0;

    /* JADX INFO: renamed from: p */
    public int f8105p = 0;

    public b83(d83 d83Var, int i, bj1 bj1Var, bj1 bj1Var2, bj1 bj1Var3, bj1 bj1Var4, int i2) {
        this.f8107r = d83Var;
        this.f8090a = i;
        this.f8093d = bj1Var;
        this.f8094e = bj1Var2;
        this.f8095f = bj1Var3;
        this.f8096g = bj1Var4;
        this.f8097h = d83Var.f38009z0;
        this.f8098i = d83Var.f38005v0;
        this.f8099j = d83Var.f37999A0;
        this.f8100k = d83Var.f38006w0;
        this.f8106q = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m3415a(vj1 vj1Var) {
        int i = this.f8090a;
        int i2 = this.f8106q;
        d83 d83Var = this.f8107r;
        if (i == 0) {
            int iM10148Y = d83Var.m10148Y(vj1Var, i2);
            if (vj1Var.f65451T[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                this.f8105p++;
                iM10148Y = 0;
            }
            this.f8101l = iM10148Y + (vj1Var.f65473h0 != 8 ? d83Var.f35130S0 : 0) + this.f8101l;
            int iM10147X = d83Var.m10147X(vj1Var, this.f8106q);
            if (this.f8091b == null || this.f8092c < iM10147X) {
                this.f8091b = vj1Var;
                this.f8092c = iM10147X;
                this.f8102m = iM10147X;
            }
        } else {
            int iM10148Y2 = d83Var.m10148Y(vj1Var, i2);
            int iM10147X2 = d83Var.m10147X(vj1Var, this.f8106q);
            if (vj1Var.f65451T[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                this.f8105p++;
                iM10147X2 = 0;
            }
            this.f8102m = iM10147X2 + (vj1Var.f65473h0 != 8 ? d83Var.f35131T0 : 0) + this.f8102m;
            if (this.f8091b == null || this.f8092c < iM10148Y2) {
                this.f8091b = vj1Var;
                this.f8092c = iM10148Y2;
                this.f8101l = iM10148Y2;
            }
        }
        this.f8104o++;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0105 A[PHI: r5 r9
      0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public final void m3416b(int i, boolean z, boolean z2) {
        d83 d83Var;
        int i2;
        int i3;
        vj1 vj1Var;
        boolean z3;
        char c;
        int i4;
        float f;
        int i5;
        int i6 = this.f8104o;
        int i7 = 0;
        while (true) {
            d83Var = this.f8107r;
            if (i7 >= i6 || (i5 = this.f8103n + i7) >= d83Var.f35142e1) {
                break;
            }
            vj1 vj1Var2 = d83Var.f35141d1[i5];
            if (vj1Var2 != null) {
                vj1Var2.m23304E();
            }
            i7++;
        }
        if (i6 == 0 || this.f8091b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.f8103n + (z ? (i6 - 1) - i10 : i10);
            if (i11 >= d83Var.f35142e1) {
                break;
            }
            vj1 vj1Var3 = d83Var.f35141d1[i11];
            if (vj1Var3 != null && vj1Var3.f65473h0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        int i12 = this.f8090a;
        vj1 vj1Var4 = this.f8091b;
        if (i12 == 0) {
            vj1Var4.f65481l0 = d83Var.f35119H0;
            bj1 bj1Var = vj1Var4.f65443L;
            bj1 bj1Var2 = vj1Var4.f65441J;
            int i13 = this.f8098i;
            if (i > 0) {
                i13 += d83Var.f35131T0;
            }
            bj1Var2.m3757a(this.f8094e, i13);
            if (z2) {
                bj1Var.m3757a(this.f8096g, this.f8100k);
            }
            if (i > 0) {
                this.f8094e.f8580d.f65443L.m3757a(bj1Var2, 0);
            }
            if (d83Var.f35133V0 != 3 || vj1Var4.f65436E) {
                vj1Var = vj1Var4;
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < i6) {
                    int i15 = this.f8103n + (z ? (i6 - 1) - i14 : i14);
                    if (i15 < d83Var.f35142e1) {
                        vj1Var = d83Var.f35141d1[i15];
                        if (vj1Var.f65436E) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                vj1Var = vj1Var4;
                break;
            }
            int i16 = 0;
            vj1 vj1Var5 = null;
            while (i16 < i6) {
                int i17 = z ? (i6 - 1) - i16 : i16;
                int i18 = this.f8103n + i17;
                if (i18 >= d83Var.f35142e1) {
                    return;
                }
                vj1 vj1Var6 = d83Var.f35141d1[i18];
                if (vj1Var6 == null) {
                    i6 = i6;
                    z3 = z4;
                    i9 = i9;
                    c = 3;
                } else {
                    bj1 bj1Var3 = vj1Var6.f65441J;
                    bj1 bj1Var4 = vj1Var6.f65443L;
                    bj1 bj1Var5 = vj1Var6.f65440I;
                    z3 = z4;
                    if (i16 == 0) {
                        vj1Var6.m23317e(bj1Var5, this.f8093d, this.f8097h);
                    }
                    if (i17 == 0) {
                        int i19 = d83Var.f35118G0;
                        float f2 = d83Var.f35124M0;
                        if (z) {
                            f2 = 1.0f - f2;
                        }
                        if (this.f8103n == 0 && (i4 = d83Var.f35120I0) != -1) {
                            f = d83Var.f35126O0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        } else if (!z2 || (i4 = d83Var.f35122K0) == -1) {
                            i4 = i19;
                            f = f2;
                        } else {
                            f = d83Var.f35128Q0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        }
                        vj1Var6.f65479k0 = i4;
                        vj1Var6.f65467e0 = f;
                    }
                    if (i16 == i6 - 1) {
                        vj1Var6.m23317e(vj1Var6.f65442K, this.f8095f, this.f8099j);
                    }
                    if (vj1Var5 != null) {
                        bj1 bj1Var6 = vj1Var5.f65442K;
                        bj1Var5.m3757a(bj1Var6, d83Var.f35130S0);
                        if (i16 == i8) {
                            int i20 = this.f8097h;
                            if (bj1Var5.m3764h()) {
                                bj1Var5.f8584h = i20;
                            }
                        }
                        bj1Var6.m3757a(bj1Var5, 0);
                        if (i16 == i9 + 1) {
                            int i21 = this.f8099j;
                            if (bj1Var6.m3764h()) {
                                bj1Var6.f8584h = i21;
                            }
                        }
                    }
                    if (vj1Var6 != vj1Var4) {
                        int i22 = d83Var.f35133V0;
                        c = 3;
                        if (i22 == 3 && vj1Var.f65436E && vj1Var6 != vj1Var && vj1Var6.f65436E) {
                            vj1Var6.f65444M.m3757a(vj1Var.f65444M, 0);
                        } else if (i22 == 0) {
                            bj1Var3.m3757a(bj1Var2, 0);
                        } else if (i22 == 1) {
                            bj1Var4.m3757a(bj1Var, 0);
                        } else if (z3) {
                            bj1Var3.m3757a(this.f8094e, this.f8098i);
                            bj1Var4.m3757a(this.f8096g, this.f8100k);
                        } else {
                            bj1Var3.m3757a(bj1Var2, 0);
                            bj1Var4.m3757a(bj1Var, 0);
                        }
                    } else {
                        c = 3;
                    }
                    vj1Var5 = vj1Var6;
                }
                i16++;
                z4 = z3;
                i9 = i9;
                i6 = i6;
            }
            return;
        }
        int i23 = i6;
        boolean z5 = z4;
        int i24 = i9;
        vj1Var4.f65479k0 = d83Var.f35118G0;
        bj1 bj1Var7 = vj1Var4.f65440I;
        bj1 bj1Var8 = vj1Var4.f65442K;
        int i25 = this.f8097h;
        if (i > 0) {
            i25 += d83Var.f35130S0;
        }
        if (z) {
            bj1Var8.m3757a(this.f8095f, i25);
            if (z2) {
                bj1Var7.m3757a(this.f8093d, this.f8099j);
            }
            if (i > 0) {
                this.f8095f.f8580d.f65440I.m3757a(bj1Var8, 0);
            }
        } else {
            bj1Var7.m3757a(this.f8093d, i25);
            if (z2) {
                bj1Var8.m3757a(this.f8095f, this.f8099j);
            }
            if (i > 0) {
                this.f8093d.f8580d.f65442K.m3757a(bj1Var7, 0);
            }
        }
        int i26 = 0;
        vj1 vj1Var7 = null;
        while (true) {
            int i27 = i23;
            if (i26 >= i27 || (i2 = this.f8103n + i26) >= d83Var.f35142e1) {
                return;
            }
            vj1 vj1Var8 = d83Var.f35141d1[i2];
            if (vj1Var8 == null) {
                i23 = i27;
            } else {
                bj1 bj1Var9 = vj1Var8.f65440I;
                bj1 bj1Var10 = vj1Var8.f65441J;
                bj1 bj1Var11 = vj1Var8.f65442K;
                if (i26 == 0) {
                    vj1Var8.m23317e(bj1Var10, this.f8094e, this.f8098i);
                    int i28 = d83Var.f35119H0;
                    float f3 = d83Var.f35125N0;
                    if (this.f8103n == 0) {
                        int i29 = d83Var.f35121J0;
                        i23 = i27;
                        i3 = -1;
                        if (i29 != -1) {
                            f3 = d83Var.f35127P0;
                        }
                        i28 = i29;
                        vj1Var8.f65481l0 = i28;
                        vj1Var8.f65469f0 = f3;
                    } else {
                        i23 = i27;
                        i3 = -1;
                    }
                    if (z2 && (i29 = d83Var.f35123L0) != i3) {
                        f3 = d83Var.f35129R0;
                        i28 = i29;
                    }
                    vj1Var8.f65481l0 = i28;
                    vj1Var8.f65469f0 = f3;
                } else {
                    i23 = i27;
                }
                if (i26 == i23 - 1) {
                    vj1Var8.m23317e(vj1Var8.f65443L, this.f8096g, this.f8100k);
                }
                if (vj1Var7 != null) {
                    bj1 bj1Var12 = vj1Var7.f65443L;
                    bj1Var10.m3757a(bj1Var12, d83Var.f35131T0);
                    if (i26 == i8) {
                        int i30 = this.f8098i;
                        if (bj1Var10.m3764h()) {
                            bj1Var10.f8584h = i30;
                        }
                    }
                    bj1Var12.m3757a(bj1Var10, 0);
                    if (i26 == i24 + 1) {
                        int i31 = this.f8100k;
                        if (bj1Var12.m3764h()) {
                            bj1Var12.f8584h = i31;
                        }
                    }
                }
                if (vj1Var8 != vj1Var4) {
                    int i32 = d83Var.f35132U0;
                    if (z) {
                        if (i32 == 0) {
                            bj1Var11.m3757a(bj1Var8, 0);
                        } else if (i32 == 1) {
                            bj1Var9.m3757a(bj1Var7, 0);
                        } else if (i32 == 2) {
                            bj1Var9.m3757a(bj1Var7, 0);
                            bj1Var11.m3757a(bj1Var8, 0);
                        }
                    } else if (i32 == 0) {
                        bj1Var9.m3757a(bj1Var7, 0);
                    } else if (i32 == 1) {
                        bj1Var11.m3757a(bj1Var8, 0);
                    } else if (i32 == 2) {
                        if (z5) {
                            bj1Var9.m3757a(this.f8093d, this.f8097h);
                            bj1Var11.m3757a(this.f8095f, this.f8099j);
                        } else {
                            bj1Var9.m3757a(bj1Var7, 0);
                            bj1Var11.m3757a(bj1Var8, 0);
                        }
                    }
                }
                vj1Var7 = vj1Var8;
            }
            i26++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m3417c() {
        int i = this.f8090a;
        int i2 = this.f8102m;
        return i == 1 ? i2 - this.f8107r.f35131T0 : i2;
    }

    /* JADX INFO: renamed from: d */
    public final int m3418d() {
        int i = this.f8090a;
        int i2 = this.f8101l;
        return i == 0 ? i2 - this.f8107r.f35130S0 : i2;
    }

    /* JADX INFO: renamed from: e */
    public final void m3419e(int i) {
        d83 d83Var;
        int i2;
        int i3 = this.f8105p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f8104o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            d83Var = this.f8107r;
            if (i6 >= i4 || (i2 = this.f8103n + i6) >= d83Var.f35142e1) {
                break;
            }
            vj1 vj1Var = d83Var.f35141d1[i2];
            if (this.f8090a == 0) {
                if (vj1Var != null) {
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = vj1Var.f65451T;
                    if (constraintWidget$DimensionBehaviourArr[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && vj1Var.f65492r == 0) {
                        d83Var.m11370W(vj1Var, ConstraintWidget$DimensionBehaviour.FIXED, i5, constraintWidget$DimensionBehaviourArr[1], vj1Var.m23322l());
                    }
                }
            } else if (vj1Var != null) {
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = vj1Var.f65451T;
                if (constraintWidget$DimensionBehaviourArr2[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && vj1Var.f65494s == 0) {
                    int i7 = i5;
                    d83Var.m11370W(vj1Var, constraintWidget$DimensionBehaviourArr2[0], vj1Var.m23326r(), ConstraintWidget$DimensionBehaviour.FIXED, i7);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.f8101l = 0;
        this.f8102m = 0;
        this.f8091b = null;
        this.f8092c = 0;
        int i8 = this.f8104o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f8103n + i9;
            if (i10 >= d83Var.f35142e1) {
                return;
            }
            vj1 vj1Var2 = d83Var.f35141d1[i10];
            if (this.f8090a == 0) {
                int iM23326r = vj1Var2.m23326r();
                int i11 = d83Var.f35130S0;
                if (vj1Var2.f65473h0 == 8) {
                    i11 = 0;
                }
                this.f8101l = iM23326r + i11 + this.f8101l;
                int iM10147X = d83Var.m10147X(vj1Var2, this.f8106q);
                if (this.f8091b == null || this.f8092c < iM10147X) {
                    this.f8091b = vj1Var2;
                    this.f8092c = iM10147X;
                    this.f8102m = iM10147X;
                }
            } else {
                int iM10148Y = d83Var.m10148Y(vj1Var2, this.f8106q);
                int iM10147X2 = d83Var.m10147X(vj1Var2, this.f8106q);
                int i12 = d83Var.f35131T0;
                if (vj1Var2.f65473h0 == 8) {
                    i12 = 0;
                }
                this.f8102m = iM10147X2 + i12 + this.f8102m;
                if (this.f8091b == null || this.f8092c < iM10148Y) {
                    this.f8091b = vj1Var2;
                    this.f8092c = iM10148Y;
                    this.f8101l = iM10148Y;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3420f(int i, bj1 bj1Var, bj1 bj1Var2, bj1 bj1Var3, bj1 bj1Var4, int i2, int i3, int i4, int i5, int i6) {
        this.f8090a = i;
        this.f8093d = bj1Var;
        this.f8094e = bj1Var2;
        this.f8095f = bj1Var3;
        this.f8096g = bj1Var4;
        this.f8097h = i2;
        this.f8098i = i3;
        this.f8099j = i4;
        this.f8100k = i5;
        this.f8106q = i6;
    }
}
