package p000;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nwe implements nzd {
    static {
        nxf nxfVar = nxf.f44904a;
    }

    /* JADX INFO: renamed from: e */
    private static final void m17765e(nyw nywVar) throws nyb {
        if (nywVar != null && !nywVar.mo18098cz()) {
            throw nwc.m17756K().m18328a();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, nyw] */
    @Override // p000.nzd
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17766a(InputStream inputStream, nxf nxfVar) throws nyb {
        nww nwwVarM17876I = nww.m17876I(inputStream);
        ?? D = mo18116d(nwwVarM17876I, nxfVar);
        try {
            nwwVarM17876I.mo17839z(0);
            m17765e(D);
            return D;
        } catch (nyb e) {
            throw e;
        }
    }

    @Override // p000.nzd
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17767b(byte[] bArr, int i, nxf nxfVar) throws nyb {
        nyw nywVarMo17768c = mo17768c(bArr, i, nxfVar);
        m17765e(nywVarMo17768c);
        return nywVarMo17768c;
    }

    /* JADX INFO: renamed from: c */
    public nyw mo17768c(byte[] bArr, int i, nxf nxfVar) {
        throw null;
    }
}
