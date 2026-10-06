package p000;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ltl implements nol {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nps f39172a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f39173b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39174c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f39175d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f39176e;

    public /* synthetic */ ltl(lml lmlVar, nxl nxlVar, nps npsVar, nps npsVar2, int i) {
        this.f39176e = i;
        this.f39173b = lmlVar;
        this.f39175d = nxlVar;
        this.f39174c = npsVar;
        this.f39172a = npsVar2;
    }

    public /* synthetic */ ltl(ltn ltnVar, nps npsVar, nom nomVar, Executor executor, int i) {
        this.f39176e = i;
        this.f39173b = ltnVar;
        this.f39172a = npsVar;
        this.f39174c = nomVar;
        this.f39175d = executor;
    }

    public /* synthetic */ ltl(ltp ltpVar, nps npsVar, nom nomVar, Executor executor, int i) {
        this.f39176e = i;
        this.f39173b = ltpVar;
        this.f39172a = npsVar;
        this.f39174c = nomVar;
        this.f39175d = executor;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, nom] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, nom] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // p000.nol
    /* JADX INFO: renamed from: a */
    public final nps mo3988a() {
        int i = 2;
        switch (this.f39176e) {
            case 0:
                Object obj = this.f39173b;
                nps npsVar = this.f39172a;
                ?? r3 = this.f39174c;
                ?? r4 = this.f39175d;
                ltn ltnVar = (ltn) obj;
                nps npsVarM17554j = nod.m17554j(npsVar, new cnc(ltnVar, 18), not.INSTANCE);
                nps npsVarM17554j2 = nod.m17554j(npsVarM17554j, r3, r4);
                return nod.m17554j(npsVarM17554j2, mov.m16716b(new lqs(ltnVar, npsVarM17554j, npsVarM17554j2, i)), not.INSTANCE);
            case 1:
                Object obj2 = this.f39173b;
                Object obj3 = this.f39175d;
                ?? r5 = this.f39174c;
                nps npsVar2 = this.f39172a;
                try {
                    Map map = (Map) ((mrm) kxk.m14973S(r5)).mo16812f();
                    if (map != null) {
                        nxl nxlVar = (nxl) obj3;
                        long j = ((ozx) nxlVar.f44974b).f47101b;
                        for (Map.Entry entry : map.entrySet()) {
                            int iIntValue = ((Integer) entry.getKey()).intValue();
                            long jLongValue = ((Long) entry.getValue()).longValue() - j;
                            if (!nxlVar.f44974b.m18142ac()) {
                                nxlVar.mo18106p();
                            }
                            ozx ozxVar = (ozx) nxlVar.f44974b;
                            nyr nyrVar = ozxVar.f47121v;
                            if (!nyrVar.f45034b) {
                                ozxVar.f47121v = nyrVar.m18191a();
                            }
                            ozxVar.f47121v.put(Integer.valueOf(iIntValue), Long.valueOf(jLongValue));
                        }
                    }
                } catch (Exception e) {
                    ((nbe) ((nbe) ((nbe) lml.f38686a.m17252c()).mo17283h(e)).mo17276G((char) 4542)).mo17290o("Failed to get custom timestamps future");
                }
                mbl mblVar = ((lml) obj2).f38689d;
                lja ljaVarM15522a = ljb.m15522a();
                nxl nxlVarM18137O = pat.f47274u.m18137O();
                nxl nxlVarM18137O2 = ozt.f47075f.m18137O();
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O2.f44974b;
                ozt oztVar = (ozt) nxqVar;
                oztVar.f47077a |= 1;
                oztVar.f47078b = leastSignificantBits;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O2.f44974b;
                ozt oztVar2 = (ozt) nxqVar2;
                oztVar2.f47079c = 2;
                oztVar2.f47077a = 2 | oztVar2.f47077a;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                ozt oztVar3 = (ozt) nxlVarM18137O2.f44974b;
                ozx ozxVar2 = (ozx) ((nxl) obj3).mo18103l();
                ozxVar2.getClass();
                oztVar3.f47081e = ozxVar2;
                oztVar3.f47077a |= 16;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                pat patVar = (pat) nxlVarM18137O.f44974b;
                ozt oztVar4 = (ozt) nxlVarM18137O2.mo18103l();
                oztVar4.getClass();
                patVar.f47286k = oztVar4;
                patVar.f47276a |= 4096;
                ljaVarM15522a.m15515e((pat) nxlVarM18137O.mo18103l());
                ljaVarM15522a.f38345d = (ozk) ((mrm) kxk.m14973S(npsVar2)).mo16812f();
                ljaVarM15522a.f38346e = null;
                ljaVarM15522a.m15514d(true);
                return mblVar.m16298b(ljaVarM15522a.m15511a());
            default:
                return nod.m17554j(this.f39172a, mov.m16716b(new lqs((ltp) this.f39173b, (nom) this.f39174c, (Executor) this.f39175d, 3)), not.INSTANCE);
        }
    }
}
