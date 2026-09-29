package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uvc implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f64445a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f64446b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ src f64447c;

    public /* synthetic */ uvc(boolean z, String str, src srcVar) {
        this.f64445a = z;
        this.f64446b = str;
        this.f64447c = srcVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.f64445a;
        String str = this.f64446b;
        src srcVar = this.f64447c;
        String str2 = (z || !o6d.m17828b(str, srcVar, true, false).f67076a) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        lda.m16130p(messageDigest);
        byte[] bArrDigest = messageDigest.digest(srcVar.f61326i);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = pvc.f56877h;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
