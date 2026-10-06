package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class lnx {

    /* JADX INFO: renamed from: a */
    private final pas f38791a;

    public lnx(pas pasVar) {
        this.f38791a = pasVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo15774a(String str);

    /* JADX INFO: renamed from: b */
    public abstract pas mo15775b(Long l);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo15776c();

    /* JADX INFO: renamed from: d */
    public final pas m15778d() {
        pas pasVarM15779e = m15779e(null);
        nxl nxlVar = (nxl) pasVarM15779e.m18143ad(5);
        nxlVar.m18108s(pasVarM15779e);
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        pas pasVar = (pas) nxlVar.f44974b;
        pas pasVar2 = pas.f47269d;
        pasVar.f47271a |= 2;
        pasVar.f47272b = -1L;
        return (pas) nxlVar.mo18103l();
    }

    /* JADX INFO: renamed from: e */
    public final pas m15779e(Long l) {
        pas pasVar = this.f38791a;
        int iM15629Y = lku.m15629Y(pasVar.f47273c);
        if (iM15629Y == 0 || iM15629Y != 5) {
            return pasVar;
        }
        if (l == null || l.longValue() == this.f38791a.f47272b) {
            return this.f38791a;
        }
        nxl nxlVarM18137O = pas.f47269d.m18137O();
        int iM15629Y2 = lku.m15629Y(this.f38791a.f47273c);
        if (iM15629Y2 == 0) {
            iM15629Y2 = 1;
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        pas pasVar2 = (pas) nxlVarM18137O.f44974b;
        pasVar2.f47273c = iM15629Y2 - 1;
        pasVar2.f47271a |= 4;
        long jLongValue = l.longValue();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        pas pasVar3 = (pas) nxlVarM18137O.f44974b;
        pasVar3.f47271a |= 2;
        pasVar3.f47272b = jLongValue;
        return (pas) nxlVarM18137O.mo18103l();
    }
}
