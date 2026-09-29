package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class kd9 extends C3774xw {

    /* JADX INFO: renamed from: n */
    public final Socket f47068n;

    public kd9(Socket socket) {
        this.f47068n = socket;
    }

    @Override // p000.C3774xw
    /* JADX INFO: renamed from: j */
    public final IOException mo15138j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p000.C3774xw
    /* JADX INFO: renamed from: k */
    public final void mo12998k() {
        Socket socket = this.f47068n;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!hcb.m13198b(e)) {
                throw e;
            }
            hcb.f42193a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            hcb.f42193a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
