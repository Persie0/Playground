package p152hb;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: hb.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC5972g0 extends HandlerC9517f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5978i0 f35485a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5972g0(C5978i0 c5978i0, Looper looper) {
        super(looper);
        this.f35485a = c5978i0;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        C5978i0 c5978i0 = this.f35485a;
        if (i10 == 1) {
            Lock lock = c5978i0.f35508b;
            lock.lock();
            try {
                if (c5978i0.m12431o()) {
                    c5978i0.m12433q();
                }
                lock.unlock();
                return;
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }
        if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i10);
            Log.w("GoogleApiClientImpl", sb2.toString());
            return;
        }
        c5978i0.f35508b.lock();
        try {
            if (c5978i0.f35515i) {
                c5978i0.m12433q();
            }
            c5978i0.f35508b.unlock();
        } catch (Throwable th3) {
            c5978i0.f35508b.unlock();
            throw th3;
        }
    }
}
