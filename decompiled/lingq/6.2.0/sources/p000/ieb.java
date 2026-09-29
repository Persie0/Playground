package p000;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class ieb {

    /* JADX INFO: renamed from: a */
    public static final SecureRandom f44033a = new SecureRandom();

    /* JADX INFO: renamed from: a */
    public static String m13815a() {
        byte[] bArr = new byte[16];
        f44033a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
