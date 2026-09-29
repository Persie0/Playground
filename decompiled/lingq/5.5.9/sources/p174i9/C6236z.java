package p174i9;

import android.os.Looper;
import android.support.v4.media.session.C0166e;
import android.util.SparseArray;
import androidx.activity.RunnableC0190i;
import androidx.activity.result.C0204c;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2384d0;
import com.google.android.exoplayer2.C2412i;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.C2467q;
import com.google.android.exoplayer2.C2505u;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.audio.C2367a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import dm.C5206f;
import dm.C5212l;
import ga.C5725h;
import ga.C5726i;
import ga.C5727j;
import ge.C5788l;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p030b9.C1343b;
import p045c9.C1749c;
import p045c9.C1750d;
import p068d9.C5097k;
import p068d9.C5099m;
import p068d9.C5100n;
import p068d9.C5102p;
import p150h9.C5921k;
import p150h9.C5935r;
import p218k9.C6635e;
import p218k9.C6637g;
import p219ka.C6640a;
import p219ka.C6642c;
import p290o6.C7946b;
import p291o7.C8002l;
import p382s7.C8969b;
import p402u0.C9370m;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10144m;
import p479xa.InterfaceC10133c;
import p479xa.InterfaceC10142k;
import p505ya.C10332n;
import ua.C9508q;

