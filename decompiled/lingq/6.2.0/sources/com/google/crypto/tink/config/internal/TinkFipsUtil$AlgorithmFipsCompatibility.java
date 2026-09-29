package com.google.crypto.tink.config.internal;

import p000.i1a;

/* JADX INFO: loaded from: classes.dex */
public enum TinkFipsUtil$AlgorithmFipsCompatibility {
    ALGORITHM_NOT_FIPS { // from class: com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility.1
        @Override // com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility
        public boolean isCompatible() {
            return !i1a.m13628a();
        }
    },
    ALGORITHM_REQUIRES_BORINGCRYPTO { // from class: com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility.2
        @Override // com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility
        public boolean isCompatible() {
            Boolean bool;
            if (i1a.m13628a()) {
                try {
                    bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                } catch (Exception unused) {
                    i1a.f43355a.info("Conscrypt is not available or does not support checking for FIPS build.");
                    bool = Boolean.FALSE;
                }
                if (!bool.booleanValue()) {
                    return false;
                }
            }
            return true;
        }
    };

    public abstract boolean isCompatible();
}
