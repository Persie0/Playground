package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: sc */
/* JADX INFO: loaded from: classes.dex */
public final class C3569sc implements nc2 {

    /* JADX INFO: renamed from: c */
    public static final TinkFipsUtil$AlgorithmFipsCompatibility f60645c = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: d */
    public static final List f60646d = Arrays.asList(64);

    /* JADX INFO: renamed from: e */
    public static final byte[] f60647e = new byte[16];

    /* JADX INFO: renamed from: f */
    public static final byte[] f60648f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: a */
    public final pj7 f60649a;

    /* JADX INFO: renamed from: b */
    public final byte[] f60650b;

    public C3569sc(byte[] bArr) throws GeneralSecurityException {
        if (!f60645c.isCompatible()) {
            v63.m23147y("Can not use AES-SIV in FIPS-mode.");
            throw null;
        }
        if (!f60646d.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(wq1.m24123s(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f60650b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f60649a = new pj7(bArrCopyOfRange);
    }

    @Override // p000.nc2
    /* JADX INFO: renamed from: a */
    public final byte[] mo17343a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            v63.m23147y("plaintext too long");
            return null;
        }
        Cipher cipher = (Cipher) ls2.f50068b.f50070a.mo13283r("AES/CTR/NoPadding");
        byte[] bArrM21213c = m21213c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrM21213c.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f60650b, "AES"), new IvParameterSpec(bArr3));
        return AbstractC3184kh.m15213g(bArrM21213c, cipher.doFinal(bArr));
    }

    @Override // p000.nc2
    /* JADX INFO: renamed from: b */
    public final byte[] mo17344b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            v63.m23147y("Ciphertext too short.");
            return null;
        }
        Cipher cipher = (Cipher) ls2.f50068b.f50070a.mo13283r("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f60650b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, m21213c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m21213c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrM15206N;
        int length = bArr.length;
        pj7 pj7Var = this.f60649a;
        if (length == 0) {
            return pj7Var.mo18047a(16, f60648f);
        }
        byte[] bArrMo18047a = pj7Var.mo18047a(16, f60647e);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrMo18047a = AbstractC3184kh.m15206N(bna.m3920I(bArrMo18047a), pj7Var.mo18047a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrMo18047a.length) {
                C3386nv.m17626m("xorEnd requires a.length >= b.length");
                return null;
            }
            int length2 = bArr3.length - bArrMo18047a.length;
            bArrM15206N = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < bArrMo18047a.length; i2++) {
                int i3 = length2 + i2;
                bArrM15206N[i3] = (byte) (bArrM15206N[i3] ^ bArrMo18047a[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                C3386nv.m17626m("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrM15206N = AbstractC3184kh.m15206N(bArrCopyOf, bna.m3920I(bArrMo18047a));
        }
        return pj7Var.mo18047a(16, bArrM15206N);
    }
}
