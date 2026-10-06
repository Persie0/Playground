package p000;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgi implements bgx {
    @Override // p000.bgx
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2414a(Object obj) {
        Throwable th = (Throwable) obj;
        ThreadLocal threadLocal = bme.f3752a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        blx.m2681b("Unable to load composition.", th);
    }
}
