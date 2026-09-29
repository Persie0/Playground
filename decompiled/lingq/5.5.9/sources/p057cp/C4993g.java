package p057cp;

import dm.C5207g;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p034bp.C1635c;
import p034bp.C1640h;

/* JADX INFO: renamed from: cp.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C4993g implements InterfaceC4997k {

    /* JADX INFO: renamed from: a */
    public static final a f32578a = new a();

    /* JADX INFO: renamed from: cp.g$a */
    public static final class a implements C4996j.a {
        @Override // p057cp.C4996j.a
        /* JADX INFO: renamed from: a */
        public final boolean mo10694a(SSLSocket sSLSocket) {
            boolean z10 = C1635c.f9183d;
            return C1635c.a.m5328a() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // p057cp.C4996j.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC4997k mo10695b(SSLSocket sSLSocket) {
            return new C4993g();
        }
    }

    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: a */
    public final boolean mo10690a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: b */
    public final String mo10691b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : C5207g.m11106a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: c */
    public final void mo10692c(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C5207g.m11111f(list, "protocols");
        if (mo10690a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C1640h c1640h = C1640h.f9199a;
            Object[] array = C1640h.a.m5335a(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p057cp.InterfaceC4997k
    public final boolean isSupported() {
        boolean z10 = C1635c.f9183d;
        return C1635c.f9183d;
    }
}
