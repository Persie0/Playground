package p542zo;

import dm.C5207g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p124fp.C5604a;
import p124fp.C5608e;
import p124fp.C5628y;
import p124fp.InterfaceC5625v;
import p124fp.InterfaceC5627x;
import sl.C9072e;
import so.C9095m;
import to.C9347b;

/* JADX INFO: renamed from: zo.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C10574p {

    /* JADX INFO: renamed from: a */
    public final int f52753a;

    /* JADX INFO: renamed from: b */
    public final C10562d f52754b;

    /* JADX INFO: renamed from: c */
    public long f52755c;

    /* JADX INFO: renamed from: d */
    public long f52756d;

    /* JADX INFO: renamed from: e */
    public long f52757e;

    /* JADX INFO: renamed from: f */
    public long f52758f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque<C9095m> f52759g;

    /* JADX INFO: renamed from: h */
    public boolean f52760h;

    /* JADX INFO: renamed from: i */
    public final b f52761i;

    /* JADX INFO: renamed from: j */
    public final a f52762j;

    /* JADX INFO: renamed from: k */
    public final c f52763k;

    /* JADX INFO: renamed from: l */
    public final c f52764l;

    /* JADX INFO: renamed from: m */
    public ErrorCode f52765m;

    /* JADX INFO: renamed from: n */
    public IOException f52766n;

    /* JADX INFO: renamed from: zo.p$a */
    public final class a implements InterfaceC5625v {

        /* JADX INFO: renamed from: a */
        public final boolean f52767a;

        /* JADX INFO: renamed from: b */
        public final C5608e f52768b;

        /* JADX INFO: renamed from: c */
        public boolean f52769c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C10574p f52770d;

        public a(C10574p c10574p, boolean z10) {
            C5207g.m11111f(c10574p, "this$0");
            this.f52770d = c10574p;
            this.f52767a = z10;
            this.f52768b = new C5608e();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final void m19574a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            C10574p c10574p = this.f52770d;
            synchronized (c10574p) {
                try {
                    c10574p.f52764l.m11916h();
                    while (c10574p.f52757e >= c10574p.f52758f && !this.f52767a && !this.f52769c) {
                        try {
                            synchronized (c10574p) {
                                ErrorCode errorCode = c10574p.f52765m;
                                if (errorCode != null) {
                                    break;
                                } else {
                                    c10574p.m19573j();
                                }
                            }
                        } catch (Throwable th2) {
                            c10574p.f52764l.m19576l();
                            throw th2;
                        }
                    }
                    c10574p.f52764l.m19576l();
                    c10574p.m19565b();
                    jMin = Math.min(c10574p.f52758f - c10574p.f52757e, this.f52768b.f34435b);
                    c10574p.f52757e += jMin;
                    z11 = z10 && jMin == this.f52768b.f34435b;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f52770d.f52764l.m11916h();
            try {
                C10574p c10574p2 = this.f52770d;
                c10574p2.f52754b.m19540C(c10574p2.f52753a, z11, this.f52768b, jMin);
                this.f52770d.f52764l.m19576l();
            } catch (Throwable th4) {
                this.f52770d.f52764l.m19576l();
                throw th4;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p124fp.InterfaceC5625v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            boolean z10;
            boolean z11;
            C10574p c10574p = this.f52770d;
            byte[] bArr = C9347b.f48082a;
            synchronized (c10574p) {
                if (this.f52769c) {
                    return;
                }
                synchronized (c10574p) {
                    try {
                        z10 = false;
                        z11 = c10574p.f52765m == null;
                        C9072e c9072e = C9072e.f47360a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C10574p c10574p2 = this.f52770d;
                if (!c10574p2.f52762j.f52767a) {
                    if (this.f52768b.f34435b > 0) {
                        z10 = true;
                    }
                    if (z10) {
                        while (this.f52768b.f34435b > 0) {
                            m19574a(true);
                        }
                    } else if (z11) {
                        c10574p2.f52754b.m19540C(c10574p2.f52753a, true, null, 0L);
                    }
                }
                synchronized (this.f52770d) {
                    try {
                        this.f52769c = true;
                        C9072e c9072e2 = C9072e.f47360a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                this.f52770d.f52754b.flush();
                this.f52770d.m19564a();
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p124fp.InterfaceC5625v, java.io.Flushable
        public final void flush() throws IOException {
            C10574p c10574p = this.f52770d;
            byte[] bArr = C9347b.f48082a;
            synchronized (c10574p) {
                try {
                    c10574p.m19565b();
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            while (this.f52768b.f34435b > 0) {
                m19574a(false);
                this.f52770d.f52754b.flush();
            }
        }

        @Override // p124fp.InterfaceC5625v
        /* JADX INFO: renamed from: g */
        public final C5628y mo11921g() {
            return this.f52770d.f52764l;
        }

        @Override // p124fp.InterfaceC5625v
        /* JADX INFO: renamed from: k1 */
        public final void mo11922k1(C5608e c5608e, long j10) throws IOException {
            C5207g.m11111f(c5608e, "source");
            byte[] bArr = C9347b.f48082a;
            C5608e c5608e2 = this.f52768b;
            c5608e2.mo11922k1(c5608e, j10);
            while (c5608e2.f34435b >= 16384) {
                m19574a(false);
            }
        }
    }

    /* JADX INFO: renamed from: zo.p$b */
    public final class b implements InterfaceC5627x {

        /* JADX INFO: renamed from: a */
        public final long f52771a;

        /* JADX INFO: renamed from: b */
        public boolean f52772b;

        /* JADX INFO: renamed from: c */
        public final C5608e f52773c;

        /* JADX INFO: renamed from: d */
        public final C5608e f52774d;

        /* JADX INFO: renamed from: e */
        public boolean f52775e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C10574p f52776f;

        public b(C10574p c10574p, long j10, boolean z10) {
            C5207g.m11111f(c10574p, "this$0");
            this.f52776f = c10574p;
            this.f52771a = j10;
            this.f52772b = z10;
            this.f52773c = new C5608e();
            this.f52774d = new C5608e();
        }

        /* JADX INFO: renamed from: a */
        public final void m19575a(long j10) {
            byte[] bArr = C9347b.f48082a;
            this.f52776f.f52754b.m19548w(j10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j10;
            C10574p c10574p = this.f52776f;
            synchronized (c10574p) {
                this.f52775e = true;
                C5608e c5608e = this.f52774d;
                j10 = c5608e.f34435b;
                c5608e.m11951b();
                c10574p.notifyAll();
                C9072e c9072e = C9072e.f47360a;
            }
            if (j10 > 0) {
                m19575a(j10);
            }
            this.f52776f.m19564a();
        }

        @Override // p124fp.InterfaceC5627x
        /* JADX INFO: renamed from: g */
        public final C5628y mo11923g() {
            return this.f52776f.f52763k;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x0098 A[LOOP:0: B:7:0x0019->B:50:0x0098, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:55:0x00a4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:56:0x00a6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:78:0x009c A[SYNTHETIC] */
        @Override // p124fp.InterfaceC5627x
        /* JADX INFO: renamed from: j0 */
        public final long mo11924j0(C5608e c5608e, long j10) throws Throwable {
            ErrorCode errorCode;
            Throwable streamResetException;
            boolean z10;
            long jMo11924j0;
            C5207g.m11111f(c5608e, "sink");
            long j11 = 0;
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(C5207g.m11116k(Long.valueOf(j10), "byteCount < 0: ").toString());
            }
            while (true) {
                C10574p c10574p = this.f52776f;
                synchronized (c10574p) {
                    c10574p.f52763k.m11916h();
                    try {
                        synchronized (c10574p) {
                            errorCode = c10574p.f52765m;
                        }
                        if (z10) {
                            if (jMo11924j0 != -1) {
                                m19575a(jMo11924j0);
                                return jMo11924j0;
                            }
                            if (streamResetException == null) {
                                return -1L;
                            }
                            throw streamResetException;
                        }
                        j11 = 0;
                    } catch (Throwable th2) {
                        c10574p.f52763k.m19576l();
                        throw th2;
                    }
                }
                if (errorCode == null || this.f52772b) {
                    streamResetException = null;
                } else {
                    streamResetException = c10574p.f52766n;
                    if (streamResetException == null) {
                        synchronized (c10574p) {
                            ErrorCode errorCode2 = c10574p.f52765m;
                            C5207g.m11108c(errorCode2);
                            streamResetException = new StreamResetException(errorCode2);
                        }
                    }
                }
                if (this.f52775e) {
                    throw new IOException("stream closed");
                }
                C5608e c5608e2 = this.f52774d;
                long j12 = c5608e2.f34435b;
                if (j12 > j11) {
                    jMo11924j0 = c5608e2.mo11924j0(c5608e, Math.min(j10, j12));
                    long j13 = c10574p.f52755c + jMo11924j0;
                    c10574p.f52755c = j13;
                    long j14 = j13 - c10574p.f52756d;
                    if (streamResetException == null && j14 >= c10574p.f52754b.f52668M.m19586a() / 2) {
                        c10574p.f52754b.m19542G(c10574p.f52753a, j14);
                        c10574p.f52756d = c10574p.f52755c;
                    }
                    z10 = false;
                } else {
                    if (this.f52772b || streamResetException != null) {
                        z10 = false;
                    } else {
                        c10574p.m19573j();
                        z10 = true;
                    }
                    jMo11924j0 = -1;
                }
                c10574p.f52763k.m19576l();
                C9072e c9072e = C9072e.f47360a;
                if (z10) {
                    if (jMo11924j0 != -1) {
                        m19575a(jMo11924j0);
                        return jMo11924j0;
                    }
                    if (streamResetException == null) {
                        return -1L;
                    }
                    throw streamResetException;
                }
                j11 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: zo.p$c */
    public final class c extends C5604a {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C10574p f52777k;

        public c(C10574p c10574p) {
            C5207g.m11111f(c10574p, "this$0");
            this.f52777k = c10574p;
        }

        @Override // p124fp.C5604a
        /* JADX INFO: renamed from: j */
        public final IOException mo11918j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p124fp.C5604a
        /* JADX INFO: renamed from: k */
        public final void mo11919k() {
            this.f52777k.m19568e(ErrorCode.CANCEL);
            C10562d c10562d = this.f52777k.f52754b;
            synchronized (c10562d) {
                try {
                    long j10 = c10562d.f52666K;
                    long j11 = c10562d.f52665J;
                    if (j10 < j11) {
                        return;
                    }
                    c10562d.f52665J = j11 + 1;
                    c10562d.f52667L = System.nanoTime() + ((long) 1000000000);
                    C9072e c9072e = C9072e.f47360a;
                    c10562d.f52686i.m18258c(new C10571m(C5207g.m11116k(" ping", c10562d.f52681d), c10562d), 0L);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: l */
        public final void m19576l() throws IOException {
            if (m11917i()) {
                throw mo11918j(null);
            }
        }
    }

    public C10574p(int i10, C10562d c10562d, boolean z10, boolean z11, C9095m c9095m) {
        this.f52753a = i10;
        this.f52754b = c10562d;
        this.f52758f = c10562d.f52669N.m19586a();
        ArrayDeque<C9095m> arrayDeque = new ArrayDeque<>();
        this.f52759g = arrayDeque;
        this.f52761i = new b(this, c10562d.f52668M.m19586a(), z11);
        this.f52762j = new a(this, z10);
        this.f52763k = new c(this);
        this.f52764l = new c(this);
        if (c9095m == null) {
            if (!m19570g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!m19570g())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(c9095m);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX INFO: renamed from: a */
    public final void m19564a() throws IOException {
        boolean z10;
        boolean zM19571h;
        byte[] bArr = C9347b.f48082a;
        synchronized (this) {
            try {
                b bVar = this.f52761i;
                if (bVar.f52772b || !bVar.f52775e) {
                    z10 = false;
                } else {
                    a aVar = this.f52762j;
                    if (aVar.f52767a || aVar.f52769c) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                zM19571h = m19571h();
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            m19566c(ErrorCode.CANCEL, null);
        } else {
            if (zM19571h) {
                return;
            }
            this.f52754b.m19546q(this.f52753a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: b */
    public final void m19565b() throws Throwable {
        a aVar = this.f52762j;
        if (aVar.f52769c) {
            throw new IOException("stream closed");
        }
        if (aVar.f52767a) {
            throw new IOException("stream finished");
        }
        if (this.f52765m != null) {
            Throwable streamResetException = this.f52766n;
            if (streamResetException == null) {
                ErrorCode errorCode = this.f52765m;
                C5207g.m11108c(errorCode);
                streamResetException = new StreamResetException(errorCode);
            }
            throw streamResetException;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19566c(ErrorCode errorCode, IOException iOException) throws IOException {
        C5207g.m11111f(errorCode, "rstStatusCode");
        if (m19567d(errorCode, iOException)) {
            C10562d c10562d = this.f52754b;
            c10562d.getClass();
            c10562d.f52675T.m19584w(this.f52753a, errorCode);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m19567d(ErrorCode errorCode, IOException iOException) {
        ErrorCode errorCode2;
        byte[] bArr = C9347b.f48082a;
        synchronized (this) {
            try {
                synchronized (this) {
                    try {
                        errorCode2 = this.f52765m;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (errorCode2 != null) {
            return false;
        }
        if (this.f52761i.f52772b && this.f52762j.f52767a) {
            return false;
        }
        this.f52765m = errorCode;
        this.f52766n = iOException;
        notifyAll();
        C9072e c9072e = C9072e.f47360a;
        this.f52754b.m19546q(this.f52753a);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m19568e(ErrorCode errorCode) {
        C5207g.m11111f(errorCode, "errorCode");
        if (m19567d(errorCode, null)) {
            this.f52754b.m19541E(this.f52753a, errorCode);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final a m19569f() {
        synchronized (this) {
            try {
                if (!(this.f52760h || m19570g())) {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f52762j;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19570g() {
        return this.f52754b.f52678a == ((this.f52753a & 1) == 1);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized boolean m19571h() {
        try {
            if (this.f52765m != null) {
                return false;
            }
            b bVar = this.f52761i;
            if (bVar.f52772b || bVar.f52775e) {
                a aVar = this.f52762j;
                if ((aVar.f52767a || aVar.f52769c) && this.f52760h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final void m19572i(C9095m c9095m, boolean z10) {
        boolean zM19571h;
        C5207g.m11111f(c9095m, "headers");
        byte[] bArr = C9347b.f48082a;
        synchronized (this) {
            if (this.f52760h && z10) {
                this.f52761i.getClass();
            } else {
                this.f52760h = true;
                this.f52759g.add(c9095m);
            }
            if (z10) {
                this.f52761i.f52772b = true;
            }
            zM19571h = m19571h();
            notifyAll();
            C9072e c9072e = C9072e.f47360a;
        }
        if (!zM19571h) {
            this.f52754b.m19546q(this.f52753a);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m19573j() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
