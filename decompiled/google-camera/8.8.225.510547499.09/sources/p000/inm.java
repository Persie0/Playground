package p000;

import android.hardware.SensorEvent;
import android.opengl.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class inm {

    /* JADX INFO: renamed from: c */
    private final float[] f31603c = new float[16];

    /* JADX INFO: renamed from: d */
    private final float[] f31604d = new float[16];

    /* JADX INFO: renamed from: e */
    private boolean f31605e = false;

    /* JADX INFO: renamed from: f */
    private boolean f31606f = false;

    /* JADX INFO: renamed from: g */
    private boolean f31607g = false;

    /* JADX INFO: renamed from: h */
    private final float[] f31608h = new float[16];

    /* JADX INFO: renamed from: a */
    public boolean f31601a = false;

    /* JADX INFO: renamed from: b */
    private final eas f31602b = eas.m7006b();

    /* JADX INFO: renamed from: g */
    private final synchronized void m11524g() {
        double[] dArrM7015h = this.f31602b.m7015h();
        for (int i = 0; i < 16; i++) {
            if (Double.isNaN(dArrM7015h[i])) {
                this.f31602b.m7012e();
                return;
            }
            this.f31603c[i] = (float) dArrM7015h[i];
        }
        Matrix.rotateM(this.f31603c, 0, -90.0f, 1.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(this.f31604d, 0, this.f31608h, 0, this.f31603c, 0);
        Matrix.rotateM(this.f31604d, 0, 0.0f, 1.0f, 0.0f, 0.0f);
        this.f31601a = true;
        this.f31605e = this.f31606f;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m11525a() {
        this.f31602b.m7012e();
        this.f31607g = false;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m11526b(kmd kmdVar) {
        this.f31606f = kmdVar.mo14558k() == kmq.f36557a;
        this.f31607g = true;
        Matrix.setRotateM(this.f31608h, 0, 180.0f, 1.0f, 0.0f, 0.0f);
        if (this.f31602b.m7014g()) {
            m11524g();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m11527c() {
        return this.f31605e;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m11528d() {
        return this.f31607g;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m11529e(SensorEvent sensorEvent) {
        if (!this.f31607g) {
            return false;
        }
        if (sensorEvent.sensor.getType() == 1) {
            this.f31602b.m7010c((float[]) sensorEvent.values.clone(), sensorEvent.timestamp);
        } else if (sensorEvent.sensor.getType() == 4) {
            this.f31602b.m7011d((float[]) sensorEvent.values.clone(), sensorEvent.timestamp);
        }
        if (!this.f31602b.m7014g()) {
            return false;
        }
        m11524g();
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized float[] m11530f() {
        return this.f31604d;
    }
}
