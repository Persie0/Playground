package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffl {

    /* JADX INFO: renamed from: A */
    private final htf f21654A;

    /* JADX INFO: renamed from: a */
    public final igb f21655a;

    /* JADX INFO: renamed from: b */
    public final iuj f21656b;

    /* JADX INFO: renamed from: c */
    public final hxw f21657c;

    /* JADX INFO: renamed from: d */
    public final icf f21658d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f21659e;

    /* JADX INFO: renamed from: g */
    public final BottomBarController f21661g;

    /* JADX INFO: renamed from: h */
    public final gfa f21662h;

    /* JADX INFO: renamed from: i */
    public final iey f21663i;

    /* JADX INFO: renamed from: j */
    public final ggm f21664j;

    /* JADX INFO: renamed from: k */
    public final jvd f21665k;

    /* JADX INFO: renamed from: l */
    public final dhv f21666l;

    /* JADX INFO: renamed from: r */
    public final boolean f21672r;

    /* JADX INFO: renamed from: t */
    public final hsk f21674t;

    /* JADX INFO: renamed from: u */
    public final dfo f21675u;

    /* JADX INFO: renamed from: v */
    public final ikt f21676v;

    /* JADX INFO: renamed from: w */
    public final ljf f21677w;

    /* JADX INFO: renamed from: x */
    private final hht f21678x;

    /* JADX INFO: renamed from: y */
    private final fgs f21679y;

    /* JADX INFO: renamed from: z */
    private final fcp f21680z;

    /* JADX INFO: renamed from: m */
    public jvb f21667m = new jvb();

    /* JADX INFO: renamed from: n */
    public volatile ScheduledFuture f21668n = null;

    /* JADX INFO: renamed from: o */
    public boolean f21669o = false;

    /* JADX INFO: renamed from: p */
    public boolean f21670p = false;

    /* JADX INFO: renamed from: q */
    public boolean f21671q = false;

    /* JADX INFO: renamed from: s */
    public final AtomicReference f21673s = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final Handler f21660f = jvh.m13557e(Looper.getMainLooper());

    public ffl(dhv dhvVar, gfa gfaVar, BottomBarController bottomBarController, igb igbVar, final ikt iktVar, iuj iujVar, hxw hxwVar, final AtomicBoolean atomicBoolean, icf icfVar, ScheduledExecutorService scheduledExecutorService, hht hhtVar, iey ieyVar, ggm ggmVar, final fgs fgsVar, ljf ljfVar, jvd jvdVar, dfo dfoVar, fcp fcpVar, hsk hskVar, htf htfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean z = false;
        this.f21662h = gfaVar;
        this.f21661g = bottomBarController;
        this.f21655a = igbVar;
        this.f21657c = hxwVar;
        this.f21658d = icfVar;
        this.f21659e = scheduledExecutorService;
        this.f21678x = hhtVar;
        this.f21663i = ieyVar;
        this.f21664j = ggmVar;
        this.f21679y = fgsVar;
        this.f21656b = iujVar;
        this.f21677w = ljfVar;
        this.f21676v = iktVar;
        this.f21665k = jvdVar;
        this.f21680z = fcpVar;
        this.f21675u = dfoVar;
        this.f21674t = hskVar;
        this.f21666l = dhvVar;
        this.f21654A = htfVar;
        final boolean zMo6184l = dhvVar.mo6184l(dii.f11538n);
        boolean zMo6184l2 = dhvVar.mo6184l(dii.f11540p);
        this.f21672r = zMo6184l2;
        if (zMo6184l || zMo6184l2) {
            z = true;
        }
        igbVar.mo11193A(z);
        igbVar.mo11194B(new ifg() { // from class: ffk
            @Override // p000.ifg
            /* JADX INFO: renamed from: a */
            public final void mo8351a(MotionEvent motionEvent, MotionEvent motionEvent2, Rect rect, boolean z2) {
                ffl fflVar = this.f21649a;
                ikt iktVar2 = iktVar;
                boolean z3 = zMo6184l;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                fgs fgsVar2 = fgsVar;
                if (fflVar.f21673s.get() == null) {
                    fflVar.f21673s.set(new PointF(motionEvent2.getRawX(), motionEvent2.getRawY()));
                }
                PointF pointF = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
                PointF pointF2 = (PointF) fflVar.f21673s.get();
                double dAbs = Math.abs(Math.toDegrees(Math.atan2(pointF.x - pointF2.x, pointF.y - pointF2.y)));
                if (dAbs >= 90.0d) {
                    dAbs = 180.0d - dAbs;
                }
                fflVar.f21673s.set(pointF);
                if (dAbs < 75.0d) {
                    if (!z3 || atomicBoolean2.get()) {
                        return;
                    }
                    fgsVar2.mo8351a(motionEvent, motionEvent2, rect, z2);
                    return;
                }
                if (fflVar.f21672r) {
                    iktVar2.f31382i = z2;
                    if (iktVar2.f31378e == null) {
                        iktVar2.f31378e = motionEvent;
                        iktVar2.f31379f = iktVar2.f31378e.getX();
                        iktVar2.f31380g = iktVar2.f31378e.getY();
                        return;
                    }
                    float x = motionEvent.getX() - iktVar2.f31379f;
                    float y = motionEvent.getY() - iktVar2.f31380g;
                    ilk ilkVar = ilk.PORTRAIT;
                    switch (iktVar2.f31374a.f7310h.ordinal()) {
                        case 1:
                            iktVar2.f31375b.setTranslationX(-ikt.m11407c(y, 0.0f, Math.abs(iktVar2.f31383j)));
                            iktVar2.f31374a.m4508a();
                            break;
                        case 2:
                            iktVar2.f31375b.setTranslationX(ikt.m11407c(y, iktVar2.f31383j, 0.0f));
                            iktVar2.f31374a.m4508a();
                            break;
                        default:
                            iktVar2.f31375b.setTranslationX(ikt.m11407c(x, iktVar2.f31383j, 0.0f));
                            iktVar2.f31374a.m4508a();
                            break;
                    }
                    iktVar2.m11409b(false);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Queue] */
    /* JADX INFO: renamed from: a */
    public final void m8352a() {
        this.f21667m.close();
        this.f21667m = new jvb();
        if (this.f21670p) {
            if (this.f21672r) {
                this.f21676v.m11408a();
                ikt iktVar = this.f21676v;
                iktVar.f31376c.setImageDrawable(iktVar.f31377d.getDrawable(C0100R.drawable.ic_lock_24dp, null));
                iktVar.f31375b.bringToFront();
                iktVar.f31381h = false;
            }
            if (!this.f21669o) {
                this.f21671q = true;
                return;
            }
            if (this.f21668n != null) {
                this.f21668n.cancel(false);
                this.f21668n = null;
            }
            fgs fgsVar = this.f21679y;
            fgsVar.m8402b();
            if (fgsVar.f21935b.isPresent()) {
                fgsVar.f21934a.mo3415bf((Float) fgsVar.f21935b.get());
            }
            fgsVar.f21936c = 0.0f;
            fgsVar.f21937d = 0.0f;
            fgsVar.f21935b = Optional.empty();
            fgsVar.f21939f.m17588k();
            fgsVar.f21938e = 0.0f;
            this.f21657c.mo10848a(true);
            this.f21674t.m10699d(false);
            if (this.f21672r && this.f21676v.f31381h) {
                this.f21680z.mo8169an(3, System.currentTimeMillis());
                this.f21655a.mo11221ac();
            } else {
                this.f21655a.mo11220ab();
            }
            this.f21656b.mo11766q(false);
            kba kbaVar = (kba) this.f21677w.f38370b.poll();
            kbaVar.getClass();
            kbaVar.close();
            this.f21661g.stopLongShot();
            this.f21662h.mo9126l();
            this.f21658d.mo11023v(true);
            this.f21675u.m6079c(true);
            jvd jvdVar = this.f21665k;
            iey ieyVar = this.f21663i;
            ieyVar.getClass();
            jvdVar.m13541c(new fdo(ieyVar, 11));
            this.f21663i.mo11163f();
            this.f21678x.mo10316b(C0100R.raw.video_stop);
            this.f21654A.mo10739g(ilj.VIDEO);
            this.f21664j.mo9214b(ffl.class);
            this.f21669o = false;
            this.f21671q = false;
            this.f21670p = false;
        }
    }
}
