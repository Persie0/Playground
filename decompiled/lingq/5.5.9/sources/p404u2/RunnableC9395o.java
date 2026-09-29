package p404u2;

import android.os.Handler;
import java.util.concurrent.Callable;
import p446w2.InterfaceC9803a;

/* JADX INFO: renamed from: u2.o */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9395o<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Callable<T> f48210a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9803a<T> f48211b;

    /* JADX INFO: renamed from: c */
    public final Handler f48212c;

    /* JADX INFO: renamed from: u2.o$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9803a f48213a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f48214b;

        public a(InterfaceC9803a interfaceC9803a, Object obj) {
            this.f48213a = interfaceC9803a;
            this.f48214b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f48213a.mo3724a(this.f48214b);
        }
    }

    public RunnableC9395o(Handler handler, CallableC9389i callableC9389i, C9390j c9390j) {
        this.f48210a = callableC9389i;
        this.f48211b = c9390j;
        this.f48212c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T tCall;
        try {
            tCall = this.f48210a.call();
        } catch (Exception unused) {
            tCall = null;
        }
        this.f48212c.post(new a(this.f48211b, tCall));
    }
}
