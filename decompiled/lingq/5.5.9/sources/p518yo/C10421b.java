package p518yo;

import dm.C5207g;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.text.C7076b;
import mo.C7661i;
import okhttp3.Protocol;
import okhttp3.internal.connection.C8077a;
import p124fp.C5608e;
import p124fp.C5613j;
import p124fp.C5628y;
import p124fp.InterfaceC5609f;
import p124fp.InterfaceC5610g;
import p124fp.InterfaceC5625v;
import p124fp.InterfaceC5627x;
import p493xo.C10265e;
import p493xo.C10269i;
import p493xo.InterfaceC10264d;
import so.C9095m;
import so.C9096n;
import so.C9100r;
import so.C9101s;
import so.C9106x;
import to.C9347b;

/* JADX INFO: renamed from: yo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10421b implements InterfaceC10264d {

    /* JADX INFO: renamed from: a */
    public final C9100r f52235a;

    /* JADX INFO: renamed from: b */
    public final C8077a f52236b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5610g f52237c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5609f f52238d;

    /* JADX INFO: renamed from: e */
    public int f52239e;

    /* JADX INFO: renamed from: f */
    public final C10420a f52240f;

    /* JADX INFO: renamed from: g */
    public C9095m f52241g;

    /* JADX INFO: renamed from: yo.b$a */
    public abstract class a implements InterfaceC5627x {

        /* JADX INFO: renamed from: a */
        public final C5613j f52242a;

        /* JADX INFO: renamed from: b */
        public boolean f52243b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C10421b f52244c;

        public a(C10421b c10421b) {
            C5207g.m11111f(c10421b, "this$0");
            this.f52244c = c10421b;
            this.f52242a = new C5613j(c10421b.f52237c.mo11923g());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final void m19400a() {
            C10421b c10421b = this.f52244c;
            int i10 = c10421b.f52239e;
            if (i10 == 6) {
                return;
            }
            if (i10 != 5) {
                throw new IllegalStateException(C5207g.m11116k(Integer.valueOf(c10421b.f52239e), "state: "));
            }
            C10421b.m19397i(c10421b, this.f52242a);
            c10421b.f52239e = 6;
        }

        @Override // p124fp.InterfaceC5627x
        /* JADX INFO: renamed from: g */
        public final C5628y mo11923g() {
            return this.f52242a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p124fp.InterfaceC5627x
        /* JADX INFO: renamed from: j0 */
        public long mo11924j0(C5608e c5608e, long j10) throws IOException {
            C10421b c10421b = this.f52244c;
            C5207g.m11111f(c5608e, "sink");
            try {
                return c10421b.f52237c.mo11924j0(c5608e, j10);
            } catch (IOException e10) {
                c10421b.f52236b.m15979k();
                m19400a();
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: yo.b$b */
    public final class b implements InterfaceC5625v {

        /* JADX INFO: renamed from: a */
        public final C5613j f52245a;

        /* JADX INFO: renamed from: b */
        public boolean f52246b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C10421b f52247c;

        public b(C10421b c10421b) {
            C5207g.m11111f(c10421b, "this$0");
            this.f52247c = c10421b;
            this.f52245a = new C5613j(c10421b.f52238d.mo11921g());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p124fp.InterfaceC5625v, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            try {
                if (this.f52246b) {
                    return;
                }
                this.f52246b = true;
                this.f52247c.f52238d.mo11957k0("0\r\n\r\n");
                C10421b.m19397i(this.f52247c, this.f52245a);
                this.f52247c.f52239e = 3;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p124fp.InterfaceC5625v, java.io.Flushable
        public final synchronized void flush() {
            if (this.f52246b) {
                return;
            }
            this.f52247c.f52238d.flush();
        }

        @Override // p124fp.InterfaceC5625v
        /* JADX INFO: renamed from: g */
        public final C5628y mo11921g() {
            return this.f52245a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p124fp.InterfaceC5625v
        /* JADX INFO: renamed from: k1 */
        public final void mo11922k1(C5608e c5608e, long j10) throws IOException {
            C5207g.m11111f(c5608e, "source");
            if (!(!this.f52246b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            C10421b c10421b = this.f52247c;
            c10421b.f52238d.mo11978z0(j10);
            c10421b.f52238d.mo11957k0("\r\n");
            c10421b.f52238d.mo11922k1(c5608e, j10);
            c10421b.f52238d.mo11957k0("\r\n");
        }
    }

    /* JADX INFO: renamed from: yo.b$c */
    public final class c extends a {

        /* JADX INFO: renamed from: d */
        public final C9096n f52248d;

        /* JADX INFO: renamed from: e */
        public long f52249e;

        /* JADX INFO: renamed from: f */
        public boolean f52250f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C10421b f52251g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C10421b c10421b, C9096n c9096n) {
            super(c10421b);
            C5207g.m11111f(c10421b, "this$0");
            C5207g.m11111f(c9096n, "url");
            this.f52251g = c10421b;
            this.f52248d = c9096n;
            this.f52249e = -1L;
            this.f52250f = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f52243b) {
                return;
            }
            if (this.f52250f && !C9347b.m17701h(this, TimeUnit.MILLISECONDS)) {
                this.f52251g.f52236b.m15979k();
                m19400a();
            }
            this.f52243b = true;
        }

        @Override // p518yo.C10421b.a, p124fp.InterfaceC5627x
        /* JADX INFO: renamed from: j0 */
        public final long mo11924j0(C5608e c5608e, long j10) throws IOException {
            C5207g.m11111f(c5608e, "sink");
            boolean z10 = true;
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(C5207g.m11116k(Long.valueOf(j10), "byteCount < 0: ").toString());
            }
            if (!(!this.f52243b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f52250f) {
                return -1L;
            }
            long j11 = this.f52249e;
            C10421b c10421b = this.f52251g;
            if (j11 == 0 || j11 == -1) {
                if (j11 != -1) {
                    c10421b.f52237c.mo11938M0();
                }
                try {
                    this.f52249e = c10421b.f52237c.mo11973w1();
                    String string = C7076b.m14277B3(c10421b.f52237c.mo11938M0()).toString();
                    if (this.f52249e >= 0) {
                        if (string.length() <= 0) {
                            z10 = false;
                        }
                        if (!z10 || C7661i.m15256V2(string, ";", false)) {
                            if (this.f52249e == 0) {
                                this.f52250f = false;
                                c10421b.f52241g = c10421b.f52240f.m19396a();
                                C9100r c9100r = c10421b.f52235a;
                                C5207g.m11108c(c9100r);
                                C9095m c9095m = c10421b.f52241g;
                                C5207g.m11108c(c9095m);
                                C10265e.m19232b(c9100r.f47517j, this.f52248d, c9095m);
                                m19400a();
                            }
                            if (!this.f52250f) {
                                return -1L;
                            }
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f52249e + string + '\"');
                } catch (NumberFormatException e10) {
                    throw new ProtocolException(e10.getMessage());
                }
            }
            long jMo11924j0 = super.mo11924j0(c5608e, Math.min(j10, this.f52249e));
            if (jMo11924j0 != -1) {
                this.f52249e -= jMo11924j0;
                return jMo11924j0;
            }
            c10421b.f52236b.m15979k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m19400a();
            throw protocolException;
        }
    }

    /* JADX INFO: renamed from: yo.b$d */
    public final class d extends a {

        /* JADX INFO: renamed from: d */
        public long f52252d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C10421b f52253e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C10421b c10421b, long j10) {
            super(c10421b);
            C5207g.m11111f(c10421b, "this$0");
            this.f52253e = c10421b;
            this.f52252d = j10;
            if (j10 == 0) {
                m19400a();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f52243b) {
                return;
            }
            if (this.f52252d != 0 && !C9347b.m17701h(this, TimeUnit.MILLISECONDS)) {
                this.f52253e.f52236b.m15979k();
                m19400a();
            }
            this.f52243b = true;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p518yo.C10421b.a, p124fp.InterfaceC5627x
        /* JADX INFO: renamed from: j0 */
        public final long mo11924j0(C5608e c5608e, long j10) throws IOException {
            C5207g.m11111f(c5608e, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(C5207g.m11116k(Long.valueOf(j10), "byteCount < 0: ").toString());
            }
            if (!(!this.f52243b)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f52252d;
            if (j11 == 0) {
                return -1L;
            }
            long jMo11924j0 = super.mo11924j0(c5608e, Math.min(j11, j10));
            if (jMo11924j0 == -1) {
                this.f52253e.f52236b.m15979k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m19400a();
                throw protocolException;
            }
            long j12 = this.f52252d - jMo11924j0;
            this.f52252d = j12;
            if (j12 == 0) {
                m19400a();
            }
            return jMo11924j0;
        }
    }

    /* JADX INFO: renamed from: yo.b$e */
    public final class e implements InterfaceC5625v {

        /* JADX INFO: renamed from: a */
        public final C5613j f52254a;

        /* JADX INFO: renamed from: b */
        public boolean f52255b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C10421b f52256c;

        public e(C10421b c10421b) {
            C5207g.m11111f(c10421b, "this$0");
            this.f52256c = c10421b;
            this.f52254a = new C5613j(c10421b.f52238d.mo11921g());
        }

        @Override // p124fp.InterfaceC5625v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f52255b) {
                return;
            }
            this.f52255b = true;
            C5613j c5613j = this.f52254a;
            C10421b c10421b = this.f52256c;
            C10421b.m19397i(c10421b, c5613j);
            c10421b.f52239e = 3;
        }

        @Override // p124fp.InterfaceC5625v, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f52255b) {
                return;
            }
            this.f52256c.f52238d.flush();
        }

        @Override // p124fp.InterfaceC5625v
        /* JADX INFO: renamed from: g */
        public final C5628y mo11921g() {
            return this.f52254a;
        }

        @Override // p124fp.InterfaceC5625v
        /* JADX INFO: renamed from: k1 */
        public final void mo11922k1(C5608e c5608e, long j10) throws IOException {
            C5207g.m11111f(c5608e, "source");
            if (!(!this.f52255b)) {
                throw new IllegalStateException("closed".toString());
            }
            C9347b.m17696c(c5608e.f34435b, 0L, j10);
            this.f52256c.f52238d.mo11922k1(c5608e, j10);
        }
    }

    /* JADX INFO: renamed from: yo.b$f */
    public final class f extends a {

        /* JADX INFO: renamed from: d */
        public boolean f52257d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C10421b c10421b) {
            super(c10421b);
            C5207g.m11111f(c10421b, "this$0");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f52243b) {
                return;
            }
            if (!this.f52257d) {
                m19400a();
            }
            this.f52243b = true;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // p518yo.C10421b.a, p124fp.InterfaceC5627x
        /* JADX INFO: renamed from: j0 */
        public final long mo11924j0(C5608e c5608e, long j10) throws IOException {
            C5207g.m11111f(c5608e, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(C5207g.m11116k(Long.valueOf(j10), "byteCount < 0: ").toString());
            }
            if (!(!this.f52243b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f52257d) {
                return -1L;
            }
            long jMo11924j0 = super.mo11924j0(c5608e, j10);
            if (jMo11924j0 != -1) {
                return jMo11924j0;
            }
            this.f52257d = true;
            m19400a();
            return -1L;
        }
    }

    public C10421b(C9100r c9100r, C8077a c8077a, InterfaceC5610g interfaceC5610g, InterfaceC5609f interfaceC5609f) {
        C5207g.m11111f(c8077a, "connection");
        this.f52235a = c9100r;
        this.f52236b = c8077a;
        this.f52237c = interfaceC5610g;
        this.f52238d = interfaceC5609f;
        this.f52240f = new C10420a(interfaceC5610g);
    }

    /* JADX INFO: renamed from: i */
    public static final void m19397i(C10421b c10421b, C5613j c5613j) {
        c10421b.getClass();
        C5628y c5628y = c5613j.f34439e;
        C5628y.a aVar = C5628y.f34474d;
        C5207g.m11111f(aVar, "delegate");
        c5613j.f34439e = aVar;
        c5628y.mo11980a();
        c5628y.mo11981b();
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: a */
    public final void mo19223a(C9101s c9101s) {
        Proxy.Type type = this.f52236b.f43868b.f47382b.type();
        C5207g.m11110e(type, "connection.route().proxy.type()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c9101s.f47543b);
        sb2.append(' ');
        C9096n c9096n = c9101s.f47542a;
        if (!c9096n.f47464j && type == Proxy.Type.HTTP) {
            sb2.append(c9096n);
        } else {
            String strM17321b = c9096n.m17321b();
            String strM17323d = c9096n.m17323d();
            if (strM17323d != null) {
                strM17321b = strM17321b + '?' + ((Object) strM17323d);
            }
            sb2.append(strM17321b);
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        m19399k(c9101s.f47544c, string);
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: b */
    public final void mo19224b() {
        this.f52238d.flush();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: c */
    public final InterfaceC5625v mo19225c(C9101s c9101s, long j10) {
        boolean z10 = true;
        if (C7661i.m15249O2("chunked", c9101s.f47544c.m17305a("Transfer-Encoding"))) {
            int i10 = this.f52239e;
            if (i10 != 1) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException(C5207g.m11116k(Integer.valueOf(i10), "state: ").toString());
            }
            this.f52239e = 2;
            return new b(this);
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i11 = this.f52239e;
        if (i11 != 1) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalStateException(C5207g.m11116k(Integer.valueOf(i11), "state: ").toString());
        }
        this.f52239e = 2;
        return new e(this);
    }

    @Override // p493xo.InterfaceC10264d
    public final void cancel() {
        Socket socket = this.f52236b.f43869c;
        if (socket == null) {
            return;
        }
        C9347b.m17698e(socket);
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: d */
    public final long mo19226d(C9106x c9106x) {
        if (!C10265e.m19231a(c9106x)) {
            return 0L;
        }
        if (C7661i.m15249O2("chunked", C9106x.m17348b(c9106x, "Transfer-Encoding"))) {
            return -1L;
        }
        return C9347b.m17704k(c9106x);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: e */
    public final C9106x.a mo19227e(boolean z10) {
        C10420a c10420a = this.f52240f;
        int i10 = this.f52239e;
        boolean z11 = false;
        if (!(i10 == 1 || i10 == 2 || i10 == 3)) {
            throw new IllegalStateException(C5207g.m11116k(Integer.valueOf(i10), "state: ").toString());
        }
        try {
            String strMo11946V = c10420a.f52233a.mo11946V(c10420a.f52234b);
            c10420a.f52234b -= (long) strMo11946V.length();
            C10269i c10269iM19239a = C10269i.a.m19239a(strMo11946V);
            int i11 = c10269iM19239a.f51711b;
            C9106x.a aVar = new C9106x.a();
            Protocol protocol = c10269iM19239a.f51710a;
            C5207g.m11111f(protocol, "protocol");
            aVar.f47576b = protocol;
            aVar.f47577c = i11;
            String str = c10269iM19239a.f51712c;
            C5207g.m11111f(str, "message");
            aVar.f47578d = str;
            aVar.m17353c(c10420a.m19396a());
            if (z10 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f52239e = 3;
                return aVar;
            }
            if (102 <= i11 && i11 < 200) {
                z11 = true;
            }
            if (z11) {
                this.f52239e = 3;
                return aVar;
            }
            this.f52239e = 4;
            return aVar;
        } catch (EOFException e10) {
            throw new IOException(C5207g.m11116k(this.f52236b.f43868b.f47381a.f47378i.m17325f(), "unexpected end of stream on "), e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: f */
    public final InterfaceC5627x mo19228f(C9106x c9106x) {
        if (!C10265e.m19231a(c9106x)) {
            return m19398j(0L);
        }
        boolean z10 = true;
        if (C7661i.m15249O2("chunked", C9106x.m17348b(c9106x, "Transfer-Encoding"))) {
            C9096n c9096n = c9106x.f47563a.f47542a;
            int i10 = this.f52239e;
            if (i10 != 4) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException(C5207g.m11116k(Integer.valueOf(i10), "state: ").toString());
            }
            this.f52239e = 5;
            return new c(this, c9096n);
        }
        long jM17704k = C9347b.m17704k(c9106x);
        if (jM17704k != -1) {
            return m19398j(jM17704k);
        }
        int i11 = this.f52239e;
        if (i11 != 4) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalStateException(C5207g.m11116k(Integer.valueOf(i11), "state: ").toString());
        }
        this.f52239e = 5;
        this.f52236b.m15979k();
        return new f(this);
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: g */
    public final C8077a mo19229g() {
        return this.f52236b;
    }

    @Override // p493xo.InterfaceC10264d
    /* JADX INFO: renamed from: h */
    public final void mo19230h() throws IOException {
        this.f52238d.flush();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final d m19398j(long j10) {
        int i10 = this.f52239e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(C5207g.m11116k(Integer.valueOf(i10), "state: ").toString());
        }
        this.f52239e = 5;
        return new d(this, j10);
    }

    /* JADX INFO: renamed from: k */
    public final void m19399k(C9095m c9095m, String str) {
        C5207g.m11111f(c9095m, "headers");
        C5207g.m11111f(str, "requestLine");
        int i10 = this.f52239e;
        if (!(i10 == 0)) {
            throw new IllegalStateException(C5207g.m11116k(Integer.valueOf(i10), "state: ").toString());
        }
        InterfaceC5609f interfaceC5609f = this.f52238d;
        interfaceC5609f.mo11957k0(str).mo11957k0("\r\n");
        int length = c9095m.f47452a.length / 2;
        for (int i11 = 0; i11 < length; i11++) {
            interfaceC5609f.mo11957k0(c9095m.m17306f(i11)).mo11957k0(": ").mo11957k0(c9095m.m17309l(i11)).mo11957k0("\r\n");
        }
        interfaceC5609f.mo11957k0("\r\n");
        this.f52239e = 1;
    }
}
