package p000;

import android.os.health.HealthStats;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lir extends liq {

    /* JADX INFO: renamed from: a */
    public static final lir f38326a = new lir();

    private lir() {
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nyw mo15467a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        nxl nxlVarM18137O = ozh.f46947e.m18137O();
        int iM15436f = (int) lij.m15436f(healthStats, 50001);
        if (iM15436f != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozh ozhVar = (ozh) nxlVarM18137O.f44974b;
            ozhVar.f46949a |= 1;
            ozhVar.f46950b = iM15436f;
        }
        int iM15436f2 = (int) lij.m15436f(healthStats, 50002);
        if (iM15436f2 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozh ozhVar2 = (ozh) nxlVarM18137O.f44974b;
            ozhVar2.f46949a |= 2;
            ozhVar2.f46951c = iM15436f2;
        }
        if (str != null) {
            ozd ozdVarM15439i = lij.m15439i(str);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozh ozhVar3 = (ozh) nxlVarM18137O.f44974b;
            ozdVarM15439i.getClass();
            ozhVar3.f46952d = ozdVarM15439i;
            ozhVar3.f46949a |= 4;
        }
        ozh ozhVar4 = (ozh) nxlVarM18137O.mo18103l();
        if (lij.m15446p(ozhVar4)) {
            return null;
        }
        return ozhVar4;
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nyw mo15468b(nyw nywVar, nyw nywVar2) {
        int i;
        int i2;
        ozh ozhVar = (ozh) nywVar;
        ozh ozhVar2 = (ozh) nywVar2;
        if (ozhVar == null || ozhVar2 == null) {
            return ozhVar;
        }
        nxl nxlVarM18137O = ozh.f46947e.m18137O();
        if ((ozhVar.f46949a & 1) != 0 && (i2 = ozhVar.f46950b - ozhVar2.f46950b) != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozh ozhVar3 = (ozh) nxlVarM18137O.f44974b;
            ozhVar3.f46949a |= 1;
            ozhVar3.f46950b = i2;
        }
        if ((ozhVar.f46949a & 2) != 0 && (i = ozhVar.f46951c - ozhVar2.f46951c) != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozh ozhVar4 = (ozh) nxlVarM18137O.f44974b;
            ozhVar4.f46949a |= 2;
            ozhVar4.f46951c = i;
        }
        ozd ozdVar = ozhVar.f46952d;
        if (ozdVar == null) {
            ozdVar = ozd.f46924d;
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ozh ozhVar5 = (ozh) nxlVarM18137O.f44974b;
        ozdVar.getClass();
        ozhVar5.f46952d = ozdVar;
        ozhVar5.f46949a |= 4;
        ozh ozhVar6 = (ozh) nxlVarM18137O.mo18103l();
        if (lij.m15446p(ozhVar6)) {
            return null;
        }
        return ozhVar6;
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ String mo15469c(nyw nywVar) {
        ozd ozdVar = ((ozh) nywVar).f46952d;
        if (ozdVar == null) {
            ozdVar = ozd.f46924d;
        }
        return ozdVar.f46928c;
    }
}
