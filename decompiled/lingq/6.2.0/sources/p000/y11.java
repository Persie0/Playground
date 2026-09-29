package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class y11 implements z11 {

    /* JADX INFO: renamed from: a */
    public static final TinkFipsUtil$AlgorithmFipsCompatibility f69086a = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public y11() throws GeneralSecurityException {
        if (f69086a.isCompatible()) {
            return;
        }
        v63.m23147y("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
