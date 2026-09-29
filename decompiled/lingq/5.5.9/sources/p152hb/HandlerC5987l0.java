package p152hb;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: hb.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC5987l0 extends HandlerC9517f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5990m0 f35525a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5987l0(C5990m0 c5990m0, Looper looper) {
        super(looper);
        this.f35525a = c5990m0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Lock lock;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 == 2) {
                throw ((RuntimeException) message.obj);
            }
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i10);
            Log.w("GACStateManager", sb2.toString());
            return;
        }
        AbstractC5984k0 abstractC5984k0 = (AbstractC5984k0) message.obj;
        C5990m0 c5990m0 = this.f35525a;
        abstractC5984k0.getClass();
        c5990m0.f35530a.lock();
        try {
            if (c5990m0.f35540k != abstractC5984k0.f35521a) {
                lock = c5990m0.f35530a;
            } else {
                abstractC5984k0.mo12385a();
                lock = c5990m0.f35530a;
            }
            lock.unlock();
        } catch (Throwable th2) {
            c5990m0.f35530a.unlock();
            throw th2;
        }
    }
}
