package p000;

import android.opengl.Matrix;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class els {

    /* JADX INFO: renamed from: a */
    public static final float[] f14640a = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: c */
    public final float[] f14642c;

    /* JADX INFO: renamed from: f */
    public luq f14645f;

    /* JADX INFO: renamed from: g */
    public oyo f14646g;

    /* JADX INFO: renamed from: h */
    public oyo f14647h;

    /* JADX INFO: renamed from: i */
    public oyo f14648i;

    /* JADX INFO: renamed from: j */
    public oyo f14649j;

    /* JADX INFO: renamed from: b */
    public FloatBuffer f14641b = lle.m15690j(f14640a);

    /* JADX INFO: renamed from: d */
    public final float[] f14643d = new float[16];

    /* JADX INFO: renamed from: e */
    public final float[] f14644e = {1.0f, 1.0f, 1.0f, 1.0f};

    public els() {
        float[] fArr = new float[16];
        this.f14642c = fArr;
        Matrix.setIdentityM(fArr, 0);
    }
}
