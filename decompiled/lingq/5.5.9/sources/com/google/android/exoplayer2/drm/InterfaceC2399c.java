package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.C2416m;
import p150h9.C5931p;
import p174i9.C6215e0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2399c {

    /* JADX INFO: renamed from: a */
    public static final a f12205a = new a();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.c$a */
    public class a implements InterfaceC2399c {
        @Override // com.google.android.exoplayer2.drm.InterfaceC2399c
        /* JADX INFO: renamed from: a */
        public final int mo6947a(C2416m c2416m) {
            return c2416m.f12453J != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2399c
        /* JADX INFO: renamed from: b */
        public final void mo6948b(Looper looper, C6215e0 c6215e0) {
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2399c
        /* JADX INFO: renamed from: c */
        public final DrmSession mo6949c(InterfaceC2398b.a aVar, C2416m c2416m) {
            if (c2416m.f12453J == null) {
                return null;
            }
            return new C2401e(new DrmSession.DrmSessionException(new UnsupportedDrmException(), 6001));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.c$b */
    public interface b {

        /* JADX INFO: renamed from: p */
        public static final C5931p f12206p = new C5931p(13);

        void release();
    }

    /* JADX INFO: renamed from: a */
    int mo6947a(C2416m c2416m);

    /* JADX INFO: renamed from: b */
    void mo6948b(Looper looper, C6215e0 c6215e0);

    /* JADX INFO: renamed from: c */
    DrmSession mo6949c(InterfaceC2398b.a aVar, C2416m c2416m);

    /* JADX INFO: renamed from: d */
    default b mo6950d(InterfaceC2398b.a aVar, C2416m c2416m) {
        return b.f12206p;
    }

    default void prepare() {
    }

    default void release() {
    }
}
