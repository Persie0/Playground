package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aoa extends Handler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ aof f1874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoa(aof aofVar, Looper looper) {
        super(looper);
        this.f1874a = aofVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f1874a.m1757d();
                break;
        }
    }
}
