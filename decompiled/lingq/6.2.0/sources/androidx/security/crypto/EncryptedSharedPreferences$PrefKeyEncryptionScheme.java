package androidx.security.crypto;

import java.security.GeneralSecurityException;
import p000.thb;
import p000.xi4;

/* JADX INFO: loaded from: classes.dex */
public enum EncryptedSharedPreferences$PrefKeyEncryptionScheme {
    AES256_SIV("AES256_SIV");

    private final String mDeterministicAeadKeyTemplateName;

    EncryptedSharedPreferences$PrefKeyEncryptionScheme(String str) {
        this.mDeterministicAeadKeyTemplateName = str;
    }

    public xi4 getKeyTemplate() throws GeneralSecurityException {
        return thb.m22055n(this.mDeterministicAeadKeyTemplateName);
    }
}
