package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nwc implements nyw {

    /* JADX INFO: renamed from: aG */
    public int f44820aG = 0;

    /* JADX INFO: renamed from: K */
    static final nzx m17756K() {
        return new nzx();
    }

    /* JADX INFO: renamed from: G */
    public int mo17757G(nzm nzmVar) {
        throw null;
    }

    @Override // p000.nyw
    /* JADX INFO: renamed from: H */
    public final nwr mo17758H() {
        try {
            int iN = mo18136N();
            nwr nwrVar = nwr.f44839b;
            byte[] bArr = new byte[iN];
            nxb nxbVarM17988ag = nxb.m17988ag(bArr);
            mo17764cy(nxbVarM17988ag);
            return ntw.m17738x(nxbVarM17988ag, bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // p000.nyw
    /* JADX INFO: renamed from: I */
    public final void mo17759I(OutputStream outputStream) {
        nxb nxbVarM17989ah = nxb.m17989ah(outputStream, nxb.m17974S(mo18136N()));
        mo17764cy(nxbVarM17989ah);
        nxbVarM17989ah.mo17942i();
    }

    @Override // p000.nyw
    /* JADX INFO: renamed from: J */
    public final byte[] mo17760J() {
        try {
            byte[] bArr = new byte[mo18136N()];
            nxb nxbVarM17988ag = nxb.m17988ag(bArr);
            mo17764cy(nxbVarM17988ag);
            nxbVarM17988ag.m17997ai();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
