package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pc2 implements nc2 {

    /* JADX INFO: renamed from: a */
    public final sq5 f55943a;

    /* JADX INFO: renamed from: b */
    public final jj5 f55944b;

    /* JADX INFO: renamed from: c */
    public final jj5 f55945c;

    public pc2(sq5 sq5Var) {
        jj5 jj5Var = lda.f49510c;
        this.f55943a = sq5Var;
        if (((o16) sq5Var.f61250d).f53590a.isEmpty()) {
            this.f55944b = jj5Var;
            this.f55945c = jj5Var;
            return;
        }
        b66 b66VarM4343a = c66.m4342b().m4343a();
        lda.m16101A(sq5Var);
        b66VarM4343a.getClass();
        this.f55944b = jj5Var;
        this.f55945c = jj5Var;
    }

    @Override // p000.nc2
    /* JADX INFO: renamed from: a */
    public final byte[] mo17343a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        jj5 jj5Var = this.f55944b;
        hk7 hk7Var = (hk7) this.f55943a.f61249c;
        try {
            byte[] bArr3 = hk7Var.f42536c;
            byte[] bArrM15213g = AbstractC3184kh.m15213g(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((nc2) hk7Var.f42535b).mo17343a(bArr, bArr2));
            int i = hk7Var.f42539f;
            jj5Var.getClass();
            return bArrM15213g;
        } catch (GeneralSecurityException e) {
            jj5Var.getClass();
            throw e;
        }
    }

    @Override // p000.nc2
    /* JADX INFO: renamed from: b */
    public final byte[] mo17344b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        sq5 sq5Var = this.f55943a;
        jj5 jj5Var = this.f55945c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = sq5Var.m21577s(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrMo17344b = ((nc2) ((hk7) it.next()).f42535b).mo17344b(bArrCopyOfRange, bArr2);
                    jj5Var.getClass();
                    return bArrMo17344b;
                } catch (GeneralSecurityException e) {
                    qc2.f57560a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = sq5Var.m21577s(AbstractC3695vr.f65810e).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrMo17344b2 = ((nc2) ((hk7) it2.next()).f42535b).mo17344b(bArr, bArr2);
                jj5Var.getClass();
                return bArrMo17344b2;
            } catch (GeneralSecurityException unused) {
            }
        }
        jj5Var.getClass();
        v63.m23147y("decryption failed");
        return null;
    }
}
