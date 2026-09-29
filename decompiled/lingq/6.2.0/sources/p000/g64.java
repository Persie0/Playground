package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class g64 {

    /* JADX INFO: renamed from: c */
    public static final TinkFipsUtil$AlgorithmFipsCompatibility f40260c = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: d */
    public static final C2932dl f40261d = new C2932dl(3);

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f40262a;

    /* JADX INFO: renamed from: b */
    public final boolean f40263b;

    public g64(byte[] bArr) throws GeneralSecurityException {
        if (!f40260c.isCompatible()) {
            v63.m23147y("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        vna.m23448a(bArr.length);
        this.f40262a = new SecretKeySpec(bArr, "AES");
        this.f40263b = true;
    }

    /* JADX INFO: renamed from: a */
    public static AlgorithmParameterSpec m12380a(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i = tma.f62543a;
            Integer numM24285b = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : x4d.m24285b();
            if ((numM24285b != null ? numM24285b.intValue() : -1) <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
