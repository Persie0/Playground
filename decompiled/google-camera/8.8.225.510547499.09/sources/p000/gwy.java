package p000;

import android.graphics.Bitmap;
import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gwy implements gyh {

    /* JADX INFO: renamed from: a */
    public static final nbh f26657a = nbh.m17259h("com/google/android/apps/camera/session/CaptureSessionBase");

    /* JADX INFO: renamed from: A */
    private gqt f26658A;

    /* JADX INFO: renamed from: B */
    private final List f26659B;

    /* JADX INFO: renamed from: C */
    private boolean f26660C;

    /* JADX INFO: renamed from: D */
    private kpp f26661D;

    /* JADX INFO: renamed from: E */
    private boolean f26662E;

    /* JADX INFO: renamed from: F */
    private final gqq f26663F;

    /* JADX INFO: renamed from: G */
    private final ihk f26664G;

    /* JADX INFO: renamed from: H */
    private final kon f26665H;

    /* JADX INFO: renamed from: b */
    public final dlw f26666b;

    /* JADX INFO: renamed from: c */
    public final gyw f26667c;

    /* JADX INFO: renamed from: e */
    public final Executor f26669e;

    /* JADX INFO: renamed from: f */
    public final gyv f26670f;

    /* JADX INFO: renamed from: g */
    public final gxh f26671g;

    /* JADX INFO: renamed from: h */
    public final cjr f26672h;

    /* JADX INFO: renamed from: i */
    public final hjy f26673i;

    /* JADX INFO: renamed from: j */
    public final nqf f26674j;

    /* JADX INFO: renamed from: k */
    public final nqf f26675k;

    /* JADX INFO: renamed from: l */
    public boolean f26676l;

    /* JADX INFO: renamed from: m */
    public final gqj f26677m;

    /* JADX INFO: renamed from: n */
    public final mrm f26678n;

    /* JADX INFO: renamed from: o */
    public final gyn f26679o;

    /* JADX INFO: renamed from: p */
    public gyj f26680p;

    /* JADX INFO: renamed from: q */
    public final nqf f26681q;

    /* JADX INFO: renamed from: r */
    public volatile mrm f26682r;

    /* JADX INFO: renamed from: s */
    public int f26683s;

    /* JADX INFO: renamed from: t */
    public int f26684t;

    /* JADX INFO: renamed from: u */
    public final jfs f26685u;

    /* JADX INFO: renamed from: v */
    public final jfs f26686v;

    /* JADX INFO: renamed from: w */
    public jfs f26687w;

    /* JADX INFO: renamed from: x */
    public final bkn f26688x;

    /* JADX INFO: renamed from: z */
    private final gye f26690z;

    /* JADX INFO: renamed from: y */
    private ihb f26689y = ihd.f30944a;

    /* JADX INFO: renamed from: d */
    public kbb f26668d = kbb.f35514c;

    public gwy(Executor executor, jfs jfsVar, gxh gxhVar, hjy hjyVar, dlw dlwVar, gye gyeVar, jfs jfsVar2, kon konVar, ihk ihkVar, gyw gywVar, String str, cjr cjrVar, gyn gynVar, gqq gqqVar, mrm mrmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        nqf nqfVarM17621g = nqf.m17621g();
        this.f26674j = nqfVarM17621g;
        this.f26675k = nqf.m17621g();
        this.f26659B = new ArrayList();
        this.f26660C = false;
        this.f26676l = false;
        this.f26683s = 1;
        this.f26684t = 1;
        this.f26662E = false;
        this.f26681q = nqf.m17621g();
        this.f26669e = executor;
        this.f26690z = gyeVar;
        this.f26679o = gynVar;
        this.f26671g = gxhVar;
        this.f26686v = jfsVar;
        this.f26672h = cjrVar;
        this.f26685u = jfsVar2;
        this.f26665H = konVar;
        this.f26673i = hjyVar;
        this.f26666b = dlwVar;
        this.f26663F = gqqVar;
        this.f26678n = mrmVar;
        this.f26667c = gywVar;
        this.f26688x = new bkn((int[]) null);
        this.f26664G = ihkVar;
        gyv gyvVarM10003a = gyv.m10003a(gyu.m10002a(), gynVar.f26852a, str, gywVar);
        this.f26670f = gyvVarM10003a;
        this.f26677m = new grj(this);
        gyeVar.m9972g(gyvVarM10003a.f26875a, nqfVarM17621g, gynVar.f26853b);
        this.f26682r = mqu.f41450a;
    }

    /* JADX INFO: renamed from: ad */
    private final void m9868ad(Bitmap bitmap, int i) {
        m9891W(DNTdN.BFgOovlblSRgE);
        gyn gynVar = this.f26679o;
        Executor executor = this.f26669e;
        int i2 = 0;
        lku.m15614I(gynVar.f26853b == gyx.MARS_STORE, "Thumbnail can be written to store only when using private store API");
        kxk.m14975U(nod.m17553i(gynVar.m9982b().mo14683c(), new gyl(gynVar, bitmap, i, i2), executor), new djq(this, 11), not.INSTANCE);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void mo9869A() {
        jeu.m12988l();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: B */
    public final void mo9870B(ihb ihbVar, Throwable th) {
        m9874F(TVkaNXnfP.GLOpDYJy.concat(String.valueOf(th.getMessage())));
        if (this.f26688x.m2554C()) {
            m9874F("Ignoring finishWithFailure. CaptureSession already saved/canceled or failed.");
            return;
        }
        this.f26688x.m2558G(4);
        this.f26689y = ihbVar;
        m9914t();
        m9879K(ihbVar);
        jfs jfsVar = this.f26686v;
        jfs jfsVar2 = this.f26687w;
        jfsVar2.getClass();
        jfsVar.m13094ad(jfsVar2);
        this.f26671g.mo6406h(this.f26683s, this.f26684t, th);
        this.f26666b.mo6358f(this.f26670f.f26876b, true);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: C */
    public final void mo9871C(boolean z) {
        this.f26666b.mo6355c(this.f26670f.f26876b, "onFramesRequested");
        if (z) {
            mrm mrmVar = this.f26678n;
            if (mrmVar.mo16813g()) {
                hkz hkzVar = (hkz) mrmVar.mo16809c();
                hkzVar.m10437h(hky.FRAMES_TAKEN);
                kcc kccVar = hkzVar.f28229a;
                if (kccVar != null) {
                    kccVar.mo13952a();
                    hkzVar.f28229a = null;
                }
            }
        }
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: D */
    public final void mo9872D() {
        this.f26666b.mo6355c(this.f26670f.f26876b, "onFramesSubmitted");
        this.f26664G.m11346n(this.f26673i);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: E */
    public final void mo9873E() {
        throw null;
    }

    /* JADX INFO: renamed from: F */
    final void m9874F(String str) {
        ((nbe) ((nbe) f26657a.m17252c()).mo17276G(3322)).mo17301z("[%s] %s", mo9902h(), str);
    }

    /* JADX INFO: renamed from: G */
    final synchronized void m9875G() {
        gye gyeVar = this.f26690z;
        gyu gyuVarMo9902h = mo9902h();
        gyeVar.m9970e(gyuVarMo9902h, new gqn(gyeVar, gyuVarMo9902h, 9), "#onSessionCaptureIndicatorUpdate ".concat(String.valueOf(String.valueOf(gyuVarMo9902h))));
    }

    /* JADX INFO: renamed from: H */
    final synchronized void m9876H(gyu gyuVar) {
        m9891W("notifySessionUpdated");
        gye gyeVar = this.f26690z;
        gyeVar.m9970e(gyuVar, new gqn(gyeVar, gyuVar, 12), "#onSessionUpdated ".concat(String.valueOf(String.valueOf(gyuVar))));
    }

    /* JADX INFO: renamed from: I */
    final synchronized void m9877I() {
        this.f26674j.cancel(false);
        gye gyeVar = this.f26690z;
        gyu gyuVarMo9902h = mo9902h();
        nps npsVar = (nps) gyeVar.f26824d.get(gyuVarMo9902h);
        if (npsVar == null) {
            ((nbe) ((nbe) gye.f26821a.m17251b()).mo17276G((char) 3376)).mo17293r("%s: No queued future found, maybe shot already finalized?: notifyTaskCanceled", gyuVarMo9902h);
        } else {
            npsVar.mo2282d(new gqn(gyeVar, gyuVarMo9902h, 14), not.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: J */
    final synchronized void m9878J() {
        this.f26690z.m9971f(mo9902h());
    }

    /* JADX INFO: renamed from: K */
    final synchronized void m9879K(ihb ihbVar) {
        gye gyeVar = this.f26690z;
        gyu gyuVarMo9902h = mo9902h();
        nps npsVar = (nps) gyeVar.f26824d.get(gyuVarMo9902h);
        if (npsVar == null) {
            ((nbe) ((nbe) gye.f26821a.m17251b()).mo17276G((char) 3382)).mo17293r("%s: No queued future found, maybe shot already finalized?: notifyTaskFailed", gyuVarMo9902h);
        } else {
            npsVar.mo2282d(new gqn(gyeVar, gyuVarMo9902h, 13), not.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: L */
    final synchronized void m9880L(kbb kbbVar) {
        mo9890V(Integer.valueOf(kbbVar.f35516e));
        gye gyeVar = this.f26690z;
        gyu gyuVarMo9902h = mo9902h();
        gyeVar.m9970e(gyuVarMo9902h, new gxn(gyeVar, gyuVarMo9902h, kbbVar, 3), "#onSessionProgress ".concat(String.valueOf(String.valueOf(gyuVarMo9902h))));
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: M */
    public final void mo9881M() {
        throw null;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: N */
    public final synchronized void mo9882N(kpp kppVar, boolean z) {
        boolean z2 = true;
        try {
            if (z) {
                kppVar.mo9515b();
                kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
                this.f26661D = kppVar;
                mo9883O(true);
                return;
            }
            if (this.f26662E) {
                ((nbe) ((nbe) f26657a.m17252c()).mo17276G(3325)).mo17292q(PMZiHihxLGEy.QxNWv, kppVar.mo9515b());
                return;
            }
            boolean z3 = (ivt.f32354h == null || kppVar.mo9517d(ivt.f32354h) == null) ? false : true;
            CaptureResult.Key key = ivt.f32355i;
            boolean z4 = (key == null || kppVar.mo9517d(key) == null) ? false : true;
            CaptureResult.Key key2 = ivt.f32356j;
            if (key2 == null || kppVar.mo9517d(key2) == null) {
                z2 = false;
            }
            if (!z3 && !z4 && !z2) {
                ((nbe) ((nbe) f26657a.m17252c()).mo17276G(3324)).mo17298w("3A_DEBUG AF debug data not set! Metadata from frame %d (timestamp=%d) does not contain debug data.", kppVar.mo9515b(), kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP));
                return;
            }
            kpp kppVar2 = this.f26661D;
            if (kppVar2 == null || kppVar.mo9515b() > kppVar2.mo9515b()) {
                kppVar.mo9515b();
                kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
                this.f26661D = kppVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: O */
    public final synchronized void mo9883O(boolean z) {
        this.f26662E = z;
    }

    /* JADX INFO: renamed from: P */
    public final synchronized void m9884P(kbb kbbVar, boolean z) {
        boolean z2 = true;
        if (!z) {
            try {
                if (kbbVar == kbb.f35512a) {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lku.m15670x(z2, "Cannot set progress to 100% before persisting images.");
        this.f26668d = kbbVar;
        if (this.f26679o.f26853b == gyx.MARS_STORE) {
            kbb kbbVar2 = (this.f26676l || kbbVar.compareTo(kbb.f35515d) < 0) ? kbbVar : kbb.f35515d;
            gyn gynVar = this.f26679o;
            Executor executor = this.f26669e;
            if (gynVar.f26853b == gyx.MARS_STORE) {
                if (kbbVar2.m13900d()) {
                    kxk.m14975U(gynVar.m9982b().mo14683c(), new eog(gynVar, kbbVar2, 9), executor);
                } else {
                    gynVar.f26856e.mo13940b("Skipping progress update for not yet started GcaMediaGroup ".concat(gynVar.toString()));
                }
            }
        }
        m9880L(kbbVar);
        gqt gqtVar = this.f26658A;
        if (gqtVar != null) {
            gqtVar.mo4250a(kbbVar);
        }
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: Q */
    public final synchronized void mo9885Q(ihb ihbVar) {
        if (!this.f26688x.m2556E() && !this.f26688x.m2555D()) {
            m9874F("Ignoring setProgressMessage - state is !started && !finishing: ".concat(kfv.m14167D()));
            return;
        }
        m9891W("setProgressMessage");
        this.f26689y = ihbVar;
        if (!jvh.m13550H(ihbVar) && this.f26668d == kbb.f35514c) {
            this.f26668d = kbb.f35513b;
        }
        gqt gqtVar = this.f26658A;
        if (gqtVar != null) {
            gqtVar.mo4251b(ihbVar);
        }
    }

    /* JADX INFO: renamed from: R */
    public final synchronized void m9886R() {
        if (this.f26680p != null) {
            return;
        }
        if (this.f26667c.equals(gyw.LONG_SHOT) || this.f26667c.equals(gyw.AUTO_LONG_SHOT)) {
            this.f26680p = this.f26679o.m9981a("mp4");
        } else {
            this.f26680p = this.f26679o.m9981a("jpg");
        }
        this.f26679o.m9985e(new gww(this));
        this.f26674j.mo16665f(kxk.m14969O(new bdv(this, 9), this.f26669e));
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: S */
    public final void mo9887S(kbc kbcVar) {
        throw null;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: T */
    public final void mo9888T(final long j) {
        this.f26690z.m9969d(new Consumer() { // from class: gyd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((gyi) obj).mo3960m(j);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void mo9889U() {
        jeu.m12987k(this);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: V */
    public final void mo9890V(Integer num) {
        this.f26666b.mo6360h(this.f26670f.f26876b, num);
    }

    /* JADX INFO: renamed from: W */
    public final void m9891W(String str) {
        this.f26666b.mo6355c(this.f26670f.f26876b, str);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gxk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // p000.gyh
    /* JADX INFO: renamed from: X */
    public final void mo9892X(Bitmap bitmap, int i) {
        if (this.f26688x.m2554C()) {
            ((nbe) ((nbe) f26657a.m17252c()).mo17276G((char) 3328)).mo17290o("Skip updateCaptureIndicatorThumbnail, session was canceled.");
            return;
        }
        m9891W("updateCaptureIndicatorThumbnail");
        jfs jfsVar = this.f26686v;
        jfs jfsVar2 = this.f26687w;
        jfsVar2.getClass();
        jfsVar.m13095ae(jfsVar2, bitmap, i);
        if (this.f26679o.f26853b == gyx.MARS_STORE) {
            m9868ad(bitmap, i);
        }
        if (this.f26660C) {
            return;
        }
        this.f26660C = true;
        this.f26671g.mo6404f(this.f26678n);
        kon konVar = this.f26665H;
        ?? r1 = konVar.f36702b;
        kxk.m14975U(r1 != 0 ? kxk.m14968N(new RunnableC0904pi((gxk) r1, bitmap, i, 13), konVar.f36701a) : kxk.m14964J(new IllegalStateException("Update delegate is not set!")), new cmo(this, 14), not.INSTANCE);
        m9875G();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: Y */
    public final void mo9893Y(Bitmap bitmap) {
        if (this.f26688x.m2554C()) {
            ((nbe) ((nbe) f26657a.m17252c()).mo17276G((char) 3329)).mo17290o("Skip updateIntermediateThumbnail, session was canceled.");
            return;
        }
        m9891W("updateIntermediateThumbnail");
        jfs jfsVar = this.f26686v;
        jfs jfsVar2 = this.f26687w;
        jfsVar2.getClass();
        jfsVar.m13095ae(jfsVar2, bitmap, 0);
        m9876H(mo9902h());
        if (this.f26679o.f26853b == gyx.MARS_STORE) {
            m9868ad(bitmap, 0);
        }
        this.f26671g.mo6402d(bitmap);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: Z */
    public final void mo9894Z(Bitmap bitmap, int i) {
        this.f26690z.m9969d(new cue(bitmap, i, 2));
    }

    @Override // p000.gqr
    /* JADX INFO: renamed from: a */
    public final kbb mo9651a() {
        return this.f26668d;
    }

    /* JADX INFO: renamed from: aa */
    public final void m9895aa() {
        ((nbe) ((nbe) f26657a.m17251b()).mo17276G(3320)).mo17301z("[%s] %s", mo9902h(), "Failed to write out thumbnail for MARS shot");
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: ab */
    public final void mo9896ab(int i) {
        if (this.f26683s == 1) {
            this.f26683s = i;
        }
        this.f26684t = i;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: ac */
    public final void mo9897ac(cwd cwdVar) {
        this.f26682r = mrm.m16829i(cwdVar);
    }

    @Override // p000.gqr
    /* JADX INFO: renamed from: b */
    public final synchronized void mo9652b(kbb kbbVar) {
        m9884P(kbbVar, false);
    }

    @Override // p000.gqr
    /* JADX INFO: renamed from: c */
    public final void mo9653c(gqt gqtVar) {
        ihb ihbVar = this.f26689y;
        if (!jvh.m13550H(ihbVar)) {
            gqtVar.mo4251b(ihbVar);
        }
        gqtVar.mo4250a(this.f26668d);
        this.f26658A = gqtVar;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: d */
    public final long mo9898d() {
        return this.f26679o.f26852a;
    }

    /* JADX INFO: renamed from: e */
    public final gqq m9899e() {
        gqq gqqVar = this.f26663F;
        gqqVar.getClass();
        return gqqVar;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: f */
    public final gyj mo9900f() {
        m9886R();
        gyj gyjVar = this.f26680p;
        gyjVar.getClass();
        return gyjVar;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: g */
    public final gyn mo9901g() {
        return this.f26679o;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: h */
    public final gyu mo9902h() {
        return this.f26670f.f26875a;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: i */
    public final gyw mo9903i() {
        return this.f26667c;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: j */
    public final gyx mo9904j() {
        return this.f26679o.f26853b;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: k */
    public final hjy mo9905k() {
        return this.f26673i;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: l */
    public final synchronized kpp mo9906l() {
        return this.f26661D;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: m */
    public final mrm mo9907m() {
        return this.f26682r;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: n */
    public final mrm mo9908n() {
        return this.f26678n;
    }

    /* JADX INFO: renamed from: o */
    final mrm m9909o(hln hlnVar, guk gukVar) {
        return hlnVar.f28268c.mo16808b(new fye(this, hlnVar, gukVar, 2));
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: p */
    public final nps mo9910p() {
        return this.f26681q;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: q */
    public final nps mo9911q() {
        return kxk.m14966L(this.f26674j);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ nps mo9912r(byte[] bArr, hln hlnVar) {
        return jeu.m12989m();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: s */
    public final String mo9913s() {
        return this.f26670f.f26877c;
    }

    /* JADX INFO: renamed from: t */
    public final synchronized void m9914t() {
        Iterator it = this.f26659B.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        m9886R();
        m9918x();
        this.f26679o.m9984d();
    }

    public final String toString() {
        return this.f26670f.toString();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: u */
    public final void mo9915u(gys gysVar) {
        gxh gxhVar = this.f26671g;
        synchronized (gxhVar.f26719a) {
            gxhVar.f26719a.add(gysVar);
        }
    }

    /* JADX INFO: renamed from: v */
    final synchronized void m9916v(Runnable runnable) {
        this.f26659B.add(runnable);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: w */
    public final void mo9917w(Throwable th) {
        if (this.f26660C && !(th instanceof doq)) {
            m9891W("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            mo9870B(ihd.f30944a, new dos("cancel invoked, but user already notified.", th));
            return;
        }
        if (this.f26688x.m2554C()) {
            m9874F("Ignoring cancel. CaptureSession already saved/canceled or failed. Cause:".concat(String.valueOf(String.valueOf(th))));
            return;
        }
        m9891W("cancel");
        this.f26688x.m2558G(4);
        m9914t();
        m9877I();
        jfs jfsVar = this.f26687w;
        if (jfsVar != null) {
            this.f26686v.m13094ad(jfsVar);
            this.f26687w = null;
        }
        if (!(th instanceof dok)) {
            th = new doq(th);
        }
        this.f26671g.mo6405g(this.f26683s, this.f26684t, th);
        this.f26666b.mo6357e(this.f26670f.f26876b);
    }

    /* JADX INFO: renamed from: x */
    public final void m9918x() {
        synchronized (this.f26674j) {
            if (!this.f26674j.cancel(false)) {
                m9874F("Could not cancel MediaStore insertion");
            }
        }
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: y */
    public final void mo9919y() {
        this.f26671g.mo6408j(this.f26683s, this.f26684t);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: z */
    public final void mo9920z() {
        m9891W("finalizeSession");
        this.f26686v.m13094ad(this.f26687w);
        this.f26671g.mo6399a();
        this.f26677m.mo9642h();
    }
}
