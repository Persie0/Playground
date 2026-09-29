package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import ga.C5719b;
import ga.C5725h;
import ga.C5726i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p454wa.InterfaceC9894s;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2475c<T> extends AbstractC2471a {

    /* JADX INFO: renamed from: a */
    public final HashMap<T, b<T>> f13073a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public Handler f13074b;

    /* JADX INFO: renamed from: c */
    public InterfaceC9894s f13075c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$a */
    public final class a implements InterfaceC2493j, InterfaceC2398b {

        /* JADX INFO: renamed from: a */
        public final T f13076a;

        /* JADX INFO: renamed from: b */
        public InterfaceC2493j.a f13077b;

        /* JADX INFO: renamed from: c */
        public InterfaceC2398b.a f13078c;

        public a(T t10) {
            this.f13077b = AbstractC2475c.this.createEventDispatcher(null);
            this.f13078c = AbstractC2475c.this.createDrmEventDispatcher(null);
            this.f13076a = t10;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: G */
        public final void mo7237G(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
            if (m7266f(i10, bVar)) {
                this.f13077b.m7337l(c5725h, m7267h(c5726i));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: N */
        public final void mo7238N(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
            if (m7266f(i10, bVar)) {
                this.f13077b.m7332g(c5725h, m7267h(c5726i));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: S */
        public final void mo7239S(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i, IOException iOException, boolean z10) {
            if (m7266f(i10, bVar)) {
                this.f13077b.m7335j(c5725h, m7267h(c5726i), iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: a0 */
        public final void mo6961a0(int i10, InterfaceC2492i.b bVar) {
            if (m7266f(i10, bVar)) {
                this.f13078c.m6968b();
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: d0 */
        public final void mo7240d0(int i10, InterfaceC2492i.b bVar, C5726i c5726i) {
            if (m7266f(i10, bVar)) {
                this.f13077b.m7338m(m7267h(c5726i));
            }
        }

        /* JADX INFO: renamed from: f */
        public final boolean m7266f(int i10, InterfaceC2492i.b bVar) {
            InterfaceC2492i.b bVarMo7246a;
            T t10 = this.f13076a;
            AbstractC2475c abstractC2475c = AbstractC2475c.this;
            if (bVar != null) {
                bVarMo7246a = abstractC2475c.mo7246a(t10, bVar);
                if (bVarMo7246a == null) {
                    return false;
                }
            } else {
                bVarMo7246a = null;
            }
            int iMo7264c = abstractC2475c.mo7264c(i10, t10);
            InterfaceC2493j.a aVar = this.f13077b;
            if (aVar.f13289a != iMo7264c || !C10134c0.m19034a(aVar.f13290b, bVarMo7246a)) {
                this.f13077b = abstractC2475c.createEventDispatcher(iMo7264c, bVarMo7246a, 0L);
            }
            InterfaceC2398b.a aVar2 = this.f13078c;
            if (aVar2.f12200a == iMo7264c && C10134c0.m19034a(aVar2.f12201b, bVarMo7246a)) {
                return true;
            }
            this.f13078c = abstractC2475c.createDrmEventDispatcher(iMo7264c, bVarMo7246a);
            return true;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: g0 */
        public final void mo7242g0(int i10, InterfaceC2492i.b bVar, C5726i c5726i) {
            if (m7266f(i10, bVar)) {
                this.f13077b.m7328c(m7267h(c5726i));
            }
        }

        /* JADX INFO: renamed from: h */
        public final C5726i m7267h(C5726i c5726i) {
            long j10 = c5726i.f34755f;
            AbstractC2475c abstractC2475c = AbstractC2475c.this;
            T t10 = this.f13076a;
            long jMo7263b = abstractC2475c.mo7263b(j10, t10);
            long j11 = c5726i.f34756g;
            long jMo7263b2 = abstractC2475c.mo7263b(j11, t10);
            return (jMo7263b == c5726i.f34755f && jMo7263b2 == j11) ? c5726i : new C5726i(c5726i.f34750a, c5726i.f34751b, c5726i.f34752c, c5726i.f34753d, c5726i.f34754e, jMo7263b, jMo7263b2);
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: k0 */
        public final void mo6962k0(int i10, InterfaceC2492i.b bVar) {
            if (m7266f(i10, bVar)) {
                this.f13078c.m6967a();
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: o0 */
        public final void mo6963o0(int i10, InterfaceC2492i.b bVar, int i11) {
            if (m7266f(i10, bVar)) {
                this.f13078c.m6970d(i11);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: p0 */
        public final void mo6964p0(int i10, InterfaceC2492i.b bVar) {
            if (m7266f(i10, bVar)) {
                this.f13078c.m6972f();
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: r0 */
        public final void mo6965r0(int i10, InterfaceC2492i.b bVar) {
            if (m7266f(i10, bVar)) {
                this.f13078c.m6969c();
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: x */
        public final void mo7243x(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
            if (m7266f(i10, bVar)) {
                this.f13077b.m7330e(c5725h, m7267h(c5726i));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: y */
        public final void mo6966y(int i10, InterfaceC2492i.b bVar, Exception exc) {
            if (m7266f(i10, bVar)) {
                this.f13078c.m6971e(exc);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$b */
    public static final class b<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2492i f13080a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2492i.c f13081b;

        /* JADX INFO: renamed from: c */
        public final AbstractC2475c<T>.a f13082c;

        public b(InterfaceC2492i interfaceC2492i, C5719b c5719b, a aVar) {
            this.f13080a = interfaceC2492i;
            this.f13081b = c5719b;
            this.f13082c = aVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC2492i.b mo7246a(T t10, InterfaceC2492i.b bVar);

    /* JADX INFO: renamed from: b */
    public long mo7263b(long j10, Object obj) {
        return j10;
    }

    /* JADX INFO: renamed from: c */
    public int mo7264c(int i10, Object obj) {
        return i10;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo7247d(T t10, InterfaceC2492i interfaceC2492i, AbstractC2382c0 abstractC2382c0);

    @Override // com.google.android.exoplayer2.source.AbstractC2471a
    public final void disableInternal() {
        for (b<T> bVar : this.f13073a.values()) {
            bVar.f13080a.disable(bVar.f13081b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.exoplayer2.source.i$c, ga.b] */
    /* JADX INFO: renamed from: e */
    public final void m7265e(final T t10, InterfaceC2492i interfaceC2492i) {
        HashMap<T, b<T>> map = this.f13073a;
        C10129a.m18990b(!map.containsKey(t10));
        ?? r10 = new InterfaceC2492i.c() { // from class: ga.b
            @Override // com.google.android.exoplayer2.source.InterfaceC2492i.c
            /* JADX INFO: renamed from: a */
            public final void mo7325a(InterfaceC2492i interfaceC2492i2, AbstractC2382c0 abstractC2382c0) {
                this.f34738a.mo7247d(t10, interfaceC2492i2, abstractC2382c0);
            }
        };
        a aVar = new a(t10);
        map.put(t10, new b<>(interfaceC2492i, r10, aVar));
        Handler handler = this.f13074b;
        handler.getClass();
        interfaceC2492i.addEventListener(handler, aVar);
        Handler handler2 = this.f13074b;
        handler2.getClass();
        interfaceC2492i.addDrmEventListener(handler2, aVar);
        interfaceC2492i.prepareSource(r10, this.f13075c, getPlayerId());
        if (isEnabled()) {
            return;
        }
        interfaceC2492i.disable(r10);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2471a
    public final void enableInternal() {
        for (b<T> bVar : this.f13073a.values()) {
            bVar.f13080a.enable(bVar.f13081b);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<b<T>> it = this.f13073a.values().iterator();
        while (it.hasNext()) {
            it.next().f13080a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2471a
    public void prepareSourceInternal(InterfaceC9894s interfaceC9894s) {
        this.f13075c = interfaceC9894s;
        this.f13074b = C10134c0.m19044k(null);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2471a
    public void releaseSourceInternal() {
        HashMap<T, b<T>> map = this.f13073a;
        for (b<T> bVar : map.values()) {
            bVar.f13080a.releaseSource(bVar.f13081b);
            InterfaceC2492i interfaceC2492i = bVar.f13080a;
            AbstractC2475c<T>.a aVar = bVar.f13082c;
            interfaceC2492i.removeEventListener(aVar);
            interfaceC2492i.removeDrmEventListener(aVar);
        }
        map.clear();
    }
}
