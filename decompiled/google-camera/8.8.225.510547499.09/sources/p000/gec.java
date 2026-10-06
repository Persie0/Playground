package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gec implements kbg {

    /* JADX INFO: renamed from: b */
    private static final nbh f24356b = nbh.m17259h("com/google/android/apps/camera/one/util/TimestampWaiter");

    /* JADX INFO: renamed from: c */
    private final long f24358c;

    /* JADX INFO: renamed from: d */
    private Long f24359d;

    /* JADX INFO: renamed from: e */
    private boolean f24360e = false;

    /* JADX INFO: renamed from: a */
    public final nqf f24357a = nqf.m17621g();

    public gec(long j) {
        this.f24358c = j;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void mo3415bf(kpl kplVar) {
        if (this.f24360e) {
            return;
        }
        if (this.f24359d == null) {
            this.f24359d = Long.valueOf(kplVar.mo9515b());
        }
        long jMo9515b = kplVar.mo9515b();
        Long l = this.f24359d;
        lku.m15662p(l);
        long jLongValue = jMo9515b - l.longValue();
        Long l2 = (Long) kplVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        if (l2 != null && l2.longValue() > this.f24358c) {
            this.f24360e = true;
            this.f24357a.mo14894e(true);
        } else if (jLongValue >= 10) {
            ((nbe) ((nbe) f24356b.m17252c()).mo17276G(2574)).mo17271B("timeout waiting for %d at %d, after %dframes", Long.valueOf(this.f24358c), l2, Long.valueOf(jLongValue));
            this.f24360e = true;
            this.f24357a.mo14894e(false);
        }
    }
}
