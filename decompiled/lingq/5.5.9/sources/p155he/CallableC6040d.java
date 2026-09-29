package p155he;

import com.google.firebase.crashlytics.internal.settings.C3215a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p136gc.C5752h;
import p213k4.RunnableC6589i;
import p241le.C7337h0;
import p241le.C7352w;
import p241le.CallableC7350u;

/* JADX INFO: renamed from: he.d */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC6040d implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f35685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7352w f35686b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3215a f35687c;

    public CallableC6040d(boolean z10, C7352w c7352w, C3215a c3215a) {
        this.f35685a = z10;
        this.f35686b = c7352w;
        this.f35687c = c3215a;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        if (!this.f35685a) {
            return null;
        }
        C7352w c7352w = this.f35686b;
        c7352w.getClass();
        CallableC7350u callableC7350u = new CallableC7350u(c7352w, this.f35687c);
        ExecutorService executorService = C7337h0.f41062a;
        C5752h c5752h = new C5752h();
        ExecutorService executorService2 = c7352w.f41105l;
        executorService2.execute(new RunnableC6589i(6, callableC7350u, executorService2, c5752h));
        return null;
    }
}
