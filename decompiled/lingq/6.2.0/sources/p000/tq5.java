package p000;

import android.security.keystore.KeyGenParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class tq5 {

    /* JADX INFO: renamed from: a */
    public static final Object f62728a;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        f62728a = new Object();
    }
}
