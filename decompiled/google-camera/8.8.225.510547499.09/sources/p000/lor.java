package p000;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lor implements log {

    /* JADX INFO: renamed from: a */
    public final Context f38840a;

    /* JADX INFO: renamed from: b */
    public final ClearcutMetricSnapshotTransmitter f38841b;

    /* JADX INFO: renamed from: c */
    private final msi f38842c;

    /* JADX INFO: renamed from: d */
    private final boolean f38843d;

    /* JADX INFO: renamed from: e */
    private final loo f38844e;

    public lor(Context context, mrm mrmVar, loo looVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.f38840a = context;
        this.f38842c = lku.m15663q(new dfg(context, 19));
        this.f38843d = ((Boolean) mrmVar.mo16811e(false)).booleanValue();
        this.f38844e = looVar;
        this.f38841b = clearcutMetricSnapshotTransmitter;
    }

    @Override // p000.log
    /* JADX INFO: renamed from: a */
    public final nps mo15346a(pat patVar) {
        int i;
        if (this.f38843d) {
            paf pafVar = patVar.f47282g;
            if (pafVar == null) {
                pafVar = paf.f47175l;
            }
            if ((pafVar.f47177a & 1) != 0) {
                return nod.m17553i(this.f38844e.m15783a(), new dvz(this, patVar, 11), not.INSTANCE);
            }
        }
        int i2 = 4;
        if ((patVar.f47276a & 1024) != 0 && ((Boolean) this.f38842c.mo6051a()).booleanValue()) {
            nxl nxlVar = (nxl) patVar.m18143ad(5);
            nxlVar.m18108s(patVar);
            pal palVar = patVar.f47285j;
            if (palVar == null) {
                palVar = pal.f47214n;
            }
            nxy<pak> nxyVar = palVar.f47225j;
            if (!nxyVar.isEmpty()) {
                nxl nxlVarM18137O = pap.f47253c.m18137O();
                pak pakVar = null;
                for (pak pakVar2 : nxyVar) {
                    if (pakVar != null && (i = pakVar.f47213d + 1) != pakVar2.f47212c) {
                        nxlVarM18137O.m18095ay(0);
                        nxlVarM18137O.m18094ax(i);
                    }
                    nxlVarM18137O.m18095ay(pakVar2.f47211b);
                    nxlVarM18137O.m18094ax(pakVar2.f47212c);
                    pakVar = pakVar2;
                }
                if (pakVar != null && (pakVar.f47210a & 4) != 0) {
                    int i3 = pakVar.f47213d + 1;
                    nxlVarM18137O.m18095ay(0);
                    nxlVarM18137O.m18094ax(i3);
                }
                nxl nxlVar2 = (nxl) palVar.m18143ad(5);
                nxlVar2.m18108s(palVar);
                if (!nxlVar2.f44974b.m18142ac()) {
                    nxlVar2.mo18106p();
                }
                ((pal) nxlVar2.f44974b).f47225j = nzg.f45063b;
                if (!nxlVar2.f44974b.m18142ac()) {
                    nxlVar2.mo18106p();
                }
                pal palVar2 = (pal) nxlVar2.f44974b;
                pap papVar = (pap) nxlVarM18137O.mo18103l();
                papVar.getClass();
                palVar2.f47224i = papVar;
                palVar2.f47216a |= 128;
                palVar = (pal) nxlVar2.mo18103l();
            }
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            pat patVar2 = (pat) nxlVar.f44974b;
            palVar.getClass();
            patVar2.f47285j = palVar;
            patVar2.f47276a |= 1024;
            patVar = (pat) nxlVar.mo18103l();
        }
        return nod.m17554j(this.f38844e.m15783a(), new cqc(this, patVar, i2), not.INSTANCE);
    }

    @Override // p000.log
    /* JADX INFO: renamed from: b */
    public final oyo mo15347b() {
        return new oyo(9);
    }
}
