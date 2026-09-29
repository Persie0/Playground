package p261m9;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import p069da.C5112a;
import p479xa.C10151t;

/* JADX INFO: renamed from: m9.r */
/* JADX INFO: loaded from: classes.dex */
public final class C7517r {

    /* JADX INFO: renamed from: a */
    public final C10151t f41511a = new C10151t(10);

    /* JADX INFO: renamed from: a */
    public final Metadata m15020a(C7504e c7504e, C5112a.a aVar) throws IOException {
        C10151t c10151t = this.f41511a;
        Metadata metadataM10891k0 = null;
        int i10 = 0;
        while (true) {
            try {
                c7504e.mo14994c(c10151t.f51438a, 0, 10, false);
                c10151t.m19124E(0);
                if (c10151t.m19147v() != 4801587) {
                    break;
                }
                c10151t.m19125F(3);
                int iM19144s = c10151t.m19144s();
                int i11 = iM19144s + 10;
                if (metadataM10891k0 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(c10151t.f51438a, 0, bArr, 0, 10);
                    c7504e.mo14994c(bArr, 10, iM19144s, false);
                    metadataM10891k0 = new C5112a(aVar).m10891k0(bArr, i11);
                } else {
                    c7504e.m15001n(iM19144s, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        c7504e.f41479f = 0;
        c7504e.m15001n(i10, false);
        return metadataM10891k0;
    }
}
