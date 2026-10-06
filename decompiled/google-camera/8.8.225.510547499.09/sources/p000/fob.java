package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fob extends Handler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ foc f22819a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fob(foc focVar, Looper looper) {
        super(looper);
        this.f22819a = focVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                exp expVar = this.f22819a.f22886q;
                if (expVar != null) {
                    expVar.onSurfaceCreated(null, null);
                }
                break;
            case 2:
                int i = message.arg1;
                int i2 = message.arg2;
                foc focVar = this.f22819a;
                exp expVar2 = focVar.f22886q;
                if (expVar2 != null && focVar.f22887r != null) {
                    expVar2.onSurfaceChanged(null, message.arg1, message.arg2);
                    this.f22819a.f22886q.m8018b();
                    this.f22819a.f22887r.m8007e();
                    break;
                }
                break;
            case 3:
                exp expVar3 = this.f22819a.f22886q;
                if (expVar3 != null) {
                    expVar3.m8018b();
                }
                break;
        }
    }
}
