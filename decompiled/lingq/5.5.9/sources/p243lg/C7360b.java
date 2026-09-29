package p243lg;

import android.os.Handler;
import com.kochava.core.task.internal.TaskQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kg.C6670c;
import kg.InterfaceC6671d;
import kg.InterfaceC6673f;
import p201jg.C6476a;
import p349qo.C8656b;

/* JADX INFO: renamed from: lg.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7360b implements InterfaceC7361c, InterfaceC6673f {

    /* JADX INFO: renamed from: a */
    public final Object f41120a;

    /* JADX INFO: renamed from: b */
    public final C7363e f41121b;

    /* JADX INFO: renamed from: c */
    public final HashMap f41122c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC7362d> f41123d;

    public C7360b() {
        Object obj = new Object();
        this.f41120a = obj;
        this.f41122c = new HashMap();
        this.f41123d = Collections.synchronizedList(new ArrayList());
        this.f41121b = new C7363e();
        synchronized (obj) {
            for (TaskQueue taskQueue : TaskQueue.values()) {
                this.f41122c.put(taskQueue, new ArrayList());
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m14764a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f41120a) {
            try {
                for (Map.Entry entry : this.f41122c.entrySet()) {
                    TaskQueue taskQueue = (TaskQueue) entry.getKey();
                    for (InterfaceC6671d interfaceC6671d : (List) entry.getValue()) {
                        if (interfaceC6671d.mo13290b()) {
                            arrayList.add(interfaceC6671d);
                        }
                        if (taskQueue.ordered) {
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC6671d) it.next()).mo13289a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final C6670c m14765b(TaskQueue taskQueue, C6476a c6476a) {
        C7363e c7363e = this.f41121b;
        Handler handler = c7363e.f41128b;
        Handler handler2 = c7363e.f41127a;
        ExecutorService executorService = C7363e.f41126e;
        if (executorService != null) {
            return new C6670c(handler, handler2, executorService, taskQueue, this, c6476a, null);
        }
        throw new RuntimeException("Failed to start threadpool");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m14766c(C6670c c6670c) {
        synchronized (this.f41120a) {
            List list = (List) this.f41122c.get(c6670c.f37747f);
            if (list != null) {
                list.remove(c6670c);
            }
        }
        m14764a();
    }

    /* JADX INFO: renamed from: d */
    public final void m14767d(C6670c c6670c) {
        synchronized (this.f41120a) {
            try {
                List list = (List) this.f41122c.get(c6670c.f37747f);
                if (list != null) {
                    list.add(c6670c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m14764a();
    }

    /* JADX INFO: renamed from: e */
    public final void m14768e(Thread thread, Throwable th2) {
        ArrayList arrayListM16896W = C8656b.m16896W(this.f41123d);
        if (arrayListM16896W.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayListM16896W.iterator();
            while (it.hasNext()) {
                ((InterfaceC7362d) it.next()).mo14770b(thread, th2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14769f(Runnable runnable) {
        this.f41121b.f41128b.post(new RunnableC7359a(this, runnable));
    }
}
