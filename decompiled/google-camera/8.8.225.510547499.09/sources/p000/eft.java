package p000;

import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eft implements edy {

    /* JADX INFO: renamed from: a */
    public final gaw f13859a;

    /* JADX INFO: renamed from: b */
    public final gyh f13860b;

    /* JADX INFO: renamed from: c */
    public final String f13861c;

    /* JADX INFO: renamed from: d */
    public final int f13862d;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ efu f13865g;

    /* JADX INFO: renamed from: h */
    public final ebn f13866h;

    /* JADX INFO: renamed from: k */
    public final glk f13869k;

    /* JADX INFO: renamed from: l */
    private final egk f13870l;

    /* JADX INFO: renamed from: m */
    private final FusionProgressCallback f13871m;

    /* JADX INFO: renamed from: i */
    public final nxl f13867i = niz.f42849e.m18137O();

    /* JADX INFO: renamed from: j */
    public final jfs f13868j = new jfs((char[]) null);

    /* JADX INFO: renamed from: n */
    private final egi f13872n = egj.m7306a();

    /* JADX INFO: renamed from: o */
    private final egi f13873o = egj.m7306a();

    /* JADX INFO: renamed from: p */
    private volatile boolean f13874p = false;

    /* JADX INFO: renamed from: e */
    public long f13863e = -1;

    /* JADX INFO: renamed from: f */
    public boolean f13864f = false;

    /* JADX INFO: renamed from: q */
    private boolean f13875q = false;

    /* JADX WARN: Type inference failed for: r5v1, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [gaw, java.lang.Object] */
    public eft(efu efuVar, glk glkVar, ebn ebnVar, egk egkVar, byte[] bArr, byte[] bArr2) {
        this.f13865g = efuVar;
        this.f13869k = glkVar;
        this.f13866h = ebnVar;
        ?? r5 = glkVar.f25502c;
        this.f13860b = r5;
        ?? r7 = glkVar.f25500a;
        this.f13859a = r7;
        this.f13870l = egkVar;
        this.f13861c = r5.mo9902h().toString();
        this.f13862d = cem.m3564b(((fua) glkVar.f25503d).f23573a, efuVar.f13886k, efuVar.f13888m, efuVar.f13887l, efuVar.f13880e);
        r7.mo9016a(eec.f13605b, 0.0f);
        this.f13871m = new efr(this, egkVar);
    }

    @Override // p000.fzt
    /* JADX INFO: renamed from: a */
    public final void mo3602a(kpw kpwVar, nps npsVar) {
    }

    @Override // p000.edy
    /* JADX INFO: renamed from: b */
    public final void mo7186b(nsa nsaVar, ShotMetadata shotMetadata, nrt nrtVar, List list) {
        if (nsaVar != null && shotMetadata != null && nrtVar != null) {
            this.f13860b.mo9913s();
            egi egiVar = this.f13872n;
            egiVar.m7299c(nsaVar);
            egiVar.f13958b = shotMetadata;
            egiVar.f13959c = nrtVar;
            egiVar.m7298b(mws.m17095j(list));
            return;
        }
        this.f13860b.mo9913s();
        egi egiVar2 = this.f13872n;
        egiVar2.m7299c(new nsa());
        egiVar2.f13958b = new ShotMetadata();
        egiVar2.f13959c = new nrt();
        if (nsaVar != null) {
            nsaVar.mo5090a();
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f13874p) {
            return;
        }
        try {
            egj egjVarM7297a = this.f13872n.m7297a();
            try {
                egj egjVarM7297a2 = this.f13873o.m7297a();
                this.f13874p = true;
                this.f13859a.mo9016a(ecq.f13394a, 1.0f);
                this.f13865g.f13884i.remove(this.f13860b.mo9913s());
                long andIncrement = this.f13865g.f13883h.getAndIncrement();
                this.f13863e = System.currentTimeMillis();
                egk egkVar = this.f13870l;
                efu efuVar = this.f13865g;
                kxk.m14975U(egkVar.mo4173e(andIncrement, efuVar.f13888m, egjVarM7297a, egjVarM7297a2, this.f13871m, efuVar.f13882g), new eho(this, andIncrement, 1), not.INSTANCE);
            } catch (IllegalStateException e) {
                ((nbe) ((nbe) ((nbe) efu.f13876a.m17252c()).mo17283h(e)).mo17276G(1406)).mo17293r("[%s] Unable to close the session. Is there a pending secondary shot?", this.f13861c);
            }
        } catch (IllegalStateException e2) {
            ((nbe) ((nbe) ((nbe) efu.f13876a.m17252c()).mo17283h(e2)).mo17276G(1407)).mo17293r("[%s] Unable to close the session. Is there a pending primary shot?", this.f13861c);
        }
    }

    @Override // p000.edy
    /* JADX INFO: renamed from: d */
    public final void mo7188d(nsa nsaVar, ShotMetadata shotMetadata, nrt nrtVar, List list) {
        if (nsaVar != null && shotMetadata != null && nrtVar != null) {
            this.f13860b.mo9913s();
            egi egiVar = this.f13873o;
            egiVar.m7299c(nsaVar);
            egiVar.f13958b = shotMetadata;
            egiVar.f13959c = nrtVar;
            egiVar.m7298b(mws.m17095j(list));
            return;
        }
        this.f13860b.mo9913s();
        egi egiVar2 = this.f13873o;
        egiVar2.m7299c(new nsa());
        egiVar2.f13958b = new ShotMetadata();
        egiVar2.f13959c = new nrt();
        if (nsaVar != null) {
            nsaVar.mo5090a();
        }
    }

    @Override // p000.edy
    /* JADX INFO: renamed from: e */
    public final void mo7189e(InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, List list) {
        if (interleavedImageU8 != null && shotMetadata != null) {
            this.f13860b.mo9913s();
            egi egiVar = this.f13873o;
            egiVar.m7300d(interleavedImageU8);
            egiVar.f13958b = shotMetadata;
            egiVar.m7298b(mws.m17095j(list));
            return;
        }
        this.f13860b.mo9913s();
        egi egiVar2 = this.f13873o;
        egiVar2.m7300d(new InterleavedImageU8());
        egiVar2.f13958b = new ShotMetadata();
        if (interleavedImageU8 != null) {
            interleavedImageU8.m5007g();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7284f(long j) {
        if (this.f13875q && this.f13868j.m13113w() == 0) {
            this.f13859a.mo9016a(eec.f13605b, 1.0f);
            if (this.f13864f) {
                this.f13860b.mo9913s();
                ((hjz) this.f13860b.mo9905k()).f28090p = (niz) this.f13867i.mo18103l();
            } else {
                dos dosVar = new dos("PostProcessingFusionImageSaverImpl did not save any output images for session ".concat(String.valueOf(this.f13861c)));
                ((nbe) ((nbe) ((nbe) efu.f13876a.m17251b()).mo17283h(dosVar)).mo17276G(1409)).mo17271B("[%s] Error processing the image, cancelling the session %s for %d", this.f13861c, this.f13860b.mo9913s(), Long.valueOf(j));
                this.f13860b.mo9917w(dosVar);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7285g(Runnable runnable) {
        this.f13865g.f13885j.m8939a(new dqr(this, runnable, 3));
    }

    @Override // p000.edy
    /* JADX INFO: renamed from: c */
    public final void mo7187c(InterleavedImageU8 interleavedImageU8, PortraitRequest portraitRequest, ShotMetadata shotMetadata, nps npsVar, jvb jvbVar) {
        if (interleavedImageU8 != null) {
            this.f13860b.mo9913s();
            egi egiVar = this.f13872n;
            egiVar.m7300d(interleavedImageU8);
            egiVar.f13958b = shotMetadata;
            return;
        }
        this.f13860b.mo9913s();
        egi egiVar2 = this.f13872n;
        egiVar2.m7300d(new InterleavedImageU8());
        egiVar2.f13958b = new ShotMetadata();
    }
}
