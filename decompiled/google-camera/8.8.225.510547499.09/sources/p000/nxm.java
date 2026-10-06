package p000;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxm extends nwe {

    /* JADX INFO: renamed from: a */
    private final nxq f44975a;

    public nxm(nxq nxqVar) {
        this.f44975a = nxqVar;
    }

    @Override // p000.nwe
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ nyw mo17768c(byte[] bArr, int i, nxf nxfVar) {
        return nxq.m18123Q(this.f44975a, bArr, 1, i, nxfVar);
    }

    @Override // p000.nzd
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo18116d(nww nwwVar, nxf nxfVar) throws nyb {
        nxq nxqVar = this.f44975a;
        Map map = nxq.f44979aH;
        nxq nxqVarM18138P = nxqVar.m18138P();
        try {
            nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P);
            nzmVarM18260b.mo18252h(nxqVarM18138P, nwx.m17885p(nwwVar), nxfVar);
            nzmVarM18260b.mo18250f(nxqVarM18138P);
            return nxqVarM18138P;
        } catch (nyb e) {
            if (e.f44994a) {
                throw new nyb(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof nyb) {
                throw ((nyb) e2.getCause());
            }
            throw new nyb(e2);
        } catch (nzx e3) {
            throw e3.m18328a();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof nyb) {
                throw ((nyb) e4.getCause());
            }
            throw e4;
        }
    }
}
