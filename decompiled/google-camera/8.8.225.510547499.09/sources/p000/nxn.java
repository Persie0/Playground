package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxn extends nxl implements nyx {
    public nxn() {
        ivc ivcVar = ivc.f32254c;
        throw null;
    }

    @Override // p000.nxl, p000.nyv
    /* JADX INFO: renamed from: aH, reason: merged with bridge method [inline-methods] */
    public final nxo mo18104m() {
        if (!((nxo) this.f44974b).m18142ac()) {
            return (nxo) this.f44974b;
        }
        ((nxo) this.f44974b).f44976l.m18024e();
        return (nxo) super.mo18104m();
    }

    /* JADX INFO: renamed from: aI */
    public final void m18118aI(long j) {
        if (!this.f44974b.m18142ac()) {
            mo18106p();
        }
        obf obfVar = (obf) this.f44974b;
        obf obfVar2 = obf.f45245n;
        obfVar.m18400f();
        obfVar.f45257k.mo18151f(j);
    }

    /* JADX INFO: renamed from: aJ */
    public final void m18119aJ(ktz ktzVar, Object obj) {
        Map map = nxq.f44979aH;
        if (ktzVar.f37198a != this.f44973a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        if (!this.f44974b.m18142ac()) {
            mo18106p();
        }
        nxh nxhVarM18022c = ((nxo) this.f44974b).f44976l;
        if (nxhVarM18022c.f44912c) {
            nxhVarM18022c = nxhVarM18022c.clone();
            ((nxo) this.f44974b).f44976l = nxhVarM18022c;
        }
        nxp nxpVar = (nxp) ktzVar.f37201d;
        if (nxpVar.m18122a() == oak.ENUM) {
            obj = Integer.valueOf(((nxt) obj).mo14936a());
        }
        nxhVarM18022c.m18029l(nxpVar, obj);
    }

    @Override // p000.nxl
    /* JADX INFO: renamed from: p */
    public final void mo18106p() {
        super.mo18106p();
        if (((nxo) this.f44974b).f44976l != nxh.f44910a) {
            nxo nxoVar = (nxo) this.f44974b;
            nxoVar.f44976l = nxoVar.f44976l.clone();
        }
    }

    public nxn(nxo nxoVar) {
        super(nxoVar);
    }
}
