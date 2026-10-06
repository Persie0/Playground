package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgc implements kbg {

    /* JADX INFO: renamed from: a */
    public final nqf f35866a;

    /* JADX INFO: renamed from: b */
    private final CaptureResult.Key f35867b;

    /* JADX INFO: renamed from: c */
    private final mxk f35868c;

    /* JADX INFO: renamed from: d */
    private final long f35869d;

    /* JADX INFO: renamed from: e */
    private final long f35870e;

    /* JADX INFO: renamed from: f */
    private long f35871f = -1;

    /* JADX INFO: renamed from: g */
    private long f35872g = -1;

    public kgc(CaptureResult.Key key, mxk mxkVar, long j, long j2) {
        this.f35867b = key;
        this.f35868c = mxkVar;
        this.f35869d = j <= 0 ? 3000000000L : j;
        this.f35870e = j2 <= 0 ? 60L : j2;
        this.f35866a = nqf.m17621g();
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void mo3415bf(kpl kplVar) {
        if (this.f35866a.isDone()) {
            return;
        }
        Long l = (Long) kplVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        kfd kfdVar = new kfd(l == null ? -1L : l.longValue(), kplVar.mo9515b(), kplVar.mo9514a());
        if (this.f35868c.isEmpty()) {
            this.f35866a.mo14894e(kfdVar);
            return;
        }
        if (l != null) {
            if (this.f35871f == -1) {
                this.f35871f = l.longValue();
            }
            if (l.longValue() - this.f35871f > this.f35869d) {
                this.f35866a.mo14894e(kfdVar);
                return;
            }
        }
        if (this.f35872g == -1) {
            this.f35872g = kplVar.mo9515b();
        }
        if (kplVar.mo9515b() - this.f35872g > this.f35870e) {
            this.f35866a.mo14894e(kfdVar);
            return;
        }
        if (this.f35868c.contains(kplVar.mo9517d(this.f35867b))) {
            this.f35866a.mo14894e(kfdVar);
        }
    }
}
