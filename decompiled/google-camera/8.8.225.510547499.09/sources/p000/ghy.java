package p000;

import android.graphics.PointF;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ghy implements cbu, kba {

    /* JADX INFO: renamed from: A */
    private final fup f24833A;

    /* JADX INFO: renamed from: B */
    private final oyo f24834B;

    /* JADX INFO: renamed from: a */
    public final mrm f24835a;

    /* JADX INFO: renamed from: b */
    public final jwn f24836b;

    /* JADX INFO: renamed from: c */
    public final kfk f24837c;

    /* JADX INFO: renamed from: d */
    public final mrm f24838d;

    /* JADX INFO: renamed from: e */
    public final fcp f24839e;

    /* JADX INFO: renamed from: f */
    public final int f24840f;

    /* JADX INFO: renamed from: g */
    public final ccs f24841g;

    /* JADX INFO: renamed from: h */
    public final ccf f24842h;

    /* JADX INFO: renamed from: i */
    public nqf f24843i;

    /* JADX INFO: renamed from: l */
    public final glu f24846l;

    /* JADX INFO: renamed from: m */
    public final dhv f24847m;

    /* JADX INFO: renamed from: n */
    public final cbv f24848n;

    /* JADX INFO: renamed from: p */
    public final drj f24850p;

    /* JADX INFO: renamed from: q */
    public final dfn f24851q;

    /* JADX INFO: renamed from: s */
    public final bkn f24853s;

    /* JADX INFO: renamed from: t */
    private final jwn f24854t;

    /* JADX INFO: renamed from: u */
    private final ghn f24855u;

    /* JADX INFO: renamed from: v */
    private final ScheduledExecutorService f24856v;

    /* JADX INFO: renamed from: w */
    private volatile ScheduledFuture f24857w;

    /* JADX INFO: renamed from: y */
    private final jww f24859y;

    /* JADX INFO: renamed from: x */
    private final Object f24858x = new Object();

    /* JADX INFO: renamed from: j */
    public kba f24844j = null;

    /* JADX INFO: renamed from: k */
    public kba f24845k = null;

    /* JADX INFO: renamed from: z */
    private boolean f24860z = false;

    /* JADX INFO: renamed from: o */
    public final Runnable f24849o = new ghv(this, 7, null);

    /* JADX INFO: renamed from: r */
    public final nax f24852r = new nax((byte[]) null, (byte[]) null, (byte[]) null);

    public ghy(fvu fvuVar, mrm mrmVar, ghn ghnVar, drj drjVar, bkn bknVar, ScheduledExecutorService scheduledExecutorService, ccs ccsVar, kfk kfkVar, jww jwwVar, jww jwwVar2, fup fupVar, mrm mrmVar2, fcp fcpVar, oju ojuVar, dfn dfnVar, glu gluVar, jwn jwnVar, jwn jwnVar2, dhv dhvVar, cbv cbvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f24842h = (ccf) ojuVar.get();
        this.f24835a = mrmVar;
        this.f24834B = new oyo(fvuVar.mo14553f());
        this.f24836b = jwnVar;
        this.f24854t = jwnVar2;
        this.f24855u = ghnVar;
        this.f24837c = kfkVar;
        this.f24850p = drjVar;
        this.f24853s = bknVar;
        this.f24838d = mrmVar2;
        this.f24856v = scheduledExecutorService;
        this.f24841g = ccsVar;
        this.f24859y = fvuVar.mo14558k() != kmq.f36557a ? jwwVar : jwwVar2;
        this.f24833A = fupVar;
        this.f24839e = fcpVar;
        this.f24851q = dfnVar;
        this.f24846l = gluVar;
        this.f24847m = dhvVar;
        this.f24848n = cbvVar;
        this.f24840f = ((Integer) dhvVar.mo6173a(dib.f11232S).orElse(10000)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, jww] */
    /* JADX INFO: renamed from: h */
    public final void m9262h(final boolean z, final boolean z2, final boolean z3) {
        if (z3) {
            this.f24850p.f12398d.mo3415bf(false);
        }
        fuo fuoVar = (fuo) ((gtd) this.f24833A.f23601a.f34942d).f26334a;
        final boolean z4 = (fuoVar.f23596b == gst.FOCUSED_LOCKED || fuoVar.f23596b == gst.NOT_FOCUSED_LOCKED) && z2;
        if (z4) {
            this.f24853s.f3651a.mo3415bf(false);
        }
        ((Executor) this.f24838d.mo16809c()).execute(new Runnable() { // from class: ghs
            @Override // java.lang.Runnable
            public final void run() {
                ghy ghyVar = this.f24811a;
                boolean z5 = z4;
                boolean z6 = z3;
                boolean z7 = z;
                boolean z8 = z2;
                ghyVar.f24837c.mo14126m(z5, z6, false);
                if (z7) {
                    kew kewVarMo14115b = ghyVar.f24837c.mo14115b();
                    if (z8) {
                        ((kgo) kewVarMo14115b).f35937h = ghyVar.f24851q.m6072h();
                    }
                    if (z6) {
                        ((kgo) kewVarMo14115b).f35938i = ghyVar.f24851q.m6072h();
                    }
                    ((kgo) kewVarMo14115b).f35939j = ghyVar.f24851q.m6072h();
                    ghyVar.f24837c.mo14127n(kewVarMo14115b.mo14090a());
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final PointF m9263b(hsg hsgVar) {
        PointF pointF = new PointF(hsgVar.f29404b.centerX(), hsgVar.f29404b.centerY());
        return !hsgVar.m10694c() ? pointF : this.f24834B.m19204h(pointF);
    }

    @Override // p000.cbu
    /* JADX INFO: renamed from: bh */
    public final synchronized cdj mo3409bh(bko bkoVar) {
        float f = ((PointF) bkoVar.f3652a).x;
        float f2 = ((PointF) bkoVar.f3652a).y;
        if (!this.f24860z && this.f24835a.mo16813g() && this.f24838d.mo16813g()) {
            if (!((Boolean) ((jwf) this.f24850p.f12398d).f34942d).booleanValue()) {
                this.f24846l.mo9465i();
            }
            if (((Boolean) this.f24854t.mo3831be()).booleanValue()) {
                return this.f24855u.mo3409bh(bkoVar);
            }
            if (((hrx) this.f24835a.mo16809c()).mo10663i() && !((Boolean) this.f24836b.mo3831be()).booleanValue()) {
                final PointF pointFM19203g = this.f24834B.m19203g((PointF) bkoVar.f3652a);
                this.f24839e.mo8186f(true, pointFM19203g);
                if (m9267f((PointF) bkoVar.f3652a)) {
                    return new ccj();
                }
                kba kbaVar = this.f24844j;
                if (kbaVar != null) {
                    kbaVar.close();
                }
                kba kbaVar2 = this.f24845k;
                if (kbaVar2 != null) {
                    kbaVar2.close();
                }
                synchronized (this.f24858x) {
                    if (this.f24857w != null) {
                        this.f24857w.cancel(false);
                    }
                }
                m9264c();
                nqf nqfVarM17621g = nqf.m17621g();
                this.f24843i = nqfVarM17621g;
                if (((Integer) this.f24859y.mo3831be()).intValue() == gzk.ON_LOCKED.f26932f) {
                    this.f24859y.mo3415bf(Integer.valueOf(gzk.ON.f26932f));
                }
                boolean z = !((Boolean) ((jwf) this.f24850p.f12398d).f34942d).booleanValue();
                m9262h(false, true, z);
                this.f24852r.m17237h();
                final nqf nqfVarM17621g2 = nqf.m17621g();
                m9266e((PointF) bkoVar.f3652a, z, true, false);
                m9266e((PointF) bkoVar.f3652a, z, true, true);
                final nqf nqfVarM17621g3 = nqf.m17621g();
                ((Executor) this.f24838d.mo16809c()).execute(new Runnable() { // from class: ght
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ghy ghyVar = this.f24816a;
                        PointF pointF = pointFM19203g;
                        nqf nqfVar = nqfVarM17621g3;
                        final nqf nqfVar2 = nqfVarM17621g2;
                        if (ghyVar.f24847m.mo6184l(dhu.f11209k) && ((Boolean) ((jwf) ghyVar.f24853s.f3651a).f34942d).booleanValue()) {
                            return;
                        }
                        jwn jwnVarMo10669a = ((hrx) ghyVar.f24835a.mo16809c()).mo10669a(pointF, hrw.TOUCH_TO_FOCUS);
                        nqfVar.mo14894e(jwr.m13640j(jwnVarMo10669a, new etx(ghyVar, 15)));
                        ghyVar.f24844j = jwnVarMo10669a.mo3830a(new gcu(ghyVar, 20), not.INSTANCE);
                        ghyVar.f24845k = jwnVarMo10669a.mo3830a(new kbg() { // from class: ghw
                            @Override // p000.kbg
                            /* JADX INFO: renamed from: bf */
                            public final void mo3415bf(Object obj) {
                                ghy ghyVar2 = ghyVar;
                                nqf nqfVar3 = nqfVar2;
                                hsg hsgVar = (hsg) obj;
                                if (hsgVar.f29408f == 1) {
                                    ghyVar2.f24839e.mo8187g(true, new PointF(hsgVar.f29404b.centerX(), hsgVar.f29404b.centerY()), hsgVar.f29407e, hsgVar.f29406d, hsgVar.f29403a.ordinal());
                                    nqfVar3.mo14894e(bzq.m3281u());
                                    if (hsgVar.f29408f != 1) {
                                        return;
                                    }
                                    if (((Boolean) ghyVar2.f24836b.mo3831be()).booleanValue()) {
                                        ghyVar2.m9265d(ghyVar2.f24840f);
                                    } else if (hsgVar.f29407e < 5000 || ghyVar2.f24848n.m3410a()) {
                                        ghyVar2.m9265d(Math.max(0L, 5000 - hsgVar.f29407e));
                                    } else {
                                        ((Executor) ghyVar2.f24838d.mo16809c()).execute(ghyVar2.f24849o);
                                    }
                                }
                            }
                        }, (Executor) ghyVar.f24838d.mo16809c());
                    }
                });
                return new ghx(this, nqfVarM17621g2, nqfVarM17621g, nqfVarM17621g3);
            }
            if (((hrx) this.f24835a.mo16809c()).mo10663i()) {
                ((Boolean) this.f24836b.mo3831be()).booleanValue();
            }
            return this.f24855u.mo3409bh(bkoVar);
        }
        return new ccj();
    }

    /* JADX INFO: renamed from: c */
    public final void m9264c() {
        this.f24841g.m3466c(this.f24849o);
        this.f24842h.m3428c(this.f24849o);
        this.f24842h.m3430e();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f24860z = true;
        synchronized (this.f24858x) {
            if (this.f24857w != null) {
                this.f24857w.cancel(false);
            }
        }
        m9264c();
        kba kbaVar = this.f24844j;
        if (kbaVar != null) {
            kbaVar.close();
        }
        kba kbaVar2 = this.f24845k;
        if (kbaVar2 != null) {
            kbaVar2.close();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9265d(long j) {
        try {
            synchronized (this.f24858x) {
                this.f24857w = this.f24856v.schedule(new ghv(this, 0), j, TimeUnit.MILLISECONDS);
            }
        } catch (RejectedExecutionException e) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9266e(final PointF pointF, final boolean z, final boolean z2, final boolean z3) {
        ((Executor) this.f24838d.mo16809c()).execute(new Runnable() { // from class: ghu
            @Override // java.lang.Runnable
            public final void run() {
                ghy ghyVar = this.f24820a;
                PointF pointF2 = pointF;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                if (!z4) {
                    if (!z5) {
                        return;
                    } else {
                        z5 = true;
                    }
                }
                if ((z6 || ghyVar.f24852r.m17238i(pointF2)) && !ghyVar.m9267f(pointF2)) {
                    MeteringRectangle[] meteringRectangleArrM6075k = z6 ? ghyVar.f24851q.m6075k(pointF2) : ghyVar.f24851q.m6074j(pointF2);
                    kew kewVarMo14115b = ghyVar.f24837c.mo14115b();
                    if (z5) {
                        ((kgo) kewVarMo14115b).f35937h = meteringRectangleArrM6075k;
                    }
                    if (z4) {
                        ((kgo) kewVarMo14115b).f35938i = meteringRectangleArrM6075k;
                    }
                    if (!z6) {
                        ghyVar.f24837c.mo14127n(kewVarMo14115b.mo14090a());
                        return;
                    }
                    try {
                        kfo kfoVarMo14117d = ghyVar.f24837c.mo14117d();
                        try {
                            kfoVarMo14117d.mo14160i(kewVarMo14115b.mo14090a());
                            kfoVarMo14117d.close();
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
                        float f = pointF2.x;
                        float f2 = pointF2.y;
                        Thread.currentThread().interrupt();
                    } catch (kec e3) {
                        float f3 = pointF2.x;
                        float f4 = pointF2.y;
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final boolean m9267f(PointF pointF) {
        return this.f24834B.m19203g(pointF).y > ((Float) this.f24847m.mo6180h(dhu.f11200b).get()).floatValue();
    }
}
