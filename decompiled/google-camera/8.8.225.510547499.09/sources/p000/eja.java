package p000;

import android.app.Activity;
import android.content.Context;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eja implements eiu, eil {

    /* JADX INFO: renamed from: N */
    private static final nbh f14223N = nbh.m17259h("com/google/android/apps/camera/imax/ImaxRecordingController");

    /* JADX INFO: renamed from: A */
    public final hah f14224A;

    /* JADX INFO: renamed from: B */
    public final hai f14225B;

    /* JADX INFO: renamed from: D */
    public long f14227D;

    /* JADX INFO: renamed from: E */
    public long f14228E;

    /* JADX INFO: renamed from: F */
    public long f14229F;

    /* JADX INFO: renamed from: G */
    public long f14230G;

    /* JADX INFO: renamed from: I */
    public eij f14232I;

    /* JADX INFO: renamed from: J */
    public final eig f14233J;

    /* JADX INFO: renamed from: K */
    public final bko f14234K;

    /* JADX INFO: renamed from: L */
    public final jiy f14235L;

    /* JADX INFO: renamed from: M */
    public final hee f14236M;

    /* JADX INFO: renamed from: O */
    private final oju f14237O;

    /* JADX INFO: renamed from: P */
    private final elx f14238P;

    /* JADX INFO: renamed from: Q */
    private final Set f14239Q;

    /* JADX INFO: renamed from: R */
    private final Activity f14240R;

    /* JADX INFO: renamed from: S */
    private final hht f14241S;

    /* JADX INFO: renamed from: T */
    private final ScheduledExecutorService f14242T;

    /* JADX INFO: renamed from: U */
    private final ekt f14243U;

    /* JADX INFO: renamed from: V */
    private final jvb f14244V;

    /* JADX INFO: renamed from: W */
    private final ekd f14245W;

    /* JADX INFO: renamed from: X */
    private final npk f14246X;

    /* JADX INFO: renamed from: a */
    public final Context f14247a;

    /* JADX INFO: renamed from: b */
    public final eks f14248b;

    /* JADX INFO: renamed from: c */
    public final gqv f14249c;

    /* JADX INFO: renamed from: d */
    public final dhv f14250d;

    /* JADX INFO: renamed from: e */
    public final eka f14251e;

    /* JADX INFO: renamed from: f */
    public final eiw f14252f;

    /* JADX INFO: renamed from: g */
    public final jvd f14253g;

    /* JADX INFO: renamed from: h */
    public final jww f14254h;

    /* JADX INFO: renamed from: i */
    public final fcp f14255i;

    /* JADX INFO: renamed from: j */
    public final kbz f14256j;

    /* JADX INFO: renamed from: k */
    public final igb f14257k;

    /* JADX INFO: renamed from: l */
    public final Set f14258l;

    /* JADX INFO: renamed from: m */
    public final eio f14259m;

    /* JADX INFO: renamed from: n */
    public final eim f14260n;

    /* JADX INFO: renamed from: o */
    public final eju f14261o;

    /* JADX INFO: renamed from: t */
    public final cpa f14266t;

    /* JADX INFO: renamed from: u */
    public final idb f14267u;

    /* JADX INFO: renamed from: v */
    public final idb f14268v;

    /* JADX INFO: renamed from: w */
    public final idb f14269w;

    /* JADX INFO: renamed from: x */
    public final idb f14270x;

    /* JADX INFO: renamed from: y */
    public final idb f14271y;

    /* JADX INFO: renamed from: z */
    public final ipv f14272z;

    /* JADX INFO: renamed from: p */
    public float f14262p = 0.0f;

    /* JADX INFO: renamed from: q */
    public final AtomicBoolean f14263q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r */
    public final AtomicInteger f14264r = new AtomicInteger(0);

    /* JADX INFO: renamed from: s */
    public final ConditionVariable f14265s = new ConditionVariable(true);

    /* JADX INFO: renamed from: C */
    public boolean f14226C = false;

    /* JADX INFO: renamed from: H */
    public int f14231H = 1;

    public eja(Context context, eks eksVar, oju ojuVar, gqv gqvVar, eka ekaVar, eiw eiwVar, jvd jvdVar, elx elxVar, eig eigVar, eju ejuVar, dhv dhvVar, jww jwwVar, fcp fcpVar, ekd ekdVar, hee heeVar, jvb jvbVar, kbz kbzVar, Activity activity, hht hhtVar, igb igbVar, ScheduledExecutorService scheduledExecutorService, jiy jiyVar, Set set, eio eioVar, ipv ipvVar, eim eimVar, ekt ektVar, bko bkoVar, npk npkVar, hah hahVar, hai haiVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f14247a = context;
        this.f14248b = eksVar;
        this.f14237O = ojuVar;
        this.f14249c = gqvVar;
        this.f14251e = ekaVar;
        this.f14252f = eiwVar;
        this.f14253g = jvdVar;
        this.f14238P = elxVar;
        this.f14233J = eigVar;
        this.f14261o = ejuVar;
        this.f14250d = dhvVar;
        this.f14254h = jwwVar;
        this.f14255i = fcpVar;
        this.f14245W = ekdVar;
        this.f14236M = heeVar;
        this.f14256j = kbzVar;
        this.f14240R = activity;
        this.f14241S = hhtVar;
        this.f14257k = igbVar;
        this.f14242T = scheduledExecutorService;
        this.f14235L = jiyVar;
        this.f14258l = set;
        this.f14259m = eioVar;
        this.f14272z = ipvVar;
        this.f14260n = eimVar;
        this.f14244V = jvbVar;
        this.f14243U = ektVar;
        this.f14234K = bkoVar;
        this.f14246X = npkVar;
        this.f14224A = hahVar;
        this.f14225B = haiVar;
        eksVar.m7417f();
        this.f14266t = new cpa(kbzVar, set);
        jvbVar.m13537d(eimVar.f14155f.mo3830a(new dsu(this, 4), jvdVar));
        eioVar.requestLayout();
        eimVar.f14161l = this;
        this.f14267u = jpd.m13426g(false, 1500, null, null, context.getString(C0100R.string.accessibility_imax_too_fast), context, true, -1, 10);
        this.f14268v = jpd.m13426g(false, 1500, null, null, context.getString(C0100R.string.accessibility_imax_backtracking), context, true, -1, 10);
        this.f14269w = jpd.m13426g(false, 1500, null, null, context.getString(C0100R.string.accessibility_imax_too_much_roll), context, true, -1, 10);
        this.f14270x = jpd.m13426g(false, 1500, null, null, context.getString(C0100R.string.imax_too_much_vertical_tilt), context, true, -1, 10);
        this.f14271y = jpd.m13426g(false, 1500, null, null, context.getString(C0100R.string.imax_too_much_horizontal_tilt), context, true, -1, 10);
        this.f14239Q = new HashSet();
    }

    /* JADX INFO: renamed from: i */
    private final void m7381i(boolean z, float f, int i) {
        this.f14260n.m7360a(false);
        if (!this.f14263q.get()) {
            this.f14241S.mo10316b(C0100R.raw.video_stop);
            if (i != 2) {
                if (!z) {
                    this.f14246X.m17609f(1);
                } else if (f >= 1.0f || i != 1) {
                    this.f14246X.m17609f(0);
                }
            }
        }
        this.f14264r.set(0);
    }

    /* JADX INFO: renamed from: j */
    private final void m7382j(Runnable runnable) {
        try {
            this.f14242T.schedule(runnable, 250L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
        }
    }

    @Override // p000.eiu
    /* JADX INFO: renamed from: a */
    public final void mo7370a(final int i) {
        m7384c();
        m7385d(fdh.m8266f(i, this.f14247a, this.f14252f.m7376k()));
        nbw nbwVarM17252c = f14223N.m17252c();
        nbi nbiVar = new nbi() { // from class: eiy
            @Override // p000.nbi
            /* JADX INFO: renamed from: a */
            public final Object mo3585a() {
                eja ejaVar = this.f14218a;
                return fdh.m8266f(i, ejaVar.f14247a, ejaVar.f14252f.m7376k());
            }
        };
        mpw.m16775n(nbiVar);
        ((nbe) ((nbe) nbwVarM17252c).mo17276G((char) 1510)).mo17293r("Capture stopped reason: %s", nbiVar);
        this.f14253g.execute(new bbt(this, i, 13));
    }

    /* JADX INFO: renamed from: b */
    public final float m7383b() {
        float fM7408a = (float) this.f14245W.m7408a();
        float f = this.f14262p;
        if (f < 0.0f) {
            fM7408a = -fM7408a;
        }
        return ((360.0f - fM7408a) * f) + fM7408a;
    }

    /* JADX INFO: renamed from: c */
    public final void m7384c() {
        Iterator it = this.f14239Q.iterator();
        while (it.hasNext()) {
            this.f14238P.mo7485g((elw) it.next());
        }
        this.f14239Q.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m7385d(String str) {
        idb idbVarM13426g = jpd.m13426g(false, 3000, null, null, str, this.f14247a, false, -1, 12);
        this.f14238P.mo7482d(idbVarM13426g);
        this.f14239Q.add(idbVarM13426g);
    }

    /* JADX INFO: renamed from: e */
    public final void m7386e(idb idbVar) {
        this.f14238P.mo7482d(idbVar);
        this.f14239Q.add(idbVar);
    }

    /* JADX INFO: renamed from: f */
    public final void m7387f() {
        if (!this.f14226C && this.f14264r.get() == 0 && this.f14260n.m7361b()) {
            this.f14265s.close();
            this.f14264r.set(1);
            this.f14227D = SystemClock.uptimeMillis() + 250;
            this.f14260n.m7360a(true);
            jvd jvdVar = this.f14253g;
            eka ekaVar = this.f14251e;
            ekaVar.getClass();
            jvdVar.m13541c(new efd(ekaVar, 14));
            this.f14241S.mo10316b(C0100R.raw.video_start);
            this.f14232I = ((elo) this.f14237O).get();
            int rotation = this.f14240R.getWindowManager().getDefaultDisplay().getRotation() * 90;
            this.f14243U.m7422d(rotation);
            m7382j(new bbt(this, rotation, 12));
        }
    }

    /* JADX INFO: renamed from: g */
    final void m7388g() {
        jvd.m13538a();
        if (this.f14264r.get() != 3) {
            m7387f();
        } else {
            m7384c();
            m7389h(true, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7389h(boolean z, int i) {
        ell ellVar;
        jvd.m13538a();
        int i2 = this.f14264r.get();
        if (this.f14263q.get()) {
            if (i2 != 3 && i2 != 2) {
                return;
            }
        } else if (i2 != 3 || (ellVar = this.f14248b.f14494c.f14481b) == null || ellVar.m7457a() == 0) {
            return;
        }
        this.f14264r.set(4);
        this.f14228E = SystemClock.uptimeMillis();
        float fM7372g = this.f14252f.m7372g();
        this.f14252f.f14194e.set(false);
        this.f14231H = i;
        this.f14251e.mo7351b();
        this.f14256j.mo13961e("record#prepareToStop");
        eks eksVar = this.f14248b;
        synchronized (eksVar) {
            eksVar.f14498g = true;
        }
        ekq ekqVar = eksVar.f14494c;
        ekqVar.mo7348d();
        ell ellVar2 = ekqVar.f14481b;
        if (ellVar2 != null) {
            ellVar2.m7457a();
        }
        this.f14256j.mo13962f();
        if (z) {
            this.f14256j.mo13961e("record#getCapturePreview");
            eks eksVar2 = this.f14248b;
            eksVar2.f14503l.m7353a(new ekr(eksVar2, new ceg(this, 16), 0));
            this.f14233J.m7354b(cik.f5801i);
            this.f14256j.mo13962f();
            m7381i(true, fM7372g, this.f14231H);
            return;
        }
        this.f14256j.mo13961e("record#stopCapture");
        this.f14248b.m7418g(this.f14232I.m7357a());
        this.f14256j.mo13962f();
        long jMax = Math.max(this.f14228E - this.f14227D, 0L);
        fcp fcpVar = this.f14255i;
        int iM8267g = fdh.m8267g(this.f14231H);
        this.f14232I.m7359c();
        fcpVar.mo8180ay(iM8267g, 0L, jMax, m7383b(), ((Boolean) this.f14254h.mo3831be()).booleanValue());
        m7381i(false, fM7372g, i);
        synchronized (this.f14258l) {
            this.f14258l.remove(this.f14232I.m7357a());
        }
    }
}
