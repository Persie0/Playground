package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ktn implements ktf {

    /* JADX INFO: renamed from: a */
    private final ktg f37172a;

    /* JADX INFO: renamed from: b */
    private final obd f37173b;

    /* JADX INFO: renamed from: c */
    private final ksr f37174c;

    public ktn(ktg ktgVar, obd obdVar, ksr ksrVar) {
        this.f37172a = ktgVar;
        this.f37173b = obdVar;
        this.f37174c = ksrVar;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m14839b(obb obbVar) {
        int i = 0;
        while (true) {
            if (i >= obbVar.f45235a.size()) {
                Iterator it = obbVar.f45236b.iterator();
                while (it.hasNext()) {
                    if (!m14840c((obc) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            int iM18395b = oba.m18395b(obbVar.f45235a.mo18146d(i));
            if (!this.f37172a.mo14837a(iM18395b != 0 ? iM18395b : 1, this.f37174c).mo14833a()) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m14840c(obc obcVar) {
        for (int i = 0; i < obcVar.f45239a.size(); i++) {
            int iM18395b = oba.m18395b(obcVar.f45239a.mo18146d(i));
            if (iM18395b == 0) {
                iM18395b = 1;
            }
            if (this.f37172a.mo14837a(iM18395b, this.f37174c).mo14833a()) {
                return true;
            }
        }
        Iterator it = obcVar.f45240b.iterator();
        while (it.hasNext()) {
            if (m14839b((obb) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.ktf
    /* JADX INFO: renamed from: a */
    public final boolean mo14833a() {
        Boolean boolValueOf;
        int iM18395b;
        obd obdVar = this.f37173b;
        int i = obdVar.f45243a;
        if (i == 2) {
            boolValueOf = Boolean.valueOf(m14839b((obb) obdVar.f45244b));
        } else if (i == 3) {
            boolValueOf = Boolean.valueOf(m14840c((obc) obdVar.f45244b));
        } else {
            ktg ktgVar = this.f37172a;
            int i2 = 1;
            if (i == 1 && (iM18395b = oba.m18395b(((Integer) obdVar.f45244b).intValue())) != 0) {
                i2 = iM18395b;
            }
            boolValueOf = Boolean.valueOf(ktgVar.mo14837a(i2, this.f37174c).mo14833a());
        }
        return boolValueOf.booleanValue();
    }
}
