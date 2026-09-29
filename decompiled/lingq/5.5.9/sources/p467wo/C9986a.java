package p467wo;

import dm.C5207g;
import java.io.IOException;
import okhttp3.internal.connection.RouteException;
import p493xo.C10266f;
import sl.C9072e;
import so.C9100r;
import so.C9106x;
import so.InterfaceC9097o;

/* JADX INFO: renamed from: wo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C9986a implements InterfaceC9097o {

    /* JADX INFO: renamed from: a */
    public static final C9986a f50735a = new C9986a();

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // so.InterfaceC9097o
    /* JADX INFO: renamed from: a */
    public final C9106x mo9450a(C10266f c10266f) throws IOException {
        C9990e c9990e = c10266f.f51697a;
        c9990e.getClass();
        synchronized (c9990e) {
            if (!c9990e.f50770J) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!c9990e.f50769I)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!c9990e.f50768H)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            C9072e c9072e = C9072e.f47360a;
        }
        C9989d c9989d = c9990e.f50782i;
        C5207g.m11108c(c9989d);
        C9100r c9100r = c9990e.f50774a;
        C5207g.m11111f(c9100r, "client");
        try {
            C9988c c9988c = new C9988c(c9990e, c9990e.f50778e, c9989d, c9989d.m18566a(c10266f.f51702f, c10266f.f51703g, c10266f.f51704h, c9100r.f47513f, !C5207g.m11106a(c10266f.f51701e.f47543b, "GET")).m15978j(c9100r, c10266f));
            c9990e.f50785l = c9988c;
            c9990e.f50772L = c9988c;
            synchronized (c9990e) {
                c9990e.f50768H = true;
                c9990e.f50769I = true;
            }
            if (c9990e.f50771K) {
                throw new IOException("Canceled");
            }
            return C10266f.m19233b(c10266f, 0, c9988c, null, 61).m19235c(c10266f.f51701e);
        } catch (IOException e10) {
            c9989d.m18568c(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            c9989d.m18568c(e11.f43867b);
            throw e11;
        }
    }
}
