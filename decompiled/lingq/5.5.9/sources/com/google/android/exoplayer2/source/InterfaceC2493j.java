package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.source.InterfaceC2493j;
import ga.C5725h;
import ga.C5726i;
import ga.RunnableC5728k;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p150h9.RunnableC5912f0;
import p274n8.RunnableC7716a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.j */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2493j {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f13289a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2492i.b f13290b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList<C10601a> f13291c;

        /* JADX INFO: renamed from: d */
        public final long f13292d;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.j$a$a, reason: collision with other inner class name */
        public static final class C10601a {

            /* JADX INFO: renamed from: a */
            public final Handler f13293a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC2493j f13294b;

            public C10601a(Handler handler, InterfaceC2493j interfaceC2493j) {
                this.f13293a = handler;
                this.f13294b = interfaceC2493j;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public a(CopyOnWriteArrayList<C10601a> copyOnWriteArrayList, int i10, InterfaceC2492i.b bVar, long j10) {
            this.f13291c = copyOnWriteArrayList;
            this.f13289a = i10;
            this.f13290b = bVar;
            this.f13292d = j10;
        }

        /* JADX INFO: renamed from: a */
        public final long m7326a(long j10) {
            long jM19033R = C10134c0.m19033R(j10);
            if (jM19033R == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f13292d + jM19033R;
        }

        /* JADX INFO: renamed from: b */
        public final void m7327b(int i10, C2416m c2416m, int i11, Object obj, long j10) {
            m7328c(new C5726i(1, i10, c2416m, i11, obj, m7326a(j10), -9223372036854775807L));
        }

        /* JADX INFO: renamed from: c */
        public final void m7328c(C5726i c5726i) {
            for (C10601a c10601a : this.f13291c) {
                C10134c0.m19029N(c10601a.f13293a, new RunnableC7716a(2, this, c10601a.f13294b, c5726i));
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m7329d(C5725h c5725h, int i10, int i11, C2416m c2416m, int i12, Object obj, long j10, long j11) {
            m7330e(c5725h, new C5726i(i10, i11, c2416m, i12, obj, m7326a(j10), m7326a(j11)));
        }

        /* JADX INFO: renamed from: e */
        public final void m7330e(C5725h c5725h, C5726i c5726i) {
            for (C10601a c10601a : this.f13291c) {
                C10134c0.m19029N(c10601a.f13293a, new RunnableC5728k(this, c10601a.f13294b, c5725h, c5726i, 1));
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m7331f(C5725h c5725h, int i10, int i11, C2416m c2416m, int i12, Object obj, long j10, long j11) {
            m7332g(c5725h, new C5726i(i10, i11, c2416m, i12, obj, m7326a(j10), m7326a(j11)));
        }

        /* JADX INFO: renamed from: g */
        public final void m7332g(C5725h c5725h, C5726i c5726i) {
            for (C10601a c10601a : this.f13291c) {
                C10134c0.m19029N(c10601a.f13293a, new RunnableC5912f0(this, c10601a.f13294b, c5725h, c5726i, 1));
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m7333h(C5725h c5725h, int i10, int i11, C2416m c2416m, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            m7335j(c5725h, new C5726i(i10, i11, c2416m, i12, obj, m7326a(j10), m7326a(j11)), iOException, z10);
        }

        /* JADX INFO: renamed from: i */
        public final void m7334i(C5725h c5725h, int i10, IOException iOException, boolean z10) {
            m7333h(c5725h, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        /* JADX INFO: renamed from: j */
        public final void m7335j(final C5725h c5725h, final C5726i c5726i, final IOException iOException, final boolean z10) {
            for (C10601a c10601a : this.f13291c) {
                final InterfaceC2493j interfaceC2493j = c10601a.f13294b;
                C10134c0.m19029N(c10601a.f13293a, new Runnable() { // from class: ga.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2493j interfaceC2493j2 = interfaceC2493j;
                        C5725h c5725h2 = c5725h;
                        C5726i c5726i2 = c5726i;
                        IOException iOException2 = iOException;
                        boolean z11 = z10;
                        InterfaceC2493j.a aVar = this.f34767a;
                        interfaceC2493j2.mo7239S(aVar.f13289a, aVar.f13290b, c5725h2, c5726i2, iOException2, z11);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m7336k(C5725h c5725h, int i10, int i11, C2416m c2416m, int i12, Object obj, long j10, long j11) {
            m7337l(c5725h, new C5726i(i10, i11, c2416m, i12, obj, m7326a(j10), m7326a(j11)));
        }

        /* JADX INFO: renamed from: l */
        public final void m7337l(C5725h c5725h, C5726i c5726i) {
            for (C10601a c10601a : this.f13291c) {
                C10134c0.m19029N(c10601a.f13293a, new RunnableC5728k(this, c10601a.f13294b, c5725h, c5726i, 0));
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m7338m(final C5726i c5726i) {
            final InterfaceC2492i.b bVar = this.f13290b;
            bVar.getClass();
            for (C10601a c10601a : this.f13291c) {
                final InterfaceC2493j interfaceC2493j = c10601a.f13294b;
                C10134c0.m19029N(c10601a.f13293a, new Runnable() { // from class: ga.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC2493j.mo7240d0(this.f34773a.f13289a, bVar, c5726i);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: G */
    default void mo7237G(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
    }

    /* JADX INFO: renamed from: N */
    default void mo7238N(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
    }

    /* JADX INFO: renamed from: S */
    default void mo7239S(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i, IOException iOException, boolean z10) {
    }

    /* JADX INFO: renamed from: d0 */
    default void mo7240d0(int i10, InterfaceC2492i.b bVar, C5726i c5726i) {
    }

    /* JADX INFO: renamed from: g0 */
    default void mo7242g0(int i10, InterfaceC2492i.b bVar, C5726i c5726i) {
    }

    /* JADX INFO: renamed from: x */
    default void mo7243x(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
    }
}
