package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehi implements hnu, fbp, fbj, fbl {

    /* JADX INFO: renamed from: a */
    private final dhv f14037a;

    /* JADX INFO: renamed from: b */
    private final hai f14038b;

    /* JADX INFO: renamed from: c */
    private final List f14039c;

    /* JADX INFO: renamed from: d */
    private final hnw f14040d;

    /* JADX INFO: renamed from: e */
    private final hnv f14041e;

    /* JADX INFO: renamed from: f */
    private final idg f14042f;

    public ehi(Executor executor, dhv dhvVar, jww jwwVar, hnv hnvVar, hnv hnvVar2, hai haiVar, idg idgVar, dbr dbrVar, cdu cduVar, jww jwwVar2, jvd jvdVar, fan fanVar, gfa gfaVar, hnw hnwVar) {
        Object objM10522a;
        Object objM10522a2;
        this.f14037a = dhvVar;
        this.f14038b = haiVar;
        this.f14040d = hnwVar;
        this.f14041e = hnvVar2;
        this.f14042f = idgVar;
        if (dhvVar.mo6184l(did.f11414Y)) {
            hny hnyVarM10529a = hnz.m10529a();
            hnyVarM10529a.m10524c(executor);
            hnyVarM10529a.m10525d("HdrNet");
            hnyVarM10529a.m10526e(new efd(jwwVar, 8));
            hnyVarM10529a.m10527f(new efd(jwwVar, 9));
            hnyVarM10529a.m10528g(hnvVar);
            objM10522a = hnyVarM10529a.m10522a();
        } else {
            objM10522a = hnq.f28522a;
        }
        if (gtd.m9733e() && dhvVar.mo6184l(did.f11438aq)) {
            cduVar.m3529i().m13537d(jwwVar2.mo3830a(new ecr(jwwVar2, idgVar, 5), jvdVar));
            cduVar.m3529i().m13537d(dbrVar.mo3830a(new glh(idgVar, haiVar, jwwVar2, gfaVar, 1), executor));
            hny hnyVarM10529a2 = hnz.m10529a();
            hnyVarM10529a2.m10524c(executor);
            hnyVarM10529a2.m10525d("HdrPlusTorch");
            hnyVarM10529a2.m10526e(new efc(this, dbrVar, haiVar, jwwVar2, gfaVar, idgVar, 2));
            hnyVarM10529a2.m10527f(new dgq(this, idgVar, 17));
            hnyVarM10529a2.m10528g(hnvVar2);
            objM10522a2 = hnyVarM10529a2.m10522a();
        } else {
            objM10522a2 = hnq.f28522a;
        }
        this.f14039c = mws.m17098m(objM10522a, objM10522a2);
        jvdVar.m13541c(new dgq(this, fanVar, 18));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m7322d(ikw ikwVar) {
        return ikwVar.equals(ikw.PHOTO) || ikwVar.equals(ikw.PORTRAIT);
    }

    /* JADX INFO: renamed from: a */
    public final void m7323a(boolean z) {
        if (this.f14037a.mo6184l(did.f11438aq)) {
            this.f14038b.mo10033e(gzy.f27067z, Boolean.valueOf(!z));
        }
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        m7323a(true);
        this.f14042f.m11114b();
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        if (this.f14040d.mo10518e().m10520a(this.f14041e)) {
            m7323a(false);
        }
    }

    @Override // p000.hnu
    /* JADX INFO: renamed from: by */
    public final synchronized void mo5538by(hnv hnvVar) {
        nba it = ((mws) this.f14039c).iterator();
        while (it.hasNext()) {
            ((hnu) it.next()).mo5538by(hnvVar);
        }
    }
}
