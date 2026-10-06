package p000;

import android.graphics.Rect;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epr implements eqv {

    /* JADX INFO: renamed from: a */
    public static final nbh f15012a = nbh.m17259h("com/google/android/apps/camera/lasagna/MotionBlurControllerImpl");

    /* JADX INFO: renamed from: c */
    public final epy f15014c;

    /* JADX INFO: renamed from: d */
    public final nsk f15015d;

    /* JADX INFO: renamed from: e */
    public final jwf f15016e;

    /* JADX INFO: renamed from: f */
    public final dhv f15017f;

    /* JADX INFO: renamed from: g */
    public final kme f15018g;

    /* JADX INFO: renamed from: h */
    public final nri f15019h;

    /* JADX INFO: renamed from: i */
    public final eqm f15020i;

    /* JADX INFO: renamed from: j */
    public final kbz f15021j;

    /* JADX INFO: renamed from: k */
    public final gpx f15022k;

    /* JADX INFO: renamed from: l */
    public final mrm f15023l;

    /* JADX INFO: renamed from: m */
    public final eqc f15024m;

    /* JADX INFO: renamed from: o */
    public final nsz f15026o;

    /* JADX INFO: renamed from: p */
    equ f15027p;

    /* JADX INFO: renamed from: q */
    public eqz f15028q;

    /* JADX INFO: renamed from: s */
    public final glk f15030s;

    /* JADX INFO: renamed from: u */
    private final kba f15031u;

    /* JADX INFO: renamed from: v */
    private final jwn f15032v;

    /* JADX INFO: renamed from: w */
    private final Executor f15033w;

    /* JADX INFO: renamed from: x */
    private final Executor f15034x;

    /* JADX INFO: renamed from: y */
    private jut f15035y;

    /* JADX INFO: renamed from: z */
    private final glk f15036z;

    /* JADX INFO: renamed from: b */
    public final Object f15013b = new Object();

    /* JADX INFO: renamed from: n */
    public final Map f15025n = new HashMap();

    /* JADX INFO: renamed from: r */
    public final LasagnaCallbacks f15029r = new epp(this);

    public epr(Executor executor, jwf jwfVar, jwn jwnVar, eqc eqcVar, Executor executor2, nsz nszVar, nsk nskVar, glk glkVar, ebv ebvVar, dhv dhvVar, kme kmeVar, eqm eqmVar, kbz kbzVar, mrm mrmVar, gpx gpxVar, epy epyVar, chx chxVar, glk glkVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f15033w = executor;
        this.f15016e = jwfVar;
        this.f15024m = eqcVar;
        this.f15034x = executor2;
        this.f15026o = nszVar;
        this.f15015d = nskVar;
        this.f15036z = glkVar;
        this.f15017f = dhvVar;
        this.f15018g = kmeVar;
        this.f15020i = eqmVar;
        this.f15021j = kbzVar;
        this.f15023l = mrmVar;
        this.f15022k = gpxVar;
        this.f15014c = epyVar;
        this.f15032v = jwnVar;
        this.f15030s = glkVar2;
        this.f15031u = new gjm(this, eqcVar, jwfVar, epyVar, 1);
        this.f15019h = ebvVar.m7084c() ? nri.f44215c : ebvVar.m7083b() ? nri.f44216d : nri.f44214b;
        chxVar.f5767b.m13537d(jwnVar.mo3830a(new dsu(this, 9), not.INSTANCE));
        m7631k();
    }

    /* JADX INFO: renamed from: i */
    public static final kbc m7630i(kbc kbcVar, kmd kmdVar) {
        Rect rectMo14555h = kmdVar.mo14555h();
        return new kbc(Math.max(kbcVar.f35517a, rectMo14555h.width()), Math.max(kbcVar.f35518b, rectMo14555h.height()));
    }

    /* JADX INFO: renamed from: k */
    private final void m7631k() {
        eqz eqzVarM7711a;
        dhv dhvVar = this.f15017f;
        dhvVar.getClass();
        if (dhvVar.mo6184l(dik.f11608f)) {
            jwn jwnVar = this.f15032v;
            jwnVar.getClass();
            eqzVarM7711a = (eqz) jwnVar.mo3831be();
        } else {
            dhv dhvVar2 = this.f15017f;
            dhvVar2.getClass();
            eqzVarM7711a = eqz.m7711a(((Integer) dhvVar2.mo6173a(dik.f11606d).orElse(1)).intValue());
        }
        this.f15028q = eqzVarM7711a;
    }

    @Override // p000.eqv
    /* JADX INFO: renamed from: a */
    public final kba mo7632a() {
        eds edsVar;
        m7631k();
        synchronized (this.f15013b) {
            jut jutVar = this.f15035y;
            kba kbaVarM13527a = jutVar == null ? null : jutVar.m13527a();
            if (kbaVarM13527a == null) {
                this.f15024m.m7681f(new elu(this, 9));
                jut jutVar2 = new jut(this.f15031u);
                this.f15035y = jutVar2;
                kbaVarM13527a = jutVar2.m13527a();
            }
            kbaVarM13527a.getClass();
            edsVar = new eds(kbaVarM13527a, 8);
        }
        return edsVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [gaw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [gyh, java.lang.Object] */
    @Override // p000.eqv
    /* JADX INFO: renamed from: b */
    public final nps mo7633b(eem eemVar, eqz eqzVar, ntx ntxVar, Runnable runnable, eqy eqyVar) {
        int i;
        eqzVar.name();
        synchronized (this.f15013b) {
            jut jutVar = this.f15035y;
            if (jutVar != null) {
                synchronized (jutVar.f34859d) {
                    i = jutVar.f34857b;
                }
                if (i > 0) {
                    nqf nqfVarM17621g = nqf.m17621g();
                    eemVar.f13675v.f25500a.mo9016a(f15216t, 0.0f);
                    ?? r9 = eemVar.f13675v.f25502c;
                    int i2 = r9.mo9902h().f26874a;
                    eemVar.m7218a();
                    int iM7679d = this.f15024m.m7679d(i2, "processZsl", new epq(this, i2, eemVar, eqzVar, nqfVarM17621g, runnable, eqyVar, r9, ntxVar), runnable);
                    if (iM7679d != 1) {
                        ((nbe) ((nbe) f15012a.m17252c()).mo17276G(1727)).mo17290o("Couldn't post processZSL");
                        runnable.run();
                        Throwable illegalStateException = new IllegalStateException("Error enqueuing shot processing for " + i2);
                        if (iM7679d == 3) {
                            illegalStateException = new dop(illegalStateException);
                        }
                        nqfVarM17621g.mo8566a(illegalStateException);
                    }
                    return nqfVarM17621g;
                }
            }
            runnable.run();
            return kxk.m14964J(new kec("CAM_MotionBlurController not initialized, but processShot was called."));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gyh, java.lang.Object] */
    @Override // p000.eqv
    /* JADX INFO: renamed from: c */
    public final void mo7634c(eem eemVar, Runnable runnable) {
        int i = eemVar.f13675v.f25502c.mo9902h().f26874a;
        nbh nbhVar = f15012a;
        ((nbe) ((nbe) nbhVar.m17252c()).mo17276G(1728)).mo17291p("Aborting shot %s", i);
        this.f15033w.execute(new elu(this, 10));
        eqf eqfVar = (eqf) this.f15025n.get(Integer.valueOf(i));
        if (eqfVar != null) {
            eqfVar.m7682c();
            eqfVar.mo7613d(true);
            cwd cwdVar = eqfVar.f15126n;
            nxl nxlVar = (nxl) cwdVar.f9866a;
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            nkr nkrVar = (nkr) nxlVar.f44974b;
            nkr nkrVar2 = nkr.f43268x;
            nkrVar.f43270a |= 2;
            nkrVar.f43272c = false;
            nxl nxlVar2 = (nxl) cwdVar.f9866a;
            if (!nxlVar2.f44974b.m18142ac()) {
                nxlVar2.mo18106p();
            }
            nkr nkrVar3 = (nkr) nxlVar2.f44974b;
            nkrVar3.f43270a |= 16384;
            nkrVar3.f43284o = true;
            ((hjz) eqfVar.f15120h.mo9905k()).f28095u = eqfVar.f15126n.m5646C();
        } else {
            ((nbe) ((nbe) nbhVar.m17252c()).mo17276G((char) 1729)).mo17293r("Couldn't find a session for shot %s", eemVar);
        }
        this.f15024m.m7676a(i, true, runnable);
    }

    @Override // p000.eqv
    /* JADX INFO: renamed from: d */
    public final void mo7635d(kpw kpwVar, FrameMetadata frameMetadata) {
        if (kpwVar == null) {
            ((nbe) ((nbe) f15012a.m17252c()).mo17276G((char) 1740)).mo17290o("Viewfinder image not found.");
        } else if (!((Boolean) this.f15016e.f34942d).booleanValue() || this.f15028q.equals(eqz.ACTION)) {
            kpwVar.close();
        } else {
            this.f15034x.execute(new epm(this, kpwVar, frameMetadata, 1));
        }
    }

    @Override // p000.eqv
    /* JADX INFO: renamed from: e */
    public final synchronized void mo7636e(equ equVar) {
        if (this.f15027p == equVar) {
            this.f15027p = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7637f(int i) {
        ((nbe) ((nbe) f15012a.m17252c()).mo17276G(1742)).mo17291p("Shot didn't start, removing %s.", i);
        this.f15016e.mo3415bf(true);
        this.f15025n.remove(Integer.valueOf(i));
    }

    @Override // p000.eqv
    /* JADX INFO: renamed from: g */
    public final void mo7638g(int i, long j) {
        eqf eqfVar = (eqf) this.f15025n.get(Integer.valueOf(i));
        if (eqfVar != null) {
            eqfVar.f15119g.mo14894e(Long.valueOf(j));
        } else {
            ((nbe) ((nbe) f15012a.m17252c()).mo17276G(1743)).mo17291p("Can't set the base frame timestamp, shot %s already aborted", i);
        }
    }

    @Override // p000.eqv
    /* JADX INFO: renamed from: h */
    public final synchronized void mo7639h(equ equVar) {
        this.f15027p = equVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, oju] */
    @Override // p000.eqv
    /* JADX INFO: renamed from: j */
    public final kba mo7640j(glk glkVar, final nqf nqfVar) {
        equ equVar;
        m7631k();
        int i = glkVar.f25502c.mo9902h().f26874a;
        synchronized (this) {
            equ equVar2 = this.f15027p;
            if (equVar2 != null) {
                equVar2.mo7614a(i).mo2282d(new Runnable() { // from class: epn
                    @Override // java.lang.Runnable
                    public final void run() {
                        nqfVar.mo14894e(true);
                    }
                }, this.f15034x);
                equVar = this.f15027p;
            } else {
                equVar = null;
            }
        }
        synchronized (this.f15013b) {
            jut jutVar = this.f15035y;
            kba kbaVarM13527a = jutVar == null ? null : jutVar.m13527a();
            if (kbaVarM13527a == null) {
                nqfVar.mo14894e(false);
                return null;
            }
            Map map = this.f15025n;
            Integer numValueOf = Integer.valueOf(i);
            glk glkVar2 = this.f15036z;
            epy epyVar = this.f15014c;
            nqf nqfVarM17621g = nqf.m17621g();
            nsk nskVar = (nsk) glkVar2.f25503d.get();
            nskVar.getClass();
            eqc eqcVar = (eqc) glkVar2.f25501b.get();
            eqcVar.getClass();
            Executor executor = (Executor) glkVar2.f25500a.get();
            executor.getClass();
            kbz kbzVar = (kbz) glkVar2.f25502c.get();
            kbzVar.getClass();
            epyVar.getClass();
            final kba kbaVar = kbaVarM13527a;
            map.put(numValueOf, new eqf(nskVar, eqcVar, executor, kbzVar, glkVar, epyVar, equVar, nqfVarM17621g, nqfVar, null, null));
            this.f15034x.execute(new bbt(this, i, 15));
            return new kba() { // from class: epo
                @Override // p000.kba, java.lang.AutoCloseable
                public final void close() {
                    kba kbaVar2 = kbaVar;
                    nqf nqfVar2 = nqfVar;
                    nbh nbhVar = epr.f15012a;
                    kbaVar2.close();
                    nqfVar2.mo14894e(true);
                }
            };
        }
    }
}
