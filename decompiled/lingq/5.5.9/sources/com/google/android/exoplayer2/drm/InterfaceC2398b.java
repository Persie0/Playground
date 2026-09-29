package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import java.util.concurrent.CopyOnWriteArrayList;
import p080e.RunnableC5286r;
import p128g2.RunnableC5682t;
import p169i4.RunnableC6179e;
import p213k4.RunnableC6589i;
import p239l9.RunnableC7286a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2398b {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f12200a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2492i.b f12201b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList<C10600a> f12202c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.b$a$a, reason: collision with other inner class name */
        public static final class C10600a {

            /* JADX INFO: renamed from: a */
            public final Handler f12203a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC2398b f12204b;

            public C10600a(Handler handler, InterfaceC2398b interfaceC2398b) {
                this.f12203a = handler;
                this.f12204b = interfaceC2398b;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a(CopyOnWriteArrayList<C10600a> copyOnWriteArrayList, int i10, InterfaceC2492i.b bVar) {
            this.f12202c = copyOnWriteArrayList;
            this.f12200a = i10;
            this.f12201b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m6967a() {
            for (C10600a c10600a : this.f12202c) {
                C10134c0.m19029N(c10600a.f12203a, new RunnableC7286a(this, c10600a.f12204b, 1));
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m6968b() {
            for (C10600a c10600a : this.f12202c) {
                C10134c0.m19029N(c10600a.f12203a, new RunnableC5682t(this, 10, c10600a.f12204b));
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m6969c() {
            for (C10600a c10600a : this.f12202c) {
                C10134c0.m19029N(c10600a.f12203a, new RunnableC5286r(this, 13, c10600a.f12204b));
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m6970d(int i10) {
            for (C10600a c10600a : this.f12202c) {
                C10134c0.m19029N(c10600a.f12203a, new RunnableC6179e(this, c10600a.f12204b, i10));
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m6971e(Exception exc) {
            for (C10600a c10600a : this.f12202c) {
                C10134c0.m19029N(c10600a.f12203a, new RunnableC6589i(4, this, c10600a.f12204b, exc));
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m6972f() {
            for (C10600a c10600a : this.f12202c) {
                C10134c0.m19029N(c10600a.f12203a, new RunnableC7286a(this, c10600a.f12204b, 0));
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    default void mo6961a0(int i10, InterfaceC2492i.b bVar) {
    }

    /* JADX INFO: renamed from: k0 */
    default void mo6962k0(int i10, InterfaceC2492i.b bVar) {
    }

    /* JADX INFO: renamed from: o0 */
    default void mo6963o0(int i10, InterfaceC2492i.b bVar, int i11) {
    }

    /* JADX INFO: renamed from: p0 */
    default void mo6964p0(int i10, InterfaceC2492i.b bVar) {
    }

    /* JADX INFO: renamed from: r0 */
    default void mo6965r0(int i10, InterfaceC2492i.b bVar) {
    }

    /* JADX INFO: renamed from: y */
    default void mo6966y(int i10, InterfaceC2492i.b bVar, Exception exc) {
    }
}
