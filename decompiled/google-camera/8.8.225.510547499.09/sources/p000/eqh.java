package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.lasagna.LasagnaInputParamsImpl;
import com.pairip.VMRunner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eqh implements eqy, ecz, eqw, ecy, edi, edd {

    /* JADX INFO: renamed from: a */
    public static final nbh f15135a = nbh.m17259h("com/google/android/apps/camera/lasagna/MotionBlurProcessorImpl");

    /* JADX INFO: renamed from: b */
    public final efa f15136b;

    /* JADX INFO: renamed from: c */
    public final kbz f15137c;

    /* JADX INFO: renamed from: e */
    public final mrm f15139e;

    /* JADX INFO: renamed from: f */
    public final gvw f15140f;

    /* JADX INFO: renamed from: g */
    public final fvu f15141g;

    /* JADX INFO: renamed from: h */
    public final cwd f15142h;

    /* JADX INFO: renamed from: i */
    private final ohb f15143i;

    /* JADX INFO: renamed from: j */
    private final eqv f15144j;

    /* JADX INFO: renamed from: k */
    private final Gcam f15145k;

    /* JADX INFO: renamed from: l */
    private final Executor f15146l;

    /* JADX INFO: renamed from: m */
    private final jwn f15147m;

    /* JADX INFO: renamed from: n */
    private final inm f15148n;

    /* JADX INFO: renamed from: o */
    private final dhv f15149o;

    /* JADX INFO: renamed from: p */
    private final jwn f15150p;

    /* JADX INFO: renamed from: r */
    private final gva f15152r;

    /* JADX INFO: renamed from: s */
    private final gkz f15153s;

    /* JADX INFO: renamed from: t */
    private final bko f15154t;

    /* JADX INFO: renamed from: u */
    private final cwd f15155u;

    /* JADX INFO: renamed from: d */
    public final Map f15138d = new HashMap();

    /* JADX INFO: renamed from: q */
    private kba f15151q = null;

    public eqh(ohb ohbVar, gkz gkzVar, bko bkoVar, mrm mrmVar, Gcam gcam, efa efaVar, kbz kbzVar, Executor executor, cwd cwdVar, fvu fvuVar, jwn jwnVar, mrm mrmVar2, inm inmVar, dhv dhvVar, gvw gvwVar, jwn jwnVar2, gva gvaVar, cwd cwdVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f15143i = ohbVar;
        this.f15153s = gkzVar;
        this.f15154t = bkoVar;
        this.f15145k = gcam;
        this.f15136b = efaVar;
        this.f15137c = kbzVar;
        this.f15146l = executor;
        lku.m15669w(mrmVar.mo16813g());
        this.f15144j = (eqv) mrmVar.mo16809c();
        this.f15142h = cwdVar;
        this.f15141g = fvuVar;
        this.f15147m = jwnVar;
        this.f15139e = mrmVar2;
        this.f15148n = inmVar;
        this.f15149o = dhvVar;
        this.f15140f = gvwVar;
        this.f15150p = jwnVar2;
        this.f15152r = gvaVar;
        this.f15155u = cwdVar2;
    }

    /* JADX INFO: renamed from: m */
    public static final void m7684m(ept eptVar, String str, Throwable th) {
        ((nbe) ((nbe) ((nbe) f15135a.m17251b()).mo17283h(th)).mo17276G(1828)).mo17299x("%s %d", str, eptVar.f15046h);
        eptVar.m7645d();
        eptVar.m7646e();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gyh, java.lang.Object] */
    @Override // p000.ecy
    /* JADX INFO: renamed from: a */
    public final void mo7052a(eem eemVar, int i, long j, kpp kppVar) {
        eemVar.m7218a();
        ept eptVar = (ept) this.f15138d.get(eemVar);
        if (eptVar == null) {
            throw new IllegalStateException("Shot hasn't been started yet!");
        }
        eptVar.m9555h(i);
        this.f15144j.mo7638g(eemVar.f13675v.f25502c.mo9902h().f26874a, j);
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo7057b(eem eemVar, hkc hkcVar, ebp ebpVar) {
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [gyh, java.lang.Object] */
    @Override // p000.edi
    /* JADX INFO: renamed from: c */
    public final void mo7058c(eem eemVar, edc edcVar) {
        ((nbe) ((nbe) f15135a.m17252c()).mo17276G(1838)).mo17291p("onShotError %d", eemVar.m7218a());
        mo7111d(eemVar.f13675v.f25502c.mo9902h());
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [gyh, java.lang.Object] */
    @Override // p000.ech
    /* JADX INFO: renamed from: d */
    public final void mo7111d(gyu gyuVar) {
        ((nbe) ((nbe) f15135a.m17252c()).mo17276G((char) 1805)).mo17293r("Abort shot %s", gyuVar);
        this.f15137c.mo13961e("MotionBlur#abortShot");
        kba kbaVar = this.f15151q;
        eem eemVar = null;
        if (kbaVar != null) {
            kbaVar.close();
            this.f15151q = null;
        }
        for (eem eemVar2 : this.f15138d.keySet()) {
            if (eemVar2.f13675v.f25502c.mo9902h().equals(gyuVar)) {
                eemVar = eemVar2;
                break;
            }
        }
        if (eemVar == null) {
            ((nbe) ((nbe) f15135a.m17252c()).mo17276G((char) 1807)).mo17290o("Shot not found.");
            this.f15137c.mo13962f();
            return;
        }
        eemVar.m7218a();
        ept eptVar = (ept) this.f15138d.remove(eemVar);
        this.f15144j.mo7634c(eemVar, new elu(eptVar, 16));
        if (eptVar != null) {
            eptVar.mo7643b();
        }
        this.f15137c.mo13962f();
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: e */
    public final void mo7112e(eem eemVar, key keyVar) {
        eemVar.m7218a();
        this.f15137c.mo13961e("MotionBlur#addPayloadFrame");
        ept eptVar = (ept) this.f15138d.get(eemVar);
        if (eptVar != null) {
            eptVar.mo7644c(keyVar);
        } else {
            ((nbe) ((nbe) f15135a.m17251b()).mo17276G(1809)).mo17291p("addPayloadFrame: Shot not found! %d", eemVar.m7218a());
            keyVar.close();
        }
        this.f15137c.mo13962f();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, oju] */
    @Override // p000.ech
    /* JADX INFO: renamed from: f */
    public final void mo7113f(eem eemVar, BurstSpec burstSpec, kpp kppVar) {
        eemVar.m7218a();
        lku.m15613H(!this.f15138d.containsKey(eemVar));
        int iM3564b = cem.m3564b(((fua) eemVar.f13675v.f25503d).f23573a, this.f15148n, this.f15141g, this.f15150p, this.f15149o);
        cwd cwdVar = this.f15155u;
        glk glkVar = eemVar.f13675v;
        ebn ebnVarM9396a = this.f15153s.m9396a();
        kba kbaVar = this.f15151q;
        kbaVar.getClass();
        eqz eqzVar = (eqz) this.f15147m.mo3831be();
        Object obj = cwdVar.f9866a.get();
        eqzVar.getClass();
        this.f15138d.put(eemVar, new ept((drj) obj, glkVar, ebnVarM9396a, burstSpec, kppVar, eemVar, kbaVar, eqzVar, iM3564b, null, null, null, null));
        this.f15151q = null;
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: g */
    public final void mo7114g(gyu gyuVar) {
        een eenVarM2622p = this.f15154t.m2622p(gyuVar);
        if (eenVarM2622p.f13706z == null) {
            eenVarM2622p.f13706z = mxk.m17132D();
        }
        eenVarM2622p.f13706z.mo17072d(this);
        eenVarM2622p.m7226f(this);
        eenVarM2622p.m7221a(this);
        eenVarM2622p.m7223c(this);
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: h */
    public final void mo7115h(eem eemVar) {
        eemVar.m7218a();
        if (!this.f15138d.containsKey(eemVar)) {
            throw new IllegalStateException("Shot hasn't been started yet or was aborted");
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo7116i(eem eemVar) {
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0138  */
    @Override // p000.edd
    /* JADX INFO: renamed from: j */
    public final void mo7173j(eem eemVar, long j, ShotMetadata shotMetadata) throws Throwable {
        Executor executor;
        ekr ekrVar;
        epm epmVar;
        eemVar.m7218a();
        Runnable runnable = cik.f5806n;
        int i = 14;
        nps npsVarMo7633b = null;
        try {
            this.f15137c.mo13961e("MotionBlur#onRawImageAvailable");
            ept eptVar = (ept) this.f15138d.get(eemVar);
            if (eptVar == null) {
                ((nbe) ((nbe) f15135a.m17252c()).mo17276G(1835)).mo17290o("Shot hasn't been started yet or was cancelled, return without processing.");
                this.f15137c.mo13962f();
                eemVar.m7218a();
                executor = this.f15146l;
                ekrVar = new ekr(this, eemVar, i);
                executor.execute(ekrVar);
            }
            ArrayList arrayListM7642a = eptVar.m7642a();
            if (arrayListM7642a.isEmpty()) {
                throw new IllegalStateException("shot params not available yet");
            }
            epm epmVar2 = new epm(eemVar, arrayListM7642a, eptVar, 3);
            try {
                StaticMetadata staticMetadataM4972b = this.f15145k.m4972b(((ecq) this.f15143i.get()).mo7134a(this.f15152r.m9784a((key) eptVar.m9553f().get(0)).m9492a().mo14193c()));
                eptVar.f15048j = new LasagnaInputParamsImpl(StaticMetadata.m5118a(staticMetadataM4972b), eptVar.f15040b.m7219b().f8358a, ShotMetadata.m5095a(shotMetadata), j, arrayListM7642a, ((Integer) eptVar.f25737l.get(500L, TimeUnit.MILLISECONDS)).intValue());
                ntx ntxVar = eptVar.f15048j;
                kcc kccVarMo13957a = this.f15137c.mo13957a("MotionBlur#processingAsync");
                epmVar = epmVar2;
                try {
                    npsVarMo7633b = this.f15144j.mo7633b(eemVar, eptVar.f15042d, ntxVar, epmVar2, this);
                    eemVar.m7218a();
                    kxk.m14975U(npsVarMo7633b, new gxb(this, kccVarMo13957a, eptVar, 1), this.f15146l);
                    this.f15137c.mo13962f();
                } catch (Exception e) {
                    e = e;
                    runnable = epmVar;
                    try {
                        if (e instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        ((nbe) ((nbe) ((nbe) f15135a.m17251b()).mo17283h(e)).mo17276G(1832)).mo17291p("Error processing shot id %d.", eemVar.m7218a());
                        this.f15137c.mo13962f();
                        if (npsVarMo7633b == null) {
                            eemVar.m7218a();
                            runnable.run();
                            executor = this.f15146l;
                            ekrVar = new ekr(this, eemVar, i);
                            executor.execute(ekrVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.f15137c.mo13962f();
                        if (npsVarMo7633b == null) {
                            eemVar.m7218a();
                            runnable.run();
                            this.f15146l.execute(new ekr(this, eemVar, i));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    runnable = epmVar;
                    this.f15137c.mo13962f();
                    if (npsVarMo7633b == null) {
                        eemVar.m7218a();
                        runnable.run();
                        this.f15146l.execute(new ekr(this, eemVar, i));
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                epmVar = epmVar2;
            } catch (Throwable th3) {
                th = th3;
                epmVar = epmVar2;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7685k(eem eemVar, mrm mrmVar) {
        VMRunner.invoke("SlP5Mw7Yr7xnvcdG", new Object[]{this, eemVar, mrmVar});
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: l */
    public final void m7686l(ept eptVar, Bitmap bitmap, boolean z) {
        if (z) {
            eptVar.f15047i = bitmap;
            return;
        }
        eem eemVar = eptVar.f15040b;
        this.f15137c.mo13961e("rotate");
        if (bitmap != null) {
            bitmap = this.f15140f.mo9805a(bitmap, eptVar.f15043e, this.f15141g.mo14558k());
        }
        this.f15137c.mo13963g("updateIndicator");
        eemVar.f13675v.f25502c.mo9892X(bitmap, 0);
        this.f15137c.mo13962f();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gyh, java.lang.Object] */
    @Override // p000.eqw
    /* JADX INFO: renamed from: n */
    public final Future mo7687n(glk glkVar) {
        nqf nqfVarM17621g = nqf.m17621g();
        int i = glkVar.f25502c.mo9902h().f26874a;
        kba kbaVarMo7640j = this.f15144j.mo7640j(glkVar, nqfVarM17621g);
        this.f15151q = kbaVarMo7640j;
        lku.m15614I(kbaVarMo7640j != null, "Motion Blur processor not available.");
        nqfVarM17621g.mo2282d(new ekr(this, glkVar, 15, null, null), this.f15146l);
        return nqfVarM17621g;
    }

    @Override // p000.ecz
    /* JADX INFO: renamed from: o */
    public final void mo7053o(eem eemVar, Bitmap bitmap, ShotMetadata shotMetadata) {
        kbz kbzVar;
        this.f15137c.mo13961e("onBitmapAvailable");
        try {
            ept eptVar = (ept) this.f15138d.get(eemVar);
            if (eptVar == null) {
                ((nbe) ((nbe) f15135a.m17252c()).mo17276G(1824)).mo17291p(wUzNh.XLspTaInJVjXS, eemVar.m7218a());
                bitmap.recycle();
                kbzVar = this.f15137c;
            } else {
                eemVar.m7218a();
                this.f15137c.mo13961e("crop");
                int width = (int) (bitmap.getWidth() * 0.98f);
                int height = (int) (bitmap.getHeight() * 0.98f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - width) / 2, (bitmap.getHeight() - height) / 2, width, height);
                this.f15137c.mo13963g("update");
                m7686l(eptVar, bitmapCreateBitmap, eptVar.f15042d == eqz.LANDSCAPE);
                this.f15137c.mo13962f();
                kbzVar = this.f15137c;
            }
            kbzVar.mo13962f();
        } catch (Throwable th) {
            this.f15137c.mo13962f();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [gyh, java.lang.Object] */
    @Override // p000.edi
    /* JADX INFO: renamed from: p */
    public final void mo7059p(eem eemVar) {
        ((nbe) ((nbe) f15135a.m17252c()).mo17276G(1837)).mo17291p("onShotAborted %d", eemVar.m7218a());
        mo7111d(eemVar.f13675v.f25502c.mo9902h());
    }
}
