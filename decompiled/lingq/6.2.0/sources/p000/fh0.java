package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class fh0 implements jd9 {

    /* JADX INFO: renamed from: a */
    public static final dh0 f39098a = new dh0();

    /* JADX INFO: renamed from: b */
    public static final boolean f39099b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, eh0.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f39099b = z;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: a */
    public final boolean mo206a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: b */
    public final boolean mo207b() {
        return f39099b;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: c */
    public final String mo208c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: d */
    public final void mo209d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (mo206a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C2927dg c2927dg = u87.f63590a;
            parameters.setApplicationProtocols((String[]) jj5.m14497c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
