package p493xo;

import dm.C5207g;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.connection.C8077a;
import p467wo.C9988c;
import p467wo.C9990e;
import so.C9101s;
import so.C9106x;
import so.InterfaceC9097o;

/* JADX INFO: renamed from: xo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C10266f {

    /* JADX INFO: renamed from: a */
    public final C9990e f51697a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC9097o> f51698b;

    /* JADX INFO: renamed from: c */
    public final int f51699c;

    /* JADX INFO: renamed from: d */
    public final C9988c f51700d;

    /* JADX INFO: renamed from: e */
    public final C9101s f51701e;

    /* JADX INFO: renamed from: f */
    public final int f51702f;

    /* JADX INFO: renamed from: g */
    public final int f51703g;

    /* JADX INFO: renamed from: h */
    public final int f51704h;

    /* JADX INFO: renamed from: i */
    public int f51705i;

    /* JADX WARN: Multi-variable type inference failed */
    public C10266f(C9990e c9990e, List<? extends InterfaceC9097o> list, int i10, C9988c c9988c, C9101s c9101s, int i11, int i12, int i13) {
        C5207g.m11111f(c9990e, "call");
        C5207g.m11111f(list, "interceptors");
        C5207g.m11111f(c9101s, "request");
        this.f51697a = c9990e;
        this.f51698b = list;
        this.f51699c = i10;
        this.f51700d = c9988c;
        this.f51701e = c9101s;
        this.f51702f = i11;
        this.f51703g = i12;
        this.f51704h = i13;
    }

    /* JADX INFO: renamed from: b */
    public static C10266f m19233b(C10266f c10266f, int i10, C9988c c9988c, C9101s c9101s, int i11) {
        if ((i11 & 1) != 0) {
            i10 = c10266f.f51699c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            c9988c = c10266f.f51700d;
        }
        C9988c c9988c2 = c9988c;
        if ((i11 & 4) != 0) {
            c9101s = c10266f.f51701e;
        }
        C9101s c9101s2 = c9101s;
        int i13 = (i11 & 8) != 0 ? c10266f.f51702f : 0;
        int i14 = (i11 & 16) != 0 ? c10266f.f51703g : 0;
        int i15 = (i11 & 32) != 0 ? c10266f.f51704h : 0;
        c10266f.getClass();
        C5207g.m11111f(c9101s2, "request");
        return new C10266f(c10266f.f51697a, c10266f.f51698b, i12, c9988c2, c9101s2, i13, i14, i15);
    }

    /* JADX INFO: renamed from: a */
    public final C8077a m19234a() {
        C9988c c9988c = this.f51700d;
        if (c9988c == null) {
            return null;
        }
        return c9988c.f50746g;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: c */
    public final C9106x m19235c(C9101s c9101s) throws IOException {
        C5207g.m11111f(c9101s, "request");
        List<InterfaceC9097o> list = this.f51698b;
        int size = list.size();
        int i10 = this.f51699c;
        if (!(i10 < size)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f51705i++;
        C9988c c9988c = this.f51700d;
        if (c9988c != null) {
            if (!c9988c.f50742c.m18567b(c9101s.f47542a)) {
                throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (!(this.f51705i == 1)) {
                throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        C10266f c10266fM19233b = m19233b(this, i11, null, c9101s, 58);
        InterfaceC9097o interfaceC9097o = list.get(i10);
        C9106x c9106xMo9450a = interfaceC9097o.mo9450a(c10266fM19233b);
        if (c9106xMo9450a == null) {
            throw new NullPointerException("interceptor " + interfaceC9097o + " returned null");
        }
        if (c9988c != null) {
            if (!(i11 >= list.size() || c10266fM19233b.f51705i == 1)) {
                throw new IllegalStateException(("network interceptor " + interfaceC9097o + " must call proceed() exactly once").toString());
            }
        }
        if (c9106xMo9450a.f47569g != null) {
            return c9106xMo9450a;
        }
        throw new IllegalStateException(("interceptor " + interfaceC9097o + " returned a response with no body").toString());
    }
}
