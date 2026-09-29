package p000;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class m88 implements Closeable {

    /* JADX INFO: renamed from: b */
    public static final l88 f50759b;

    /* JADX INFO: renamed from: a */
    public k88 f50760a;

    static {
        ByteString byteString = ByteString.f54513d;
        byteString.getClass();
        aj0 aj0Var = new aj0();
        aj0Var.m486j0(byteString);
        f50759b = new l88(null, byteString.f54514a.length, aj0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: a */
    public final byte[] m16681a() throws IOException {
        long jMo3001b = mo3001b();
        byte[] th = null;
        if (jMo3001b > 2147483647L) {
            v63.m23133k(wq1.m24116l("Cannot buffer entire body for content length: ", jMo3001b));
            return null;
        }
        hj0 hj0VarMo3003e = mo3003e();
        try {
            byte[] bArrMo499w = hj0VarMo3003e.mo499w();
            try {
                hj0VarMo3003e.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = bArrMo499w;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (hj0VarMo3003e != null) {
                try {
                    hj0VarMo3003e.close();
                } catch (Throwable th4) {
                    lda.m16117c(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jMo3001b == -1 || jMo3001b == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jMo3001b + ") and stream length (" + length + ") disagree");
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo3001b();

    /* JADX INFO: renamed from: c */
    public abstract xv5 mo3002c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        icb.m13766b(mo3003e());
    }

    /* JADX INFO: renamed from: e */
    public abstract hj0 mo3003e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX INFO: renamed from: n */
    public final String m16682n() {
        Charset charsetM24709a;
        hj0 hj0VarMo3003e = mo3003e();
        String th = null;
        try {
            xv5 xv5VarMo3002c = mo3002c();
            if (xv5VarMo3002c == null || (charsetM24709a = xv5.m24709a(xv5VarMo3002c)) == null) {
                charsetM24709a = yu0.f70463a;
            }
            String strMo462K = hj0VarMo3003e.mo462K(kcb.m15115f(hj0VarMo3003e, charsetM24709a));
            try {
                hj0VarMo3003e.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strMo462K;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (hj0VarMo3003e != null) {
                try {
                    hj0VarMo3003e.close();
                } catch (Throwable th4) {
                    lda.m16117c(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
