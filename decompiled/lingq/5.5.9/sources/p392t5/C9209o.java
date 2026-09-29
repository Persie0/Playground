package p392t5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: t5.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9209o {

    /* JADX INFO: renamed from: a */
    public boolean f47778a;

    /* JADX INFO: renamed from: b */
    public final Handler f47779b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: t5.o$a */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC9207m) message.obj).mo157b();
            return true;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m17547a(InterfaceC9207m<?> interfaceC9207m, boolean z10) {
        try {
            if (this.f47778a || z10) {
                this.f47779b.obtainMessage(1, interfaceC9207m).sendToTarget();
            } else {
                this.f47778a = true;
                interfaceC9207m.mo157b();
                this.f47778a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
