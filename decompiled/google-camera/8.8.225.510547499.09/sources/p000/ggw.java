package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ggw extends kfv {

    /* JADX INFO: renamed from: a */
    public boolean f24706a = true;

    /* JADX INFO: renamed from: c */
    private volatile Long f24708c = null;

    /* JADX INFO: renamed from: b */
    public volatile Long f24707b = null;

    /* JADX INFO: renamed from: p */
    private final void m9234p() {
        synchronized (this) {
            this.f24706a = false;
            notifyAll();
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        int iIntValue;
        Integer num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE);
        if (num != null && ((iIntValue = num.intValue()) == 2 || iIntValue == 6 || iIntValue == 4 || iIntValue == 5)) {
            this.f24707b = Long.valueOf(kppVar.mo9515b());
            m9234p();
            return;
        }
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            if (this.f24708c == null) {
                this.f24708c = l;
            }
            if (l.longValue() - this.f24708c.longValue() > 1000000000) {
                m9234p();
            }
        }
    }
}
