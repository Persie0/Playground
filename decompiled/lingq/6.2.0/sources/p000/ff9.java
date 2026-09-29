package p000;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public final class ff9 implements GLSurfaceView.Renderer, xz6 {

    /* JADX INFO: renamed from: a */
    public final rm8 f39011a;

    /* JADX INFO: renamed from: d */
    public final float[] f39014d;

    /* JADX INFO: renamed from: e */
    public final float[] f39015e;

    /* JADX INFO: renamed from: f */
    public final float[] f39016f;

    /* JADX INFO: renamed from: g */
    public float f39017g;

    /* JADX INFO: renamed from: h */
    public float f39018h;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ gf9 f39021k;

    /* JADX INFO: renamed from: b */
    public final float[] f39012b = new float[16];

    /* JADX INFO: renamed from: c */
    public final float[] f39013c = new float[16];

    /* JADX INFO: renamed from: i */
    public final float[] f39019i = new float[16];

    /* JADX INFO: renamed from: j */
    public final float[] f39020j = new float[16];

    public ff9(gf9 gf9Var, rm8 rm8Var) {
        this.f39021k = gf9Var;
        float[] fArr = new float[16];
        this.f39014d = fArr;
        float[] fArr2 = new float[16];
        this.f39015e = fArr2;
        float[] fArr3 = new float[16];
        this.f39016f = fArr3;
        this.f39011a = rm8Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f39018h = 3.1415927f;
    }

    @Override // p000.xz6
    /* JADX INFO: renamed from: a */
    public final synchronized void mo11811a(float f, float[] fArr) {
        float[] fArr2 = this.f39014d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.f39018h = f2;
        Matrix.setRotateM(this.f39015e, 0, -this.f39017g, (float) Math.cos(f2), (float) Math.sin(this.f39018h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object objM12635n;
        synchronized (this) {
            Matrix.multiplyMM(this.f39020j, 0, this.f39014d, 0, this.f39016f, 0);
            Matrix.multiplyMM(this.f39019i, 0, this.f39015e, 0, this.f39020j, 0);
        }
        Matrix.multiplyMM(this.f39013c, 0, this.f39012b, 0, this.f39019i, 0);
        rm8 rm8Var = this.f39011a;
        float[] fArr2 = this.f39013c;
        GLES20.glClear(16384);
        try {
            oed.m17953a();
        } catch (GlUtil$GlException e) {
            ss5.m21724v("SceneRenderer", "Failed to draw a frame", e);
        }
        if (rm8Var.f59542a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = rm8Var.f59551j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                oed.m17953a();
            } catch (GlUtil$GlException e2) {
                ss5.m21724v("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (rm8Var.f59543b.compareAndSet(true, false)) {
                Matrix.setIdentityM(rm8Var.f59548g, 0);
            }
            long timestamp = rm8Var.f59551j.getTimestamp();
            gh1 gh1Var = rm8Var.f59546e;
            synchronized (gh1Var) {
                objM12635n = gh1Var.m12635n(timestamp, false);
            }
            Long l = (Long) objM12635n;
            if (l != null) {
                nc0 nc0Var = rm8Var.f59545d;
                float[] fArr3 = rm8Var.f59548g;
                float[] fArr4 = (float[]) ((gh1) nc0Var.f52587e).m12637p(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) nc0Var.f52586d;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!nc0Var.f52584b) {
                        nc0.m17325b((float[]) nc0Var.f52585c, (float[]) nc0Var.f52586d);
                        nc0Var.f52584b = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) nc0Var.f52585c, 0, (float[]) nc0Var.f52586d, 0);
                }
            }
            on7 on7Var = (on7) rm8Var.f59547f.m12637p(timestamp);
            if (on7Var != null) {
                pn7 pn7Var = rm8Var.f59544c;
                pn7Var.getClass();
                if (pn7.m19409b(on7Var)) {
                    pn7Var.f56510a = on7Var.f54619c;
                    pn7Var.f56511b = new xh0(on7Var.f54617a.f53000a[0]);
                    if (!on7Var.f54620d) {
                        xh0 xh0Var = on7Var.f54618b.f53000a[0];
                        float[] fArr6 = (float[]) xh0Var.f68194c;
                        int length2 = fArr6.length;
                        float[] fArr7 = (float[]) xh0Var.f68195d;
                    }
                }
            }
        }
        Matrix.multiplyMM(rm8Var.f59549h, 0, fArr2, 0, rm8Var.f59548g, 0);
        pn7 pn7Var2 = rm8Var.f59544c;
        int i = rm8Var.f59550i;
        float[] fArr8 = rm8Var.f59549h;
        xh0 xh0Var2 = pn7Var2.f56511b;
        if (xh0Var2 == null) {
            return;
        }
        int i2 = pn7Var2.f56510a;
        if (i2 == 1) {
            fArr = pn7.f56508j;
        } else {
            fArr = i2 == 2 ? pn7.f56509k : pn7.f56507i;
        }
        GLES20.glUniformMatrix3fv(pn7Var2.f56514e, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(pn7Var2.f56513d, 1, false, fArr8, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(pn7Var2.f56517h, 0);
        try {
            oed.m17953a();
        } catch (GlUtil$GlException e3) {
            ss5.m21724v("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(pn7Var2.f56515f, 3, 5126, false, 12, (Buffer) xh0Var2.f68194c);
        try {
            oed.m17953a();
        } catch (GlUtil$GlException e4) {
            ss5.m21724v("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(pn7Var2.f56516g, 2, 5126, false, 8, (Buffer) xh0Var2.f68195d);
        try {
            oed.m17953a();
        } catch (GlUtil$GlException e5) {
            ss5.m21724v("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(xh0Var2.f68193b, 0, xh0Var2.f68192a);
        try {
            oed.m17953a();
        } catch (GlUtil$GlException e6) {
            ss5.m21724v("ProjectionRenderer", "Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.f39012b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        gf9 gf9Var = this.f39021k;
        gf9Var.f40744e.post(new mv5(9, gf9Var, this.f39011a.m20716d()));
    }
}
