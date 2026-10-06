package p000;

import android.graphics.PointF;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cra implements crd {

    /* JADX INFO: renamed from: a */
    public final ccs f9066a;

    /* JADX INFO: renamed from: b */
    public final mrm f9067b;

    /* JADX INFO: renamed from: c */
    public final mrm f9068c;

    /* JADX INFO: renamed from: d */
    public final fcp f9069d;

    /* JADX INFO: renamed from: e */
    public final csl f9070e;

    /* JADX INFO: renamed from: f */
    public final kfk f9071f;

    /* JADX INFO: renamed from: g */
    public final imu f9072g;

    /* JADX INFO: renamed from: h */
    public final dhv f9073h;

    /* JADX INFO: renamed from: i */
    public nqf f9074i;

    /* JADX INFO: renamed from: j */
    public nqf f9075j;

    /* JADX INFO: renamed from: k */
    public boolean f9076k;

    /* JADX INFO: renamed from: n */
    public final cwd f9079n;

    /* JADX INFO: renamed from: o */
    public final drj f9080o;

    /* JADX INFO: renamed from: p */
    public final oyo f9081p;

    /* JADX INFO: renamed from: q */
    public final bkn f9082q;

    /* JADX INFO: renamed from: t */
    private boolean f9085t;

    /* JADX INFO: renamed from: u */
    private final fup f9086u;

    /* JADX INFO: renamed from: v */
    private final dfn f9087v;

    /* JADX INFO: renamed from: w */
    private final nax f9088w;

    /* JADX INFO: renamed from: s */
    private volatile boolean f9084s = false;

    /* JADX INFO: renamed from: l */
    public final Runnable f9077l = new cqr(this, 7);

    /* JADX INFO: renamed from: m */
    public final Runnable f9078m = new cqr(this, 8);

    /* JADX INFO: renamed from: r */
    private final ScheduledExecutorService f9083r = jzn.m13828p("cdr_trk_ttf_ex");

    public cra(csl cslVar, cwd cwdVar, fup fupVar, ccs ccsVar, mrm mrmVar, mrm mrmVar2, fcp fcpVar, drj drjVar, bkn bknVar, kfk kfkVar, dfn dfnVar, nax naxVar, oyo oyoVar, imu imuVar, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f9070e = cslVar;
        this.f9086u = fupVar;
        this.f9066a = ccsVar;
        this.f9067b = mrmVar;
        this.f9081p = oyoVar;
        this.f9068c = mrmVar2;
        this.f9088w = naxVar;
        this.f9069d = fcpVar;
        this.f9071f = kfkVar;
        this.f9080o = drjVar;
        this.f9082q = bknVar;
        this.f9079n = cwdVar;
        this.f9087v = dfnVar;
        this.f9072g = imuVar;
        this.f9073h = dhvVar;
    }

    /* JADX INFO: renamed from: h */
    public static final PointF m5387h(hsg hsgVar) {
        return new PointF(hsgVar.f29404b.centerX(), hsgVar.f29404b.centerY());
    }

    /* JADX INFO: renamed from: i */
    private final synchronized void m5388i() {
        if (this.f9084s) {
            return;
        }
        this.f9084s = true;
        this.f9079n.m5657d(cum.MODULE).m13537d(((hrx) this.f9067b.mo16809c()).mo10658d(mqu.f41450a, mrm.m16829i(flu.m8560c())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m5389j(boolean z, boolean z2, boolean z3) {
        if (z3) {
            this.f9070e.f9274d.mo3415bf(false);
        }
        fuo fuoVar = (fuo) ((gtd) this.f9086u.f23601a.f34942d).f26334a;
        boolean z4 = (fuoVar.f23596b == gst.FOCUSED_LOCKED || fuoVar.f23596b == gst.NOT_FOCUSED_LOCKED) && z2;
        if (z4) {
            this.f9070e.f9275e.mo3415bf(false);
        }
        this.f9071f.mo14126m(z4, z3, false);
        if (z) {
            kew kewVarMo14115b = this.f9071f.mo14115b();
            if (z2) {
                ((kgo) kewVarMo14115b).f35937h = this.f9087v.m6072h();
            }
            if (z3) {
                ((kgo) kewVarMo14115b).f35938i = this.f9087v.m6072h();
            }
            ((kgo) kewVarMo14115b).f35939j = this.f9087v.m6072h();
            this.f9071f.mo14127n(kewVarMo14115b.mo14090a());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5390b(hrx hrxVar) {
        ((Executor) this.f9068c.mo16809c()).execute(new cqr(hrxVar, 4));
    }

    @Override // p000.cbu
    /* JADX INFO: renamed from: bh */
    public final synchronized cdj mo3409bh(bko bkoVar) {
        if (!this.f9085t && this.f9067b.mo16813g() && this.f9068c.mo16813g()) {
            if (!((hrx) this.f9067b.mo16809c()).mo10674k(hrw.TOUCH_TO_FOCUS)) {
                return new ccj();
            }
            this.f9079n.m5658e(cum.f9657e);
            nqf nqfVar = this.f9075j;
            if (nqfVar != null) {
                nqfVar.cancel(false);
            }
            nqf nqfVar2 = this.f9074i;
            if (nqfVar2 != null) {
                nqfVar2.cancel(false);
            }
            this.f9075j = nqf.m17621g();
            this.f9074i = nqf.m17621g();
            this.f9076k = false;
            m5388i();
            this.f9079n.m5657d(cum.f9657e).m13537d(new cft(this, 11));
            m5389j(false, true, !((Boolean) ((jwf) this.f9080o.f12398d).f34942d).booleanValue());
            this.f9088w.m17237h();
            final PointF pointFM19203g = this.f9081p.m19203g((PointF) bkoVar.f3652a);
            this.f9069d.mo8186f(false, pointFM19203g);
            ((Executor) this.f9068c.mo16809c()).execute(new cgl(this, bkoVar, 14, null, null, null));
            final nqf nqfVarM17621g = nqf.m17621g();
            ((Executor) this.f9068c.mo16809c()).execute(new Runnable() { // from class: cqw
                @Override // java.lang.Runnable
                public final void run() {
                    cra craVar = this.f9051a;
                    PointF pointF = pointFM19203g;
                    nqf nqfVar3 = nqfVarM17621g;
                    if (craVar.f9073h.mo6184l(dhu.f11209k) && ((Boolean) ((jwf) craVar.f9082q.f3651a).f34942d).booleanValue()) {
                        return;
                    }
                    craVar.m5392d(2000L, false);
                    jwn jwnVarMo10669a = ((hrx) craVar.f9067b.mo16809c()).mo10669a(pointF, hrw.TOUCH_TO_FOCUS);
                    jwn jwnVarM13640j = jwr.m13640j(jwnVarMo10669a, new ceg(craVar, 9));
                    nqfVar3.mo14894e(jwnVarM13640j);
                    craVar.f9079n.m5657d(cum.f9657e).m13537d(jwnVarM13640j.mo3830a(new cqx(craVar), not.INSTANCE));
                    craVar.f9079n.m5657d(cum.f9657e).m13537d(jwnVarMo10669a.mo3830a(new feo(craVar, 1), not.INSTANCE));
                }
            });
            return new cqy(this, nqfVarM17621g);
        }
        return new ccj();
    }

    /* JADX INFO: renamed from: c */
    public final void m5391c() {
        this.f9066a.m3466c(this.f9078m);
        this.f9066a.m3466c(this.f9077l);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f9085t = true;
        this.f9079n.m5658e(cum.f9657e);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5392d(long j, boolean z) {
        try {
            this.f9079n.m5657d(cum.f9657e).m13537d(new cft((ScheduledFuture) this.f9083r.schedule(new bnp(this, z, 6), j, TimeUnit.MILLISECONDS), 12));
        } catch (RejectedExecutionException e) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m5393e() {
        try {
            this.f9079n.m5657d(cum.f9657e).m13537d(new cft((ScheduledFuture) this.f9083r.schedule(this.f9077l, 4L, TimeUnit.SECONDS), 13));
        } catch (RejectedExecutionException e) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0013 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #5 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x003b, B:18:0x003f, B:19:0x004b, B:21:0x0052, B:23:0x005f, B:33:0x0083, B:30:0x006a, B:42:0x0092, B:35:0x0085, B:39:0x008c, B:13:0x001a), top: B:53:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x001a A[Catch: all -> 0x000e, TryCatch #5 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x003b, B:18:0x003f, B:19:0x004b, B:21:0x0052, B:23:0x005f, B:33:0x0083, B:30:0x006a, B:42:0x0092, B:35:0x0085, B:39:0x008c, B:13:0x001a), top: B:53:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x003b A[Catch: all -> 0x000e, TryCatch #5 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x003b, B:18:0x003f, B:19:0x004b, B:21:0x0052, B:23:0x005f, B:33:0x0083, B:30:0x006a, B:42:0x0092, B:35:0x0085, B:39:0x008c, B:13:0x001a), top: B:53:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x003f A[Catch: all -> 0x000e, TryCatch #5 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x003b, B:18:0x003f, B:19:0x004b, B:21:0x0052, B:23:0x005f, B:33:0x0083, B:30:0x006a, B:42:0x0092, B:35:0x0085, B:39:0x008c, B:13:0x001a), top: B:53:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x004b A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x003b, B:18:0x003f, B:19:0x004b, B:21:0x0052, B:23:0x005f, B:33:0x0083, B:30:0x006a, B:42:0x0092, B:35:0x0085, B:39:0x008c, B:13:0x001a), top: B:53:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0092 A[Catch: all -> 0x000e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x003b, B:18:0x003f, B:19:0x004b, B:21:0x0052, B:23:0x005f, B:33:0x0083, B:30:0x006a, B:42:0x0092, B:35:0x0085, B:39:0x008c, B:13:0x001a), top: B:53:0x0003, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final synchronized void m5394f(PointF pointF, boolean z) {
        MeteringRectangle[] meteringRectangleArrM6074j;
        kew kewVarMo14115b;
        kfo kfoVarMo14117d;
        if (z) {
            if (z) {
                meteringRectangleArrM6074j = this.f9087v.m6075k(pointF);
            } else {
                meteringRectangleArrM6074j = this.f9087v.m6074j(pointF);
            }
            kewVarMo14115b = this.f9071f.mo14115b();
            ((kgo) kewVarMo14115b).f35937h = meteringRectangleArrM6074j;
            if (!((Boolean) ((jwf) this.f9080o.f12398d).f34942d).booleanValue()) {
                if (this.f9076k) {
                    ((kgo) kewVarMo14115b).f35938i = this.f9087v.m6072h();
                } else {
                    ((kgo) kewVarMo14115b).f35938i = meteringRectangleArrM6074j;
                }
            }
            if (z) {
                this.f9071f.mo14127n(kewVarMo14115b.mo14090a());
                return;
            }
            kfoVarMo14117d = this.f9071f.mo14117d();
            kfoVarMo14117d.mo14160i(kewVarMo14115b.mo14090a());
            kfoVarMo14117d.close();
            return;
        }
        if (!this.f9088w.m17238i(pointF)) {
            return;
        }
        if (z) {
            meteringRectangleArrM6074j = this.f9087v.m6075k(pointF);
        } else {
            meteringRectangleArrM6074j = this.f9087v.m6074j(pointF);
        }
        kewVarMo14115b = this.f9071f.mo14115b();
        ((kgo) kewVarMo14115b).f35937h = meteringRectangleArrM6074j;
        if (!((Boolean) ((jwf) this.f9080o.f12398d).f34942d).booleanValue()) {
            if (this.f9076k) {
                ((kgo) kewVarMo14115b).f35938i = this.f9087v.m6072h();
            } else {
                ((kgo) kewVarMo14115b).f35938i = meteringRectangleArrM6074j;
            }
        }
        if (z) {
            this.f9071f.mo14127n(kewVarMo14115b.mo14090a());
            return;
        }
        try {
            kfoVarMo14117d = this.f9071f.mo14117d();
            try {
                kfoVarMo14117d.mo14160i(kewVarMo14115b.mo14090a());
                kfoVarMo14117d.close();
                return;
            } catch (Throwable th) {
                try {
                    kfoVarMo14117d.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
                throw th;
            }
        } catch (InterruptedException e2) {
            float f = pointF.x;
            float f2 = pointF.y;
            return;
        } catch (kec e3) {
            float f3 = pointF.x;
            float f4 = pointF.y;
            return;
        }
        throw th;
    }
}
