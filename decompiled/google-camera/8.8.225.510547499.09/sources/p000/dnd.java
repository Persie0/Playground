package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dnd extends kfv implements fbn {

    /* JADX INFO: renamed from: a */
    private long f12082a = -1;

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        this.f12082a = -1L;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        long jLongValue = l == null ? -1L : l.longValue();
        long j = this.f12082a;
        double dM13805H = j >= 0 ? jzn.m13805H(jLongValue - j) : -1.0d;
        this.f12082a = jLongValue;
        mo6423g(dM13805H);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo6423g(double d);
}
