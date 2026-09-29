package p057cp;

import dm.C5207g;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import p034bp.C1636d;
import p034bp.C1640h;

/* JADX INFO: renamed from: cp.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C4995i implements InterfaceC4997k {

    /* JADX INFO: renamed from: a */
    public static final a f32582a = new a();

    /* JADX INFO: renamed from: cp.i$a */
    public static final class a implements C4996j.a {
        @Override // p057cp.C4996j.a
        /* JADX INFO: renamed from: a */
        public final boolean mo10694a(SSLSocket sSLSocket) {
            boolean z10 = C1636d.f9185d;
            return C1636d.a.m5331b() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // p057cp.C4996j.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC4997k mo10695b(SSLSocket sSLSocket) {
            return new C4995i();
        }
    }

    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: a */
    public final boolean mo10690a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: b */
    public final String mo10691b(SSLSocket sSLSocket) {
        if (mo10690a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: c */
    public final void mo10692c(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C5207g.m11111f(list, "protocols");
        if (mo10690a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C1640h c1640h = C1640h.f9199a;
            Object[] array = C1640h.a.m5335a(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }

    @Override // p057cp.InterfaceC4997k
    public final boolean isSupported() {
        boolean z10 = C1636d.f9185d;
        return C1636d.f9185d;
    }
}
