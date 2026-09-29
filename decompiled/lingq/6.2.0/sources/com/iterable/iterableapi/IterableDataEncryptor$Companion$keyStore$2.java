package com.iterable.iterableapi;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import kotlin.jvm.internal.Lambda;
import p000.eh0;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final class IterableDataEncryptor$Companion$keyStore$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final IterableDataEncryptor$Companion$keyStore$2 f13972b = new IterableDataEncryptor$Companion$keyStore$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (Exception e) {
            eh0.m11136q("IterableDataEncryptor", "Failed to initialize AndroidKeyStore", e);
            KeyStore keyStore2 = KeyStore.getInstance("PKCS12");
            keyStore2.load(null, C1207c.f13995a);
            return keyStore2;
        }
    }
}
