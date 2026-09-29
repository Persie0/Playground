package p000;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class qg1 {

    /* JADX INFO: renamed from: d */
    public static final HashMap f57741d = new HashMap();

    /* JADX INFO: renamed from: e */
    public static final ExecutorC3014fu f57742e = new ExecutorC3014fu(1);

    /* JADX INFO: renamed from: a */
    public final Executor f57743a;

    /* JADX INFO: renamed from: b */
    public final fh1 f57744b;

    /* JADX INFO: renamed from: c */
    public tld f57745c = null;

    public qg1(Executor executor, fh1 fh1Var) {
        this.f57743a = executor;
        this.f57744b = fh1Var;
    }

    /* JADX INFO: renamed from: a */
    public static Object m19939a(Task task) throws ExecutionException, TimeoutException {
        pg1 pg1Var = new pg1(0);
        Executor executor = f57742e;
        task.mo5963e(executor, pg1Var);
        task.mo5962d(executor, pg1Var);
        task.mo5959a(executor, pg1Var);
        if (!pg1Var.f56084b.await(5L, TimeUnit.SECONDS)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.mo5971m()) {
            return task.mo5967i();
        }
        throw new ExecutionException(task.mo5966h());
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Task m19940b() {
        try {
            tld tldVar = this.f57745c;
            if (tldVar == null || (tldVar.mo5970l() && !this.f57745c.mo5971m())) {
                this.f57745c = Tasks.m5973a(new ng1(this.f57744b, 0), this.f57743a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f57745c;
    }

    /* JADX INFO: renamed from: c */
    public final sg1 m19941c() {
        synchronized (this) {
            try {
                tld tldVar = this.f57745c;
                if (tldVar != null && tldVar.mo5971m()) {
                    return (sg1) this.f57745c.mo5967i();
                }
                try {
                    return (sg1) m19939a(m19940b());
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
