package p241le;

import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p136gc.AbstractC5751g;

/* JADX INFO: renamed from: le.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7332f {

    /* JADX INFO: renamed from: a */
    public final Executor f41050a;

    /* JADX INFO: renamed from: b */
    public AbstractC5751g<Void> f41051b = Tasks.m8539c(null);

    /* JADX INFO: renamed from: c */
    public final Object f41052c = new Object();

    /* JADX INFO: renamed from: d */
    public final ThreadLocal<Boolean> f41053d = new ThreadLocal<>();

    /* JADX INFO: renamed from: le.f$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7332f.this.f41053d.set(Boolean.TRUE);
        }
    }

    public C7332f(Executor executor) {
        this.f41050a = executor;
        executor.execute(new a());
    }

    /* JADX INFO: renamed from: a */
    public final <T> AbstractC5751g<T> m14749a(Callable<T> callable) {
        AbstractC5751g<T> abstractC5751g;
        synchronized (this.f41052c) {
            abstractC5751g = (AbstractC5751g<T>) this.f41051b.mo12104f(this.f41050a, new C7336h(callable));
            this.f41051b = abstractC5751g.mo12104f(this.f41050a, new C7338i());
        }
        return abstractC5751g;
    }
}
