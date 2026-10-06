package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jfc extends jmx {
    public jfc() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Pair pair = (Pair) message.obj;
                jel jelVar = (jel) pair.second;
                try {
                    throw null;
                } catch (RuntimeException e) {
                    BasePendingResult.m4646h(jelVar);
                    throw e;
                }
            case 2:
                ((BasePendingResult) message.obj).m4648g(Status.f7604d);
                return;
            default:
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
                return;
        }
    }

    public jfc(Looper looper) {
        super(looper);
    }
}
