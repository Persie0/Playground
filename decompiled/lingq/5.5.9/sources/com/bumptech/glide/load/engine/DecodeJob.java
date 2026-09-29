package com.bumptech.glide.load.engine;

import ae.C0062b;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C2085g;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.InterfaceC2097d;
import com.bumptech.glide.load.data.InterfaceC2098e;
import com.bumptech.glide.load.resource.bitmap.C2140a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p003a2.C0009a;
import p258m6.C7482b;
import p258m6.C7488h;
import p272n6.AbstractC7712d;
import p272n6.C7709a;
import p289o5.C7940t;
import p356r5.C8734d;
import p356r5.C8735e;
import p356r5.InterfaceC8732b;
import p356r5.InterfaceC8737g;
import p392t5.AbstractC9200f;
import p392t5.C9198d;
import p392t5.C9202h;
import p392t5.C9205k;
import p392t5.C9206l;
import p392t5.InterfaceC9204j;
import p392t5.InterfaceC9207m;
import p446w2.InterfaceC9806d;
import p449w5.ExecutorServiceC9813a;

/* JADX INFO: loaded from: classes.dex */
public final class DecodeJob<R> implements InterfaceC2117c.a, Runnable, Comparable<DecodeJob<?>>, C7709a.d {

    /* JADX INFO: renamed from: H */
    public int f10630H;

    /* JADX INFO: renamed from: I */
    public AbstractC9200f f10631I;

    /* JADX INFO: renamed from: J */
    public C8735e f10632J;

    /* JADX INFO: renamed from: K */
    public InterfaceC2109b<R> f10633K;

    /* JADX INFO: renamed from: L */
    public int f10634L;

    /* JADX INFO: renamed from: M */
    public Stage f10635M;

    /* JADX INFO: renamed from: N */
    public RunReason f10636N;

    /* JADX INFO: renamed from: O */
    public long f10637O;

    /* JADX INFO: renamed from: P */
    public boolean f10638P;

    /* JADX INFO: renamed from: Q */
    public Object f10639Q;

    /* JADX INFO: renamed from: R */
    public Thread f10640R;

    /* JADX INFO: renamed from: S */
    public InterfaceC8732b f10641S;

    /* JADX INFO: renamed from: T */
    public InterfaceC8732b f10642T;

    /* JADX INFO: renamed from: U */
    public Object f10643U;

    /* JADX INFO: renamed from: V */
    public DataSource f10644V;

    /* JADX INFO: renamed from: W */
    public InterfaceC2097d<?> f10645W;

    /* JADX INFO: renamed from: X */
    public volatile InterfaceC2117c f10646X;

    /* JADX INFO: renamed from: Y */
    public volatile boolean f10647Y;

    /* JADX INFO: renamed from: Z */
    public volatile boolean f10648Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f10650a0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2112e f10653d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9806d<DecodeJob<?>> f10654e;

    /* JADX INFO: renamed from: h */
    public C2085g f10657h;

    /* JADX INFO: renamed from: i */
    public InterfaceC8732b f10658i;

    /* JADX INFO: renamed from: j */
    public Priority f10659j;

    /* JADX INFO: renamed from: k */
    public C9202h f10660k;

    /* JADX INFO: renamed from: l */
    public int f10661l;

    /* JADX INFO: renamed from: a */
    public final C2118d<R> f10649a = new C2118d<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList f10651b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final AbstractC7712d.a f10652c = new AbstractC7712d.a();

    /* JADX INFO: renamed from: f */
    public final C2111d<?> f10655f = new C2111d<>();

