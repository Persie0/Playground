package com.bumptech.glide.load.engine;

import ae.C0062b;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.SingleRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p171i6.InterfaceC6203h;
import p258m6.C7485e;
import p272n6.AbstractC7712d;
import p272n6.C7709a;
import p289o5.C7940t;
import p356r5.InterfaceC8732b;
import p392t5.InterfaceC9201g;
import p392t5.InterfaceC9207m;
import p446w2.InterfaceC9806d;
import p449w5.ExecutorServiceC9813a;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2120f<R> implements DecodeJob.InterfaceC2109b<R>, C7709a.d {

    /* JADX INFO: renamed from: U */
    public static final c f10740U = new c();

    /* JADX INFO: renamed from: H */
    public boolean f10741H;

    /* JADX INFO: renamed from: I */
    public boolean f10742I;

    /* JADX INFO: renamed from: J */
    public boolean f10743J;

    /* JADX INFO: renamed from: K */
    public boolean f10744K;

    /* JADX INFO: renamed from: L */
    public InterfaceC9207m<?> f10745L;

    /* JADX INFO: renamed from: M */
    public DataSource f10746M;

    /* JADX INFO: renamed from: N */
    public boolean f10747N;

    /* JADX INFO: renamed from: O */
    public GlideException f10748O;

    /* JADX INFO: renamed from: P */
    public boolean f10749P;

    /* JADX INFO: renamed from: Q */
    public C2121g<?> f10750Q;

    /* JADX INFO: renamed from: R */
    public DecodeJob<R> f10751R;

    /* JADX INFO: renamed from: S */
    public volatile boolean f10752S;

    /* JADX INFO: renamed from: T */
    public boolean f10753T;

    /* JADX INFO: renamed from: a */
    public final e f10754a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7712d.a f10755b;

    /* JADX INFO: renamed from: c */
    public final C2121g.a f10756c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9806d<C2120f<?>> f10757d;

    /* JADX INFO: renamed from: e */
    public final c f10758e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC9201g f10759f;

    /* JADX INFO: renamed from: g */
    public final ExecutorServiceC9813a f10760g;

    /* JADX INFO: renamed from: h */
    public final ExecutorServiceC9813a f10761h;

    /* JADX INFO: renamed from: i */
    public final ExecutorServiceC9813a f10762i;

    /* JADX INFO: renamed from: j */
    public final ExecutorServiceC9813a f10763j;

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f10764k;

    /* JADX INFO: renamed from: l */
    public InterfaceC8732b f10765l;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6203h f10766a;

        public a(InterfaceC6203h interfaceC6203h) {
            this.f10766a = interfaceC6203h;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // java.lang.Runnable
        public final void run() {
            SingleRequest singleRequest = (SingleRequest) this.f10766a;
            singleRequest.f10903b.m15304a();
            synchronized (singleRequest.f10904c) {
                synchronized (C2120f.this) {
                    e eVar = C2120f.this.f10754a;
                    InterfaceC6203h interfaceC6203h = this.f10766a;
                    eVar.getClass();
                    if (eVar.f10772a.contains(new d(interfaceC6203h, C7485e.f41369b))) {
                        C2120f c2120f = C2120f.this;
                        InterfaceC6203h interfaceC6203h2 = this.f10766a;
                        c2120f.getClass();
                        try {
                            ((SingleRequest) interfaceC6203h2).m6398l(c2120f.f10748O, 5);
                        } catch (Throwable th2) {
                            throw new CallbackException(th2);
                        }
                    }
                    C2120f.this.m6324d();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6203h f10768a;

        public b(InterfaceC6203h interfaceC6203h) {
            this.f10768a = interfaceC6203h;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // java.lang.Runnable
        public final void run() {
            SingleRequest singleRequest = (SingleRequest) this.f10768a;
            singleRequest.f10903b.m15304a();
            synchronized (singleRequest.f10904c) {
                synchronized (C2120f.this) {
                    try {
                        e eVar = C2120f.this.f10754a;
                        InterfaceC6203h interfaceC6203h = this.f10768a;
                        eVar.getClass();
                        if (eVar.f10772a.contains(new d(interfaceC6203h, C7485e.f41369b))) {
                            C2120f.this.f10750Q.m6329a();
                            C2120f c2120f = C2120f.this;
                            InterfaceC6203h interfaceC6203h2 = this.f10768a;
                            c2120f.getClass();
                            try {
                                ((SingleRequest) interfaceC6203h2).m6399m(c2120f.f10750Q, c2120f.f10746M, c2120f.f10753T);
                                C2120f.this.m6328h(this.f10768a);
                            } catch (Throwable th2) {
                                throw new CallbackException(th2);
                            }
                        }
                        C2120f.this.m6324d();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$c */
    public static class c {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6203h f10770a;

        /* JADX INFO: renamed from: b */
        public final Executor f10771b;

        public d(InterfaceC6203h interfaceC6203h, Executor executor) {
            this.f10770a = interfaceC6203h;
            this.f10771b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f10770a.equals(((d) obj).f10770a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f10770a.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$e */
    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: a */
        public final List<d> f10772a;

        public e(ArrayList arrayList) {
            this.f10772a = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.f10772a.iterator();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C2120f() {
        throw null;
    }

    public C2120f(ExecutorServiceC9813a executorServiceC9813a, ExecutorServiceC9813a executorServiceC9813a2, ExecutorServiceC9813a executorServiceC9813a3, ExecutorServiceC9813a executorServiceC9813a4, InterfaceC9201g interfaceC9201g, C2121g.a aVar, C7709a.c cVar) {
        c cVar2 = f10740U;
        this.f10754a = new e(new ArrayList(2));
        this.f10755b = new AbstractC7712d.a();
        this.f10764k = new AtomicInteger();
        this.f10760g = executorServiceC9813a;
        this.f10761h = executorServiceC9813a2;
        this.f10762i = executorServiceC9813a3;
        this.f10763j = executorServiceC9813a4;
        this.f10759f = interfaceC9201g;
        this.f10756c = aVar;
        this.f10757d = cVar;
        this.f10758e = cVar2;
    }

    @Override // p272n6.C7709a.d
    /* JADX INFO: renamed from: a */
    public final AbstractC7712d.a mo6281a() {
        return this.f10755b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6322b(InterfaceC6203h interfaceC6203h, Executor executor) {
        try {
            this.f10755b.m15304a();
            e eVar = this.f10754a;
            eVar.getClass();
            eVar.f10772a.add(new d(interfaceC6203h, executor));
            boolean z10 = true;
            if (this.f10747N) {
                m6325e(1);
                executor.execute(new b(interfaceC6203h));
            } else if (this.f10749P) {
                m6325e(1);
                executor.execute(new a(interfaceC6203h));
            } else {
                if (this.f10752S) {
                    z10 = false;
                }
                C0062b.m339d0("Cannot add callbacks to a cancelled EngineJob", z10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m6323c() {
        if (m6326f()) {
            return;
        }
        this.f10752S = true;
        DecodeJob<R> decodeJob = this.f10751R;
        decodeJob.f10648Z = true;
        InterfaceC2117c interfaceC2117c = decodeJob.f10646X;
        if (interfaceC2117c != null) {
            interfaceC2117c.cancel();
        }
        InterfaceC9201g interfaceC9201g = this.f10759f;
        InterfaceC8732b interfaceC8732b = this.f10765l;
        C2119e c2119e = (C2119e) interfaceC9201g;
        synchronized (c2119e) {
            try {
                C7940t c7940t = c2119e.f10716a;
                c7940t.getClass();
                Map map = (Map) (this.f10744K ? c7940t.f43257b : c7940t.f43256a);
                if (equals(map.get(interfaceC8732b))) {
                    map.remove(interfaceC8732b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m6324d() {
        C2121g<?> c2121g;
        synchronized (this) {
            this.f10755b.m15304a();
            C0062b.m339d0("Not yet complete!", m6326f());
            int iDecrementAndGet = this.f10764k.decrementAndGet();
            C0062b.m339d0("Can't decrement below 0", iDecrementAndGet >= 0);
            if (iDecrementAndGet == 0) {
                c2121g = this.f10750Q;
                m6327g();
            } else {
                c2121g = null;
            }
        }
        if (c2121g != null) {
            c2121g.m6330e();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized void m6325e(int i10) {
        C2121g<?> c2121g;
        try {
            C0062b.m339d0("Not yet complete!", m6326f());
            if (this.f10764k.getAndAdd(i10) == 0 && (c2121g = this.f10750Q) != null) {
                c2121g.m6329a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6326f() {
        return this.f10749P || this.f10747N || this.f10752S;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized void m6327g() {
        boolean zM6298a;
        try {
            if (this.f10765l == null) {
                throw new IllegalArgumentException();
            }
            this.f10754a.f10772a.clear();
            this.f10765l = null;
            this.f10750Q = null;
            this.f10745L = null;
            this.f10749P = false;
            this.f10752S = false;
            this.f10747N = false;
            this.f10753T = false;
            DecodeJob<R> decodeJob = this.f10751R;
            DecodeJob.C2113f c2113f = decodeJob.f10656g;
            synchronized (c2113f) {
                try {
                    c2113f.f10670a = true;
                    zM6298a = c2113f.m6298a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zM6298a) {
                decodeJob.m6293v();
            }
            this.f10751R = null;
            this.f10748O = null;
            this.f10746M = null;
            this.f10757d.mo11464a(this);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m6328h(InterfaceC6203h interfaceC6203h) {
        try {
            this.f10755b.m15304a();
            this.f10754a.f10772a.remove(new d(interfaceC6203h, C7485e.f41369b));
            if (this.f10754a.f10772a.isEmpty()) {
                m6323c();
                if ((this.f10747N || this.f10749P) && this.f10764k.get() == 0) {
                    m6327g();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
