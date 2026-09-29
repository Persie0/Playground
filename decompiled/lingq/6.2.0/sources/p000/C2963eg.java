package p000;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: eg */
/* JADX INFO: loaded from: classes.dex */
public final class C2963eg implements jd9 {
    @Override // p000.jd9
    /* JADX INFO: renamed from: a */
    public final boolean mo206a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: b */
    public final boolean mo207b() {
        C2927dg c2927dg = u87.f63590a;
        return true;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: c */
    public final String mo208c(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null || applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: d */
    public final void mo209d(SSLSocket sSLSocket, String str, List list) throws IOException {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C2927dg c2927dg = u87.f63590a;
            sSLParameters.setApplicationProtocols((String[]) jj5.m14497c(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
