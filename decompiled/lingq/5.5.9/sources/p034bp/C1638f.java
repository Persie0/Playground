package p034bp;

import dm.C5207g;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import mo.C7660h;
import okhttp3.Protocol;

/* JADX INFO: renamed from: bp.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C1638f extends C1640h {

    /* JADX INFO: renamed from: c */
    public static final boolean f9196c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM15246L2 = property == null ? null : C7660h.m15246L2(property);
        boolean z10 = false;
        if (numM15246L2 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                z10 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM15246L2.intValue() >= 9) {
            z10 = true;
        }
        f9196c = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: d */
    public final void mo5318d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C5207g.m11111f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = C1640h.a.m5335a(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: f */
    public final String mo5319f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (!(applicationProtocol == null ? true : C5207g.m11106a(applicationProtocol, ""))) {
                return applicationProtocol;
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }
}
