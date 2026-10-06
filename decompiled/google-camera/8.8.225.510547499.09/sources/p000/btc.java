package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btc implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((bsz) message.obj).mo3018e();
        return true;
    }
}
