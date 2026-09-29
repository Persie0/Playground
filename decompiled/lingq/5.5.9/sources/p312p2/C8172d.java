package p312p2;

import android.graphics.Path;
import android.support.v4.media.C0141b;
import android.util.Log;
import androidx.activity.result.C0204c;
import java.util.ArrayList;

/* JADX INFO: renamed from: p2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8172d {

    /* JADX INFO: renamed from: p2.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public char f44307a;

        /* JADX INFO: renamed from: b */
        public final float[] f44308b;

        public a(char c10, float[] fArr) {
            this.f44307a = c10;
            this.f44308b = fArr;
        }

        public a(a aVar) {
            this.f44307a = aVar.f44307a;
            float[] fArr = aVar.f44308b;
            this.f44308b = C8172d.m16224b(fArr, fArr.length);
        }

        /* JADX INFO: renamed from: a */
        public static void m16228a(Path path, float f3, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f15);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d12 = f3;
            double d13 = f10;
            double d14 = (d13 * dSin) + (d12 * dCos);
            double d15 = d12;
            double d16 = f13;
            double d17 = d14 / d16;
            double d18 = f14;
            double d19 = ((d13 * dCos) + (((double) (-f3)) * dSin)) / d18;
            double d20 = d13;
            double d21 = f12;
            double d22 = ((d21 * dSin) + (((double) f11) * dCos)) / d16;
            double d23 = ((d21 * dCos) + (((double) (-f11)) * dSin)) / d18;
            double d24 = d17 - d22;
            double d25 = d19 - d23;
            double d26 = (d17 + d22) / 2.0d;
            double d27 = (d19 + d23) / 2.0d;
            double d28 = (d25 * d25) + (d24 * d24);
            if (d28 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d29 = (1.0d / d28) - 0.25d;
            if (d29 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d28);
                float fSqrt = (float) (Math.sqrt(d28) / 1.99999d);
                m16228a(path, f3, f10, f11, f12, f13 * fSqrt, f14 * fSqrt, f15, z10, z11);
                return;
            }
            double dSqrt = Math.sqrt(d29);
            double d30 = d24 * dSqrt;
            double d31 = dSqrt * d25;
            if (z10 == z11) {
                d10 = d26 - d31;
                d11 = d27 + d30;
            } else {
                d10 = d26 + d31;
                d11 = d27 - d30;
            }
            double dAtan2 = Math.atan2(d19 - d11, d17 - d10);
            double dAtan3 = Math.atan2(d23 - d11, d22 - d10) - dAtan2;
            if (z11 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d32 = d10 * d16;
            double d33 = d11 * d18;
            double d34 = (d32 * dCos) - (d33 * dSin);
            double d35 = (d33 * dCos) + (d32 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d36 = -d16;
            double d37 = d36 * dCos2;
            double d38 = d18 * dSin2;
            double d39 = (d37 * dSin3) - (d38 * dCos3);
            double d40 = d36 * dSin2;
            double d41 = d18 * dCos2;
            double d42 = (dCos3 * d41) + (dSin3 * d40);
            double d43 = d41;
            double d44 = dAtan3 / ((double) iCeil);
            int i10 = 0;
            while (i10 < iCeil) {
                double d45 = dAtan2 + d44;
                double dSin4 = Math.sin(d45);
                double dCos4 = Math.cos(d45);
                double d46 = d44;
                double d47 = (((d16 * dCos2) * dCos4) + d34) - (d38 * dSin4);
                double d48 = d43;
                double d49 = d34;
                double d50 = (d48 * dSin4) + (d16 * dSin2 * dCos4) + d35;
                double d51 = (d37 * dSin4) - (d38 * dCos4);
                double d52 = (dCos4 * d48) + (dSin4 * d40);
                double d53 = d45 - dAtan2;
                double dTan = Math.tan(d53 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d39 * dSqrt2) + d15), (float) ((d42 * dSqrt2) + d20), (float) (d47 - (dSqrt2 * d51)), (float) (d50 - (dSqrt2 * d52)), (float) d47, (float) d50);
                i10++;
                dAtan2 = d45;
                d40 = d40;
                dCos2 = dCos2;
                iCeil = iCeil;
                d42 = d52;
                d16 = d16;
                d39 = d51;
                d15 = d47;
                d20 = d50;
                d34 = d49;
                d44 = d46;
                d43 = d48;
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m16229b(a[] aVarArr, Path path) {
            int i10;
            int i11;
            float f3;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            int i12 = 6;
            float[] fArr = new float[6];
            char c10 = 'm';
            int i13 = 0;
            char c11 = 'm';
            int i14 = 0;
            while (i14 < aVarArr.length) {
                a aVar = aVarArr[i14];
                char c12 = aVar.f44307a;
                float f29 = fArr[i13];
                float f30 = fArr[1];
                float f31 = fArr[2];
                float f32 = fArr[3];
                float f33 = fArr[4];
                float f34 = fArr[5];
                switch (c12) {
                    case 'A':
                    case 'a':
                        i10 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i10 = i12;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i10 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i10 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f33, f34);
                        f29 = f33;
                        f31 = f29;
                        f30 = f34;
                        f32 = f30;
                    default:
                        i10 = 2;
                        break;
                }
                float f35 = f33;
                float f36 = f34;
                float f37 = f29;
                float f38 = f30;
                int i15 = i13;
                while (true) {
                    float[] fArr2 = aVar.f44308b;
                    if (i15 < fArr2.length) {
                        if (c12 != 'A') {
                            if (c12 != 'C') {
                                if (c12 == 'H') {
                                    i11 = i15;
                                    c12 = c12;
                                    aVar = aVar;
                                    i14 = i14;
                                    int i16 = i11 + 0;
                                    path.lineTo(fArr2[i16], f38);
                                    f37 = fArr2[i16];
                                } else if (c12 == 'Q') {
                                    i11 = i15;
                                    int i17 = i11 + 0;
                                    int i18 = i11 + 1;
                                    int i19 = i11 + 2;
                                    int i20 = i11 + 3;
                                    path.quadTo(fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                                    f3 = fArr2[i17];
                                    f10 = fArr2[i18];
                                    f37 = fArr2[i19];
                                    f38 = fArr2[i20];
                                } else if (c12 == 'V') {
                                    i11 = i15;
                                    c12 = c12;
                                    aVar = aVar;
                                    i14 = i14;
                                    int i21 = i11 + 0;
                                    path.lineTo(f37, fArr2[i21]);
                                    f38 = fArr2[i21];
                                } else if (c12 != 'a') {
                                    if (c12 != 'c') {
                                        if (c12 == 'h') {
                                            i11 = i15;
                                            int i22 = i11 + 0;
                                            path.rLineTo(fArr2[i22], 0.0f);
                                            f37 += fArr2[i22];
                                        } else if (c12 != 'q') {
                                            if (c12 != 'v') {
                                                if (c12 != 'L') {
                                                    if (c12 == 'M') {
                                                        i11 = i15;
                                                        f19 = fArr2[i11 + 0];
                                                        f20 = fArr2[i11 + 1];
                                                        if (i11 > 0) {
                                                            path.lineTo(f19, f20);
                                                        } else {
                                                            path.moveTo(f19, f20);
                                                            f35 = f19;
                                                            f36 = f20;
                                                        }
                                                    } else if (c12 == 'S') {
                                                        i11 = i15;
                                                        float f39 = f38;
                                                        float f40 = f37;
                                                        if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                            f21 = (f39 * 2.0f) - f32;
                                                            f22 = (f40 * 2.0f) - f31;
                                                        } else {
                                                            f22 = f40;
                                                            f21 = f39;
                                                        }
                                                        int i23 = i11 + 0;
                                                        int i24 = i11 + 1;
                                                        int i25 = i11 + 2;
                                                        int i26 = i11 + 3;
                                                        path.cubicTo(f22, f21, fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                                        float f41 = fArr2[i23];
                                                        float f42 = fArr2[i24];
                                                        f17 = fArr2[i25];
                                                        f16 = fArr2[i26];
                                                        f31 = f41;
                                                        f32 = f42;
                                                        f37 = f17;
                                                        f38 = f16;
                                                    } else if (c12 == 'T') {
                                                        i11 = i15;
                                                        float f43 = f38;
                                                        float f44 = f37;
                                                        if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                            f23 = (f44 * 2.0f) - f31;
                                                            f24 = (f43 * 2.0f) - f32;
                                                        } else {
                                                            f23 = f44;
                                                            f24 = f43;
                                                        }
                                                        int i27 = i11 + 0;
                                                        int i28 = i11 + 1;
                                                        path.quadTo(f23, f24, fArr2[i27], fArr2[i28]);
                                                        f32 = f24;
                                                        f31 = f23;
                                                        c12 = c12;
                                                        aVar = aVar;
                                                        i14 = i14;
                                                        f37 = fArr2[i27];
                                                        f38 = fArr2[i28];
                                                    } else if (c12 == 'l') {
                                                        i11 = i15;
                                                        int i29 = i11 + 0;
                                                        float f45 = fArr2[i29];
                                                        int i30 = i11 + 1;
                                                        path.rLineTo(f45, fArr2[i30]);
                                                        f37 += fArr2[i29];
                                                        f18 = fArr2[i30];
                                                    } else if (c12 == c10) {
                                                        i11 = i15;
                                                        float f46 = fArr2[i11 + 0];
                                                        f37 += f46;
                                                        float f47 = fArr2[i11 + 1];
                                                        f38 += f47;
                                                        if (i11 > 0) {
                                                            path.rLineTo(f46, f47);
                                                        } else {
                                                            path.rMoveTo(f46, f47);
                                                            f36 = f38;
                                                            f35 = f37;
                                                        }
                                                    } else if (c12 != 's') {
                                                        if (c12 == 't') {
                                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                                f27 = f37 - f31;
                                                                f28 = f38 - f32;
                                                            } else {
                                                                f28 = 0.0f;
                                                                f27 = 0.0f;
                                                            }
                                                            int i31 = i15 + 0;
                                                            int i32 = i15 + 1;
                                                            path.rQuadTo(f27, f28, fArr2[i31], fArr2[i32]);
                                                            float f48 = f27 + f37;
                                                            float f49 = f28 + f38;
                                                            f37 += fArr2[i31];
                                                            f38 += fArr2[i32];
                                                            f32 = f49;
                                                            f31 = f48;
                                                        }
                                                        i11 = i15;
                                                    } else {
                                                        if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                            float f50 = f37 - f31;
                                                            f25 = f38 - f32;
                                                            f26 = f50;
                                                        } else {
                                                            f25 = 0.0f;
                                                            f26 = 0.0f;
                                                        }
                                                        int i33 = i15 + 0;
                                                        int i34 = i15 + 1;
                                                        int i35 = i15 + 2;
                                                        int i36 = i15 + 3;
                                                        i11 = i15;
                                                        f11 = f38;
                                                        float f51 = f37;
                                                        path.rCubicTo(f26, f25, fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                                        f12 = fArr2[i33] + f51;
                                                        f13 = fArr2[i34] + f11;
                                                        f14 = f51 + fArr2[i35];
                                                        f15 = fArr2[i36];
                                                    }
                                                    f37 = f35;
                                                    f38 = f36;
                                                } else {
                                                    i11 = i15;
                                                    int i37 = i11 + 0;
                                                    int i38 = i11 + 1;
                                                    path.lineTo(fArr2[i37], fArr2[i38]);
                                                    f19 = fArr2[i37];
                                                    f20 = fArr2[i38];
                                                }
                                                f37 = f19;
                                                f38 = f20;
                                            } else {
                                                i11 = i15;
                                                int i39 = i11 + 0;
                                                path.rLineTo(0.0f, fArr2[i39]);
                                                f18 = fArr2[i39];
                                            }
                                            f38 += f18;
                                        } else {
                                            i11 = i15;
                                            f11 = f38;
                                            float f52 = f37;
                                            int i40 = i11 + 0;
                                            float f53 = fArr2[i40];
                                            int i41 = i11 + 1;
                                            int i42 = i11 + 2;
                                            int i43 = i11 + 3;
                                            path.rQuadTo(f53, fArr2[i41], fArr2[i42], fArr2[i43]);
                                            f12 = fArr2[i40] + f52;
                                            f13 = fArr2[i41] + f11;
                                            float f54 = f52 + fArr2[i42];
                                            float f55 = fArr2[i43];
                                            f14 = f54;
                                            f15 = f55;
                                        }
                                        c12 = c12;
                                        aVar = aVar;
                                        i14 = i14;
                                    } else {
                                        i11 = i15;
                                        f11 = f38;
                                        float f56 = f37;
                                        int i44 = i11 + 2;
                                        int i45 = i11 + 3;
                                        int i46 = i11 + 4;
                                        int i47 = i11 + 5;
                                        path.rCubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i44], fArr2[i45], fArr2[i46], fArr2[i47]);
                                        f12 = fArr2[i44] + f56;
                                        f13 = fArr2[i45] + f11;
                                        f14 = f56 + fArr2[i46];
                                        f15 = fArr2[i47];
                                    }
                                    f16 = f11 + f15;
                                    f31 = f12;
                                    f32 = f13;
                                    f17 = f14;
                                    f37 = f17;
                                    f38 = f16;
                                    c12 = c12;
                                    aVar = aVar;
                                    i14 = i14;
                                } else {
                                    i11 = i15;
                                    float f57 = f38;
                                    float f58 = f37;
                                    int i48 = i11 + 5;
                                    int i49 = i11 + 6;
                                    m16228a(path, f58, f57, fArr2[i48] + f58, fArr2[i49] + f57, fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                                    f37 = f58 + fArr2[i48];
                                    f38 = f57 + fArr2[i49];
                                }
                                i15 = i11 + i10;
                                aVar = aVar;
                                c11 = c12;
                                c12 = c11;
                                i14 = i14;
                                c10 = 'm';
                                i13 = 0;
                            } else {
                                i11 = i15;
                                int i50 = i11 + 2;
                                int i51 = i11 + 3;
                                int i52 = i11 + 4;
                                int i53 = i11 + 5;
                                path.cubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i50], fArr2[i51], fArr2[i52], fArr2[i53]);
                                float f59 = fArr2[i52];
                                float f60 = fArr2[i53];
                                f3 = fArr2[i50];
                                f37 = f59;
                                f38 = f60;
                                f10 = fArr2[i51];
                            }
                            f31 = f3;
                            f32 = f10;
                            i15 = i11 + i10;
                            aVar = aVar;
                            c11 = c12;
                            c12 = c11;
                            i14 = i14;
                            c10 = 'm';
                            i13 = 0;
                        } else {
                            i11 = i15;
                            int i54 = i11 + 5;
                            int i55 = i11 + 6;
                            m16228a(path, f37, f38, fArr2[i54], fArr2[i55], fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                            f37 = fArr2[i54];
                            f38 = fArr2[i55];
                        }
                        f32 = f38;
                        f31 = f37;
                        i15 = i11 + i10;
                        aVar = aVar;
                        c11 = c12;
                        c12 = c11;
                        i14 = i14;
                        c10 = 'm';
                        i13 = 0;
                    }
                }
                int i56 = i14;
                int i57 = i13;
                fArr[i57] = f37;
                fArr[1] = f38;
                fArr[2] = f31;
                fArr[3] = f32;
                fArr[4] = f35;
                fArr[5] = f36;
                i14 = i56 + 1;
                i12 = 6;
                c10 = 'm';
                i13 = i57;
                c11 = aVarArr[i56].f44307a;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16223a(a[] aVarArr, a[] aVarArr2) {
        int i10;
        if (aVarArr != null && aVarArr2 != null && aVarArr.length == aVarArr2.length) {
            for (0; i10 < aVarArr.length; i10 + 1) {
                a aVar = aVarArr[i10];
                char c10 = aVar.f44307a;
                a aVar2 = aVarArr2[i10];
                i10 = (c10 == aVar2.f44307a && aVar.f44308b.length == aVar2.f44308b.length) ? i10 + 1 : 0;
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static float[] m16224b(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = i10 - 0;
        int iMin = Math.min(i11, length - 0);
        float[] fArr2 = new float[i11];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[Catch: NumberFormatException -> 0x00c5, LOOP:3: B:29:0x0070->B:49:0x00a0, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00c5, blocks: (B:26:0x005d, B:29:0x0070, B:31:0x0076, B:36:0x0088, B:49:0x00a0, B:51:0x00a5, B:54:0x00b5, B:56:0x00ba), top: B:71:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5 A[Catch: NumberFormatException -> 0x00c5, TryCatch #0 {NumberFormatException -> 0x00c5, blocks: (B:26:0x005d, B:29:0x0070, B:31:0x0076, B:36:0x0088, B:49:0x00a0, B:51:0x00a5, B:54:0x00b5, B:56:0x00ba), top: B:71:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5 A[Catch: NumberFormatException -> 0x00c5, TryCatch #0 {NumberFormatException -> 0x00c5, blocks: (B:26:0x005d, B:29:0x0070, B:31:0x0076, B:36:0x0088, B:49:0x00a0, B:51:0x00a5, B:54:0x00b5, B:56:0x00ba), top: B:71:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r13 == 0) goto L42;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a[] m16225c(String str) {
        String strTrim;
        float[] fArrM16224b;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i11 < str.length()) {
            while (i11 < str.length()) {
                char cCharAt = str.charAt(i11);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i10, i11).trim();
                        if (strTrim.length() <= 0) {
                            if (strTrim.charAt(i12) != 'z' || strTrim.charAt(i12) == 'Z') {
                                fArrM16224b = new float[i12];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i13 = 1;
                                    int i14 = i12;
                                    while (i13 < length) {
                                        int i15 = i14;
                                        int i16 = i15;
                                        int i17 = i16;
                                        int i18 = i13;
                                        while (i18 < strTrim.length()) {
                                            char cCharAt2 = strTrim.charAt(i18);
                                            if (cCharAt2 != ' ') {
                                                if (cCharAt2 == 'E' || cCharAt2 == 'e') {
                                                    i17 = 1;
                                                } else {
                                                    switch (cCharAt2) {
                                                        case '-':
                                                            if (i18 != i13) {
                                                            }
                                                            break;
                                                        case '.':
                                                            if (i16 != 0) {
                                                                i15 = 1;
                                                            } else {
                                                                i16 = 1;
                                                            }
                                                            break;
                                                    }
                                                    i17 = 0;
                                                }
                                                if (i14 != 0) {
                                                    if (i13 < i18) {
                                                        fArr[i12] = Float.parseFloat(strTrim.substring(i13, i18));
                                                        i12++;
                                                    }
                                                    if (i15 == 0) {
                                                        i18++;
                                                    }
                                                    i13 = i18;
                                                    i14 = 0;
                                                } else {
                                                    i18++;
                                                }
                                            }
                                            i14 = 1;
                                            i17 = 0;
                                            if (i14 != 0) {
                                                if (i13 < i18) {
                                                    fArr[i12] = Float.parseFloat(strTrim.substring(i13, i18));
                                                    i12++;
                                                }
                                                if (i15 == 0) {
                                                    i18++;
                                                }
                                                i13 = i18;
                                                i14 = 0;
                                            } else {
                                                i18++;
                                            }
                                        }
                                        if (i13 < i18) {
                                            fArr[i12] = Float.parseFloat(strTrim.substring(i13, i18));
                                            i12++;
                                        }
                                        if (i15 == 0) {
                                            i18++;
                                        }
                                        i13 = i18;
                                        i14 = 0;
                                    }
                                    fArrM16224b = m16224b(fArr, i12);
                                    i12 = 0;
                                } catch (NumberFormatException e10) {
                                    throw new RuntimeException(C0141b.m611g("error in parsing \"", strTrim, "\""), e10);
                                }
                            }
                            arrayList.add(new a(strTrim.charAt(i12), fArrM16224b));
                        }
                        i12 = 0;
                        int i19 = i11;
                        i11++;
                        i10 = i19;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i11++;
            }
            strTrim = str.substring(i10, i11).trim();
            if (strTrim.length() <= 0) {
                if (strTrim.charAt(i12) != 'z') {
                    fArrM16224b = new float[i12];
                } else {
                    fArrM16224b = new float[i12];
                }
                arrayList.add(new a(strTrim.charAt(i12), fArrM16224b));
            }
            i12 = 0;
            int i110 = i11;
            i11++;
            i10 = i110;
        }
        if (i11 - i10 == 1 && i10 < str.length()) {
            arrayList.add(new a(str.charAt(i10), new float[0]));
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    /* JADX INFO: renamed from: d */
    public static Path m16226d(String str) {
        Path path = new Path();
        a[] aVarArrM16225c = m16225c(str);
        if (aVarArrM16225c == null) {
            return null;
        }
        try {
            a.m16229b(aVarArrM16225c, path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException(C0204c.m852k("Error in parsing ", str), e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static a[] m16227e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new a(aVarArr[i10]);
        }
        return aVarArr2;
    }
}
