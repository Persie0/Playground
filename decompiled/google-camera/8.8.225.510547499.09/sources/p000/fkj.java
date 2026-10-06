package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkj implements SensorEventListener, dtf, kos {

    /* JADX INFO: renamed from: a */
    public final SensorManager f22375a;

    /* JADX INFO: renamed from: b */
    public final inm f22376b;

    /* JADX INFO: renamed from: c */
    public mrm f22377c;

    /* JADX INFO: renamed from: d */
    public final kov f22378d;

    /* JADX INFO: renamed from: e */
    public final dvg f22379e;

    /* JADX INFO: renamed from: f */
    public final dvg f22380f;

    /* JADX INFO: renamed from: g */
    private final ing f22381g;

    /* JADX INFO: renamed from: h */
    private final Sensor f22382h;

    /* JADX INFO: renamed from: i */
    private final Sensor f22383i;

    /* JADX INFO: renamed from: j */
    private final Executor f22384j;

    /* JADX INFO: renamed from: k */
    private final float[] f22385k;

    /* JADX INFO: renamed from: l */
    private int f22386l;

    /* JADX INFO: renamed from: m */
    private mrm f22387m;

    public fkj(kov kovVar, SensorManager sensorManager, inm inmVar, dvg dvgVar, dvg dvgVar2, Executor executor) {
        mqu mquVar = mqu.f41450a;
        this.f22377c = mquVar;
        this.f22386l = 0;
        this.f22387m = mquVar;
        this.f22375a = sensorManager;
        this.f22376b = inmVar;
        this.f22378d = kovVar;
        this.f22379e = dvgVar;
        this.f22380f = dvgVar2;
        this.f22384j = executor;
        this.f22385k = new float[3];
        this.f22381g = new ing();
        this.f22382h = sensorManager.getDefaultSensor(1);
        this.f22383i = sensorManager.getDefaultSensor(4);
    }

    /* JADX INFO: renamed from: f */
    private final synchronized kba m8507f() {
        this.f22375a.registerListener(this, this.f22382h, 1);
        this.f22375a.registerListener(this, this.f22383i, 1);
        this.f22378d.m14648b(this);
        return new ezc(this, 8);
    }

    /* JADX INFO: renamed from: g */
    private final synchronized void m8508g(kmd kmdVar) {
        this.f22376b.m11526b(kmdVar);
        this.f22377c = mqu.f41450a;
    }

    @Override // p000.dtf
    /* JADX INFO: renamed from: a */
    public final synchronized void mo6718a() {
        int i = this.f22386l - 1;
        this.f22386l = i;
        if (i == 0) {
            this.f22376b.m11525a();
            if (this.f22387m.mo16813g()) {
                ((jvb) this.f22387m.mo16809c()).close();
                this.f22387m = mqu.f41450a;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8509b() {
        float degrees;
        int i = this.f22378d.m14647a().f35503e;
        float[] fArrM11530f = this.f22376b.m11530f();
        float degrees2 = (float) Math.toDegrees(Math.asin(fArrM11530f[6]));
        if (i == 90) {
            degrees = (float) Math.toDegrees(Math.asin(-fArrM11530f[5]));
        } else if (i == 180) {
            degrees = (float) Math.toDegrees(Math.asin(-fArrM11530f[4]));
        } else {
            degrees = i == 270 ? (float) (-Math.toDegrees(Math.asin(-fArrM11530f[5]))) : (float) (-Math.toDegrees(Math.asin(-fArrM11530f[4])));
        }
        this.f22380f.m6775h(((Long) this.f22377c.mo16809c()).longValue(), i, degrees2, degrees);
    }

    @Override // p000.dtf
    /* JADX INFO: renamed from: c */
    public final synchronized void mo6719c(kmd kmdVar) {
        m8508g(kmdVar);
        if (this.f22386l == 0) {
            lku.m15613H(!this.f22387m.mo16813g());
            jvb jvbVar = new jvb();
            jvbVar.m13537d(m8507f());
            this.f22387m = mrm.m16829i(jvbVar);
        }
        this.f22386l++;
    }

    @Override // p000.dtf
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo6720d(kmd kmdVar, cem cemVar) {
        dti.m6728b(this, kmdVar);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m8510e() {
        float[] fArrM11530f = this.f22376b.m11530f();
        ing ingVar = this.f22381g;
        double d = fArrM11530f[0];
        double d2 = fArrM11530f[5];
        double d3 = fArrM11530f[10];
        Double.isNaN(d);
        double d4 = d + 1.0d;
        Double.isNaN(d2);
        Double.isNaN(d3);
        ingVar.f31590d = Math.sqrt(Math.max(0.0d, d4 + d2 + d3)) * 0.5d;
        Double.isNaN(d2);
        Double.isNaN(d3);
        ingVar.f31587a = Math.sqrt(Math.max(0.0d, (d4 - d2) - d3)) * 0.5d;
        Double.isNaN(d);
        double d5 = 1.0d - d;
        Double.isNaN(d2);
        Double.isNaN(d3);
        ingVar.f31588b = Math.sqrt(Math.max(0.0d, (d5 + d2) - d3)) * 0.5d;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double dSqrt = Math.sqrt(Math.max(0.0d, (d5 - d2) + d3)) * 0.5d;
        float f = fArrM11530f[6] - fArrM11530f[9];
        double d6 = ingVar.f31587a;
        if ((f < 0.0f) != (d6 < 0.0d)) {
            d6 = -d6;
        }
        ingVar.f31587a = d6;
        boolean z = fArrM11530f[8] - fArrM11530f[2] < 0.0f;
        double d7 = ingVar.f31588b;
        if (z != (d7 < 0.0d)) {
            d7 = -d7;
        }
        ingVar.f31588b = d7;
        if ((fArrM11530f[1] - fArrM11530f[4] < 0.0f) != (dSqrt < 0.0d)) {
            dSqrt = -dSqrt;
        }
        ingVar.f31589c = dSqrt;
        ing ingVar2 = this.f22381g;
        float[] fArr = this.f22385k;
        lku.m15669w(true);
        double d8 = ingVar2.f31587a;
        double d9 = ingVar2.f31588b;
        double d10 = ingVar2.f31589c;
        double d11 = (d8 * d8) + (d9 * d9) + (d10 * d10);
        if (d11 > 0.0d) {
            double dSqrt2 = Math.sqrt(d11);
            double d12 = ingVar2.f31590d;
            double dAtan2 = d12 < 0.0d ? Math.atan2(-dSqrt2, -d12) : Math.atan2(dSqrt2, d12);
            double d13 = (dAtan2 + dAtan2) / dSqrt2;
            fArr[0] = (float) (d8 * d13);
            fArr[1] = (float) (d9 * d13);
            fArr[2] = (float) (d10 * d13);
        } else {
            fArr[0] = (float) (d8 + d8);
            fArr[1] = (float) (d9 + d9);
            fArr[2] = (float) (d10 + d10);
        }
        this.f22379e.m6775h(((Long) this.f22377c.mo16809c()).longValue(), this.f22385k);
    }

    @Override // p000.kos
    /* JADX INFO: renamed from: h */
    public final void mo3955h(kay kayVar) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f22384j.execute(new ewo(this, sensorEvent, 14));
    }
}
