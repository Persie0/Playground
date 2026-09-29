package p000;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o5d {
    /* JADX WARN: Code duplicated, block: B:189:0x0297  */
    /* JADX WARN: Code duplicated, block: B:206:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:208:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:210:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:212:0x030f  */
    /* JADX WARN: Code duplicated, block: B:234:0x037c  */
    /* JADX WARN: Code duplicated, block: B:236:0x0398  */
    /* JADX WARN: Code duplicated, block: B:238:0x039d  */
    /* JADX WARN: Code duplicated, block: B:242:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:252:0x042e  */
    /* JADX WARN: Code duplicated, block: B:322:0x0537  */
    /* JADX WARN: Code duplicated, block: B:339:0x057b  */
    /* JADX WARN: Code duplicated, block: B:410:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:413:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:414:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:417:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:418:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:420:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:422:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:425:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:427:0x06d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:437:0x06f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    /* JADX INFO: renamed from: a */
    public static void m17809a(wj1 wj1Var, gd5 gd5Var, ArrayList arrayList, int i) {
        int i2;
        lp0[] lp0VarArr;
        int i3;
        int i4;
        bj1[] bj1VarArr;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        vj1 vj1Var;
        gd5 gd5Var2;
        vj1 vj1Var2;
        rd9 rd9Var;
        bj1 bj1Var;
        rd9 rd9Var2;
        int i6;
        bj1[] bj1VarArr2;
        bj1 bj1Var2;
        bj1 bj1Var3;
        rd9 rd9Var3;
        rd9 rd9Var4;
        vj1 vj1Var3;
        int i7;
        bj1[] bj1VarArr3;
        int i8;
        bj1 bj1Var4;
        bj1 bj1Var5;
        rd9 rd9Var5;
        bj1 bj1Var6;
        rd9 rd9Var6;
        int size;
        ArrayList arrayList2;
        float f2;
        float f3;
        int i9;
        rd9 rd9Var7;
        rd9 rd9Var8;
        rd9 rd9Var9;
        rd9 rd9Var10;
        C3349mv c3349mvM12496l;
        float f4;
        bj1 bj1Var7;
        vj1 vj1Var4;
        int i10;
        int i11;
        int i12;
        vj1 vj1Var5;
        float f5;
        wj1 wj1Var2 = wj1Var;
        if (i == 0) {
            i2 = wj1Var2.f66904C0;
            lp0VarArr = wj1Var2.f66907F0;
            i3 = 0;
        } else {
            i2 = wj1Var2.f66905D0;
            lp0VarArr = wj1Var2.f66906E0;
            i3 = 2;
        }
        int i13 = i2;
        lp0[] lp0VarArr2 = lp0VarArr;
        int i14 = 0;
        while (i14 < i13) {
            lp0 lp0Var = lp0VarArr2[i14];
            boolean z4 = lp0Var.f49970q;
            vj1 vj1Var6 = lp0Var.f49954a;
            bj1[] bj1VarArr4 = vj1Var6.f65448Q;
            int i15 = 8;
            if (z4) {
                i4 = i14;
                bj1VarArr = bj1VarArr4;
                f = 0.0f;
            } else {
                int i16 = lp0Var.f49965l;
                int i17 = i16 * 2;
                vj1 vj1Var7 = vj1Var6;
                vj1 vj1Var8 = vj1Var7;
                boolean z5 = false;
                f = 0.0f;
                while (!z5) {
                    lp0Var.f49962i++;
                    vj1[] vj1VarArr = vj1Var7.f65487o0;
                    bj1[] bj1VarArr5 = vj1Var7.f65448Q;
                    vj1VarArr[i16] = null;
                    vj1Var7.f65485n0[i16] = null;
                    if (vj1Var7.f65473h0 != i15) {
                        vj1Var7.m23321k(i16);
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                        bj1VarArr5[i17].m3761e();
                        int i18 = i17 + 1;
                        bj1VarArr5[i18].m3761e();
                        bj1VarArr5[i17].m3761e();
                        bj1VarArr5[i18].m3761e();
                        if (lp0Var.f49955b == null) {
                            lp0Var.f49955b = vj1Var7;
                        }
                        lp0Var.f49957d = vj1Var7;
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = vj1Var7.f65451T[i16];
                        if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour) {
                            i11 = i14;
                            int i19 = vj1Var7.f65496t[i16];
                            i12 = i16;
                            if (i19 == 0 || i19 == 3 || i19 == 2) {
                                lp0Var.f49963j++;
                                float f6 = vj1Var7.f65483m0[i12];
                                if (f6 > 0.0f) {
                                    f5 = f6;
                                    lp0Var.f49964k += f5;
                                } else {
                                    f5 = f6;
                                }
                                if (vj1Var7.f65473h0 != 8 && constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour && (i19 == 0 || i19 == 3)) {
                                    if (f5 < 0.0f) {
                                        lp0Var.f49967n = true;
                                    } else {
                                        lp0Var.f49968o = true;
                                    }
                                    if (lp0Var.f49961h == null) {
                                        lp0Var.f49961h = new ArrayList();
                                    }
                                    lp0Var.f49961h.add(vj1Var7);
                                }
                                if (lp0Var.f49959f == null) {
                                    lp0Var.f49959f = vj1Var7;
                                }
                                vj1 vj1Var9 = lp0Var.f49960g;
                                if (vj1Var9 != null) {
                                    vj1Var9.f65485n0[i12] = vj1Var7;
                                }
                                lp0Var.f49960g = vj1Var7;
                            }
                            if (i12 == 0) {
                                if (vj1Var7.f65492r == 0 && vj1Var7.f65497u == 0) {
                                    int i20 = vj1Var7.f65498v;
                                }
                            } else if (vj1Var7.f65494s == 0 && vj1Var7.f65500x == 0) {
                                int i21 = vj1Var7.f65501y;
                            }
                        } else {
                            i11 = i14;
                            i12 = i16;
                            bj1VarArr4 = bj1VarArr4;
                        }
                    } else {
                        i11 = i14;
                        i12 = i16;
                        bj1VarArr4 = bj1VarArr4;
                    }
                    if (vj1Var8 != vj1Var7) {
                        vj1Var8.f65487o0[i12] = vj1Var7;
                    }
                    bj1 bj1Var8 = bj1VarArr5[i17 + 1].f8582f;
                    if (bj1Var8 != null) {
                        vj1Var5 = bj1Var8.f8580d;
                        bj1 bj1Var9 = vj1Var5.f65448Q[i17].f8582f;
                        if (bj1Var9 == null || bj1Var9.f8580d != vj1Var7) {
                            vj1Var5 = null;
                        }
                    } else {
                        vj1Var5 = null;
                    }
                    if (vj1Var5 == null) {
                        vj1Var5 = vj1Var7;
                        z5 = true;
                    }
                    vj1Var8 = vj1Var7;
                    i16 = i12;
                    bj1VarArr4 = bj1VarArr4;
                    i15 = 8;
                    vj1Var7 = vj1Var5;
                    i14 = i11;
                }
                i4 = i14;
                int i22 = i16;
                bj1VarArr = bj1VarArr4;
                vj1 vj1Var10 = lp0Var.f49955b;
                if (vj1Var10 != null) {
                    vj1Var10.f65448Q[i17].m3761e();
                }
                vj1 vj1Var11 = lp0Var.f49957d;
                if (vj1Var11 != null) {
                    vj1Var11.f65448Q[i17 + 1].m3761e();
                }
                lp0Var.f49956c = vj1Var7;
                if (i22 == 0 && lp0Var.f49966m) {
                    lp0Var.f49958e = vj1Var7;
                } else {
                    lp0Var.f49958e = vj1Var6;
                }
                lp0Var.f49969p = lp0Var.f49968o && lp0Var.f49967n;
            }
            lp0Var.f49970q = true;
            if (arrayList == 0 || arrayList.contains(vj1Var6)) {
                vj1 vj1Var12 = lp0Var.f49956c;
                vj1 vj1Var13 = lp0Var.f49955b;
                vj1 vj1Var14 = lp0Var.f49957d;
                vj1 vj1Var15 = lp0Var.f49958e;
                float f7 = lp0Var.f49964k;
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = wj1Var2.f65451T;
                bj1[] bj1VarArr6 = wj1Var2.f65448Q;
                boolean z6 = constraintWidget$DimensionBehaviourArr[i] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                if (i == 0) {
                    int i23 = vj1Var15.f65479k0;
                    boolean z7 = i23 == 0;
                    z = i23 == 1;
                    z2 = i23 == 2;
                    z3 = z7;
                } else {
                    int i24 = vj1Var15.f65481l0;
                    boolean z8 = i24 == 0;
                    z = i24 == 1;
                    z2 = i24 == 2;
                    z3 = z8;
                }
                boolean z9 = false;
                while (!z9) {
                    bj1[] bj1VarArr7 = vj1Var6.f65448Q;
                    bj1 bj1Var10 = bj1VarArr7[i3];
                    int i25 = z2 ? 1 : 4;
                    int iM3761e = bj1Var10.m3761e();
                    bj1[] bj1VarArr8 = bj1VarArr6;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = vj1Var6.f65451T[i];
                    boolean z10 = z2;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z11 = constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && vj1Var6.f65496t[i] == 0;
                    bj1 bj1Var11 = bj1Var10.f8582f;
                    if (bj1Var11 != null && vj1Var6 != vj1Var6) {
                        iM3761e = bj1Var11.m3761e() + iM3761e;
                    }
                    int i26 = iM3761e;
                    if (z10 && vj1Var6 != vj1Var6 && vj1Var6 != vj1Var13) {
                        i25 = 8;
                    }
                    vj1 vj1Var16 = vj1Var6;
                    bj1 bj1Var12 = bj1Var10.f8582f;
                    if (bj1Var12 != null) {
                        rd9 rd9Var11 = bj1Var10.f8585i;
                        rd9 rd9Var12 = bj1Var12.f8585i;
                        if (vj1Var6 == vj1Var13) {
                            gd5Var.m12490f(rd9Var11, rd9Var12, i26, 6);
                        } else {
                            gd5Var.m12490f(rd9Var11, rd9Var12, i26, 8);
                        }
                        if (z11 && !z10) {
                            i25 = 5;
                        }
                        gd5Var.m12489e(bj1Var10.f8585i, bj1Var10.f8582f.f8585i, i26, (vj1Var6 == vj1Var13 && z10 && vj1Var6.f65450S[i]) ? 5 : i25);
                    } else {
                        i13 = i13;
                    }
                    if (z6) {
                        if (vj1Var6.f65473h0 == 8 || vj1Var6.f65451T[i] != constraintWidget$DimensionBehaviour4) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            gd5Var.m12490f(bj1VarArr7[i3 + 1].f8585i, bj1VarArr7[i3].f8585i, 0, 5);
                        }
                        gd5Var.m12490f(bj1VarArr7[i3].f8585i, bj1VarArr8[i3].f8585i, i10, 8);
                    }
                    bj1 bj1Var13 = bj1VarArr7[i3 + 1].f8582f;
                    if (bj1Var13 != null) {
                        vj1Var4 = bj1Var13.f8580d;
                        bj1 bj1Var14 = vj1Var4.f65448Q[i3].f8582f;
                        if (bj1Var14 == null || bj1Var14.f8580d != vj1Var6) {
                            vj1Var4 = null;
                        }
                    } else {
                        vj1Var4 = null;
                    }
                    if (vj1Var4 != null) {
                        vj1Var6 = vj1Var4;
                    } else {
                        z9 = true;
                    }
                    vj1Var6 = vj1Var16;
                    bj1VarArr6 = bj1VarArr8;
                    z2 = z10;
                    i13 = i13;
                }
                bj1[] bj1VarArr9 = bj1VarArr6;
                boolean z12 = z2;
                i5 = i13;
                if (vj1Var14 != null) {
                    int i27 = i3 + 1;
                    if (vj1Var12.f65448Q[i27].f8582f != null) {
                        bj1 bj1Var15 = vj1Var14.f65448Q[i27];
                        if (vj1Var14.f65451T[i] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && vj1Var14.f65496t[i] == 0 && !z12) {
                            bj1 bj1Var16 = bj1Var15.f8582f;
                            if (bj1Var16.f8580d == wj1Var2) {
                                gd5Var.m12489e(bj1Var15.f8585i, bj1Var16.f8585i, -bj1Var15.m3761e(), 5);
                            } else if (z12) {
                                bj1Var7 = bj1Var15.f8582f;
                                if (bj1Var7.f8580d == wj1Var2) {
                                    gd5Var.m12489e(bj1Var15.f8585i, bj1Var7.f8585i, -bj1Var15.m3761e(), 4);
                                }
                            }
                        } else if (z12) {
                            bj1Var7 = bj1Var15.f8582f;
                            if (bj1Var7.f8580d == wj1Var2) {
                                gd5Var.m12489e(bj1Var15.f8585i, bj1Var7.f8585i, -bj1Var15.m3761e(), 4);
                            }
                        }
                        gd5Var.m12491g(bj1Var15.f8585i, vj1Var12.f65448Q[i27].f8582f.f8585i, -bj1Var15.m3761e(), 6);
                    }
                }
                if (z6 != 0) {
                    int i28 = i3 + 1;
                    rd9 rd9Var13 = bj1VarArr9[i28].f8585i;
                    bj1 bj1Var17 = vj1Var12.f65448Q[i28];
                    gd5Var.m12490f(rd9Var13, bj1Var17.f8585i, bj1Var17.m3761e(), 8);
                }
                ArrayList arrayList3 = lp0Var.f49961h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (lp0Var.f49967n && !lp0Var.f49969p) {
                        f7 = lp0Var.f49963j;
                    }
                    vj1 vj1Var17 = null;
                    float f8 = f;
                    int i29 = 0;
                    while (i29 < size) {
                        vj1 vj1Var18 = (vj1) arrayList3.get(i29);
                        float[] fArr = vj1Var18.f65483m0;
                        bj1[] bj1VarArr10 = vj1Var18.f65448Q;
                        float f9 = fArr[i];
                        if (f9 >= f) {
                            arrayList2 = arrayList3;
                            if (f9 == f) {
                                gd5Var.m12489e(bj1VarArr10[i3 + 1].f8585i, bj1VarArr10[i3].f8585i, 0, 8);
                                size = size;
                                f3 = f;
                                f8 = f8;
                                i9 = i29;
                            } else {
                                float f10 = f8;
                                if (vj1Var17 != null) {
                                    bj1[] bj1VarArr11 = vj1Var17.f65448Q;
                                    rd9Var7 = bj1VarArr11[i3].f8585i;
                                    int i30 = i3 + 1;
                                    rd9Var8 = bj1VarArr11[i30].f8585i;
                                    rd9Var9 = bj1VarArr10[i3].f8585i;
                                    rd9Var10 = bj1VarArr10[i30].f8585i;
                                    c3349mvM12496l = gd5Var.m12496l();
                                    f4 = f;
                                    c3349mvM12496l.f51871b = f4;
                                    f3 = f4;
                                    if (f7 != f4 || f10 == f9) {
                                        i9 = i29;
                                        f2 = f9;
                                        c3349mvM12496l.f51873d.m9908g(rd9Var7, 1.0f);
                                        c3349mvM12496l.f51873d.m9908g(rd9Var8, -1.0f);
                                        c3349mvM12496l.f51873d.m9908g(rd9Var10, 1.0f);
                                        c3349mvM12496l.f51873d.m9908g(rd9Var9, -1.0f);
                                    } else {
                                        C2904cv c2904cv = c3349mvM12496l.f51873d;
                                        if (f10 == f3) {
                                            i9 = i29;
                                            c2904cv.m9908g(rd9Var7, 1.0f);
                                            c3349mvM12496l.f51873d.m9908g(rd9Var8, -1.0f);
                                            f2 = f9;
                                        } else {
                                            i9 = i29;
                                            f2 = f9;
                                            if (f9 == f) {
                                                c2904cv.m9908g(rd9Var9, 1.0f);
                                                c3349mvM12496l.f51873d.m9908g(rd9Var10, -1.0f);
                                            } else {
                                                float f11 = (f10 / f7) / (f2 / f7);
                                                c2904cv.m9908g(rd9Var7, 1.0f);
                                                c3349mvM12496l.f51873d.m9908g(rd9Var8, -1.0f);
                                                c3349mvM12496l.f51873d.m9908g(rd9Var10, f11);
                                                c3349mvM12496l.f51873d.m9908g(rd9Var9, -f11);
                                            }
                                        }
                                    }
                                    gd5Var.m12487c(c3349mvM12496l);
                                } else {
                                    f2 = f9;
                                    f3 = f;
                                    i9 = i29;
                                }
                                vj1Var17 = vj1Var18;
                                f8 = f2;
                            }
                        } else {
                            if (lp0Var.f49969p) {
                                arrayList2 = arrayList3;
                                gd5Var.m12489e(bj1VarArr10[i3 + 1].f8585i, bj1VarArr10[i3].f8585i, 0, 4);
                            } else {
                                f9 = 1.0f;
                                arrayList2 = arrayList3;
                                if (f9 == f) {
                                    gd5Var.m12489e(bj1VarArr10[i3 + 1].f8585i, bj1VarArr10[i3].f8585i, 0, 8);
                                } else {
                                    float f12 = f8;
                                    if (vj1Var17 != null) {
                                        bj1[] bj1VarArr12 = vj1Var17.f65448Q;
                                        rd9Var7 = bj1VarArr12[i3].f8585i;
                                        int i31 = i3 + 1;
                                        rd9Var8 = bj1VarArr12[i31].f8585i;
                                        rd9Var9 = bj1VarArr10[i3].f8585i;
                                        rd9Var10 = bj1VarArr10[i31].f8585i;
                                        c3349mvM12496l = gd5Var.m12496l();
                                        f4 = f;
                                        c3349mvM12496l.f51871b = f4;
                                        f3 = f4;
                                        if (f7 != f4) {
                                            i9 = i29;
                                            f2 = f9;
                                            c3349mvM12496l.f51873d.m9908g(rd9Var7, 1.0f);
                                            c3349mvM12496l.f51873d.m9908g(rd9Var8, -1.0f);
                                            c3349mvM12496l.f51873d.m9908g(rd9Var10, 1.0f);
                                            c3349mvM12496l.f51873d.m9908g(rd9Var9, -1.0f);
                                        } else {
                                            i9 = i29;
                                            f2 = f9;
                                            c3349mvM12496l.f51873d.m9908g(rd9Var7, 1.0f);
                                            c3349mvM12496l.f51873d.m9908g(rd9Var8, -1.0f);
                                            c3349mvM12496l.f51873d.m9908g(rd9Var10, 1.0f);
                                            c3349mvM12496l.f51873d.m9908g(rd9Var9, -1.0f);
                                        }
                                        gd5Var.m12487c(c3349mvM12496l);
                                    } else {
                                        f2 = f9;
                                        f3 = f;
                                        i9 = i29;
                                    }
                                    vj1Var17 = vj1Var18;
                                    f8 = f2;
                                }
                            }
                            size = size;
                            f3 = f;
                            f8 = f8;
                            i9 = i29;
                        }
                        i29 = i9 + 1;
                        arrayList3 = arrayList2;
                        size = size;
                        f = f3;
                    }
                }
                if (vj1Var13 == null || !(vj1Var13 == vj1Var14 || z12)) {
                    vj1Var = vj1Var14;
                    if (z3 && vj1Var13 != null) {
                        int i32 = lp0Var.f49963j;
                        boolean z13 = i32 > 0 && lp0Var.f49962i == i32;
                        vj1 vj1Var19 = vj1Var13;
                        vj1 vj1Var20 = vj1Var19;
                        while (true) {
                            bj1[] bj1VarArr13 = vj1Var20.f65448Q;
                            if (vj1Var19 == null) {
                                break;
                            }
                            bj1[] bj1VarArr14 = vj1Var19.f65448Q;
                            vj1 vj1Var21 = vj1Var19.f65487o0[i];
                            while (true) {
                                if (vj1Var21 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (vj1Var21.f65473h0 != 8) {
                                    break;
                                } else {
                                    vj1Var21 = vj1Var21.f65487o0[i];
                                }
                            }
                            if (vj1Var21 != null || vj1Var19 == vj1Var) {
                                bj1 bj1Var18 = bj1VarArr14[i3];
                                rd9 rd9Var14 = bj1Var18.f8585i;
                                bj1 bj1Var19 = bj1Var18.f8582f;
                                rd9 rd9Var15 = bj1Var19 != null ? bj1Var19.f8585i : null;
                                if (vj1Var20 != vj1Var19) {
                                    rd9Var15 = bj1VarArr13[i3 + 1].f8585i;
                                } else if (vj1Var19 == vj1Var13) {
                                    bj1 bj1Var20 = bj1VarArr[i3].f8582f;
                                    rd9Var15 = bj1Var20 != null ? bj1Var20.f8585i : null;
                                }
                                int iM3761e2 = bj1Var18.m3761e();
                                int i33 = i3 + 1;
                                int iM3761e3 = bj1VarArr14[i33].m3761e();
                                if (vj1Var21 != null) {
                                    bj1Var2 = vj1Var21.f65448Q[i3];
                                    bj1VarArr2 = bj1VarArr13;
                                    rd9Var4 = bj1Var2.f8585i;
                                } else {
                                    bj1VarArr2 = bj1VarArr13;
                                    bj1Var2 = vj1Var12.f65448Q[i33].f8582f;
                                    if (bj1Var2 != null) {
                                        rd9Var4 = bj1Var2.f8585i;
                                    } else {
                                        bj1Var3 = bj1Var2;
                                        rd9Var3 = null;
                                    }
                                    rd9 rd9Var16 = bj1VarArr14[i33].f8585i;
                                    if (bj1Var3 != null) {
                                        iM3761e3 += bj1Var3.m3761e();
                                    }
                                    int iM3761e4 = bj1VarArr2[i33].m3761e() + iM3761e2;
                                    if (rd9Var14 != null || rd9Var15 == null || rd9Var3 == null || rd9Var16 == null) {
                                        vj1Var3 = vj1Var21;
                                        i7 = 8;
                                    } else {
                                        if (vj1Var19 == vj1Var13) {
                                            iM3761e4 = vj1Var13.f65448Q[i3].m3761e();
                                        }
                                        int i34 = iM3761e4;
                                        if (vj1Var19 == vj1Var) {
                                            iM3761e3 = vj1Var.f65448Q[i33].m3761e();
                                        }
                                        vj1Var3 = vj1Var21;
                                        i7 = 8;
                                        gd5Var.m12486b(rd9Var14, rd9Var15, i34, 0.5f, rd9Var3, rd9Var16, iM3761e3, z13 ? 8 : 5);
                                    }
                                }
                                bj1 bj1Var21 = bj1Var2;
                                rd9Var3 = rd9Var4;
                                bj1Var3 = bj1Var21;
                                rd9 rd9Var17 = bj1VarArr14[i33].f8585i;
                                if (bj1Var3 != null) {
                                    iM3761e3 += bj1Var3.m3761e();
                                }
                                int iM3761e5 = bj1VarArr2[i33].m3761e() + iM3761e2;
                                if (rd9Var14 != null) {
                                    vj1Var3 = vj1Var21;
                                    i7 = 8;
                                } else {
                                    vj1Var3 = vj1Var21;
                                    i7 = 8;
                                }
                            } else {
                                vj1Var3 = vj1Var21;
                                i7 = i6;
                            }
                            if (vj1Var19.f65473h0 != i7) {
                                vj1Var20 = vj1Var19;
                            }
                            vj1Var19 = vj1Var3;
                            vj1Var20 = vj1Var20;
                        }
                    } else {
                        int i35 = 8;
                        if (z && vj1Var13 != null) {
                            int i36 = lp0Var.f49963j;
                            boolean z14 = i36 > 0 && lp0Var.f49962i == i36;
                            vj1 vj1Var22 = vj1Var13;
                            vj1 vj1Var23 = vj1Var22;
                            while (true) {
                                bj1[] bj1VarArr15 = vj1Var22.f65448Q;
                                if (vj1Var23 == null) {
                                    break;
                                }
                                bj1[] bj1VarArr16 = vj1Var23.f65448Q;
                                vj1 vj1Var24 = vj1Var23.f65487o0[i];
                                while (vj1Var24 != null && vj1Var24.f65473h0 == i35) {
                                    vj1Var24 = vj1Var24.f65487o0[i];
                                }
                                if (vj1Var23 == vj1Var13 || vj1Var23 == vj1Var || vj1Var24 == null) {
                                    vj1Var2 = vj1Var22;
                                } else {
                                    if (vj1Var24 == vj1Var) {
                                        vj1Var24 = null;
                                    }
                                    bj1 bj1Var22 = bj1VarArr16[i3];
                                    rd9 rd9Var18 = bj1Var22.f8585i;
                                    int i37 = i3 + 1;
                                    rd9 rd9Var19 = bj1VarArr15[i37].f8585i;
                                    int iM3761e6 = bj1Var22.m3761e();
                                    int iM3761e7 = bj1VarArr16[i37].m3761e();
                                    if (vj1Var24 != null) {
                                        bj1Var = vj1Var24.f65448Q[i3];
                                        rd9Var = bj1Var.f8585i;
                                        vj1Var2 = vj1Var22;
                                        bj1 bj1Var23 = bj1Var.f8582f;
                                        rd9Var2 = bj1Var23 != null ? bj1Var23.f8585i : null;
                                    } else {
                                        vj1Var2 = vj1Var22;
                                        bj1 bj1Var24 = vj1Var.f65448Q[i3];
                                        rd9Var = bj1Var24 != null ? bj1Var24.f8585i : null;
                                        rd9 rd9Var20 = bj1VarArr16[i37].f8585i;
                                        bj1Var = bj1Var24;
                                        rd9Var2 = rd9Var20;
                                    }
                                    if (bj1Var != null) {
                                        iM3761e7 += bj1Var.m3761e();
                                    }
                                    int iM3761e8 = bj1VarArr15[i37].m3761e() + iM3761e6;
                                    int i38 = z14 ? 8 : 4;
                                    if (rd9Var18 != null && rd9Var19 != null && rd9Var != null && rd9Var2 != null) {
                                        gd5Var.m12486b(rd9Var18, rd9Var19, iM3761e8, 0.5f, rd9Var, rd9Var2, iM3761e7, i38);
                                    }
                                    vj1Var24 = vj1Var24;
                                }
                                i35 = 8;
                                if (vj1Var23.f65473h0 != 8) {
                                    vj1Var2 = vj1Var23;
                                }
                                vj1Var23 = vj1Var24;
                                vj1Var22 = vj1Var2;
                            }
                            gd5Var2 = gd5Var;
                            bj1 bj1Var25 = vj1Var13.f65448Q[i3];
                            bj1 bj1Var26 = bj1VarArr[i3].f8582f;
                            int i39 = i3 + 1;
                            bj1 bj1Var27 = vj1Var.f65448Q[i39];
                            bj1 bj1Var28 = vj1Var12.f65448Q[i39].f8582f;
                            if (bj1Var26 != null) {
                                if (vj1Var13 != vj1Var) {
                                    gd5Var2.m12489e(bj1Var25.f8585i, bj1Var26.f8585i, bj1Var25.m3761e(), 5);
                                } else if (bj1Var28 != null) {
                                    gd5Var2.m12486b(bj1Var25.f8585i, bj1Var26.f8585i, bj1Var25.m3761e(), 0.5f, bj1Var27.f8585i, bj1Var28.f8585i, bj1Var27.m3761e(), 5);
                                }
                            }
                            if (bj1Var28 != null && vj1Var13 != vj1Var) {
                                gd5Var2.m12489e(bj1Var27.f8585i, bj1Var28.f8585i, -bj1Var27.m3761e(), 5);
                            }
                        }
                        if ((z3 || z) && vj1Var13 != null && vj1Var13 != vj1Var) {
                            bj1VarArr3 = vj1Var13.f65448Q;
                            bj1 bj1Var29 = bj1VarArr3[i3];
                            if (vj1Var == null) {
                                vj1Var = vj1Var13;
                            }
                            bj1[] bj1VarArr17 = vj1Var.f65448Q;
                            i8 = i3 + 1;
                            bj1Var4 = bj1VarArr17[i8];
                            bj1Var5 = bj1Var29.f8582f;
                            if (bj1Var5 != null) {
                                rd9Var5 = bj1Var5.f8585i;
                            } else {
                                rd9Var5 = null;
                            }
                            bj1Var6 = bj1Var4.f8582f;
                            if (bj1Var6 != null) {
                                rd9Var6 = bj1Var6.f8585i;
                            } else {
                                rd9Var6 = null;
                            }
                            if (vj1Var12 != vj1Var) {
                                bj1 bj1Var30 = vj1Var12.f65448Q[i8].f8582f;
                                rd9Var6 = bj1Var30 != null ? bj1Var30.f8585i : null;
                            }
                            if (vj1Var13 == vj1Var) {
                                bj1Var4 = bj1VarArr3[i8];
                            }
                            if (rd9Var5 == null && rd9Var6 != null) {
                                gd5Var2.m12486b(bj1Var29.f8585i, rd9Var5, bj1Var29.m3761e(), 0.5f, rd9Var6, bj1Var4.f8585i, bj1VarArr17[i8].m3761e(), 5);
                            }
                        }
                    }
                } else {
                    bj1 bj1Var31 = bj1VarArr[i3];
                    int i40 = i3 + 1;
                    bj1 bj1Var32 = vj1Var12.f65448Q[i40];
                    bj1 bj1Var33 = bj1Var31.f8582f;
                    rd9 rd9Var21 = bj1Var33 != null ? bj1Var33.f8585i : null;
                    bj1 bj1Var34 = bj1Var32.f8582f;
                    rd9 rd9Var22 = bj1Var34 != null ? bj1Var34.f8585i : null;
                    bj1 bj1Var35 = vj1Var13.f65448Q[i3];
                    if (vj1Var14 != null) {
                        bj1Var32 = vj1Var14.f65448Q[i40];
                    }
                    if (rd9Var21 == null || rd9Var22 == null) {
                        vj1Var = vj1Var14;
                    } else {
                        float f13 = i == 0 ? vj1Var15.f65467e0 : vj1Var15.f65469f0;
                        int iM3761e9 = bj1Var35.m3761e();
                        int iM3761e10 = bj1Var32.m3761e();
                        rd9 rd9Var23 = bj1Var35.f8585i;
                        rd9 rd9Var24 = bj1Var32.f8585i;
                        rd9 rd9Var25 = rd9Var21;
                        vj1Var = vj1Var14;
                        gd5Var.m12486b(rd9Var23, rd9Var25, iM3761e9, f13, rd9Var22, rd9Var24, iM3761e10, 7);
                    }
                }
                gd5Var2 = gd5Var;
                if (z3) {
                    bj1VarArr3 = vj1Var13.f65448Q;
                    bj1 bj1Var210 = bj1VarArr3[i3];
                    if (vj1Var == null) {
                        vj1Var = vj1Var13;
                    }
                    bj1[] bj1VarArr18 = vj1Var.f65448Q;
                    i8 = i3 + 1;
                    bj1Var4 = bj1VarArr18[i8];
                    bj1Var5 = bj1Var210.f8582f;
                    if (bj1Var5 != null) {
                        rd9Var5 = bj1Var5.f8585i;
                    } else {
                        rd9Var5 = null;
                    }
                    bj1Var6 = bj1Var4.f8582f;
                    if (bj1Var6 != null) {
                        rd9Var6 = bj1Var6.f8585i;
                    } else {
                        rd9Var6 = null;
                    }
                    if (vj1Var12 != vj1Var) {
                        bj1 bj1Var36 = vj1Var12.f65448Q[i8].f8582f;
                        rd9Var6 = bj1Var36 != null ? bj1Var36.f8585i : null;
                    }
                    if (vj1Var13 == vj1Var) {
                        bj1Var4 = bj1VarArr3[i8];
                    }
                    if (rd9Var5 == null) {
                    }
                } else {
                    bj1VarArr3 = vj1Var13.f65448Q;
                    bj1 bj1Var211 = bj1VarArr3[i3];
                    if (vj1Var == null) {
                        vj1Var = vj1Var13;
                    }
                    bj1[] bj1VarArr19 = vj1Var.f65448Q;
                    i8 = i3 + 1;
                    bj1Var4 = bj1VarArr19[i8];
                    bj1Var5 = bj1Var211.f8582f;
                    if (bj1Var5 != null) {
                        rd9Var5 = bj1Var5.f8585i;
                    } else {
                        rd9Var5 = null;
                    }
                    bj1Var6 = bj1Var4.f8582f;
                    if (bj1Var6 != null) {
                        rd9Var6 = bj1Var6.f8585i;
                    } else {
                        rd9Var6 = null;
                    }
                    if (vj1Var12 != vj1Var) {
                        bj1 bj1Var37 = vj1Var12.f65448Q[i8].f8582f;
                        rd9Var6 = bj1Var37 != null ? bj1Var37.f8585i : null;
                    }
                    if (vj1Var13 == vj1Var) {
                        bj1Var4 = bj1VarArr3[i8];
                    }
                    if (rd9Var5 == null) {
                    }
                }
            } else {
                i5 = i13;
            }
            i14 = i4 + 1;
            wj1Var2 = wj1Var;
            i13 = i5;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m17810b(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.getClass();
        builder.setRequiredNetwork(networkRequest);
    }
}