    /* JADX INFO: renamed from: g */
    public final C2113f f10656g = new C2113f();

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$a */
    public static /* synthetic */ class C2108a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10662a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10663b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f10664c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f10664c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10664c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f10663b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10663b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10663b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10663b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10663b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f10662a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10662a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10662a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface InterfaceC2109b<R> {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C2110c<Z> {

        /* JADX INFO: renamed from: a */
        public final DataSource f10665a;

        public C2110c(DataSource dataSource) {
            this.f10665a = dataSource;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C2111d<Z> {

        /* JADX INFO: renamed from: a */
        public InterfaceC8732b f10667a;

        /* JADX INFO: renamed from: b */
        public InterfaceC8737g<Z> f10668b;

        /* JADX INFO: renamed from: c */
        public C9206l<Z> f10669c;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface InterfaceC2112e {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C2113f {

        /* JADX INFO: renamed from: a */
        public boolean f10670a;

        /* JADX INFO: renamed from: b */
        public boolean f10671b;

        /* JADX INFO: renamed from: c */
        public boolean f10672c;

        /* JADX INFO: renamed from: a */
        public final boolean m6298a() {
            if (this.f10672c || this.f10671b) {
                if (this.f10670a) {
                    return true;
                }
            }
            return false;
        }
    }

    public DecodeJob(InterfaceC2112e interfaceC2112e, C7709a.c cVar) {
        this.f10653d = interfaceC2112e;
        this.f10654e = cVar;
    }

    @Override // p272n6.C7709a.d
    /* JADX INFO: renamed from: a */
    public final AbstractC7712d.a mo6281a() {
        return this.f10652c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(DecodeJob<?> decodeJob) {
        DecodeJob<?> decodeJob2 = decodeJob;
        int iOrdinal = this.f10659j.ordinal() - decodeJob2.f10659j.ordinal();
        if (iOrdinal == 0) {
            iOrdinal = this.f10634L - decodeJob2.f10634L;
        }
        return iOrdinal;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c.a
    /* JADX INFO: renamed from: f */
    public final void mo6282f(InterfaceC8732b interfaceC8732b, Exception exc, InterfaceC2097d<?> interfaceC2097d, DataSource dataSource) {
        interfaceC2097d.mo6272b();
        GlideException glideException = new GlideException(Collections.singletonList(exc), "Fetching data failed");
        Class<?> clsMo6269a = interfaceC2097d.mo6269a();
        glideException.f10675b = interfaceC8732b;
        glideException.f10676c = dataSource;
        glideException.f10677d = clsMo6269a;
        this.f10651b.add(glideException);
        if (Thread.currentThread() != this.f10640R) {
            m6294w(RunReason.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m6295x();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c.a
    /* JADX INFO: renamed from: g */
    public final void mo6283g() {
        m6294w(RunReason.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c.a
    /* JADX INFO: renamed from: i */
    public final void mo6284i(InterfaceC8732b interfaceC8732b, Object obj, InterfaceC2097d<?> interfaceC2097d, DataSource dataSource, InterfaceC8732b interfaceC8732b2) {
        this.f10641S = interfaceC8732b;
        this.f10643U = obj;
        this.f10645W = interfaceC2097d;
        this.f10644V = dataSource;
        this.f10642T = interfaceC8732b2;
        boolean z10 = false;
        if (interfaceC8732b != this.f10649a.m6308a().get(0)) {
            z10 = true;
        }
        this.f10650a0 = z10;
        if (Thread.currentThread() != this.f10640R) {
            m6294w(RunReason.DECODE_DATA);
        } else {
            m6287o();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final <Data> InterfaceC9207m<R> m6285l(InterfaceC2097d<?> interfaceC2097d, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            interfaceC2097d.mo6272b();
            return null;
        }
        try {
            int i10 = C7488h.f41373b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC9207m<R> interfaceC9207mM6286m = m6286m(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m6290s(jElapsedRealtimeNanos, "Decoded result " + interfaceC9207mM6286m, null);
            }
            interfaceC2097d.mo6272b();
            return interfaceC9207mM6286m;
        } catch (Throwable th2) {
            interfaceC2097d.mo6272b();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public final <Data> InterfaceC9207m<R> m6286m(Data data, DataSource dataSource) throws GlideException {
        Class<?> cls = data.getClass();
        C2118d<R> c2118d = this.f10649a;
        C9205k<Data, ?, R> c9205kM6310c = c2118d.m6310c(cls);
        C8735e c8735e = this.f10632J;
        boolean z10 = dataSource == DataSource.RESOURCE_DISK_CACHE || c2118d.f10714r;
        C8734d<Boolean> c8734d = C2140a.f10827i;
        Boolean bool = (Boolean) c8735e.m16963c(c8734d);
        if (bool == null || (bool.booleanValue() && !z10)) {
            c8735e = new C8735e();
            C7482b c7482b = this.f10632J.f46331b;
            C7482b c7482b2 = c8735e.f46331b;
            c7482b2.mo14868i(c7482b);
            c7482b2.put(c8734d, Boolean.valueOf(z10));
        }
        C8735e c8735e2 = c8735e;
        InterfaceC2098e interfaceC2098eM6232f = this.f10657h.m6240a().m6232f(data);
        try {
            InterfaceC9207m<R> interfaceC9207mM17545a = c9205kM6310c.m17545a(this.f10661l, this.f10630H, c8735e2, interfaceC2098eM6232f, new C2110c(dataSource));
            interfaceC2098eM6232f.mo4884b();
            return interfaceC9207mM17545a;
        } catch (Throwable th2) {
            interfaceC2098eM6232f.mo4884b();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final void m6287o() {
        InterfaceC9207m interfaceC9207mM6285l;
        boolean zM6298a;
        if (Log.isLoggable("DecodeJob", 2)) {
            m6290s(this.f10637O, "Retrieved data", "data: " + this.f10643U + ", cache key: " + this.f10641S + ", fetcher: " + this.f10645W);
        }
        C9206l c9206l = null;
        try {
            interfaceC9207mM6285l = m6285l(this.f10645W, this.f10643U, this.f10644V);
        } catch (GlideException e10) {
            InterfaceC8732b interfaceC8732b = this.f10642T;
            DataSource dataSource = this.f10644V;
            e10.f10675b = interfaceC8732b;
            e10.f10676c = dataSource;
            e10.f10677d = null;
            this.f10651b.add(e10);
            interfaceC9207mM6285l = null;
        }
        if (interfaceC9207mM6285l == null) {
            m6295x();
            return;
        }
        DataSource dataSource2 = this.f10644V;
        boolean z10 = this.f10650a0;
        if (interfaceC9207mM6285l instanceof InterfaceC9204j) {
            ((InterfaceC9204j) interfaceC9207mM6285l).mo156a();
        }
        boolean z11 = false;
        if (this.f10655f.f10669c != null) {
            c9206l = (C9206l) C9206l.f47764e.mo11465b();
            C0062b.m345f0(c9206l);
            c9206l.f47768d = false;
            c9206l.f47767c = true;
            c9206l.f47766b = interfaceC9207mM6285l;
            interfaceC9207mM6285l = c9206l;
        }
        m6291t(interfaceC9207mM6285l, dataSource2, z10);
        this.f10635M = Stage.ENCODE;
        try {
            C2111d<?> c2111d = this.f10655f;
            if (c2111d.f10669c != null) {
                z11 = true;
            }
            if (z11) {
                InterfaceC2112e interfaceC2112e = this.f10653d;
                C8735e c8735e = this.f10632J;
                c2111d.getClass();
                try {
                    ((C2119e.c) interfaceC2112e).m6321a().mo16804d(c2111d.f10667a, new C9198d(c2111d.f10668b, c2111d.f10669c, c8735e));
                    c2111d.f10669c.m17546e();
                } catch (Throwable th2) {
                    c2111d.f10669c.m17546e();
                    throw th2;
                }
            }
            if (c9206l != null) {
                c9206l.m17546e();
            }
            C2113f c2113f = this.f10656g;
            synchronized (c2113f) {
                c2113f.f10671b = true;
                zM6298a = c2113f.m6298a();
            }
            if (zM6298a) {
                m6293v();
            }
        } catch (Throwable th3) {
            if (c9206l != null) {
                c9206l.m17546e();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC2117c m6288p() {
        int i10 = C2108a.f10663b[this.f10635M.ordinal()];
        C2118d<R> c2118d = this.f10649a;
        if (i10 == 1) {
            return new C2122h(c2118d, this);
        }
        if (i10 == 2) {
            return new C2116b(c2118d.m6308a(), c2118d, this);
        }
        if (i10 == 3) {
            return new C2123i(c2118d, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f10635M);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final Stage m6289q(Stage stage) {
        int i10 = C2108a.f10663b[stage.ordinal()];
        if (i10 == 1) {
            return this.f10631I.mo17537a() ? Stage.DATA_CACHE : m6289q(Stage.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f10638P ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return Stage.FINISHED;
        }
        if (i10 == 5) {
            return this.f10631I.mo17538b() ? Stage.RESOURCE_CACHE : m6289q(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2097d<?> interfaceC2097d = this.f10645W;
        try {
            try {
                if (!this.f10648Z) {
                    m6296y();
                    if (interfaceC2097d != null) {
                        interfaceC2097d.mo6272b();
                    }
                } else {
                    m6292u();
                    if (interfaceC2097d != null) {
                        interfaceC2097d.mo6272b();
                    }
                }
            } catch (Throwable th2) {
                if (interfaceC2097d != null) {
                    interfaceC2097d.mo6272b();
                }
                throw th2;
            }
        } catch (CallbackException e10) {
            throw e10;
        } catch (Throwable th3) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f10648Z + ", stage: " + this.f10635M, th3);
            }
            if (this.f10635M != Stage.ENCODE) {
                this.f10651b.add(th3);
                m6292u();
            }
            if (!this.f10648Z) {
                throw th3;
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6290s(long j10, String str, String str2) {
        StringBuilder sbM26o = C0009a.m26o(str, " in ");
        sbM26o.append(C7488h.m14872a(j10));
        sbM26o.append(", load key: ");
        sbM26o.append(this.f10660k);
        sbM26o.append(str2 != null ? ", ".concat(str2) : "");
        sbM26o.append(", thread: ");
        sbM26o.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbM26o.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 5, instructions: 5 */
    /* JADX INFO: renamed from: t */
    public final void m6291t(InterfaceC9207m<R> interfaceC9207m, DataSource dataSource, boolean z10) {
        m6297z();
        C2120f c2120f = (C2120f) this.f10633K;
        synchronized (c2120f) {
            try {
                c2120f.f10745L = interfaceC9207m;
                c2120f.f10746M = dataSource;
                c2120f.f10753T = z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (c2120f) {
            c2120f.f10755b.m15304a();
            if (c2120f.f10752S) {
                c2120f.f10745L.mo157b();
                c2120f.m6327g();
                return;
            }
            if (c2120f.f10754a.f10772a.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (c2120f.f10747N) {
                throw new IllegalStateException("Already have resource");
            }
            C2120f.c cVar = c2120f.f10758e;
            InterfaceC9207m<?> interfaceC9207m2 = c2120f.f10745L;
            boolean z11 = c2120f.f10741H;
            InterfaceC8732b interfaceC8732b = c2120f.f10765l;
            C2121g.a aVar = c2120f.f10756c;
            cVar.getClass();
            c2120f.f10750Q = new C2121g<>(interfaceC9207m2, z11, true, interfaceC8732b, aVar);
            c2120f.f10747N = true;
            C2120f.e eVar = c2120f.f10754a;
            eVar.getClass();
            ArrayList<C2120f.d> arrayList = new ArrayList(eVar.f10772a);
            c2120f.m6325e(arrayList.size() + 1);
            InterfaceC8732b interfaceC8732b2 = c2120f.f10765l;
            C2121g<?> c2121g = c2120f.f10750Q;
            C2119e c2119e = (C2119e) c2120f.f10759f;
            synchronized (c2119e) {
                if (c2121g != null) {
                    try {
                        if (c2121g.f10773a) {
                            c2119e.f10722g.m6305a(interfaceC8732b2, c2121g);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                C7940t c7940t = c2119e.f10716a;
                c7940t.getClass();
                Map map = (Map) (c2120f.f10744K ? c7940t.f43257b : c7940t.f43256a);
                if (c2120f.equals(map.get(interfaceC8732b2))) {
                    map.remove(interfaceC8732b2);
                }
            }
            for (C2120f.d dVar : arrayList) {
                dVar.f10771b.execute(new C2120f.b(dVar.f10770a));
            }
            c2120f.m6324d();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: u */
    public final void m6292u() {
        boolean zM6298a;
        m6297z();
        GlideException glideException = new GlideException(new ArrayList(this.f10651b), "Failed to load resource");
        C2120f c2120f = (C2120f) this.f10633K;
        synchronized (c2120f) {
            try {
                c2120f.f10748O = glideException;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (c2120f) {
            c2120f.f10755b.m15304a();
            if (c2120f.f10752S) {
                c2120f.m6327g();
            } else {
                if (c2120f.f10754a.f10772a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (c2120f.f10749P) {
                    throw new IllegalStateException("Already failed once");
                }
                c2120f.f10749P = true;
                InterfaceC8732b interfaceC8732b = c2120f.f10765l;
                C2120f.e eVar = c2120f.f10754a;
                eVar.getClass();
                ArrayList<C2120f.d> arrayList = new ArrayList(eVar.f10772a);
                c2120f.m6325e(arrayList.size() + 1);
                C2119e c2119e = (C2119e) c2120f.f10759f;
                synchronized (c2119e) {
                    C7940t c7940t = c2119e.f10716a;
                    c7940t.getClass();
                    Map map = (Map) (c2120f.f10744K ? c7940t.f43257b : c7940t.f43256a);
                    if (c2120f.equals(map.get(interfaceC8732b))) {
                        map.remove(interfaceC8732b);
                    }
                }
                for (C2120f.d dVar : arrayList) {
                    dVar.f10771b.execute(new C2120f.a(dVar.f10770a));
                }
                c2120f.m6324d();
            }
        }
        C2113f c2113f = this.f10656g;
        synchronized (c2113f) {
            try {
                c2113f.f10672c = true;
                zM6298a = c2113f.m6298a();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (zM6298a) {
            m6293v();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: v */
    public final void m6293v() {
        C2113f c2113f = this.f10656g;
        synchronized (c2113f) {
            c2113f.f10671b = false;
            c2113f.f10670a = false;
            c2113f.f10672c = false;
        }
        C2111d<?> c2111d = this.f10655f;
        c2111d.f10667a = null;
        c2111d.f10668b = null;
        c2111d.f10669c = null;
        C2118d<R> c2118d = this.f10649a;
        c2118d.f10699c = null;
        c2118d.f10700d = null;
        c2118d.f10710n = null;
        c2118d.f10703g = null;
        c2118d.f10707k = null;
        c2118d.f10705i = null;
        c2118d.f10711o = null;
        c2118d.f10706j = null;
        c2118d.f10712p = null;
        c2118d.f10697a.clear();
        c2118d.f10708l = false;
        c2118d.f10698b.clear();
        c2118d.f10709m = false;
        this.f10647Y = false;
        this.f10657h = null;
        this.f10658i = null;
        this.f10632J = null;
        this.f10659j = null;
        this.f10660k = null;
        this.f10633K = null;
        this.f10635M = null;
        this.f10646X = null;
        this.f10640R = null;
        this.f10641S = null;
        this.f10643U = null;
        this.f10644V = null;
        this.f10645W = null;
        this.f10637O = 0L;
        this.f10648Z = false;
        this.f10639Q = null;
        this.f10651b.clear();
        this.f10654e.mo11464a(this);
    }

    /* JADX INFO: renamed from: w */
    public final void m6294w(RunReason runReason) {
        ExecutorServiceC9813a executorServiceC9813a;
        this.f10636N = runReason;
        C2120f c2120f = (C2120f) this.f10633K;
        if (c2120f.f10742I) {
            executorServiceC9813a = c2120f.f10762i;
        } else {
            executorServiceC9813a = c2120f.f10743J ? c2120f.f10763j : c2120f.f10761h;
        }
        executorServiceC9813a.execute(this);
    }

    /* JADX INFO: renamed from: x */
    public final void m6295x() {
        this.f10640R = Thread.currentThread();
        int i10 = C7488h.f41373b;
        this.f10637O = SystemClock.elapsedRealtimeNanos();
        boolean zMo6307a = false;
        while (!this.f10648Z && this.f10646X != null && !(zMo6307a = this.f10646X.mo6307a())) {
            this.f10635M = m6289q(this.f10635M);
            this.f10646X = m6288p();
            if (this.f10635M == Stage.SOURCE) {
                m6294w(RunReason.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if (this.f10635M != Stage.FINISHED && !this.f10648Z) {
            return;
        }
        if (zMo6307a) {
            return;
        }
        m6292u();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: y */
    public final void m6296y() {
        int i10 = C2108a.f10662a[this.f10636N.ordinal()];
        if (i10 == 1) {
            this.f10635M = m6289q(Stage.INITIALIZE);
            this.f10646X = m6288p();
            m6295x();
        } else if (i10 == 2) {
            m6295x();
        } else if (i10 == 3) {
            m6287o();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f10636N);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m6297z() {
        Throwable th2;
        this.f10652c.m15304a();
        if (!this.f10647Y) {
            this.f10647Y = true;
            return;
        }
        if (this.f10651b.isEmpty()) {
            th2 = null;
        } else {
            ArrayList arrayList = this.f10651b;
            th2 = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }
}
