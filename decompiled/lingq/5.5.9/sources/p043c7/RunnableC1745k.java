package p043c7;

import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.Task;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c7.k */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1745k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f9602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Callable f9603b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Task f9604c;

    public RunnableC1745k(Task task, String str, Callable callable) {
        this.f9604c = task;
        this.f9602a = str;
        this.f9603b = callable;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [TResult, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f9602a;
        Task task = this.f9604c;
        try {
            CleverTapInstanceConfig cleverTapInstanceConfig = task.f11354a;
            String str2 = task.f11360g;
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str3 = str2 + " Task: " + str + " starting on..." + Thread.currentThread().getName();
            c2181aM6433b.getClass();
            C2181a.m6458k(str3);
            ?? Call = this.f9603b.call();
            C2181a c2181aM6433b2 = task.f11354a.m6433b();
            String str4 = str2 + " Task: " + str + " executed successfully on..." + Thread.currentThread().getName();
            c2181aM6433b2.getClass();
            C2181a.m6458k(str4);
            Task.STATE state = Task.STATE.FAILED;
            task.f11358e = Call;
            Iterator it = task.f11359f.iterator();
            while (it.hasNext()) {
                ((AbstractC1737c) it.next()).mo5477a(task.f11358e);
            }
        } catch (Exception e10) {
            task.getClass();
            Task.STATE state2 = Task.STATE.FAILED;
            Iterator it2 = task.f11357d.iterator();
            while (it2.hasNext()) {
                ((AbstractC1737c) it2.next()).mo5477a(e10);
            }
            C2181a c2181aM6433b3 = task.f11354a.m6433b();
            String str5 = task.f11360g + " Task: " + str + " failed to execute on..." + Thread.currentThread().getName();
            c2181aM6433b3.getClass();
            C2181a.m6459l(str5, e10);
            e10.printStackTrace();
        }
    }
}
