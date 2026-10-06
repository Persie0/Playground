package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ezi implements hep {

    /* JADX INFO: renamed from: A */
    public final cwd f21041A;

    /* JADX INFO: renamed from: B */
    public final gtd f21042B;

    /* JADX INFO: renamed from: C */
    public C1058va f21043C;

    /* JADX INFO: renamed from: D */
    private final ezk f21044D;

    /* JADX INFO: renamed from: a */
    public final Context f21045a;

    /* JADX INFO: renamed from: b */
    public final jww f21046b;

    /* JADX INFO: renamed from: c */
    public final dhv f21047c;

    /* JADX INFO: renamed from: d */
    public final Executor f21048d;

    /* JADX INFO: renamed from: e */
    public final jvb f21049e;

    /* JADX INFO: renamed from: f */
    public final Activity f21050f;

    /* JADX INFO: renamed from: g */
    public final boolean f21051g;

    /* JADX INFO: renamed from: h */
    public final boolean f21052h;

    /* JADX INFO: renamed from: i */
    public final dgg f21053i;

    /* JADX INFO: renamed from: j */
    public final dgn f21054j;

    /* JADX INFO: renamed from: k */
    public final gvo f21055k;

    /* JADX INFO: renamed from: l */
    public final fcp f21056l;

    /* JADX INFO: renamed from: m */
    public final fly f21057m;

    /* JADX INFO: renamed from: n */
    public boolean f21058n;

    /* JADX INFO: renamed from: o */
    public boolean f21059o;

    /* JADX INFO: renamed from: p */
    public boolean f21060p;

    /* JADX INFO: renamed from: q */
    public boolean f21061q;

    /* JADX INFO: renamed from: r */
    public boolean f21062r;

    /* JADX INFO: renamed from: s */
    public int f21063s = 0;

    /* JADX INFO: renamed from: t */
    public int f21064t = 0;

    /* JADX INFO: renamed from: u */
    public String f21065u = "-1";

    /* JADX INFO: renamed from: v */
    public mrm f21066v;

    /* JADX INFO: renamed from: w */
    public mrm f21067w;

    /* JADX INFO: renamed from: x */
    public final iad f21068x;

    /* JADX INFO: renamed from: y */
    public final oju f21069y;

    /* JADX INFO: renamed from: z */
    public final jvd f21070z;

    public ezi(Context context, cdu cduVar, jww jwwVar, dhv dhvVar, Context context2, boolean z, boolean z2, dgg dggVar, dgn dgnVar, iad iadVar, ezk ezkVar, gvo gvoVar, fcp fcpVar, fly flyVar, Executor executor, oju ojuVar, jvd jvdVar, cwd cwdVar, gtd gtdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        mqu mquVar = mqu.f41450a;
        this.f21066v = mquVar;
        this.f21067w = mquVar;
        this.f21045a = context;
        this.f21046b = jwwVar;
        this.f21047c = dhvVar;
        this.f21048d = kxk.m14956B(executor);
        this.f21059o = true;
        this.f21060p = ((Boolean) jwwVar.mo3831be()).booleanValue();
        this.f21049e = new jvb();
        this.f21050f = (Activity) context2;
        this.f21051g = z;
        this.f21052h = z2;
        this.f21053i = dggVar;
        this.f21054j = dgnVar;
        this.f21068x = iadVar;
        this.f21057m = flyVar;
        this.f21044D = ezkVar;
        this.f21055k = gvoVar;
        this.f21056l = fcpVar;
        this.f21069y = ojuVar;
        this.f21070z = jvdVar;
        this.f21041A = cwdVar;
        this.f21042B = gtdVar;
        cduVar.m3529i().m13537d(new ezc(this, 1));
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: a */
    public final void mo3950a() {
        this.f21048d.execute(new evu(this, 11));
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: b */
    public final void mo3951b(hew hewVar) {
        ezk ezkVar = this.f21044D;
        ezkVar.f21093d = new fya(this, hewVar);
        this.f21049e.m13537d(new ezc(ezkVar, 0));
        ezk ezkVar2 = this.f21044D;
        dhv dhvVar = ezkVar2.f21091b;
        String[] strArr = dig.f11487a;
        dhvVar.mo6177e();
        kxk.m14975U(ezkVar2.f21092c.m10978d(), new cmo(ezkVar2, 11), not.INSTANCE);
    }

    /* JADX INFO: renamed from: c */
    public final kwt m8062c() {
        if (!this.f21047c.mo6184l(dig.f11498l) || this.f21041A.m5676x().startsWith("2.6")) {
            return kwt.DISABLED;
        }
        return this.f21047c.mo6184l(dig.f11499m) ? kwt.PLAYGROUND_ONLY : kwt.ARCORE_ONLY;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final void m8063d() {
        if (this.f21061q) {
            C1058va c1058va = this.f21043C;
            c1058va.getClass();
            c1058va.f47803b.stop();
            this.f21061q = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public final void m8064e() {
        if (!this.f21058n || !this.f21060p || this.f21059o || this.f21061q) {
            return;
        }
        C1058va c1058va = this.f21043C;
        c1058va.getClass();
        c1058va.f47803b.start();
        this.f21061q = true;
    }

    @Override // p000.hep
    /* JADX INFO: renamed from: f */
    public final void mo8065f(Point point) {
        this.f21048d.execute(new ewo(this, new Point(point), 3));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8066g() {
        return this.f21047c.mo6184l(dig.f11503q);
    }

    @Override // p000.hep
    /* JADX INFO: renamed from: h */
    public final void mo8067h(kpw kpwVar, int i) {
        this.f21048d.execute(new RunnableC0904pi(this, kpwVar, i, 12));
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        this.f21048d.execute(new evu(this, 9));
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
        this.f21048d.execute(new evu(this, 12));
    }
}
