package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lkr extends lkm implements ljh {

    /* JADX INFO: renamed from: d */
    private static final nbh f38500d = nbh.m17259h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl");

    /* JADX INFO: renamed from: e */
    private final Context f38501e;

    /* JADX INFO: renamed from: f */
    private final Executor f38502f;

    /* JADX INFO: renamed from: g */
    private final lkj f38503g;

    /* JADX INFO: renamed from: h */
    private final oju f38504h;

    /* JADX INFO: renamed from: i */
    private final ohb f38505i;

    /* JADX INFO: renamed from: j */
    private final oju f38506j;

    /* JADX INFO: renamed from: k */
    private final oju f38507k;

    /* JADX INFO: renamed from: l */
    private final mbl f38508l;

    public lkr(ljf ljfVar, Context context, Executor executor, lkj lkjVar, oju ojuVar, ohb ohbVar, oju ojuVar2, oju ojuVar3) {
        this.f38508l = ljfVar.m15526b(executor, ohbVar, null);
        this.f38501e = context;
        this.f38502f = executor;
        this.f38503g = lkjVar;
        this.f38504h = ojuVar;
        this.f38505i = ohbVar;
        this.f38506j = ojuVar2;
        this.f38507k = ojuVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ nps m15600d(final lkr lkrVar) {
        if (!((lki) lkrVar.f38505i.get()).mo15379b()) {
            return npp.f44031a;
        }
        if (!Application.getProcessName().equals(String.valueOf(lkrVar.f38501e.getPackageName()).concat(String.valueOf(((lki) lkrVar.f38505i.get()).f38486a)))) {
            return npp.f44031a;
        }
        if (!((Boolean) lkrVar.f38506j.get()).booleanValue()) {
            return npp.f44031a;
        }
        final List listMo15557a = lkrVar.f38503g.mo15557a(0, 0, ((SharedPreferences) lkrVar.f38504h.get()).getString("lastExitProcessName", null), ((SharedPreferences) lkrVar.f38504h.get()).getLong("lastExitTimestamp", -1L));
        if (listMo15557a.isEmpty()) {
            return npp.f44031a;
        }
        oyy oyyVar = (oyy) lkrVar.f38507k.get();
        nxl nxlVarM18137O = oyx.f46883e.m18137O();
        int i = ((mzr) listMo15557a).f41859c;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        oyx oyxVar = (oyx) nxqVar;
        oyxVar.f46885a |= 2;
        oyxVar.f46888d = i;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        oyx oyxVar2 = (oyx) nxlVarM18137O.f44974b;
        oyyVar.getClass();
        oyxVar2.f46887c = oyyVar;
        oyxVar2.f46885a |= 1;
        HashSet hashSetM16749A = mpw.m16749A();
        for (int i2 = 0; i2 < oyyVar.f46891a.size(); i2++) {
            int iM15633ab = lku.m15633ab(oyyVar.f46891a.mo18146d(i2));
            if (iM15633ab == 0) {
                iM15633ab = 1;
            }
            hashSetM16749A.add(Integer.valueOf(iM15633ab - 1));
        }
        nba it = ((mws) listMo15557a).iterator();
        while (it.hasNext()) {
            oyw oywVar = (oyw) it.next();
            int iM15633ab2 = lku.m15633ab(oywVar.f46876c);
            if (iM15633ab2 == 0) {
                iM15633ab2 = 1;
            }
            if (hashSetM16749A.contains(Integer.valueOf(iM15633ab2 - 1))) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                oyx oyxVar3 = (oyx) nxlVarM18137O.f44974b;
                oywVar.getClass();
                nxy nxyVar = oyxVar3.f46886b;
                if (!nxyVar.mo17770c()) {
                    oyxVar3.f46886b = nxq.m18127U(nxyVar);
                }
                oyxVar3.f46886b.add(oywVar);
            }
        }
        oyx oyxVar4 = (oyx) nxlVarM18137O.mo18103l();
        mbl mblVar = lkrVar.f38508l;
        lja ljaVarM15522a = ljb.m15522a();
        nxl nxlVarM18137O2 = pat.f47274u.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        pat patVar = (pat) nxlVarM18137O2.f44974b;
        oyxVar4.getClass();
        patVar.f47287l = oyxVar4;
        patVar.f47276a |= 524288;
        ljaVarM15522a.m15515e((pat) nxlVarM18137O2.mo18103l());
        return nod.m17553i(mblVar.m16298b(ljaVarM15522a.m15511a()), new mrf() { // from class: lko
            @Override // p000.mrf
            public final Object apply(Object obj) {
                this.f38496a.m15602O(listMo15557a, (Void) obj);
                return null;
            }
        }, lkrVar.f38502f);
    }

    /* JADX INFO: renamed from: N */
    public /* synthetic */ nps m15601N() {
        return kuh.m14887b(this.f38501e, new Runnable() { // from class: lkq
            @Override // java.lang.Runnable
            public final void run() {
                this.f38499a.m15603P();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public /* synthetic */ Void m15602O(List list, Void r7) {
        int i = 0;
        oyw oywVar = (oyw) list.get(0);
        while (!((SharedPreferences) this.f38504h.get()).edit().putString("lastExitProcessName", str).putLong("lastExitTimestamp", oywVar.f46879f).commit()) {
            i++;
            if (i >= 3) {
                ((nbe) ((nbe) f38500d.m17252c()).mo17276G((char) 4524)).mo17290o("Failed to persist most recent App Exit");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m15603P() {
        kxk.m14970P(new nol() { // from class: lkp
            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() {
                return lkr.m15600d(this.f38498a);
            }
        }, this.f38502f);
    }

    /* JADX INFO: renamed from: Q */
    public void m15604Q() {
        kxk.m14970P(new nol() { // from class: lkn
            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() {
                return this.f38495a.m15601N();
            }
        }, this.f38502f);
    }

    @Override // p000.ljh
    /* JADX INFO: renamed from: ao */
    public void mo15463ao() {
        m15604Q();
    }
}
