package p057cp;

import dm.C5207g;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* JADX INFO: renamed from: cp.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C4996j implements InterfaceC4997k {

    /* JADX INFO: renamed from: a */
    public final a f32583a;

    /* JADX INFO: renamed from: b */
    public InterfaceC4997k f32584b;

    /* JADX INFO: renamed from: cp.j$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo10694a(SSLSocket sSLSocket);

        /* JADX INFO: renamed from: b */
        InterfaceC4997k mo10695b(SSLSocket sSLSocket);
    }

    public C4996j(a aVar) {
        this.f32583a = aVar;
    }

    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: a */
    public final boolean mo10690a(SSLSocket sSLSocket) {
        return this.f32583a.mo10694a(sSLSocket);
    }

    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: b */
    public final String mo10691b(SSLSocket sSLSocket) {
        InterfaceC4997k interfaceC4997k;
        synchronized (this) {
            if (this.f32584b == null && this.f32583a.mo10694a(sSLSocket)) {
                this.f32584b = this.f32583a.mo10695b(sSLSocket);
            }
            interfaceC4997k = this.f32584b;
        }
        if (interfaceC4997k == null) {
            return null;
        }
        return interfaceC4997k.mo10691b(sSLSocket);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: c */
    public final void mo10692c(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        InterfaceC4997k interfaceC4997k;
        C5207g.m11111f(list, "protocols");
        synchronized (this) {
            if (this.f32584b == null && this.f32583a.mo10694a(sSLSocket)) {
                this.f32584b = this.f32583a.mo10695b(sSLSocket);
            }
            interfaceC4997k = this.f32584b;
        }
        if (interfaceC4997k == null) {
            return;
        }
        interfaceC4997k.mo10692c(sSLSocket, str, list);
    }

    @Override // p057cp.InterfaceC4997k
    public final boolean isSupported() {
        return true;
    }
}
