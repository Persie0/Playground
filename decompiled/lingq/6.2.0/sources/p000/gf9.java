package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gf9 extends GLSurfaceView {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f40740a;

    /* JADX INFO: renamed from: b */
    public final SensorManager f40741b;

    /* JADX INFO: renamed from: c */
    public final Sensor f40742c;

    /* JADX INFO: renamed from: d */
    public final yz6 f40743d;

    /* JADX INFO: renamed from: e */
    public final Handler f40744e;

    /* JADX INFO: renamed from: f */
    public final rm8 f40745f;

    /* JADX INFO: renamed from: g */
    public SurfaceTexture f40746g;

    /* JADX INFO: renamed from: h */
    public Surface f40747h;

    /* JADX INFO: renamed from: i */
    public boolean f40748i;

    /* JADX INFO: renamed from: j */
    public boolean f40749j;

    /* JADX INFO: renamed from: k */
    public boolean f40750k;

    public gf9(Context context) {
        super(context, null);
        this.f40740a = new CopyOnWriteArrayList();
        this.f40744e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f40741b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f40742c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        rm8 rm8Var = new rm8();
        this.f40745f = rm8Var;
        ff9 ff9Var = new ff9(this, rm8Var);
        View.OnTouchListener z7aVar = new z7a(context, ff9Var);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f40743d = new yz6(windowManager.getDefaultDisplay(), z7aVar, ff9Var);
        this.f40748i = true;
        setEGLContextClientVersion(2);
        setRenderer(ff9Var);
        setOnTouchListener(z7aVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m12568a() {
        boolean z = this.f40748i && this.f40749j;
        Sensor sensor = this.f40742c;
        if (sensor == null || z == this.f40750k) {
            return;
        }
        yz6 yz6Var = this.f40743d;
        SensorManager sensorManager = this.f40741b;
        if (z) {
            sensorManager.registerListener(yz6Var, sensor, 0);
        } else {
            sensorManager.unregisterListener(yz6Var);
        }
        this.f40750k = z;
    }

    public im0 getCameraMotionListener() {
        return this.f40745f;
    }

    public wpa getVideoFrameMetadataListener() {
        return this.f40745f;
    }

    public Surface getVideoSurface() {
        return this.f40747h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40744e.post(new mt6(this, 9));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f40749j = false;
        m12568a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f40749j = true;
        m12568a();
    }

    public void setDefaultStereoMode(int i) {
        this.f40745f.f59552k = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.f40748i = z;
        m12568a();
    }
}
