package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hxb extends Handler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hxd f29779a;

    public hxb(hxd hxdVar) {
        this.f29779a = hxdVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            hxd hxdVar = this.f29779a;
            hxdVar.m10802b(false, hxdVar.f29780a - 1);
        }
    }
}
