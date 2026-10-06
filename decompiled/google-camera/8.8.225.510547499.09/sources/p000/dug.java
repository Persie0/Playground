package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dug implements dth, dtf, dte, dto {

    /* JADX INFO: renamed from: a */
    public final dvg f12589a;

    /* JADX INFO: renamed from: b */
    private final dth f12590b;

    /* JADX INFO: renamed from: c */
    private final dte f12591c;

    /* JADX INFO: renamed from: d */
    private final dtf f12592d;

    /* JADX INFO: renamed from: e */
    private final dto f12593e;

    public dug(dvg dvgVar, dth dthVar, dte dteVar, dtf dtfVar, dto dtoVar) {
        this.f12589a = dvgVar;
        this.f12590b = dthVar;
        this.f12591c = dteVar;
        this.f12592d = dtfVar;
        this.f12593e = dtoVar;
    }

    @Override // p000.dtf
    /* JADX INFO: renamed from: a */
    public final void mo6718a() {
        this.f12592d.mo6718a();
    }

    @Override // p000.dte
    /* JADX INFO: renamed from: b */
    public final void mo4009b(key keyVar, kgg kggVar) {
        this.f12591c.mo4009b(keyVar, kggVar);
    }

    @Override // p000.dtf
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo6719c(kmd kmdVar) {
    }

    @Override // p000.dtf
    /* JADX INFO: renamed from: d */
    public final void mo6720d(kmd kmdVar, cem cemVar) {
        this.f12592d.mo6720d(kmdVar, cemVar);
    }

    @Override // p000.dth
    /* JADX INFO: renamed from: e */
    public final boolean mo6726e() {
        return this.f12590b.mo6726e();
    }

    @Override // p000.dto
    /* JADX INFO: renamed from: f */
    public final Set mo6741f() {
        return this.f12593e.mo6741f();
    }

    @Override // p000.dto
    /* JADX INFO: renamed from: g */
    public final void mo6742g(Sensor sensor) {
        this.f12593e.mo6742g(sensor);
    }

    @Override // p000.dto
    /* JADX INFO: renamed from: h */
    public final void mo6743h(Sensor sensor) {
        this.f12593e.mo6743h(sensor);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        this.f12593e.onAccuracyChanged(sensor, i);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f12593e.onSensorChanged(sensorEvent);
    }
}
