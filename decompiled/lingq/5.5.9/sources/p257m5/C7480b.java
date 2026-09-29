package p257m5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p235l5.ExecutorC7270q;

/* JADX INFO: renamed from: m5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7480b implements InterfaceC7479a {

    /* JADX INFO: renamed from: a */
    public final ExecutorC7270q f41352a;

    /* JADX INFO: renamed from: b */
    public final Handler f41353b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public final a f41354c = new a();

    /* JADX INFO: renamed from: m5.b$a */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C7480b.this.f41353b.post(runnable);
        }
    }

    public C7480b(ExecutorService executorService) {
        this.f41352a = new ExecutorC7270q(executorService);
    }
}
