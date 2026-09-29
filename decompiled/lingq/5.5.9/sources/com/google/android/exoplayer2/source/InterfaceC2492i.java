package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import ga.C5727j;
import java.io.IOException;
import p174i9.C6215e0;
import p239l9.InterfaceC7287b;
import p454wa.InterfaceC9877b;
import p454wa.InterfaceC9894s;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.i */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2492i {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        InterfaceC2492i mo7269a(C2466p c2466p);

        /* JADX INFO: renamed from: b */
        a mo7270b(InterfaceC7287b interfaceC7287b);

        /* JADX INFO: renamed from: c */
        a mo7271c(InterfaceC2528b interfaceC2528b);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.i$b */
    public static final class b extends C5727j {
        public b(int i10, long j10, Object obj) {
            super(obj, -1, -1, j10, i10);
        }

        public b(long j10, Object obj) {
            super(j10, obj);
        }

        public b(C5727j c5727j) {
            super(c5727j);
        }

        public b(Object obj) {
            super(-1L, obj);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10, -1);
        }

        /* JADX INFO: renamed from: b */
        public final b m7324b(Object obj) {
            return new b(this.f34757a.equals(obj) ? this : new C5727j(obj, this.f34758b, this.f34759c, this.f34760d, this.f34761e));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.i$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo7325a(InterfaceC2492i interfaceC2492i, AbstractC2382c0 abstractC2382c0);
    }

    void addDrmEventListener(Handler handler, InterfaceC2398b interfaceC2398b);

    void addEventListener(Handler handler, InterfaceC2493j interfaceC2493j);

    InterfaceC2480h createPeriod(b bVar, InterfaceC9877b interfaceC9877b, long j10);

    void disable(c cVar);

    void enable(c cVar);

    default AbstractC2382c0 getInitialTimeline() {
        return null;
    }

    C2466p getMediaItem();

    default boolean isSingleWindow() {
        return true;
    }

    void maybeThrowSourceInfoRefreshError() throws IOException;

    void prepareSource(c cVar, InterfaceC9894s interfaceC9894s, C6215e0 c6215e0);

    void releasePeriod(InterfaceC2480h interfaceC2480h);

    void releaseSource(c cVar);

    void removeDrmEventListener(InterfaceC2398b interfaceC2398b);

    void removeEventListener(InterfaceC2493j interfaceC2493j);
}
