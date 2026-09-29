package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class ia0 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw g9a.m12430g(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw g9a.m12430g(message.obj);
    }
}
