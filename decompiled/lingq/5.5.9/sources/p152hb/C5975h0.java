package p152hb;

import android.support.v4.media.AbstractC0140a;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: hb.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5975h0 extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public final WeakReference<C5978i0> f35495a;

    public C5975h0(C5978i0 c5978i0) {
        this.f35495a = new WeakReference<>(c5978i0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: j0 */
    public final void mo601j0() {
        C5978i0 c5978i0 = this.f35495a.get();
        if (c5978i0 == null) {
            return;
        }
        c5978i0.f35508b.lock();
        try {
            if (c5978i0.f35515i) {
                c5978i0.m12433q();
            }
            Lock lock = c5978i0.f35508b;
        } finally {
            c5978i0.f35508b.unlock();
        }
    }
}
