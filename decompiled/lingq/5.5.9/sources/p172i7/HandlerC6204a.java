package p172i7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.downloader.Progress;
import p111f7.InterfaceC5475c;

/* JADX INFO: renamed from: i7.a */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC6204a extends Handler {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5475c f36095a;

    public HandlerC6204a(InterfaceC5475c interfaceC5475c) {
        super(Looper.getMainLooper());
        this.f36095a = interfaceC5475c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        InterfaceC5475c interfaceC5475c = this.f36095a;
        if (interfaceC5475c != null) {
            interfaceC5475c.mo9442a((Progress) message.obj);
        }
    }
}
