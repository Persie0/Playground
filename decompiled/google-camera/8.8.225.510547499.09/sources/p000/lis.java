package p000;

import android.os.health.TimerStat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lis extends liq {

    /* JADX INFO: renamed from: a */
    public static final lis f38327a = new lis();

    private lis() {
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nyw mo15467a(String str, Object obj) {
        return lij.m15442l(str, (TimerStat) obj);
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nyw mo15468b(nyw nywVar, nyw nywVar2) {
        return lij.m15441k((ozi) nywVar, (ozi) nywVar2);
    }

    @Override // p000.liq
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ String mo15469c(nyw nywVar) {
        ozi oziVar = (ozi) nywVar;
        ozd ozdVar = oziVar.f46958d;
        if (ozdVar == null) {
            ozdVar = ozd.f46924d;
        }
        int i = ozdVar.f46926a & 2;
        ozd ozdVar2 = oziVar.f46958d;
        if (i != 0) {
            if (ozdVar2 == null) {
                ozdVar2 = ozd.f46924d;
            }
            return ozdVar2.f46928c;
        }
        if (ozdVar2 == null) {
            ozdVar2 = ozd.f46924d;
        }
        return Long.toHexString(ozdVar2.f46927b);
    }
}
