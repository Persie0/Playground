package p467wo;

import dm.C5207g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jp.C6545m;
import okhttp3.internal.connection.C8077a;
import p034bp.C1640h;
import p118fe.C5509a;
import p124fp.C5604a;
import p290o6.C7965k0;
import p349qo.C8656b;
import p422uo.C9597a;
import p442vo.C9767c;
import p493xo.C10261a;
import p493xo.C10262b;
import p493xo.C10266f;
import p493xo.C10268h;
import sl.C9072e;
import so.AbstractC9093k;
import so.C9100r;
import so.C9101s;
import so.C9106x;
import so.InterfaceC9086d;
import so.InterfaceC9087e;
import tl.C9327o;
import to.C9347b;

/* JADX INFO: renamed from: wo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C9990e implements InterfaceC9086d {

    /* JADX INFO: renamed from: H */
    public boolean f50768H;

    /* JADX INFO: renamed from: I */
    public boolean f50769I;

    /* JADX INFO: renamed from: J */
    public boolean f50770J;

    /* JADX INFO: renamed from: K */
    public volatile boolean f50771K;

    /* JADX INFO: renamed from: L */
    public volatile C9988c f50772L;

    /* JADX INFO: renamed from: M */
    public volatile C8077a f50773M;

    /* JADX INFO: renamed from: a */
    public final C9100r f50774a;

    /* JADX INFO: renamed from: b */
    public final C9101s f50775b;

    /* JADX INFO: renamed from: c */
    public final boolean f50776c;

    /* JADX INFO: renamed from: d */
    public final C9991f f50777d;

    /* JADX INFO: renamed from: e */
    public final AbstractC9093k f50778e;

    /* JADX INFO: renamed from: f */
    public final c f50779f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f50780g;

    /* JADX INFO: renamed from: h */
    public Object f50781h;

    /* JADX INFO: renamed from: i */
    public C9989d f50782i;

    /* JADX INFO: renamed from: j */
    public C8077a f50783j;

    /* JADX INFO: renamed from: k */
    public boolean f50784k;

    /* JADX INFO: renamed from: l */
    public C9988c f50785l;

    /* JADX INFO: renamed from: wo.e$a */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC9087e f50786a;

        /* JADX INFO: renamed from: b */
        public volatile AtomicInteger f50787b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C9990e f50788c;

        public a(C9990e c9990e, C6545m.a aVar) {
            C5207g.m11111f(c9990e, "this$0");
            this.f50788c = c9990e;
            this.f50786a = aVar;
            this.f50787b = new AtomicInteger(0);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // java.lang.Runnable
        public final void run() {
            C9100r c9100r;
            String strM11116k = C5207g.m11116k(this.f50788c.f50775b.f47542a.m17325f(), "OkHttp ");
            C9990e c9990e = this.f50788c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strM11116k);
            try {
                c9990e.f50779f.m11916h();
                boolean z10 = false;
                try {
                    try {
                        try {
                            ((C6545m.a) this.f50786a).m13135b(c9990e.m18574g());
                            c9100r = c9990e.f50774a;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            if (z10) {
                                C1640h c1640h = C1640h.f9199a;
                                C1640h c1640h2 = C1640h.f9199a;
                                String strM11116k2 = C5207g.m11116k(C9990e.m18569b(c9990e), "Callback failure for ");
                                c1640h2.getClass();
                                C1640h.m5333i(4, strM11116k2, e);
                            } else {
                                ((C6545m.a) this.f50786a).m13134a(e);
                            }
                            c9100r = c9990e.f50774a;
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = true;
                            c9990e.cancel();
                            if (!z10) {
                                IOException iOException = new IOException(C5207g.m11116k(th, "canceled due to "));
                                C8656b.m16899g(iOException, th);
                                ((C6545m.a) this.f50786a).m13134a(iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        c9990e.f50774a.f47508a.m15801c(this);
                        throw th3;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Throwable th4) {
                    th = th4;
                }
                c9100r.f47508a.m15801c(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th5) {
                threadCurrentThread.setName(name);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: wo.e$b */
    public static final class b extends WeakReference<C9990e> {

        /* JADX INFO: renamed from: a */
        public final Object f50789a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9990e c9990e, Object obj) {
            super(c9990e);
            C5207g.m11111f(c9990e, "referent");
            this.f50789a = obj;
        }
    }

    /* JADX INFO: renamed from: wo.e$c */
    public static final class c extends C5604a {
        public c() {
        }

        @Override // p124fp.C5604a
        /* JADX INFO: renamed from: k */
        public final void mo11919k() {
            C9990e.this.cancel();
        }
    }

    public C9990e(C9100r c9100r, C9101s c9101s, boolean z10) {
        C5207g.m11111f(c9100r, "client");
        C5207g.m11111f(c9101s, "originalRequest");
        this.f50774a = c9100r;
        this.f50775b = c9101s;
        this.f50776c = z10;
        this.f50777d = (C9991f) c9100r.f47509b.f47694a;
        AbstractC9093k abstractC9093k = (AbstractC9093k) ((C5509a) c9100r.f47512e).f34148b;
        byte[] bArr = C9347b.f48082a;
        C5207g.m11111f(abstractC9093k, "$this_asFactory");
        this.f50778e = abstractC9093k;
        c cVar = new c();
        cVar.mo11986g(0, TimeUnit.MILLISECONDS);
        this.f50779f = cVar;
        this.f50780g = new AtomicBoolean();
        this.f50770J = true;
    }

    /* JADX INFO: renamed from: b */
    public static final String m18569b(C9990e c9990e) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c9990e.f50771K ? "canceled " : "");
        sb2.append(c9990e.f50776c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(c9990e.f50775b.f47542a.m17325f());
        return sb2.toString();
    }

    @Override // so.InterfaceC9086d
    /* JADX INFO: renamed from: U */
    public final void mo17287U(C6545m.a aVar) {
        a aVarM15799a;
        if (!this.f50780g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        C1640h c1640h = C1640h.f9199a;
        this.f50781h = C1640h.f9199a.mo5323g();
        this.f50778e.getClass();
        C7965k0 c7965k0 = this.f50774a.f47508a;
        a aVar2 = new a(this, aVar);
        c7965k0.getClass();
        synchronized (c7965k0) {
            ((ArrayDeque) c7965k0.f43359b).add(aVar2);
            C9990e c9990e = aVar2.f50788c;
            if (!c9990e.f50776c && (aVarM15799a = c7965k0.m15799a(c9990e.f50775b.f47542a.f47458d)) != null) {
                aVar2.f50787b = aVarM15799a.f50787b;
            }
            C9072e c9072e = C9072e.f47360a;
        }
        c7965k0.m15802d();
    }

    /* JADX INFO: renamed from: c */
    public final void m18570c(C8077a c8077a) {
        byte[] bArr = C9347b.f48082a;
        if (!(this.f50783j == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f50783j = c8077a;
        c8077a.f43882p.add(new b(this, this.f50781h));
    }

    @Override // so.InterfaceC9086d
    public final void cancel() {
        Socket socket;
        if (this.f50771K) {
            return;
        }
        this.f50771K = true;
        C9988c c9988c = this.f50772L;
        if (c9988c != null) {
            c9988c.f50743d.cancel();
        }
        C8077a c8077a = this.f50773M;
        if (c8077a != null && (socket = c8077a.f43869c) != null) {
            C9347b.m17698e(socket);
        }
        this.f50778e.getClass();
    }

    public final Object clone() {
        return new C9990e(this.f50774a, this.f50775b, this.f50776c);
    }

    /* JADX INFO: renamed from: d */
    public final <E extends IOException> E m18571d(E e10) {
        E interruptedIOException;
        Socket socketM18577j;
        byte[] bArr = C9347b.f48082a;
        C8077a c8077a = this.f50783j;
        if (c8077a != null) {
            synchronized (c8077a) {
                try {
                    socketM18577j = m18577j();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f50783j == null) {
                if (socketM18577j != null) {
                    C9347b.m17698e(socketM18577j);
                }
                this.f50778e.getClass();
            } else {
                if (!(socketM18577j == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f50784k && this.f50779f.m11917i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e10 != null) {
                interruptedIOException.initCause(e10);
            }
        } else {
            interruptedIOException = e10;
        }
        if (e10 != null) {
            AbstractC9093k abstractC9093k = this.f50778e;
            C5207g.m11108c(interruptedIOException);
            abstractC9093k.getClass();
        } else {
            this.f50778e.getClass();
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: e */
    public final C9106x m18572e() {
        if (!this.f50780g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f50779f.m11916h();
        C1640h c1640h = C1640h.f9199a;
        this.f50781h = C1640h.f9199a.mo5323g();
        this.f50778e.getClass();
        try {
            C7965k0 c7965k0 = this.f50774a.f47508a;
            synchronized (c7965k0) {
                try {
                    ((ArrayDeque) c7965k0.f43361d).add(this);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C9106x c9106xM18574g = m18574g();
            C7965k0 c7965k1 = this.f50774a.f47508a;
            c7965k1.getClass();
            c7965k1.m15800b((ArrayDeque) c7965k1.f43361d, this);
            return c9106xM18574g;
        } catch (Throwable th3) {
            C7965k0 c7965k2 = this.f50774a.f47508a;
            c7965k2.getClass();
            c7965k2.m15800b((ArrayDeque) c7965k2.f43361d, this);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18573f(boolean z10) {
        C9988c c9988c;
        synchronized (this) {
            try {
                if (!this.f50770J) {
                    throw new IllegalStateException("released".toString());
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (c9988c = this.f50772L) != null) {
            c9988c.f50743d.cancel();
            c9988c.f50740a.m18575h(c9988c, true, true, null);
        }
        this.f50785l = null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: g */
    public final C9106x m18574g() throws Throwable {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        C9327o.m17684D(this.f50774a.f47510c, arrayList);
        arrayList.add(new C10268h(this.f50774a));
        arrayList.add(new C10261a(this.f50774a.f47517j));
        arrayList.add(new C9597a(this.f50774a.f47518k));
        arrayList.add(C9986a.f50735a);
        if (!this.f50776c) {
            C9327o.m17684D(this.f50774a.f47511d, arrayList);
        }
        arrayList.add(new C10262b(this.f50776c));
        C9101s c9101s = this.f50775b;
        C9100r c9100r = this.f50774a;
        try {
            C9106x c9106xM19235c = new C10266f(this, arrayList, 0, null, c9101s, c9100r.f47504R, c9100r.f47505S, c9100r.f47506T).m19235c(this.f50775b);
            if (this.f50771K) {
                C9347b.m17697d(c9106xM19235c);
                throw new IOException("Canceled");
            }
            m18576i(null);
            return c9106xM19235c;
        } catch (IOException e10) {
            try {
                IOException iOExceptionM18576i = m18576i(e10);
                if (iOExceptionM18576i == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionM18576i;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    m18576i(null);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
            if (!z10) {
                m18576i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002c A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:10:0x001a, B:20:0x002c, B:22:0x0031, B:23:0x0034, B:25:0x003a, B:30:0x0045, B:32:0x004a, B:37:0x0055, B:16:0x0025), top: B:62:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0031 A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:10:0x001a, B:20:0x002c, B:22:0x0031, B:23:0x0034, B:25:0x003a, B:30:0x0045, B:32:0x004a, B:37:0x0055, B:16:0x0025), top: B:62:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    /* JADX INFO: renamed from: h */
    public final <E extends IOException> E m18575h(C9988c c9988c, boolean z10, boolean z11, E e10) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        C5207g.m11111f(c9988c, "exchange");
        if (!C5207g.m11106a(c9988c, this.f50772L)) {
            return e10;
        }
        synchronized (this) {
            z12 = false;
            if (z10) {
                try {
                    if (this.f50768H) {
                        if (z10) {
                            this.f50768H = false;
                        }
                        if (z11) {
                            this.f50769I = false;
                        }
                        z14 = this.f50768H;
                        if (z14) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (!z14) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                    } else if (z11 || !this.f50769I) {
                        z13 = false;
                    } else {
                        if (z10) {
                            this.f50768H = false;
                        }
                        if (z11) {
                            this.f50769I = false;
                        }
                        z14 = this.f50768H;
                        if (z14 || this.f50769I) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (!z14 && !this.f50769I && !this.f50770J) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                if (z11) {
                }
                z13 = false;
            }
            C9072e c9072e = C9072e.f47360a;
        }
        if (z12) {
            this.f50772L = null;
            C8077a c8077a = this.f50783j;
            if (c8077a != null) {
                synchronized (c8077a) {
                    c8077a.f43879m++;
                }
            }
        }
        return z13 ? (E) m18571d(e10) : e10;
    }

    /* JADX INFO: renamed from: i */
    public final IOException m18576i(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f50770J) {
                this.f50770J = false;
                if (!this.f50768H && !this.f50769I) {
                    z10 = true;
                }
            }
            C9072e c9072e = C9072e.f47360a;
        }
        if (z10) {
            iOException = m18571d(iOException);
        }
        return iOException;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final Socket m18577j() {
        C8077a c8077a = this.f50783j;
        C5207g.m11108c(c8077a);
        byte[] bArr = C9347b.f48082a;
        ArrayList arrayList = c8077a.f43882p;
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (C5207g.m11106a(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (!(i10 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i10);
        this.f50783j = null;
        if (arrayList.isEmpty()) {
            c8077a.f43883q = System.nanoTime();
            C9991f c9991f = this.f50777d;
            c9991f.getClass();
            byte[] bArr2 = C9347b.f48082a;
            boolean z11 = c8077a.f43876j;
            C9767c c9767c = c9991f.f50793c;
            if (z11 || c9991f.f50791a == 0) {
                c8077a.f43876j = true;
                ConcurrentLinkedQueue<C8077a> concurrentLinkedQueue = c9991f.f50795e;
                concurrentLinkedQueue.remove(c8077a);
                if (concurrentLinkedQueue.isEmpty()) {
                    c9767c.m18256a();
                }
                z10 = true;
            } else {
                c9767c.m18258c(c9991f.f50794d, 0L);
            }
            if (z10) {
                Socket socket = c8077a.f43870d;
                C5207g.m11108c(socket);
                return socket;
            }
        }
        return null;
    }

    @Override // so.InterfaceC9086d
    /* JADX INFO: renamed from: l */
    public final boolean mo17288l() {
        return this.f50771K;
    }

    @Override // so.InterfaceC9086d
    /* JADX INFO: renamed from: q */
    public final C9101s mo17289q() {
        return this.f50775b;
    }
}
