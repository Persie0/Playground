package p043c7;

import android.support.v4.media.C0141b;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.Task;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1736b {

    /* JADX INFO: renamed from: a */
    public final ExecutorServiceC1739e f9581a = new ExecutorServiceC1739e();

    /* JADX INFO: renamed from: b */
    public final ExecutorC1741g f9582b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC1741g f9583c;

    /* JADX INFO: renamed from: d */
    public final CleverTapInstanceConfig f9584d;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, ExecutorServiceC1743i> f9585e;

    public C1736b(CleverTapInstanceConfig cleverTapInstanceConfig) {
        ExecutorC1741g executorC1741g = new ExecutorC1741g();
        this.f9582b = executorC1741g;
        this.f9583c = executorC1741g;
        this.f9585e = new HashMap<>();
        this.f9584d = cleverTapInstanceConfig;
    }

    /* JADX INFO: renamed from: a */
    public final <TResult> Task<TResult> m5473a() {
        return m5476d(this.f9581a, this.f9583c, "ioTask");
    }

    /* JADX INFO: renamed from: b */
    public final <TResult> Task<TResult> m5474b() {
        return m5475c(this.f9584d.f10995a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final <TResult> Task<TResult> m5475c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Tag can't be null");
        }
        HashMap<String, ExecutorServiceC1743i> map = this.f9585e;
        ExecutorServiceC1743i executorServiceC1743i = map.get(str);
        if (executorServiceC1743i == null) {
            executorServiceC1743i = new ExecutorServiceC1743i();
            map.put(str, executorServiceC1743i);
        }
        return m5476d(executorServiceC1743i, this.f9583c, "PostAsyncSafely");
    }

    /* JADX INFO: renamed from: d */
    public final Task m5476d(Executor executor, ExecutorC1741g executorC1741g, String str) {
        if (executor == null || executorC1741g == null) {
            throw new IllegalArgumentException(C0141b.m611g("Can't create task ", str, " with null executors"));
        }
        return new Task(this.f9584d, executor, executorC1741g, str);
    }
}
