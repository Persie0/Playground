package p000;

import android.graphics.Bitmap;
import android.media.AudioManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cqg implements jyt, kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f8825a = nbh.m17259h("com/google/android/apps/camera/camcorder/Video2ActiveCamcorderRecordingSession");

    /* JADX INFO: renamed from: C */
    public ScheduledFuture f8828C;

    /* JADX INFO: renamed from: D */
    public final List f8829D;

    /* JADX INFO: renamed from: E */
    public cqf f8830E;

    /* JADX INFO: renamed from: F */
    public cuu f8831F;

    /* JADX INFO: renamed from: G */
    public int f8832G;

    /* JADX INFO: renamed from: H */
    public kcc f8833H;

    /* JADX INFO: renamed from: I */
    public final dmy f8834I;

    /* JADX INFO: renamed from: J */
    public final cwd f8835J;

    /* JADX INFO: renamed from: K */
    public final cwd f8836K;

    /* JADX INFO: renamed from: L */
    public final cwd f8837L;

    /* JADX INFO: renamed from: M */
    private final idl f8838M;

    /* JADX INFO: renamed from: P */
    private final boolean f8841P;

    /* JADX INFO: renamed from: Q */
    private final crj f8842Q;

    /* JADX INFO: renamed from: R */
    private final mrm f8843R;

    /* JADX INFO: renamed from: S */
    private final csx f8844S;

    /* JADX INFO: renamed from: T */
    private gyv f8845T;

    /* JADX INFO: renamed from: U */
    private ctp f8846U;

    /* JADX INFO: renamed from: V */
    private long f8847V;

    /* JADX INFO: renamed from: W */
    private final djm f8848W;

    /* JADX INFO: renamed from: X */
    private final cvy f8849X;

    /* JADX INFO: renamed from: b */
    public final crg f8850b;

    /* JADX INFO: renamed from: c */
    public final jvd f8851c;

    /* JADX INFO: renamed from: d */
    public final cqm f8852d;

    /* JADX INFO: renamed from: g */
    public final cuk f8855g;

    /* JADX INFO: renamed from: h */
    public final crh f8856h;

    /* JADX INFO: renamed from: i */
    public final cqj f8857i;

    /* JADX INFO: renamed from: j */
    public final dhv f8858j;

    /* JADX INFO: renamed from: k */
    public final ggm f8859k;

    /* JADX INFO: renamed from: l */
    public final csn f8860l;

    /* JADX INFO: renamed from: m */
    public final csl f8861m;

    /* JADX INFO: renamed from: o */
    public final cwj f8863o;

    /* JADX INFO: renamed from: p */
    public final cww f8864p;

    /* JADX INFO: renamed from: q */
    public final cug f8865q;

    /* JADX INFO: renamed from: r */
    public final ScheduledExecutorService f8866r;

    /* JADX INFO: renamed from: s */
    public final mrm f8867s;

    /* JADX INFO: renamed from: t */
    public final hli f8868t;

    /* JADX INFO: renamed from: u */
    public final mrm f8869u;

    /* JADX INFO: renamed from: v */
    public final czr f8870v;

    /* JADX INFO: renamed from: w */
    public final hah f8871w;

    /* JADX INFO: renamed from: x */
    public final dlw f8872x;

    /* JADX INFO: renamed from: y */
    public final ScheduledExecutorService f8873y;

    /* JADX INFO: renamed from: z */
    public final kbz f8874z;

    /* JADX INFO: renamed from: e */
    public final List f8853e = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: f */
    public final Object f8854f = new Object();

    /* JADX INFO: renamed from: N */
    private final cpr f8839N = new cpr();

    /* JADX INFO: renamed from: O */
    private final kav f8840O = new kav();

    /* JADX INFO: renamed from: n */
    public final AtomicReference f8862n = new AtomicReference();

    /* JADX INFO: renamed from: A */
    public final List f8826A = new ArrayList();

    /* JADX INFO: renamed from: B */
    public final List f8827B = new CopyOnWriteArrayList();

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, oju] */
    public cqg(jvd jvdVar, cwd cwdVar, crh crhVar, cqj cqjVar, cwd cwdVar2, csm csmVar, djm djmVar, cwj cwjVar, cwz cwzVar, cuk cukVar, cvy cvyVar, cqm cqmVar, drj drjVar, cwd cwdVar3, hli hliVar, dhv dhvVar, ggm ggmVar, cxo cxoVar, idl idlVar, boolean z, bko bkoVar, dmy dmyVar, czr czrVar, crj crjVar, crg crgVar, csn csnVar, hah hahVar, dlw dlwVar, ScheduledExecutorService scheduledExecutorService, kbz kbzVar, mrm mrmVar, csx csxVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        mrm mrmVarM16829i;
        ArrayList arrayList = new ArrayList();
        this.f8829D = arrayList;
        this.f8832G = 0;
        this.f8847V = 0L;
        this.f8851c = jvdVar;
        this.f8837L = cwdVar;
        this.f8852d = cqmVar;
        this.f8848W = djmVar;
        this.f8863o = cwjVar;
        this.f8856h = crhVar;
        this.f8857i = cqjVar;
        this.f8835J = cwdVar2;
        this.f8858j = dhvVar;
        this.f8859k = ggmVar;
        this.f8838M = idlVar;
        this.f8841P = z;
        this.f8860l = csnVar;
        csl cslVarM5464a = csmVar.m5464a();
        this.f8861m = cslVarM5464a;
        this.f8850b = crgVar;
        this.f8864p = cwzVar;
        this.f8855g = cukVar;
        this.f8849X = cvyVar;
        this.f8866r = jzn.m13828p("Recording-" + ((AtomicInteger) djmVar.f11788b).incrementAndGet());
        this.f8836K = cwdVar3;
        this.f8868t = hliVar;
        this.f8834I = dmyVar;
        this.f8870v = czrVar;
        this.f8842Q = crjVar;
        this.f8871w = hahVar;
        this.f8872x = dlwVar;
        this.f8873y = scheduledExecutorService;
        this.f8874z = kbzVar;
        this.f8843R = mrmVar;
        this.f8844S = csxVar;
        if (crhVar.mo5397c() && csnVar.f9359x == kmq.BACK) {
            iuj iujVar = ((ity) drjVar.f12399e).get();
            jwn jwnVar = (jwn) drjVar.f12395a.get();
            jwnVar.getClass();
            cwd cwdVar4 = (cwd) drjVar.f12396b.get();
            cwdVar4.getClass();
            AudioManager audioManager = ((emm) drjVar.f12398d).get();
            jww jwwVar = (jww) drjVar.f12397c.get();
            jwwVar.getClass();
            mrmVarM16829i = mrm.m16829i(new ckt(iujVar, jwnVar, cwdVar4, audioManager, jwwVar, null));
        } else {
            mrmVarM16829i = mqu.f41450a;
        }
        this.f8867s = mrmVarM16829i;
        if (mrmVarM16829i.mo16813g()) {
            ((ckr) mrmVarM16829i.mo16809c()).mo3844a();
        }
        m5354j(cqf.READY);
        djmVar.m6235j();
        if (crhVar.mo5402h()) {
            arrayList.add(cxoVar.m5716a());
            cwdVar2.m5657d(cum.RECORDING_SESSION).m13537d(cxoVar.m5717b(new cxl(this, 1)));
        }
        cwdVar2.m5657d(cum.RECORDING_SESSION).m13537d(this);
        cwdVar2.m5657d(cum.RECORDING_SESSION).m13537d(cwzVar);
        this.f8869u = csnVar.f9338c == jxn.FPS_AUTO ? mrm.m16829i(new cub()) : mqu.f41450a;
        this.f8865q = new cug(csnVar, bkoVar, dhvVar, czrVar, cslVarM5464a, m5347c(), kbzVar, null, null, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final ctg m5346b() {
        ctg ctgVar;
        synchronized (this.f8854f) {
            cuu cuuVar = this.f8831F;
            cuuVar.getClass();
            ctgVar = (ctg) mkv.m16515W(cuuVar.f9690b);
        }
        return ctgVar;
    }

    /* JADX INFO: renamed from: c */
    public final cxk m5347c() {
        if (this.f8829D.isEmpty()) {
            return null;
        }
        return (cxk) mkv.m16515W(this.f8829D);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f8854f) {
            if (this.f8830E != cqf.STOPPED) {
                m5356l(true, 7);
                this.f8866r.shutdown();
                m5354j(cqf.STOPPED);
                if (this.f8860l.f9330B) {
                    this.f8834I.m6415c();
                    this.f8870v.m5745c(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5348d() {
        gyv gyvVarM10003a = gyv.m10003a(gyu.m10002a(), System.currentTimeMillis(), dlt.m6367a(gyw.VIDEO, System.currentTimeMillis()), gyw.VIDEO);
        this.f8845T = gyvVarM10003a;
        this.f8827B.add(gyvVarM10003a);
        dlw dlwVar = this.f8872x;
        gyv gyvVar = this.f8845T;
        gyvVar.getClass();
        dlwVar.mo6362j(gyvVar);
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: e */
    public final void mo5349e() {
        cpw cpwVar = (cpw) this.f8850b;
        cpwVar.m5272n(new cmd(cpwVar.f8688d, 13), 6);
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: f */
    public final void mo5350f() {
        synchronized (this.f8854f) {
            if (this.f8830E == cqf.STOPPING_RECORDING) {
                return;
            }
            if (this.f8856h.mo5404j()) {
                try {
                    this.f8846U = this.f8849X.m5633j(this.f8860l.f9342g.f35097a.f35067f);
                    cuu cuuVar = this.f8831F;
                    cuuVar.getClass();
                    cuuVar.f9689a.mo13754m(this.f8846U.mo5502f());
                } catch (Exception e) {
                    ((nbe) ((nbe) ((nbe) f8825a.m17251b()).mo17283h(e)).mo17276G(472)).mo17290o("Failed to set next video file.");
                    mo5351g();
                }
            }
        }
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: g */
    public final void mo5351g() {
        cpw cpwVar = (cpw) this.f8850b;
        kxk.m14975U(cpwVar.m5271m(false, 5), new cmo(cpwVar, 3), cpwVar.f8687c);
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: h */
    public final void mo5352h() {
        synchronized (this.f8854f) {
            lmv lmvVarM5491a = ctg.m5491a();
            lmvVarM5491a.m15743h(this.f8846U);
            lmvVarM5491a.m15744i(this.f8848W.m6236k());
            ctg ctgVarM15742g = lmvVarM5491a.m15742g();
            this.f8855g.m5529b(ctgVarM15742g.f9424b);
            m5355k(m5346b());
            cuu cuuVar = this.f8831F;
            cuuVar.getClass();
            cuuVar.f9690b.add(ctgVarM15742g);
            m5348d();
        }
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: i */
    public final void mo5353i(long j, long j2) {
        long j3 = j2 * 8;
        this.f8840O.m13887a(new kau(j, j3));
        this.f8847V += j3;
        this.f8865q.m5523l(j);
    }

    /* JADX INFO: renamed from: j */
    public final void m5354j(cqf cqfVar) {
        synchronized (this.f8854f) {
            this.f8830E = cqfVar;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5355k(ctg ctgVar) {
        mwx mwxVarM16558w;
        List list;
        float f;
        synchronized (this.f8854f) {
            ctp ctpVar = ctgVar.f9423a;
            long jM5528a = this.f8855g.m5528a(ctgVar.f9424b);
            if (ctpVar.mo5504h() && (this.f8860l.f9329A || jM5528a >= 1000)) {
                ctpVar.close();
                cuu cuuVar = this.f8831F;
                cuuVar.getClass();
                jyx jyxVar = cuuVar.f9689a;
                if (cuuVar.f9690b.size() == 1 && this.f8860l.f9329A) {
                    jM5528a = ((Long) jyxVar.mo13747f().mo16811e(Long.valueOf(jM5528a))).longValue();
                }
                long j = jM5528a;
                float f2 = j / 1000.0f;
                float fM13655a = f2 == 0.0f ? 0.0f : this.f8847V / (f2 * this.f8860l.f9338c.m13655a());
                mrm mrmVarMo13746e = this.f8860l.f9329A ? jyxVar.mo13746e() : mrm.m16829i(Long.valueOf(this.f8865q.m5520i()));
                jxv jxvVar = this.f8860l.f9342g;
                cwd cwdVar = this.f8836K;
                jyxVar.mo13745d();
                boolean zBooleanValue = ((Boolean) ((jwf) this.f8861m.f9276f).f34942d).booleanValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                int iM5519h = this.f8865q.m5519h();
                int iM5518g = this.f8865q.m5518g();
                int iM6234i = this.f8848W.m6234i();
                int iM6235j = this.f8848W.m6235j();
                int iIntValue = ((Integer) ((jwf) this.f8861m.f9284n).f34942d).intValue();
                cpr cprVar = this.f8839N;
                synchronized (cprVar.f8666b) {
                    mwxVarM16558w = mkv.m16558w(cprVar.f8665a);
                    cprVar.f8665a.clear();
                }
                gyw gywVar = this.f8860l.f9360y;
                List list2 = this.f8829D;
                int i = this.f8832G;
                boolean z = this.f8841P;
                if (this.f8869u.mo16813g()) {
                    cub cubVar = (cub) this.f8869u.mo16809c();
                    list = list2;
                    float f3 = cubVar.f9590a;
                    float f4 = (cubVar.f9591b / 2) + f3;
                    f = f4 == 0.0f ? 0.0f : f3 / f4;
                } else {
                    list = list2;
                    f = this.f8860l.f9338c == jxn.FPS_30 ? 1.0f : 0.0f;
                }
                long j2 = (long) fM13655a;
                long jM13670b = this.f8860l.f9342g.m13670b();
                gyv gyvVar = this.f8845T;
                gyvVar.getClass();
                csn csnVar = this.f8860l;
                boolean z2 = csnVar.f9330B;
                boolean z3 = csnVar.f9331C && ((gzo) this.f8861m.f9286p.mo3831be()).equals(gzo.ON);
                mrm mrmVarMo5412a = this.f8842Q.mo5412a();
                mrm mrmVar = this.f8843R;
                ctj ctjVar = new ctj(ctpVar, jxvVar, cwdVar, zBooleanValue, jCurrentTimeMillis, j, iM5519h, iM5518g, iM6234i, iM6235j, iIntValue, mrmVarMo13746e, mwxVarM16558w, gywVar, list, i, z, f, j2, jM13670b, gyvVar, z2, z3, mrmVarMo5412a, mrmVar.mo16813g() ? mrm.m16829i(((gmh) mrmVar.mo16809c()).mo9505c()) : mqu.f41450a, this.f8844S.mo5483a(), null, null);
                this.f8865q.m5520i();
                this.f8865q.m5519h();
                this.f8865q.m5518g();
                if (this.f8860l.f9329A) {
                    ((nbe) ((nbe) f8825a.m17252c()).mo17276G(479)).mo17297v("Video file encoded %d frames, frame drop listener saw %d", ctjVar.f9460k, this.f8865q.m5520i());
                }
                this.f8826A.add(0, ctjVar);
                return;
            }
            ctpVar.mo5503g();
            this.f8838M.m11118c(idj.RECORDING_TOO_SHORT);
            ((nbe) ((nbe) f8825a.m17252c()).mo17276G(477)).mo17290o("Video file is abandoned. Probably because the length is too short.");
            dlw dlwVar = this.f8872x;
            gyv gyvVar2 = this.f8845T;
            gyvVar2.getClass();
            dlwVar.mo6359g(gyvVar2.f26876b);
            List list3 = this.f8827B;
            gyv gyvVar3 = this.f8845T;
            gyvVar3.getClass();
            list3.remove(gyvVar3);
            this.f8845T = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final nps m5356l(boolean z, final int i) {
        nps npsVarM17554j;
        cqf cqfVar;
        synchronized (this.f8854f) {
            if (this.f8830E != cqf.RECORDING && (cqfVar = this.f8830E) != cqf.RECORDING_PAUSED && cqfVar != cqf.STARTING_RECORDING) {
                return kxk.m14964J(new IllegalStateException("Trying to stop with state=" + String.valueOf(cqfVar)));
            }
            m5354j(cqf.STOPPING_RECORDING);
            synchronized (this.f8854f) {
                int i2 = 0;
                lku.m15613H(this.f8830E == cqf.STOPPING_RECORDING);
                mrm mrmVar = this.f8867s;
                if (mrmVar.mo16813g()) {
                    ((ckr) mrmVar.mo16809c()).mo3846c();
                }
                cuu cuuVar = this.f8831F;
                cuuVar.getClass();
                final jyx jyxVar = cuuVar.f9689a;
                final nqf nqfVarM17621g = nqf.m17621g();
                ctg ctgVarM5346b = m5346b();
                long jM5528a = this.f8855g.m5528a(ctgVarM5346b.f9424b);
                if (z) {
                    this.f8868t.m10437h(hlh.VIDEO_RECORDER_STOPPING);
                    nqfVarM17621g.mo16665f(this.f8860l.f9329A ? jyxVar.mo13750i() : jyxVar.mo13752k());
                } else {
                    cjd cjdVar = new cjd("CdrRecSession", this.f8860l.f9329A ? 0 : 1000 - ((int) jM5528a));
                    this.f8835J.m5657d(cum.RECORDING_SESSION).m13537d(cjdVar);
                    cjdVar.execute(new Runnable() { // from class: cqb
                        @Override // java.lang.Runnable
                        public final void run() {
                            cqg cqgVar = this.f8809a;
                            nqf nqfVar = nqfVarM17621g;
                            jyx jyxVar2 = jyxVar;
                            cqgVar.f8868t.m10437h(hlh.VIDEO_RECORDER_STOPPING);
                            nqfVar.mo16665f(jyxVar2.mo13752k());
                        }
                    });
                }
                npsVarM17554j = nod.m17554j(nqfVarM17621g, new cqc(this, ctgVarM5346b, i2), not.INSTANCE);
            }
            return nod.m17553i(npsVarM17554j, new mrf() { // from class: cpz
                @Override // p000.mrf
                public final Object apply(Object obj) {
                    cqg cqgVar = this.f8766a;
                    return new fta((List) obj, cqgVar.f8853e, (Bitmap) cqgVar.f8862n.get(), i);
                }
            }, not.INSTANCE);
        }
    }

    @Override // p000.jzg
    /* JADX INFO: renamed from: a */
    public final void mo5259a(jzf jzfVar) {
        if (!this.f8860l.f9329A) {
            throw new UnsupportedOperationException("Not implemented");
        }
        this.f8839N.mo5259a(jzfVar);
        this.f8850b.mo5259a(jzfVar);
    }
}
