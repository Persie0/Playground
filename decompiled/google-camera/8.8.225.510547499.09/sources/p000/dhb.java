package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dhb {

    /* JADX INFO: renamed from: b */
    private final long f11025b;

    /* JADX INFO: renamed from: c */
    private final long f11026c;

    /* JADX INFO: renamed from: d */
    private final mrm f11027d;

    /* JADX INFO: renamed from: g */
    private final int f11030g;

    /* JADX INFO: renamed from: e */
    private final List f11028e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final List f11029f = new ArrayList();

    /* JADX INFO: renamed from: a */
    public mrm f11024a = mqu.f41450a;

    public dhb(int i, long j, long j2, mrm mrmVar) {
        this.f11030g = i;
        this.f11025b = j;
        this.f11026c = j2;
        this.f11027d = mrmVar;
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m6141a(njf njfVar) {
        this.f11029f.add(njfVar);
    }

    /* JADX INFO: renamed from: b */
    final synchronized void m6142b(long j) {
        this.f11028e.add(Long.valueOf(j - this.f11026c));
    }

    /* JADX INFO: renamed from: c */
    final synchronized njg m6143c(long j) {
        njg njgVar;
        nxl nxlVarM18137O = njg.f42906j.m18137O();
        int i = this.f11030g;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        njg njgVar2 = (njg) nxqVar;
        njgVar2.f42909b = i - 1;
        njgVar2.f42908a |= 1;
        long j2 = this.f11026c - this.f11025b;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        njg njgVar3 = (njg) nxqVar2;
        njgVar3.f42908a |= 2;
        njgVar3.f42910c = j2;
        List list = this.f11028e;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        njg njgVar4 = (njg) nxlVarM18137O.f44974b;
        nxx nxxVar = njgVar4.f42912e;
        if (!nxxVar.mo17770c()) {
            njgVar4.f42912e = nxq.m18126T(nxxVar);
        }
        nwb.m17749e(list, njgVar4.f42912e);
        long j3 = j - this.f11026c;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        njg njgVar5 = (njg) nxqVar3;
        njgVar5.f42908a |= 16;
        njgVar5.f42914g = j3;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        njg njgVar6 = (njg) nxlVarM18137O.f44974b;
        njgVar6.f42915h = 2;
        njgVar6.f42908a |= 32;
        if (this.f11027d.mo16813g()) {
            nxl nxlVarM18137O2 = nht.f42542e.m18137O();
            float f = ((fkg) this.f11027d.mo16809c()).f22371b;
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nht nhtVar = (nht) nxlVarM18137O2.f44974b;
            nhtVar.f42544a |= 2;
            nhtVar.f42546c = f;
            float f2 = ((fkg) this.f11027d.mo16809c()).f22372c;
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nht nhtVar2 = (nht) nxlVarM18137O2.f44974b;
            nhtVar2.f42544a |= 1;
            nhtVar2.f42545b = f2;
            float f3 = ((fkg) this.f11027d.mo16809c()).f22370a;
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nht nhtVar3 = (nht) nxlVarM18137O2.f44974b;
            nhtVar3.f42544a |= 4;
            nhtVar3.f42547d = f3;
            nht nhtVar4 = (nht) nxlVarM18137O2.mo18103l();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            njg njgVar7 = (njg) nxlVarM18137O.f44974b;
            nhtVar4.getClass();
            njgVar7.f42913f = nhtVar4;
            njgVar7.f42908a |= 8;
        }
        if (this.f11024a.mo16813g()) {
            long jLongValue = ((Long) this.f11024a.mo16809c()).longValue() - this.f11026c;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            njg njgVar8 = (njg) nxlVarM18137O.f44974b;
            njgVar8.f42908a |= 4;
            njgVar8.f42911d = jLongValue;
        }
        if (!this.f11029f.isEmpty()) {
            List list2 = this.f11029f;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            njg njgVar9 = (njg) nxlVarM18137O.f44974b;
            nxw nxwVar = njgVar9.f42916i;
            if (!nxwVar.mo17770c()) {
                njgVar9.f42916i = nxq.m18125S(nxwVar);
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                njgVar9.f42916i.mo18148g(((njf) it.next()).f42905d);
            }
        }
        njgVar = (njg) nxlVarM18137O.mo18103l();
        njgVar.f42912e.size();
        this.f11029f.size();
        return njgVar;
    }
}
