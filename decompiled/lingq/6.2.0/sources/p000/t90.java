package p000;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class t90 extends wdb {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", wq1.m24124t(new StringBuilder(String.valueOf(i).length() + 34), "Don't know how to handle message: ", i), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).m5284c(Status.f11660h);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            ho2.m13383c();
            return;
        }
        try {
            throw null;
        } catch (RuntimeException e) {
            C3490qa c3490qa = BasePendingResult.f11667j;
            throw e;
        }
    }
}
