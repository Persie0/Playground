package p057cp;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* JADX INFO: renamed from: cp.k */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4997k {
    /* JADX INFO: renamed from: a */
    boolean mo10690a(SSLSocket sSLSocket);

    /* JADX INFO: renamed from: b */
    String mo10691b(SSLSocket sSLSocket);

    /* JADX INFO: renamed from: c */
    void mo10692c(SSLSocket sSLSocket, String str, List<? extends Protocol> list);

    boolean isSupported();
}
