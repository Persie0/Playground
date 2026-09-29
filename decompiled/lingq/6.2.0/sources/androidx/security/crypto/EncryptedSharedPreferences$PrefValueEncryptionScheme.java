package androidx.security.crypto;

import java.security.GeneralSecurityException;
import p000.thb;
import p000.xi4;

/* JADX INFO: loaded from: classes.dex */
public enum EncryptedSharedPreferences$PrefValueEncryptionScheme {
    AES256_GCM("AES256_GCM");

    private final String mAeadKeyTemplateName;

    EncryptedSharedPreferences$PrefValueEncryptionScheme(String str) {
        this.mAeadKeyTemplateName = str;
    }

    public xi4 getKeyTemplate() throws GeneralSecurityException {
        return thb.m22055n(this.mAeadKeyTemplateName);
    }
}
