package p000;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: loaded from: classes2.dex */
public final class pn7 {

    /* JADX INFO: renamed from: i */
    public static final float[] f56507i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j */
    public static final float[] f56508j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final float[] f56509k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public int f56510a;

    /* JADX INFO: renamed from: b */
    public xh0 f56511b;

    /* JADX INFO: renamed from: c */
    public fn3 f56512c;

    /* JADX INFO: renamed from: d */
    public int f56513d;

    /* JADX INFO: renamed from: e */
    public int f56514e;

    /* JADX INFO: renamed from: f */
    public int f56515f;

    /* JADX INFO: renamed from: g */
    public int f56516g;

    /* JADX INFO: renamed from: h */
    public int f56517h;

    /* JADX INFO: renamed from: b */
    public static boolean m19409b(on7 on7Var) {
        nn7 nn7Var = on7Var.f54617a;
        nn7 nn7Var2 = on7Var.f54618b;
        xh0[] xh0VarArr = nn7Var.f53000a;
        if (xh0VarArr.length == 1 && xh0VarArr[0].f68192a == 0) {
            xh0[] xh0VarArr2 = nn7Var2.f53000a;
            if (xh0VarArr2.length == 1 && xh0VarArr2[0].f68192a == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m19410a() {
        try {
            fn3 fn3Var = new fn3(0);
            this.f56512c = fn3Var;
            this.f56513d = GLES20.glGetUniformLocation(fn3Var.f39333b, "uMvpMatrix");
            this.f56514e = GLES20.glGetUniformLocation(this.f56512c.f39333b, "uTexMatrix");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f56512c.f39333b, "aPosition");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            oed.m17953a();
            this.f56515f = iGlGetAttribLocation;
            int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f56512c.f39333b, "aTexCoords");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
            oed.m17953a();
            this.f56516g = iGlGetAttribLocation2;
            this.f56517h = GLES20.glGetUniformLocation(this.f56512c.f39333b, "uTexture");
        } catch (GlUtil$GlException e) {
            ss5.m21724v("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
