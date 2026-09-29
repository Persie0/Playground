package p542zo;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$IntRef;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p124fp.C5608e;
import p124fp.InterfaceC5609f;
import p124fp.InterfaceC5610g;
import p349qo.C8656b;
import p442vo.AbstractC9765a;
import p442vo.C9767c;
import p442vo.C9768d;
import sl.C9072e;
import to.C9347b;

/* JADX INFO: renamed from: zo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C10562d implements Closeable {

    /* JADX INFO: renamed from: W */
    public static final C10578t f52662W;

    /* JADX INFO: renamed from: H */
    public long f52663H;

    /* JADX INFO: renamed from: I */
    public long f52664I;

    /* JADX INFO: renamed from: J */
    public long f52665J;

    /* JADX INFO: renamed from: K */
    public long f52666K;

    /* JADX INFO: renamed from: L */
    public long f52667L;

    /* JADX INFO: renamed from: M */
    public final C10578t f52668M;

    /* JADX INFO: renamed from: N */
    public C10578t f52669N;

    /* JADX INFO: renamed from: O */
    public long f52670O;

    /* JADX INFO: renamed from: P */
    public long f52671P;

    /* JADX INFO: renamed from: Q */
    public long f52672Q;

    /* JADX INFO: renamed from: R */
    public long f52673R;

    /* JADX INFO: renamed from: S */
    public final Socket f52674S;

    /* JADX INFO: renamed from: T */
    public final C10575q f52675T;

    /* JADX INFO: renamed from: U */
    public final c f52676U;

    /* JADX INFO: renamed from: V */
    public final LinkedHashSet f52677V;

    /* JADX INFO: renamed from: a */
    public final boolean f52678a;

    /* JADX INFO: renamed from: b */
    public final b f52679b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f52680c;

    /* JADX INFO: renamed from: d */
    public final String f52681d;

    /* JADX INFO: renamed from: e */
    public int f52682e;

    /* JADX INFO: renamed from: f */
    public int f52683f;

    /* JADX INFO: renamed from: g */
    public boolean f52684g;

    /* JADX INFO: renamed from: h */
    public final C9768d f52685h;

    /* JADX INFO: renamed from: i */
    public final C9767c f52686i;

    /* JADX INFO: renamed from: j */
    public final C9767c f52687j;

    /* JADX INFO: renamed from: k */
    public final C9767c f52688k;

    /* JADX INFO: renamed from: l */
    public final C8656b f52689l;

    /* JADX INFO: renamed from: zo.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final boolean f52690a;

        /* JADX INFO: renamed from: b */
        public final C9768d f52691b;

        /* JADX INFO: renamed from: c */
        public Socket f52692c;

        /* JADX INFO: renamed from: d */
        public String f52693d;

        /* JADX INFO: renamed from: e */
        public InterfaceC5610g f52694e;

        /* JADX INFO: renamed from: f */
        public InterfaceC5609f f52695f;

        /* JADX INFO: renamed from: g */
        public b f52696g;

        /* JADX INFO: renamed from: h */
        public final C8656b f52697h;

        /* JADX INFO: renamed from: i */
        public int f52698i;

        public a(C9768d c9768d) {
            C5207g.m11111f(c9768d, "taskRunner");
            this.f52690a = true;
            this.f52691b = c9768d;
            this.f52696g = b.f52699a;
            this.f52697h = InterfaceC10577s.f52791c;
        }
    }

    /* JADX INFO: renamed from: zo.d$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        public static final a f52699a = new a();

        /* JADX INFO: renamed from: zo.d$b$a */
        public static final class a extends b {
            @Override // p542zo.C10562d.b
            /* JADX INFO: renamed from: b */
            public final void mo15971b(C10574p c10574p) throws IOException {
                C5207g.m11111f(c10574p, "stream");
                c10574p.m19566c(ErrorCode.REFUSED_STREAM, null);
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo15970a(C10562d c10562d, C10578t c10578t) {
            C5207g.m11111f(c10562d, "connection");
            C5207g.m11111f(c10578t, "settings");
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo15971b(C10574p c10574p) throws IOException;
    }

    /* JADX INFO: renamed from: zo.d$c */
    public final class c implements C10573o.c, InterfaceC2041a<C9072e> {

        /* JADX INFO: renamed from: a */
        public final C10573o f52700a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C10562d f52701b;

        public c(C10562d c10562d, C10573o c10573o) {
            C5207g.m11111f(c10562d, "this$0");
            this.f52701b = c10562d;
            this.f52700a = c10573o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [zo.d] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3, types: [sl.e] */
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C9072e mo807E() throws Throwable {
            Throwable th2;
            ErrorCode errorCode;
            C10562d c10562d = this.f52701b;
            C10573o c10573o = this.f52700a;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    c10573o.m19560b(this);
                    while (c10573o.m19559a(false, this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                    try {
                        errorCode2 = ErrorCode.CANCEL;
                        c10562d.m19543a(errorCode, errorCode2, null);
                    } catch (IOException e11) {
                        e10 = e11;
                        errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        c10562d.m19543a(errorCode2, errorCode2, e10);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    c10562d.m19543a(errorCode, errorCode2, e10);
                    C9347b.m17697d(c10573o);
                    throw th2;
                }
            } catch (IOException e12) {
                e10 = e12;
                errorCode = errorCode2;
            } catch (Throwable th4) {
                th2 = th4;
                errorCode = errorCode2;
                c10562d.m19543a(errorCode, errorCode2, e10);
                C9347b.m17697d(c10573o);
                throw th2;
            }
            C9347b.m17697d(c10573o);
            c10562d = C9072e.f47360a;
            return c10562d;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p542zo.C10573o.c
        /* JADX INFO: renamed from: a */
        public final void mo19549a(int i10, List list) {
            C5207g.m11111f(list, "requestHeaders");
            C10562d c10562d = this.f52701b;
            c10562d.getClass();
            synchronized (c10562d) {
                try {
                    if (c10562d.f52677V.contains(Integer.valueOf(i10))) {
                        c10562d.m19541E(i10, ErrorCode.PROTOCOL_ERROR);
                        return;
                    }
                    c10562d.f52677V.add(Integer.valueOf(i10));
                    c10562d.f52687j.m18258c(new C10569k(c10562d.f52681d + '[' + i10 + "] onRequest", c10562d, i10, list), 0L);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p542zo.C10573o.c
        /* JADX INFO: renamed from: b */
        public final void mo19550b() {
        }

        @Override // p542zo.C10573o.c
        /* JADX INFO: renamed from: c */
        public final void mo19551c(C10578t c10578t) {
            C10562d c10562d = this.f52701b;
            c10562d.f52686i.m18258c(new C10566h(C5207g.m11116k(" applyAndAckSettings", c10562d.f52681d), this, c10578t), 0L);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p542zo.C10573o.c
        /* JADX INFO: renamed from: d */
        public final void mo19552d(int i10, long j10) {
            if (i10 == 0) {
                C10562d c10562d = this.f52701b;
                synchronized (c10562d) {
                    try {
                        c10562d.f52673R += j10;
                        c10562d.notifyAll();
                        C9072e c9072e = C9072e.f47360a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            C10574p c10574pM19545l = this.f52701b.m19545l(i10);
            if (c10574pM19545l != null) {
                synchronized (c10574pM19545l) {
                    c10574pM19545l.f52758f += j10;
                    if (j10 > 0) {
                        c10574pM19545l.notifyAll();
                    }
                    C9072e c9072e2 = C9072e.f47360a;
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p542zo.C10573o.c
        /* JADX INFO: renamed from: e */
        public final void mo19553e(int i10, int i11, boolean z10) {
            if (!z10) {
                C10562d c10562d = this.f52701b;
                c10562d.f52686i.m18258c(new C10565g(C5207g.m11116k(" ping", c10562d.f52681d), this.f52701b, i10, i11), 0L);
                return;
            }
            C10562d c10562d2 = this.f52701b;
            synchronized (c10562d2) {
                try {
                    if (i10 == 1) {
                        c10562d2.f52664I++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            c10562d2.notifyAll();
                        }
                        C9072e c9072e = C9072e.f47360a;
                    } else {
                        c10562d2.f52666K++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p542zo.C10573o.c
        /* JADX INFO: renamed from: f */
        public final void mo19554f() {
        }

        @Override // p542zo.C10573o.c
        /* JADX INFO: renamed from: g */
        public final void mo19555g(int i10, ErrorCode errorCode) {
            C10562d c10562d = this.f52701b;
            c10562d.getClass();
            if (i10 != 0 && (i10 & 1) == 0) {
                c10562d.f52687j.m18258c(new C10570l(c10562d.f52681d + '[' + i10 + "] onReset", c10562d, i10, errorCode), 0L);
                return;
            }
            C10574p c10574pM19546q = c10562d.m19546q(i10);
            if (c10574pM19546q == null) {
                return;
            }
            synchronized (c10574pM19546q) {
                try {
                    if (c10574pM19546q.f52765m == null) {
                        c10574pM19546q.f52765m = errorCode;
                        c10574pM19546q.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p542zo.C10573o.c
        /* JADX INFO: renamed from: i */
        public final void mo19556i(int i10, List list, boolean z10) {
            C5207g.m11111f(list, "headerBlock");
            this.f52701b.getClass();
            if (i10 != 0 && (i10 & 1) == 0) {
                C10562d c10562d = this.f52701b;
                c10562d.getClass();
                c10562d.f52687j.m18258c(new C10568j(c10562d.f52681d + '[' + i10 + "] onHeaders", c10562d, i10, list, z10), 0L);
                return;
            }
            C10562d c10562d2 = this.f52701b;
            synchronized (c10562d2) {
                try {
                    C10574p c10574pM19545l = c10562d2.m19545l(i10);
                    if (c10574pM19545l != null) {
                        C9072e c9072e = C9072e.f47360a;
                        c10574pM19545l.m19572i(C9347b.m17715v(list), z10);
                        return;
                    }
                    if (c10562d2.f52684g) {
                        return;
                    }
                    if (i10 <= c10562d2.f52682e) {
                        return;
                    }
                    if (i10 % 2 == c10562d2.f52683f % 2) {
                        return;
                    }
                    C10574p c10574p = new C10574p(i10, c10562d2, false, z10, C9347b.m17715v(list));
                    c10562d2.f52682e = i10;
                    c10562d2.f52680c.put(Integer.valueOf(i10), c10574p);
                    c10562d2.f52685h.m18266f().m18258c(new C10564f(c10562d2.f52681d + '[' + i10 + "] onStream", c10562d2, c10574p), 0L);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p542zo.C10573o.c
        /* JADX INFO: renamed from: j */
        public final void mo19557j(int i10, ErrorCode errorCode, ByteString byteString) {
            int i11;
            Object[] array;
            C5207g.m11111f(byteString, "debugData");
            byteString.mo15992q();
            C10562d c10562d = this.f52701b;
            synchronized (c10562d) {
                i11 = 0;
                array = c10562d.f52680c.values().toArray(new C10574p[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                c10562d.f52684g = true;
                C9072e c9072e = C9072e.f47360a;
            }
            C10574p[] c10574pArr = (C10574p[]) array;
            int length = c10574pArr.length;
            while (i11 < length) {
                C10574p c10574p = c10574pArr[i11];
                i11++;
                if (c10574p.f52753a > i10 && c10574p.m19570g()) {
                    ErrorCode errorCode2 = ErrorCode.REFUSED_STREAM;
                    synchronized (c10574p) {
                        C5207g.m11111f(errorCode2, "errorCode");
                        if (c10574p.f52765m == null) {
                            c10574p.f52765m = errorCode2;
                            c10574p.notifyAll();
                        }
                    }
                    this.f52701b.m19546q(c10574p.f52753a);
                }
            }
        }

        @Override // p542zo.C10573o.c
        /* JADX INFO: renamed from: k */
        public final void mo19558k(int i10, int i11, InterfaceC5610g interfaceC5610g, boolean z10) throws IOException {
            boolean z11;
            boolean z12;
            long j10;
            C5207g.m11111f(interfaceC5610g, "source");
            this.f52701b.getClass();
            if (i10 != 0 && (i10 & 1) == 0) {
                C10562d c10562d = this.f52701b;
                c10562d.getClass();
                C5608e c5608e = new C5608e();
                long j11 = i11;
                interfaceC5610g.mo11960o1(j11);
                interfaceC5610g.mo11924j0(c5608e, j11);
                c10562d.f52687j.m18258c(new C10567i(c10562d.f52681d + '[' + i10 + "] onData", c10562d, i10, c5608e, i11, z10), 0L);
                return;
            }
            C10574p c10574pM19545l = this.f52701b.m19545l(i10);
            if (c10574pM19545l == null) {
                this.f52701b.m19541E(i10, ErrorCode.PROTOCOL_ERROR);
                long j12 = i11;
                this.f52701b.m19548w(j12);
                interfaceC5610g.skip(j12);
                return;
            }
            byte[] bArr = C9347b.f48082a;
            C10574p.b bVar = c10574pM19545l.f52761i;
            long j13 = i11;
            bVar.getClass();
            while (j13 > 0) {
                synchronized (bVar.f52776f) {
                    z11 = bVar.f52772b;
                    z12 = bVar.f52774d.f34435b + j13 > bVar.f52771a;
                    C9072e c9072e = C9072e.f47360a;
                }
                if (z12) {
                    interfaceC5610g.skip(j13);
                    bVar.f52776f.m19568e(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z11) {
                    interfaceC5610g.skip(j13);
                    break;
                }
                long jMo11924j0 = interfaceC5610g.mo11924j0(bVar.f52773c, j13);
                if (jMo11924j0 == -1) {
                    throw new EOFException();
                }
                j13 -= jMo11924j0;
                C10574p c10574p = bVar.f52776f;
                synchronized (c10574p) {
                    if (bVar.f52775e) {
                        C5608e c5608e2 = bVar.f52773c;
                        j10 = c5608e2.f34435b;
                        c5608e2.m11951b();
                    } else {
                        C5608e c5608e3 = bVar.f52774d;
                        boolean z13 = c5608e3.f34435b == 0;
                        c5608e3.mo11940O0(bVar.f52773c);
                        if (z13) {
                            c10574p.notifyAll();
                        }
                        j10 = 0;
                    }
                }
                if (j10 > 0) {
                    bVar.m19575a(j10);
                }
            }
            if (z10) {
                c10574pM19545l.m19572i(C9347b.f48083b, true);
            }
        }
    }

    /* JADX INFO: renamed from: zo.d$d */
    public static final class d extends AbstractC9765a {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C10562d f52702e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f52703f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, C10562d c10562d, long j10) {
            super(str, true);
            this.f52702e = c10562d;
            this.f52703f = j10;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p442vo.AbstractC9765a
        /* JADX INFO: renamed from: a */
        public final long mo18071a() {
            C10562d c10562d;
            boolean z10;
            synchronized (this.f52702e) {
                c10562d = this.f52702e;
                long j10 = c10562d.f52664I;
                long j11 = c10562d.f52663H;
                if (j10 < j11) {
                    z10 = true;
                } else {
                    c10562d.f52663H = j11 + 1;
                    z10 = false;
                }
            }
            if (z10) {
                c10562d.m19544b(null);
                return -1L;
            }
            try {
                c10562d.f52675T.m19583r(1, 0, false);
            } catch (IOException e10) {
                c10562d.m19544b(e10);
            }
            return this.f52703f;
        }
    }

    /* JADX INFO: renamed from: zo.d$e */
    public static final class e extends AbstractC9765a {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C10562d f52704e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f52705f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ErrorCode f52706g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, C10562d c10562d, int i10, ErrorCode errorCode) {
            super(str, true);
            this.f52704e = c10562d;
            this.f52705f = i10;
            this.f52706g = errorCode;
        }

        @Override // p442vo.AbstractC9765a
        /* JADX INFO: renamed from: a */
        public final long mo18071a() {
            C10562d c10562d = this.f52704e;
            try {
                int i10 = this.f52705f;
                ErrorCode errorCode = this.f52706g;
                c10562d.getClass();
                C5207g.m11111f(errorCode, "statusCode");
                c10562d.f52675T.m19584w(i10, errorCode);
            } catch (IOException e10) {
                c10562d.m19544b(e10);
            }
            return -1L;
        }
    }

    /* JADX INFO: renamed from: zo.d$f */
    public static final class f extends AbstractC9765a {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C10562d f52707e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f52708f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ long f52709g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, C10562d c10562d, int i10, long j10) {
            super(str, true);
            this.f52707e = c10562d;
            this.f52708f = i10;
            this.f52709g = j10;
        }

        @Override // p442vo.AbstractC9765a
        /* JADX INFO: renamed from: a */
        public final long mo18071a() {
            C10562d c10562d = this.f52707e;
            try {
                c10562d.f52675T.m19577C(this.f52708f, this.f52709g);
                return -1L;
            } catch (IOException e10) {
                c10562d.m19544b(e10);
                return -1L;
            }
        }
    }

    static {
        C10578t c10578t = new C10578t();
        c10578t.m19588c(7, 65535);
        c10578t.m19588c(5, 16384);
        f52662W = c10578t;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C10562d(a aVar) {
        boolean z10 = aVar.f52690a;
        this.f52678a = z10;
        this.f52679b = aVar.f52696g;
        this.f52680c = new LinkedHashMap();
        String str = aVar.f52693d;
        if (str == null) {
            C5207g.m11117l("connectionName");
            throw null;
        }
        this.f52681d = str;
        this.f52683f = z10 ? 3 : 2;
        C9768d c9768d = aVar.f52691b;
        this.f52685h = c9768d;
        C9767c c9767cM18266f = c9768d.m18266f();
        this.f52686i = c9767cM18266f;
        this.f52687j = c9768d.m18266f();
        this.f52688k = c9768d.m18266f();
        this.f52689l = aVar.f52697h;
        C10578t c10578t = new C10578t();
        if (z10) {
            c10578t.m19588c(7, 16777216);
        }
        this.f52668M = c10578t;
        C10578t c10578t2 = f52662W;
        this.f52669N = c10578t2;
        this.f52673R = c10578t2.m19586a();
        Socket socket = aVar.f52692c;
        if (socket == null) {
            C5207g.m11117l("socket");
            throw null;
        }
        this.f52674S = socket;
        InterfaceC5609f interfaceC5609f = aVar.f52695f;
        if (interfaceC5609f == null) {
            C5207g.m11117l("sink");
            throw null;
        }
        this.f52675T = new C10575q(interfaceC5609f, z10);
        InterfaceC5610g interfaceC5610g = aVar.f52694e;
        if (interfaceC5610g == null) {
            C5207g.m11117l("source");
            throw null;
        }
        this.f52676U = new c(this, new C10573o(interfaceC5610g, z10));
        this.f52677V = new LinkedHashSet();
        int i10 = aVar.f52698i;
        if (i10 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i10);
            c9767cM18266f.m18258c(new d(C5207g.m11116k(" ping", str), this, nanos), nanos);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: C */
    public final void m19540C(int i10, boolean z10, C5608e c5608e, long j10) throws IOException {
        long j11;
        long j12;
        int iMin;
        long j13;
        if (j10 == 0) {
            this.f52675T.m19580b(z10, i10, c5608e, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j11 = this.f52672Q;
                            j12 = this.f52673R;
                            if (j11 >= j12) {
                                if (!this.f52680c.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th2;
                }
                iMin = Math.min((int) Math.min(j10, j12 - j11), this.f52675T.f52782d);
                j13 = iMin;
                this.f52672Q += j13;
                C9072e c9072e = C9072e.f47360a;
            }
            j10 -= j13;
            this.f52675T.m19580b(z10 && j10 == 0, i10, c5608e, iMin);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m19541E(int i10, ErrorCode errorCode) {
        C5207g.m11111f(errorCode, "errorCode");
        this.f52686i.m18258c(new e(this.f52681d + '[' + i10 + "] writeSynReset", this, i10, errorCode), 0L);
    }

    /* JADX INFO: renamed from: G */
    public final void m19542G(int i10, long j10) {
        this.f52686i.m18258c(new f(this.f52681d + '[' + i10 + "] windowUpdate", this, i10, j10), 0L);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m19543a(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i10;
        Object[] array;
        C5207g.m11111f(errorCode, "connectionCode");
        C5207g.m11111f(errorCode2, "streamCode");
        byte[] bArr = C9347b.f48082a;
        try {
            m19547r(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f52680c.isEmpty()) {
                array = this.f52680c.values().toArray(new C10574p[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                this.f52680c.clear();
            } else {
                array = null;
            }
            C9072e c9072e = C9072e.f47360a;
        }
        C10574p[] c10574pArr = (C10574p[]) array;
        if (c10574pArr != null) {
            for (C10574p c10574p : c10574pArr) {
                try {
                    c10574p.m19566c(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f52675T.close();
        } catch (IOException unused3) {
        }
        try {
            this.f52674S.close();
        } catch (IOException unused4) {
        }
        this.f52686i.m18260f();
        this.f52687j.m18260f();
        this.f52688k.m18260f();
    }

    /* JADX INFO: renamed from: b */
    public final void m19544b(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        m19543a(errorCode, errorCode, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m19543a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void flush() throws IOException {
        C10575q c10575q = this.f52675T;
        synchronized (c10575q) {
            try {
                if (c10575q.f52783e) {
                    throw new IOException("closed");
                }
                c10575q.f52779a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final synchronized C10574p m19545l(int i10) {
        return (C10574p) this.f52680c.get(Integer.valueOf(i10));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final synchronized C10574p m19546q(int i10) {
        C10574p c10574p;
        c10574p = (C10574p) this.f52680c.remove(Integer.valueOf(i10));
        notifyAll();
        return c10574p;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public final void m19547r(ErrorCode errorCode) throws IOException {
        C5207g.m11111f(errorCode, "statusCode");
        synchronized (this.f52675T) {
            try {
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                synchronized (this) {
                    try {
                        if (this.f52684g) {
                            return;
                        }
                        this.f52684g = true;
                        int i10 = this.f52682e;
                        ref$IntRef.f38125a = i10;
                        C9072e c9072e = C9072e.f47360a;
                        this.f52675T.m19582q(i10, errorCode, C9347b.f48082a);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public final synchronized void m19548w(long j10) {
        try {
            long j11 = this.f52670O + j10;
            this.f52670O = j11;
            long j12 = j11 - this.f52671P;
            if (j12 >= this.f52668M.m19586a() / 2) {
                m19542G(0, j12);
                this.f52671P += j12;
            }
        } finally {
        }
    }
}
