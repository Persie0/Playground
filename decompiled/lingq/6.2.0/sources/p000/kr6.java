package p000;

import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class kr6 {

    /* JADX INFO: renamed from: b */
    public boolean f48365b;

    /* JADX INFO: renamed from: a */
    public final ArrayList f48364a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f48366c = new CopyOnWriteArrayList();

    public kr6(boolean z) {
        this.f48365b = z;
    }

    /* JADX INFO: renamed from: a */
    public void mo15654a() {
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo15655b();

    /* JADX INFO: renamed from: c */
    public void mo15656c(u60 u60Var) {
    }

    /* JADX INFO: renamed from: d */
    public void mo15657d(u60 u60Var) {
    }

    /* JADX INFO: renamed from: e */
    public final void m15658e() {
        boolean zIsTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f48366c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                if (!(autoCloseable instanceof TypedArray)) {
                    ij6.m13959q();
                    return;
                }
                ((TypedArray) autoCloseable).recycle();
            }
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.f48364a;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((jr6) it2.next()).m3784e();
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m15659f(boolean z) {
        this.f48365b = z;
        for (jr6 jr6Var : this.f48364a) {
            jr6Var.m3785f(jr6Var.f46041e && z);
        }
    }
}
