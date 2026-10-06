package p000;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brw {

    /* JADX INFO: renamed from: a */
    final Map f4240a;

    /* JADX INFO: renamed from: b */
    public final ReferenceQueue f4241b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f4242c;

    /* JADX INFO: renamed from: d */
    public volatile bru f4243d;

    public brw() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new buh(1));
        this.f4240a = new HashMap();
        this.f4241b = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new baa(this, 13));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized bst m2961a(bqn bqnVar) {
        brv brvVar = (brv) this.f4240a.get(bqnVar);
        if (brvVar == null) {
            return null;
        }
        bst bstVar = (bst) brvVar.get();
        if (bstVar == null) {
            m2963c(brvVar);
        }
        return bstVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2962b(bqn bqnVar, bst bstVar) {
        brv brvVar = (brv) this.f4240a.put(bqnVar, new brv(bqnVar, bstVar, this.f4241b));
        if (brvVar != null) {
            brvVar.m2960a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2963c(brv brvVar) {
        synchronized (this) {
            this.f4240a.remove(brvVar.f4237a);
            if (brvVar.f4238b) {
                bsz bszVar = brvVar.f4239c;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    final synchronized void m2964d(bqn bqnVar) {
        brv brvVar = (brv) this.f4240a.remove(bqnVar);
        if (brvVar != null) {
            brvVar.m2960a();
        }
    }
}
