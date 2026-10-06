package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hhv implements hht {

    /* JADX INFO: renamed from: a */
    public final hhx f27860a;

    /* JADX INFO: renamed from: b */
    public final hhx f27861b;

    /* JADX INFO: renamed from: c */
    public boolean f27862c;

    /* JADX INFO: renamed from: d */
    private final kbz f27863d;

    /* JADX INFO: renamed from: e */
    private final hai f27864e;

    /* JADX INFO: renamed from: f */
    private final Handler f27865f = jvh.m13557e(Looper.getMainLooper());

    public hhv(hhx hhxVar, hhx hhxVar2, kbz kbzVar, jvd jvdVar, fan fanVar, hai haiVar) {
        this.f27860a = hhxVar;
        this.f27861b = hhxVar2;
        this.f27863d = kbzVar;
        this.f27864e = haiVar;
        fdh.m8265e(jvdVar, fanVar, new hhu(this));
    }

    /* JADX INFO: renamed from: i */
    private final void m10322i(int i, float f, int i2) {
        if (this.f27862c) {
            if (i2 == 2) {
                this.f27861b.mo10329f(i, f);
            } else {
                this.f27860a.mo10329f(i, f);
            }
        }
        if (i == C0100R.raw.camera_shutter || i == C0100R.raw.video_stop || i == C0100R.raw.longexposure_stop) {
            this.f27865f.postDelayed(new hfr(this, 9), 100L);
        }
    }

    @Override // p000.hht
    /* JADX INFO: renamed from: a */
    public final void mo10315a() {
        this.f27860a.mo10325b();
        this.f27861b.mo10325b();
    }

    @Override // p000.hht
    /* JADX INFO: renamed from: b */
    public final void mo10316b(int i) {
        m10322i(i, 0.6f, 1);
    }

    @Override // p000.hht
    /* JADX INFO: renamed from: c */
    public final void mo10317c(int i) {
        mo10320f(i, 1);
    }

    @Override // p000.hht
    /* JADX INFO: renamed from: d */
    public final void mo10318d() {
        this.f27863d.mo13961e("Sounds#shutter");
        this.f27860a.mo10324a(C0100R.raw.camera_shutter);
        this.f27863d.mo13963g("Sounds#video_start");
        this.f27860a.mo10324a(C0100R.raw.video_start);
        this.f27863d.mo13962f();
    }

    @Override // p000.hht
    /* JADX INFO: renamed from: e */
    public final void mo10319e() {
        this.f27860a.mo10326c();
        this.f27861b.mo10326c();
    }

    @Override // p000.hht
    /* JADX INFO: renamed from: f */
    public final void mo10320f(int i, int i2) {
        m10322i(i, 1.0f, i2);
    }

    @Override // p000.hht
    /* JADX INFO: renamed from: g */
    public final void mo10321g() {
        this.f27860a.mo10328e();
        this.f27861b.mo10328e();
    }

    /* JADX INFO: renamed from: h */
    public final void m10323h() {
        this.f27864e.mo10033e(gzy.f27057p, false);
    }
}
