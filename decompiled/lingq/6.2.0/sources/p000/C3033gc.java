package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: gc */
/* JADX INFO: loaded from: classes2.dex */
public final class C3033gc implements InterfaceC3364n9 {

    /* JADX INFO: renamed from: b */
    public static final C3490qa f40511b = new C3490qa(3);

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f40512a;

    public C3033gc(byte[] bArr) throws InvalidAlgorithmParameterException {
        vna.m23448a(bArr.length);
        this.f40512a = new SecretKeySpec(bArr, "AES");
    }

    /* JADX INFO: renamed from: c */
    public static AlgorithmParameterSpec m12470c(int i, byte[] bArr) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i);
            }
            v63.m23147y("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            return null;
        }
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: a */
    public final byte[] mo9870a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            v63.m23147y("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrM15648a = kq7.m15648a(12);
        System.arraycopy(bArrM15648a, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecM12470c = m12470c(bArrM15648a.length, bArrM15648a);
        C3490qa c3490qa = f40511b;
        ((Cipher) c3490qa.get()).init(1, this.f40512a, algorithmParameterSpecM12470c);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c3490qa.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) c3490qa.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(ux5.m22989l("encryption failed; GCM tag must be 16 bytes, but got only ", iDoFinal - bArr.length, " bytes"));
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: b */
    public final byte[] mo9871b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            v63.m23147y("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecM12470c = m12470c(12, bArr);
        C3490qa c3490qa = f40511b;
        ((Cipher) c3490qa.get()).init(2, this.f40512a, algorithmParameterSpecM12470c);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c3490qa.get()).updateAAD(bArr2);
        }
        return ((Cipher) c3490qa.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
