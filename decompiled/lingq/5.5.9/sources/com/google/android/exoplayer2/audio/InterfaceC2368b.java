package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2416m;
import p218k9.C6635e;
import p218k9.C6637g;
import p286o2.RunnableC7907g;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2368b {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Handler f11945a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2368b f11946b;

        public a(Handler handler, C2413j.b bVar) {
            this.f11945a = handler;
            this.f11946b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m6851a(C6635e c6635e) {
            synchronized (c6635e) {
            }
            Handler handler = this.f11945a;
            if (handler != null) {
                handler.post(new RunnableC7907g(this, 11, c6635e));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    default void mo6841c(C6635e c6635e) {
    }

    /* JADX INFO: renamed from: e */
    default void mo6842e(String str) {
    }

    /* JADX INFO: renamed from: i */
    default void mo6843i(C2416m c2416m, C6637g c6637g) {
    }

    /* JADX INFO: renamed from: k */
    default void mo6844k(boolean z10) {
    }

    /* JADX INFO: renamed from: l */
    default void mo6845l(Exception exc) {
    }

    /* JADX INFO: renamed from: m */
    default void mo6846m(long j10) {
    }

    /* JADX INFO: renamed from: n */
    default void mo6847n(Exception exc) {
    }

    /* JADX INFO: renamed from: r */
    default void mo6848r(C6635e c6635e) {
    }

    /* JADX INFO: renamed from: t */
    default void mo6849t(int i10, long j10, long j11) {
    }

    /* JADX INFO: renamed from: v */
    default void mo6850v(long j10, long j11, String str) {
    }
}
