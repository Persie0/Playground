package za;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p357r6.C8739a;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: za.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10470f {
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX INFO: renamed from: a */
    public static ArrayList<C10469e.a> m19421a(C10151t c10151t) {
        ArrayList<C10469e.a> arrayList;
        boolean z10;
        int i10;
        ArrayList<C10469e.a> arrayList2;
        C10469e.a aVar;
        C10151t c10151t2 = c10151t;
        if (c10151t.m19145t() != 0) {
            return null;
        }
        c10151t2.m19125F(7);
        int iM19129d = c10151t.m19129d();
        boolean z11 = true;
        if (iM19129d == 1684433976) {
            C10151t c10151t3 = new C10151t();
            Inflater inflater = new Inflater(true);
            try {
                if (!C10134c0.m19020E(c10151t2, c10151t3, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                c10151t2 = c10151t3;
            } catch (Throwable th2) {
                inflater.end();
                throw th2;
            }
        } else if (iM19129d != 1918990112) {
            return null;
        }
        ArrayList<C10469e.a> arrayList3 = new ArrayList<>();
        int i11 = c10151t2.f51439b;
        int i12 = c10151t2.f51440c;
        while (i11 < i12) {
            int iM19129d2 = c10151t2.m19129d() + i11;
            if (iM19129d2 > i11 && iM19129d2 <= i12) {
                if (c10151t2.m19129d() == 1835365224) {
                    int iM19129d3 = c10151t2.m19129d();
                    if (iM19129d3 > 10000) {
                        arrayList2 = arrayList3;
                        z10 = z11;
                        i10 = i12;
                        aVar = null;
                    } else {
                        float[] fArr = new float[iM19129d3];
                        for (int i13 = 0; i13 < iM19129d3; i13++) {
                            fArr[i13] = Float.intBitsToFloat(c10151t2.m19129d());
                        }
                        int iM19129d4 = c10151t2.m19129d();
                        if (iM19129d4 > 32000) {
                            arrayList2 = arrayList3;
                        } else {
                            double dLog = Math.log(2.0d);
                            arrayList2 = arrayList3;
                            int iCeil = (int) Math.ceil(Math.log(((double) iM19129d3) * 2.0d) / dLog);
                            byte[] bArr = c10151t2.f51438a;
                            C8739a c8739a = new C8739a(bArr, bArr.length);
                            c8739a.m16974k(c10151t2.f51439b * 8);
                            float[] fArr2 = new float[iM19129d4 * 5];
                            int i14 = 5;
                            int[] iArr = new int[5];
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 < iM19129d4) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < i14) {
                                            int i18 = iArr[i17];
                                            int iM16970g = c8739a.m16970g(iCeil);
                                            int i19 = ((-(iM16970g & 1)) ^ (iM16970g >> 1)) + i18;
                                            if (i19 < iM19129d3 && i19 >= 0) {
                                                fArr2[i16] = fArr[i19];
                                                iArr[i17] = i19;
                                                i17++;
                                                i16++;
                                                i14 = 5;
                                            }
                                        } else {
                                            i15++;
                                            i14 = 5;
                                        }
                                    }
                                } else {
                                    c8739a.m16974k((c8739a.m16968e() + 7) & (-8));
                                    int i20 = 32;
                                    int iM16970g2 = c8739a.m16970g(32);
                                    C10469e.b[] bVarArr = new C10469e.b[iM16970g2];
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < iM16970g2) {
                                            int iM16970g3 = c8739a.m16970g(8);
                                            int iM16970g4 = c8739a.m16970g(8);
                                            int iM16970g5 = c8739a.m16970g(i20);
                                            if (iM16970g5 <= 128000) {
                                                i10 = i12;
                                                int iCeil2 = (int) Math.ceil(Math.log(((double) iM19129d4) * 2.0d) / dLog);
                                                float[] fArr3 = new float[iM16970g5 * 3];
                                                float[] fArr4 = new float[iM16970g5 * 2];
                                                int i22 = 0;
                                                int i23 = 0;
                                                while (true) {
                                                    if (i22 < iM16970g5) {
                                                        int iM16970g6 = c8739a.m16970g(iCeil2);
                                                        int i24 = iM16970g6 >> 1;
                                                        C8739a c8739a2 = c8739a;
                                                        int i25 = iM16970g6 & 1;
                                                        int i26 = iM16970g2;
                                                        float[] fArr5 = fArr4;
                                                        int i27 = ((-i25) ^ i24) + i23;
                                                        if (i27 < 0 || i27 >= iM19129d4) {
                                                            z10 = true;
                                                        } else {
                                                            int i28 = i22 * 3;
                                                            int i29 = i27 * 5;
                                                            fArr3[i28] = fArr2[i29];
                                                            fArr3[i28 + 1] = fArr2[i29 + 1];
                                                            fArr3[i28 + 2] = fArr2[i29 + 2];
                                                            int i30 = i22 * 2;
                                                            fArr5[i30] = fArr2[i29 + 3];
                                                            fArr5[i30 + 1] = fArr2[i29 + 4];
                                                            i22++;
                                                            i23 = i27;
                                                            fArr4 = fArr5;
                                                            iM16970g2 = i26;
                                                            c8739a = c8739a2;
                                                        }
                                                    } else {
                                                        bVarArr[i21] = new C10469e.b(iM16970g3, iM16970g4, fArr3, fArr4);
                                                        i21++;
                                                        i12 = i10;
                                                        z11 = true;
                                                        iM16970g2 = iM16970g2;
                                                        i20 = 32;
                                                    }
                                                }
                                            }
                                            aVar = null;
                                        } else {
                                            z10 = z11;
                                            i10 = i12;
                                            aVar = new C10469e.a(bVarArr);
                                        }
                                    }
                                }
                            }
                        }
                        z10 = z11;
                        i10 = i12;
                        aVar = null;
                    }
                    if (aVar != null) {
                        arrayList = arrayList2;
                        arrayList.add(aVar);
                    }
                } else {
                    arrayList = arrayList3;
                    z10 = z11;
                    i10 = i12;
                }
                c10151t2.m19124E(iM19129d2);
                arrayList3 = arrayList;
                i11 = iM19129d2;
                i12 = i10;
                z11 = z10;
            }
            return null;
        }
        return arrayList3;
    }
}
