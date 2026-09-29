package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: ub */
/* JADX INFO: loaded from: classes.dex */
public final class C3642ub implements InterfaceC3364n9 {

    /* JADX INFO: renamed from: b */
    public static final TinkFipsUtil$AlgorithmFipsCompatibility f63659b = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a */
    public final g64 f63660a;

    public C3642ub(byte[] bArr) throws GeneralSecurityException {
        if (f63659b.isCompatible()) {
            this.f63660a = new g64(bArr);
        } else {
            v63.m23147y("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: a */
    public final byte[] mo9870a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrM15648a = kq7.m15648a(12);
        g64 g64Var = this.f63660a;
        boolean z = g64Var.f40263b;
        if (bArrM15648a.length != 12) {
            v63.m23147y("iv is wrong size");
            return null;
        }
        if (bArr.length > 2147483619) {
            v63.m23147y("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[z ? bArr.length + 28 : bArr.length + 16];
        if (z) {
            System.arraycopy(bArrM15648a, 0, bArr3, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecM12380a = g64.m12380a(bArrM15648a);
        C2932dl c2932dl = g64.f40261d;
        ((Cipher) c2932dl.get()).init(1, g64Var.f40262a, algorithmParameterSpecM12380a);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c2932dl.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) c2932dl.get()).doFinal(bArr, 0, bArr.length, bArr3, z ? 12 : 0);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(ux5.m22989l("encryption failed; GCM tag must be 16 bytes, but got only ", iDoFinal - bArr.length, " bytes"));
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: b */
    public final byte[] mo9871b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        g64 g64Var = this.f63660a;
        boolean z = g64Var.f40263b;
        if (bArrCopyOf.length != 12) {
            v63.m23147y("iv is wrong size");
            return null;
        }
        if (bArr.length < (z ? 28 : 16)) {
            v63.m23147y("ciphertext too short");
            return null;
        }
        if (z && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
            v63.m23147y("iv does not match prepended iv");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecM12380a = g64.m12380a(bArrCopyOf);
        C2932dl c2932dl = g64.f40261d;
        ((Cipher) c2932dl.get()).init(2, g64Var.f40262a, algorithmParameterSpecM12380a);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c2932dl.get()).updateAAD(bArr2);
        }
        int i = z ? 12 : 0;
        int length = bArr.length;
        if (z) {
            length -= 12;
        }
        return ((Cipher) c2932dl.get()).doFinal(bArr, i, length);
    }
}
