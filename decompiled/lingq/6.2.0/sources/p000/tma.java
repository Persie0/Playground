package p000;

import com.google.crypto.tink.internal.TinkBugException;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class tma {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f62543a = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static int m22236a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static final yk0 m22237b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new TinkBugException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return yk0.m25164a(bArr);
    }
}
