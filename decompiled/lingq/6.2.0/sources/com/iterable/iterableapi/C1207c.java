package com.iterable.iterableapi;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.AbstractC3192a;
import p000.cs4;
import p000.eh0;
import p000.fa4;
import p000.gz8;
import p000.xfa;

/* JADX INFO: renamed from: com.iterable.iterableapi.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1207c {

    /* JADX INFO: renamed from: a */
    public static final char[] f13995a = {'t', 'e', 's', 't', '_', 'p', 'a', 's', 's', 'w', 'o', 'r', 'd'};

    /* JADX INFO: renamed from: b */
    public static final cs4 f13996b = AbstractC3192a.m15356a(IterableDataEncryptor$Companion$keyStore$2.f13972b);

    /* JADX INFO: renamed from: a */
    public static xfa m6900a() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("iterable_encryption_key", 3).setBlockModes("GCM", "CBC").setEncryptionPaddings("NoPadding", "PKCS7Padding").build();
            keyGenParameterSpecBuild.getClass();
            keyGenerator.init(keyGenParameterSpecBuild);
            keyGenerator.generateKey();
            return xfa.f68157a;
        } catch (Exception e) {
            eh0.m11136q("IterableDataEncryptor", "Failed to generate key using AndroidKeyStore", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6901b() throws NoSuchAlgorithmException, KeyStoreException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        gz8.m12973e().setEntry("iterable_encryption_key", new KeyStore.SecretKeyEntry(keyGenerator.generateKey()), fa4.m11650l(gz8.m12973e().getType(), "PKCS12") ? new KeyStore.PasswordProtection(f13995a) : null);
    }

    /* JADX INFO: renamed from: c */
    public static SecretKey m6902c() throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        KeyStore.Entry entry = gz8.m12973e().getEntry("iterable_encryption_key", fa4.m11650l(gz8.m12973e().getType(), "PKCS12") ? new KeyStore.PasswordProtection(f13995a) : null);
        entry.getClass();
        SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
        secretKey.getClass();
        return secretKey;
    }
}
