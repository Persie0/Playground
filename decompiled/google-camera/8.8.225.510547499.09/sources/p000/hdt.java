package p000;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.CountDownTimer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdt extends iqb {

    /* JADX INFO: renamed from: a */
    public static final nbh f27377a = nbh.m17259h("com/google/android/apps/camera/smarts/SmartsGestureListener");

    /* JADX INFO: renamed from: b */
    public final fcp f27378b;

    /* JADX INFO: renamed from: c */
    public final hec f27379c;

    /* JADX INFO: renamed from: d */
    public final iad f27380d;

    /* JADX INFO: renamed from: e */
    public final fly f27381e;

    /* JADX INFO: renamed from: g */
    public dbr f27383g;

    /* JADX INFO: renamed from: h */
    public Callable f27384h;

    /* JADX INFO: renamed from: i */
    public boolean f27385i;

    /* JADX INFO: renamed from: j */
    public CountDownTimer f27386j;

    /* JADX INFO: renamed from: l */
    public final npk f27388l;

    /* JADX INFO: renamed from: m */
    private long f27389m;

    /* JADX INFO: renamed from: n */
    private boolean f27390n;

    /* JADX INFO: renamed from: o */
    private final djm f27391o;

    /* JADX INFO: renamed from: f */
    public volatile boolean f27382f = false;

    /* JADX INFO: renamed from: k */
    public boolean f27387k = false;

    public hdt(Executor executor, fcp fcpVar, hec hecVar, djm djmVar, iad iadVar, fly flyVar, npk npkVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f27378b = fcpVar;
        this.f27379c = hecVar;
        this.f27391o = djmVar;
        this.f27380d = iadVar;
        this.f27381e = flyVar;
        this.f27388l = npkVar;
        kxk.m14975U(iadVar.m10975a(), new cmo(this, 17), executor);
    }

    @Override // p000.iqa
    /* JADX INFO: renamed from: a */
    public final void mo3421a(PointF pointF) {
        if (this.f27385i) {
            this.f27390n = true;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f27389m < 500) {
            this.f27390n = true;
        } else {
            this.f27390n = false;
        }
        this.f27389m = jCurrentTimeMillis;
    }

    @Override // p000.ipz
    /* JADX INFO: renamed from: b */
    public final void mo3422b() {
        jvd.m13538a();
        m10128e();
    }

    @Override // p000.iqa
    /* JADX INFO: renamed from: d */
    public final void mo3424d(PointF pointF) {
        jvd.m13538a();
        if (this.f27387k) {
            lku.m15613H(this.f27384h != null);
            lku.m15613H(this.f27383g != null);
            lku.m15613H(this.f27386j == null);
            if (!this.f27382f || !this.f27383g.m5900i() || ((Boolean) ((jwf) this.f27391o.f11787a).f34942d).booleanValue() || this.f27390n || this.f27385i) {
                return;
            }
            long jMax = Math.max(0L, 1100 - (System.currentTimeMillis() - this.f27389m));
            hdr hdrVar = new hdr(this, jMax, jMax, pointF);
            this.f27386j = hdrVar;
            hdrVar.start();
            if (jMax > 0) {
                this.f27388l.m17609f(0);
                hec hecVar = this.f27379c;
                hecVar.f27430f.m13541c(new hea(hecVar, new Point((int) pointF.x, (int) pointF.y), 1));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10128e() {
        jvd.m13538a();
        CountDownTimer countDownTimer = this.f27386j;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f27386j = null;
            this.f27379c.m10141a();
        }
    }
}
