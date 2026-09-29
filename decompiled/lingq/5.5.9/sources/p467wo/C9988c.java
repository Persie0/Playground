package p467wo;

import dm.C5207g;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal.connection.C8077a;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p124fp.AbstractC5611h;
import p124fp.AbstractC5612i;
import p124fp.C5608e;
import p124fp.C5617n;
import p124fp.InterfaceC5625v;
import p124fp.InterfaceC5627x;
import p493xo.C10267g;
import p493xo.InterfaceC10264d;
import so.AbstractC9093k;
import so.C9106x;

/* JADX INFO: renamed from: wo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9988c {

    /* JADX INFO: renamed from: a */
    public final C9990e f50740a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9093k f50741b;

    /* JADX INFO: renamed from: c */
    public final C9989d f50742c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10264d f50743d;

    /* JADX INFO: renamed from: e */
    public boolean f50744e;

    /* JADX INFO: renamed from: f */
    public boolean f50745f;

    /* JADX INFO: renamed from: g */
    public final C8077a f50746g;

    /* JADX INFO: renamed from: wo.c$a */
    public final class a extends AbstractC5611h {

        /* JADX INFO: renamed from: b */
        public final long f50747b;

        /* JADX INFO: renamed from: c */
        public boolean f50748c;

        /* JADX INFO: renamed from: d */
        public long f50749d;

        /* JADX INFO: renamed from: e */
        public boolean f50750e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C9988c f50751f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9988c c9988c, InterfaceC5625v interfaceC5625v, long j10) {
            super(interfaceC5625v);
            C5207g.m11111f(c9988c, "this$0");
            C5207g.m11111f(interfaceC5625v, "delegate");
            this.f50751f = c9988c;
            this.f50747b = j10;
        }

        /* JADX INFO: renamed from: a */
        public final <E extends IOException> E m18564a(E e10) {
            if (this.f50748c) {
                return e10;
            }
            this.f50748c = true;
            return (E) this.f50751f.m18560a(false, true, e10);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p124fp.AbstractC5611h, p124fp.InterfaceC5625v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f50750e) {
                return;
            }
            this.f50750e = true;
            long j10 = this.f50747b;
            if (j10 != -1 && this.f50749d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m18564a(null);
            } catch (IOException e10) {
                throw m18564a(e10);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p124fp.AbstractC5611h, p124fp.InterfaceC5625v, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw m18564a(e10);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p124fp.AbstractC5611h, p124fp.InterfaceC5625v
        /* JADX INFO: renamed from: k1 */
        public final void mo11922k1(C5608e c5608e, long j10) throws IOException {
            C5207g.m11111f(c5608e, "source");
            if (!(!this.f50750e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f50747b;
            if (j11 != -1 && this.f50749d + j10 > j11) {
                throw new ProtocolException("expected " + j11 + " bytes but received " + (this.f50749d + j10));
            }
            try {
                super.mo11922k1(c5608e, j10);
                this.f50749d += j10;
            } catch (IOException e10) {
                throw m18564a(e10);
            }
        }
    }

    /* JADX INFO: renamed from: wo.c$b */
    public final class b extends AbstractC5612i {

        /* JADX INFO: renamed from: b */
        public final long f50752b;

        /* JADX INFO: renamed from: c */
        public long f50753c;

        /* JADX INFO: renamed from: d */
        public boolean f50754d;

        /* JADX INFO: renamed from: e */
        public boolean f50755e;

        /* JADX INFO: renamed from: f */
        public boolean f50756f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C9988c f50757g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9988c c9988c, InterfaceC5627x interfaceC5627x, long j10) {
            super(interfaceC5627x);
            C5207g.m11111f(c9988c, "this$0");
            C5207g.m11111f(interfaceC5627x, "delegate");
            this.f50757g = c9988c;
            this.f50752b = j10;
            this.f50754d = true;
            if (j10 == 0) {
                m18565a(null);
            }
        }

        /* JADX INFO: renamed from: a */
        public final <E extends IOException> E m18565a(E e10) {
            if (this.f50755e) {
                return e10;
            }
            this.f50755e = true;
            C9988c c9988c = this.f50757g;
            if (e10 == null && this.f50754d) {
                this.f50754d = false;
                c9988c.f50741b.getClass();
                C5207g.m11111f(c9988c.f50740a, "call");
            }
            return (E) c9988c.m18560a(true, false, e10);
        }

        @Override // p124fp.AbstractC5612i, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f50756f) {
                return;
            }
            this.f50756f = true;
            try {
                super.close();
                m18565a(null);
            } catch (IOException e10) {
                throw m18565a(e10);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // p124fp.AbstractC5612i, p124fp.InterfaceC5627x
        /* JADX INFO: renamed from: j0 */
        public final long mo11924j0(C5608e c5608e, long j10) throws IOException {
            C5207g.m11111f(c5608e, "sink");
            if (!(!this.f50756f)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jMo11924j0 = this.f34438a.mo11924j0(c5608e, j10);
                if (this.f50754d) {
                    this.f50754d = false;
                    C9988c c9988c = this.f50757g;
                    AbstractC9093k abstractC9093k = c9988c.f50741b;
                    C9990e c9990e = c9988c.f50740a;
                    abstractC9093k.getClass();
                    C5207g.m11111f(c9990e, "call");
                }
                if (jMo11924j0 == -1) {
                    m18565a(null);
                    return -1L;
                }
                long j11 = this.f50753c + jMo11924j0;
                long j12 = this.f50752b;
                if (j12 == -1 || j11 <= j12) {
                    this.f50753c = j11;
                    if (j11 == j12) {
                        m18565a(null);
                    }
                    return jMo11924j0;
                }
                throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
            } catch (IOException e10) {
                throw m18565a(e10);
            }
        }
    }

    public C9988c(C9990e c9990e, AbstractC9093k abstractC9093k, C9989d c9989d, InterfaceC10264d interfaceC10264d) {
        C5207g.m11111f(abstractC9093k, "eventListener");
        this.f50740a = c9990e;
        this.f50741b = abstractC9093k;
        this.f50742c = c9989d;
        this.f50743d = interfaceC10264d;
        this.f50746g = interfaceC10264d.mo19229g();
    }

    /* JADX INFO: renamed from: a */
    public final IOException m18560a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            m18563d(iOException);
        }
        AbstractC9093k abstractC9093k = this.f50741b;
        C9990e c9990e = this.f50740a;
        if (z11) {
            if (iOException != null) {
                abstractC9093k.getClass();
                C5207g.m11111f(c9990e, "call");
            } else {
                abstractC9093k.getClass();
                C5207g.m11111f(c9990e, "call");
            }
        }
        if (z10) {
            if (iOException != null) {
                abstractC9093k.getClass();
                C5207g.m11111f(c9990e, "call");
            } else {
                abstractC9093k.getClass();
                C5207g.m11111f(c9990e, "call");
            }
        }
        return c9990e.m18575h(this, z11, z10, iOException);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final C10267g m18561b(C9106x c9106x) throws IOException {
        InterfaceC10264d interfaceC10264d = this.f50743d;
        try {
            String strM17348b = C9106x.m17348b(c9106x, "Content-Type");
            long jMo19226d = interfaceC10264d.mo19226d(c9106x);
            return new C10267g(strM17348b, jMo19226d, C5617n.m11991c(new b(this, interfaceC10264d.mo19228f(c9106x), jMo19226d)));
        } catch (IOException e10) {
            this.f50741b.getClass();
            C5207g.m11111f(this.f50740a, "call");
            m18563d(e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C9106x.a m18562c(boolean z10) throws IOException {
        try {
            C9106x.a aVarMo19227e = this.f50743d.mo19227e(z10);
            if (aVarMo19227e != null) {
                aVarMo19227e.f47587m = this;
            }
            return aVarMo19227e;
        } catch (IOException e10) {
            this.f50741b.getClass();
            C5207g.m11111f(this.f50740a, "call");
            m18563d(e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18563d(IOException iOException) {
        this.f50745f = true;
        this.f50742c.m18568c(iOException);
        C8077a c8077aMo19229g = this.f50743d.mo19229g();
        C9990e c9990e = this.f50740a;
        synchronized (c8077aMo19229g) {
            C5207g.m11111f(c9990e, "call");
            if (!(iOException instanceof StreamResetException)) {
                if (!(c8077aMo19229g.f43873g != null) || (iOException instanceof ConnectionShutdownException)) {
                    c8077aMo19229g.f43876j = true;
                    if (c8077aMo19229g.f43879m == 0) {
                        C8077a.m15969d(c9990e.f50774a, c8077aMo19229g.f43868b, iOException);
                        c8077aMo19229g.f43878l++;
                    }
                }
            } else if (((StreamResetException) iOException).f43885a == ErrorCode.REFUSED_STREAM) {
                int i10 = c8077aMo19229g.f43880n + 1;
                c8077aMo19229g.f43880n = i10;
                if (i10 > 1) {
                    c8077aMo19229g.f43876j = true;
                    c8077aMo19229g.f43878l++;
                }
            } else if (((StreamResetException) iOException).f43885a != ErrorCode.CANCEL || !c9990e.f50771K) {
                c8077aMo19229g.f43876j = true;
                c8077aMo19229g.f43878l++;
            }
        }
    }
}
