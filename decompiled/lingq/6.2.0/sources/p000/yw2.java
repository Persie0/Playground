package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;

/* JADX INFO: loaded from: classes.dex */
public final class yw2 implements x84 {
    @Override // p000.x84
    /* JADX INFO: renamed from: a */
    public final j88 mo8434a(at4 at4Var) throws IOException {
        String message;
        int i;
        co7 co7Var = (co7) at4Var.f7465i;
        IOException iOException = null;
        int i2 = 0;
        j88 j88VarM3031f = null;
        while (i2 < 3) {
            try {
                if (((i18) at4Var.f7463g).f43339K) {
                    throw new InterruptedIOException("Call was cancelled");
                }
                j88VarM3031f = at4Var.m3031f(co7Var);
                if (!j88VarM3031f.f45200L && (400 > (i = j88VarM3031f.f45204d) || i >= 500)) {
                    j88VarM3031f.close();
                    e = new IOException("Unsuccessful response: " + j88VarM3031f.f45204d);
                }
                return j88VarM3031f;
            } catch (IOException e) {
                e = e;
                if ((e instanceof InterruptedIOException) || ((e instanceof SocketException) && (message = e.getMessage()) != null && vk9.m23380c0(message, "Socket closed", true))) {
                    throw e;
                }
            }
            long j = 1000 * ((long) (1 << i2));
            i2++;
            if (i2 < 3) {
                try {
                    Thread.sleep(j);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Thread was interrupted, likely due to cancellation.");
                }
            }
            iOException = e;
        }
        if (iOException != null) {
            throw iOException;
        }
        j88VarM3031f.getClass();
        return j88VarM3031f;
    }
}
