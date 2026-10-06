package p000;

import android.opengl.Matrix;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Vector;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ewx {

    /* JADX INFO: renamed from: f */
    private final float[] f20702f;

    /* JADX INFO: renamed from: a */
    public FloatBuffer f20697a = null;

    /* JADX INFO: renamed from: b */
    public FloatBuffer f20698b = null;

    /* JADX INFO: renamed from: c */
    public ShortBuffer f20699c = null;

    /* JADX INFO: renamed from: d */
    public final Vector f20700d = new Vector();

    /* JADX INFO: renamed from: g */
    private final float[] f20703g = new float[16];

    /* JADX INFO: renamed from: e */
    public ewz f20701e = null;

    public ewx() {
        float[] fArr = new float[16];
        this.f20702f = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public void mo7959a(float[] fArr) {
        Matrix.multiplyMM(this.f20703g, 0, fArr, 0, this.f20702f, 0);
        mo7961c(this.f20703g);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo7961c(float[] fArr);

    /* JADX INFO: renamed from: d */
    protected final void m7962d(int i, float f, float f2) {
        int i2 = i * 3;
        this.f20697a.put(i2, f);
        int i3 = i2 + 1;
        this.f20697a.put(i3, -1.7f);
        this.f20697a.put(i3 + 1, f2);
    }
}
