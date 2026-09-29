package za;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.activity.RunnableC0190i;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p080e.RunnableC5286r;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10157z;
import p505ya.InterfaceC10327i;

/* JADX INFO: renamed from: za.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10474j extends GLSurfaceView {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f52385l = 0;

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList<b> f52386a;

    /* JADX INFO: renamed from: b */
    public final SensorManager f52387b;

    /* JADX INFO: renamed from: c */
    public final Sensor f52388c;

    /* JADX INFO: renamed from: d */
    public final C10468d f52389d;

    /* JADX INFO: renamed from: e */
    public final Handler f52390e;

    /* JADX INFO: renamed from: f */
    public final C10473i f52391f;

    /* JADX INFO: renamed from: g */
    public SurfaceTexture f52392g;

    /* JADX INFO: renamed from: h */
    public Surface f52393h;

    /* JADX INFO: renamed from: i */
    public boolean f52394i;

    /* JADX INFO: renamed from: j */
    public boolean f52395j;

    /* JADX INFO: renamed from: k */
    public boolean f52396k;

    /* JADX INFO: renamed from: za.j$a */
    public final class a implements GLSurfaceView.Renderer, ViewOnTouchListenerC10475k.a, C10468d.a {

        /* JADX INFO: renamed from: a */
        public final C10473i f52397a;

        /* JADX INFO: renamed from: d */
        public final float[] f52400d;

        /* JADX INFO: renamed from: e */
        public final float[] f52401e;

        /* JADX INFO: renamed from: f */
        public final float[] f52402f;

        /* JADX INFO: renamed from: g */
        public float f52403g;

        /* JADX INFO: renamed from: h */
        public float f52404h;

        /* JADX INFO: renamed from: b */
        public final float[] f52398b = new float[16];

        /* JADX INFO: renamed from: c */
        public final float[] f52399c = new float[16];

        /* JADX INFO: renamed from: i */
        public final float[] f52405i = new float[16];

        /* JADX INFO: renamed from: j */
        public final float[] f52406j = new float[16];

        public a(C10473i c10473i) {
            float[] fArr = new float[16];
            this.f52400d = fArr;
            float[] fArr2 = new float[16];
            this.f52401e = fArr2;
            float[] fArr3 = new float[16];
            this.f52402f = fArr3;
            this.f52397a = c10473i;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f52404h = 3.1415927f;
        }

        @Override // za.C10468d.a
        /* JADX INFO: renamed from: a */
        public final synchronized void mo19420a(float f3, float[] fArr) {
            float[] fArr2 = this.f52400d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f10 = -f3;
            this.f52404h = f10;
            Matrix.setRotateM(this.f52401e, 0, -this.f52403g, (float) Math.cos(f10), (float) Math.sin(this.f52404h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            float[] fArr;
            Object objM19168d;
            Object objM19168d2;
            Object objM19168d3;
            synchronized (this) {
                Matrix.multiplyMM(this.f52406j, 0, this.f52400d, 0, this.f52402f, 0);
                Matrix.multiplyMM(this.f52405i, 0, this.f52401e, 0, this.f52406j, 0);
            }
            Matrix.multiplyMM(this.f52399c, 0, this.f52398b, 0, this.f52405i, 0);
            C10473i c10473i = this.f52397a;
            float[] fArr2 = this.f52399c;
            c10473i.getClass();
            GLES20.glClear(16384);
            try {
                GlUtil.m7476b();
            } catch (GlUtil.GlException e10) {
                C10145n.m19096d("SceneRenderer", "Failed to draw a frame", e10);
            }
            if (c10473i.f52373a.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = c10473i.f52382j;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    GlUtil.m7476b();
                } catch (GlUtil.GlException e11) {
                    C10145n.m19096d("SceneRenderer", "Failed to draw a frame", e11);
                }
                if (c10473i.f52374b.compareAndSet(true, false)) {
                    Matrix.setIdentityM(c10473i.f52379g, 0);
                }
                long timestamp = c10473i.f52382j.getTimestamp();
                C10157z<Long> c10157z = c10473i.f52377e;
                synchronized (c10157z) {
                    objM19168d = c10157z.m19168d(false, timestamp);
                }
                Long l10 = (Long) objM19168d;
                if (l10 != null) {
                    C10467c c10467c = c10473i.f52376d;
                    float[] fArr3 = c10473i.f52379g;
                    long jLongValue = l10.longValue();
                    C10157z<float[]> c10157z2 = c10467c.f52338c;
                    synchronized (c10157z2) {
                        objM19168d3 = c10157z2.m19168d(true, jLongValue);
                    }
                    float[] fArr4 = (float[]) objM19168d3;
                    if (fArr4 != null) {
                        float[] fArr5 = c10467c.f52337b;
                        float f3 = fArr4[0];
                        float f10 = -fArr4[1];
                        float f11 = -fArr4[2];
                        float length = Matrix.length(f3, f10, f11);
                        if (length != 0.0f) {
                            Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f3 / length, f10 / length, f11 / length);
                        } else {
                            Matrix.setIdentityM(fArr5, 0);
                        }
                        if (!c10467c.f52339d) {
                            C10467c.m19419a(c10467c.f52336a, c10467c.f52337b);
                            c10467c.f52339d = true;
                        }
                        Matrix.multiplyMM(fArr3, 0, c10467c.f52336a, 0, c10467c.f52337b, 0);
                    }
                }
                C10157z<C10469e> c10157z3 = c10473i.f52378f;
                synchronized (c10157z3) {
                    objM19168d2 = c10157z3.m19168d(true, timestamp);
                }
                C10469e c10469e = (C10469e) objM19168d2;
                if (c10469e != null) {
                    C10471g c10471g = c10473i.f52375c;
                    c10471g.getClass();
                    if (C10471g.m19422b(c10469e)) {
                        c10471g.f52359a = c10469e.f52349c;
                        c10471g.f52360b = new C10471g.a(c10469e.f52347a.f52351a[0]);
                        if (!c10469e.f52350d) {
                            C10469e.b bVar = c10469e.f52348b.f52351a[0];
                            float[] fArr6 = bVar.f52354c;
                            int length2 = fArr6.length / 3;
                            GlUtil.m7478d(fArr6);
                            GlUtil.m7478d(bVar.f52355d);
                            int i10 = bVar.f52353b;
                        }
                    }
                }
            }
            Matrix.multiplyMM(c10473i.f52380h, 0, fArr2, 0, c10473i.f52379g, 0);
            C10471g c10471g2 = c10473i.f52375c;
            int i11 = c10473i.f52381i;
            float[] fArr7 = c10473i.f52380h;
            C10471g.a aVar = c10471g2.f52360b;
            if (aVar == null) {
                return;
            }
            int i12 = c10471g2.f52359a;
            if (i12 == 1) {
                fArr = C10471g.f52357j;
            } else {
                fArr = i12 == 2 ? C10471g.f52358k : C10471g.f52356i;
            }
            GLES20.glUniformMatrix3fv(c10471g2.f52363e, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(c10471g2.f52362d, 1, false, fArr7, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i11);
            GLES20.glUniform1i(c10471g2.f52366h, 0);
            try {
                GlUtil.m7476b();
            } catch (GlUtil.GlException e12) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e12);
            }
            GLES20.glVertexAttribPointer(c10471g2.f52364f, 3, 5126, false, 12, (Buffer) aVar.f52368b);
            try {
                GlUtil.m7476b();
            } catch (GlUtil.GlException e13) {
                Log.e("ProjectionRenderer", "Failed to load position data", e13);
            }
            GLES20.glVertexAttribPointer(c10471g2.f52365g, 2, 5126, false, 8, (Buffer) aVar.f52369c);
            try {
                GlUtil.m7476b();
            } catch (GlUtil.GlException e14) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e14);
            }
            GLES20.glDrawArrays(aVar.f52370d, 0, aVar.f52367a);
            try {
                GlUtil.m7476b();
            } catch (GlUtil.GlException e15) {
                Log.e("ProjectionRenderer", "Failed to render", e15);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f3 = i10 / i11;
            Matrix.perspectiveM(this.f52398b, 0, f3 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f3))) * 2.0d) : 90.0f, f3, 0.1f, 100.0f);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                C10474j c10474j = C10474j.this;
                c10474j.f52390e.post(new RunnableC5286r(c10474j, 18, this.f52397a.m19424a()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: za.j$b */
    public interface b {
        /* JADX INFO: renamed from: w */
        void mo7054w();

        /* JADX INFO: renamed from: x */
        void mo7055x(Surface surface);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10474j(Context context) {
        super(context, null);
        Sensor defaultSensor = null;
        this.f52386a = new CopyOnWriteArrayList<>();
        this.f52390e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f52387b = sensorManager;
        defaultSensor = C10134c0.f51354a >= 18 ? sensorManager.getDefaultSensor(15) : defaultSensor;
        this.f52388c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C10473i c10473i = new C10473i();
        this.f52391f = c10473i;
        a aVar = new a(c10473i);
        View.OnTouchListener viewOnTouchListenerC10475k = new ViewOnTouchListenerC10475k(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f52389d = new C10468d(windowManager.getDefaultDisplay(), viewOnTouchListenerC10475k, aVar);
        this.f52394i = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(viewOnTouchListenerC10475k);
    }

    /* JADX INFO: renamed from: a */
    public final void m19425a() {
        boolean z10 = this.f52394i && this.f52395j;
        Sensor sensor = this.f52388c;
        if (sensor == null || z10 == this.f52396k) {
            return;
        }
        C10468d c10468d = this.f52389d;
        SensorManager sensorManager = this.f52387b;
        if (z10) {
            sensorManager.registerListener(c10468d, sensor, 0);
        } else {
            sensorManager.unregisterListener(c10468d);
        }
        this.f52396k = z10;
    }

    public InterfaceC10465a getCameraMotionListener() {
        return this.f52391f;
    }

    public InterfaceC10327i getVideoFrameMetadataListener() {
        return this.f52391f;
    }

    public Surface getVideoSurface() {
        return this.f52393h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52390e.post(new RunnableC0190i(15, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f52395j = false;
        m19425a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f52395j = true;
        m19425a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f52391f.f52383k = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f52394i = z10;
        m19425a();
    }
}
