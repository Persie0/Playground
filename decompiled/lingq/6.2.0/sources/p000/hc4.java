package p000;

import android.util.Base64;
import com.iterable.iterableapi.C1207c;
import com.iterable.iterableapi.IterableDataEncryptor$DecryptionException;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hc4 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42168a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1207c f42169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f42170c;

    public /* synthetic */ hc4(C1207c c1207c, String str, int i) {
        this.f42168a = i;
        this.f42169b = c1207c;
        this.f42170c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        byte[] bArrDoFinal;
        int i = this.f42168a;
        String str = this.f42170c;
        C1207c c1207c = this.f42169b;
        switch (i) {
            case 0:
                c1207c.getClass();
                try {
                    byte[] bArrDecode = Base64.decode(str, 2);
                    boolean z = bArrDecode[0] == 1;
                    int i2 = bArrDecode[1] + 2;
                    byte[] bArrM20831Y = AbstractC3550rv.m20831Y(bArrDecode, 2, i2);
                    byte[] bArrM20831Y2 = AbstractC3550rv.m20831Y(bArrDecode, i2, bArrDecode.length);
                    if (z) {
                        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                        cipher.init(2, C1207c.m6902c(), new GCMParameterSpec(128, bArrM20831Y));
                        bArrDoFinal = cipher.doFinal(bArrM20831Y2);
                        bArrDoFinal.getClass();
                    } else {
                        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        cipher2.init(2, C1207c.m6902c(), new IvParameterSpec(bArrM20831Y));
                        bArrDoFinal = cipher2.doFinal(bArrM20831Y2);
                        bArrDoFinal.getClass();
                    }
                    return new String(bArrDoFinal, yu0.f70463a);
                } catch (IterableDataEncryptor$DecryptionException e) {
                    throw e;
                } catch (Exception e2) {
                    eh0.m11136q("IterableDataEncryptor", "Decryption failed", e2);
                    throw new IterableDataEncryptor$DecryptionException("Failed to decrypt data", e2);
                }
            default:
                c1207c.getClass();
                if (str == null) {
                    return null;
                }
                try {
                    byte[] bytes = str.getBytes(yu0.f70463a);
                    bytes.getClass();
                    Cipher cipher3 = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher3.init(1, C1207c.m6902c());
                    byte[] iv = cipher3.getIV();
                    byte[] bArrDoFinal2 = cipher3.doFinal(bytes);
                    bArrDoFinal2.getClass();
                    iv.getClass();
                    byte[] bArr = new byte[iv.length + 2 + bArrDoFinal2.length];
                    bArr[0] = 1;
                    bArr[1] = (byte) iv.length;
                    System.arraycopy(iv, 0, bArr, 2, iv.length);
                    System.arraycopy(bArrDoFinal2, 0, bArr, iv.length + 2, bArrDoFinal2.length);
                    return Base64.encodeToString(bArr, 2);
                } catch (Exception e3) {
                    eh0.m11136q("IterableDataEncryptor", "Encryption failed", e3);
                    throw e3;
                }
        }
    }
}
