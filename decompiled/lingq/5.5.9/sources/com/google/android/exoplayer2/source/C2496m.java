package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.activity.RunnableC0183b;
import androidx.activity.RunnableC0190i;
import androidx.activity.RunnableC0191j;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.drm.InterfaceC2399c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import com.google.android.exoplayer2.upstream.Loader;
import ga.C5718a;
import ga.C5725h;
import ga.C5735r;
import ga.C5736s;
import ga.InterfaceC5731n;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p150h9.C5930o0;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p286o2.RunnableC7907g;
import p290o6.C7968m;
import p338qd.C8573r0;
import p396t9.C9229d;
import p454wa.C9884i;
import p454wa.C9893r;
import p454wa.InterfaceC9877b;
import p454wa.InterfaceC9882g;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10136e;
import p479xa.C10147p;
import ua.InterfaceC9502k;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2496m implements InterfaceC2480h, InterfaceC7509j, Loader.InterfaceC2521a<a>, Loader.InterfaceC2525e, C2499p.c {

    /* JADX INFO: renamed from: h0 */
    public static final Map<String, String> f13311h0;

    /* JADX INFO: renamed from: i0 */
    public static final C2416m f13312i0;

    /* JADX INFO: renamed from: L */
    public InterfaceC2480h.a f13317L;

    /* JADX INFO: renamed from: M */
    public IcyHeaders f13318M;

    /* JADX INFO: renamed from: P */
    public boolean f13321P;

    /* JADX INFO: renamed from: Q */
    public boolean f13322Q;

    /* JADX INFO: renamed from: R */
    public boolean f13323R;

    /* JADX INFO: renamed from: S */
    public e f13324S;

    /* JADX INFO: renamed from: T */
    public InterfaceC7520u f13325T;

    /* JADX INFO: renamed from: V */
    public boolean f13327V;

    /* JADX INFO: renamed from: X */
    public boolean f13329X;

    /* JADX INFO: renamed from: Y */
    public boolean f13330Y;

    /* JADX INFO: renamed from: Z */
    public int f13331Z;

    /* JADX INFO: renamed from: a */
    public final Uri f13332a;

    /* JADX INFO: renamed from: a0 */
    public boolean f13333a0;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9882g f13334b;

    /* JADX INFO: renamed from: b0 */
    public long f13335b0;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2399c f13336c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2528b f13338d;

    /* JADX INFO: renamed from: d0 */
    public boolean f13339d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2493j.a f13340e;

    /* JADX INFO: renamed from: e0 */
    public int f13341e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2398b.a f13342f;

    /* JADX INFO: renamed from: f0 */
    public boolean f13343f0;

    /* JADX INFO: renamed from: g */
    public final b f13344g;

    /* JADX INFO: renamed from: g0 */
    public boolean f13345g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC9877b f13346h;

    /* JADX INFO: renamed from: i */
    public final String f13347i;

    /* JADX INFO: renamed from: j */
    public final long f13348j;

    /* JADX INFO: renamed from: l */
    public final InterfaceC2495l f13350l;

    /* JADX INFO: renamed from: k */
    public final Loader f13349k = new Loader("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: H */
    public final C10136e f13313H = new C10136e();

    /* JADX INFO: renamed from: I */
    public final RunnableC0183b f13314I = new RunnableC0183b(12, this);

    /* JADX INFO: renamed from: J */
    public final RunnableC0190i f13315J = new RunnableC0190i(13, this);

    /* JADX INFO: renamed from: K */
    public final Handler f13316K = C10134c0.m19044k(null);

    /* JADX INFO: renamed from: O */
    public d[] f13320O = new d[0];

    /* JADX INFO: renamed from: N */
    public C2499p[] f13319N = new C2499p[0];

    /* JADX INFO: renamed from: c0 */
    public long f13337c0 = -9223372036854775807L;

    /* JADX INFO: renamed from: U */
    public long f13326U = -9223372036854775807L;

    /* JADX INFO: renamed from: W */
    public int f13328W = 1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.m$a */
    public final class a implements Loader.InterfaceC2524d, C2477e.a {

        /* JADX INFO: renamed from: b */
        public final Uri f13352b;

        /* JADX INFO: renamed from: c */
        public final C9893r f13353c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC2495l f13354d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC7509j f13355e;

        /* JADX INFO: renamed from: f */
        public final C10136e f13356f;

        /* JADX INFO: renamed from: h */
        public volatile boolean f13358h;

        /* JADX INFO: renamed from: j */
        public long f13360j;

        /* JADX INFO: renamed from: l */
        public C2499p f13362l;

        /* JADX INFO: renamed from: m */
        public boolean f13363m;

        /* JADX INFO: renamed from: g */
        public final C7519t f13357g = new C7519t();

        /* JADX INFO: renamed from: i */
        public boolean f13359i = true;

        /* JADX INFO: renamed from: a */
        public final long f13351a = C5725h.f34748b.getAndIncrement();

        /* JADX INFO: renamed from: k */
        public C9884i f13361k = m7376c(0);

        public a(Uri uri, InterfaceC9882g interfaceC9882g, InterfaceC2495l interfaceC2495l, InterfaceC7509j interfaceC7509j, C10136e c10136e) {
            this.f13352b = uri;
            this.f13353c = new C9893r(interfaceC9882g);
            this.f13354d = interfaceC2495l;
            this.f13355e = interfaceC7509j;
            this.f13356f = c10136e;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2524d
        /* JADX INFO: renamed from: a */
        public final void mo7374a() throws IOException {
            InterfaceC9882g c2477e;
            int i10;
            int iMo12865d = 0;
            while (iMo12865d == 0 && !this.f13358h) {
                try {
                    long j10 = this.f13357g.f41516a;
                    C9884i c9884iM7376c = m7376c(j10);
                    this.f13361k = c9884iM7376c;
                    long jMo7273e = this.f13353c.mo7273e(c9884iM7376c);
                    if (jMo7273e != -1) {
                        jMo7273e += j10;
                        C2496m c2496m = C2496m.this;
                        c2496m.f13316K.post(new RunnableC0191j(12, c2496m));
                    }
                    long j11 = jMo7273e;
                    C2496m.this.f13318M = IcyHeaders.m7210a(this.f13353c.mo7275h());
                    C9893r c9893r = this.f13353c;
                    IcyHeaders icyHeaders = C2496m.this.f13318M;
                    if (icyHeaders == null || (i10 = icyHeaders.f12664f) == -1) {
                        c2477e = c9893r;
                    } else {
                        c2477e = new C2477e(c9893r, i10, this);
                        C2496m c2496m2 = C2496m.this;
                        c2496m2.getClass();
                        C2499p c2499pM7360B = c2496m2.m7360B(new d(0, true));
                        this.f13362l = c2499pM7360B;
                        c2499pM7360B.mo7388f(C2496m.f13312i0);
                    }
                    long jM12077a = j10;
                    ((C5718a) this.f13354d).m12078b(c2477e, this.f13352b, this.f13353c.mo7275h(), j10, j11, this.f13355e);
                    if (C2496m.this.f13318M != null) {
                        InterfaceC7507h interfaceC7507h = ((C5718a) this.f13354d).f34736b;
                        if (interfaceC7507h instanceof C9229d) {
                            ((C9229d) interfaceC7507h).f47862r = true;
                        }
                    }
                    if (this.f13359i) {
                        InterfaceC2495l interfaceC2495l = this.f13354d;
                        long j12 = this.f13360j;
                        InterfaceC7507h interfaceC7507h2 = ((C5718a) interfaceC2495l).f34736b;
                        interfaceC7507h2.getClass();
                        interfaceC7507h2.mo12866e(jM12077a, j12);
                        this.f13359i = false;
                    }
                    while (true) {
                        long j13 = jM12077a;
                        while (true) {
                            if (iMo12865d != 0 || this.f13358h) {
                                break;
                            }
                            try {
                                C10136e c10136e = this.f13356f;
                                synchronized (c10136e) {
                                    while (!c10136e.f51371a) {
                                        try {
                                            c10136e.wait();
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                                InterfaceC2495l interfaceC2495l2 = this.f13354d;
                                C7519t c7519t = this.f13357g;
                                C5718a c5718a = (C5718a) interfaceC2495l2;
                                InterfaceC7507h interfaceC7507h3 = c5718a.f34736b;
                                interfaceC7507h3.getClass();
                                C7504e c7504e = c5718a.f34737c;
                                c7504e.getClass();
                                iMo12865d = interfaceC7507h3.mo12865d(c7504e, c7519t);
                                jM12077a = ((C5718a) this.f13354d).m12077a();
                                if (jM12077a > C2496m.this.f13348j + j13) {
                                    C10136e c10136e2 = this.f13356f;
                                    synchronized (c10136e2) {
                                        c10136e2.f51371a = false;
                                    }
                                    C2496m c2496m3 = C2496m.this;
                                    c2496m3.f13316K.post(c2496m3.f13315J);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (iMo12865d == 1) {
                        iMo12865d = 0;
                    } else if (((C5718a) this.f13354d).m12077a() != -1) {
                        this.f13357g.f41516a = ((C5718a) this.f13354d).m12077a();
                    }
                    C8573r0.m16705W(this.f13353c);
                } catch (Throwable th3) {
                    if (iMo12865d != 1 && ((C5718a) this.f13354d).m12077a() != -1) {
                        this.f13357g.f41516a = ((C5718a) this.f13354d).m12077a();
                    }
                    C8573r0.m16705W(this.f13353c);
                    throw th3;
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2524d
        /* JADX INFO: renamed from: b */
        public final void mo7375b() {
            this.f13358h = true;
        }

        /* JADX INFO: renamed from: c */
        public final C9884i m7376c(long j10) {
            Collections.emptyMap();
            String str = C2496m.this.f13347i;
            Map<String, String> map = C2496m.f13311h0;
            Uri uri = this.f13352b;
            C10129a.m18994f(uri, "The uri must be set.");
            return new C9884i(uri, 0L, 1, null, map, j10, -1L, str, 6, null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.m$b */
    public interface b {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.m$c */
    public final class c implements InterfaceC5731n {

        /* JADX INFO: renamed from: a */
        public final int f13365a;

        public c(int i10) {
            this.f13365a = i10;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: c */
        public final void mo425c() throws IOException {
            C2496m c2496m = C2496m.this;
            C2499p c2499p = c2496m.f13319N[this.f13365a];
            DrmSession drmSession = c2499p.f13415h;
            if (drmSession != null && drmSession.getState() == 1) {
                DrmSession.DrmSessionException drmSessionExceptionMo6936f = c2499p.f13415h.mo6936f();
                drmSessionExceptionMo6936f.getClass();
                throw drmSessionExceptionMo6936f;
            }
            int iMo7474c = c2496m.f13338d.mo7474c(c2496m.f13328W);
            Loader loader = c2496m.f13349k;
            IOException iOException = loader.f13699c;
            if (iOException != null) {
                throw iOException;
            }
            Loader.HandlerC2523c<? extends Loader.InterfaceC2524d> handlerC2523c = loader.f13698b;
            if (handlerC2523c != null) {
                if (iMo7474c == Integer.MIN_VALUE) {
                    iMo7474c = handlerC2523c.f13702a;
                }
                IOException iOException2 = handlerC2523c.f13706e;
                if (iOException2 != null) {
                    if (handlerC2523c.f13707f > iMo7474c) {
                        throw iOException2;
                    }
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: d */
        public final int mo426d(long j10) {
            C2496m c2496m = C2496m.this;
            boolean z10 = false;
            if (c2496m.m7362D()) {
                return 0;
            }
            int i10 = this.f13365a;
            c2496m.m7373z(i10);
            C2499p c2499p = c2496m.f13319N[i10];
            int iM7397o = c2499p.m7397o(c2496m.f13343f0, j10);
            synchronized (c2499p) {
                if (iM7397o >= 0) {
                    try {
                        if (c2499p.f13426s + iM7397o <= c2499p.f13423p) {
                            z10 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C10129a.m18990b(z10);
                c2499p.f13426s += iM7397o;
            }
            if (iM7397o == 0) {
                c2496m.m7359A(i10);
            }
            return iM7397o;
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: e */
        public final boolean mo427e() {
            C2496m c2496m = C2496m.this;
            return !c2496m.m7362D() && c2496m.f13319N[this.f13365a].m7399q(c2496m.f13343f0);
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: h */
        public final int mo430h(C7968m c7968m, DecoderInputBuffer decoderInputBuffer, int i10) {
            C2496m c2496m = C2496m.this;
            if (c2496m.m7362D()) {
                return -3;
            }
            int i11 = this.f13365a;
            c2496m.m7373z(i11);
            int iM7402t = c2496m.f13319N[i11].m7402t(c7968m, decoderInputBuffer, i10, c2496m.f13343f0);
            if (iM7402t == -3) {
                c2496m.m7359A(i11);
            }
            return iM7402t;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.m$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final int f13367a;

        /* JADX INFO: renamed from: b */
        public final boolean f13368b;

        public d(int i10, boolean z10) {
            this.f13367a = i10;
            this.f13368b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f13367a == dVar.f13367a && this.f13368b == dVar.f13368b;
        }

        public final int hashCode() {
            return (this.f13367a * 31) + (this.f13368b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.m$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final C5736s f13369a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f13370b;

        /* JADX INFO: renamed from: c */
        public final boolean[] f13371c;

        /* JADX INFO: renamed from: d */
        public final boolean[] f13372d;

        public e(C5736s c5736s, boolean[] zArr) {
            this.f13369a = c5736s;
            this.f13370b = zArr;
            int i10 = c5736s.f34808a;
            this.f13371c = new boolean[i10];
            this.f13372d = new boolean[i10];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f13311h0 = Collections.unmodifiableMap(map);
        C2416m.a aVar = new C2416m.a();
        aVar.f12491a = "icy";
        aVar.f12501k = "application/x-icy";
        f13312i0 = aVar.m7128a();
    }

    public C2496m(Uri uri, InterfaceC9882g interfaceC9882g, C5718a c5718a, InterfaceC2399c interfaceC2399c, InterfaceC2398b.a aVar, InterfaceC2528b interfaceC2528b, InterfaceC2493j.a aVar2, b bVar, InterfaceC9877b interfaceC9877b, String str, int i10) {
        this.f13332a = uri;
        this.f13334b = interfaceC9882g;
        this.f13336c = interfaceC2399c;
        this.f13342f = aVar;
        this.f13338d = interfaceC2528b;
        this.f13340e = aVar2;
        this.f13344g = bVar;
        this.f13346h = interfaceC9877b;
        this.f13347i = str;
        this.f13348j = i10;
        this.f13350l = c5718a;
    }

    /* JADX INFO: renamed from: A */
    public final void m7359A(int i10) {
        m7368u();
        boolean[] zArr = this.f13324S.f13370b;
        if (this.f13339d0 && zArr[i10]) {
            if (this.f13319N[i10].m7399q(false)) {
                return;
            }
            this.f13337c0 = 0L;
            this.f13339d0 = false;
            this.f13330Y = true;
            this.f13335b0 = 0L;
            this.f13341e0 = 0;
            for (C2499p c2499p : this.f13319N) {
                c2499p.m7403u(false);
            }
            InterfaceC2480h.a aVar = this.f13317L;
            aVar.getClass();
            aVar.mo7091a(this);
        }
    }

    /* JADX INFO: renamed from: B */
    public final C2499p m7360B(d dVar) {
        int length = this.f13319N.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f13320O[i10])) {
                return this.f13319N[i10];
            }
        }
        InterfaceC2399c interfaceC2399c = this.f13336c;
        interfaceC2399c.getClass();
        InterfaceC2398b.a aVar = this.f13342f;
        aVar.getClass();
        C2499p c2499p = new C2499p(this.f13346h, interfaceC2399c, aVar);
        c2499p.f13413f = this;
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f13320O, i11);
        dVarArr[length] = dVar;
        this.f13320O = dVarArr;
        C2499p[] c2499pArr = (C2499p[]) Arrays.copyOf(this.f13319N, i11);
        c2499pArr[length] = c2499p;
        this.f13319N = c2499pArr;
        return c2499p;
    }

    /* JADX INFO: renamed from: C */
    public final void m7361C() {
        a aVar = new a(this.f13332a, this.f13334b, this.f13350l, this, this.f13313H);
        if (this.f13322Q) {
            C10129a.m18992d(m7371x());
            long j10 = this.f13326U;
            if (j10 != -9223372036854775807L && this.f13337c0 > j10) {
                this.f13343f0 = true;
                this.f13337c0 = -9223372036854775807L;
                return;
            }
            InterfaceC7520u interfaceC7520u = this.f13325T;
            interfaceC7520u.getClass();
            long j11 = interfaceC7520u.mo14983h(this.f13337c0).f41517a.f41523b;
            long j12 = this.f13337c0;
            aVar.f13357g.f41516a = j11;
            aVar.f13360j = j12;
            aVar.f13359i = true;
            aVar.f13363m = false;
            for (C2499p c2499p : this.f13319N) {
                c2499p.f13427t = this.f13337c0;
            }
            this.f13337c0 = -9223372036854775807L;
        }
        this.f13341e0 = m7369v();
        this.f13340e.m7336k(new C5725h(aVar.f13351a, aVar.f13361k, this.f13349k.m7469d(aVar, this, this.f13338d.mo7474c(this.f13328W))), 1, -1, null, 0, null, aVar.f13360j, this.f13326U);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m7362D() {
        return this.f13330Y || m7371x();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2525e
    /* JADX INFO: renamed from: a */
    public final void mo7363a() {
        for (C2499p c2499p : this.f13319N) {
            c2499p.m7403u(true);
            DrmSession drmSession = c2499p.f13415h;
            if (drmSession != null) {
                drmSession.mo6938h(c2499p.f13412e);
                c2499p.f13415h = null;
                c2499p.f13414g = null;
            }
        }
        C5718a c5718a = (C5718a) this.f13350l;
        InterfaceC7507h interfaceC7507h = c5718a.f34736b;
        if (interfaceC7507h != null) {
            interfaceC7507h.release();
            c5718a.f34736b = null;
        }
        c5718a.f34737c = null;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: b */
    public final void mo7313b(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11, boolean z10) {
        a aVar = (a) interfaceC2524d;
        C9893r c9893r = aVar.f13353c;
        Uri uri = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        this.f13338d.getClass();
        this.f13340e.m7329d(c5725h, 1, -1, null, 0, null, aVar.f13360j, this.f13326U);
        if (z10) {
            return;
        }
        for (C2499p c2499p : this.f13319N) {
            c2499p.m7403u(false);
        }
        if (this.f13331Z > 0) {
            InterfaceC2480h.a aVar2 = this.f13317L;
            aVar2.getClass();
            aVar2.mo7091a(this);
        }
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: c */
    public final void mo7364c(InterfaceC7520u interfaceC7520u) {
        this.f13316K.post(new RunnableC7907g(this, 12, interfaceC7520u));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: d */
    public final long mo7251d() {
        return mo7261r();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: e */
    public final void mo7314e(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11) {
        InterfaceC7520u interfaceC7520u;
        a aVar = (a) interfaceC2524d;
        if (this.f13326U == -9223372036854775807L && (interfaceC7520u = this.f13325T) != null) {
            boolean zMo14982b = interfaceC7520u.mo14982b();
            long jM7370w = m7370w(true);
            long j12 = jM7370w == Long.MIN_VALUE ? 0L : jM7370w + 10000;
            this.f13326U = j12;
            ((C2497n) this.f13344g).m7378b(j12, zMo14982b, this.f13327V);
        }
        C9893r c9893r = aVar.f13353c;
        Uri uri = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        this.f13338d.getClass();
        this.f13340e.m7331f(c5725h, 1, -1, null, 0, null, aVar.f13360j, this.f13326U);
        this.f13343f0 = true;
        InterfaceC2480h.a aVar2 = this.f13317L;
        aVar2.getClass();
        aVar2.mo7091a(this);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: f */
    public final void mo7252f() throws IOException {
        int iMo7474c = this.f13338d.mo7474c(this.f13328W);
        Loader loader = this.f13349k;
        IOException iOException = loader.f13699c;
        if (iOException != null) {
            throw iOException;
        }
        Loader.HandlerC2523c<? extends Loader.InterfaceC2524d> handlerC2523c = loader.f13698b;
        if (handlerC2523c != null) {
            if (iMo7474c == Integer.MIN_VALUE) {
                iMo7474c = handlerC2523c.f13702a;
            }
            IOException iOException2 = handlerC2523c.f13706e;
            if (iOException2 != null && handlerC2523c.f13707f > iMo7474c) {
                throw iOException2;
            }
        }
        if (this.f13343f0 && !this.f13322Q) {
            throw ParserException.m6770a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: g */
    public final long mo7253g(long j10) {
        boolean z10;
        m7368u();
        boolean[] zArr = this.f13324S.f13370b;
        if (!this.f13325T.mo14982b()) {
            j10 = 0;
        }
        this.f13330Y = false;
        this.f13335b0 = j10;
        if (m7371x()) {
            this.f13337c0 = j10;
            return j10;
        }
        if (this.f13328W != 7) {
            int length = this.f13319N.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = true;
                    break;
                }
                if (!this.f13319N[i10].m7404v(false, j10) && (zArr[i10] || !this.f13323R)) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (z10) {
                return j10;
            }
        }
        this.f13339d0 = false;
        this.f13337c0 = j10;
        this.f13343f0 = false;
        Loader loader = this.f13349k;
        if (loader.m7467b()) {
            for (C2499p c2499p : this.f13319N) {
                c2499p.m7391i();
            }
            loader.m7466a();
        } else {
            loader.f13699c = null;
            for (C2499p c2499p2 : this.f13319N) {
                c2499p2.m7403u(false);
            }
        }
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: h */
    public final boolean mo7254h(long j10) {
        if (!this.f13343f0) {
            Loader loader = this.f13349k;
            if (!(loader.f13699c != null) && !this.f13339d0) {
                if (!this.f13322Q || this.f13331Z != 0) {
                    boolean zM19062a = this.f13313H.m19062a();
                    if (loader.m7467b()) {
                        return zM19062a;
                    }
                    m7361C();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: i */
    public final void mo7365i() {
        this.f13321P = true;
        this.f13316K.post(this.f13314I);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    public final boolean isLoading() {
        boolean z10;
        if (this.f13349k.m7467b()) {
            C10136e c10136e = this.f13313H;
            synchronized (c10136e) {
                try {
                    z10 = c10136e.f51371a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: j */
    public final void mo7255j(boolean z10, long j10) {
        m7368u();
        if (m7371x()) {
            return;
        }
        boolean[] zArr = this.f13324S.f13371c;
        int length = this.f13319N.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f13319N[i10].m7390h(j10, z10, zArr[i10]);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: k */
    public final long mo7256k() {
        if (!this.f13330Y || (!this.f13343f0 && m7369v() <= this.f13341e0)) {
            return -9223372036854775807L;
        }
        this.f13330Y = false;
        return this.f13335b0;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: l */
    public final void mo7257l(InterfaceC2480h.a aVar, long j10) {
        this.f13317L = aVar;
        this.f13313H.m19062a();
        m7361C();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: m */
    public final C5736s mo7258m() {
        m7368u();
        return this.f13324S.f13369a;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: n */
    public final long mo7259n(long j10, C5930o0 c5930o0) {
        m7368u();
        if (!this.f13325T.mo14982b()) {
            return 0L;
        }
        InterfaceC7520u.a aVarMo14983h = this.f13325T.mo14983h(j10);
        return c5930o0.m12345a(j10, aVarMo14983h.f41517a.f41522a, aVarMo14983h.f41518b.f41522a);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: o */
    public final long mo7260o(InterfaceC9502k[] interfaceC9502kArr, boolean[] zArr, InterfaceC5731n[] interfaceC5731nArr, boolean[] zArr2, long j10) {
        boolean[] zArr3;
        InterfaceC9502k interfaceC9502k;
        m7368u();
        e eVar = this.f13324S;
        C5736s c5736s = eVar.f13369a;
        int i10 = this.f13331Z;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int length = interfaceC9502kArr.length;
            zArr3 = eVar.f13371c;
            if (i12 >= length) {
                break;
            }
            InterfaceC5731n interfaceC5731n = interfaceC5731nArr[i12];
            if (interfaceC5731n != null && (interfaceC9502kArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) interfaceC5731n).f13365a;
                C10129a.m18992d(zArr3[i13]);
                this.f13331Z--;
                zArr3[i13] = false;
                interfaceC5731nArr[i12] = null;
            }
            i12++;
        }
        boolean z10 = !this.f13329X ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < interfaceC9502kArr.length; i14++) {
            if (interfaceC5731nArr[i14] == null && (interfaceC9502k = interfaceC9502kArr[i14]) != null) {
                C10129a.m18992d(interfaceC9502k.length() == 1);
                C10129a.m18992d(interfaceC9502k.mo7348j(0) == 0);
                int iM12092b = c5736s.m12092b(interfaceC9502k.mo7339a());
                C10129a.m18992d(!zArr3[iM12092b]);
                this.f13331Z++;
                zArr3[iM12092b] = true;
                interfaceC5731nArr[i14] = new c(iM12092b);
                zArr2[i14] = true;
                if (!z10) {
                    C2499p c2499p = this.f13319N[iM12092b];
                    z10 = (c2499p.m7404v(true, j10) || c2499p.f13424q + c2499p.f13426s == 0) ? false : true;
                }
            }
        }
        if (this.f13331Z == 0) {
            this.f13339d0 = false;
            this.f13330Y = false;
            Loader loader = this.f13349k;
            if (loader.m7467b()) {
                C2499p[] c2499pArr = this.f13319N;
                int length2 = c2499pArr.length;
                while (i11 < length2) {
                    c2499pArr[i11].m7391i();
                    i11++;
                }
                loader.m7466a();
            } else {
                for (C2499p c2499p2 : this.f13319N) {
                    c2499p2.m7403u(false);
                }
            }
        } else if (z10) {
            j10 = mo7253g(j10);
            while (i11 < interfaceC5731nArr.length) {
                if (interfaceC5731nArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f13329X = true;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: p */
    public final Loader.C2522b mo7316p(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        Loader.C2522b c2522b;
        InterfaceC7520u interfaceC7520u;
        a aVar = (a) interfaceC2524d;
        C9893r c9893r = aVar.f13353c;
        Uri uri = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        C10134c0.m19033R(aVar.f13360j);
        C10134c0.m19033R(this.f13326U);
        long jMo7472a = this.f13338d.mo7472a(new InterfaceC2528b.c(iOException, i10));
        if (jMo7472a == -9223372036854775807L) {
            c2522b = Loader.f13696f;
        } else {
            int iM7369v = m7369v();
            int i11 = iM7369v > this.f13341e0 ? 1 : 0;
            if (this.f13333a0 || !((interfaceC7520u = this.f13325T) == null || interfaceC7520u.mo14984i() == -9223372036854775807L)) {
                this.f13341e0 = iM7369v;
            } else {
                if (!this.f13322Q || m7362D()) {
                    this.f13330Y = this.f13322Q;
                    this.f13335b0 = 0L;
                    this.f13341e0 = 0;
                    for (C2499p c2499p : this.f13319N) {
                        c2499p.m7403u(false);
                    }
                    aVar.f13357g.f41516a = 0L;
                    aVar.f13360j = 0L;
                    aVar.f13359i = true;
                    aVar.f13363m = false;
                } else {
                    this.f13339d0 = true;
                    z10 = false;
                }
                if (z10) {
                    c2522b = new Loader.C2522b(i11, jMo7472a);
                } else {
                    c2522b = Loader.f13695e;
                }
            }
            z10 = true;
            if (z10) {
                c2522b = new Loader.C2522b(i11, jMo7472a);
            } else {
                c2522b = Loader.f13695e;
            }
        }
        int i12 = c2522b.f13700a;
        this.f13340e.m7333h(c5725h, 1, -1, null, 0, null, aVar.f13360j, this.f13326U, iOException, !(i12 == 0 || i12 == 1));
        return c2522b;
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: q */
    public final InterfaceC7522w mo7366q(int i10, int i11) {
        return m7360B(new d(i10, false));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: r */
    public final long mo7261r() {
        long jM7370w;
        boolean z10;
        long j10;
        m7368u();
        if (this.f13343f0 || this.f13331Z == 0) {
            return Long.MIN_VALUE;
        }
        if (m7371x()) {
            return this.f13337c0;
        }
        if (this.f13323R) {
            int length = this.f13319N.length;
            jM7370w = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.f13324S;
                if (eVar.f13370b[i10] && eVar.f13371c[i10]) {
                    C2499p c2499p = this.f13319N[i10];
                    synchronized (c2499p) {
                        z10 = c2499p.f13430w;
                    }
                    if (z10) {
                        continue;
                    } else {
                        C2499p c2499p2 = this.f13319N[i10];
                        synchronized (c2499p2) {
                            try {
                                j10 = c2499p2.f13429v;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        jM7370w = Math.min(jM7370w, j10);
                    }
                }
            }
        } else {
            jM7370w = Long.MAX_VALUE;
        }
        if (jM7370w == Long.MAX_VALUE) {
            jM7370w = m7370w(false);
        }
        if (jM7370w == Long.MIN_VALUE) {
            jM7370w = this.f13335b0;
        }
        return jM7370w;
    }

    @Override // com.google.android.exoplayer2.source.C2499p.c
    /* JADX INFO: renamed from: s */
    public final void mo7367s() {
        this.f13316K.post(this.f13314I);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: t */
    public final void mo7262t(long j10) {
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* JADX INFO: renamed from: u */
    public final void m7368u() {
        C10129a.m18992d(this.f13322Q);
        this.f13324S.getClass();
        this.f13325T.getClass();
    }

    /* JADX INFO: renamed from: v */
    public final int m7369v() {
        int i10 = 0;
        for (C2499p c2499p : this.f13319N) {
            i10 += c2499p.f13424q + c2499p.f13423p;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public final long m7370w(boolean z10) {
        C2499p c2499p;
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f13319N.length; i10++) {
            if (z10) {
                c2499p = this.f13319N[i10];
                synchronized (c2499p) {
                    jMax = Math.max(jMax, c2499p.f13429v);
                }
            } else {
                e eVar = this.f13324S;
                eVar.getClass();
                if (eVar.f13371c[i10]) {
                    c2499p = this.f13319N[i10];
                    synchronized (c2499p) {
                    }
                    jMax = Math.max(jMax, c2499p.f13429v);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m7371x() {
        return this.f13337c0 != -9223372036854775807L;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: y */
    public final void m7372y() {
        Metadata metadata;
        int i10;
        if (!this.f13345g0 && !this.f13322Q && this.f13321P && this.f13325T != null) {
            for (C2499p c2499p : this.f13319N) {
                if (c2499p.m7398p() == null) {
                    return;
                }
            }
            C10136e c10136e = this.f13313H;
            synchronized (c10136e) {
                c10136e.f51371a = false;
            }
            int length = this.f13319N.length;
            C5735r[] c5735rArr = new C5735r[length];
            boolean[] zArr = new boolean[length];
            for (int i11 = 0; i11 < length; i11++) {
                C2416m c2416mM7398p = this.f13319N[i11].m7398p();
                c2416mM7398p.getClass();
                String str = c2416mM7398p.f12484l;
                boolean zM19109i = C10147p.m19109i(str);
                boolean z10 = zM19109i || C10147p.m19111k(str);
                zArr[i11] = z10;
                this.f13323R = z10 | this.f13323R;
                IcyHeaders icyHeaders = this.f13318M;
                if (icyHeaders != null) {
                    if (zM19109i || this.f13320O[i11].f13368b) {
                        Metadata metadata2 = c2416mM7398p.f12482j;
                        if (metadata2 == null) {
                            metadata = new Metadata(icyHeaders);
                        } else {
                            int i12 = C10134c0.f51354a;
                            Metadata.Entry[] entryArr = metadata2.f12627a;
                            Object[] objArrCopyOf = Arrays.copyOf(entryArr, entryArr.length + 1);
                            System.arraycopy(new Metadata.Entry[]{icyHeaders}, 0, objArrCopyOf, entryArr.length, 1);
                            metadata = new Metadata(metadata2.f12628b, (Metadata.Entry[]) objArrCopyOf);
                        }
                        C2416m.a aVar = new C2416m.a(c2416mM7398p);
                        aVar.f12499i = metadata;
                        c2416mM7398p = new C2416m(aVar);
                    }
                    if (zM19109i && c2416mM7398p.f12478f == -1 && c2416mM7398p.f12479g == -1 && (i10 = icyHeaders.f12659a) != -1) {
                        C2416m.a aVar2 = new C2416m.a(c2416mM7398p);
                        aVar2.f12496f = i10;
                        c2416mM7398p = new C2416m(aVar2);
                    }
                }
                int iMo6947a = this.f13336c.mo6947a(c2416mM7398p);
                C2416m.a aVarM7125a = c2416mM7398p.m7125a();
                aVarM7125a.f12490F = iMo6947a;
                c5735rArr[i11] = new C5735r(Integer.toString(i11), aVarM7125a.m7128a());
            }
            this.f13324S = new e(new C5736s(c5735rArr), zArr);
            this.f13322Q = true;
            InterfaceC2480h.a aVar3 = this.f13317L;
            aVar3.getClass();
            aVar3.mo7093b(this);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m7373z(int i10) {
        m7368u();
        e eVar = this.f13324S;
        boolean[] zArr = eVar.f13372d;
        if (zArr[i10]) {
            return;
        }
        C2416m c2416m = eVar.f13369a.m12091a(i10).f34803d[0];
        this.f13340e.m7327b(C10147p.m19108h(c2416m.f12484l), c2416m, 0, null, this.f13335b0);
        zArr[i10] = true;
    }
}
