package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class rj7 implements oj7 {

    /* JADX INFO: renamed from: e */
    public static final TinkFipsUtil$AlgorithmFipsCompatibility f59404e = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a */
    public final qj7 f59405a;

    /* JADX INFO: renamed from: b */
    public final String f59406b;

    /* JADX INFO: renamed from: c */
    public final SecretKeySpec f59407c;

    /* JADX INFO: renamed from: d */
    public final int f59408d;

    public rj7(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        qj7 qj7Var = new qj7(this);
        this.f59405a = qj7Var;
        if (!f59404e.isCompatible()) {
            v63.m23147y("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.f59406b = str;
        this.f59407c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.f59408d = 20;
                break;
            case "HMACSHA224":
                this.f59408d = 28;
                break;
            case "HMACSHA256":
                this.f59408d = 32;
                break;
            case "HMACSHA384":
                this.f59408d = 48;
                break;
            case "HMACSHA512":
                this.f59408d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        qj7Var.get();
    }

    @Override // p000.oj7
    /* JADX INFO: renamed from: a */
    public final byte[] mo18047a(int i, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i > this.f59408d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        qj7 qj7Var = this.f59405a;
        ((Mac) qj7Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) qj7Var.get()).doFinal(), i);
    }
}
