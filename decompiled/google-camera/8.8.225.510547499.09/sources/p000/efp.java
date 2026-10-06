package p000;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efp extends kfv {

    /* JADX INFO: renamed from: a */
    private final kbg f13843a;

    /* JADX INFO: renamed from: b */
    private final kbg f13844b;

    /* JADX INFO: renamed from: c */
    private final int f13845c;

    /* JADX INFO: renamed from: d */
    private final fcp f13846d;

    /* JADX INFO: renamed from: e */
    private int f13847e = 0;

    /* JADX INFO: renamed from: f */
    private long f13848f = 0;

    public efp(jwf jwfVar, jwf jwfVar2, dhv dhvVar, jvb jvbVar, fcp fcpVar) {
        this.f13844b = jwfVar;
        this.f13843a = jwfVar2;
        this.f13845c = ((Integer) dhvVar.mo6173a(dht.f11175c).orElse(1)).intValue();
        this.f13846d = fcpVar;
        jvbVar.m13537d(new eds(this, 2));
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        Integer num;
        Boolean bool = (Boolean) kppVar.mo9517d(ivw.f32417c);
        if (bool == null || !bool.booleanValue()) {
            m7281i();
        } else {
            if (this.f13848f == 0) {
                this.f13848f = SystemClock.uptimeMillis();
            }
            this.f13847e = 0;
            this.f13843a.mo3415bf(true);
        }
        CaptureResult.Key key = ivw.f32430p;
        if (key == null || (num = (Integer) kppVar.mo9517d(key)) == null) {
            return;
        }
        this.f13844b.mo3415bf(Boolean.valueOf(num.intValue() == 2));
    }

    /* JADX INFO: renamed from: i */
    public final void m7281i() {
        if (this.f13848f != 0) {
            this.f13846d.mo8201u((int) (SystemClock.uptimeMillis() - this.f13848f));
            this.f13848f = 0L;
        }
        int i = this.f13847e + 1;
        this.f13847e = i;
        if (i == this.f13845c) {
            this.f13843a.mo3415bf(false);
        }
    }
}
