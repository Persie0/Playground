package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsh {

    /* JADX INFO: renamed from: a */
    public gsm f26217a;

    /* JADX INFO: renamed from: c */
    private gsq f26219c;

    /* JADX INFO: renamed from: b */
    public long f26218b = 0;

    /* JADX INFO: renamed from: d */
    private final Handler f26220d = jvh.m13557e(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public final void m9703a() {
        gsq gsqVar = this.f26219c;
        lku.m15662p(gsqVar);
        gsqVar.mo9702b();
        m9707e();
        m9708f();
    }

    /* JADX INFO: renamed from: b */
    public final void m9704b() {
        gsq gsqVar = this.f26219c;
        lku.m15662p(gsqVar);
        gsqVar.mo9701a();
        m9707e();
        m9708f();
    }

    /* JADX INFO: renamed from: c */
    public final void m9705c() {
        gsm gsmVar = this.f26217a;
        lku.m15662p(gsmVar);
        if (SystemClock.uptimeMillis() - this.f26218b > 300) {
            gsmVar.mo9700b();
        } else {
            this.f26220d.removeCallbacks(new gpn(gsmVar, 13));
            this.f26220d.postDelayed(new gpn(gsmVar, 13), 300L);
        }
        m9707e();
        m9708f();
    }

    /* JADX INFO: renamed from: d */
    public final void m9706d(ProgressOverlay progressOverlay) {
        this.f26217a = new gsm(progressOverlay);
        gsq gsqVar = new gsq(progressOverlay, this.f26217a);
        this.f26219c = gsqVar;
        gsqVar.mo5711f();
    }

    /* JADX INFO: renamed from: e */
    public final void m9707e() {
        boolean z = this.f26219c.f26232b;
    }

    /* JADX INFO: renamed from: f */
    public final void m9708f() {
        boolean z = this.f26217a.f26224b;
    }
}