/* JADX INFO: renamed from: i9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C6236z implements InterfaceC6206a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10133c f36218a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2382c0.b f36219b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2382c0.c f36220c;

    /* JADX INFO: renamed from: d */
    public final a f36221d;

    /* JADX INFO: renamed from: e */
    public final SparseArray<InterfaceC6208b.a> f36222e;

    /* JADX INFO: renamed from: f */
    public C10144m<InterfaceC6208b> f36223f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2532v f36224g;

    /* JADX INFO: renamed from: h */
    public InterfaceC10142k f36225h;

    /* JADX INFO: renamed from: i */
    public boolean f36226i;

    /* JADX INFO: renamed from: i9.z$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final AbstractC2382c0.b f36227a;

        /* JADX INFO: renamed from: b */
        public ImmutableList<InterfaceC2492i.b> f36228b = ImmutableList.m9062Y();

        /* JADX INFO: renamed from: c */
        public ImmutableMap<InterfaceC2492i.b, AbstractC2382c0> f36229c = ImmutableMap.m9070h();

        /* JADX INFO: renamed from: d */
        public InterfaceC2492i.b f36230d;

        /* JADX INFO: renamed from: e */
        public InterfaceC2492i.b f36231e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2492i.b f36232f;

        public a(AbstractC2382c0.b bVar) {
            this.f36227a = bVar;
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC2492i.b m12833b(InterfaceC2532v interfaceC2532v, ImmutableList<InterfaceC2492i.b> immutableList, InterfaceC2492i.b bVar, AbstractC2382c0.b bVar2) {
            AbstractC2382c0 currentTimeline = interfaceC2532v.getCurrentTimeline();
            int currentPeriodIndex = interfaceC2532v.getCurrentPeriodIndex();
            Object objMo6780l = currentTimeline.m6910p() ? null : currentTimeline.mo6780l(currentPeriodIndex);
            int iM6912b = (interfaceC2532v.isPlayingAd() || currentTimeline.m6910p()) ? -1 : currentTimeline.mo6777f(currentPeriodIndex, bVar2, false).m6912b(C10134c0.m19026K(interfaceC2532v.getCurrentPosition()) - bVar2.f12067e);
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                InterfaceC2492i.b bVar3 = immutableList.get(i10);
                if (m12834c(bVar3, objMo6780l, interfaceC2532v.isPlayingAd(), interfaceC2532v.getCurrentAdGroupIndex(), interfaceC2532v.getCurrentAdIndexInAdGroup(), iM6912b)) {
                    return bVar3;
                }
            }
            if (immutableList.isEmpty() && bVar != null) {
                if (m12834c(bVar, objMo6780l, interfaceC2532v.isPlayingAd(), interfaceC2532v.getCurrentAdGroupIndex(), interfaceC2532v.getCurrentAdIndexInAdGroup(), iM6912b)) {
                    return bVar;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m12834c(InterfaceC2492i.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            boolean z11 = false;
            if (!bVar.f34757a.equals(obj)) {
                return false;
            }
            int i13 = bVar.f34758b;
            if (z10 && i13 == i10 && bVar.f34759c == i11) {
                z11 = true;
            } else if (!z10 && i13 == -1 && bVar.f34761e == i12) {
                z11 = true;
            }
            return z11;
        }

        /* JADX INFO: renamed from: a */
        public final void m12835a(ImmutableMap.C3148a<InterfaceC2492i.b, AbstractC2382c0> c3148a, InterfaceC2492i.b bVar, AbstractC2382c0 abstractC2382c0) {
            if (bVar == null) {
                return;
            }
            if (abstractC2382c0.mo6774b(bVar.f34757a) != -1) {
                c3148a.m9076b(bVar, abstractC2382c0);
                return;
            }
            AbstractC2382c0 abstractC2382c1 = this.f36229c.get(bVar);
            if (abstractC2382c1 != null) {
                c3148a.m9076b(bVar, abstractC2382c1);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m12836d(AbstractC2382c0 abstractC2382c0) {
            ImmutableMap.C3148a<InterfaceC2492i.b, AbstractC2382c0> c3148a = new ImmutableMap.C3148a<>(4);
            if (this.f36228b.isEmpty()) {
                m12835a(c3148a, this.f36231e, abstractC2382c0);
                if (!C5212l.m11140M(this.f36232f, this.f36231e)) {
                    m12835a(c3148a, this.f36232f, abstractC2382c0);
                }
                if (!C5212l.m11140M(this.f36230d, this.f36231e) && !C5212l.m11140M(this.f36230d, this.f36232f)) {
                    m12835a(c3148a, this.f36230d, abstractC2382c0);
                }
                this.f36229c = c3148a.m9075a();
            }
            for (int i10 = 0; i10 < this.f36228b.size(); i10++) {
                m12835a(c3148a, this.f36228b.get(i10), abstractC2382c0);
            }
            if (!this.f36228b.contains(this.f36230d)) {
                m12835a(c3148a, this.f36230d, abstractC2382c0);
            }
            this.f36229c = c3148a.m9075a();
        }
    }

    public C6236z(InterfaceC10133c interfaceC10133c) {
        interfaceC10133c.getClass();
        this.f36218a = interfaceC10133c;
        int i10 = C10134c0.f51354a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        this.f36223f = new C10144m<>(looperMyLooper, interfaceC10133c, new C8002l(14));
        AbstractC2382c0.b bVar = new AbstractC2382c0.b();
        this.f36219b = bVar;
        this.f36220c = new AbstractC2382c0.c();
        this.f36221d = new a(bVar);
        this.f36222e = new SparseArray<>();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: A */
    public final void mo7406A(C2384d0 c2384d0) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 2, new C8969b(aVarM12827t0, 5, c2384d0));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: B */
    public final void mo7484B(boolean z10) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 3, new C6235y(1, aVarM12827t0, z10));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: C */
    public final void mo7485C() {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, -1, new C5788l(aVarM12827t0, 0));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: D */
    public final void mo7486D(InterfaceC2532v.a aVar) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 13, new C7946b(aVarM12827t0, 5, aVar));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: E */
    public final void mo7407E(final int i10, final boolean z10) {
        final InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 5, new C10144m.a() { // from class: i9.k
            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).mo12799m(i10, aVarM12827t0, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: F */
    public final void mo7487F(final float f3) {
        final InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 22, new C10144m.a() { // from class: i9.c
            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).mo12809w(aVarM12831x0, f3);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2493j
    /* JADX INFO: renamed from: G */
    public final void mo7237G(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
        InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1000, new C6224n(1, aVarM12830w0, c5725h, c5726i));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: H */
    public final void mo7488H(int i10) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 21, new C6223m(aVarM12831x0, i10, 1));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: I */
    public final void mo7489I(int i10, C2466p c2466p) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 1, new C1749c(aVarM12827t0, i10, c2466p));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: J */
    public final void mo7408J(int i10) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 4, new C6223m(aVarM12827t0, i10, 0));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: K */
    public final void mo12743K(InterfaceC6208b interfaceC6208b) {
        interfaceC6208b.getClass();
        C10144m<InterfaceC6208b> c10144m = this.f36223f;
        c10144m.getClass();
        synchronized (c10144m.f51390g) {
            if (c10144m.f51391h) {
                return;
            }
            c10144m.f51387d.add(new C10144m.c<>(interfaceC6208b));
        }
    }

    @Override // p454wa.InterfaceC9878c.a
    /* JADX INFO: renamed from: L */
    public final void mo12826L(final int i10, final long j10, final long j11) {
        a aVar = this.f36221d;
        final InterfaceC6208b.a aVarM12829v0 = m12829v0(aVar.f36228b.isEmpty() ? null : (InterfaceC2492i.b) C5206f.m11002X0(aVar.f36228b));
        m12832y0(aVarM12829v0, 1006, new C10144m.a(i10, j10, j11) { // from class: i9.r

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f36204b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f36205c;

            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).mo12786U(this.f36203a, this.f36204b, this.f36205c);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: M */
    public final void mo7490M(C2412i c2412i) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 29, new C5097k(aVarM12827t0, 1, c2412i));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2493j
    /* JADX INFO: renamed from: N */
    public final void mo7238N(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
        InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1001, new C1343b(aVarM12830w0, c5725h, c5726i));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: O */
    public final void mo7409O(final int i10, final InterfaceC2532v.d dVar, final InterfaceC2532v.d dVar2) {
        if (i10 == 1) {
            this.f36226i = false;
        }
        InterfaceC2532v interfaceC2532v = this.f36224g;
        interfaceC2532v.getClass();
        a aVar = this.f36221d;
        aVar.f36230d = a.m12833b(interfaceC2532v, aVar.f36228b, aVar.f36231e, aVar.f36227a);
        final InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 11, new C10144m.a() { // from class: i9.o
            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                InterfaceC6208b interfaceC6208b = (InterfaceC6208b) obj;
                interfaceC6208b.getClass();
                interfaceC6208b.mo12797k(i10, dVar, dVar2, aVarM12827t0);
            }
        });
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: P */
    public final void mo12744P() {
        if (!this.f36226i) {
            InterfaceC6208b.a aVarM12827t0 = m12827t0();
            this.f36226i = true;
            m12832y0(aVarM12827t0, -1, new C6230t(aVarM12827t0, 0));
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: Q */
    public final void mo7491Q(C2467q c2467q) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 14, new C5097k(aVarM12827t0, 2, c2467q));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: R */
    public final void mo7492R(final boolean z10) {
        final InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 9, new C10144m.a() { // from class: i9.v
            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).mo12808v(aVarM12827t0, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2493j
    /* JADX INFO: renamed from: S */
    public final void mo7239S(int i10, InterfaceC2492i.b bVar, final C5725h c5725h, final C5726i c5726i, final IOException iOException, final boolean z10) {
        final InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1003, new C10144m.a(c5725h, c5726i, iOException, z10) { // from class: i9.l

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C5726i f36184b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ IOException f36185c;

            {
                this.f36184b = c5726i;
                this.f36185c = iOException;
            }

            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).mo12801o(this.f36183a, this.f36184b, this.f36185c);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: T */
    public final void mo7455T(InterfaceC2532v.b bVar) {
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: U */
    public final void mo12745U(InterfaceC2532v interfaceC2532v, Looper looper) {
        C10129a.m18992d(this.f36224g == null || this.f36221d.f36228b.isEmpty());
        interfaceC2532v.getClass();
        this.f36224g = interfaceC2532v;
        this.f36225h = this.f36218a.mo19013b(looper, null);
        C10144m<InterfaceC6208b> c10144m = this.f36223f;
        this.f36223f = new C10144m<>(c10144m.f51387d, looper, c10144m.f51384a, new C8969b(this, 4, interfaceC2532v));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: V */
    public final void mo12746V(List<InterfaceC2492i.b> list, InterfaceC2492i.b bVar) {
        InterfaceC2532v interfaceC2532v = this.f36224g;
        interfaceC2532v.getClass();
        a aVar = this.f36221d;
        aVar.getClass();
        aVar.f36228b = ImmutableList.m9060Q(list);
        if (!list.isEmpty()) {
            aVar.f36231e = list.get(0);
            bVar.getClass();
            aVar.f36232f = bVar;
        }
        if (aVar.f36230d == null) {
            aVar.f36230d = a.m12833b(interfaceC2532v, aVar.f36228b, aVar.f36231e, aVar.f36227a);
        }
        aVar.m12836d(interfaceC2532v.getCurrentTimeline());
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: W */
    public final void mo7493W(final int i10, final boolean z10) {
        final InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 30, new C10144m.a(i10, aVarM12827t0, z10) { // from class: i9.w
            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).getClass();
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: X */
    public final void mo7494X(int i10) {
        InterfaceC2532v interfaceC2532v = this.f36224g;
        interfaceC2532v.getClass();
        a aVar = this.f36221d;
        aVar.f36230d = a.m12833b(interfaceC2532v, aVar.f36228b, aVar.f36231e, aVar.f36227a);
        aVar.m12836d(interfaceC2532v.getCurrentTimeline());
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 0, new C6219i(i10, 1, aVarM12827t0));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: Y */
    public final void mo7495Y(C9508q c9508q) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 19, new C5097k(aVarM12827t0, 3, c9508q));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: Z */
    public final void mo7496Z(C2367a c2367a) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 20, new C1750d(aVarM12831x0, 4, c2367a));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: a */
    public final void mo12747a(String str) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1019, new C1750d(aVarM12831x0, 3, str));
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
    /* JADX INFO: renamed from: a0 */
    public final void mo6961a0(int i10, InterfaceC2492i.b bVar) {
        InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1026, new C6230t(aVarM12830w0, 1));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: b */
    public final void mo12748b(int i10, long j10) {
        InterfaceC6208b.a aVarM12829v0 = m12829v0(this.f36221d.f36231e);
        m12832y0(aVarM12829v0, 1021, new C0166e(i10, j10, aVarM12829v0));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: b0 */
    public final void mo7497b0() {
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: c */
    public final void mo12749c(C6635e c6635e) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1007, new C5097k(aVarM12831x0, 5, c6635e));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: c0 */
    public final void mo7498c0(int i10) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 8, new C6219i(i10, 0, aVarM12827t0));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: d */
    public final void mo12750d(C6635e c6635e) {
        InterfaceC6208b.a aVarM12829v0 = m12829v0(this.f36221d.f36231e);
        m12832y0(aVarM12829v0, 1020, new C8969b(aVarM12829v0, 7, c6635e));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2493j
    /* JADX INFO: renamed from: d0 */
    public final void mo7240d0(int i10, InterfaceC2492i.b bVar, C5726i c5726i) {
        InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1005, new C1750d(aVarM12830w0, 5, c5726i));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: e */
    public final void mo12751e(String str) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1012, new C7946b(aVarM12831x0, 4, str));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: e0 */
    public final void mo12752e0(InterfaceC6208b interfaceC6208b) {
        this.f36223f.m19090d(interfaceC6208b);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: f */
    public final void mo7499f(Metadata metadata) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 28, new C1750d(aVarM12827t0, 2, metadata));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: f0 */
    public final void mo7410f0() {
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: g */
    public final void mo12753g(final int i10, final long j10) {
        final InterfaceC6208b.a aVarM12829v0 = m12829v0(this.f36221d.f36231e);
        m12832y0(aVarM12829v0, 1018, new C10144m.a(i10, j10, aVarM12829v0) { // from class: i9.h

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC6208b.a f36172a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f36173b;

            {
                this.f36172a = aVarM12829v0;
            }

            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).mo12779N(this.f36173b, this.f36172a);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2493j
    /* JADX INFO: renamed from: g0 */
    public final void mo7242g0(int i10, InterfaceC2492i.b bVar, C5726i c5726i) {
        InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1004, new C8969b(aVarM12830w0, 6, c5726i));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: h */
    public final void mo7411h(C10332n c10332n) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 25, new C8969b(aVarM12831x0, 9, c10332n));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: h0 */
    public final void mo7500h0(List<C6640a> list) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 27, new C1750d(aVarM12827t0, 6, list));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: i */
    public final void mo12754i(C2416m c2416m, C6637g c6637g) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1009, new C5100n(aVarM12831x0, c2416m, c6637g));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: i0 */
    public final void mo7501i0(int i10, boolean z10) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, -1, new C0204c(i10, aVarM12827t0, z10));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: j */
    public final void mo7412j(C6642c c6642c) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 27, new C7946b(aVarM12827t0, 6, c6642c));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: j0 */
    public final void mo7502j0(ExoPlaybackException exoPlaybackException) {
        C5727j c5727j;
        InterfaceC6208b.a aVarM12827t0 = (!(exoPlaybackException instanceof ExoPlaybackException) || (c5727j = exoPlaybackException.f11795h) == null) ? m12827t0() : m12829v0(new InterfaceC2492i.b(c5727j));
        m12832y0(aVarM12827t0, 10, new C7946b(aVarM12827t0, 3, exoPlaybackException));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: k */
    public final void mo7503k(boolean z10) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 23, new C6235y(0, aVarM12831x0, z10));
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
    /* JADX INFO: renamed from: k0 */
    public final void mo6962k0(int i10, InterfaceC2492i.b bVar) {
        InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1023, new C6214e(aVarM12830w0, 1));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: l */
    public final void mo12755l(Exception exc) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1014, new C6217g(aVarM12831x0, exc, 0));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: l0 */
    public final void mo7504l0() {
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: m */
    public final void mo12756m(long j10) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1010, new C5099m(aVarM12831x0, j10));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: m0 */
    public final void mo7505m0(final int i10, final int i11) {
        final InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 24, new C10144m.a() { // from class: i9.j
            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).mo12777L(aVarM12831x0, i10, i11);
            }
        });
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: n */
    public final void mo12757n(Exception exc) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1029, new C6229s(aVarM12831x0, exc, 1));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: n0 */
    public final void mo7506n0(C2505u c2505u) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 12, new C7946b(aVarM12827t0, 7, c2505u));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: o */
    public final void mo12758o(Exception exc) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1030, new C6229s(aVarM12831x0, exc, 0));
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
    /* JADX INFO: renamed from: o0 */
    public final void mo6963o0(int i10, InterfaceC2492i.b bVar, int i11) {
        InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1022, new C5921k(i11, 1, aVarM12830w0));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: p */
    public final void mo12759p(final long j10, final Object obj) {
        final InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 26, new C10144m.a(obj, j10) { // from class: i9.q

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f36202b;

            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj2) {
                ((InterfaceC6208b) obj2).mo12812z(this.f36201a, this.f36202b);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
    /* JADX INFO: renamed from: p0 */
    public final void mo6964p0(int i10, InterfaceC2492i.b bVar) {
        InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1027, new C6214e(aVarM12830w0, 0));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: q */
    public final void mo12760q(C2416m c2416m, C6637g c6637g) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1017, new C6224n(0, aVarM12831x0, c2416m, c6637g));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: q0 */
    public final void mo7507q0(C2467q c2467q) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 15, new C8969b(aVarM12827t0, 8, c2467q));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: r */
    public final void mo12761r(C6635e c6635e) {
        InterfaceC6208b.a aVarM12829v0 = m12829v0(this.f36221d.f36231e);
        m12832y0(aVarM12829v0, 1013, new C6234x(1, aVarM12829v0, c6635e));
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
    /* JADX INFO: renamed from: r0 */
    public final void mo6965r0(int i10, InterfaceC2492i.b bVar) {
        InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1025, new C9370m(7, aVarM12830w0));
    }

    @Override // p174i9.InterfaceC6206a
    public final void release() {
        InterfaceC10142k interfaceC10142k = this.f36225h;
        C10129a.m18993e(interfaceC10142k);
        interfaceC10142k.mo19079e(new RunnableC0190i(11, this));
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: s */
    public final void mo12762s(final long j10, final long j11, final String str) {
        final InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1016, new C10144m.a(str, j11, j10) { // from class: i9.u

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f36210b;

            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).mo12802p(this.f36209a, this.f36210b);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: s0 */
    public final void mo7508s0(final boolean z10) {
        final InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 7, new C10144m.a() { // from class: i9.f
            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).mo12773H(aVarM12827t0, z10);
            }
        });
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: t */
    public final void mo12763t(final int i10, final long j10, final long j11) {
        final InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1011, new C10144m.a() { // from class: i9.p
            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).mo12774I(aVarM12831x0, i10, j10, j11);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final InterfaceC6208b.a m12827t0() {
        return m12829v0(this.f36221d.f36230d);
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: u */
    public final void mo12764u(C6635e c6635e) {
        InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1015, new C6234x(0, aVarM12831x0, c6635e));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    @RequiresNonNull({"player"})
    /* JADX INFO: renamed from: u0 */
    public final InterfaceC6208b.a m12828u0(AbstractC2382c0 abstractC2382c0, int i10, InterfaceC2492i.b bVar) {
        long jM19033R;
        InterfaceC2492i.b bVar2 = abstractC2382c0.m6910p() ? null : bVar;
        long jMo19015d = this.f36218a.mo19015d();
        boolean z10 = abstractC2382c0.equals(this.f36224g.getCurrentTimeline()) && i10 == this.f36224g.getCurrentMediaItemIndex();
        if (bVar2 != null && bVar2.m12079a()) {
            if (z10 && this.f36224g.getCurrentAdGroupIndex() == bVar2.f34758b && this.f36224g.getCurrentAdIndexInAdGroup() == bVar2.f34759c) {
                jM19033R = this.f36224g.getCurrentPosition();
            } else {
                jM19033R = 0;
            }
        } else if (z10) {
            jM19033R = this.f36224g.getContentPosition();
        } else if (abstractC2382c0.m6910p()) {
            jM19033R = 0;
        } else {
            jM19033R = C10134c0.m19033R(abstractC2382c0.m6908m(i10, this.f36220c).f12086H);
        }
        return new InterfaceC6208b.a(jMo19015d, abstractC2382c0, i10, bVar2, jM19033R, this.f36224g.getCurrentTimeline(), this.f36224g.getCurrentMediaItemIndex(), this.f36221d.f36230d, this.f36224g.getCurrentPosition(), this.f36224g.getTotalBufferedDuration());
    }

    @Override // p174i9.InterfaceC6206a
    /* JADX INFO: renamed from: v */
    public final void mo12765v(final long j10, final long j11, final String str) {
        final InterfaceC6208b.a aVarM12831x0 = m12831x0();
        m12832y0(aVarM12831x0, 1008, new C10144m.a(str, j11, j10) { // from class: i9.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f36160b;

            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC6208b) obj).mo12768C(this.f36159a, this.f36160b);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final InterfaceC6208b.a m12829v0(InterfaceC2492i.b bVar) {
        this.f36224g.getClass();
        AbstractC2382c0 abstractC2382c0 = bVar == null ? null : this.f36221d.f36229c.get(bVar);
        if (bVar != null && abstractC2382c0 != null) {
            return m12828u0(abstractC2382c0, abstractC2382c0.mo6778g(bVar.f34757a, this.f36219b).f12065c, bVar);
        }
        int currentMediaItemIndex = this.f36224g.getCurrentMediaItemIndex();
        AbstractC2382c0 currentTimeline = this.f36224g.getCurrentTimeline();
        if (!(currentMediaItemIndex < currentTimeline.mo6909o())) {
            currentTimeline = AbstractC2382c0.f12057a;
        }
        return m12828u0(currentTimeline, currentMediaItemIndex, null);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: w */
    public final void mo7509w(int i10) {
        InterfaceC6208b.a aVarM12827t0 = m12827t0();
        m12832y0(aVarM12827t0, 6, new C5935r(i10, 1, aVarM12827t0));
    }

    /* JADX INFO: renamed from: w0 */
    public final InterfaceC6208b.a m12830w0(int i10, InterfaceC2492i.b bVar) {
        this.f36224g.getClass();
        boolean z10 = true;
        if (bVar != null) {
            if (this.f36221d.f36229c.get(bVar) == null) {
                z10 = false;
            }
            return z10 ? m12829v0(bVar) : m12828u0(AbstractC2382c0.f12057a, i10, bVar);
        }
        AbstractC2382c0 currentTimeline = this.f36224g.getCurrentTimeline();
        if (i10 >= currentTimeline.mo6909o()) {
            z10 = false;
        }
        if (!z10) {
            currentTimeline = AbstractC2382c0.f12057a;
        }
        return m12828u0(currentTimeline, i10, null);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2493j
    /* JADX INFO: renamed from: x */
    public final void mo7243x(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
        InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1002, new C5102p(2, aVarM12830w0, c5725h, c5726i));
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC6208b.a m12831x0() {
        return m12829v0(this.f36221d.f36232f);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
    /* JADX INFO: renamed from: y */
    public final void mo6966y(int i10, InterfaceC2492i.b bVar, Exception exc) {
        InterfaceC6208b.a aVarM12830w0 = m12830w0(i10, bVar);
        m12832y0(aVarM12830w0, 1024, new C6217g(aVarM12830w0, exc, 1));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m12832y0(InterfaceC6208b.a aVar, int i10, C10144m.a<InterfaceC6208b> aVar2) {
        this.f36222e.put(i10, aVar);
        this.f36223f.m19091e(i10, aVar2);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: z */
    public final void mo7510z(ExoPlaybackException exoPlaybackException) {
        C5727j c5727j;
        InterfaceC6208b.a aVarM12827t0 = (!(exoPlaybackException instanceof ExoPlaybackException) || (c5727j = exoPlaybackException.f11795h) == null) ? m12827t0() : m12829v0(new InterfaceC2492i.b(c5727j));
        m12832y0(aVarM12827t0, 10, new C5097k(aVarM12827t0, 4, exoPlaybackException));
    }
}
