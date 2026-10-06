package p000;

import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ouk implements our {

    /* JADX INFO: renamed from: a */
    private final onm f46578a;

    public ouk() {
    }

    public ouk(onm onmVar) {
        this.f46578a = onmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.our
    /* JADX INFO: renamed from: da */
    public final Object mo16104da(ous ousVar, ols olsVar) throws Throwable {
        ouj oujVar;
        Throwable th;
        own ownVar;
        if (olsVar instanceof ouj) {
            oujVar = (ouj) olsVar;
            int i = oujVar.f46576c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oujVar.f46576c = i - Integer.MIN_VALUE;
            } else {
                oujVar = new ouj(this, olsVar);
            }
        } else {
            oujVar = new ouj(this, olsVar);
        }
        Object obj = oujVar.f46574a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (oujVar.f46576c) {
            case 0:
                lkm.m15592s(obj);
                own ownVar2 = new own(ousVar, oujVar.mo18639d());
                try {
                    oujVar.f46577d = ownVar2;
                    oujVar.f46576c = 1;
                    Object objMo560a = this.f46578a.mo560a(ownVar2, oujVar);
                    if (objMo560a != oma.COROUTINE_SUSPENDED) {
                        objMo560a = oki.f46196a;
                        break;
                    }
                    if (objMo560a == omaVar) {
                        return omaVar;
                    }
                    ownVar = ownVar2;
                    ownVar.mo18654h();
                    return oki.f46196a;
                } catch (Throwable th2) {
                    th = th2;
                    ownVar = ownVar2;
                    ownVar.mo18654h();
                    throw th;
                }
            case 1:
                ownVar = oujVar.f46577d;
                try {
                    lkm.m15592s(obj);
                    ownVar.mo18654h();
                    return oki.f46196a;
                } catch (Throwable th3) {
                    th = th3;
                    ownVar.mo18654h();
                    throw th;
                }
            default:
                throw new IllegalStateException(IuyLAqNmW.SxlEbSSiytmqSB);
        }
    }
}
