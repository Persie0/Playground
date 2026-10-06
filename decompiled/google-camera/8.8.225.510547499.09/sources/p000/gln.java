package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gln extends kfv implements kba {

    /* JADX INFO: renamed from: a */
    private static final nbh f25511a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/common/ActiveCameraLogger");

    /* JADX INFO: renamed from: b */
    private final fcp f25512b;

    /* JADX INFO: renamed from: c */
    private long f25513c;

    /* JADX INFO: renamed from: d */
    private final Set f25514d = new HashSet();

    /* JADX INFO: renamed from: e */
    private long f25515e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: f */
    private final Executor f25516f;

    public gln(fcp fcpVar, Executor executor) {
        this.f25512b = fcpVar;
        this.f25516f = executor;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final synchronized void mo3408bu(kpp kppVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f25513c < 1000) {
            return;
        }
        this.f25513c = jElapsedRealtime;
        try {
            this.f25516f.execute(new frn(this, new HashSet(this.f25514d), kppVar, jElapsedRealtime, 2));
        } catch (RejectedExecutionException e) {
            ((nbe) ((nbe) ((nbe) f25511a.m17252c()).mo17283h(e)).mo17276G((char) 2960)).mo17290o("Update operation couldn't be completed.");
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f25514d);
            this.f25514d.clear();
        }
        if (hashSet.isEmpty()) {
            return;
        }
        m9431o(((glm) hashSet.toArray()[0]).f25508a, hashSet, SystemClock.elapsedRealtime());
    }

    /* JADX INFO: renamed from: o */
    public final void m9431o(String str, Set set, long j) {
        long j2;
        synchronized (this) {
            j2 = j - this.f25515e;
            this.f25515e = j;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            glm glmVar = (glm) it.next();
            Boolean bool = glmVar.f25510c;
            if (bool == null || bool.booleanValue()) {
                arrayList.add(glmVar.f25509b);
            }
        }
        this.f25512b.mo8182b(str, arrayList, j2);
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m9432p(List list) {
        this.f25514d.clear();
        this.f25514d.addAll(list);
    }
}
