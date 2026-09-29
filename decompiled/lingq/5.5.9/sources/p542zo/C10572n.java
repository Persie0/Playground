package p542zo;

import dm.C5207g;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.internal.connection.C8077a;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.ByteString;
import p124fp.InterfaceC5625v;
import p124fp.InterfaceC5627x;
import p493xo.C10265e;
import p493xo.C10266f;
import p493xo.C10269i;
import p493xo.InterfaceC10264d;
import sl.C9072e;
import so.C9095m;
import so.C9096n;
import so.C9100r;
import so.C9101s;
import so.C9106x;
import to.C9347b;

/* JADX INFO: renamed from: zo.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C10572n implements InterfaceC10264d {

    /* JADX INFO: renamed from: g */
    public static final List<String> f52734g = C9347b.m17705l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h */
    public static final List<String> f52735h = C9347b.m17705l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a */
    public final C8077a f52736a;

    /* JADX INFO: renamed from: b */
    public final C10266f f52737b;

    /* JADX INFO: renamed from: c */
    public final C10562d f52738c;

    /* JADX INFO: renamed from: d */
    public volatile C10574p f52739d;

    /* JADX INFO: renamed from: e */
    public final Protocol f52740e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f52741f;

    public C10572n(C9100r c9100r, C8077a c8077a, C10266f c10266f, C10562d c10562d) {
        C5207g.m11111f(c8077a, "connection");
        this.f52736a = c8077a;
        this.f52737b = c10266f;
        this.f52738c = c10562d;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f52740e = c9100r.f47500N.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: a */
    public final void mo19223a(C9101s c9101s) throws IOException {
        int i10;
        C10574p c10574p;
        boolean z10;
        if (this.f52739d != null) {
            return;
        }
        boolean z11 = c9101s.f47545d != null;
        C9095m c9095m = c9101s.f47544c;
        ArrayList arrayList = new ArrayList((c9095m.f47452a.length / 2) + 4);
        arrayList.add(new C10559a(C10559a.f52631f, c9101s.f47543b));
        ByteString byteString = C10559a.f52632g;
        C9096n c9096n = c9101s.f47542a;
        C5207g.m11111f(c9096n, "url");
        String strM17321b = c9096n.m17321b();
        String strM17323d = c9096n.m17323d();
        if (strM17323d != null) {
            strM17321b = strM17321b + '?' + ((Object) strM17323d);
        }
        arrayList.add(new C10559a(byteString, strM17321b));
        String strM17305a = c9101s.f47544c.m17305a("Host");
        if (strM17305a != null) {
            arrayList.add(new C10559a(C10559a.f52634i, strM17305a));
        }
        arrayList.add(new C10559a(C10559a.f52633h, c9096n.f47455a));
        int length = c9095m.f47452a.length / 2;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            String strM17306f = c9095m.m17306f(i11);
            Locale locale = Locale.US;
            C5207g.m11110e(locale, "US");
            String lowerCase = strM17306f.toLowerCase(locale);
            C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f52734g.contains(lowerCase) || (C5207g.m11106a(lowerCase, "te") && C5207g.m11106a(c9095m.m17309l(i11), "trailers"))) {
                arrayList.add(new C10559a(lowerCase, c9095m.m17309l(i11)));
            }
            i11 = i12;
        }
        C10562d c10562d = this.f52738c;
        c10562d.getClass();
        boolean z12 = !z11;
        synchronized (c10562d.f52675T) {
            synchronized (c10562d) {
                if (c10562d.f52683f > 1073741823) {
                    c10562d.m19547r(ErrorCode.REFUSED_STREAM);
                }
                if (c10562d.f52684g) {
                    throw new ConnectionShutdownException();
                }
                i10 = c10562d.f52683f;
                c10562d.f52683f = i10 + 2;
                c10574p = new C10574p(i10, c10562d, z12, false, null);
                z10 = !z11 || c10562d.f52672Q >= c10562d.f52673R || c10574p.f52757e >= c10574p.f52758f;
                if (c10574p.m19571h()) {
                    c10562d.f52680c.put(Integer.valueOf(i10), c10574p);
                }
                C9072e c9072e = C9072e.f47360a;
            }
            C10575q c10575q = c10562d.f52675T;
            synchronized (c10575q) {
                if (c10575q.f52783e) {
                    throw new IOException("closed");
                }
                c10575q.f52784f.m19537d(arrayList);
                long j10 = c10575q.f52781c.f34435b;
                long jMin = Math.min(c10575q.f52782d, j10);
                int i13 = j10 == jMin ? 4 : 0;
                if (z12) {
                    i13 |= 1;
                }
                c10575q.m19581l(i10, (int) jMin, 1, i13);
                c10575q.f52779a.mo11922k1(c10575q.f52781c, jMin);
                if (j10 > jMin) {
                    c10575q.m19578E(i10, j10 - jMin);
                }
            }
        }
        if (z10) {
            C10575q c10575q2 = c10562d.f52675T;
            synchronized (c10575q2) {
                if (c10575q2.f52783e) {
                    throw new IOException("closed");
                }
                c10575q2.f52779a.flush();
            }
        }
        this.f52739d = c10574p;
        if (this.f52741f) {
            C10574p c10574p2 = this.f52739d;
            C5207g.m11108c(c10574p2);
            c10574p2.m19568e(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        C10574p c10574p3 = this.f52739d;
        C5207g.m11108c(c10574p3);
        C10574p.c cVar = c10574p3.f52763k;
        long j11 = this.f52737b.f51703g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.mo11986g(j11, timeUnit);
        C10574p c10574p4 = this.f52739d;
        C5207g.m11108c(c10574p4);
        c10574p4.f52764l.mo11986g(this.f52737b.f51704h, timeUnit);
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: b */
    public final void mo19224b() throws IOException {
        C10574p c10574p = this.f52739d;
        C5207g.m11108c(c10574p);
        c10574p.m19569f().close();
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: c */
    public final InterfaceC5625v mo19225c(C9101s c9101s, long j10) {
        C10574p c10574p = this.f52739d;
        C5207g.m11108c(c10574p);
        return c10574p.m19569f();
    }

    @Override // p493xo.InterfaceC10264d
    public final void cancel() {
        this.f52741f = true;
        C10574p c10574p = this.f52739d;
        if (c10574p == null) {
            return;
        }
        c10574p.m19568e(ErrorCode.CANCEL);
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: d */
    public final long mo19226d(C9106x c9106x) {
        if (C10265e.m19231a(c9106x)) {
            return C9347b.m17704k(c9106x);
        }
        return 0L;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: e */
    public final C9106x.a mo19227e(boolean z10) throws IOException {
        C9095m c9095m;
        C10574p c10574p = this.f52739d;
        if (c10574p == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (c10574p) {
            c10574p.f52763k.m11916h();
            while (c10574p.f52759g.isEmpty() && c10574p.f52765m == null) {
                try {
                    c10574p.m19573j();
                } catch (Throwable th2) {
                    c10574p.f52763k.m19576l();
                    throw th2;
                }
            }
            c10574p.f52763k.m19576l();
            if (!(!c10574p.f52759g.isEmpty())) {
                Throwable streamResetException = c10574p.f52766n;
                if (streamResetException == null) {
                    ErrorCode errorCode = c10574p.f52765m;
                    C5207g.m11108c(errorCode);
                    streamResetException = new StreamResetException(errorCode);
                }
                throw streamResetException;
            }
            C9095m c9095mRemoveFirst = c10574p.f52759g.removeFirst();
            C5207g.m11110e(c9095mRemoveFirst, "headersQueue.removeFirst()");
            c9095m = c9095mRemoveFirst;
        }
        Protocol protocol = this.f52740e;
        C5207g.m11111f(protocol, "protocol");
        C9095m.a aVar = new C9095m.a();
        int length = c9095m.f47452a.length / 2;
        int i10 = 0;
        C10269i c10269iM19239a = null;
        while (i10 < length) {
            int i11 = i10 + 1;
            String strM17306f = c9095m.m17306f(i10);
            String strM17309l = c9095m.m17309l(i10);
            if (C5207g.m11106a(strM17306f, ":status")) {
                c10269iM19239a = C10269i.a.m19239a(C5207g.m11116k(strM17309l, "HTTP/1.1 "));
            } else if (!f52735h.contains(strM17306f)) {
                aVar.m17313c(strM17306f, strM17309l);
            }
            i10 = i11;
        }
        if (c10269iM19239a == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C9106x.a aVar2 = new C9106x.a();
        aVar2.f47576b = protocol;
        aVar2.f47577c = c10269iM19239a.f51711b;
        String str = c10269iM19239a.f51712c;
        C5207g.m11111f(str, "message");
        aVar2.f47578d = str;
        aVar2.m17353c(aVar.m17314d());
        if (z10 && aVar2.f47577c == 100) {
            return null;
        }
        return aVar2;
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: f */
    public final InterfaceC5627x mo19228f(C9106x c9106x) {
        C10574p c10574p = this.f52739d;
        C5207g.m11108c(c10574p);
        return c10574p.f52761i;
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: g */
    public final C8077a mo19229g() {
        return this.f52736a;
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: h */
    public final void mo19230h() throws IOException {
        this.f52738c.flush();
    }
}
