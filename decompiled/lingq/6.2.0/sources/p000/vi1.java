package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class vi1 implements jd9 {

    /* JADX INFO: renamed from: a */
    public static final ti1 f65410a = new ti1();

    /* JADX INFO: renamed from: b */
    public static final boolean f65411b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, ui1.class.getClassLoader());
            if (Conscrypt.isAvailable() && ui1.m22751a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f65411b = z;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: a */
    public final boolean mo206a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: b */
    public final boolean mo207b() {
        return f65411b;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: c */
    public final String mo208c(SSLSocket sSLSocket) {
        if (mo206a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: d */
    public final void mo209d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (mo206a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C2927dg c2927dg = u87.f63590a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) jj5.m14497c(list).toArray(new String[0]));
        }
    }
}
