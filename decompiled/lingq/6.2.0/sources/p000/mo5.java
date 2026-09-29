package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mo5 implements jo5 {

    /* JADX INFO: renamed from: a */
    public final sq5 f51634a;

    /* JADX INFO: renamed from: b */
    public final jj5 f51635b;

    /* JADX INFO: renamed from: c */
    public final jj5 f51636c;

    public mo5(sq5 sq5Var) {
        jj5 jj5Var = lda.f49510c;
        this.f51634a = sq5Var;
        if (((o16) sq5Var.f61250d).f53590a.isEmpty()) {
            this.f51635b = jj5Var;
            this.f51636c = jj5Var;
            return;
        }
        b66 b66VarM4343a = c66.f9634b.m4343a();
        lda.m16101A(sq5Var);
        b66VarM4343a.getClass();
        this.f51635b = jj5Var;
        this.f51636c = jj5Var;
    }

    @Override // p000.jo5
    /* JADX INFO: renamed from: a */
    public final void mo14570a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        jj5 jj5Var = this.f51636c;
        if (length <= 5) {
            jj5Var.getClass();
            v63.m23147y("tag too short");
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        sq5 sq5Var = this.f51634a;
        for (hk7 hk7Var : sq5Var.m21577s(bArrCopyOf)) {
            try {
                ((jo5) hk7Var.f42535b).mo14570a(bArrCopyOfRange, hk7Var.f42538e.equals(OutputPrefixType.LEGACY) ? AbstractC3184kh.m15213g(bArr2, no5.f53058b) : bArr2);
                jj5Var.getClass();
                return;
            } catch (GeneralSecurityException e) {
                no5.f53057a.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it = sq5Var.m21577s(AbstractC3695vr.f65810e).iterator();
        while (it.hasNext()) {
            try {
                ((jo5) ((hk7) it.next()).f42535b).mo14570a(bArr, bArr2);
                jj5Var.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        jj5Var.getClass();
        v63.m23147y("invalid MAC");
    }

    @Override // p000.jo5
    /* JADX INFO: renamed from: b */
    public final byte[] mo14571b(byte[] bArr) throws GeneralSecurityException {
        jj5 jj5Var = this.f51635b;
        hk7 hk7Var = (hk7) this.f51634a.f61249c;
        if (hk7Var.f42538e.equals(OutputPrefixType.LEGACY)) {
            bArr = AbstractC3184kh.m15213g(bArr, no5.f53058b);
        }
        try {
            byte[] bArr2 = hk7Var.f42536c;
            byte[] bArrM15213g = AbstractC3184kh.m15213g(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((jo5) hk7Var.f42535b).mo14571b(bArr));
            int i = hk7Var.f42539f;
            jj5Var.getClass();
            return bArrM15213g;
        } catch (GeneralSecurityException e) {
            jj5Var.getClass();
            throw e;
        }
    }
}
