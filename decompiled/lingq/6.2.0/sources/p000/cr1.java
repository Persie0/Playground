package p000;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cr1 implements Executor {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f34397a;

    /* JADX INFO: renamed from: b */
    public final Object f34398b = new Object();

    /* JADX INFO: renamed from: c */
    public Task f34399c = Tasks.m5975c(null);

    public cr1(ExecutorService executorService) {
        this.f34397a = executorService;
    }

    /* JADX INFO: renamed from: a */
    public final Task m9855a(Runnable runnable) {
        Task taskMo5965g;
        synchronized (this.f34398b) {
            taskMo5965g = this.f34399c.mo5965g(this.f34397a, new C3487q7(runnable, 9));
            this.f34399c = taskMo5965g;
        }
        return taskMo5965g;
    }

    /* JADX INFO: renamed from: b */
    public final Task m9856b(Callable callable) {
        Task taskMo5965g;
        synchronized (this.f34398b) {
            taskMo5965g = this.f34399c.mo5965g(this.f34397a, new C3487q7(callable, 8));
            this.f34399c = taskMo5965g;
        }
        return taskMo5965g;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34397a.execute(runnable);
    }
}
