package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class phc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f56226a = new C0282a(-1168429128, false, new yd1(19));

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX INFO: renamed from: a */
    public static ArrayList m19146a(k47 k47Var) {
        char c;
        ArrayList arrayList;
        boolean z;
        int i;
        Object nn7Var;
        k47 k47Var2 = k47Var;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (k47Var2.m14842z() == 0) {
            char c2 = 7;
            k47Var2.m14819N(7);
            int iM14829m = k47Var2.m14829m();
            boolean z2 = true;
            if (iM14829m == 1684433976) {
                k47 k47Var3 = new k47();
                Inflater inflater = new Inflater(true);
                try {
                    if (!uma.m22827v(k47Var2, k47Var3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    k47Var2 = k47Var3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iM14829m == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i2 = k47Var2.f46701b;
            int i3 = k47Var2.f46702c;
            while (i2 < i3) {
                int iM14829m2 = k47Var2.m14829m() + i2;
                if (iM14829m2 > i2 && iM14829m2 <= i3) {
                    if (k47Var2.m14829m() == 1835365224) {
                        int iM14829m3 = k47Var2.m14829m();
                        if (iM14829m3 > 10000) {
                            c = c2;
                            ArrayList arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z = z2;
                            i = i3;
                            nn7Var = arrayList4;
                        } else {
                            float[] fArr = new float[iM14829m3];
                            for (int i4 = 0; i4 < iM14829m3; i4++) {
                                fArr[i4] = Float.intBitsToFloat(k47Var2.m14829m());
                            }
                            int iM14829m4 = k47Var2.m14829m();
                            if (iM14829m4 > 32000) {
                                c = c2;
                                ArrayList arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                z = z2;
                                i = i3;
                                nn7Var = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                c = c2;
                                ArrayList arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iM14829m3) * 2.0d) / dLog);
                                z = z2;
                                byte[] bArr = k47Var2.f46700a;
                                so0 so0Var = new so0(bArr.length, bArr);
                                so0Var.m21509m(k47Var2.f46701b * 8);
                                float[] fArr2 = new float[iM14829m4 * 5];
                                int i5 = 5;
                                int[] iArr = new int[5];
                                ArrayList arrayList7 = arrayList6;
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i6 < iM14829m4) {
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 < i5) {
                                                int i9 = iArr[i8];
                                                int iM21503g = so0Var.m21503g(iCeil);
                                                int i10 = ((iM21503g >> 1) ^ (-(iM21503g & 1))) + i9;
                                                if (i10 < iM14829m3 && i10 >= 0) {
                                                    fArr2[i7] = fArr[i10];
                                                    iArr[i8] = i10;
                                                    i8++;
                                                    i7++;
                                                    i5 = 5;
                                                }
                                            } else {
                                                i6++;
                                                i5 = 5;
                                            }
                                        }
                                    } else {
                                        so0Var.m21509m((so0Var.m21501e() + 7) & (-8));
                                        int i11 = 32;
                                        int iM21503g2 = so0Var.m21503g(32);
                                        xh0[] xh0VarArr = new xh0[iM21503g2];
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < iM21503g2) {
                                                int iM21503g3 = so0Var.m21503g(8);
                                                int iM21503g4 = so0Var.m21503g(8);
                                                int iM21503g5 = so0Var.m21503g(i11);
                                                if (iM21503g5 <= 128000) {
                                                    int i13 = iM21503g2;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iM14829m4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[iM21503g5 * 3];
                                                    float[] fArr5 = new float[iM21503g5 * 2];
                                                    i = i3;
                                                    int i14 = 0;
                                                    int i15 = 0;
                                                    while (true) {
                                                        if (i14 < iM21503g5) {
                                                            int iM21503g6 = so0Var.m21503g(iCeil2);
                                                            so0 so0Var2 = so0Var;
                                                            int i16 = ((iM21503g6 >> 1) ^ (-(iM21503g6 & 1))) + i15;
                                                            if (i16 >= 0 && i16 < iM14829m4) {
                                                                int i17 = i14 * 3;
                                                                int i18 = i16 * 5;
                                                                fArr4[i17] = fArr3[i18];
                                                                fArr4[i17 + 1] = fArr3[i18 + 1];
                                                                fArr4[i17 + 2] = fArr3[i18 + 2];
                                                                int i19 = i14 * 2;
                                                                fArr5[i19] = fArr3[i18 + 3];
                                                                fArr5[i19 + 1] = fArr3[i18 + 4];
                                                                i14++;
                                                                i15 = i16;
                                                                so0Var = so0Var2;
                                                            }
                                                        } else {
                                                            xh0VarArr[i12] = new xh0(iM21503g3, iM21503g4, fArr4, fArr5);
                                                            i12++;
                                                            iM21503g2 = i13;
                                                            fArr2 = fArr3;
                                                            i3 = i;
                                                            so0Var = so0Var;
                                                            i11 = 32;
                                                        }
                                                    }
                                                }
                                                nn7Var = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i = i3;
                                                nn7Var = new nn7(xh0VarArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i = i3;
                                    nn7Var = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (nn7Var == null) {
                            return arrayList;
                        }
                        arrayList3.add(nn7Var);
                    } else {
                        c = c2;
                        arrayList = arrayList2;
                        z = z2;
                        i = i3;
                    }
                    k47Var2.m14818M(iM14829m2);
                    i2 = iM14829m2;
                    c2 = c;
                    z2 = z;
                    arrayList2 = arrayList;
                    i3 = i;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }
}
