package p000;

import android.graphics.Path;
import android.util.Log;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acs {

    /* JADX INFO: renamed from: a */
    public char f107a;

    /* JADX INFO: renamed from: b */
    public final float[] f108b;

    public acs(char c, float[] fArr) {
        this.f107a = c;
        this.f108b = fArr;
    }

    public acs(acs acsVar) {
        this.f107a = acsVar.f107a;
        float[] fArr = acsVar.f108b;
        this.f108b = aau.m58g(fArr, fArr.length);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    public static void m223a(acs[] acsVarArr, Path path) {
        int i;
        int i2;
        float[] fArr;
        char c;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float[] fArr2 = new float[6];
        char c2 = 0;
        char c3 = 'm';
        int i4 = 0;
        while (i4 < acsVarArr.length) {
            acs acsVar = acsVarArr[i4];
            char c4 = acsVar.f107a;
            float[] fArr3 = acsVar.f108b;
            float f7 = fArr2[c2];
            float f8 = fArr2[1];
            float f9 = fArr2[2];
            float f10 = fArr2[3];
            float f11 = fArr2[4];
            float f12 = fArr2[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f11, f12);
                    f7 = f11;
                    f9 = f7;
                    f8 = f12;
                    f10 = f8;
                    i = 2;
                    break;
                default:
                    i = 2;
                    break;
            }
            float f13 = f7;
            float f14 = f11;
            float f15 = f12;
            int i5 = 0;
            float f16 = f8;
            while (i5 < fArr3.length) {
                float f17 = 0.0f;
                switch (c4) {
                    case 'A':
                        i2 = i5;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        int i6 = i2 + 5;
                        int i7 = i2 + 6;
                        m224b(path, f13, f16, fArr[i6], fArr[i7], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f, fArr[i2 + 4] != 0.0f);
                        f13 = fArr[i6];
                        f16 = fArr[i7];
                        f10 = f16;
                        f9 = f13;
                        break;
                    case 'C':
                        i2 = i5;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        int i8 = i2 + 2;
                        int i9 = i2 + 3;
                        int i10 = i2 + 4;
                        int i11 = i2 + 5;
                        path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i8], fArr[i9], fArr[i10], fArr[i11]);
                        float f18 = fArr[i10];
                        f16 = fArr[i11];
                        float f19 = fArr[i8];
                        float f20 = fArr[i9];
                        f9 = f19;
                        f13 = f18;
                        f10 = f20;
                        break;
                    case 'H':
                        i2 = i5;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        path.lineTo(fArr[i2], f16);
                        f13 = fArr[i2];
                        break;
                    case 'L':
                        i2 = i5;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        int i12 = i2 + 1;
                        path.lineTo(fArr[i2], fArr[i12]);
                        f13 = fArr[i2];
                        f16 = fArr[i12];
                        break;
                    case 'M':
                        i2 = i5;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        f13 = fArr[i2];
                        f16 = fArr[i2 + 1];
                        if (i2 <= 0) {
                            path.moveTo(f13, f16);
                            f15 = f16;
                            f14 = f13;
                        } else {
                            path.lineTo(f13, f16);
                        }
                        break;
                    case 'Q':
                        i2 = i5;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        int i13 = i2 + 1;
                        int i14 = i2 + 2;
                        int i15 = i2 + 3;
                        path.quadTo(fArr[i2], fArr[i13], fArr[i14], fArr[i15]);
                        float f21 = fArr[i2];
                        float f22 = fArr[i13];
                        f13 = fArr[i14];
                        f16 = fArr[i15];
                        f9 = f21;
                        f10 = f22;
                        break;
                    case 'S':
                        i2 = i5;
                        float f23 = f16;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        float f24 = f13;
                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                            f = (f23 + f23) - f10;
                            f2 = (f24 + f24) - f9;
                        } else {
                            f = f23;
                            f2 = f24;
                        }
                        int i16 = i2 + 1;
                        int i17 = i2 + 2;
                        int i18 = i2 + 3;
                        path.cubicTo(f2, f, fArr[i2], fArr[i16], fArr[i17], fArr[i18]);
                        float f25 = fArr[i2];
                        float f26 = fArr[i16];
                        f13 = fArr[i17];
                        f16 = fArr[i18];
                        f10 = f26;
                        f9 = f25;
                        break;
                    case 'T':
                        i2 = i5;
                        float f27 = f16;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        float f28 = f13;
                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                            f3 = (f28 + f28) - f9;
                            f4 = (f27 + f27) - f10;
                        } else {
                            f4 = f27;
                            f3 = f28;
                        }
                        int i19 = i2 + 1;
                        path.quadTo(f3, f4, fArr[i2], fArr[i19]);
                        f10 = f4;
                        f9 = f3;
                        f13 = fArr[i2];
                        f16 = fArr[i19];
                        break;
                    case 'V':
                        i2 = i5;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        path.lineTo(f13, fArr[i2]);
                        f16 = fArr[i2];
                        break;
                    case 'a':
                        i2 = i5;
                        float f29 = f16;
                        int i20 = i2 + 5;
                        int i21 = i2 + 6;
                        i3 = i4;
                        fArr = fArr3;
                        c = c4;
                        m224b(path, f13, f29, fArr3[i20] + f13, fArr3[i21] + f29, fArr3[i2], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != 0.0f, fArr3[i2 + 4] != 0.0f);
                        f13 += fArr[i20];
                        f16 = f29 + fArr[i21];
                        f10 = f16;
                        f9 = f13;
                        break;
                    case 'c':
                        i2 = i5;
                        float f30 = f16;
                        int i22 = i2 + 2;
                        int i23 = i2 + 3;
                        int i24 = i2 + 4;
                        int i25 = i2 + 5;
                        path.rCubicTo(fArr3[i2], fArr3[i2 + 1], fArr3[i22], fArr3[i23], fArr3[i24], fArr3[i25]);
                        float f31 = fArr3[i22] + f13;
                        float f32 = f30 + fArr3[i23];
                        f13 += fArr3[i24];
                        f9 = f31;
                        f10 = f32;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        f16 = f30 + fArr3[i25];
                        break;
                    case 'h':
                        i2 = i5;
                        path.rLineTo(fArr3[i2], 0.0f);
                        f13 += fArr3[i2];
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        break;
                    case 'l':
                        i2 = i5;
                        int i26 = i2 + 1;
                        path.rLineTo(fArr3[i2], fArr3[i26]);
                        f13 += fArr3[i2];
                        f16 += fArr3[i26];
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        break;
                    case 'm':
                        i2 = i5;
                        float f33 = fArr3[i2];
                        f13 += f33;
                        float f34 = fArr3[i2 + 1];
                        f16 += f34;
                        if (i2 <= 0) {
                            path.rMoveTo(f33, f34);
                            f15 = f16;
                            f14 = f13;
                            fArr = fArr3;
                            c = c4;
                            i3 = i4;
                        } else {
                            path.rLineTo(f33, f34);
                            fArr = fArr3;
                            c = c4;
                            i3 = i4;
                        }
                        break;
                    case 'q':
                        i2 = i5;
                        float f35 = f16;
                        int i27 = i2 + 1;
                        int i28 = i2 + 2;
                        int i29 = i2 + 3;
                        path.rQuadTo(fArr3[i2], fArr3[i27], fArr3[i28], fArr3[i29]);
                        float f36 = fArr3[i2] + f13;
                        float f37 = f35 + fArr3[i27];
                        f13 += fArr3[i28];
                        float f38 = f35 + fArr3[i29];
                        f9 = f36;
                        f10 = f37;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        f16 = f38;
                        break;
                    case 's':
                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                            f5 = f16 - f10;
                            f17 = f13 - f9;
                        } else {
                            f5 = 0.0f;
                        }
                        int i30 = i5 + 1;
                        int i31 = i5 + 2;
                        int i32 = i5 + 3;
                        i2 = i5;
                        float f39 = f16;
                        path.rCubicTo(f17, f5, fArr3[i5], fArr3[i30], fArr3[i31], fArr3[i32]);
                        float f40 = fArr3[i2] + f13;
                        float f41 = f39 + fArr3[i30];
                        f13 += fArr3[i31];
                        f9 = f40;
                        f10 = f41;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        f16 = f39 + fArr3[i32];
                        break;
                    case 't':
                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                            f17 = f13 - f9;
                            f6 = f16 - f10;
                        } else {
                            f6 = 0.0f;
                        }
                        int i33 = i5 + 1;
                        path.rQuadTo(f17, f6, fArr3[i5], fArr3[i33]);
                        float f42 = f17 + f13;
                        float f43 = f6 + f16;
                        f13 += fArr3[i5];
                        f16 += fArr3[i33];
                        f10 = f43;
                        f9 = f42;
                        i2 = i5;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        break;
                    case 'v':
                        path.rLineTo(0.0f, fArr3[i5]);
                        f16 += fArr3[i5];
                        i2 = i5;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        break;
                    default:
                        i2 = i5;
                        fArr = fArr3;
                        c = c4;
                        i3 = i4;
                        break;
                }
                i5 = i2 + i;
                i4 = i3;
                fArr3 = fArr;
                c3 = c;
                c4 = c3;
            }
            int i34 = i4;
            fArr2[0] = f13;
            fArr2[1] = f16;
            fArr2[2] = f9;
            fArr2[3] = f10;
            fArr2[4] = f14;
            fArr2[5] = f15;
            i4 = i34 + 1;
            c3 = acsVarArr[i34].f107a;
            c2 = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m224b(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = f;
        Double.isNaN(d3);
        double d4 = f2;
        Double.isNaN(d4);
        double d5 = -f;
        Double.isNaN(d5);
        Double.isNaN(d4);
        double d6 = d4;
        double d7 = f3;
        Double.isNaN(d7);
        double d8 = f4;
        Double.isNaN(d8);
        double d9 = d8 * dSin;
        double d10 = -f3;
        Double.isNaN(d10);
        Double.isNaN(d8);
        double d11 = (d10 * dSin) + (d8 * dCos);
        double d12 = f6;
        Double.isNaN(d12);
        double d13 = ((d5 * dSin) + (d4 * dCos)) / d12;
        Double.isNaN(d12);
        double d14 = d11 / d12;
        double d15 = d13 - d14;
        double d16 = (d3 * dCos) + (d4 * dSin);
        double d17 = f5;
        Double.isNaN(d17);
        double d18 = d16 / d17;
        Double.isNaN(d17);
        double d19 = ((d7 * dCos) + d9) / d17;
        double d20 = d18 - d19;
        double d21 = (d20 * d20) + (d15 * d15);
        String str = rmwTRjObXLGH.TGODhXlyrwFTGF;
        if (d21 == 0.0d) {
            Log.w(str, " Points are coincident");
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            Log.w(str, "Points are too far apart " + d21);
            float fSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            m224b(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d22);
        double d23 = (d13 + d14) / 2.0d;
        double d24 = d20 * dSqrt;
        double d25 = (d18 + d19) / 2.0d;
        double d26 = dSqrt * d15;
        if (z == z2) {
            d = d25 - d26;
            d2 = d23 + d24;
        } else {
            d = d25 + d26;
            d2 = d23 - d24;
        }
        double dAtan2 = Math.atan2(d13 - d2, d18 - d);
        double dAtan3 = Math.atan2(d14 - d2, d19 - d) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        Double.isNaN(d17);
        double d27 = d * d17;
        Double.isNaN(d12);
        double d28 = d2 * d12;
        double d29 = d27 * dCos;
        double d30 = d28 * dSin;
        double d31 = d27 * dSin;
        double d32 = d28 * dCos;
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        Double.isNaN(d17);
        double d33 = -d17;
        double d34 = d33 * dCos2;
        Double.isNaN(d12);
        double d35 = d12 * dSin2;
        double d36 = d33 * dSin2;
        Double.isNaN(d12);
        double d37 = d12 * dCos2;
        double d38 = (dSin3 * d36) + (dCos3 * d37);
        double d39 = (d34 * dSin3) - (d35 * dCos3);
        double d40 = d3;
        int i = 0;
        double d41 = dAtan2;
        while (i < iCeil) {
            double d42 = d36;
            double d43 = iCeil;
            Double.isNaN(d43);
            double d44 = d41 + (dAtan3 / d43);
            Double.isNaN(d17);
            double dSin4 = Math.sin(d44);
            double dCos4 = Math.cos(d44);
            Double.isNaN(d17);
            double d45 = d44 - d41;
            double dTan = Math.tan(d45 / 2.0d);
            double dSin5 = (Math.sin(d45) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            double d46 = d31;
            double d47 = d6 + (d38 * dSin5);
            double d48 = dAtan3;
            path.rLineTo(0.0f, 0.0f);
            double d49 = d31 + d32 + (d17 * dSin2 * dCos4) + (d37 * dSin4);
            double d50 = d29;
            double d51 = ((d29 - d30) + ((d17 * dCos2) * dCos4)) - (d35 * dSin4);
            d38 = (dSin4 * d42) + (dCos4 * d37);
            double d52 = (d34 * dSin4) - (d35 * dCos4);
            path.cubicTo((float) (d40 + (d39 * dSin5)), (float) d47, (float) (d51 - (dSin5 * d52)), (float) (d49 - (dSin5 * d38)), (float) d51, (float) d49);
            i++;
            d32 = d32;
            d31 = d46;
            iCeil = iCeil;
            d41 = d44;
            d17 = d17;
            d36 = d42;
            d6 = d49;
            d39 = d52;
            dAtan3 = d48;
            d40 = d51;
            d29 = d50;
        }
    }
}
