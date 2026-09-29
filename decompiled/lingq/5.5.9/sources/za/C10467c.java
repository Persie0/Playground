package za;

import android.opengl.Matrix;
import p479xa.C10157z;

/* JADX INFO: renamed from: za.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10467c {

    /* JADX INFO: renamed from: a */
    public final float[] f52336a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f52337b = new float[16];

    /* JADX INFO: renamed from: c */
    public final C10157z<float[]> f52338c = new C10157z<>();

    /* JADX INFO: renamed from: d */
    public boolean f52339d;

    /* JADX INFO: renamed from: a */
    public static void m19419a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f3 = fArr2[10];
        float f10 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f3 * f3));
        float f11 = fArr2[10];
        fArr[0] = f11 / fSqrt;
        float f12 = fArr2[8];
        fArr[2] = f12 / fSqrt;
        fArr[8] = (-f12) / fSqrt;
        fArr[10] = f11 / fSqrt;
    }
}
