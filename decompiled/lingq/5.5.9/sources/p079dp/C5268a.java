package p079dp;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p385sf.C9000b;

/* JADX INFO: renamed from: dp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5268a extends ProxySelector {

    /* JADX INFO: renamed from: a */
    public static final C5268a f33363a = new C5268a();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            return C9000b.m17251q(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
