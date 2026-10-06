package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jmx extends Handler {
    public jmx() {
        Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: a */
    protected void mo13380a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        mo13380a(message);
    }

    public jmx(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public jmx(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
