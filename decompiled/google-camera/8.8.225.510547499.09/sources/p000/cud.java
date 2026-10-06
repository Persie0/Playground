package p000;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cud extends kfv {

    /* JADX INFO: renamed from: a */
    private final jyx f9593a;

    /* JADX INFO: renamed from: b */
    private boolean f9594b;

    /* JADX INFO: renamed from: c */
    private long f9595c;

    public cud(jyx jyxVar) {
        this.f9593a = jyxVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final synchronized void mo3408bu(kpp kppVar) {
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        l.getClass();
        long jLongValue = l.longValue() / 1000;
        if (!this.f9594b) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
            long jUptimeMillis = SystemClock.uptimeMillis();
            Long.signum(jUptimeMillis);
            this.f9595c = jElapsedRealtimeNanos - (jUptimeMillis * 1000);
            this.f9594b = true;
        }
        long j = jLongValue - this.f9595c;
        mrm mrmVarMo13757p = this.f9593a.mo13757p();
        if (mrmVarMo13757p.mo16813g()) {
            ((jyr) mrmVarMo13757p.mo16809c()).mo5581l(new lrd(kppVar), j);
        }
    }
}
