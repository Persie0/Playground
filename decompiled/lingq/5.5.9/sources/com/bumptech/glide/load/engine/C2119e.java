package com.bumptech.glide.load.engine;

import ae.C0062b;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C2085g;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.SingleRequest;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import p003a2.C0009a;
import p171i6.InterfaceC6203h;
import p258m6.C7482b;
import p258m6.C7488h;
import p258m6.C7489i;
import p272n6.C7709a;
import p289o5.C7940t;
import p338qd.C8584v;
import p356r5.C8735e;
import p356r5.InterfaceC8732b;
import p392t5.AbstractC9200f;
import p392t5.C9202h;
import p392t5.C9203i;
import p392t5.C9209o;
import p392t5.InterfaceC9201g;
import p392t5.InterfaceC9207m;
import p429v5.C9647c;
import p429v5.C9648d;
import p429v5.C9649e;
import p429v5.C9651g;
import p429v5.InterfaceC9645a;
import p429v5.InterfaceC9652h;
import p449w5.ExecutorServiceC9813a;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2119e implements InterfaceC9201g, InterfaceC9652h.a, C2121g.a {

    /* JADX INFO: renamed from: h */
    public static final boolean f10715h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    public final C7940t f10716a;

    /* JADX INFO: renamed from: b */
    public final C9203i f10717b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9652h f10718c;

    /* JADX INFO: renamed from: d */
    public final b f10719d;

    /* JADX INFO: renamed from: e */
    public final C9209o f10720e;

    /* JADX INFO: renamed from: f */
    public final a f10721f;

    /* JADX INFO: renamed from: g */
    public final C2115a f10722g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final DecodeJob.InterfaceC2112e f10723a;

        /* JADX INFO: renamed from: b */
        public final C7709a.c f10724b = C7709a.m15302a(150, new C10597a());

        /* JADX INFO: renamed from: c */
        public int f10725c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.e$a$a, reason: collision with other inner class name */
        public class C10597a implements C7709a.b<DecodeJob<?>> {
            public C10597a() {
            }

            @Override // p272n6.C7709a.b
            /* JADX INFO: renamed from: a */
            public final DecodeJob<?> mo6320a() {
                a aVar = a.this;
                return new DecodeJob<>(aVar.f10723a, aVar.f10724b);
            }
        }

        public a(c cVar) {
            this.f10723a = cVar;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.e$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final ExecutorServiceC9813a f10727a;

        /* JADX INFO: renamed from: b */
        public final ExecutorServiceC9813a f10728b;

        /* JADX INFO: renamed from: c */
        public final ExecutorServiceC9813a f10729c;

        /* JADX INFO: renamed from: d */
        public final ExecutorServiceC9813a f10730d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC9201g f10731e;

        /* JADX INFO: renamed from: f */
        public final C2121g.a f10732f;

        /* JADX INFO: renamed from: g */
        public final C7709a.c f10733g = C7709a.m15302a(150, new a());

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.e$b$a */
        public class a implements C7709a.b<C2120f<?>> {
            public a() {
            }

            @Override // p272n6.C7709a.b
            /* JADX INFO: renamed from: a */
            public final C2120f<?> mo6320a() {
                b bVar = b.this;
                return new C2120f<>(bVar.f10727a, bVar.f10728b, bVar.f10729c, bVar.f10730d, bVar.f10731e, bVar.f10732f, bVar.f10733g);
            }
        }

        public b(ExecutorServiceC9813a executorServiceC9813a, ExecutorServiceC9813a executorServiceC9813a2, ExecutorServiceC9813a executorServiceC9813a3, ExecutorServiceC9813a executorServiceC9813a4, InterfaceC9201g interfaceC9201g, C2121g.a aVar) {
            this.f10727a = executorServiceC9813a;
            this.f10728b = executorServiceC9813a2;
            this.f10729c = executorServiceC9813a3;
            this.f10730d = executorServiceC9813a4;
            this.f10731e = interfaceC9201g;
            this.f10732f = aVar;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.e$c */
    public static class c implements DecodeJob.InterfaceC2112e {

        /* JADX INFO: renamed from: a */
        public final InterfaceC9645a.a f10735a;

        /* JADX INFO: renamed from: b */
        public volatile InterfaceC9645a f10736b;

        public c(InterfaceC9645a.a aVar) {
            this.f10735a = aVar;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final InterfaceC9645a m6321a() {
            if (this.f10736b == null) {
                synchronized (this) {
                    if (this.f10736b == null) {
                        C9647c c9647c = (C9647c) this.f10735a;
                        C9649e c9649e = (C9649e) c9647c.f49426b;
                        File cacheDir = c9649e.f49432a.getCacheDir();
                        C9648d c9648d = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = c9649e.f49433b;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            c9648d = new C9648d(cacheDir, c9647c.f49425a);
                        }
                        this.f10736b = c9648d;
                    }
                    if (this.f10736b == null) {
                        this.f10736b = new C8584v();
                    }
                }
            }
            return this.f10736b;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.e$d */
    public class d {

        /* JADX INFO: renamed from: a */
        public final C2120f<?> f10737a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC6203h f10738b;

        public d(InterfaceC6203h interfaceC6203h, C2120f<?> c2120f) {
            this.f10738b = interfaceC6203h;
            this.f10737a = c2120f;
        }
    }

    public C2119e(InterfaceC9652h interfaceC9652h, InterfaceC9645a.a aVar, ExecutorServiceC9813a executorServiceC9813a, ExecutorServiceC9813a executorServiceC9813a2, ExecutorServiceC9813a executorServiceC9813a3, ExecutorServiceC9813a executorServiceC9813a4) {
        this.f10718c = interfaceC9652h;
        c cVar = new c(aVar);
        C2115a c2115a = new C2115a();
        this.f10722g = c2115a;
        synchronized (this) {
            synchronized (c2115a) {
                c2115a.f10684d = this;
            }
        }
        this.f10717b = new C9203i(0);
        this.f10716a = new C7940t(1);
        this.f10719d = new b(executorServiceC9813a, executorServiceC9813a2, executorServiceC9813a3, executorServiceC9813a4, this, this);
        this.f10721f = new a(cVar);
        this.f10720e = new C9209o();
        ((C9651g) interfaceC9652h).f49434d = this;
    }

    /* JADX INFO: renamed from: d */
    public static void m6314d(String str, long j10, InterfaceC8732b interfaceC8732b) {
        StringBuilder sbM26o = C0009a.m26o(str, " in ");
        sbM26o.append(C7488h.m14872a(j10));
        sbM26o.append("ms, key: ");
        sbM26o.append(interfaceC8732b);
        Log.v("Engine", sbM26o.toString());
    }

    /* JADX INFO: renamed from: e */
    public static void m6315e(InterfaceC9207m interfaceC9207m) {
        if (!(interfaceC9207m instanceof C2121g)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C2121g) interfaceC9207m).m6330e();
    }

    @Override // com.bumptech.glide.load.engine.C2121g.a
    /* JADX INFO: renamed from: a */
    public final void mo6316a(InterfaceC8732b interfaceC8732b, C2121g<?> c2121g) {
        C2115a c2115a = this.f10722g;
        synchronized (c2115a) {
            try {
                C2115a.a aVar = (C2115a.a) c2115a.f10682b.remove(interfaceC8732b);
                if (aVar != null) {
                    aVar.f10687c = null;
                    aVar.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c2121g.f10773a) {
            ((C9651g) this.f10718c).m14876d(interfaceC8732b, c2121g);
        } else {
            this.f10720e.m17547a(c2121g, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public final d m6317b(C2085g c2085g, Object obj, InterfaceC8732b interfaceC8732b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC9200f abstractC9200f, C7482b c7482b, boolean z10, boolean z11, C8735e c8735e, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC6203h interfaceC6203h, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f10715h) {
            int i12 = C7488h.f41373b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j10 = jElapsedRealtimeNanos;
        this.f10717b.getClass();
        C9202h c9202h = new C9202h(obj, interfaceC8732b, i10, i11, c7482b, cls, cls2, c8735e);
        synchronized (this) {
            try {
                C2121g<?> c2121gM6318c = m6318c(c9202h, z12, j10);
                if (c2121gM6318c == null) {
                    return m6319f(c2085g, obj, interfaceC8732b, i10, i11, cls, cls2, priority, abstractC9200f, c7482b, z10, z11, c8735e, z12, z13, z14, z15, interfaceC6203h, executor, c9202h, j10);
                }
                ((SingleRequest) interfaceC6203h).m6399m(c2121gM6318c, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C2121g<?> m6318c(C9202h c9202h, boolean z10, long j10) {
        C2121g<?> c2121g;
        Object obj;
        C2121g<?> c2121g2;
        if (!z10) {
            return null;
        }
        C2115a c2115a = this.f10722g;
        synchronized (c2115a) {
            try {
                C2115a.a aVar = (C2115a.a) c2115a.f10682b.get(c9202h);
                if (aVar == null) {
                    c2121g = null;
                } else {
                    c2121g = aVar.get();
                    if (c2121g == null) {
                        c2115a.m6306b(aVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c2121g != null) {
            c2121g.m6329a();
        }
        if (c2121g != null) {
            if (f10715h) {
                m6314d("Loaded resource from active resources", j10, c9202h);
            }
            return c2121g;
        }
        C9651g c9651g = (C9651g) this.f10718c;
        synchronized (c9651g) {
            try {
                C7489i.a aVar2 = (C7489i.a) c9651g.f41374a.remove(c9202h);
                if (aVar2 == null) {
                    obj = null;
                } else {
                    c9651g.f41376c -= (long) aVar2.f41378b;
                    obj = aVar2.f41377a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        InterfaceC9207m interfaceC9207m = (InterfaceC9207m) obj;
        if (interfaceC9207m == null) {
            c2121g2 = null;
        } else {
            c2121g2 = interfaceC9207m instanceof C2121g ? (C2121g) interfaceC9207m : new C2121g<>(interfaceC9207m, true, true, c9202h, this);
        }
        if (c2121g2 != null) {
            c2121g2.m6329a();
            this.f10722g.m6305a(c9202h, c2121g2);
        }
        if (c2121g2 == null) {
            return null;
        }
        if (f10715h) {
            m6314d("Loaded resource from cache", j10, c9202h);
        }
        return c2121g2;
    }

    /* JADX INFO: renamed from: f */
    public final d m6319f(C2085g c2085g, Object obj, InterfaceC8732b interfaceC8732b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC9200f abstractC9200f, C7482b c7482b, boolean z10, boolean z11, C8735e c8735e, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC6203h interfaceC6203h, Executor executor, C9202h c9202h, long j10) {
        Executor executor2;
        C7940t c7940t = this.f10716a;
        C2120f c2120f = (C2120f) ((Map) (z15 ? c7940t.f43257b : c7940t.f43256a)).get(c9202h);
        if (c2120f != null) {
            c2120f.m6322b(interfaceC6203h, executor);
            if (f10715h) {
                m6314d("Added to existing load", j10, c9202h);
            }
            return new d(interfaceC6203h, c2120f);
        }
        C2120f c2120f2 = (C2120f) this.f10719d.f10733g.mo11465b();
        C0062b.m345f0(c2120f2);
        synchronized (c2120f2) {
            c2120f2.f10765l = c9202h;
            c2120f2.f10741H = z12;
            c2120f2.f10742I = z13;
            c2120f2.f10743J = z14;
            c2120f2.f10744K = z15;
        }
        a aVar = this.f10721f;
        DecodeJob<R> decodeJob = (DecodeJob) aVar.f10724b.mo11465b();
        C0062b.m345f0(decodeJob);
        int i12 = aVar.f10725c;
        aVar.f10725c = i12 + 1;
        C2118d<R> c2118d = decodeJob.f10649a;
        c2118d.f10699c = c2085g;
        c2118d.f10700d = obj;
        c2118d.f10710n = interfaceC8732b;
        c2118d.f10701e = i10;
        c2118d.f10702f = i11;
        c2118d.f10712p = abstractC9200f;
        c2118d.f10703g = cls;
        c2118d.f10704h = decodeJob.f10653d;
        c2118d.f10707k = cls2;
        c2118d.f10711o = priority;
        c2118d.f10705i = c8735e;
        c2118d.f10706j = c7482b;
        c2118d.f10713q = z10;
        c2118d.f10714r = z11;
        decodeJob.f10657h = c2085g;
        decodeJob.f10658i = interfaceC8732b;
        decodeJob.f10659j = priority;
        decodeJob.f10660k = c9202h;
        decodeJob.f10661l = i10;
        decodeJob.f10630H = i11;
        decodeJob.f10631I = abstractC9200f;
        decodeJob.f10638P = z15;
        decodeJob.f10632J = c8735e;
        decodeJob.f10633K = c2120f2;
        decodeJob.f10634L = i12;
        decodeJob.f10636N = DecodeJob.RunReason.INITIALIZE;
        decodeJob.f10639Q = obj;
        C7940t c7940t2 = this.f10716a;
        c7940t2.getClass();
        ((Map) (c2120f2.f10744K ? c7940t2.f43257b : c7940t2.f43256a)).put(c9202h, c2120f2);
        c2120f2.m6322b(interfaceC6203h, executor);
        synchronized (c2120f2) {
            c2120f2.f10751R = decodeJob;
            DecodeJob.Stage stageM6289q = decodeJob.m6289q(DecodeJob.Stage.INITIALIZE);
            if (stageM6289q == DecodeJob.Stage.RESOURCE_CACHE || stageM6289q == DecodeJob.Stage.DATA_CACHE) {
                executor2 = c2120f2.f10760g;
            } else if (c2120f2.f10742I) {
                executor2 = c2120f2.f10762i;
            } else {
                executor2 = c2120f2.f10743J ? c2120f2.f10763j : c2120f2.f10761h;
            }
            executor2.execute(decodeJob);
        }
        if (f10715h) {
            m6314d("Started new load", j10, c9202h);
        }
        return new d(interfaceC6203h, c2120f2);
    }
}
