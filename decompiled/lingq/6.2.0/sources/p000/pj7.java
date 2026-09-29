package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class pj7 implements oj7 {

    /* JADX INFO: renamed from: d */
    public static final TinkFipsUtil$AlgorithmFipsCompatibility f56317d = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f56318a;

    /* JADX INFO: renamed from: b */
    public final byte[] f56319b;

    /* JADX INFO: renamed from: c */
    public final byte[] f56320c;

    public pj7(byte[] bArr) throws GeneralSecurityException {
        vna.m23448a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f56318a = secretKeySpec;
        if (!f56317d.isCompatible()) {
            v63.m23147y("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) ls2.f50068b.f50070a.mo13283r("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrM3920I = bna.m3920I(cipher.doFinal(new byte[16]));
        this.f56319b = bArrM3920I;
        this.f56320c = bna.m3920I(bArrM3920I);
    }

    @Override // p000.oj7
    /* JADX INFO: renamed from: a */
    public final byte[] mo18047a(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrM15206N;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!f56317d.isCompatible()) {
            v63.m23147y("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) ls2.f50068b.f50070a.mo13283r("AES/ECB/NoPadding");
        cipher.init(1, this.f56318a);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrM15206N = AbstractC3184kh.m15205M(bArr, (iMax - 1) * 16, this.f56319b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                C3386nv.m17626m("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrM15206N = AbstractC3184kh.m15206N(bArrCopyOf, this.f56320c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipher.doFinal(AbstractC3184kh.m15205M(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(AbstractC3184kh.m15206N(bArrM15206N, bArrDoFinal)), i);
    }
}
