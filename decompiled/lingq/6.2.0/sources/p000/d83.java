package p000;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d83 extends ewa {

    /* JADX INFO: renamed from: d1 */
    public vj1[] f35141d1;

    /* JADX INFO: renamed from: G0 */
    public int f35118G0 = -1;

    /* JADX INFO: renamed from: H0 */
    public int f35119H0 = -1;

    /* JADX INFO: renamed from: I0 */
    public int f35120I0 = -1;

    /* JADX INFO: renamed from: J0 */
    public int f35121J0 = -1;

    /* JADX INFO: renamed from: K0 */
    public int f35122K0 = -1;

    /* JADX INFO: renamed from: L0 */
    public int f35123L0 = -1;

    /* JADX INFO: renamed from: M0 */
    public float f35124M0 = 0.5f;

    /* JADX INFO: renamed from: N0 */
    public float f35125N0 = 0.5f;

    /* JADX INFO: renamed from: O0 */
    public float f35126O0 = 0.5f;

    /* JADX INFO: renamed from: P0 */
    public float f35127P0 = 0.5f;

    /* JADX INFO: renamed from: Q0 */
    public float f35128Q0 = 0.5f;

    /* JADX INFO: renamed from: R0 */
    public float f35129R0 = 0.5f;

    /* JADX INFO: renamed from: S0 */
    public int f35130S0 = 0;

    /* JADX INFO: renamed from: T0 */
    public int f35131T0 = 0;

    /* JADX INFO: renamed from: U0 */
    public int f35132U0 = 2;

    /* JADX INFO: renamed from: V0 */
    public int f35133V0 = 2;

    /* JADX INFO: renamed from: W0 */
    public int f35134W0 = 0;

    /* JADX INFO: renamed from: X0 */
    public int f35135X0 = -1;

    /* JADX INFO: renamed from: Y0 */
    public int f35136Y0 = 0;

    /* JADX INFO: renamed from: Z0 */
    public final ArrayList f35137Z0 = new ArrayList();

    /* JADX INFO: renamed from: a1 */
    public vj1[] f35138a1 = null;

    /* JADX INFO: renamed from: b1 */
    public vj1[] f35139b1 = null;

    /* JADX INFO: renamed from: c1 */
    public int[] f35140c1 = null;

    /* JADX INFO: renamed from: e1 */
    public int f35142e1 = 0;

    /* JADX WARN: Code duplicated, block: B:73:0x0102  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ewa
    /* JADX INFO: renamed from: V */
    public final void mo10146V(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        b83 b83Var;
        char c;
        int i10;
        int i11;
        int i12;
        int iCeil;
        Object obj;
        vj1 vj1Var;
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.f54931u0 > 0) {
            vj1 vj1Var2 = this.f65452U;
            ij1 ij1Var = vj1Var2 != null ? ((wj1) vj1Var2).f66921x0 : null;
            if (ij1Var == null) {
                this.f38001C0 = 0;
                this.f38002D0 = 0;
                this.f38000B0 = false;
                return;
            }
            for (int i17 = 0; i17 < this.f54931u0; i17++) {
                vj1 vj1Var3 = this.f54930t0[i17];
                if (vj1Var3 != null && !(vj1Var3 instanceof gq3)) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM23321k = vj1Var3.m23321k(0);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM23321k2 = vj1Var3.m23321k(1);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    if (constraintWidget$DimensionBehaviourM23321k != constraintWidget$DimensionBehaviour || vj1Var3.f65492r == 1 || constraintWidget$DimensionBehaviourM23321k2 != constraintWidget$DimensionBehaviour || vj1Var3.f65494s == 1) {
                        if (constraintWidget$DimensionBehaviourM23321k == constraintWidget$DimensionBehaviour) {
                            constraintWidget$DimensionBehaviourM23321k = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                        }
                        if (constraintWidget$DimensionBehaviourM23321k2 == constraintWidget$DimensionBehaviour) {
                            constraintWidget$DimensionBehaviourM23321k2 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                        }
                        ua0 ua0Var = this.f38003E0;
                        ua0Var.f63626a = constraintWidget$DimensionBehaviourM23321k;
                        ua0Var.f63627b = constraintWidget$DimensionBehaviourM23321k2;
                        ua0Var.f63628c = vj1Var3.m23326r();
                        ua0Var.f63629d = vj1Var3.m23322l();
                        ij1Var.m13942b(vj1Var3, ua0Var);
                        vj1Var3.m23313P(ua0Var.f63630e);
                        vj1Var3.m23310M(ua0Var.f63631f);
                        vj1Var3.m23307J(ua0Var.f63632g);
                    }
                }
            }
        }
        int i18 = this.f38009z0;
        int i19 = this.f37999A0;
        int i20 = this.f38005v0;
        int i21 = this.f38006w0;
        int[] iArr2 = new int[2];
        int i22 = (i2 - i18) - i19;
        int i23 = this.f35136Y0;
        if (i23 == 1) {
            i22 = (i4 - i20) - i21;
        }
        int i24 = i22;
        int i25 = this.f35118G0;
        if (i23 == 0) {
            if (i25 == -1) {
                this.f35118G0 = 0;
            }
            if (this.f35119H0 == -1) {
                this.f35119H0 = 0;
            }
        } else {
            if (i25 == -1) {
                this.f35118G0 = 0;
            }
            if (this.f35119H0 == -1) {
                this.f35119H0 = 0;
            }
        }
        vj1[] vj1VarArr = this.f54930t0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            i5 = this.f54931u0;
            if (i26 >= i5) {
                break;
            }
            if (this.f54930t0[i26].f65473h0 == 8) {
                i27++;
            }
            i26++;
        }
        if (i27 > 0) {
            vj1VarArr = new vj1[i5 - i27];
            int i29 = 0;
            for (int i30 = 0; i30 < this.f54931u0; i30++) {
                vj1 vj1Var4 = this.f54930t0[i30];
                if (vj1Var4.f65473h0 != 8) {
                    vj1VarArr[i29] = vj1Var4;
                    i29++;
                }
            }
            i5 = i29;
        }
        vj1[] vj1VarArr2 = vj1VarArr;
        this.f35141d1 = vj1VarArr2;
        this.f35142e1 = i5;
        int i31 = this.f35134W0;
        ArrayList arrayList = this.f35137Z0;
        if (i31 != 0) {
            bj1 bj1Var = this.f65441J;
            bj1 bj1Var2 = this.f65440I;
            i8 = i18;
            bj1 bj1Var3 = this.f65442K;
            bj1 bj1Var4 = this.f65443L;
            if (i31 == 1) {
                i7 = i21;
                iArr = iArr2;
                i9 = i19;
                i6 = i20;
                int i32 = this.f35136Y0;
                if (i5 != 0) {
                    arrayList.clear();
                    b83 b83Var2 = new b83(this, i32, this.f65440I, this.f65441J, this.f65442K, this.f65443L, i24);
                    arrayList.add(b83Var2);
                    if (i32 == 0) {
                        i10 = 0;
                        int i33 = 0;
                        int i34 = 0;
                        while (i34 < i5) {
                            vj1 vj1Var5 = vj1VarArr2[i34];
                            int iM10148Y = m10148Y(vj1Var5, i24);
                            if (vj1Var5.f65451T[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                                i10++;
                            }
                            int i35 = i10;
                            boolean z = (i33 == i24 || (this.f35130S0 + i33) + iM10148Y > i24) && b83Var2.f8091b != null;
                            if (!z && i34 > 0 && (i12 = this.f35135X0) > 0 && i34 % i12 == 0) {
                                z = true;
                            }
                            if (z) {
                                b83Var2 = new b83(this, i32, this.f65440I, this.f65441J, this.f65442K, this.f65443L, i24);
                                b83Var2.f8103n = i34;
                                arrayList.add(b83Var2);
                            } else {
                                if (i34 > 0) {
                                    i33 = this.f35130S0 + iM10148Y + i33;
                                }
                                b83Var2.m3415a(vj1Var5);
                                i34++;
                                i10 = i35;
                            }
                            i33 = iM10148Y;
                            b83Var2.m3415a(vj1Var5);
                            i34++;
                            i10 = i35;
                        }
                    } else {
                        i10 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (i37 < i5) {
                            vj1 vj1Var6 = vj1VarArr2[i37];
                            int iM10147X = m10147X(vj1Var6, i24);
                            if (vj1Var6.f65451T[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                                i10++;
                            }
                            int i38 = i10;
                            boolean z2 = (i36 == i24 || (this.f35131T0 + i36) + iM10147X > i24) && b83Var2.f8091b != null;
                            if (!z2 && i37 > 0 && (i11 = this.f35135X0) > 0 && i37 % i11 == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                b83Var2 = new b83(this, i32, this.f65440I, this.f65441J, this.f65442K, this.f65443L, i24);
                                b83Var2.f8103n = i37;
                                arrayList.add(b83Var2);
                            } else {
                                if (i37 > 0) {
                                    i36 = this.f35131T0 + iM10147X + i36;
                                }
                                b83Var2.m3415a(vj1Var6);
                                i37++;
                                i10 = i38;
                            }
                            i36 = iM10147X;
                            b83Var2.m3415a(vj1Var6);
                            i37++;
                            i10 = i38;
                        }
                    }
                    int size = arrayList.size();
                    int i39 = this.f38009z0;
                    int i40 = this.f38005v0;
                    int i41 = this.f37999A0;
                    int i42 = this.f38006w0;
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = this.f65451T;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[0];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    boolean z3 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3 || constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour3;
                    if (i10 > 0 && z3) {
                        for (int i43 = 0; i43 < size; i43++) {
                            b83 b83Var3 = (b83) arrayList.get(i43);
                            if (i32 == 0) {
                                b83Var3.m3419e(i24 - b83Var3.m3418d());
                            } else {
                                b83Var3.m3419e(i24 - b83Var3.m3417c());
                            }
                        }
                    }
                    int i44 = i39;
                    int i45 = i40;
                    int i46 = i41;
                    int i47 = i42;
                    bj1 bj1Var5 = bj1Var2;
                    bj1 bj1Var6 = bj1Var;
                    int iMax = 0;
                    int i48 = 0;
                    bj1 bj1Var7 = bj1Var3;
                    bj1 bj1Var8 = bj1Var4;
                    for (int i49 = 0; i49 < size; i49++) {
                        b83 b83Var4 = (b83) arrayList.get(i49);
                        if (i32 == 0) {
                            if (i49 < size - 1) {
                                bj1Var8 = ((b83) arrayList.get(i49 + 1)).f8091b.f65441J;
                                i47 = 0;
                            } else {
                                i47 = this.f38006w0;
                                bj1Var8 = bj1Var4;
                            }
                            bj1 bj1Var9 = b83Var4.f8091b.f65443L;
                            b83Var4.m3420f(i32, bj1Var5, bj1Var6, bj1Var7, bj1Var8, i44, i45, i46, i47, i24);
                            iMax = Math.max(iMax, b83Var4.m3418d());
                            int iM3417c = b83Var4.m3417c() + i48;
                            if (i49 > 0) {
                                iM3417c += this.f35131T0;
                            }
                            i48 = iM3417c;
                            bj1Var6 = bj1Var9;
                            i45 = 0;
                        } else {
                            if (i49 < size - 1) {
                                bj1Var7 = ((b83) arrayList.get(i49 + 1)).f8091b.f65440I;
                                i46 = 0;
                            } else {
                                i46 = this.f37999A0;
                                bj1Var7 = bj1Var3;
                            }
                            bj1 bj1Var10 = b83Var4.f8091b.f65442K;
                            b83Var4.m3420f(i32, bj1Var5, bj1Var6, bj1Var7, bj1Var8, i44, i45, i46, i47, i24);
                            int iM3418d = b83Var4.m3418d() + iMax;
                            int iMax2 = Math.max(i48, b83Var4.m3417c());
                            if (i49 > 0) {
                                iM3418d += this.f35130S0;
                            }
                            i48 = iMax2;
                            iMax = iM3418d;
                            bj1Var5 = bj1Var10;
                            i44 = 0;
                        }
                    }
                    iArr[0] = iMax;
                    iArr[1] = i48;
                }
            } else if (i31 == 2) {
                i7 = i21;
                iArr = iArr2;
                i9 = i19;
                i6 = i20;
                int i50 = this.f35136Y0;
                int iCeil2 = this.f35135X0;
                if (i50 == 0) {
                    if (iCeil2 <= 0) {
                        int i51 = 0;
                        iCeil = 0;
                        for (int i52 = 0; i52 < i5; i52++) {
                            if (i52 > 0) {
                                i51 += this.f35130S0;
                            }
                            vj1 vj1Var7 = vj1VarArr2[i52];
                            if (vj1Var7 != null) {
                                int iM10148Y2 = m10148Y(vj1Var7, i24) + i51;
                                if (iM10148Y2 > i24) {
                                    break;
                                }
                                iCeil++;
                                i51 = iM10148Y2;
                            }
                        }
                    } else {
                        iCeil = iCeil2;
                    }
                    iCeil2 = 0;
                } else {
                    if (iCeil2 <= 0) {
                        int i53 = 0;
                        int i54 = 0;
                        for (int i55 = 0; i55 < i5; i55++) {
                            if (i55 > 0) {
                                i53 += this.f35131T0;
                            }
                            vj1 vj1Var8 = vj1VarArr2[i55];
                            if (vj1Var8 != null) {
                                int iM10147X2 = m10147X(vj1Var8, i24) + i53;
                                if (iM10147X2 > i24) {
                                    break;
                                }
                                i54++;
                                i53 = iM10147X2;
                            }
                        }
                        iCeil2 = i54;
                    }
                    iCeil = 0;
                }
                if (this.f35140c1 == null) {
                    this.f35140c1 = new int[2];
                }
                boolean z4 = (iCeil2 == 0 && i50 == 1) || (iCeil == 0 && i50 == 0);
                while (!z4) {
                    if (i50 == 0) {
                        iCeil2 = (int) Math.ceil(i5 / iCeil);
                    } else {
                        iCeil = (int) Math.ceil(i5 / iCeil2);
                    }
                    vj1[] vj1VarArr3 = this.f35139b1;
                    if (vj1VarArr3 == null || vj1VarArr3.length < iCeil) {
                        obj = null;
                        this.f35139b1 = new vj1[iCeil];
                    } else {
                        obj = null;
                        Arrays.fill(vj1VarArr3, (Object) null);
                    }
                    vj1[] vj1VarArr4 = this.f35138a1;
                    if (vj1VarArr4 == null || vj1VarArr4.length < iCeil2) {
                        this.f35138a1 = new vj1[iCeil2];
                    } else {
                        Arrays.fill(vj1VarArr4, obj);
                    }
                    for (int i56 = 0; i56 < iCeil; i56++) {
                        for (int i57 = 0; i57 < iCeil2; i57++) {
                            int i58 = (i57 * iCeil) + i56;
                            if (i50 == 1) {
                                i58 = (i56 * iCeil2) + i57;
                            }
                            if (i58 < vj1VarArr2.length && (vj1Var = vj1VarArr2[i58]) != null) {
                                int iM10148Y3 = m10148Y(vj1Var, i24);
                                vj1 vj1Var9 = this.f35139b1[i56];
                                if (vj1Var9 == null || vj1Var9.m23326r() < iM10148Y3) {
                                    this.f35139b1[i56] = vj1Var;
                                }
                                int iM10147X3 = m10147X(vj1Var, i24);
                                vj1 vj1Var10 = this.f35138a1[i57];
                                if (vj1Var10 == null || vj1Var10.m23322l() < iM10147X3) {
                                    this.f35138a1[i57] = vj1Var;
                                }
                            }
                        }
                    }
                    int iM10148Y4 = 0;
                    for (int i59 = 0; i59 < iCeil; i59++) {
                        vj1 vj1Var11 = this.f35139b1[i59];
                        if (vj1Var11 != null) {
                            if (i59 > 0) {
                                iM10148Y4 += this.f35130S0;
                            }
                            iM10148Y4 = m10148Y(vj1Var11, i24) + iM10148Y4;
                        }
                    }
                    int iM10147X4 = 0;
                    for (int i60 = 0; i60 < iCeil2; i60++) {
                        vj1 vj1Var12 = this.f35138a1[i60];
                        if (vj1Var12 != null) {
                            if (i60 > 0) {
                                iM10147X4 += this.f35131T0;
                            }
                            iM10147X4 = m10147X(vj1Var12, i24) + iM10147X4;
                        }
                    }
                    iArr[0] = iM10148Y4;
                    iArr[1] = iM10147X4;
                    if (i50 == 0) {
                        if (iM10148Y4 <= i24 || iCeil <= 1) {
                            z4 = true;
                        } else {
                            iCeil--;
                        }
                    } else if (iM10147X4 <= i24 || iCeil2 <= 1) {
                        z4 = true;
                    } else {
                        iCeil2--;
                    }
                }
                int[] iArr3 = this.f35140c1;
                iArr3[0] = iCeil;
                iArr3[1] = iCeil2;
                c = 1;
            } else if (i31 != 3) {
                i7 = i21;
                iArr = iArr2;
                i9 = i19;
                i6 = i20;
            } else {
                int i61 = this.f35136Y0;
                if (i5 == 0) {
                    i7 = i21;
                    iArr = iArr2;
                    i9 = i19;
                    i6 = i20;
                } else {
                    arrayList.clear();
                    iArr = iArr2;
                    i6 = i20;
                    i7 = i21;
                    b83 b83Var5 = new b83(this, i61, this.f65440I, this.f65441J, this.f65442K, this.f65443L, i24);
                    arrayList.add(b83Var5);
                    if (i61 == 0) {
                        int i62 = 0;
                        int i63 = 0;
                        i13 = 0;
                        int i64 = 0;
                        while (i62 < i5) {
                            i63++;
                            int i65 = i19;
                            vj1 vj1Var13 = vj1VarArr2[i62];
                            int iM10148Y5 = m10148Y(vj1Var13, i24);
                            int i66 = i61;
                            int i67 = i62;
                            if (vj1Var13.f65451T[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                                i13++;
                            }
                            int i68 = i13;
                            boolean z5 = (i64 == i24 || (this.f35130S0 + i64) + iM10148Y5 > i24) && b83Var5.f8091b != null;
                            if (!z5 && i67 > 0 && (i16 = this.f35135X0) > 0 && i63 > i16) {
                                z5 = true;
                            }
                            if (z5) {
                                i61 = i66;
                                i15 = i67;
                                b83Var5 = new b83(this, i61, this.f65440I, this.f65441J, this.f65442K, this.f65443L, i24);
                                b83Var5.f8103n = i15;
                                arrayList.add(b83Var5);
                                i64 = iM10148Y5;
                                i63 = 1;
                            } else {
                                i61 = i66;
                                i15 = i67;
                                i64 = i15 > 0 ? this.f35130S0 + iM10148Y5 + i64 : iM10148Y5;
                            }
                            b83Var5.m3415a(vj1Var13);
                            i62 = i15 + 1;
                            i13 = i68;
                            i19 = i65;
                        }
                        i9 = i19;
                    } else {
                        i9 = i19;
                        int i69 = 0;
                        int i70 = 0;
                        int i71 = 0;
                        int i72 = 0;
                        while (i72 < i5) {
                            i69++;
                            vj1 vj1Var14 = vj1VarArr2[i72];
                            int iM10147X5 = m10147X(vj1Var14, i24);
                            int i73 = i61;
                            if (vj1Var14.f65451T[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                                i70++;
                            }
                            int i74 = i70;
                            boolean z6 = (i71 == i24 || (this.f35131T0 + i71) + iM10147X5 > i24) && b83Var5.f8091b != null;
                            if (!z6 && i72 > 0 && (i14 = this.f35135X0) > 0 && i69 > i14) {
                                z6 = true;
                            }
                            if (z6) {
                                i61 = i73;
                                b83Var5 = new b83(this, i61, this.f65440I, this.f65441J, this.f65442K, this.f65443L, i24);
                                b83Var5.f8103n = i72;
                                arrayList.add(b83Var5);
                                i71 = iM10147X5;
                                i69 = 1;
                            } else {
                                i61 = i73;
                                i71 = i72 > 0 ? this.f35131T0 + iM10147X5 + i71 : iM10147X5;
                            }
                            b83Var5.m3415a(vj1Var14);
                            i72++;
                            i70 = i74;
                        }
                        i13 = i70;
                    }
                    int size2 = arrayList.size();
                    int i75 = this.f38009z0;
                    int i76 = this.f38005v0;
                    int i77 = this.f37999A0;
                    int i78 = this.f38006w0;
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = this.f65451T;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviourArr2[0];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    boolean z7 = constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour5 || constraintWidget$DimensionBehaviourArr2[1] == constraintWidget$DimensionBehaviour5;
                    if (i13 > 0 && z7) {
                        for (int i79 = 0; i79 < size2; i79++) {
                            b83 b83Var6 = (b83) arrayList.get(i79);
                            if (i61 == 0) {
                                b83Var6.m3419e(i24 - b83Var6.m3418d());
                            } else {
                                b83Var6.m3419e(i24 - b83Var6.m3417c());
                            }
                        }
                    }
                    int i80 = i75;
                    int i81 = i76;
                    int i82 = i77;
                    int i83 = i78;
                    bj1 bj1Var11 = bj1Var2;
                    bj1 bj1Var12 = bj1Var;
                    int iMax3 = 0;
                    int i84 = 0;
                    bj1 bj1Var13 = bj1Var3;
                    bj1 bj1Var14 = bj1Var4;
                    for (int i85 = 0; i85 < size2; i85++) {
                        b83 b83Var7 = (b83) arrayList.get(i85);
                        if (i61 == 0) {
                            if (i85 < size2 - 1) {
                                bj1Var14 = ((b83) arrayList.get(i85 + 1)).f8091b.f65441J;
                                i83 = 0;
                            } else {
                                i83 = this.f38006w0;
                                bj1Var14 = bj1Var4;
                            }
                            bj1 bj1Var15 = b83Var7.f8091b.f65443L;
                            b83Var7.m3420f(i61, bj1Var11, bj1Var12, bj1Var13, bj1Var14, i80, i81, i82, i83, i24);
                            iMax3 = Math.max(iMax3, b83Var7.m3418d());
                            int iM3417c2 = b83Var7.m3417c() + i84;
                            if (i85 > 0) {
                                iM3417c2 += this.f35131T0;
                            }
                            i84 = iM3417c2;
                            bj1Var12 = bj1Var15;
                            i81 = 0;
                        } else {
                            if (i85 < size2 - 1) {
                                bj1Var13 = ((b83) arrayList.get(i85 + 1)).f8091b.f65440I;
                                i82 = 0;
                            } else {
                                i82 = this.f37999A0;
                                bj1Var13 = bj1Var3;
                            }
                            bj1 bj1Var16 = b83Var7.f8091b.f65442K;
                            b83Var7.m3420f(i61, bj1Var11, bj1Var12, bj1Var13, bj1Var14, i80, i81, i82, i83, i24);
                            int iM3418d2 = b83Var7.m3418d() + iMax3;
                            int iMax4 = Math.max(i84, b83Var7.m3417c());
                            if (i85 > 0) {
                                iM3418d2 += this.f35130S0;
                            }
                            i84 = iMax4;
                            iMax3 = iM3418d2;
                            bj1Var11 = bj1Var16;
                            i80 = 0;
                        }
                    }
                    iArr[0] = iMax3;
                    iArr[1] = i84;
                }
            }
            c = 1;
        } else {
            i6 = i20;
            i7 = i21;
            iArr = iArr2;
            i8 = i18;
            i9 = i19;
            int i86 = this.f35136Y0;
            if (i5 == 0) {
                c = 1;
            } else {
                if (arrayList.size() == 0) {
                    b83Var = new b83(this, i86, this.f65440I, this.f65441J, this.f65442K, this.f65443L, i24);
                    arrayList.add(b83Var);
                } else {
                    b83 b83Var8 = (b83) arrayList.get(0);
                    b83Var8.f8092c = 0;
                    b83Var8.f8091b = null;
                    b83Var8.f8101l = 0;
                    b83Var8.f8102m = 0;
                    b83Var8.f8103n = 0;
                    b83Var8.f8104o = 0;
                    b83Var8.f8105p = 0;
                    b83Var8.m3420f(i86, this.f65440I, this.f65441J, this.f65442K, this.f65443L, this.f38009z0, this.f38005v0, this.f37999A0, this.f38006w0, i24);
                    b83Var = b83Var8;
                }
                for (int i87 = 0; i87 < i5; i87++) {
                    b83Var.m3415a(vj1VarArr2[i87]);
                }
                i28 = 0;
                iArr[0] = b83Var.m3418d();
                c = 1;
                iArr[1] = b83Var.m3417c();
            }
        }
        int iMin = iArr[i28] + i8 + i9;
        int iMin2 = iArr[c] + i6 + i7;
        if (i == 1073741824) {
            iMin = i2;
        } else if (i == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i2);
        } else if (i != 0) {
            iMin = i28;
        }
        if (i3 == 1073741824) {
            iMin2 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i3 != 0) {
            iMin2 = i28;
        }
        this.f38001C0 = iMin;
        this.f38002D0 = iMin2;
        m23313P(iMin);
        m23310M(iMin2);
        this.f38000B0 = this.f54931u0 > 0 ? c : i28;
    }

    /* JADX INFO: renamed from: X */
    public final int m10147X(vj1 vj1Var, int i) {
        vj1 vj1Var2;
        if (vj1Var == null) {
            return 0;
        }
        if (vj1Var.f65451T[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = vj1Var.f65494s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (vj1Var.f65502z * i);
                if (i3 != vj1Var.m23322l()) {
                    vj1Var.f65470g = true;
                    m11370W(vj1Var, vj1Var.f65451T[0], vj1Var.m23326r(), ConstraintWidget$DimensionBehaviour.FIXED, i3);
                }
                return i3;
            }
            vj1Var2 = vj1Var;
            if (i2 == 1) {
                return vj1Var2.m23322l();
            }
            if (i2 == 3) {
                return (int) ((vj1Var2.m23326r() * vj1Var2.f65455X) + 0.5f);
            }
        } else {
            vj1Var2 = vj1Var;
        }
        return vj1Var2.m23322l();
    }

    /* JADX INFO: renamed from: Y */
    public final int m10148Y(vj1 vj1Var, int i) {
        vj1 vj1Var2;
        if (vj1Var == null) {
            return 0;
        }
        if (vj1Var.f65451T[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = vj1Var.f65492r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (vj1Var.f65499w * i);
                if (i3 != vj1Var.m23326r()) {
                    vj1Var.f65470g = true;
                    m11370W(vj1Var, ConstraintWidget$DimensionBehaviour.FIXED, i3, vj1Var.f65451T[1], vj1Var.m23322l());
                }
                return i3;
            }
            vj1Var2 = vj1Var;
            if (i2 == 1) {
                return vj1Var2.m23326r();
            }
            if (i2 == 3) {
                return (int) ((vj1Var2.m23322l() * vj1Var2.f65455X) + 0.5f);
            }
        } else {
            vj1Var2 = vj1Var;
        }
        return vj1Var2.m23326r();
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: b */
    public final void mo10149b(gd5 gd5Var, boolean z) {
        vj1 vj1Var;
        float f;
        int i;
        super.mo10149b(gd5Var, z);
        vj1 vj1Var2 = this.f65452U;
        boolean z2 = vj1Var2 != null && ((wj1) vj1Var2).f66922y0;
        int i2 = this.f35134W0;
        ArrayList arrayList = this.f35137Z0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((b83) arrayList.get(i3)).m3416b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((b83) arrayList.get(i4)).m3416b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f35140c1 != null && this.f35139b1 != null && this.f35138a1 != null) {
                for (int i5 = 0; i5 < this.f35142e1; i5++) {
                    this.f35141d1[i5].m23304E();
                }
                int[] iArr = this.f35140c1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.f35124M0;
                vj1 vj1Var3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.f35124M0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    vj1 vj1Var4 = this.f35139b1[i];
                    if (vj1Var4 != null) {
                        bj1 bj1Var = vj1Var4.f65440I;
                        if (vj1Var4.f65473h0 != 8) {
                            if (i8 == 0) {
                                vj1Var4.m23317e(bj1Var, this.f65440I, this.f38009z0);
                                vj1Var4.f65479k0 = this.f35118G0;
                                vj1Var4.f65467e0 = f;
                            }
                            if (i8 == i6 - 1) {
                                vj1Var4.m23317e(vj1Var4.f65442K, this.f65442K, this.f37999A0);
                            }
                            if (i8 > 0 && vj1Var3 != null) {
                                bj1 bj1Var2 = vj1Var3.f65442K;
                                vj1Var4.m23317e(bj1Var, bj1Var2, this.f35130S0);
                                vj1Var3.m23317e(bj1Var2, bj1Var, 0);
                            }
                            vj1Var3 = vj1Var4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    vj1 vj1Var5 = this.f35138a1[i9];
                    if (vj1Var5 != null) {
                        bj1 bj1Var3 = vj1Var5.f65441J;
                        if (vj1Var5.f65473h0 != 8) {
                            if (i9 == 0) {
                                vj1Var5.m23317e(bj1Var3, this.f65441J, this.f38005v0);
                                vj1Var5.f65481l0 = this.f35119H0;
                                vj1Var5.f65469f0 = this.f35125N0;
                            }
                            if (i9 == i7 - 1) {
                                vj1Var5.m23317e(vj1Var5.f65443L, this.f65443L, this.f38006w0);
                            }
                            if (i9 > 0 && vj1Var3 != null) {
                                bj1 bj1Var4 = vj1Var3.f65443L;
                                vj1Var5.m23317e(bj1Var3, bj1Var4, this.f35131T0);
                                vj1Var3.m23317e(bj1Var4, bj1Var3, 0);
                            }
                            vj1Var3 = vj1Var5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.f35136Y0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        vj1[] vj1VarArr = this.f35141d1;
                        if (i12 < vj1VarArr.length && (vj1Var = vj1VarArr[i12]) != null && vj1Var.f65473h0 != 8) {
                            vj1 vj1Var6 = this.f35139b1[i10];
                            vj1 vj1Var7 = this.f35138a1[i11];
                            if (vj1Var != vj1Var6) {
                                vj1Var.m23317e(vj1Var.f65440I, vj1Var6.f65440I, 0);
                                vj1Var.m23317e(vj1Var.f65442K, vj1Var6.f65442K, 0);
                            }
                            if (vj1Var != vj1Var7) {
                                vj1Var.m23317e(vj1Var.f65441J, vj1Var7.f65441J, 0);
                                vj1Var.m23317e(vj1Var.f65443L, vj1Var7.f65443L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((b83) arrayList.get(0)).m3416b(0, z2, true);
        }
        this.f38000B0 = false;
    }

    @Override // p000.os3, p000.vj1
    /* JADX INFO: renamed from: g */
    public final void mo10150g(vj1 vj1Var, HashMap map) {
        super.mo10150g(vj1Var, map);
        d83 d83Var = (d83) vj1Var;
        this.f35118G0 = d83Var.f35118G0;
        this.f35119H0 = d83Var.f35119H0;
        this.f35120I0 = d83Var.f35120I0;
        this.f35121J0 = d83Var.f35121J0;
        this.f35122K0 = d83Var.f35122K0;
        this.f35123L0 = d83Var.f35123L0;
        this.f35124M0 = d83Var.f35124M0;
        this.f35125N0 = d83Var.f35125N0;
        this.f35126O0 = d83Var.f35126O0;
        this.f35127P0 = d83Var.f35127P0;
        this.f35128Q0 = d83Var.f35128Q0;
        this.f35129R0 = d83Var.f35129R0;
        this.f35130S0 = d83Var.f35130S0;
        this.f35131T0 = d83Var.f35131T0;
        this.f35132U0 = d83Var.f35132U0;
        this.f35133V0 = d83Var.f35133V0;
        this.f35134W0 = d83Var.f35134W0;
        this.f35135X0 = d83Var.f35135X0;
        this.f35136Y0 = d83Var.f35136Y0;
    }
}
