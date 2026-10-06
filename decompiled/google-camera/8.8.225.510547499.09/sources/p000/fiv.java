package p000;

import android.os.Handler;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fiv implements fir {

    /* JADX INFO: renamed from: u */
    private static final nbh f22155u = nbh.m17259h("com/google/android/apps/camera/microvideo/encoder/VideoTrackSamplerImpl");

    /* JADX INFO: renamed from: I */
    private ead f22164I;

    /* JADX INFO: renamed from: a */
    public final fgy f22169a;

    /* JADX INFO: renamed from: b */
    public final fiq f22170b;

    /* JADX INFO: renamed from: c */
    public final fie f22171c;

    /* JADX INFO: renamed from: d */
    public final Handler f22172d;

    /* JADX INFO: renamed from: e */
    public final Handler f22173e;

    /* JADX INFO: renamed from: f */
    public final mrm f22174f;

    /* JADX INFO: renamed from: g */
    public final fid f22175g;

    /* JADX INFO: renamed from: o */
    public final lby f22183o;

    /* JADX INFO: renamed from: p */
    public ldf f22184p;

    /* JADX INFO: renamed from: q */
    public lec f22185q;

    /* JADX INFO: renamed from: t */
    public final gvb f22188t;

    /* JADX INFO: renamed from: w */
    private final mrm f22190w;

    /* JADX INFO: renamed from: y */
    private fhv f22192y;

    /* JADX INFO: renamed from: z */
    private volatile fiy f22193z;

    /* JADX INFO: renamed from: M */
    private final ktz f22168M = inr.m11546r(((int) TimeUnit.SECONDS.convert(3000000, TimeUnit.MICROSECONDS)) * 60);

    /* JADX INFO: renamed from: v */
    private final AtomicBoolean f22189v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: x */
    private final lbp f22191x = lbp.m15146b();

    /* JADX INFO: renamed from: h */
    public volatile boolean f22176h = false;

    /* JADX INFO: renamed from: A */
    private final AtomicLong f22156A = new AtomicLong();

    /* JADX INFO: renamed from: B */
    private final AtomicLong f22157B = new AtomicLong();

    /* JADX INFO: renamed from: i */
    public final AtomicLong f22177i = new AtomicLong();

    /* JADX INFO: renamed from: j */
    public final AtomicLong f22178j = new AtomicLong();

    /* JADX INFO: renamed from: k */
    public final AtomicLong f22179k = new AtomicLong();

    /* JADX INFO: renamed from: C */
    private final AtomicLong f22158C = new AtomicLong();

    /* JADX INFO: renamed from: D */
    private final AtomicLong f22159D = new AtomicLong();

    /* JADX INFO: renamed from: E */
    private final AtomicLong f22160E = new AtomicLong();

    /* JADX INFO: renamed from: F */
    private final AtomicLong f22161F = new AtomicLong();

    /* JADX INFO: renamed from: l */
    public final AtomicLong f22180l = new AtomicLong();

    /* JADX INFO: renamed from: G */
    private final AtomicLong f22162G = new AtomicLong();

    /* JADX INFO: renamed from: H */
    private final AtomicLong f22163H = new AtomicLong();

    /* JADX INFO: renamed from: m */
    public final AtomicInteger f22181m = new AtomicInteger();

    /* JADX INFO: renamed from: n */
    public final AtomicInteger f22182n = new AtomicInteger();

    /* JADX INFO: renamed from: J */
    private final AtomicInteger f22165J = new AtomicInteger();

    /* JADX INFO: renamed from: r */
    public boolean f22186r = false;

    /* JADX INFO: renamed from: s */
    public boolean f22187s = false;

    /* JADX INFO: renamed from: K */
    private long f22166K = 0;

    /* JADX INFO: renamed from: L */
    private List f22167L = new ArrayList();

    public fiv(bko bkoVar, fgy fgyVar, fiq fiqVar, fid fidVar, fie fieVar, mrm mrmVar, fjb fjbVar, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        dhx dhxVar = dii.f11525a;
        dhvVar.mo6177e();
        this.f22169a = fgyVar;
        this.f22170b = fiqVar;
        this.f22175g = fidVar;
        this.f22171c = fieVar;
        this.f22173e = jvh.m13558f(new jvb(), "mv-vid-encode");
        this.f22172d = jvh.m13558f(new jvb(), "mv-vid-update");
        this.f22174f = mrmVar;
        dhvVar.mo6175c();
        lby lbyVarM2626t = bkoVar.m2626t("stabilized-vid-track");
        this.f22183o = lbyVarM2626t;
        dhvVar.mo6175c();
        this.f22188t = new gvb(lbyVarM2626t, fidVar.mo8436a(), 1);
        ead eadVar = new ead(lbyVarM2626t, 1);
        this.f22164I = eadVar;
        this.f22184p = eadVar.m6994a();
        this.f22185q = this.f22164I.m6995b(Collections.singletonList(lbp.m15146b()));
        this.f22190w = !fjbVar.f22203b.mo9812h(fjbVar.f22204c.mo14558k()) ? mqu.f41450a : mrm.m16829i(fjb.f22202a);
        dhvVar.mo6175c();
        dhx dhxVar2 = dib.f11240a;
        dhvVar.mo6178f();
    }

    /* JADX INFO: renamed from: i */
    private final fhu m8473i(long j) {
        fhu fhuVar;
        synchronized (this.f22168M) {
            fhuVar = (fhu) this.f22168M.m14857j(j);
            if (fhuVar == null) {
                fhuVar = new fhu(j, nqf.m17621g(), nqf.m17621g());
                this.f22168M.m14861n(j, fhuVar);
            }
        }
        return fhuVar;
    }

    /* JADX INFO: renamed from: j */
    private final void m8474j() {
        this.f22187s = false;
        this.f22171c.m8459b(false);
        m8477h();
        this.f22156A.set(0L);
        this.f22157B.set(0L);
        this.f22177i.set(0L);
        this.f22178j.set(0L);
        this.f22158C.set(0L);
        this.f22160E.set(0L);
        this.f22161F.set(0L);
    }

    @Override // p000.fhp
    /* JADX INFO: renamed from: a */
    public final void mo8443a(long j) {
        m8473i(j).f22076b.cancel(true);
        this.f22172d.post(new fit(this, 1));
    }

    @Override // p000.fhp
    /* JADX INFO: renamed from: b */
    public final void mo8444b(long j, List list) {
        if (this.f22176h) {
            return;
        }
        m8473i(j).f22076b.mo14894e(list);
        this.f22172d.post(new fit(this, 1));
    }

    @Override // p000.fir
    /* JADX INFO: renamed from: c */
    public final synchronized void mo8470c(kyt kytVar, fhv fhvVar) {
        this.f22192y = fhvVar;
        this.f22175g.mo8438c(kytVar, this.f22183o, new fiu(this, fhvVar, 0), this.f22173e);
        this.f22171c.m8459b(true);
    }

    @Override // p000.fir, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f22176h) {
            ((nbe) ((nbe) f22155u.m17252c()).mo17276G((char) 2326)).mo17290o("Trying to close after handler shutdown");
            return;
        }
        Iterator it = this.f22169a.mo8331f(this.f22166K).iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (this.f22174f.mo16813g()) {
                ((fhq) this.f22174f.mo16809c()).mo8446b(jLongValue);
            }
            mo8471d();
        }
        this.f22172d.post(new fdo(this, 19));
    }

    @Override // p000.fir
    /* JADX INFO: renamed from: d */
    public final void mo8471d() {
        if (this.f22176h) {
            return;
        }
        this.f22172d.post(new fit(this, 1));
    }

    @Override // p000.fir
    /* JADX INFO: renamed from: e */
    public final void mo8472e() {
        if (!this.f22176h) {
            this.f22172d.post(new fit(this, 2));
        } else {
            ((nbe) ((nbe) f22155u.m17252c()).mo17276G((char) 2335)).mo17290o(xRFdVyfdeve.Clqyq);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8475f() {
        if (this.f22189v.getAndSet(true)) {
            ((nbe) ((nbe) f22155u.m17252c()).mo17276G((char) 2334)).mo17290o("Shutdown already called. Skipping additional requests.");
            return;
        }
        m8477h();
        fid fidVar = this.f22175g;
        nps npsVarMo8437b = fidVar != null ? fidVar.mo8437b() : kxk.m14965K(null);
        flu.m8558a("VideoTrackSampler", npsVarMo8437b);
        npsVarMo8437b.mo2282d(new fdo(this, 20), not.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01a4 A[Catch: all -> 0x0060, ExecutionException -> 0x01fa, TryCatch #3 {ExecutionException -> 0x01fa, blocks: (B:52:0x0100, B:54:0x0116, B:56:0x011b, B:58:0x0123, B:60:0x0132, B:62:0x013c, B:63:0x0151, B:65:0x0157, B:67:0x0166, B:69:0x016e, B:72:0x0188, B:71:0x0172, B:73:0x0195, B:76:0x01a4, B:77:0x01af, B:78:0x01b7, B:80:0x01bd, B:83:0x01c6, B:85:0x01d6, B:87:0x01f0, B:89:0x01f6, B:84:0x01cc, B:59:0x012a, B:86:0x01e6), top: B:113:0x0100, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[Catch: all -> 0x0060, ExecutionException -> 0x01fa, TryCatch #3 {ExecutionException -> 0x01fa, blocks: (B:52:0x0100, B:54:0x0116, B:56:0x011b, B:58:0x0123, B:60:0x0132, B:62:0x013c, B:63:0x0151, B:65:0x0157, B:67:0x0166, B:69:0x016e, B:72:0x0188, B:71:0x0172, B:73:0x0195, B:76:0x01a4, B:77:0x01af, B:78:0x01b7, B:80:0x01bd, B:83:0x01c6, B:85:0x01d6, B:87:0x01f0, B:89:0x01f6, B:84:0x01cc, B:59:0x012a, B:86:0x01e6), top: B:113:0x0100, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01cc A[Catch: all -> 0x0060, ExecutionException -> 0x01fa, TryCatch #3 {ExecutionException -> 0x01fa, blocks: (B:52:0x0100, B:54:0x0116, B:56:0x011b, B:58:0x0123, B:60:0x0132, B:62:0x013c, B:63:0x0151, B:65:0x0157, B:67:0x0166, B:69:0x016e, B:72:0x0188, B:71:0x0172, B:73:0x0195, B:76:0x01a4, B:77:0x01af, B:78:0x01b7, B:80:0x01bd, B:83:0x01c6, B:85:0x01d6, B:87:0x01f0, B:89:0x01f6, B:84:0x01cc, B:59:0x012a, B:86:0x01e6), top: B:113:0x0100, outer: #0 }] */
    /* JADX INFO: renamed from: g */
    public final void m8476g() {
        List listM17097l;
        long jMo7248d;
        fiq fiqVar;
        if (Thread.currentThread().getId() != this.f22172d.getLooper().getThread().getId()) {
            ((nbe) ((nbe) f22155u.m17252c()).mo17276G((char) 2336)).mo17290o("Sampling video on a non-video-encoder thread");
        }
        long jMo8326a = this.f22169a.mo8326a();
        if (jMo8326a != -1) {
            this.f22162G.set(jMo8326a);
        }
        fhv fhvVar = this.f22192y;
        if (this.f22175g.mo8439d() && fhvVar != null && this.f22187s) {
            kpw kpwVarMo8327b = this.f22169a.mo8327b(this.f22166K);
            if (kpwVarMo8327b != null) {
                try {
                    this.f22163H.set(kpwVarMo8327b.mo7248d());
                } catch (Throwable th) {
                    if (kpwVarMo8327b != null) {
                        try {
                            kpwVarMo8327b.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception e) {
                            }
                        }
                    }
                    throw th;
                }
            }
            if (kpwVarMo8327b == null) {
                if (this.f22186r) {
                    m8474j();
                    m8475f();
                    return;
                }
                return;
            }
            long jMo7248d2 = kpwVarMo8327b.mo7248d();
            long jConvert = TimeUnit.MICROSECONDS.convert(jMo7248d2, TimeUnit.NANOSECONDS);
            if (this.f22158C.get() <= 0 || jMo7248d2 - this.f22158C.get() > 5000000000L || jMo7248d2 < this.f22158C.get()) {
                this.f22158C.set(jMo7248d2);
                m8477h();
            }
            oyo oyoVarMo8427f = fhvVar.mo8427f(jConvert);
            if (oyoVarMo8427f.m19205l()) {
                this.f22166K = jMo7248d2;
                this.f22172d.post(new fit(this, 1));
            }
            fhu fhuVarM8473i = m8473i(jMo7248d2);
            fhuVarM8473i.f22077c.mo14894e(oyoVarMo8427f);
            boolean zM19207n = oyoVarMo8427f.m19207n();
            boolean z = zM19207n && !fhuVarM8473i.f22076b.isDone();
            if (fhuVarM8473i.f22077c.isDone() && !z && !fhuVarM8473i.f22077c.isCancelled()) {
                boolean z2 = zM19207n && !fhuVarM8473i.f22076b.isCancelled();
                long jMo7248d3 = kpwVarMo8327b.mo7248d();
                try {
                    oyo oyoVar = (oyo) kxk.m14973S(fhuVarM8473i.f22077c);
                    TimeUnit.MICROSECONDS.convert(fhuVarM8473i.f22075a, TimeUnit.NANOSECONDS);
                    if ((oyoVar.f46847a & 1) != 0) {
                        flu.m8559b();
                        if (z2) {
                            listM17097l = (List) kxk.m14973S(fhuVarM8473i.f22076b);
                        } else {
                            if (this.f22190w.mo16813g()) {
                                listM17097l = mws.m17097l(this.f22191x);
                            }
                            this.f22165J.incrementAndGet();
                            jMo7248d = kpwVarMo8327b.mo7248d();
                            fiqVar = this.f22170b;
                            if (fiqVar != null) {
                                if (zM19207n) {
                                    fiqVar.mo8468d(jMo7248d, this.f22167L);
                                    this.f22160E.incrementAndGet();
                                } else {
                                    fiqVar.mo8467c(jMo7248d);
                                    this.f22161F.incrementAndGet();
                                }
                            }
                            this.f22166K = fhuVarM8473i.f22075a;
                            if (!zM19207n || this.f22190w.mo16813g()) {
                                this.f22175g.mo8442g(kpwVarMo8327b, new fis(this, 0));
                            } else {
                                this.f22175g.mo8441f(kpwVarMo8327b);
                            }
                            this.f22157B.incrementAndGet();
                            this.f22172d.post(new fit(this, 1));
                        }
                        this.f22167L = listM17097l;
                        if (this.f22190w.mo16813g()) {
                            ArrayList arrayList = new ArrayList(listM17097l.size());
                            lbp lbpVar = (lbp) this.f22190w.mo16809c();
                            Iterator it = listM17097l.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((lbp) it.next()).m15147c(lbpVar));
                            }
                            listM17097l = arrayList;
                        }
                        int size = listM17097l.size();
                        ead eadVar = this.f22164I;
                        if (eadVar == null || eadVar.f13039b != size) {
                            this.f22164I = new ead(this.f22183o, size);
                            this.f22184p.close();
                            this.f22184p = this.f22164I.m6994a();
                        }
                        this.f22185q.close();
                        this.f22185q = this.f22164I.m6995b(listM17097l);
                        this.f22165J.incrementAndGet();
                        jMo7248d = kpwVarMo8327b.mo7248d();
                        fiqVar = this.f22170b;
                        if (fiqVar != null) {
                            if (zM19207n) {
                                fiqVar.mo8468d(jMo7248d, this.f22167L);
                                this.f22160E.incrementAndGet();
                            } else {
                                fiqVar.mo8467c(jMo7248d);
                                this.f22161F.incrementAndGet();
                            }
                        }
                        this.f22166K = fhuVarM8473i.f22075a;
                        if (zM19207n) {
                            this.f22175g.mo8442g(kpwVarMo8327b, new fis(this, 0));
                        } else {
                            this.f22175g.mo8442g(kpwVarMo8327b, new fis(this, 0));
                        }
                        this.f22157B.incrementAndGet();
                        this.f22172d.post(new fit(this, 1));
                    } else {
                        this.f22156A.incrementAndGet();
                        this.f22159D.set(jMo7248d3);
                    }
                    if (oyoVar.m19206m()) {
                        m8474j();
                    }
                } catch (ExecutionException e2) {
                    throw new AssertionError("Future expected to be in done state but was not.", e2);
                }
            } else if (this.f22186r) {
                m8474j();
                m8475f();
            }
            kpwVarMo8327b.close();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8477h() {
        this.f22156A.get();
        this.f22157B.get();
        this.f22177i.get();
        this.f22178j.get();
        this.f22179k.get();
        this.f22160E.get();
        this.f22161F.get();
        this.f22162G.get();
        this.f22163H.get();
        this.f22159D.get();
        this.f22181m.get();
    }
}
