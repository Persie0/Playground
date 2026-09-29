package p000;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: renamed from: oi */
/* JADX INFO: loaded from: classes.dex */
public final class C3410oi {

    /* JADX INFO: renamed from: b */
    public static final Object f54362b = new Object();

    /* JADX INFO: renamed from: a */
    public KeyStore f54363a;

    public C3410oi() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f54363a = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            uk9.m22779n(e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18029a(String str) {
        C3410oi c3410oi = new C3410oi();
        synchronized (f54362b) {
            try {
                if (c3410oi.m18032d(str)) {
                    return false;
                }
                m18030b(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18030b(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strM23449b = vna.m23449b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strM23449b, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized C3373ni m18031c(String str) {
        C3373ni c3373ni;
        c3373ni = new C3373ni(vna.m23449b(str), this.f54363a);
        byte[] bArrM15648a = kq7.m15648a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrM15648a, c3373ni.mo9871b(c3373ni.mo9870a(bArrM15648a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return c3373ni;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m18032d(String str) {
        String strM23449b;
        strM23449b = vna.m23449b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("oi", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f54363a = keyStore;
                keyStore.load(null);
                return this.f54363a.containsAlias(strM23449b);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        }
        return this.f54363a.containsAlias(strM23449b);
    }
}
