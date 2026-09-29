package p057cp;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import dm.C5207g;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import p034bp.C1640h;

/* JADX INFO: renamed from: cp.a */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public final class C4987a implements InterfaceC4997k {
    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: a */
    public final boolean mo10690a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p057cp.InterfaceC4997k
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public final String mo10691b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : C5207g.m11106a(applicationProtocol, "")) {
            applicationProtocol = null;
        }
        return applicationProtocol;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p057cp.InterfaceC4997k
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: c */
    public final void mo10692c(SSLSocket sSLSocket, String str, List<? extends Protocol> list) throws IOException {
        C5207g.m11111f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C1640h c1640h = C1640h.f9199a;
            Object[] array = C1640h.a.m5335a(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // p057cp.InterfaceC4997k
    public final boolean isSupported() {
        C1640h c1640h = C1640h.f9199a;
        return C1640h.a.m5337c() && Build.VERSION.SDK_INT >= 29;
    }
}
