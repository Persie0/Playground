package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hkb implements gys {

    /* JADX INFO: renamed from: g */
    private static final nbh f28102g = nbh.m17259h("com/google/android/apps/camera/stats/CaptureSessionTrace");

    /* JADX INFO: renamed from: a */
    public long f28103a;

    /* JADX INFO: renamed from: b */
    public long f28104b;

    /* JADX INFO: renamed from: c */
    public long f28105c;

    /* JADX INFO: renamed from: d */
    public long f28106d;

    /* JADX INFO: renamed from: e */
    public long f28107e;

    /* JADX INFO: renamed from: f */
    public List f28108f;

    /* JADX INFO: renamed from: h */
    private final fcp f28109h;

    /* JADX INFO: renamed from: i */
    private final gyu f28110i;

    /* JADX INFO: renamed from: j */
    private gyw f28111j;

    /* JADX INFO: renamed from: k */
    private long f28112k;

    /* JADX INFO: renamed from: l */
    private long f28113l;

    /* JADX INFO: renamed from: m */
    private long f28114m;

    /* JADX INFO: renamed from: n */
    private long f28115n;

    /* JADX INFO: renamed from: o */
    private long f28116o;

    /* JADX INFO: renamed from: p */
    private long f28117p;

    /* JADX INFO: renamed from: q */
    private boolean f28118q = false;

    /* JADX INFO: renamed from: r */
    private boolean f28119r = false;

    public hkb(fcp fcpVar, gyu gyuVar) {
        this.f28109h = fcpVar;
        this.f28110i = gyuVar;
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: a */
    public final void mo6399a() {
        if (this.f28118q) {
            return;
        }
        ((nbe) ((nbe) f28102g.m17252c()).mo17276G((char) 3704)).mo17293r("onCaptureFinalized invoked without the final result being set!%s", kfv.m14167D());
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: b */
    public final void mo6400b() {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: c */
    public final void mo6401c(fcu fcuVar) {
        if (this.f28119r) {
            ((nbe) ((nbe) f28102g.m17252c()).mo17276G((char) 3714)).mo17293r("onCaptureStarted invoked after stated event was logged!%s", kfv.m14167D());
            return;
        }
        this.f28119r = true;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.f28103a = jElapsedRealtimeNanos;
        this.f28111j = fcuVar.f21288a;
        this.f28109h.mo8200t(jElapsedRealtimeNanos, fcuVar);
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: d */
    public final void mo6402d(Bitmap bitmap) {
        this.f28113l = SystemClock.elapsedRealtimeNanos();
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: e */
    public final void mo6403e() {
        this.f28114m = SystemClock.elapsedRealtimeNanos();
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: f */
    public final void mo6404f(mrm mrmVar) {
        if (mrmVar.mo16813g()) {
            this.f28116o = ((hkz) mrmVar.mo16809c()).m10428c();
            this.f28117p = ((hkz) mrmVar.mo16809c()).m10429d();
        }
        this.f28112k = SystemClock.elapsedRealtimeNanos();
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: g */
    public final void mo6405g(int i, int i2, Throwable th) {
        if (!this.f28119r) {
            ((nbe) ((nbe) f28102g.m17252c()).mo17276G((char) 3699)).mo17293r("onCaptureCanceled invoked before capture was started!%s", kfv.m14167D());
        } else if (this.f28118q) {
            ((nbe) ((nbe) f28102g.m17252c()).mo17276G((char) 3698)).mo17293r("onCaptureCanceled invoked after final event was logged!%s", kfv.m14167D());
        } else {
            this.f28118q = true;
            this.f28109h.mo8161af(this.f28103a, this.f28111j, i, i2, th);
        }
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: h */
    public final void mo6406h(int i, int i2, Throwable th) {
        if (!this.f28119r) {
            nbw nbwVarM17252c = f28102g.m17252c();
            ((nbe) ((nbe) nbwVarM17252c).mo17276G((char) 3702)).mo17293r(yTyWiTtGtnBhy.gJxM, kfv.m14167D());
        } else if (this.f28118q) {
            ((nbe) ((nbe) f28102g.m17252c()).mo17276G((char) 3701)).mo17293r("onCaptureFailed invoked after final event was logged!%s", kfv.m14167D());
        } else {
            this.f28118q = true;
            this.f28109h.mo8162ag(this.f28103a, this.f28111j, i, i2, th);
        }
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: i */
    public final void mo6407i(int i, int i2) {
        if (!this.f28119r) {
            ((nbe) ((nbe) f28102g.m17252c()).mo17276G((char) 3709)).mo17293r("onCapturePersisted invoked before capture was started!%s", kfv.m14167D());
        } else {
            if (this.f28118q) {
                ((nbe) ((nbe) f28102g.m17252c()).mo17276G((char) 3708)).mo17293r("onCapturePersisted invoked after final event was logged!%s", kfv.m14167D());
                return;
            }
            this.f28118q = true;
            this.f28115n = SystemClock.elapsedRealtimeNanos();
            TimeUnit.NANOSECONDS.toMillis(this.f28115n - this.f28103a);
            TimeUnit.NANOSECONDS.toMillis(this.f28104b - this.f28103a);
            TimeUnit.NANOSECONDS.toMillis(this.f28115n - this.f28105c);
            this.f28109h.mo8163ah(this.f28116o, this.f28117p, this.f28103a, this.f28112k, this.f28113l, this.f28114m, this.f28104b, this.f28105c, this.f28106d, this.f28107e, this.f28108f, this.f28115n, this.f28111j, i, i2);
        }
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: j */
    public final void mo6408j(int i, int i2) {
        if (!this.f28119r) {
            ((nbe) ((nbe) f28102g.m17252c()).mo17276G((char) 3712)).mo17293r("onCaptureStartCommitted invoked before capture was started!%s", kfv.m14167D());
        } else if (!this.f28118q) {
            this.f28109h.mo8164ai(this.f28103a, this.f28111j, i, i2);
        } else {
            ((nbe) ((nbe) f28102g.m17252c()).mo17276G((char) 3711)).mo17293r("onCaptureStartCommitted invoked after final event was logged!%s", kfv.m14167D());
        }
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16823b("shotId", this.f28110i);
        mrlVarM16765d.m16827f("CaptureStartTimeNs", this.f28103a);
        mrlVarM16765d.m16827f("ShutterButtonDownTimeNs", this.f28116o);
        mrlVarM16765d.m16827f("ShutterButtonUpTimeNs", this.f28117p);
        mrlVarM16765d.m16827f("TinyThumbTimeNs", this.f28112k);
        mrlVarM16765d.m16827f("MediumThumbTimeNs", this.f28113l);
        mrlVarM16765d.m16827f("ProcessingStartedTimeNs", this.f28104b);
        mrlVarM16765d.m16827f("ProcessingCompleteTimeNs", this.f28105c);
        mrlVarM16765d.m16827f("CapturePersistedTimeNs", this.f28115n);
        mrlVarM16765d.m16823b("SessionType", this.f28111j);
        return mrlVarM16765d.toString();
    }
}
