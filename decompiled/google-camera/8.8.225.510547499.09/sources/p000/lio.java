package p000;

import android.os.health.HealthStats;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lio extends liq {

    /* JADX INFO: renamed from: a */
    public static final lio f38324a = new lio();

    private lio() {
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nyw mo15467a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        nxl nxlVarM18137O = oze.f46929e.m18137O();
        nxlVarM18137O.m18057T(lir.f38326a.m15470d(lij.m15438h(healthStats, 40001)));
        nxlVarM18137O.m18058U(lin.f38323a.m15470d((healthStats == null || !healthStats.hasMeasurements(40002)) ? Collections.emptyMap() : healthStats.getMeasurements(40002)));
        if (str != null) {
            ozd ozdVarM15439i = lij.m15439i(str);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            oze ozeVar = (oze) nxlVarM18137O.f44974b;
            ozdVarM15439i.getClass();
            ozeVar.f46934d = ozdVarM15439i;
            ozeVar.f46931a |= 1;
        }
        oze ozeVar2 = (oze) nxlVarM18137O.mo18103l();
        if (lij.m15444n(ozeVar2)) {
            return null;
        }
        return ozeVar2;
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nyw mo15468b(nyw nywVar, nyw nywVar2) {
        oze ozeVar = (oze) nywVar;
        oze ozeVar2 = (oze) nywVar2;
        if (ozeVar == null || ozeVar2 == null) {
            return ozeVar;
        }
        nxl nxlVarM18137O = oze.f46929e.m18137O();
        nxlVarM18137O.m18057T(lir.f38326a.m15471e(ozeVar.f46932b, ozeVar2.f46932b));
        nxlVarM18137O.m18058U(lin.f38323a.m15471e(ozeVar.f46933c, ozeVar2.f46933c));
        ozd ozdVar = ozeVar.f46934d;
        if (ozdVar == null) {
            ozdVar = ozd.f46924d;
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        oze ozeVar3 = (oze) nxlVarM18137O.f44974b;
        ozdVar.getClass();
        ozeVar3.f46934d = ozdVar;
        ozeVar3.f46931a |= 1;
        oze ozeVar4 = (oze) nxlVarM18137O.mo18103l();
        if (lij.m15444n(ozeVar4)) {
            return null;
        }
        return ozeVar4;
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ String mo15469c(nyw nywVar) {
        ozd ozdVar = ((oze) nywVar).f46934d;
        if (ozdVar == null) {
            ozdVar = ozd.f46924d;
        }
        return ozdVar.f46928c;
    }
}
