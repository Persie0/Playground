package p000;

import com.google.googlex.gcam.BurstSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eoi implements eol, edi {

    /* JADX INFO: renamed from: b */
    private static final nbh f14859b = nbh.m17259h("com/google/android/apps/camera/kepler/AstrolapseProcessorImpl");

    /* JADX INFO: renamed from: a */
    public final Map f14860a = new HashMap();

    /* JADX INFO: renamed from: c */
    private final eby f14861c;

    /* JADX INFO: renamed from: d */
    private final Executor f14862d;

    /* JADX INFO: renamed from: e */
    private final int f14863e;

    /* JADX INFO: renamed from: f */
    private final eoc f14864f;

    /* JADX INFO: renamed from: g */
    private final dhv f14865g;

    /* JADX INFO: renamed from: h */
    private int f14866h;

    /* JADX INFO: renamed from: i */
    private boolean f14867i;

    /* JADX INFO: renamed from: j */
    private final gkz f14868j;

    /* JADX INFO: renamed from: k */
    private final bko f14869k;

    /* JADX INFO: renamed from: l */
    private final C1058va f14870l;

    public eoi(gkz gkzVar, eby ebyVar, bko bkoVar, eoc eocVar, C1058va c1058va, dhv dhvVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f14868j = gkzVar;
        this.f14861c = ebyVar;
        this.f14864f = eocVar;
        this.f14870l = c1058va;
        this.f14869k = bkoVar;
        this.f14862d = executor;
        this.f14866h = ((Integer) dhvVar.mo6173a(did.f11462p).orElse(15)).intValue();
        this.f14863e = ((Integer) dhvVar.mo6173a(did.f11464r).orElse(150000)).intValue();
        this.f14865g = dhvVar;
    }

    /* JADX INFO: renamed from: l */
    private final void m7591l(eem eemVar, String str) {
        eoh eohVar = (eoh) this.f14860a.get(eemVar);
        if (eohVar != null && eohVar.f14857c.get()) {
            this.f14864f.m7583a(eemVar);
        }
        m7592j(eemVar, str);
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo7057b(eem eemVar, hkc hkcVar, ebp ebpVar) {
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: c */
    public final void mo7058c(eem eemVar, edc edcVar) {
        this.f14867i = false;
        m7591l(eemVar, edcVar.getMessage());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gyh, java.lang.Object] */
    @Override // p000.ech
    /* JADX INFO: renamed from: d */
    public final void mo7111d(gyu gyuVar) {
        eem eemVar;
        nbz nbzVar = nch.f41987a;
        int i = gyuVar.f26874a;
        Iterator it = this.f14860a.keySet().iterator();
        do {
            if (!it.hasNext()) {
                eemVar = null;
                break;
            }
            eemVar = (eem) it.next();
        } while (!eemVar.f13675v.f25502c.mo9902h().equals(gyuVar));
        if (eemVar == null) {
            return;
        }
        m7591l(eemVar, "Shot aborted.");
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: e */
    public final void mo7112e(eem eemVar, key keyVar) {
        key keyVarMo7040a;
        try {
            eoh eohVar = (eoh) this.f14860a.get(eemVar);
            if (this.f14861c.m7101l() && eohVar != null && eohVar.f14855a.f25743r < this.f14866h && (keyVarMo7040a = keyVar.mo7040a()) != null) {
                nbz nbzVar = nch.f41987a;
                eohVar.f14855a.mo7644c(keyVarMo7040a);
                boolean z = this.f14867i;
                if (!this.f14865g.mo6184l(did.f11435an)) {
                    z &= eohVar.f14855a.f25743r == this.f14866h;
                }
                if (z) {
                    if (!eohVar.f14857c.getAndSet(true)) {
                        nqf nqfVarM17621g = nqf.m17621g();
                        eoc eocVar = this.f14864f;
                        eem eemVar2 = eohVar.f14856b;
                        gnj gnjVar = eohVar.f14855a;
                        int i = this.f14866h;
                        eok eokVar = eohVar.f14858d;
                        eokVar.m7595a(eokVar.f14875a.f26832a);
                        eocVar.m7585c(eemVar2, gnjVar, i, eokVar.f14875a.f26832a, nqfVarM17621g);
                        kxk.m14975U(nqfVarM17621g, new eog(this, eohVar, 0), this.f14862d);
                    }
                    this.f14864f.m7586d(eohVar.f14856b);
                }
            }
        } finally {
            keyVar.close();
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [dzr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [dhv, java.lang.Object] */
    @Override // p000.ech
    /* JADX INFO: renamed from: f */
    public final void mo7113f(eem eemVar, BurstSpec burstSpec, kpp kppVar) {
        if (this.f14861c.m7101l()) {
            nbz nbzVar = nch.f41987a;
            lku.m15613H(!this.f14860a.containsKey(eemVar));
            Map map = this.f14860a;
            ebn ebnVarM9396a = this.f14868j.m9396a();
            C1058va c1058va = this.f14870l;
            ?? r4 = eemVar.f13675v.f25502c;
            ?? r5 = c1058va.f47802a;
            dhx dhxVar = did.f11416a;
            r5.mo6178f();
            map.put(eemVar, new eoh(new gnj(eemVar.f13675v, ebnVarM9396a, burstSpec, kppVar, null, null), eemVar, new AtomicBoolean(), new eok((kqj) c1058va.f47803b, c1058va.f47804c, r4.mo9905k(), null, null)));
            if (burstSpec != null) {
                this.f14866h = Math.min((int) burstSpec.m4911b().m4967a(), this.f14866h);
            }
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: g */
    public final void mo7114g(gyu gyuVar) {
        this.f14869k.m2622p(gyuVar).m7226f(this);
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: h */
    public final void mo7115h(eem eemVar) {
        nbz nbzVar = nch.f41987a;
        eemVar.m7218a();
        eoh eohVar = (eoh) this.f14860a.get(eemVar);
        if (eohVar != null) {
            if (eohVar.f14857c.get() && eohVar.f14855a.f25743r < this.f14866h) {
                m7591l(eemVar, "Kelper not produced since not enough frames.");
            } else {
                if (eohVar.f14857c.get()) {
                    return;
                }
                m7592j(eemVar, "Kepler was never initiated.");
            }
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo7116i(eem eemVar) {
    }

    /* JADX INFO: renamed from: j */
    public final void m7592j(eem eemVar, String str) {
        nbe nbeVar = (nbe) ((nbe) f14859b.m17252c().mo17282g(nch.f41987a, "KeplerProcessorImpl")).mo17276G(1669);
        int iM7218a = eemVar.m7218a();
        if (str == null) {
            str = "Unknown";
        }
        nbeVar.mo17296u("Shot cancelled. Shot id: %d. Reason: %s", iM7218a, str);
        eoh eohVar = (eoh) this.f14860a.remove(eemVar);
        if (eohVar != null) {
            eohVar.f14855a.mo7643b();
            eok eokVar = eohVar.f14858d;
            eokVar.f14875a.m9976a();
            eokVar.f14876b.m9984d();
            ((hjz) eokVar.f14877c).f28096v.mo14894e(null);
        }
    }

    @Override // p000.eol
    /* JADX INFO: renamed from: k */
    public final synchronized void mo7593k(long j) {
        nbz nbzVar = nch.f41987a;
        if (j >= this.f14863e) {
            this.f14867i = true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gyh, java.lang.Object] */
    @Override // p000.edi
    /* JADX INFO: renamed from: p */
    public final void mo7059p(eem eemVar) {
        this.f14867i = false;
        mo7111d(eemVar.f13675v.f25502c.mo9902h());
    }
}
