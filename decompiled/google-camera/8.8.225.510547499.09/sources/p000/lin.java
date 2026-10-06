package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lin extends liq {

    /* JADX INFO: renamed from: a */
    public static final lin f38323a = new lin();

    private lin() {
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ nyw mo15467a(String str, Object obj) {
        int iIntValue = ((Long) obj).intValue();
        if (iIntValue == 0) {
            return null;
        }
        nxl nxlVarM18137O = ozc.f46919d.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ozc ozcVar = (ozc) nxlVarM18137O.f44974b;
        ozcVar.f46921a |= 1;
        ozcVar.f46922b = iIntValue;
        if (str != null) {
            ozd ozdVarM15439i = lij.m15439i(str);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozc ozcVar2 = (ozc) nxlVarM18137O.f44974b;
            ozdVarM15439i.getClass();
            ozcVar2.f46923c = ozdVarM15439i;
            ozcVar2.f46921a |= 2;
        }
        return (ozc) nxlVarM18137O.mo18103l();
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nyw mo15468b(nyw nywVar, nyw nywVar2) {
        int i;
        ozc ozcVar = (ozc) nywVar;
        ozc ozcVar2 = (ozc) nywVar2;
        if (ozcVar == null || ozcVar2 == null) {
            return ozcVar;
        }
        if ((ozcVar.f46921a & 1) != 0 && (i = ozcVar.f46922b - ozcVar2.f46922b) != 0) {
            nxl nxlVarM18137O = ozc.f46919d.m18137O();
            if ((ozcVar.f46921a & 2) != 0) {
                ozd ozdVar = ozcVar.f46923c;
                if (ozdVar == null) {
                    ozdVar = ozd.f46924d;
                }
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozc ozcVar3 = (ozc) nxlVarM18137O.f44974b;
                ozdVar.getClass();
                ozcVar3.f46923c = ozdVar;
                ozcVar3.f46921a |= 2;
            }
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozc ozcVar4 = (ozc) nxlVarM18137O.f44974b;
            ozcVar4.f46921a |= 1;
            ozcVar4.f46922b = i;
            return (ozc) nxlVarM18137O.mo18103l();
        }
        return null;
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ String mo15469c(nyw nywVar) {
        ozd ozdVar = ((ozc) nywVar).f46923c;
        if (ozdVar == null) {
            ozdVar = ozd.f46924d;
        }
        return ozdVar.f46928c;
    }
}
