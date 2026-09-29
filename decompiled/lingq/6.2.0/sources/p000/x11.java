package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class x11 implements z11 {

    /* JADX INFO: renamed from: a */
    public static final TinkFipsUtil$AlgorithmFipsCompatibility f67626a = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    public x11() throws GeneralSecurityException {
        if (f67626a.isCompatible()) {
            return;
        }
        v63.m23147y("Can not use AES-CMAC in FIPS-mode.");
        throw null;
    }
}
