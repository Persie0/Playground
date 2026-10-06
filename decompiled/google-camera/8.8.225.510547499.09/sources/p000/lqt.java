package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lqt implements nom {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f39008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f39009b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39010c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f39011d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f39012e;

    public /* synthetic */ lqt(fvs fvsVar, fmj fmjVar, mrm mrmVar, fvu fvuVar, int i) {
        this.f39012e = i;
        this.f39010c = fvsVar;
        this.f39008a = fmjVar;
        this.f39011d = mrmVar;
        this.f39009b = fvuVar;
    }

    public /* synthetic */ lqt(String str, lqm lqmVar, lpj lpjVar, lre lreVar, int i) {
        this.f39012e = i;
        this.f39011d = str;
        this.f39010c = lqmVar;
        this.f39008a = lpjVar;
        this.f39009b = lreVar;
    }

    public /* synthetic */ lqt(lpj lpjVar, nps npsVar, lqm lqmVar, String str, int i) {
        this.f39012e = i;
        this.f39008a = lpjVar;
        this.f39009b = npsVar;
        this.f39010c = lqmVar;
        this.f39011d = str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // p000.nom
    /* JADX INFO: renamed from: a */
    public final nps mo3942a(Object obj) {
        switch (this.f39012e) {
            case 0:
                Object obj2 = this.f39008a;
                ?? r1 = this.f39009b;
                Object obj3 = this.f39010c;
                Object obj4 = this.f39011d;
                lre lreVar = (lre) kxk.m14973S(r1);
                if (lreVar.f39064b.isEmpty()) {
                    return npp.f44031a;
                }
                lqm lqmVar = (lqm) obj3;
                lpj lpjVar = (lpj) obj2;
                return nod.m17554j(npm.m17611q(nod.m17553i(npm.m17611q(lqp.m15887b(lpjVar).m15977a()), new lqo(lqmVar.f38980a, 2), lpjVar.m15826b())), new lqt((String) obj4, lqmVar, lpjVar, lreVar, 2), lpjVar.m15826b());
            case 1:
                Object obj5 = this.f39010c;
                Object obj6 = this.f39008a;
                Object obj7 = this.f39011d;
                Object obj8 = this.f39009b;
                iht ihtVar = (iht) obj;
                fvs fvsVar = (fvs) obj5;
                ikw ikwVar = (ikw) fvsVar.f23684j.mo3831be();
                if (ikw.VIDEO.equals(ikwVar) || ikw.SLOW_MOTION.equals(ikwVar) || ikw.TIME_LAPSE.equals(ikwVar) || ikw.AMBER.equals(ikwVar)) {
                    return kxk.m14964J(new Throwable("Trying to configure photo mode viewfinder while the mode is ".concat(String.valueOf(String.valueOf(fvsVar.f23684j.mo3831be())))));
                }
                return ihtVar.m11367f(((fmj) obj6).f22561a.f22532d, (mrm) obj7, Integer.valueOf(((kmr) obj8).mo14553f()));
            default:
                Object obj9 = this.f39011d;
                Object obj10 = this.f39010c;
                Object obj11 = this.f39008a;
                Object obj12 = this.f39009b;
                if (((String) obj).equals(obj9)) {
                    return lqu.f39015c.containsKey(mrn.m16830a(((lqm) obj10).f38980a, obj9)) ? npp.f44031a : ((lpj) obj11).m15828e().m15479b(((lre) obj12).f39064b);
                }
                return npp.f44031a;
        }
    }
}
