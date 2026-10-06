package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mlm implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                throw null;
            case 1:
                int i = message.arg1;
                throw null;
            default:
                return false;
        }
    }
}
