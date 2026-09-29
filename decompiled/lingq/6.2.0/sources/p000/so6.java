package p000;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class so6 extends ProxySelector {

    /* JADX INFO: renamed from: a */
    public static final so6 f61110a = new so6();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return vz1.m23604J(Proxy.NO_PROXY);
        }
        C3386nv.m17626m("uri must not be null");
        return null;
    }
}
