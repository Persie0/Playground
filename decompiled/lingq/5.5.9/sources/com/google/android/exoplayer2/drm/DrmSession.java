package com.google.android.exoplayer2.drm;

import java.io.IOException;
import java.util.UUID;
import p218k9.InterfaceC6632b;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: a */
        public final int f12195a;

        public DrmSessionException(Throwable th2, int i10) {
            super(th2);
            this.f12195a = i10;
        }
    }

    /* JADX INFO: renamed from: i */
    static void m6958i(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.mo6937g(null);
        }
        if (drmSession != null) {
            drmSession.mo6938h(null);
        }
    }

    /* JADX INFO: renamed from: f */
    DrmSessionException mo6936f();

    /* JADX INFO: renamed from: g */
    void mo6937g(InterfaceC2398b.a aVar);

    int getState();

    /* JADX INFO: renamed from: h */
    void mo6938h(InterfaceC2398b.a aVar);

    /* JADX INFO: renamed from: j */
    UUID mo6939j();

    /* JADX INFO: renamed from: k */
    default boolean mo6940k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    boolean mo6941l(String str);

    /* JADX INFO: renamed from: m */
    InterfaceC6632b mo6942m();
}
