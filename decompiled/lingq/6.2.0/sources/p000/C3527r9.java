package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: r9 */
/* JADX INFO: loaded from: classes.dex */
public final class C3527r9 implements InterfaceC3364n9 {

    /* JADX INFO: renamed from: a */
    public final sq5 f58926a;

    /* JADX INFO: renamed from: b */
    public final jj5 f58927b;

    /* JADX INFO: renamed from: c */
    public final jj5 f58928c;

    public C3527r9(sq5 sq5Var) {
        jj5 jj5Var = lda.f49510c;
        this.f58926a = sq5Var;
        if (((o16) sq5Var.f61250d).f53590a.isEmpty()) {
            this.f58927b = jj5Var;
            this.f58928c = jj5Var;
            return;
        }
        b66 b66VarM4343a = c66.m4342b().m4343a();
        lda.m16101A(sq5Var);
        b66VarM4343a.getClass();
        this.f58927b = jj5Var;
        this.f58928c = jj5Var;
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: a */
    public final byte[] mo9870a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        jj5 jj5Var = this.f58927b;
        hk7 hk7Var = (hk7) this.f58926a.f61249c;
        try {
            byte[] bArr3 = hk7Var.f42536c;
            byte[] bArrM15213g = AbstractC3184kh.m15213g(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((InterfaceC3364n9) hk7Var.f42535b).mo9870a(bArr, bArr2));
            int i = hk7Var.f42539f;
            int length = bArr.length;
            jj5Var.getClass();
            return bArrM15213g;
        } catch (GeneralSecurityException e) {
            jj5Var.getClass();
            throw e;
        }
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: b */
    public final byte[] mo9871b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        sq5 sq5Var = this.f58926a;
        jj5 jj5Var = this.f58928c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = sq5Var.m21577s(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrMo9871b = ((InterfaceC3364n9) ((hk7) it.next()).f42535b).mo9871b(bArrCopyOfRange, bArr2);
                    jj5Var.getClass();
                    return bArrMo9871b;
                } catch (GeneralSecurityException e) {
                    C3566s9.f60544a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = sq5Var.m21577s(AbstractC3695vr.f65810e).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrMo9871b2 = ((InterfaceC3364n9) ((hk7) it2.next()).f42535b).mo9871b(bArr, bArr2);
                jj5Var.getClass();
                return bArrMo9871b2;
            } catch (GeneralSecurityException unused) {
            }
        }
        jj5Var.getClass();
        v63.m23147y("decryption failed");
        return null;
    }
}
