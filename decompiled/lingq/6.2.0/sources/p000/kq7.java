package p000;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq7 {

    /* JADX INFO: renamed from: a */
    public static final C2932dl f48337a = new C2932dl(4);

    /* JADX INFO: renamed from: a */
    public static byte[] m15648a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f48337a.get()).nextBytes(bArr);
        return bArr;
    }
}
