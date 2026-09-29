package p124fp;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: fp.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C5626w extends C5604a {

    /* JADX INFO: renamed from: k */
    public final Socket f34473k;

    public C5626w(Socket socket) {
        this.f34473k = socket;
    }

    @Override // p124fp.C5604a
    /* JADX INFO: renamed from: j */
    public final IOException mo11918j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p124fp.C5604a
    /* JADX INFO: renamed from: k */
    public final void mo11919k() {
        Socket socket = this.f34473k;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (!C5617n.m11993e(e10)) {
                throw e10;
            }
            C5618o.f34451a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        } catch (Exception e11) {
            C5618o.f34451a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
