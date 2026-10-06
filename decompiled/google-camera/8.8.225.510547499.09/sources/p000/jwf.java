package p000;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jwf implements jww, cws {

    /* JADX INFO: renamed from: a */
    private volatile boolean f34939a;

    /* JADX INFO: renamed from: b */
    public final Set f34940b;

    /* JADX INFO: renamed from: c */
    public final Executor f34941c;

    /* JADX INFO: renamed from: d */
    public volatile Object f34942d;

    public jwf(Object obj) {
        this(obj, new jwx());
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        juu juuVar = new juu(kbgVar, executor);
        this.f34940b.add(juuVar);
        this.f34941c.execute(new jpm(this, juuVar, 9));
        return new igy(this, juuVar, 3);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return this.f34942d;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public void mo3415bf(Object obj) {
        this.f34941c.execute(new jpm(this, obj, 8));
    }

    /* JADX INFO: renamed from: c */
    public void mo13622c(Object obj) {
        try {
            lku.m15614I(!this.f34939a, "Re-entrance isn't supported.");
            this.f34939a = true;
            this.f34942d = obj;
            Iterator it = this.f34940b.iterator();
            while (it.hasNext()) {
                try {
                    ((kbg) it.next()).mo3415bf(obj);
                } catch (RejectedExecutionException e) {
                }
            }
            this.f34939a = false;
        } catch (Throwable th) {
            this.f34939a = false;
            throw th;
        }
    }

    public final String toString() {
        return mpw.m16766e("ConcurrentObs").toString();
    }

    public jwf(Object obj, jwx jwxVar) {
        this.f34940b = new CopyOnWriteArraySet();
        this.f34942d = obj;
        this.f34941c = jwxVar;
    }
}
