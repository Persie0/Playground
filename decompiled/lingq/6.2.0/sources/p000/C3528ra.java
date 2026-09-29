package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: ra */
/* JADX INFO: loaded from: classes2.dex */
public final class C3528ra {

    /* JADX INFO: renamed from: d */
    public static final TinkFipsUtil$AlgorithmFipsCompatibility f58952d = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: e */
    public static final C3490qa f58953e = new C3490qa(0);

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f58954a;

    /* JADX INFO: renamed from: b */
    public final int f58955b;

    /* JADX INFO: renamed from: c */
    public final int f58956c;

    public C3528ra(int i, byte[] bArr) throws GeneralSecurityException {
        if (!f58952d.isCompatible()) {
            v63.m23147y("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        vna.m23448a(bArr.length);
        this.f58954a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f58953e.get()).getBlockSize();
        this.f58956c = blockSize;
        if (i < 12 || i > blockSize) {
            v63.m23147y("invalid IV size");
            throw null;
        }
        this.f58955b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m20487a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f58953e.get();
        byte[] bArr4 = new byte[this.f58956c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f58955b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f58954a;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        v63.m23147y("stored output's length does not match input's length");
    }
}
