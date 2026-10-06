package p000;

import android.hardware.camera2.CameraAccessException;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eho implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f14056a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f14057b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f14058c;

    public eho(eft eftVar, long j, int i) {
        this.f14058c = i;
        this.f14057b = eftVar;
        this.f14056a = j;
    }

    public eho(ehq ehqVar, long j, int i) {
        this.f14058c = i;
        this.f14057b = ehqVar;
        this.f14056a = j;
    }

    public eho(fgh fghVar, long j, int i) {
        this.f14058c = i;
        this.f14057b = fghVar;
        this.f14056a = j;
    }

    public eho(hbv hbvVar, long j, int i) {
        this.f14058c = i;
        this.f14057b = hbvVar;
        this.f14056a = j;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        int i = 4;
        switch (this.f14058c) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    bool.booleanValue();
                }
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                if (bool2 != null) {
                    bool2.booleanValue();
                }
                break;
            case 2:
                ((fgh) this.f14057b).f21850b.execute(new eqd((fgg) obj, TimeUnit.MICROSECONDS.convert(this.f14056a, TimeUnit.NANOSECONDS), 4));
                break;
            default:
                dnl dnlVar = (dnl) obj;
                long jUptimeMillis = SystemClock.uptimeMillis() - this.f14056a;
                kcc kccVar = ((hbv) this.f14057b).f27189s;
                if (kccVar != null) {
                    kccVar.mo13952a();
                }
                if (dnlVar.f12100a) {
                    ((hbv) this.f14057b).f27181k.m10098a(true, 0, 0);
                } else {
                    Exception exc = dnlVar.f12102c;
                    kcl kclVar = dnlVar.f12101b;
                    int i2 = kclVar != null ? kclVar.f35597u : 0;
                    ((nbe) ((nbe) ((nbe) hbv.f27171a.m17252c()).mo17283h(exc)).mo17276G(3428)).mo17271B("HAL failed to restart after %dms due to error (%d): %s", Long.valueOf(jUptimeMillis), Integer.valueOf(i2), kclVar != null ? kclVar.m13983c() : "");
                    if (((hbv) this.f14057b).f27173c.m6200b(dja.DOGFOOD)) {
                        ((hbv) this.f14057b).f27191u.m6220A();
                    }
                    if (exc instanceof TimeoutException) {
                        i = 7;
                    } else if (exc instanceof InterruptedException) {
                        i = 8;
                    } else if (!(exc instanceof CameraAccessException)) {
                        i = 3;
                    }
                    ((hbv) this.f14057b).f27181k.m10099b(i2, i);
                }
                ((hbv) this.f14057b).f27187q.mo14894e(true);
                break;
        }
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f14058c) {
            case 0:
                ((nbe) ((nbe) ((nbe) ehr.f14086b.m17252c()).mo17283h(th)).mo17276G(1461)).mo17292q("Portrait effect failed for shot %d", this.f14056a);
                ((ehq) this.f14057b).f14083t = true;
                ((ehq) this.f14057b).m7329f(this.f14056a, mqu.f41450a);
                break;
            case 1:
                ((nbe) ((nbe) ((nbe) efu.f13876a.m17252c()).mo17283h(th)).mo17276G(1393)).mo17300y("[%s] Fusion effect failed for shot %d", ((eft) this.f14057b).f13861c, this.f14056a);
                nxl nxlVar = ((eft) this.f14057b).f13867i;
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                niz nizVar = (niz) nxlVar.f44974b;
                niz nizVar2 = niz.f42849e;
                nizVar.f42853c = 3;
                nizVar.f42851a |= 2;
                ((eft) this.f14057b).f13875q = true;
                ((eft) this.f14057b).m7284f(this.f14056a);
                break;
            case 2:
                ((nbe) ((nbe) fgh.f21843a.m17252c()).mo17276G((char) 2185)).mo17290o("Cannot get final shutter timestamp from microvideo as it failed to start!");
                break;
            default:
                long jUptimeMillis = SystemClock.uptimeMillis() - this.f14056a;
                kcc kccVar = ((hbv) this.f14057b).f27189s;
                if (kccVar != null) {
                    kccVar.mo13952a();
                }
                ((nbe) ((nbe) ((nbe) hbv.f27171a.m17251b()).mo17283h(th)).mo17276G(3427)).mo17292q("HAL failed to restart after %dms due to an exception.", jUptimeMillis);
                if (((hbv) this.f14057b).f27173c.m6200b(dja.DOGFOOD)) {
                    ((hbv) this.f14057b).f27191u.m6220A();
                }
                ((hbv) this.f14057b).f27187q.mo14894e(true);
                ((hbv) this.f14057b).f27181k.m10099b(kcl.CAMERA_ERROR_CODE_UNKNOWN.f35597u, 4);
                break;
        }
    }
}
