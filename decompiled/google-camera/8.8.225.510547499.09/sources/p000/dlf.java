package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dlf {

    /* JADX INFO: renamed from: a */
    public final ikw f11929a;

    /* JADX INFO: renamed from: b */
    public final Map f11930b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map f11931c = new HashMap();

    /* JADX INFO: renamed from: d */
    public int f11932d;

    /* JADX INFO: renamed from: e */
    public final int f11933e;

    public dlf(ikw ikwVar, int i) {
        this.f11929a = ikwVar;
        this.f11933e = i;
    }

    /* JADX INFO: renamed from: a */
    public final njt m6334a() {
        if (this.f11933e == 2) {
            mpw.m16775n(new ceu(this, 6));
        }
        nxl nxlVarM18137O = njt.f43078i.m18137O();
        int i = this.f11929a.f31412u;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        njt njtVar = (njt) nxqVar;
        njtVar.f43080a |= 1;
        njtVar.f43081b = i;
        int i2 = this.f11933e;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        njt njtVar2 = (njt) nxqVar2;
        njtVar2.f43082c = i2 - 1;
        njtVar2.f43080a |= 2;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        njt njtVar3 = (njt) nxqVar3;
        njtVar3.f43083d = 1;
        njtVar3.f43080a |= 4;
        int i3 = this.f11932d;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        njt njtVar4 = (njt) nxqVar4;
        njtVar4.f43080a |= 8;
        njtVar4.f43084e = i3;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        njt njtVar5 = (njt) nxlVarM18137O.f44974b;
        njtVar5.f43080a |= 16;
        njtVar5.f43087h = 2;
        Iterator it = this.f11930b.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            dle dleVar = (dle) this.f11930b.get(Integer.valueOf(iIntValue));
            nxl nxlVarM18137O2 = njr.f43065g.m18137O();
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar5 = nxlVarM18137O2.f44974b;
            njr njrVar = (njr) nxqVar5;
            njrVar.f43067a |= 1;
            njrVar.f43068b = iIntValue;
            int i4 = dleVar.f11925a;
            if (!nxqVar5.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar6 = nxlVarM18137O2.f44974b;
            njr njrVar2 = (njr) nxqVar6;
            njrVar2.f43067a |= 2;
            njrVar2.f43069c = i4;
            int i5 = dleVar.f11926b;
            if (!nxqVar6.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar7 = nxlVarM18137O2.f44974b;
            njr njrVar3 = (njr) nxqVar7;
            njrVar3.f43067a |= 4;
            njrVar3.f43070d = i5;
            int i6 = dleVar.f11927c;
            if (!nxqVar7.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar8 = nxlVarM18137O2.f44974b;
            njr njrVar4 = (njr) nxqVar8;
            njrVar4.f43067a |= 8;
            njrVar4.f43071e = i6;
            int i7 = dleVar.f11928d;
            if (!nxqVar8.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            njr njrVar5 = (njr) nxlVarM18137O2.f44974b;
            njrVar5.f43067a |= 16;
            njrVar5.f43072f = i7;
            njr njrVar6 = (njr) nxlVarM18137O2.mo18103l();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            njt njtVar6 = (njt) nxlVarM18137O.f44974b;
            njrVar6.getClass();
            nxy nxyVar = njtVar6.f43085f;
            if (!nxyVar.mo17770c()) {
                njtVar6.f43085f = nxq.m18127U(nxyVar);
            }
            njtVar6.f43085f.add(njrVar6);
        }
        Iterator it2 = this.f11931c.keySet().iterator();
        while (it2.hasNext()) {
            int iIntValue2 = ((Integer) it2.next()).intValue();
            nxl nxlVarM18137O3 = njs.f43073d.m18137O();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            njs njsVar = (njs) nxlVarM18137O3.f44974b;
            njsVar.f43075a |= 1;
            njsVar.f43076b = iIntValue2;
            int iIntValue3 = ((Integer) this.f11931c.get(Integer.valueOf(iIntValue2))).intValue();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            njs njsVar2 = (njs) nxlVarM18137O3.f44974b;
            njsVar2.f43075a |= 2;
            njsVar2.f43077c = iIntValue3;
            njs njsVar3 = (njs) nxlVarM18137O3.mo18103l();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            njt njtVar7 = (njt) nxlVarM18137O.f44974b;
            njsVar3.getClass();
            nxy nxyVar2 = njtVar7.f43086g;
            if (!nxyVar2.mo17770c()) {
                njtVar7.f43086g = nxq.m18127U(nxyVar2);
            }
            njtVar7.f43086g.add(njsVar3);
        }
        return (njt) nxlVarM18137O.mo18103l();
    }
}
