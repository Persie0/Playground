package p000;

import android.os.health.HealthStats;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lip extends liq {

    /* JADX INFO: renamed from: a */
    public static final lip f38325a = new lip();

    private lip() {
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nyw mo15467a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        nxl nxlVarM18137O = ozg.f46937i.m18137O();
        long jM15436f = lij.m15436f(healthStats, 30001);
        if (jM15436f != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozg ozgVar = (ozg) nxlVarM18137O.f44974b;
            ozgVar.f46939a |= 1;
            ozgVar.f46940b = jM15436f;
        }
        long jM15436f2 = lij.m15436f(healthStats, 30002);
        if (jM15436f2 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozg ozgVar2 = (ozg) nxlVarM18137O.f44974b;
            ozgVar2.f46939a |= 2;
            ozgVar2.f46941c = jM15436f2;
        }
        long jM15436f3 = lij.m15436f(healthStats, 30003);
        if (jM15436f3 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozg ozgVar3 = (ozg) nxlVarM18137O.f44974b;
            ozgVar3.f46939a |= 4;
            ozgVar3.f46942d = jM15436f3;
        }
        long jM15436f4 = lij.m15436f(healthStats, 30004);
        if (jM15436f4 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozg ozgVar4 = (ozg) nxlVarM18137O.f44974b;
            ozgVar4.f46939a |= 8;
            ozgVar4.f46943e = jM15436f4;
        }
        long jM15436f5 = lij.m15436f(healthStats, 30005);
        if (jM15436f5 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozg ozgVar5 = (ozg) nxlVarM18137O.f44974b;
            ozgVar5.f46939a |= 16;
            ozgVar5.f46944f = jM15436f5;
        }
        long jM15436f6 = lij.m15436f(healthStats, 30006);
        if (jM15436f6 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozg ozgVar6 = (ozg) nxlVarM18137O.f44974b;
            ozgVar6.f46939a |= 32;
            ozgVar6.f46945g = jM15436f6;
        }
        if (str != null) {
            ozd ozdVarM15439i = lij.m15439i(str);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozg ozgVar7 = (ozg) nxlVarM18137O.f44974b;
            ozdVarM15439i.getClass();
            ozgVar7.f46946h = ozdVarM15439i;
            ozgVar7.f46939a |= 64;
        }
        ozg ozgVar8 = (ozg) nxlVarM18137O.mo18103l();
        if (lij.m15445o(ozgVar8)) {
            return null;
        }
        return ozgVar8;
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nyw mo15468b(nyw nywVar, nyw nywVar2) {
        ozg ozgVar = (ozg) nywVar;
        ozg ozgVar2 = (ozg) nywVar2;
        if (ozgVar == null || ozgVar2 == null) {
            return ozgVar;
        }
        nxl nxlVarM18137O = ozg.f46937i.m18137O();
        if ((ozgVar.f46939a & 1) != 0) {
            long j = ozgVar.f46940b - ozgVar2.f46940b;
            if (j != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozg ozgVar3 = (ozg) nxlVarM18137O.f44974b;
                ozgVar3.f46939a |= 1;
                ozgVar3.f46940b = j;
            }
        }
        if ((ozgVar.f46939a & 2) != 0) {
            long j2 = ozgVar.f46941c - ozgVar2.f46941c;
            if (j2 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozg ozgVar4 = (ozg) nxlVarM18137O.f44974b;
                ozgVar4.f46939a |= 2;
                ozgVar4.f46941c = j2;
            }
        }
        if ((ozgVar.f46939a & 4) != 0) {
            long j3 = ozgVar.f46942d - ozgVar2.f46942d;
            if (j3 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozg ozgVar5 = (ozg) nxlVarM18137O.f44974b;
                ozgVar5.f46939a |= 4;
                ozgVar5.f46942d = j3;
            }
        }
        if ((ozgVar.f46939a & 8) != 0) {
            long j4 = ozgVar.f46943e - ozgVar2.f46943e;
            if (j4 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozg ozgVar6 = (ozg) nxlVarM18137O.f44974b;
                ozgVar6.f46939a |= 8;
                ozgVar6.f46943e = j4;
            }
        }
        if ((ozgVar.f46939a & 16) != 0) {
            long j5 = ozgVar.f46944f - ozgVar2.f46944f;
            if (j5 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozg ozgVar7 = (ozg) nxlVarM18137O.f44974b;
                ozgVar7.f46939a |= 16;
                ozgVar7.f46944f = j5;
            }
        }
        if ((ozgVar.f46939a & 32) != 0) {
            long j6 = ozgVar.f46945g - ozgVar2.f46945g;
            if (j6 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozg ozgVar8 = (ozg) nxlVarM18137O.f44974b;
                ozgVar8.f46939a |= 32;
                ozgVar8.f46945g = j6;
            }
        }
        ozd ozdVar = ozgVar.f46946h;
        if (ozdVar == null) {
            ozdVar = ozd.f46924d;
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ozg ozgVar9 = (ozg) nxlVarM18137O.f44974b;
        ozdVar.getClass();
        ozgVar9.f46946h = ozdVar;
        ozgVar9.f46939a |= 64;
        ozg ozgVar10 = (ozg) nxlVarM18137O.mo18103l();
        if (lij.m15445o(ozgVar10)) {
            return null;
        }
        return ozgVar10;
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ String mo15469c(nyw nywVar) {
        ozd ozdVar = ((ozg) nywVar).f46946h;
        if (ozdVar == null) {
            ozdVar = ozd.f46924d;
        }
        return ozdVar.f46928c;
    }
}
