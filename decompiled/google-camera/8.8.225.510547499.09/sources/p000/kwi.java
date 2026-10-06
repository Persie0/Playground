package p000;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwi {

    /* JADX INFO: renamed from: a */
    public static final nxf f37510a = nxf.m18012b();

    /* JADX INFO: renamed from: a */
    public static kwe m14943a(ByteBuffer byteBuffer, nxf nxfVar) throws nyb {
        if (byteBuffer != null) {
            try {
                kwe kweVar = kwe.f37496e;
                nww nwwVarM17877J = nww.m17877J(byteBuffer);
                nxq nxqVarM18138P = kweVar.m18138P();
                try {
                    try {
                        try {
                            nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P);
                            nzmVarM18260b.mo18252h(nxqVarM18138P, nwx.m17885p(nwwVarM17877J), nxfVar);
                            nzmVarM18260b.mo18250f(nxqVarM18138P);
                            nxq.m18132ae(nxqVarM18138P);
                            nxq.m18132ae(nxqVarM18138P);
                            return (kwe) nxqVarM18138P;
                        } catch (IOException e) {
                            if (e.getCause() instanceof nyb) {
                                throw ((nyb) e.getCause());
                            }
                            throw new nyb(e);
                        }
                    } catch (nyb e2) {
                        if (e2.f44994a) {
                            throw new nyb(e2);
                        }
                        throw e2;
                    }
                } catch (nzx e3) {
                    throw e3.m18328a();
                } catch (RuntimeException e4) {
                    if (e4.getCause() instanceof nyb) {
                        throw ((nyb) e4.getCause());
                    }
                    throw e4;
                }
            } catch (Exception e5) {
            }
        }
        return kwe.f37496e;
    }
}
